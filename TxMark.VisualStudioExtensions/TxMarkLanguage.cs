/*
 *  TxMark 1.0.0.alpha-0-g0639c8a
 *
 *  Copyright (c) 2016 Aaron G. Daisley-Harrison
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using Microsoft.VisualStudio.Language.StandardClassification;
using Microsoft.VisualStudio.Text;
using Microsoft.VisualStudio.Text.Classification;
using Microsoft.VisualStudio.Text.Tagging;
using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using TxMark.Compiler;

namespace TxMark.VisualStudioExtensions
{
    internal class TxMarkLanguage : IClassifier,
            ITagger<ClassificationTag>,
            ITagger<ErrorTag>,
            ITagProvider,
            IBackgroundWork<object, IEnumerable<ITagSpan<ITag>>>
    {
        protected IClassificationTypeRegistryService _registry;
        protected ITextBuffer _buffer;
        protected IEnumerable<ITagSpan<ITag>> _resultTags;
        protected BackgroundWorker<object, IEnumerable<ITagSpan<ITag>>> _parseWorker;

        public TxMarkLanguage(IClassificationTypeRegistryService registry, ITextBuffer buffer)
        {
            _registry = registry;
            _buffer = buffer;
            _parseWorker = new BackgroundWorker<object, IEnumerable<ITagSpan<ITag>>>(buffer, this, true);
        }
        ITag ITagProvider.MakeTag(string name)
        {
            var classificationType = _registry.GetClassificationType(name);
            if ( classificationType == null)
            {
                Trace.WriteLine($"The classification type name \"{name}\" was not registered");
                classificationType = _registry.GetClassificationType(PredefinedClassificationTypeNames.Other);
            }
            return new ClassificationTag(classificationType);
        }

        #region Classifier (lexical analysis)

        public event EventHandler<ClassificationChangedEventArgs> ClassificationChanged;

        public IList<ClassificationSpan> GetClassificationSpans(SnapshotSpan span)
        {
            List<ClassificationSpan> spans = new List<ClassificationSpan>();
            return spans;
        }
        #endregion

        #region Background analysis (the two taggers)

        public object GetInputSnapshot()
        {
            return null; // this example has no state to pass to the analysis thread.
        }
        public IEnumerable<ITagSpan<ITag>> DoWork(ITextSnapshot snapshot, object input, System.Threading.CancellationToken cancelToken)
        {
            List<ITagSpan<ITag>> results = new List<ITagSpan<ITag>>();

            var source = snapshot.GetText();

            var inputStream = new AntlrInputStream(new StringReader(source));

            var txMarkLexer = new TxMarkLexer(inputStream);

            var tokens = new CommonTokenStream(txMarkLexer);

            var txMarkParser = new TxMarkParser(tokens);

            txMarkParser.BuildParseTree = true;

            var parseTree = txMarkParser.document();

            var txMarkSyntaxHighlighterParseTreeWalker = new TxMarkSyntaxHighlighterParseTreeWalker(this, snapshot);
            ParseTreeWalker.Default.Walk(txMarkSyntaxHighlighterParseTreeWalker, parseTree);

            return txMarkSyntaxHighlighterParseTreeWalker.Tags;
        }
        public void OnWorkDone(IEnumerable<ITagSpan<ITag>> results)
        {
            _resultTags = results;
            // We don't know which tags changed unless we do some fancy diff, so
            // act as if everything changed.
            if (TagsChanged != null) // should always be true
                TagsChanged(this, new SnapshotSpanEventArgs(new SnapshotSpan(_buffer.CurrentSnapshot, new Span(0, _buffer.CurrentSnapshot.Length))));
            if (ClassificationChanged != null) // should always be true
                ClassificationChanged(this , new ClassificationChangedEventArgs(new SnapshotSpan(_buffer.CurrentSnapshot, new Span(0, _buffer.CurrentSnapshot.Length))));
        }

        #endregion

        #region ITagger<ClassificationTag> and ITagger<ErrorTag> Members

        IEnumerable<ITagSpan<ErrorTag>> ITagger<ErrorTag>.GetTags(NormalizedSnapshotSpanCollection spans)
        {
            return GetTags<ErrorTag>(spans);
        }
        IEnumerable<ITagSpan<ClassificationTag>> ITagger<ClassificationTag>.GetTags(NormalizedSnapshotSpanCollection spans)
        {
            return GetTags<ClassificationTag>(spans);
        }
        public IEnumerable<ITagSpan<TTag>> GetTags<TTag>(NormalizedSnapshotSpanCollection spans) where TTag : ITag
        {
            if (_resultTags == null)
                return null;

            // TODO: make more efficient for large files with e.g. binary search
            int start = spans[0].Start.Position, end = spans[spans.Count - 1].End.Position;
            return _resultTags.Where(ts => ts.Span.End >= start && ts.Span.Start <= end && typeof(TTag).IsInstanceOfType(ts.Tag)).Select(ts=> new TagSpan<TTag>(ts.Span,(TTag)ts.Tag));
        }

        public event EventHandler<SnapshotSpanEventArgs> TagsChanged;

        #endregion
    }
}
