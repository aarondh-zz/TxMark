using System.ComponentModel.Composition;
using Microsoft.VisualStudio.Text.Classification;
using Microsoft.VisualStudio.Utilities;

namespace TxMark.EditorClassifier
{
    internal static class FileAndContentTypeDefinitions
    {
        [Export]
        [Name("TxMark")]
        [BaseDefinition("text")]
        internal static ContentTypeDefinition hidingContentTypeDefinition;
        [Export]
        [FileExtension(".txm")]
        [ContentType("TxMark")]
        internal static FileExtensionToContentTypeDefinition hiddenFileExtensionDefinition;
    }

}
