using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TxMark.Compiler
{
    public delegate void LogHandler(LogLevel level, string message, int line, int column);
}
