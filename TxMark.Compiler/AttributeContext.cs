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
