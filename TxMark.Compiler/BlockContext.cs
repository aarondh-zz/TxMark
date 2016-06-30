using Microsoft.CodeAnalysis;
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
    public class BlockContext : CodeContextBase
    {
        private ContentContextExitHandler<BlockSyntax> _exitHandler;
        private List<StatementSyntax> _statements = new List<StatementSyntax>();
        private StringBuilder _text = new StringBuilder();
        private SyntaxTriviaList _pragma;
        private int _insertAt = -1;
        public BlockContext(ContentContextExitHandler<BlockSyntax> exitHandler = null)
        {
            _exitHandler = exitHandler;
        }
        protected void InsertStartingAt( int insertAt)
        {
            _insertAt = insertAt;
        }
        protected void InsertAtEnd()
        {
            _insertAt = -1;
        }
        public void Add(StatementSyntax statement)
        {
            FlushTextBuffer();
            if ( _pragma.Count > 0 )
            {
                statement = statement.WithLeadingTrivia(_pragma);
                _pragma = SyntaxTriviaList.Empty;
            }
            if ( _insertAt >=0 )
            {
                _statements.Insert(_insertAt++, statement);
            }
            else
            {
                _statements.Add(statement);
            }
        }
        public BlockSyntax Block
        {
            get
            {
                return SF.Block(_statements);
            }
        }
        public override void Enter(ICompileContext context, ICodeContext parent)
        {
            base.Enter(context, parent);
            _pragma = context.MakeLinePragma();
        }
        public override void Exit()
        {
            FlushTextBuffer();
            _exitHandler?.Invoke(Block);
        }
        public override void Boolean(bool boolean)
        {
            _text.Append(boolean);
        }
        public override ICodeContext CreateContext(CodeContextTypes contextType, string name, Bag<string> attributes = null)
        {
            MacroDefinition macroDefinition;
            switch (contextType)
            {
                case CodeContextTypes.MethodCall:
                    macroDefinition = attributes?.Get<MacroDefinition>("definition");
                    return new MethodCallContext(name, (callExpression) =>
                    {
                        WriteStatement(callExpression);
                    }, attributes?.Get<string>("hook"), macroDefinition.RequiresState);
                case CodeContextTypes.If:
                    return new IfContext(name, (ifStatement) =>
                    {
                        Add(ifStatement);
                    });
                case CodeContextTypes.Choose:
                    return new ChooseContext((chooseStatement) =>
                    {
                        Add(chooseStatement);
                    });
                case CodeContextTypes.Each:
                    return new EachContext(name, (eachStatement) =>
                    {
                        Add(eachStatement);
                    });
                case CodeContextTypes.Set:
                    return new SetContext(name, (setStatement) =>
                    {
                        Add(setStatement);
                    });
                case CodeContextTypes.TagOpen:
                    return new TagOpenContext(name, null, (expression) =>
                    {
                        Add(expression);
                    }, attributes?.Get<bool>("closing")??false);
                case CodeContextTypes.TagClose:
                    return new TagCloseContext(name, null, (expression) =>
                    {
                        Add(expression);
                    });
                case CodeContextTypes.Block:
                    return new BlockContext((block) =>
                    {
                        Add(block);
                    });
            }
            return base.CreateContext(contextType, name, attributes);
        }
        public override void NameTag(string nameTag)
        {
            var hooks = this.Context.ResolveNameTag(nameTag);
            if (hooks == null)
            {
                Text($"!ERROR: ?{nameTag} was not defined.");
            }
            else
            {
                foreach (var hook in hooks)
                {
                    WriteStatement(
                        MethodCallContext.CreateMethodCall(hook,true)
                    );
                }
            }
        }
        public override void NewLine()
        {
            if (_text.Length == 0 || _text[_text.Length - 1] != '\n')
            {
                _text.AppendLine();
            }
        }
        public override void Number(string numberText)
        {
            _text.Append(numberText);
        }
        public override void Punctuation(char punctuation)
        {
            _text.Append(punctuation);
        }
        public override void Text(string text)
        {
            _text.Append(text);
        }
        public override void Variable(string variableName)
        {
            WriteStatement(
                this.Context.IsStateVariable(variableName) ?
                VariableHelper.MakeStateVariableExpression(variableName) :
                VariableHelper.MakeModelVariableExpression(variableName)
            );
        }
        public override void Whitespace()
        {
            if ( _text.Length == 0 || !char.IsWhiteSpace(_text[_text.Length-1]))
            {
                _text.Append(" ");
            }
        }
        public override void Word(string word)
        {
            _text.Append(word);
        }
        protected void WriteStatement(ExpressionSyntax argument)
        {
            Add(MakeWriteStatement(argument));
        }
        public static ExpressionSyntax MakeStateMethodCallExpression(string methodName, params ExpressionSyntax[] arguments)
        {
            return SF.InvocationExpression(
                SF.MemberAccessExpression(
                    SyntaxKind.SimpleMemberAccessExpression,
                    SF.IdentifierName("_this"),
                    SF.IdentifierName(methodName)
                ),
                SF.ArgumentList(
                    SF.SeparatedList<ArgumentSyntax>(
                        arguments.Select(argument => SF.Argument(argument))
                    )
                )
            );
        }
        public static StatementSyntax MakeStateMethodCallStatement(string methodName, params ExpressionSyntax[] arguments)
        {
            return SF.ExpressionStatement(
               MakeStateMethodCallExpression(methodName, arguments)
            );
        }
        public static StatementSyntax MakeWriteStatement(ExpressionSyntax argument)
        {
            return MakeStateMethodCallStatement("Write", argument);
        }
        protected void FlushTextBuffer()
        {
            if (_text.Length > 0)
            {
                string text = _text.ToString();
                _text.Length = 0;
                WriteStatement(
                    SF.LiteralExpression(
                        SyntaxKind.StringLiteralExpression,
                        SF.Literal(text)
                    )
                );
            }
        }

    }
}
