using Microsoft.CodeAnalysis.CSharp;
using Microsoft.CodeAnalysis.CSharp.Syntax;
using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using SF = Microsoft.CodeAnalysis.CSharp.SyntaxFactory;

namespace TxMark.Compiler
{
    public class ExpressionContext : CodeContextBase
    {
        private ContentContextExitHandler<ExpressionNode> _exitHandler;
        private ExpressionNode _expression;
        private StringBuilder _text = new StringBuilder();
        public class Operator
        {
            public static readonly Operator Noop = new Operator(OperatorTypes.Noop, 1, SyntaxKind.None);
            public OperatorTypes OperatorType { get; private set; }
            public int Precidence { get; private set; }
            public SyntaxKind SyntaxKind { get; private set; }

            public Operator(OperatorTypes operatorType, int precidence, SyntaxKind syntaxKind)
            {
                this.OperatorType = operatorType;
                this.Precidence = precidence;
                this.SyntaxKind = syntaxKind;
            }

            public override string ToString()
            {
                return $"{this.OperatorType}[{this.Precidence}]";
            }
        }

        public class ExpressionNode
        {
            public ExpressionNode Left { get; private set; }
            public ExpressionNode Right { get; private set; }
            public ExpressionSyntax Expression { get; private set; }
            public Operator Operator { get; private set; }

            public bool IsUnary
            {
                get
                {
                    if ( this.Expression != null)
                    {
                        return true;
                    }
                    else if ( this.Right == null)
                    {
                        return true;
                    }
                    else
                    {
                        return false;
                    }
                }
            }

            public ExpressionNode(Operator operatorMap = null, ExpressionNode left = null, ExpressionNode right = null)
            {
                this.Operator = operatorMap??Operator.Noop;
                this.Left = left;
                this.Right = right;
            }
            public ExpressionNode(ExpressionSyntax expression)
            {
                this.Operator = Operator.Noop;
                this.Expression = expression;
            }

            public ExpressionSyntax ToExpression()
            {
                if ( this.Expression != null)
                {
                    return this.Expression;
                }
                switch( this.Operator.OperatorType)
                {
                    case OperatorTypes.Parenthesis:
                        return SF.ParenthesizedExpression(Left.ToExpression());
                    case OperatorTypes.Power:
                        return MethodCallContext.CreateMethodCall("Pow", false, new ArgumentSyntax[] { SF.Argument(Left.ToExpression()), SF.Argument(Right.ToExpression()) });
                    case OperatorTypes.Index:
                        return MethodCallContext.CreateMethodCall("Index", false, new ArgumentSyntax[] { SF.Argument(Left.ToExpression()), SF.Argument(Right.ToExpression()) });
                    case OperatorTypes.Noop:
                        return Left.ToExpression();
                    default:
                        return SF.BinaryExpression(this.Operator.SyntaxKind, Left.ToExpression(), Right.ToExpression());
                }
            }
            public override string ToString()
            {
                try
                {
                    return ToExpression().ToString();
                }
                catch(Exception e)
                {
                    return e.Message;
                }
            }
        }
        private static Dictionary<OperatorTypes, Operator> _operatorMapByType = new Dictionary<OperatorTypes, Operator>();
        private static void RegisterOperator(OperatorTypes operatorType, int precidence, SyntaxKind syntaxKind)
        {
            _operatorMapByType.Add(operatorType, new Operator(operatorType, precidence, syntaxKind));
        }

