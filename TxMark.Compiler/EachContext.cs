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
    public class EachContext : CodeContextBase
    {
        private string _hookName;
        private string _iteratorVariableName;
        private string _asVariableName;
        private ContentContextExitHandler<StatementSyntax> _exitHandler;
        private ExpressionSyntax _expression;
        private static int s_eachCounter = 0;
        public EachContext(string hookName, ContentContextExitHandler<StatementSyntax> exitHandler)
        {
            _hookName = hookName;
            _exitHandler = exitHandler;
            _asVariableName = "item";
            _iteratorVariableName = "_it_" + s_eachCounter++;
        }

        public override void Exit()
        {
            List<StatementSyntax> loopStatements = new List<StatementSyntax>();
            //loopStatements.Add(StateHelper.MakeStatePushStatement());
            loopStatements.Add(SF.ExpressionStatement(
                    SF.AssignmentExpression(
                        SyntaxKind.SimpleAssignmentExpression,
                        VariableHelper.MakeStateVariableExpression(_asVariableName),
                        SF.IdentifierName(_iteratorVariableName)
                    )
                )
            );
            if ( _hookName != null)
            {
                loopStatements.Add(BlockContext.MakeWriteStatement(MethodCallContext.CreateMethodCall(_hookName, true)));
            }
            //loopStatements.Add(StateHelper.MakeStatePopWriteStatement());
            var forEachStatement = SF.ForEachStatement(SF.ParseTypeName("var"), _iteratorVariableName, _expression, SF.Block(loopStatements));
            _exitHandler(forEachStatement);
        }

        public override void Variable(string name)
        {
            _asVariableName = name;
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
                            _expression = SF.LiteralExpression(SyntaxKind.FalseKeyword);
                        }
                        else
                        {
                            _expression = expression.ToExpression();
                        }
                    });
            }
            return base.CreateContext(contextType, name, attributes);
        }
    }
}
