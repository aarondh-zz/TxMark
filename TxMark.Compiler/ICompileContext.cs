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
