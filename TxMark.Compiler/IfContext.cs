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
    public class IfContext : CodeContextBase
    {
        private string _hookName;
        private ContentContextExitHandler<IfStatementSyntax> _exitHandler;
        private ExpressionSyntax _condition;
        private ElseClauseSyntax _elseClause;
        public IfContext(string hookName, ContentContextExitHandler<IfStatementSyntax> exitHandler)
        {
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
            var ifStatement = SF.IfStatement(_condition, statement, _elseClause);
            _exitHandler(ifStatement);
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
                            _condition = SF.LiteralExpression(SyntaxKind.FalseKeyword);
                        }
                        else
                        {
                            _condition = expression;
                        }
                    });
                case CodeContextTypes.ElseIf:
                    return new IfContext(name, (ifStatement) =>
                    {
                        _elseClause = SF.ElseClause(ifStatement);
                    });
                case CodeContextTypes.Else:
                    string elseHookName = name;
                    return new BlockContext((block) =>
                    {
                        if (elseHookName == null)
                        {
                            _elseClause = SF.ElseClause(block);
                        }
                        else
                        {
                            _elseClause = SF.ElseClause(BlockContext.MakeWriteStatement(MethodCallContext.CreateMethodCall(elseHookName, true)));
                        }
                    });
            }
            return base.CreateContext(contextType, name, attributes);
        }
    }
}