        static ExpressionContext()
        {
            RegisterOperator(OperatorTypes.Parenthesis, 1, SyntaxKind.ParenthesizedExpression);

            RegisterOperator(OperatorTypes.Noop, 1, SyntaxKind.None);

            RegisterOperator(OperatorTypes.UnaryMinus, 1, SyntaxKind.UnaryMinusExpression);

            RegisterOperator(OperatorTypes.Power, 2, SyntaxKind.None);

            RegisterOperator(OperatorTypes.Index, 3, SyntaxKind.None);

            RegisterOperator(OperatorTypes.Divide, 5, SyntaxKind.DivideExpression);
            RegisterOperator(OperatorTypes.Modulo, 5, SyntaxKind.ModuloExpression);
            RegisterOperator(OperatorTypes.Multiply, 5, SyntaxKind.MultiplyExpression);

            RegisterOperator(OperatorTypes.Subtract, 10, SyntaxKind.SubtractExpression);
            RegisterOperator(OperatorTypes.Add, 10, SyntaxKind.AddExpression);

            RegisterOperator(OperatorTypes.GreaterOrEqual, 20, SyntaxKind.GreaterThanOrEqualExpression);
            RegisterOperator(OperatorTypes.GreaterThan, 20, SyntaxKind.GreaterThanExpression);
            RegisterOperator(OperatorTypes.Is, 20, SyntaxKind.IsExpression);
            RegisterOperator(OperatorTypes.IsNot, 20, SyntaxKind.NotEqualsExpression);
            RegisterOperator(OperatorTypes.LessOrEqual, 20, SyntaxKind.LessThanOrEqualExpression);
            RegisterOperator(OperatorTypes.LessThan, 20, SyntaxKind.LessThanExpression);

            RegisterOperator(OperatorTypes.And, 30, SyntaxKind.LogicalAndExpression);
            RegisterOperator(OperatorTypes.Or, 30, SyntaxKind.LogicalOrExpression);

        }
        public ExpressionContext(ContentContextExitHandler<ExpressionNode> exitHandler)
        {
            _exitHandler = exitHandler;
        }
        private static Operator GetOperatorMap(OperatorTypes operatorType)
        {
            return _operatorMapByType[operatorType];
        }
        public override void Exit()
        {
            Debug.WriteLine($"Expression: {_expression}");
            if ( _exitHandler != null)
            {
                _exitHandler(_expression);
            }
        }
        protected virtual void Add(OperatorTypes operatorType, ExpressionNode expressionNode)
        {
            var oper = GetOperatorMap(operatorType);
            if ( _expression == null)
            {
                _expression = expressionNode;
            }
            else if (oper.Precidence < expressionNode.Operator.Precidence)
            {
                if (expressionNode.IsUnary)
                {
                    _expression = new ExpressionNode(oper, _expression, expressionNode);
                }
                else
                {
                    var left = new ExpressionNode(
                            oper,
                            _expression,
                            expressionNode.Left
                            );
                    _expression = new ExpressionNode(expressionNode.Operator, left, expressionNode.Right);
                }
            }
            else
            {
                _expression = new ExpressionNode(oper, _expression, expressionNode);
            }
        }
        protected void Add(OperatorTypes operatorType, ExpressionSyntax expression)
        {
            Add(operatorType, new ExpressionNode(expression));
        }
        public bool IsEmpty
        {
            get
            {
                return _expression == null;
            }
        }
        public override void Boolean(bool boolean)
        {
            if ( boolean)
            {
                Add(OperatorTypes.Add, SF.LiteralExpression(SyntaxKind.TrueLiteralExpression));
            }
            else
            {
                Add(OperatorTypes.Add, SF.LiteralExpression(SyntaxKind.FalseLiteralExpression));
            }
        }
        public override void NewLine()
        {
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
                    Add(OperatorTypes.Add, SF.LiteralExpression(SyntaxKind.NumericLiteralExpression, SF.Literal(doubleValue)));
                }
                else
                {
                    Add(OperatorTypes.Add, SF.LiteralExpression(SyntaxKind.NumericLiteralExpression, SF.Literal(double.NaN)));
                }
            }
            else if ( int.TryParse(numberText, out intValue))
            {
                Add(OperatorTypes.Add, SF.LiteralExpression(SyntaxKind.NumericLiteralExpression, SF.Literal(intValue)));
            }
            else
            {
                Add(OperatorTypes.Add, SF.LiteralExpression(SyntaxKind.NumericLiteralExpression, SF.Literal(0)));
            }
        }
        public override void Null()
        {
            Add(OperatorTypes.Add, SF.LiteralExpression(SyntaxKind.NullLiteralExpression));
        }

        public override void Quote(string quote)
        {
            Add(OperatorTypes.Add, SF.LiteralExpression(SyntaxKind.StringLiteralExpression, SF.Literal(quote)));
        }

        public override void Whitespace()
        {
        }

        public override void Variable(string variableName)
        {
            Add(OperatorTypes.Add, this.Context.IsStateVariable(variableName) ?
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
                    Add(OperatorTypes.Add, MethodCallContext.CreateMethodCall(hook,true));
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
                        Add(OperatorTypes.Noop,methodCall);
                    }, attributes?.Get<string>("hook"));
                case CodeContextTypes.Expression:
                    return new ExpressionContext((expression) =>
                    {
                        Add(OperatorTypes.Add, expression);
                    });
                case CodeContextTypes.SignedExpression:
                    return new ExpressionContext((expression) =>
                    {
                        Add(OperatorTypes.UnaryMinus, expression);
                    });
                case CodeContextTypes.ParenthesizedExpression:
                    return new ExpressionContext((expression) =>
                    {
                        Add( OperatorTypes.Add, new ExpressionNode( GetOperatorMap(OperatorTypes.Parenthesis),expression));
                    });
                case CodeContextTypes.BinaryExpression:
                    if (attributes?.Contains("operator") ?? false)
                    {
                        var operatorType = attributes.Get<OperatorTypes>("operator");
                        return new ExpressionContext((expression) =>
                        {
                            Add(operatorType, expression);
                        });
                    }
                    break;
                case CodeContextTypes.IndexExpression:
                    return new ExpressionContext((expression) =>
                    {
                        Add(OperatorTypes.Index, expression);
                    });
                case CodeContextTypes.OfExpression:
                    return new ExpressionContext((expression) =>
                    {
                        if ( _expression != null && expression != null)
                        {
                            _expression = new ExpressionNode(GetOperatorMap(OperatorTypes.Index), left: expression, right: _expression);
                        }
                    });
            }
            return base.CreateContext(contextType, name, attributes);
        }

    }
}
