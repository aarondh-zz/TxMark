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
    public class ExpressionContext : CodeContextBase
    {
        private ContentContextExitHandler<ExpressionSyntax> _exitHandler;
        private ExpressionSyntax _expression;
        private StringBuilder _text = new StringBuilder();
        protected enum Position
        {
            Unknown,
            First,
            Last
        }
        public ExpressionContext(ContentContextExitHandler<ExpressionSyntax> exitHandler)
        {
            _exitHandler = exitHandler;
        }
        private static SyntaxKind GetSyntaxKind(OperatorTypes operatorType)
        {
            switch (operatorType)
            {
                case OperatorTypes.Add:
                    return SyntaxKind.AddExpression;
                case OperatorTypes.And:
                    return SyntaxKind.LogicalAndExpression;
                case OperatorTypes.Divide:
                    return SyntaxKind.DivideExpression;
                case OperatorTypes.GreaterOrEqual:
                    return SyntaxKind.GreaterThanOrEqualExpression;
                case OperatorTypes.GreaterThan:
                    return SyntaxKind.GreaterThanExpression;
                case OperatorTypes.Is:
                    return SyntaxKind.IsExpression;
                case OperatorTypes.IsNot:
                    return SyntaxKind.NotEqualsExpression;
                case OperatorTypes.LessOrEqual:
                    return SyntaxKind.LessThanOrEqualExpression;
                case OperatorTypes.LessThan:
                    return SyntaxKind.LessThanExpression;
                case OperatorTypes.Modulo:
                    return SyntaxKind.ModuloExpression;
                case OperatorTypes.Multiply:
                    return SyntaxKind.MultiplyExpression;
                case OperatorTypes.Or:
                    return SyntaxKind.LogicalOrExpression;
                case OperatorTypes.Subtract:
                    return SyntaxKind.SubtractExpression;
                default:
                    return SyntaxKind.AddExpression;
            }
        }

        public override void Exit()
        {
            WriteTextIfRequired(true);
            if ( _exitHandler != null)
            {
                _exitHandler(_expression);
            }
        }
        protected void Add( ExpressionSyntax expression)
        {
            WriteTextIfRequired();
            if ( _expression == null)
            {
                _expression = expression;
            }
            else
            {
                _expression = SF.BinaryExpression(SyntaxKind.AddExpression, _expression, expression);
            }
        }
        public bool IsEmpty
        {
            get
            {
                return _expression == null;
            }
        }
        protected virtual string TransformText( StringBuilder text, Position position)
        {
            return text.ToString();
        }
        protected void WriteTextIfRequired(bool isLast = true)
        {
            if ( _text.Length > 0 )
            {
                Position position;
                if ( _expression == null)
                {
                    position = Position.First;
                }
                else if ( isLast)
                {
                    position = Position.Last;
                }
                else
                {
                    position = Position.Unknown;
                }
                string text = TransformText(_text, position);
                _text.Length = 0;
                Add(SF.LiteralExpression(SyntaxKind.StringLiteralExpression, SF.Literal(text)));
            }
        }
        public override void Boolean(bool boolean)
        {
            if ( boolean)
            {
                Add(SF.LiteralExpression(SyntaxKind.TrueLiteralExpression));
            }
            else
            {
                Add(SF.LiteralExpression(SyntaxKind.FalseLiteralExpression));
            }
        }
        public override void NewLine()
        {
            _text.AppendLine();
        }
        public override void Number(string numberText)
        {
            double doubleValue;
            int intValue = 0;
            if (string.IsNullOrWhiteSpace(numberText))
            {
                Null();
            }
            else if (numberText.Contains('.'))
            {
                if (double.TryParse(numberText, out doubleValue))
                {
                    Add(SF.LiteralExpression(SyntaxKind.NumericLiteralExpression, SF.Literal(doubleValue)));
                }
                else
                {
                    Add(SF.LiteralExpression(SyntaxKind.NumericLiteralExpression, SF.Literal(double.NaN)));
                }
            }
            else if ( int.TryParse(numberText, out intValue))
            {
                Add(SF.LiteralExpression(SyntaxKind.NumericLiteralExpression, SF.Literal(intValue)));
            }
            else
            {
                Add(SF.LiteralExpression(SyntaxKind.NumericLiteralExpression, SF.Literal(0)));
            }
        }
        public override void Null()
        {
            Add(SF.LiteralExpression(SyntaxKind.NullLiteralExpression));
        }
        public override void Text(string text)
        {
            _text.Append(text);
        }

        public override void Word(string word)
        {
            _text.Append(word);
        }

        public override void Quote(string quote)
        {
            _text.Append('"');
            _text.Append(quote);
            _text.Append('"');
        }

        public override void Punctuation(char punctuation)
        {
            _text.Append(punctuation);
        }

        public override void Whitespace()
        {
            _text.Append(" ");
        }

        public override void Variable(string variableName)
        {
            Add(this.Context.IsStateVariable(variableName) ?
                VariableHelper.MakeStateVariableExpression(variableName) :
                VariableHelper.MakeModelVariableExpression(variableName)
            );
        }

        public override void NameTag(string nameTag)
        {
            var hooks = this.Context.ResolveNameTag(nameTag);
            if ( hooks == null)
            {
                foreach (var hook in hooks)
                {
                    Add(MethodCallContext.CreateMethodCall(hook,true));
                }
            }
            else
            {
                Text($"!ERROR: ?{nameTag} was not defined!");
            }
        }
        public override ICodeContext CreateContext(CodeContextTypes contextType, string name = null, Bag<string> attributes = null)
        {
            switch (contextType)
            {
                case CodeContextTypes.MethodCall:
                    return new MethodCallContext(name, (methodCall) =>
                    {
                        _expression = methodCall;
                    }, attributes?.Get<string>("hook"));
                case CodeContextTypes.Expression:
                    return new ExpressionContext((expression) =>
                    {
                        _expression = expression;
                    });
                case CodeContextTypes.SignedExpression:
                    return new ExpressionContext((expression) =>
                    {
                        _expression = SF.PrefixUnaryExpression(SyntaxKind.UnaryMinusExpression, expression);
                    });
                case CodeContextTypes.ParenthesizedExpression:
                    return new ExpressionContext((expression) =>
                    {
                        _expression = SF.ParenthesizedExpression(expression);
                    });
                case CodeContextTypes.BinaryExpression:
                    if (attributes?.Contains("operator") ?? false)
                    {
                        var operatorType = attributes.Get<OperatorTypes>("operator");
                        if (operatorType == OperatorTypes.Power)
                        {
                            return new ExpressionContext((expression) =>
                            {
                                _expression = MethodCallContext.CreateMethodCall("Pow", false, new ArgumentSyntax[]{ SF.Argument(_expression), SF.Argument(expression) });
                            });
                        }
                        else
                        {
                            SyntaxKind operatorSyntaxKind = GetSyntaxKind(operatorType);
                            return new ExpressionContext((expression) =>
                            {
                                _expression = SF.BinaryExpression(operatorSyntaxKind, _expression, expression);
                            });
                        }
                    }
                    break;
                case CodeContextTypes.IndexExpression:
                    return new ExpressionContext((expression) =>
                    {
                        _expression = MethodCallContext.CreateMethodCall("Index", false,
                            new ArgumentSyntax[]
                            {
                                SF.Argument(_expression),
                                SF.Argument(expression)
                            }
                        );
                    });
                case CodeContextTypes.OfExpression:
                    return new ExpressionContext((expression) =>
                    {
                        _expression = MethodCallContext.CreateMethodCall("Index", false,
                            new ArgumentSyntax[]
                            {
                                SF.Argument(expression),
                                SF.Argument(_expression)
                            }
                        );
                    });
            }
            return base.CreateContext(contextType, name, attributes);
        }

    }
}
