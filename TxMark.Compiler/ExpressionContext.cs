/*
 *  TxMark 1.0.0.alpha-5-g61bda79
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
        protected ExpressionNode _first;
        protected ExpressionNode _last;
        private StringBuilder _text = new StringBuilder();
        private OperatorTypes _defaultOperator;
        public class Operator
        {
            public static readonly Operator Noop = new Operator(OperatorTypes.Noop, 1, SyntaxKind.None,"noop");
            public OperatorTypes OperatorType { get; private set; }
            public int Precidence { get; private set; }
            public SyntaxKind SyntaxKind { get; private set; }
            public string Text { get; private set; }

            public Operator(OperatorTypes operatorType, int precidence, SyntaxKind syntaxKind, string text)
            {
                this.OperatorType = operatorType;
                this.Precidence = precidence;
                this.SyntaxKind = syntaxKind;
                this.Text = text;
            }

            public override string ToString()
            {
                return $"{this.Text}[{this.Precidence}]";
            }
        }
        public class ExpressionNode
        {
            public ExpressionNode Left { get; set; }
            public ExpressionNode Right { get; set; }
            public ExpressionSyntax Expression { get; set; }
            public Operator Operator { get; private set; }
            public ExpressionNode Clone()
            {
                return new ExpressionNode(this.Operator, this.Left, this.Right)
                {
                    Expression = this.Expression
                };
            }
            public void Set(ExpressionNode expressionNode)
            {
                this.Operator = Operator.Noop;
                this.Expression = null;
                this.Right = expressionNode;
            }
            public bool IsUnary
            {
                get
                {
                    if ( this.Expression != null)
                    {
                        return true;
                    }
                    else if ( this.Left == null)
                    {
                        return true;
                    }
                    else
                    {
                        return false;
                    }
                }
            }

            public ExpressionNode(Operator operatorMap, ExpressionNode left, ExpressionNode right)
            {
                this.Operator = operatorMap;
                this.Left = left;
                this.Right = right;
            }
            public ExpressionNode(Operator operatorMap, ExpressionNode right)
            {
                this.Operator = operatorMap;
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
                        return SF.ParenthesizedExpression(Right.ToExpression());
                    case OperatorTypes.Power:
                        return MethodCallContext.CreateMethodCall("Pow", false, new ArgumentSyntax[] { SF.Argument(Left.ToExpression()), SF.Argument(Right.ToExpression()) });
                    case OperatorTypes.IsIn:
                        return MethodCallContext.CreateMethodCall("IsIn", false, new ArgumentSyntax[] { SF.Argument(Left.ToExpression()), SF.Argument(Right.ToExpression()) });
                    case OperatorTypes.Contains:
                        return MethodCallContext.CreateMethodCall("Contains", false, new ArgumentSyntax[] { SF.Argument(Left.ToExpression()), SF.Argument(Right.ToExpression()) });
                    case OperatorTypes.Index:
                        return MethodCallContext.CreateMethodCall("Index", false, new ArgumentSyntax[] { SF.Argument(Left.ToExpression()), SF.Argument(Right.ToExpression()) });
                    case OperatorTypes.IndexOf:
                        return MethodCallContext.CreateMethodCall("Index", false, new ArgumentSyntax[] { SF.Argument(Right.ToExpression()), SF.Argument(Left.ToExpression()) });
                    case OperatorTypes.LastIndex:
                        return MethodCallContext.CreateMethodCall("IndexFromLast", false, new ArgumentSyntax[] { SF.Argument(Left.ToExpression()), SF.Argument(Right.ToExpression())});
                    case OperatorTypes.LastIndexOf:
                        return MethodCallContext.CreateMethodCall("IndexFromLast", false, new ArgumentSyntax[] { SF.Argument(Right.ToExpression()), SF.Argument(Left.ToExpression())});
                    case OperatorTypes.Noop:
                        return Right.ToExpression();
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
        private static void RegisterOperator(OperatorTypes operatorType, int precidence, SyntaxKind syntaxKind, string text)
        {
            _operatorMapByType.Add(operatorType, new Operator(operatorType, precidence, syntaxKind,text));
        }

        static ExpressionContext()
        {
            RegisterOperator(OperatorTypes.Parenthesis, 1, SyntaxKind.ParenthesizedExpression,"()");

            RegisterOperator(OperatorTypes.Noop, 1, SyntaxKind.None, "");

            RegisterOperator(OperatorTypes.UnaryMinus, 1, SyntaxKind.UnaryMinusExpression, "-");

            RegisterOperator(OperatorTypes.Power, 2, SyntaxKind.None, "^");

            RegisterOperator(OperatorTypes.Index, 3, SyntaxKind.None, "[]");
            RegisterOperator(OperatorTypes.IndexOf, 3, SyntaxKind.None, "of");
            RegisterOperator(OperatorTypes.LastIndex, 3, SyntaxKind.None, "[last]");
            RegisterOperator(OperatorTypes.LastIndexOf, 3, SyntaxKind.None, "last of");

            RegisterOperator(OperatorTypes.Divide, 5, SyntaxKind.DivideExpression,"/");
            RegisterOperator(OperatorTypes.Modulo, 5, SyntaxKind.ModuloExpression,"%");
            RegisterOperator(OperatorTypes.Multiply, 5, SyntaxKind.MultiplyExpression,"*");

            RegisterOperator(OperatorTypes.Subtract, 10, SyntaxKind.SubtractExpression,"-");
            RegisterOperator(OperatorTypes.Add, 10, SyntaxKind.AddExpression,"+");

            RegisterOperator(OperatorTypes.IsIn, 15, SyntaxKind.None, "is in");
            RegisterOperator(OperatorTypes.Contains, 15, SyntaxKind.None, "contains");

            RegisterOperator(OperatorTypes.GreaterOrEqual, 20, SyntaxKind.GreaterThanOrEqualExpression,">=");
            RegisterOperator(OperatorTypes.GreaterThan, 20, SyntaxKind.GreaterThanExpression,">");
            RegisterOperator(OperatorTypes.Is, 20, SyntaxKind.EqualsExpression,"==");
            RegisterOperator(OperatorTypes.IsNot, 20, SyntaxKind.NotEqualsExpression,"!=");
            RegisterOperator(OperatorTypes.LessOrEqual, 20, SyntaxKind.LessThanOrEqualExpression,"<=");
            RegisterOperator(OperatorTypes.LessThan, 20, SyntaxKind.LessThanExpression,"<");

            RegisterOperator(OperatorTypes.And, 30, SyntaxKind.LogicalAndExpression,"&&");
            RegisterOperator(OperatorTypes.Or, 30, SyntaxKind.LogicalOrExpression,"||");

        }
        public ExpressionContext(ContentContextExitHandler<ExpressionNode> exitHandler, OperatorTypes defaultOperator = OperatorTypes.Add)
        {
            this._defaultOperator = defaultOperator;
            _exitHandler = exitHandler;
        }
        private static Operator GetOperatorMap(OperatorTypes operatorType)
        {
            return _operatorMapByType[operatorType];
        }
        public override void Exit()
        {
            Debug.WriteLine($"Expression: {_first}");
            if ( _exitHandler != null)
            {
                _exitHandler(_first);
            }
        }
        protected virtual void Add(OperatorTypes operatorType, ExpressionNode expressionNode)
        {
            if (expressionNode == null)
            {
                return;
            }
            var oldLast = _last;
            var oper = GetOperatorMap(operatorType);
            if ( _first == null)
            {
                _first = _last = expressionNode;
            }
            else if ( expressionNode.IsUnary)
            {
                if (_last.IsUnary)
                {
                    _last = new ExpressionNode(oper, _last, expressionNode);
                }
                else if (oper.Precidence <= _last.Operator.Precidence)
                {
                    _last = _last.Right = new ExpressionNode(oper, _last.Right, expressionNode);
                    oldLast = null;
                }
                else
                {
                    _last.Set(new ExpressionNode(oper, _last.Clone(), expressionNode));
                }
            }
            else if (oper.Precidence <= expressionNode.Operator.Precidence && oper.OperatorType != OperatorTypes.IndexOf)
            {
                if (_last.IsUnary)
                {
                    _last.Set(new ExpressionNode(
                            oper,
                            _last.Clone(),
                            expressionNode.Left
                            ));
                }
                else
                {
                    _last = _last.Right = new ExpressionNode(
                        oper,
                        _last.Right,
                        expressionNode.Left
                        );
                }
                if (_first == oldLast)
                {
                    _first = _last;
                }
                Add(expressionNode.Operator.OperatorType, expressionNode.Right);
                return;
            }
            else if ( _first == _last)
            {
                _first = _last = new ExpressionNode(oper, _last, expressionNode);
            }
            else
            {
                _last.Set( new ExpressionNode(oper, _last.Clone(), expressionNode));
            }
            if ( _first == oldLast)
            {
                _first = _last;
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
                return _first == null;
            }
        }
        public override void Boolean(bool boolean)
        {
            if ( boolean)
            {
                Add(_defaultOperator, SF.LiteralExpression(SyntaxKind.TrueLiteralExpression));
            }
            else
            {
                Add(_defaultOperator, SF.LiteralExpression(SyntaxKind.FalseLiteralExpression));
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
                    Add(_defaultOperator, SF.LiteralExpression(SyntaxKind.NumericLiteralExpression, SF.Literal(doubleValue)));
                }
                else
                {
                    Add(_defaultOperator, SF.LiteralExpression(SyntaxKind.NumericLiteralExpression, SF.Literal(double.NaN)));
                }
            }
            else if ( int.TryParse(numberText, out intValue))
            {
                Add(_defaultOperator, SF.LiteralExpression(SyntaxKind.NumericLiteralExpression, SF.Literal(intValue)));
            }
            else
            {
                Add(_defaultOperator, SF.LiteralExpression(SyntaxKind.NumericLiteralExpression, SF.Literal(0)));
            }
        }
        public override void Null()
        {
            Add(_defaultOperator, SF.LiteralExpression(SyntaxKind.NullLiteralExpression));
        }

        public override void Quote(string quote)
        {
            Add(_defaultOperator, SF.LiteralExpression(SyntaxKind.StringLiteralExpression, SF.Literal(quote)));
        }

        public override void Word(string word)
        {
            Add(_defaultOperator, SF.LiteralExpression(SyntaxKind.StringLiteralExpression, SF.Literal(word)));
        }

        public override void Whitespace()
        {
        }

        public override void Variable(string variableName)
        {
            Add(_defaultOperator, this.Context.IsStateVariable(variableName) ?
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
                    Add(_defaultOperator, MethodCallContext.CreateMethodCall(hook,true));
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
                        Add(_defaultOperator, expression);
                    });
                case CodeContextTypes.SignedExpression:
                    return new ExpressionContext((expression) =>
                    {
                        Add(OperatorTypes.UnaryMinus, expression);
                    });
                case CodeContextTypes.ParenthesizedExpression:
                    return new ExpressionContext((expression) =>
                    {
                        Add( _defaultOperator, new ExpressionNode( GetOperatorMap(OperatorTypes.Parenthesis),expression));
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
                    bool last = attributes?.Get<bool>("last", false) ?? false;
                    return new ExpressionContext((expression) =>
                    {
                        Add(last?OperatorTypes.LastIndex:OperatorTypes.Index, expression);
                    });
                case CodeContextTypes.OfExpression:
                    bool lastOf = attributes?.Get<bool>("last", false) ?? false;
                    return new ExpressionContext((expression) =>
                    {
                        Add(_defaultOperator, expression);
                    }, lastOf? OperatorTypes.LastIndexOf:OperatorTypes.IndexOf);
            }
            return base.CreateContext(contextType, name, attributes);
        }
        public override string ToString()
        {
            if ( _first == null)
            {
                return "empty";
            }
            else
            {
                return _first.ToString();
            }
        }

    }
}
