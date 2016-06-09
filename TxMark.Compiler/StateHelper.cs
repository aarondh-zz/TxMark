﻿using Microsoft.CodeAnalysis.CSharp;
using Microsoft.CodeAnalysis.CSharp.Syntax;
using SF = Microsoft.CodeAnalysis.CSharp.SyntaxFactory;

namespace TxMark.Compiler
{
    public static class StateHelper
    {
        public static StatementSyntax MakeStatePushStatement()
        {
           return SF.ExpressionStatement(
                SF.InvocationExpression(
                    SF.MemberAccessExpression(
                        SyntaxKind.SimpleMemberAccessExpression,
                        SF.IdentifierName("_this"),
                        SF.IdentifierName("Push")),
                    SF.ArgumentList(SF.SeparatedList<ArgumentSyntax>())
                    )
                );
        }
        public static ExpressionSyntax MakeStatePopExpression()
        {
            return SF.InvocationExpression(
                                SF.MemberAccessExpression(
                                    SyntaxKind.SimpleMemberAccessExpression,
                                    SF.IdentifierName("_this"),
                                    SF.IdentifierName("Pop")),
                                SF.ArgumentList(SF.SeparatedList<ArgumentSyntax>())
                                );
        }
        public static StatementSyntax MakeStatePopWriteStatement()
        {
            return SF.ExpressionStatement(SF.InvocationExpression(
                    SF.MemberAccessExpression(
                        SyntaxKind.SimpleMemberAccessExpression,
                        SF.IdentifierName("_this"),
                        SF.IdentifierName("Write")),
                    SF.ArgumentList(SF.SingletonSeparatedList<ArgumentSyntax>(SF.Argument(MakeStatePopExpression()))
                    )
                ));
        }

        public static StatementSyntax MakeStatePopReturnStatement()
        {
            return SF.ReturnStatement(
                StateHelper.MakeStatePopExpression()
                );
        }
    }
}
