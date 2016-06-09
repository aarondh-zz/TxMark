using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TxMark.Compiler
{
    public interface IHtmlTagContext
    {
        HtmlTagTypes TagType { get; }
        string TagName { get; }
    }
}
