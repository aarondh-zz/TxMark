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
    public class AttributeContext : ExpressionContext
    {
        string _attributeName;
        private StringBuilder _text = new StringBuilder();
        public AttributeContext(string attributeName, ContentContextExitHandler<ExpressionNode> exitHandler)
            :base(exitHandler)
        {
            _attributeName = attributeName;
        }

        protected override void Add(OperatorTypes operatorType, ExpressionNode expressionNode)
        {
            FlushTextBuffer();
            base.Add(operatorType, expressionNode);
        }

        public override void Exit()
        {
            FlushTextBuffer();
            base.Exit();
        }
        protected void FlushTextBuffer()
        {
            if (_text.Length > 0)
            {
                string text = _text.ToString();
                _text.Length = 0;
                Add(OperatorTypes.Add,SF.LiteralExpression(
                    SyntaxKind.StringLiteralExpression,
                    SF.Literal(text)
                ));
            }
        }
        public override void NewLine()
        {
            _text.AppendLine();
        }

        public override void Number(string numberText)
        {
            _text.Append(numberText); 
        }
        public override void Punctuation(char punctuation)
        {
            _text.Append(punctuation);
        }
        public override void Text(string text)
        {
            _text.Append(text);
        }

        public override void Whitespace()
        {
            _text.Append(" ");
        }

        public override void Word(string word)
        {
            _text.Append(word);
        }
    }
}
