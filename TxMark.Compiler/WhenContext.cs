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
    public class WhenContext : CodeContextBase
    {
        private string _hookName;
        private ContentContextExitHandler<IfStatementSyntax> _exitHandler;
        private ExpressionSyntax _valueExpression;
        private ExpressionSyntax _testExpression;
        private ElseClauseSyntax _elseClause;
        public WhenContext(string hookName, ExpressionSyntax valueExpression, ContentContextExitHandler<IfStatementSyntax> exitHandler)
        {
            _valueExpression = valueExpression;
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
            ExpressionSyntax condition;
            if ( _valueExpression == null)
            {
                condition = _testExpression;
            }
            else
            {
                condition = SF.BinaryExpression(SyntaxKind.EqualsExpression, _testExpression, _valueExpression);
            }
            var whenStatement = SF.IfStatement(condition, statement);
            _exitHandler(whenStatement);
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
                            _testExpression = SF.LiteralExpression(SyntaxKind.FalseKeyword);
                        }
                        else
                        {
                            _testExpression = expression.ToExpression();
                        }
                    });
            }
            return base.CreateContext(contextType, name, attributes);
        }
    }
}
