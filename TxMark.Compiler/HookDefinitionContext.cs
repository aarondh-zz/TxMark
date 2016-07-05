using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Microsoft.CodeAnalysis.CSharp.Syntax;

namespace TxMark.Compiler
{
    public class HookDefinitionContext : SetContext
    {
        public HookDefinitionContext(string hookName, ContentContextExitHandler<StatementSyntax> exitHandler) : base(hookName, exitHandler)
        {
        }

        public override void Exit()
        {
            if ( HasVariableName )
            {
                base.Exit();
            }
        }

        public override void NameTag(string nameTag)
        {
        }
    }
}
