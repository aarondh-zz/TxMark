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
    public class SetContext : CodeContextBase
    {
        private string _hookName;
        private ContentContextExitHandler<StatementSyntax> _exitHandler;
        private ExpressionSyntax _valueExpression;
        private string _variableName;
        protected bool HasVariableName
        {
            get
            {
                return !string.IsNullOrEmpty(_variableName);
            }
        }
        public SetContext(string hookName, ContentContextExitHandler<StatementSyntax> exitHandler)
        {
            _hookName = hookName;
            _exitHandler = exitHandler;
        }

        public override void Exit()
        {
            var setStatement = SF.ExpressionStatement(
                SF.AssignmentExpression(
                    SyntaxKind.SimpleAssignmentExpression,
                    VariableHelper.MakeStateVariableExpression(_variableName),
                    _valueExpression
                )
            );
            _exitHandler(setStatement);
        }

        public override void Variable(string name)
        {
            _variableName = name;
            this.Context.RegisterVariable(VariableTypes.State, name);
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
                            _valueExpression = SF.LiteralExpression(SyntaxKind.NullLiteralExpression);
                        }
                        else
                        {
                            _valueExpression = expression.ToExpression();
                        }
                    });
            }
            return base.CreateContext(contextType, name, attributes);
        }
    }
}
