using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TxMark.Compiler
{
    public interface ILocation
    {
        string File { get; }
        int Line { get; }
        int Column { get; }
    }
}
