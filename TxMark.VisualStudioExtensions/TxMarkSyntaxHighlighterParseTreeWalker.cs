/*
 *  TxMark 1.0.0.alpha-5-g61bda79
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
using Microsoft.VisualStudio.Text.Tagging;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using TxMark.Compiler;
using Antlr4.Runtime.Misc;
using System.Windows.Media;
using Antlr4.Runtime;
using Microsoft.VisualStudio.Text;
using TxMark.VisualStudioExtensions.TextMarkerTags;
using Microsoft.VisualStudio.Language.StandardClassification;

namespace TxMark.VisualStudioExtensions
{
    public class TxMarkSyntaxHighlighterParseTreeWalker : TxMarkParserBaseListener
    {
        private ITagProvider _classificationTagProvider;
        private ITextSnapshot _textSnapshot;
        private List<ITagSpan<ITag>> _tags;
        public IEnumerable<ITagSpan<ITag>> Tags
        {
            get
            {
                return _tags;
            } 
        }
        public TxMarkSyntaxHighlighterParseTreeWalker(ITagProvider classificationTagProvider, ITextSnapshot textSnapshot )
        {
            _classificationTagProvider = classificationTagProvider;
            _textSnapshot = textSnapshot;
            _tags = new List<ITagSpan<ITag>>();
        }
        private void AddTag(IToken token, ITag tag)
        {
            AddTag(token.StartIndex, token.StopIndex, tag);
        }
        private void AddTag(int startIndex, int stopIndex, ITag tag)
        {
            _tags.Add(new TagSpan<ITag>(new SnapshotSpan(_textSnapshot, new Span(startIndex, stopIndex - startIndex + 1)), tag));
        }
        private ITag Classify(string name)
        {
            return _classificationTagProvider.MakeTag(name) as ClassificationTag;
        }
        public override void EnterMacro([NotNull] TxMarkParser.MacroContext context)
        {
            AddTag(context.MACRO_OPEN().Symbol, Classify("HTML Tag Delimiter"));
            AddTag(context.macroName().MWORD().Symbol, Classify(PredefinedClassificationTypeNames.Identifier));
            AddTag(context.MCOLON().Symbol, Classify("HTML Operator"));
            AddTag(context.CLOSE_PARENTHESIS().Symbol, Classify("HTML Tag Delimiter"));
        }

        public override void EnterHook([NotNull] TxMarkParser.HookContext context)
        {
            AddTag(context.OPEN_HOOK().Symbol, Classify("HTML Tag Delimiter"));
            AddTag(context.CLOSE_HOOK().Symbol, Classify("HTML Tag Delimiter"));
        }

        public override void EnterNumber([NotNull] TxMarkParser.NumberContext context)
        {
            base.EnterNumber(context);
            if ( context.MNUMBER() == null)
            {
                AddTag(context.NUMBER().Symbol, Classify(PredefinedClassificationTypeNames.Number));
            }
            else
            {
                AddTag(context.MNUMBER().Symbol, Classify(PredefinedClassificationTypeNames.Number));
            }
        }

        public override void EnterQuote([NotNull] TxMarkParser.QuoteContext context)
        {
            AddTag(context.DOUBLE_QUOTE_STRING().Symbol, Classify(PredefinedClassificationTypeNames.String));
        }

        public override void EnterConstantNull([NotNull] TxMarkParser.ConstantNullContext context)
        {
            AddTag(context.CONSTANT_NULL().Symbol, Classify(PredefinedClassificationTypeNames.Keyword));
        }

        public override void EnterConstantTrue([NotNull] TxMarkParser.ConstantTrueContext context)
        {
            AddTag(context.CONSTANT_TRUE().Symbol, Classify(PredefinedClassificationTypeNames.Keyword));
        }

        public override void EnterConstantFalse([NotNull] TxMarkParser.ConstantFalseContext context)
        {
            AddTag(context.CONSTANT_FALSE().Symbol, Classify(PredefinedClassificationTypeNames.Keyword));
        }

        public override void EnterVariable([NotNull] TxMarkParser.VariableContext context)
        {
            var dollarSign = context.DOLLAR_SIGN() ?? context.MDOLLAR_SIGN();
            var word = context.word().WORD() ?? context.word().MWORD();
            AddTag(dollarSign.Symbol, Classify(PredefinedClassificationTypeNames.SymbolDefinition));
            AddTag(word.Symbol, Classify(PredefinedClassificationTypeNames.SymbolReference));
        }

        public override void EnterIf_clause([NotNull] TxMarkParser.If_clauseContext context)
        {
            AddTag(context.MACRO_OPEN().Symbol, Classify("HTML Tag Delimiter"));
            AddTag(context.KEYWORD_IF().Symbol, Classify(PredefinedClassificationTypeNames.Keyword));
            AddTag(context.MCOLON().Symbol, Classify("HTML Operator"));
            AddTag(context.CLOSE_PARENTHESIS().Symbol, Classify("HTML Tag Delimiter"));
        }

        public override void EnterElseIf_clause([NotNull] TxMarkParser.ElseIf_clauseContext context)
        {
            AddTag(context.MACRO_OPEN().Symbol, Classify("HTML Tag Delimiter"));
            AddTag(context.KEYWORD_ELSEIF().Symbol, Classify(PredefinedClassificationTypeNames.Keyword));
            AddTag(context.MCOLON().Symbol, Classify("HTML Operator"));
            AddTag(context.CLOSE_PARENTHESIS().Symbol, Classify("HTML Tag Delimiter"));
        }

        public override void EnterElse_clause([NotNull] TxMarkParser.Else_clauseContext context)
        {
            AddTag(context.MACRO_OPEN().Symbol, Classify("HTML Tag Delimiter"));
            AddTag(context.KEYWORD_ELSE().Symbol, Classify(PredefinedClassificationTypeNames.Keyword));
            AddTag(context.MCOLON().Symbol, Classify("HTML Operator"));
            AddTag(context.CLOSE_PARENTHESIS().Symbol, Classify("HTML Tag Delimiter"));
        }

        public override void EnterSet_clause([NotNull] TxMarkParser.Set_clauseContext context)
        {
            AddTag(context.MACRO_OPEN().Symbol, Classify("HTML Tag Delimiter"));
            AddTag(context.KEYWORD_SET().Symbol, Classify(PredefinedClassificationTypeNames.Keyword));
            AddTag(context.MCOLON().Symbol, Classify("HTML Operator"));
            AddTag(context.CLOSE_PARENTHESIS().Symbol, Classify("HTML Tag Delimiter"));
        }

        public override void EnterHtmlOpenTag([NotNull] TxMarkParser.HtmlOpenTagContext context)
        {
            AddTag(context.LESS_THAN().Symbol, Classify("HTML Tag Delimiter"));
            if (context.SLASH() != null)
            {
                AddTag(context.SLASH().Symbol, Classify("HTML Tag Delimiter"));
            }
            AddTag(context.word().WORD().Symbol, Classify("HTML Element Name"));
            AddTag(context.GREATER_THAN().Symbol, Classify("HTML Tag Delimiter"));
        }

        public override void EnterHtmlCloseTag([NotNull] TxMarkParser.HtmlCloseTagContext context)
        {
            AddTag(context.LESS_THAN().Symbol, Classify("HTML Tag Delimiter"));
            AddTag(context.SLASH().Symbol, Classify("HTML Tag Delimiter"));
            AddTag(context.word().WORD().Symbol, Classify("HTML Element Name"));
            AddTag(context.GREATER_THAN().Symbol, Classify("HTML Tag Delimiter"));
        }

        public override void EnterHtmlAttribute([NotNull] TxMarkParser.HtmlAttributeContext context)
        {
            AddTag(context.EQUALS().Symbol, Classify("HTML Operator"));
        }

        public override void EnterHtmlAttributeName([NotNull] TxMarkParser.HtmlAttributeNameContext context)
        {
            AddTag(context.word().WORD().Symbol, Classify("HTML Attribute Name"));
        }
        public override void EnterHtmlAttributeValue([NotNull] TxMarkParser.HtmlAttributeValueContext context)
        {
            AddTag(context.Start.StartIndex, context.Stop.StopIndex, Classify("HTML Attribute Value"));
        }
    }
}
