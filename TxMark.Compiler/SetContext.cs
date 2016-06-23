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
                            _valueExpression = SF.LiteralExpression(SyntaxKind.NullKeyword);
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
