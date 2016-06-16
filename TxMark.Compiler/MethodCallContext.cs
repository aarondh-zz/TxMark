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
    public class MethodCallContext : CodeContextBase
    {
        private string _methodName;
        private bool _requiresState;
        private string _hookName;
        private string _asVariable;
        private ContentContextExitHandler<ExpressionSyntax> _exitHandler;
        private List<ArgumentSyntax> _arguments = new List<ArgumentSyntax>();
        public MethodCallContext(string methodName, ContentContextExitHandler<ExpressionSyntax> exitHandler, string hookName = null, bool requiresState = false)
        {
            _methodName = methodName;
            _hookName = hookName;
            _requiresState = requiresState;
            _exitHandler = exitHandler;
        }
        public static InvocationExpressionSyntax CreateMethodCall(string methodName, bool requiresState, IEnumerable<ArgumentSyntax> arguments = null, string hookName = null)
        {
            List<ArgumentSyntax> argumentList;
            if ( arguments == null)
            {
                argumentList = new List<ArgumentSyntax>();
                if (requiresState)
                {
                    arguments = new ArgumentSyntax[] { SF.Argument(SF.IdentifierName("_this")) };

                }
                else
                {
                    arguments = new ArgumentSyntax[] { };
                }
            }
            else
            {
                argumentList = new List<ArgumentSyntax>(arguments);
            }
            if (requiresState)
            {
                argumentList.Insert(0, SF.Argument(SF.IdentifierName("_this")));
            }
            if (hookName != null)
            {
                argumentList.Add(SF.Argument(SF.NameColon("hook"), SF.Token(SyntaxKind.None), SF.IdentifierName(hookName)));
            }
            return SF.InvocationExpression(
                SF.IdentifierName(methodName),
                SF.ArgumentList(
                    SF.SeparatedList<ArgumentSyntax>(argumentList)
                )
            );

        }

        public override void Exit()
        {
            ExpressionSyntax expression = CreateMethodCall(_methodName, _requiresState, _arguments, _hookName);
            if (_asVariable != null)
            {
                expression = SF.AssignmentExpression(SyntaxKind.SimpleAssignmentExpression, 
                    VariableHelper.MakeStateVariableExpression(_asVariable), 
                    expression
                );
            }
            _exitHandler(expression);
        }

        public override void Variable(string variableName)
        {
            _asVariable = variableName;
        }
        public override ICodeContext CreateContext(CodeContextTypes contextType, string name = null, Bag<string> attributes = null)
        {
            switch (contextType)
            {
                case CodeContextTypes.Argument:
                    return new ArgumentContext((expression) =>
                    {
                        if (expression == null)
                        {
                            _arguments.Add(SF.Argument(SF.LiteralExpression(SyntaxKind.NullLiteralExpression)));
                        }
                        else
                        {
                            _arguments.Add(SF.Argument(expression));
                        }
                    });
            }
            return base.CreateContext(contextType, name, attributes);
        }
    }
}
