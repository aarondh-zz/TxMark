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
            Context.Log(LogLevel.Error, $"Name tag ?{nameTag} not supported in {Label} context", Context.Location.Line, Context.Location.Column);
        }
        public virtual void NewLine()
        {
            Context.Log(LogLevel.Warning, $"New-line not supported in {Label} context", Context.Location.Line, Context.Location.Column);
        }
        public virtual void Number(string numberText)
        {
            Context.Log(LogLevel.Error, $"Number {numberText} not supported in {Label} context", Context.Location.Line, Context.Location.Column);
        }
        public virtual void Null()
        {
            Context.Log(LogLevel.Error, $"Null not supported in {Label} context", Context.Location.Line, Context.Location.Column);
        }
        public virtual void Punctuation(char punctuation)
        {
            Context.Log(LogLevel.Error, $"Punctuation \"{punctuation}\" not supported in {Label} context", Context.Location.Line, Context.Location.Column);
        }
        public virtual void Text(string text)
        {
            Context.Log(LogLevel.Error, $"Text \"{text}\" not supported in {Label} context", Context.Location.Line, Context.Location.Column);
        }
        public virtual void Variable(string name)
        {
            Context.Log(LogLevel.Error, $"Variable ${name} not supported in {Label} context", Context.Location.Line, Context.Location.Column);
        }
        public virtual void Whitespace()
        {
            Context.Log(LogLevel.Warning, $"Variable not supported in {Label} context", Context.Location.Line, Context.Location.Column);
        }
        public virtual void Word(string word)
        {
            Context.Log(LogLevel.Error, $"Word \"{word}\" not supported in {Label} context", Context.Location.Line, Context.Location.Column);
        }
        public virtual void Quote(string quote)
        {
            Context.Log(LogLevel.Error, $"Quote \"{quote}\" not supported in {Label} context", Context.Location.Line, Context.Location.Column);
        }
    }
}
