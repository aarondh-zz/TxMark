/*
 *  TxMark 1.0.0.alpha-0-g0639c8a
 *
 *  Copyright (c) 2016 Aaron G. Daisley-Harrison
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
using Microsoft.CodeAnalysis.CSharp;
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

        public static StatementSyntax MakeModelAssignmentStatement()
        {

            return SF.ExpressionStatement(
                SF.AssignmentExpression(
                    SyntaxKind.SimpleAssignmentExpression,
                    SF.MemberAccessExpression(
                        SyntaxKind.SimpleMemberAccessExpression,
                        SF.BaseExpression(),
                        SF.IdentifierName("Model")
                    ),
                    SF.IdentifierName("model")
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
