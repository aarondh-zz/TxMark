using Microsoft.CodeAnalysis.CSharp;
using Microsoft.CodeAnalysis.CSharp.Syntax;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using SF = Microsoft.CodeAnalysis.CSharp.SyntaxFactory;

namespace TxMark.Compiler
{
    public class ArgumentContext : ExpressionContext
    {
        public ArgumentContext(ContentContextExitHandler<ExpressionSyntax> exitHandler)
            :base( exitHandler )
        {
        }

        public override void Word(string word)
        {
            WriteTextIfRequired();
            Add(SF.LiteralExpression(SyntaxKind.StringLiteralExpression, SF.Literal(word)));
        }

        public override void Quote(string quote)
        {
            WriteTextIfRequired();
            Add(SF.LiteralExpression(SyntaxKind.StringLiteralExpression, SF.Literal(quote)));
        }
    }
}
