using System.Collections.Generic;
using System.IO;

namespace TxMark.Template.Formatters
{
    public class HtmlFormatter : TextFormatter
    {
        public override void WriteCloseTag(TextWriter writer, string tagName)
        {
            base.Write(writer, "</" + tagName + ">");
        }
        public override void Write(TextWriter writer, char value)
        {
            base.Write(writer,System.Net.WebUtility.HtmlEncode(value.ToString()));
        }

        public override void Write(TextWriter writer, object value)
        {
            if (value == null)
            {
                return;
            }
            else if (value is IRawValue)
            {
                base.Write(writer, value);
            }
            else
            {
                base.Write(writer, System.Net.WebUtility.HtmlEncode(value.ToString()));
            }
        }
        public override bool WriteOpenTag(TextWriter writer, string tagName, bool isClosing, IDictionary<string, string> attributes)
        {
            base.Write(writer, "<" + tagName);
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
                        base.Write(writer,$" {attribute.Key}=\"{value}\"");
                    }
                }
            }
            if ( isClosing )
            {
                base.Write(writer, "/>");
            }
            else
            {
                base.Write(writer, ">");
            }
            return true;
        }
    }
}
