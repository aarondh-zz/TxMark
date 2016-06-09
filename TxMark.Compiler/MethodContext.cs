using Microsoft.CodeAnalysis;
using Microsoft.CodeAnalysis.CSharp;
using Microsoft.CodeAnalysis.CSharp.Syntax;
using System.Collections.Generic;
using SF = Microsoft.CodeAnalysis.CSharp.SyntaxFactory;

namespace TxMark.Compiler
{
    public class MethodContext : BlockContext
    {
        private string _methodName;
        private ContentContextExitHandler<MethodDeclarationSyntax> _exitHandler;
        private List<ParameterSyntax> _parameters = new List<ParameterSyntax>();
        private List<SyntaxToken> _modifiers = new List<SyntaxToken>();
        public MethodContext(string methodName, ContentContextExitHandler<MethodDeclarationSyntax> exitHandler, bool isPublic = true, bool isOverride = false)
        {
            _methodName = methodName;
            _exitHandler = exitHandler;
            if (isPublic)
            {
                _modifiers.Add(SF.Token(SyntaxKind.PublicKeyword));
            }
            if (isOverride)
            {
                _modifiers.Add(SF.Token(SyntaxKind.OverrideKeyword));
            }
            Add(StateHelper.MakeStatePushStatement());
        }
        public override void Enter(ICompileContext context, ICodeContext parent)
        {
            base.Enter(context, parent);
            _parameters.Add(SF.Parameter(SF.Identifier("_this")).WithType(SF.ParseTypeName(this.Context.StateTypeName)));
        }

        public override void Exit()
        {
            Add(StateHelper.MakeStatePopReturnStatement());

            var methodDeclaration = SF.MethodDeclaration(SF.ParseTypeName("TxMark.Template.IValue"), _methodName)
                .AddModifiers(_modifiers.ToArray())
                .AddParameterListParameters(_parameters.ToArray())
                .WithBody(base.Block);
            _exitHandler(methodDeclaration);
        }
    }
}
