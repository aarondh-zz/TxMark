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
    public class VariableHelper
    {
        public static ExpressionSyntax MakeStateVariableExpression(string variableName)
        {
            return SF.MemberAccessExpression(
                    SyntaxKind.SimpleMemberAccessExpression,
                    SF.IdentifierName("_this"),
                    SF.IdentifierName(variableName)
                );
        }

        public static ExpressionSyntax MakeModelVariableExpression(string variableName)
        {
            return SF.MemberAccessExpression(
                SyntaxKind.SimpleMemberAccessExpression,
                SF.MemberAccessExpression(
                    SyntaxKind.SimpleMemberAccessExpression,
                    SF.IdentifierName("_this"),
                    SF.IdentifierName("Model")
                ),
                SF.IdentifierName(variableName)
            );
    }
}
}
