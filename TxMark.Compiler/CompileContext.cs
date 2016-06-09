using Microsoft.CodeAnalysis;
using Microsoft.CodeAnalysis.CSharp;
using Microsoft.CodeAnalysis.CSharp.Formatting;
using Microsoft.CodeAnalysis.CSharp.Syntax;
using Microsoft.CodeAnalysis.Formatting;
using Microsoft.CodeAnalysis.Options;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Diagnostics;
using System.Dynamic;
using System.IO;
using System.Text;
using TxMark.Template;
using SF = Microsoft.CodeAnalysis.CSharp.SyntaxFactory;
namespace TxMark.Compiler
{
    public class CompileContext : ICompileContext
    {
        public const string DEFAULT_NAMESPACE = "TxMark.Templates";
        private Stack<ICodeContext> _codeContextStack;
        private ICodeContext _codeContext;
        private CompilationUnitSyntax _compilationUnit;
        private NamespaceDeclarationSyntax _namespace;
        private Type _templateBaseType;
        private string _stateTypeName;
        private MacroManager _macroManager;
        private NameTagManager _nameTagManager;
        private class TemplateLocation : ILocation
        {
            public int Column { get; set; }

            public string File { get; set; }

            public int Line { get; set; }

            public TemplateLocation( string templatePath )
            {
                this.File = templatePath;
                this.Line = 1;
            }
        }
        private TemplateLocation _location;
        private Bag<object> _bagsByReference;
        private HashSet<string> _usingNamespaces = new HashSet<string>();
        private LogHandler _logHandler;
        private Dictionary<string, VariableTypes> _variableTypeByName;
        private MetadataReferenceManager _metadataReferenceManager;
        public CompileContext(Type baseType, Type modelType, string templateNamespace = null, string templateName = null, string templatePath = null, LogHandler logHandler = null)
        {
            _templateBaseType = baseType;
            _location = new TemplateLocation(templatePath);
            _macroManager = new MacroManager(baseType);
            _stateTypeName = $"TxMark.Template.IState<{modelType.FullName}>";

            _nameTagManager = new NameTagManager();

            _bagsByReference = new Bag<object>();

            _variableTypeByName = new Dictionary<string, VariableTypes>();

            if (templateNamespace == null)
            {
                templateNamespace = DEFAULT_NAMESPACE;
            }
            if (templateName == null)
            {
                templateName = "Template_" + Guid.NewGuid().ToString().Replace('-', '_');
            }

            _logHandler = logHandler ?? DefaultLogHandler;
            _codeContextStack = new Stack<ICodeContext>();

            _metadataReferenceManager = new MetadataReferenceManager();

            AddNamespaceFor(typeof(string));

            AddNamespaceFor(baseType);

            AddNamespaceFor(modelType);

            AddNamespaceFor(typeof(TemplateState<object>));

            AddNamespaceFor(typeof(Dictionary<string, object>));

            _namespace = SF.NamespaceDeclaration(SF.IdentifierName(templateNamespace));

            _codeContext = new ClassContext(templateName, baseType, modelType, (classDeclaration) =>
            {
                _namespace = _namespace.AddMembers(classDeclaration);
                List<UsingDirectiveSyntax> usingDirectives = new List<UsingDirectiveSyntax>();
                foreach (var namespaceName in _usingNamespaces)
                {
                    //usingDirectives.Add(SF.UsingDirective(SF.IdentifierName(namespaceName)));
                }
                _compilationUnit = SF.CompilationUnit();
                    //.AddUsings(usingDirectives.ToArray());
                _compilationUnit = _compilationUnit.AddMembers(_namespace);
            });
        }
        public MetadataReferenceManager MetadataReferenceManager
        {
            get
            {
                return _metadataReferenceManager;
            }
        }
        public ILocation Location
        {
            get
            {
                return _location;
            }
        }
        public CompilationUnitSyntax CompilationUnit
        {
            get
            {
                return _compilationUnit;
            }
        }
        public void DefaultLogHandler(LogLevel level, string message, int line, int column)
        {
            Debug.WriteLine($"{message} @ ({line},{column})", level.ToString());
        }
        public void AddNamespace(string namespaceName)
        {
            _usingNamespaces.Add(namespaceName);
        }
        public void AddNamespaceFor(Type type)
        {
            _usingNamespaces.Add(type.Namespace);
            _metadataReferenceManager.Add(type);
        }
        public void AddNameTag(object reference, string nameTag)
        {
            _nameTagManager.AddNameTag(reference, nameTag);
        }
        public void Boolean(bool boolean)
        {
            _codeContext.Boolean(boolean);
        }
        public void Log(LogLevel level, string message, int line, int column)
        {
            _logHandler(level, message, line, column);
        }
        public void NameTag(string nameTag)
        {
            _codeContext.NameTag(nameTag);
        }
        public void NewLine()
        {
            _codeContext.NewLine();
        }
        public void Number(string numberText)
        {
            _codeContext.Number(numberText);
        }

