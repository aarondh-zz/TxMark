using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TxMark.Template
{
    public class ViewOptions : IViewOptions
    {
        public static readonly IViewOptions Default = new ViewOptions()
        {
            Formatter = new TemplateHtmlFormatter()
        };
        public ViewOptions()
        {

        }
        public ITemplateFormatter Formatter { get; set; }
    }
}
