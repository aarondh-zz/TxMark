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
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using SF = Microsoft.CodeAnalysis.CSharp.SyntaxFactory;

namespace TxMark.Compiler
{
    public class IfContext : CodeContextBase
    {
        private string _hookName;
        private ContentContextExitHandler<IfStatementSyntax> _exitHandler;
        private ExpressionSyntax _condition;
        private ElseClauseSyntax _elseClause;
        public IfContext(string hookName, ContentContextExitHandler<IfStatementSyntax> exitHandler)
        {
            _hookName = hookName;
            _exitHandler = exitHandler;
        }

        public override void Exit()
        {
            StatementSyntax statement;
            if ( _hookName == null)
            {
                statement = SF.Block();
            }
            else
            {
                statement = BlockContext.MakeWriteStatement(MethodCallContext.CreateMethodCall(_hookName, true));
            }
            var ifStatement = SF.IfStatement(_condition, statement, _elseClause);
            _exitHandler(ifStatement);
        }

        public override ICodeContext CreateContext(CodeContextTypes contextType, string name = null, Bag<string> attributes = null)
        {
            switch (contextType)
            {
                case CodeContextTypes.Argument:
                    return new ExpressionContext((expression) =>
                    {
                        if (expression == null)
                        {
                            _condition = SF.LiteralExpression(SyntaxKind.FalseKeyword);
                        }
                        else
                        {
                            _condition = expression.ToExpression();
                        }
                    });
                case CodeContextTypes.ElseIf:
                    return new IfContext(name, (ifStatement) =>
                    {
                        _elseClause = SF.ElseClause(ifStatement);
                    });
                case CodeContextTypes.Else:
                    string elseHookName = name;
                    return new BlockContext((block) =>
                    {
                        if (elseHookName == null)
                        {
                            _elseClause = SF.ElseClause(block);
                        }
                        else
                        {
                            _elseClause = SF.ElseClause(BlockContext.MakeWriteStatement(MethodCallContext.CreateMethodCall(elseHookName, true)));
                        }
                    });
            }
            return base.CreateContext(contextType, name, attributes);
        }
    }
}
