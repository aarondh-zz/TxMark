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
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TxMark.Compiler
{
    public interface ICompileContext : IContent
    {
        ILocation Location { get; }
        string StateTypeName { get; }
        string ModelTypeName { get; }
        void AddNamespace(string namespaceName);
        void AddNamespaceFor(Type type);
        void AddNameTag(object reference, string nameTag);
        T GetAttribute<T>(object reference, string attributeName, T defaultValue = default(T));
        bool HasAttribute(object reference, string attributeName);
        bool IsStateVariable(string variableName);
        void Log(LogLevel level, string message, int line, int column);
        string[] ResolveNameTag(string nameTag);
        void Pop();
        void PopTo(CodeContextTypes contextType);
        void PopTag(string tagName);
        void Push(CodeContextTypes contextType, string name=null, Bag<string> attributes=null);
        void PushMacro(MacroDefinition macroDefinition, string hookName);
        void RegisterVariable(VariableTypes variableType, string variableName);
        string ResolveHookName(object reference);
        MacroDefinition ResolveMacro(string macroName);
        void SetAttribute<T>(object reference, T value);
        void SetLocation(int line, int column);
    }
}
