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
using System.Collections.Generic;
using System.IO;

namespace TxMark.Template.Formatters
{
    public class HtmlFormatter : TextFormatter
    {
        public HtmlFormatter()
        {
        }
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
