using System.Collections.Generic;
using System.IO;

namespace TxMark.Template.Formatters
{
    public class TextFormatter : FormatterBase
    {
        char lastChar;
        public override void WriteCloseTag(TextWriter writer, string tagName)
        {
        }

        public override bool WriteOpenTag(TextWriter writer, string tagName, bool isClosing, IDictionary<string, string> attributes)
        {
            return true;
        }

        public override void Write(TextWriter writer, string value)
        {
            if (!string.IsNullOrEmpty(value) )
            {
                char nextChar = value[0];
                if (char.IsLetterOrDigit(lastChar) && char.IsLetterOrDigit(nextChar))
                {
                    writer.Write(' ');
                }
                writer.Write(value);
                lastChar = value[value.Length - 1];
            }
        }
    }
}
