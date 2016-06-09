using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TxMark.Compiler
{
    public interface ICodeContext : IContent
    {
        string Label { get; }
        void Enter(ICompileContext context, ICodeContext parent);
        void Exit();
        ICodeContext CreateContext(CodeContextTypes contextType, string name = null, Bag<string> attributes = null);
    }
}
