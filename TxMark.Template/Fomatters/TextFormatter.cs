/*
 *  TxMark 1.0.0.alpha-0-g0639c8a
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
    public class TextFormatter : FormatterBase
    {
        private char lastChar;
        public TextFormatter()
        {
            this.NormalizeWhitespace = true;
        }
        public bool NormalizeWhitespace { get; set; }
        public bool RemoveCarriageReturns { get; set; }
        public override void WriteCloseTag(TextWriter writer, string tagName)
        {
        }

        public override bool WriteOpenTag(TextWriter writer, string tagName, bool isClosing, IDictionary<string, string> attributes)
        {
            return true;
        }

        public override void Write(TextWriter writer, object value)
        {
            if (value == null)
            {
                return;
            }
            else
            {
                var text = value.ToString();
                if (RemoveCarriageReturns)
                {
                    if (text.IndexOf('\n') > 0)
                    {
                        text = text.Replace('\n', ' ').Replace("\r", "");
                    }
                }
                if (NormalizeWhitespace)
                {
                    if (!string.IsNullOrEmpty(text))
                    {
                        char nextChar = text[0];
                        if (char.IsLetterOrDigit(lastChar) && char.IsLetterOrDigit(nextChar))
                        {
                            writer.Write(' ');
                        }
                        else if (char.IsWhiteSpace(lastChar) && char.IsWhiteSpace(nextChar))
                        {
                            text = text.TrimStart();
                            if (text.Length == 0)
                            {
                                return;
                            }
                        }
                        writer.Write(text);
                        lastChar = text[text.Length - 1];
                    }
                }
                else
                {
                    writer.Write(text);
                }
            }
        }
    }
}
