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
                throw new NotSupportedException($"{contextType} not supported in {Label} context");
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
            throw new NotSupportedException($"Boolean not supported in {Label} context");
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
            throw new NotSupportedException($"Name tag not supported in {Label} context");
        }
        public virtual void NewLine()
        {
            throw new NotSupportedException($"New-line not supported in {Label} context");
        }
        public virtual void Number(string numberText)
        {
            throw new NotSupportedException($"Number not supported in {Label} context");
        }
        public virtual void Null()
        {
            throw new NotSupportedException($"Null not supported in {Label} context");
        }
        public virtual void Punctuation(char punctuation)
        {
            throw new NotSupportedException($"Write not supported in {Label} context");
        }
        public virtual void Text(string text)
        {
            throw new NotSupportedException($"Write not supported in {Label} context");
        }
        public virtual void Variable(string name)
        {
            throw new NotSupportedException($"Variable not supported in {Label} context");
        }
        public virtual void Whitespace()
        {
            throw new NotSupportedException($"Write not supported in {Label} context");
        }
        public virtual void Word(string word)
        {
            throw new NotSupportedException($"Write not supported in {Label} context");
        }
    }
}