        public void Null()
        {
            _codeContext.Null();
        }
        public void Pop()
        {
            if (_codeContext != null)
            {
                Debug.WriteLine("pop: " + _codeContext.Label);
                _codeContext.Exit();
                if (_codeContextStack.Count > 0)
                {
                    _codeContext = _codeContextStack.Pop();
                }
            }
        }
        public void PopTo(CodeContextTypes contextType)
        {
            switch(contextType)
            {
                case CodeContextTypes.Hook:
                    PopTo(typeof(MethodContext));
                    break;
                case CodeContextTypes.Document:
                    PopTo(typeof(ClassContext));
                    break;
                default:
                    throw new NotSupportedException();
            }
        }
        private void PopTo(Type contextType)
        {
            while(_codeContext != null && !contextType.IsInstanceOfType(_codeContext))
            {
                if ( _codeContext is IHtmlTagContext)
                {
                    var tagContext = _codeContext as IHtmlTagContext;
                    Log(LogLevel.Warning, $"Generating a missing </{tagContext.TagName}>", Location.Line, Location.Column);
                }
                Pop();
            }
        }
        public void PopTag(string tagName)
        {
            if (_codeContext is IHtmlTagContext)
            {
                var tagContext = _codeContext as IHtmlTagContext;
                if (tagContext.TagType == HtmlTagTypes.Open)
                {
                    if (tagContext.TagName.Equals(tagName, StringComparison.CurrentCultureIgnoreCase))
                    {
                        Debug.WriteLine("pop tag: " + tagContext.TagName);
                        Pop();
                    }
                    else
                    {
                        Log(LogLevel.Warning, $"Unexpected </{tagName}> expected </{tagContext.TagName}>. This tag will be ignored.", _location.Line, _location.Column);
                    }
                }
                else
                {
                    Log(LogLevel.Warning, $"Unexpected </{tagName}> the matching open tag was self-closing as doesn't need it's own close tag. This tag will be ignored.", _location.Line, _location.Column);
                }
            }
            else
            {
                Log(LogLevel.Warning, $"Unexpected </{tagName}>. This tag will be ignored.", _location.Line, _location.Column);
            }
        }
        public void Punctuation(char punctuation)
        {
            _codeContext.Punctuation(punctuation);
        }
        protected void Push(ICodeContext newCodeContext)
        {
            newCodeContext.Enter(this, _codeContext);
            _codeContextStack.Push(_codeContext);
            _codeContext = newCodeContext;
            Debug.WriteLine("push: " + newCodeContext.Label);
        }
        public void Push(CodeContextTypes contextType, string name = null, Bag<string> attributes = null)
        {
            var newContext = _codeContext.CreateContext(contextType, name, attributes);
            Push(newContext);
        }
        public void PushMacro(MacroDefinition macroDefinition, string hookName)
        {
            Push(CodeContextTypes.MethodCall, macroDefinition.Name, new Bag<string>().Set<MacroDefinition>("definition", macroDefinition).Set<string>("hook", hookName));
        }
        public string ResolveHookName(object reference)
        {
            return _nameTagManager.ResolveHookName(reference);
        }
        public MacroDefinition ResolveMacro(string macroName)
        {
            return _macroManager.Resolve(macroName);
        }
        public string[] ResolveNameTag(string nameTag)
        {
            return _nameTagManager.ResolveNameTag(nameTag);
        }

        public void SetLocation(int line, int column)
        {
            _location.Line = line;
            _location.Column = column;
        }
        public string StateTypeName
        {
            get
            {
                return _stateTypeName;
            }
        }
        public void Text(string text)
        {
            _codeContext.Word(text);
        }
        public override string ToString()
        {
            AdhocWorkspace adhocWorkspace = new AdhocWorkspace();
            OptionSet options = adhocWorkspace.Options;
            options = options.WithChangedOption(CSharpFormattingOptions.NewLinesForBracesInMethods, false);
            options = options.WithChangedOption(CSharpFormattingOptions.NewLinesForBracesInTypes, false);
            SyntaxNode formattedNode = Formatter.Format(_compilationUnit, adhocWorkspace, options);
            StringBuilder output = new StringBuilder();
            using (StringWriter writer = new StringWriter(output))
            {
                formattedNode.WriteTo(writer);
            }
            return output.ToString();
        }

        public Stream ToStream(Encoding encoding)
        {
            return new MemoryStream(encoding.GetBytes(ToString()));
        }
        public void Variable(string variableName)
        {
            _codeContext.Variable(variableName);
        }
        public void Word(string word)
        {
            _codeContext.Word(word);
        }
        public void Whitespace()
        {
            _codeContext.Whitespace();
        }

        public T GetAttribute<T>(object reference, string attributeName, T defaultValue = default(T))
        {
           var bag = _bagsByReference.Get<Bag<string>>(reference);
            if ( bag == null)
            {
                return defaultValue;
            }
            else
            {
                return bag.Get<T>(attributeName, defaultValue);
            }
        }

        public bool HasAttribute(object reference, string attributeName)
        {
            var bag = _bagsByReference.Get<Bag<string>>(reference);
            if (bag == null)
            {
                return false;
            }
            else
            {
                return bag.Contains(attributeName);
            }
        }

        public void SetAttribute<T>(object reference, T value)
        {
            var bag = _bagsByReference.Get<Bag<string>>(reference);
            if (bag == null)
            {
                bag = new Bag<string>();
                _bagsByReference.Set<Bag<string>>(reference, bag);
            }
        }

        public void RegisterVariable(VariableTypes variableType, string variableName)
        {
            VariableTypes originalType;
            if (_variableTypeByName.TryGetValue(variableName, out originalType) )
            {
                if ( originalType != variableType)
                {
                    Log(LogLevel.Error, $"Variable ${variableName} was already registered as a {originalType} variable",0,0);
                }
            }
            else
            {
                _variableTypeByName.Add(variableName, variableType);
            }
        }

        public bool IsStateVariable(string variableName)
        {
            VariableTypes originalType;
            if (_variableTypeByName.TryGetValue(variableName, out originalType))
            {
                return originalType == VariableTypes.State;
            }
            else
            {
                return false;
            }
        }
    }
}
