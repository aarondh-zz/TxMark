using System.Collections.Generic;
using System.IO;

namespace TxMark.Template
{
    public class TextTemplateFormatter : TemplateFormatterBase
    {
        public override void WriteCloseTag(TextWriter writer, string tagName)
        {
        }

        public override bool WriteOpenTag(TextWriter writer, string tagName, bool isClosing, IDictionary<string, string> attributes)
        {
            return true;
        }
    }
}
