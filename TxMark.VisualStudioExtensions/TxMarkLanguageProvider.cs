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
using Microsoft.VisualStudio.Text;
using Microsoft.VisualStudio.Text.Classification;
using Microsoft.VisualStudio.Text.Tagging;
using Microsoft.VisualStudio.Utilities;
using System;
using System.Collections.Generic;
using System.ComponentModel.Composition;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TxMark.VisualStudioExtensions
{
    [Export(typeof(IClassifierProvider))]
    [Export(typeof(ITaggerProvider))]
    [TagType(typeof(ClassificationTag))]
    [TagType(typeof(ErrorTag))]
    [ContentType("TxMark")]
    internal class TxMarkLanguageProvider : IClassifierProvider, ITaggerProvider
    {
        [Export]
        [Name("TxMark")] // Must match the [ContentType] attributes
        [BaseDefinition("code")]
        internal static ContentTypeDefinition _ = null;
        [Export]
        [FileExtension(".txm")]
        [ContentType("TxMark")]
        internal static FileExtensionToContentTypeDefinition _1 = null;
        [Import]
        IClassificationTypeRegistryService _registry = null; // Set via MEF

        public static TxMarkLanguage Get(IClassificationTypeRegistryService registry, ITextBuffer buffer)
        {
            return buffer.Properties.GetOrCreateSingletonProperty<TxMarkLanguage>(
                delegate { return new TxMarkLanguage(registry, buffer); });
        }
        public IClassifier GetClassifier(ITextBuffer buffer)
        {
            return Get(_registry, buffer);
        }
        public ITagger<T> CreateTagger<T>(ITextBuffer buffer) where T : ITag
        {
            return Get(_registry, buffer) as ITagger<T>;
        }
    }
}
