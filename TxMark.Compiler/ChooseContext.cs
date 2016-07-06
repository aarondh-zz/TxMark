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
    public class ChooseContext : CodeContextBase
    {
        private ContentContextExitHandler<IfStatementSyntax> _exitHandler;
        private ExpressionSyntax _valueExpression;
        private List<IfStatementSyntax> _whenClauses;
        private ElseClauseSyntax _otherwiseClause;
        public ChooseContext(ContentContextExitHandler<IfStatementSyntax> exitHandler)
        {
            _whenClauses = new List<IfStatementSyntax>();
            _exitHandler = exitHandler;
        }

        public override void Exit()
        {
            IfStatementSyntax chooseStatement;
            ElseClauseSyntax elseClause = _otherwiseClause;
            if (_whenClauses.Count > 0)
            {
                for (int i = _whenClauses.Count - 1; i > 0; i--)
                {
                    var whenClause = _whenClauses[i];
                    if (elseClause != null)
                    {
                        whenClause = whenClause.WithElse(elseClause);
                    }
                    elseClause = SF.ElseClause(whenClause);
                }
                chooseStatement = _whenClauses[0];
                if (elseClause != null)
                {
                    chooseStatement = chooseStatement.WithElse(elseClause);
                }
            }
            else 
            {
                chooseStatement = SF.IfStatement(SF.LiteralExpression(SyntaxKind.FalseLiteralExpression), SF.Block());
                if (_otherwiseClause != null)
                {
                    chooseStatement = chooseStatement.WithElse(_otherwiseClause);
                }
            }
            _exitHandler(chooseStatement);
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
                            _valueExpression = SF.LiteralExpression(SyntaxKind.TrueKeyword);
                        }
                        else
                        {
                            _valueExpression = expression.ToExpression();
                        }
                    });
                case CodeContextTypes.When:
                    return new WhenContext(name, _valueExpression, (whenStatement) =>
                    {
                        _whenClauses.Add(whenStatement);
                    });
                case CodeContextTypes.Otherwise:
                    string elseHookName = name;
                    return new BlockContext((block) =>
                    {
                        if (elseHookName == null)
                        {
                            _otherwiseClause = SF.ElseClause(block);
                        }
                        else
                        {
                            _otherwiseClause = SF.ElseClause(BlockContext.MakeWriteStatement(MethodCallContext.CreateMethodCall(elseHookName, true)));
                        }
                    });
            }
            return base.CreateContext(contextType, name, attributes);
        }
    }
}
