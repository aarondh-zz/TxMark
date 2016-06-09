using Microsoft.CodeAnalysis.CSharp.Syntax;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TxMark.Compiler
{
    public class AttributeContext : ExpressionContext
    {
        string _attributeName;
        public AttributeContext(string attributeName, ContentContextExitHandler<ExpressionSyntax> exitHandler)
            :base(exitHandler)
        {
            _attributeName = attributeName;
        }

        public override void Number(string numberText)
        {
            base.Text(numberText); //numbers are just text here
        }
    }
}
