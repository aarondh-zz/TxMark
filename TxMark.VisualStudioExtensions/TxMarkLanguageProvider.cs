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
