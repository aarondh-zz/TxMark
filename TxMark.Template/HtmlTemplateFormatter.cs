using System.Collections.Generic;
using System.IO;

namespace TxMark.Template
{
    public class HtmlTemplateFormatter : TemplateFormatterBase
    {
        public override void WriteCloseTag(TextWriter writer, string tagName)
        {
            writer.Write("</" + tagName + ">");
        }

        public override bool WriteOpenTag(TextWriter writer, string tagName, bool isClosing, IDictionary<string, string> attributes)
        {
            writer.Write("<" + tagName);
            if ( attributes != null )
            {
                foreach( var attribute in attributes)
                {
                    writer.Write($" {attribute.Key}=\"{attribute.Value.ToString()}\"");
                }
            }
            if ( isClosing )
            {
                writer.Write("/>");
            }
            else
            {
                writer.Write(">");
            }
            return true;
        }
    }
}
