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
    public abstract class CodeContextBase : ICodeContext
    {
        public ICompileContext Context { get; private set; }
        public ICodeContext Parent { get; private set; }

        public virtual ICodeContext CreateContext(CodeContextTypes contextType, string name, Bag<string> attributes = null)
        {
            if (this.Parent == null)
            {
                Context.Log(LogLevel.Error, $"{contextType} not supported in {Label} context", Context.Location.Line, Context.Location.Column);
                return this;
            }
            else
            {
                return this.Parent.CreateContext(contextType, name, attributes);
            }
        }
        public virtual void Enter(ICompileContext context,ICodeContext parent)
        {
            this.Context = context;
            this.Parent = parent;
        }

        public abstract void Exit();


        public virtual void Boolean(bool boolean)
        {
            Context.Log(LogLevel.Error, $"Boolean tag not supported in {Label} context", Context.Location.Line, Context.Location.Column);
        }
        public virtual string Label
        {
            get
            {
                return GetType().Name;
            }
        }
        public virtual void NameTag(string nameTag)
        {
            Context.Log(LogLevel.Error, $"Name tag not supported in {Label} context", Context.Location.Line, Context.Location.Column);
        }
        public virtual void NewLine()
        {
            Context.Log(LogLevel.Warning, $"New-line not supported in {Label} context", Context.Location.Line, Context.Location.Column);
        }
        public virtual void Number(string numberText)
        {
            Context.Log(LogLevel.Error, $"Number not supported in {Label} context", Context.Location.Line, Context.Location.Column);
        }
        public virtual void Null()
        {
            Context.Log(LogLevel.Error, $"Null not supported in {Label} context", Context.Location.Line, Context.Location.Column);
        }
        public virtual void Punctuation(char punctuation)
        {
            Context.Log(LogLevel.Error, $"Punctuation not supported in {Label} context", Context.Location.Line, Context.Location.Column);
        }
        public virtual void Text(string text)
        {
            Context.Log(LogLevel.Error, $"Text not supported in {Label} context", Context.Location.Line, Context.Location.Column);
        }
        public virtual void Variable(string name)
        {
            Context.Log(LogLevel.Error, $"Variable not supported in {Label} context", Context.Location.Line, Context.Location.Column);
        }
        public virtual void Whitespace()
        {
            Context.Log(LogLevel.Warning, $"Variable not supported in {Label} context", Context.Location.Line, Context.Location.Column);
        }
        public virtual void Word(string word)
        {
            Context.Log(LogLevel.Error, $"Word not supported in {Label} context", Context.Location.Line, Context.Location.Column);
        }
    }
}
