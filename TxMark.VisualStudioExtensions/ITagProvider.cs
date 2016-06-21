using Microsoft.VisualStudio.Text.Tagging;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TxMark.VisualStudioExtensions
{
    public interface ITagProvider
    {
        ITag MakeTag(string name);
    }
}
