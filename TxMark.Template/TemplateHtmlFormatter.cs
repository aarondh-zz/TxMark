using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TxMark.Template
{
    public class TemplateHtmlFormatter : TemplateFormatterBase
    {
        public override void WriteCloseTag(TextWriter writer, string tagName)
        {
        }

        public override bool WriteOpenTag(TextWriter writer, string tagName, IDictionary<string, object> attributes)
        {
            return true;
        }
    }
}
