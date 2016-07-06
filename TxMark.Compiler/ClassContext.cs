/*
 *  TxMark 1.0.0.alpha-0-g0639c8a
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
using System.Linq;
using System.Text;
using SF = Microsoft.CodeAnalysis.CSharp.SyntaxFactory;

namespace TxMark.Compiler
{
    public class ClassContext : CodeContextBase
    {
        private string _className;
        private Type _baseType;
        private Type _modelType;
        private ContentContextExitHandler<ClassDeclarationSyntax> _exitHandler;
        private List<MemberDeclarationSyntax> _memberDeclarations = new List<MemberDeclarationSyntax>();
        public ClassContext(string className, Type baseType, Type modelType, ContentContextExitHandler<ClassDeclarationSyntax> exitHandler)
        {
            _className = className;
            _baseType = baseType;
            _modelType = modelType;
            _exitHandler = exitHandler;
            var modelTypeName = GetTypeName(modelType);
            var constructor = SF.ConstructorDeclaration(_className)
                .WithModifiers( SF.TokenList(SF.Token(SyntaxKind.PublicKeyword)) )
                .WithBody(SF.Block());
            _memberDeclarations.Add(constructor);
        }
        public static string GetTypeName( Type type )
        {
            string typeName;
            if (type.IsGenericType)
            {
                Type genericType = type.GetGenericTypeDefinition();
                int sep = genericType.FullName.IndexOf('`');
                var genericTypeName = type.FullName.Substring(0, sep);
                Type[] genericAguments = type.GetGenericArguments();
                typeName = $"{genericTypeName}<";
                for (int i = 0; i < genericAguments.Length; i++)
                {
                    if (i > 0)
                    {
                        typeName += ',';
                    }
                    typeName += GetTypeName(genericAguments[i]);
                }
                typeName += ">";
                return typeName;
            }
            else if ( type.FullName == "System.Object")
            {
                return "dynamic";
            }
            else
            {
                return type.FullName;
            }
        }
        public override ICodeContext CreateContext(CodeContextTypes contextType, string name, Bag<string> attributes = null)
        {
            switch (contextType)
            {
                case CodeContextTypes.Method:
                    return new MethodContext(name, (methodDeclaration) =>
                    {
                        _memberDeclarations.Add(methodDeclaration);
                    }, isOverride: name == "View");
                case CodeContextTypes.Hook:
                    return new MethodContext(name, (hookDeclaration) =>
                    {
                        _memberDeclarations.Add(hookDeclaration);
                    });
            }
            return base.CreateContext(contextType, name, attributes);
        }

        public override void Exit()
        {
            var classDeclaration = SF.ClassDeclaration(_className)
                .AddModifiers(SF.Token(SyntaxKind.PublicKeyword))
                .AddBaseListTypes(SF.SimpleBaseType(SF.ParseTypeName(GetTypeName(_baseType))))
                .AddMembers(_memberDeclarations.ToArray())
                ;
            _exitHandler(classDeclaration);
        }

    }
}
