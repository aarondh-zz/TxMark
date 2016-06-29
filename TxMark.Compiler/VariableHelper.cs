#define USE_DYNAMIC
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
#if USE_DYNAMIC
            return SF.MemberAccessExpression(
                    SyntaxKind.SimpleMemberAccessExpression,
                    SF.IdentifierName("_this"),
                    SF.IdentifierName(variableName)
                );

#else
            return SF.ElementAccessExpression(
                SF.IdentifierName("_this"), 
                SF.BracketedArgumentList(
                    SF.SingletonSeparatedList<ArgumentSyntax>(
                        SF.Argument(
                            SF.LiteralExpression(
                                SyntaxKind.StringLiteralExpression, 
                                SF.Literal(variableName)
                            )
                        )
                    )
                )
            );
#endif
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
