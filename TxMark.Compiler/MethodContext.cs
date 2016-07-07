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
        private bool _isOverride;
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
                _isOverride = true;
                _modifiers.Add(SF.Token(SyntaxKind.OverrideKeyword));
            }
            Add(StateHelper.MakeStatePushStatement());
        }
        public override void Enter(ICompileContext context, ICodeContext parent)
        {
            base.Enter(context, parent);

            _parameters.Add(SF.Parameter(SF.Identifier("_this")).WithType(SF.ParseTypeName("dynamic")));
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
