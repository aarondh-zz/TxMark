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
        public override void Write(TextWriter writer, char value)
        {
            writer.Write(System.Net.WebUtility.HtmlEncode(value.ToString()));
        }

        public override void Write(TextWriter writer, string value)
        {
            if ( value != null)
            {
                writer.Write(System.Net.WebUtility.HtmlEncode(value.ToString()));
            }
        }

        public override void Write(TextWriter writer, object value)
        {
            if (value == null)
            {
                return;
            }
            else if (value is IRawHtmlValue)
            {
                writer.Write(value.ToString());
            }
            else
            {
                writer.Write(System.Net.WebUtility.HtmlEncode(value.ToString()));
            }
        }

        public override void Write(TextWriter writer, IValue value)
        {
            if (value == null)
            {
                return;
            }
            else if (value is IRawHtmlValue)
            {
                writer.Write(value.ToString());
            }
            else
            {
                writer.Write(System.Net.WebUtility.HtmlEncode(value.ToString()));
            }
        }

        public override bool WriteOpenTag(TextWriter writer, string tagName, bool isClosing, IDictionary<string, string> attributes)
        {
            writer.Write("<" + tagName);
            if ( attributes != null )
            {
                foreach( var attribute in attributes)
                {
                    var value = attribute.Value?.ToString();
                    if ( value != null)
                    {
                        if (value == string.Empty)
                        {
                            value = attribute.Key;
                        }
                        value = System.Net.WebUtility.HtmlEncode(value);
                        writer.Write($" {attribute.Key}=\"{value}\"");
                    }
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
