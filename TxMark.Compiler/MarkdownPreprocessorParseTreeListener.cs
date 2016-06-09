using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Antlr4.Runtime.Misc;
using System.IO;

namespace TxMark.Compiler
{
    public class MarkdownPreprocessorParseTreeListener : MarkdownPreprocessorBaseListener
    {
        private enum ContextTypes
        {
            None,
            Heading,
            List,
            UnorderedList,
            OrderedList,
            ListItem,
            Blockquote
        }
        private class Context
        {
            public ContextTypes Type { get; private set; }
            public Context Parent { get; private set; }
            public int Level { get; set; }

            private StringBuilder _content = new StringBuilder();
            public Context(ContextTypes contextType = ContextTypes.None, Context parent = null)
            {
                this.Type = contextType;
                this.Parent = parent;
                if ( parent != null)
                {
                    this.Level = parent.Level;
                }
            }
            public void Emit(string tag = null)
            {
                if ( this.Parent != null )
                {
                    if (_content.Length > 0)
                    {
                        if (tag != null)
                        {
                            Parent.Append($"<{tag}>");
                            Parent.Append(_content);
                            Parent.Append($"</{tag}>");
                        }
                        else
                        {
                            Parent.Append(_content);
                        }
                        _content.Length = 0;
                    }
                }
            }
            public void Append(string text)
            {
                _content.Append(text);
            }
            protected void Append(StringBuilder value)
            {
                _content.Append(value);
            }
            public void AppendLine()
            {
                _content.AppendLine();
            }
            public override string ToString()
            {
                return _content.ToString();
            }
        }
        private Stack<Context> _contextStack = new Stack<Context>();
        private Context _context = new Context();
        private void Push(ContextTypes contextType = ContextTypes.None)
        {
            _contextStack.Push(_context);
            _context = new Context(contextType,_context);
        }
        private void Pop(string tag = null)
        {
            _context.Emit(tag);
            
            _context = _contextStack.Pop();
        }
        private void PopAll()
        {
            while( _contextStack.Count > 0)
            {
                Pop();
            }
        }
        public override void EnterNonWhitespace([NotNull] MarkdownPreprocessorParser.NonWhitespaceContext context)
        {
            if ( context.Parent is MarkdownPreprocessorParser.TextLineContext)
            {
                _context.Append(context.GetText());
            }
        }
        public override void EnterText([NotNull] MarkdownPreprocessorParser.TextContext context)
        {
            _context.Append(context.GetText());
        }
        public override void ExitSoftCarriageReturn([NotNull] MarkdownPreprocessorParser.SoftCarriageReturnContext context)
        {
            _context.AppendLine();
        }
        public override void ExitHardCarriageReturn([NotNull] MarkdownPreprocessorParser.HardCarriageReturnContext context)
        {
            _context.Append("<br/>");
            _context.AppendLine();
        }
        public override void EnterParagraph_end([NotNull] MarkdownPreprocessorParser.Paragraph_endContext context)
        {
            _context.Emit("p");
        }

        public override void EnterDocument([NotNull] MarkdownPreprocessorParser.DocumentContext context)
        {
            Push();
        }
        public override void ExitDocument([NotNull] MarkdownPreprocessorParser.DocumentContext context)
        {
            PopAll();
        }
        public override void EnterHeading([NotNull] MarkdownPreprocessorParser.HeadingContext context)
        {
            Push(ContextTypes.Heading);
        }
        public override void ExitHeading([NotNull] MarkdownPreprocessorParser.HeadingContext context)
        {
            var level = context.headingIndicator().Count();
            Pop("h" + level);
        }

        public override void EnterList([NotNull] MarkdownPreprocessorParser.ListContext context)
        {
            Push(ContextTypes.List);
        }

        public override void ExitList([NotNull] MarkdownPreprocessorParser.ListContext context)
        {
            while(_context.Type != ContextTypes.List)
            {
                CloseList();
            }
            Pop();
        }
        private void CloseList()
        {
            string tag;
            switch (_context.Type)
            {
                case ContextTypes.ListItem:
                    tag = "li";
                    break;
                case ContextTypes.OrderedList:
                    tag = "ol";
                    break;
                case ContextTypes.UnorderedList:
                    tag = "ul";
                    break;
                default:
                    tag = null;
                    break;
            }
            Pop(tag);
        }
        private bool IsListContext(Context context)
        {
            switch( context.Type)
            {
                case ContextTypes.List:
                case ContextTypes.ListItem:
                case ContextTypes.OrderedList:
                case ContextTypes.UnorderedList:
                    return true;
                default:
                    return false;
            }
        }
        private void OpenListItem(int level, ContextTypes listType)
        {
            if ( !IsListContext(_context))
            {
                Push(ContextTypes.List);
                _context.Level = 0;
            }
            if (_context.Level < level)
            {
                while (_context.Level < level)
                {
                    Push(listType);
                    _context.Level++;
                    Push(ContextTypes.ListItem);
                }
                return;
            }
            else if (_context.Level > level)
            {
                while (_context.Level > level)
                {
                    CloseList();
                }
            }
            if ( _context.Type == ContextTypes.ListItem)
            {
                Pop("li");
            }
            if (_context.Type != listType)
            {
                CloseList();
                Push(listType);
                _context.Level = level;
            }
            Push(ContextTypes.ListItem);
        }
        public override void EnterListItem([NotNull] MarkdownPreprocessorParser.ListItemContext context)
        {
            var level = context.listItemIndicator().Count();
            var listType = context.listItemIndicator()[level - 1].GetText() == "*" ? ContextTypes.UnorderedList : ContextTypes.OrderedList;
            OpenListItem(level, listType);
        }


        public override void EnterBlockQuoteListItem([NotNull] MarkdownPreprocessorParser.BlockQuoteListItemContext context)
        {
            var level = context.listItemIndicator().Count();
            var listType = context.listItemIndicator()[level - 1].GetText() == "*" ? ContextTypes.UnorderedList : ContextTypes.OrderedList;
            OpenListItem(level, listType);
        }
        private Context FindBlockQuote()
        {
            var top = _context;
            while ( top != null && top.Type != ContextTypes.Blockquote)
            {
                top = top.Parent;
            }
            return top;
        }

        public override void EnterBlockquoteItem([NotNull] MarkdownPreprocessorParser.BlockquoteItemContext context)
        {
            var level = context.blockquoteIndicator().Count();
            var currentBlockQuote = FindBlockQuote();
            if (currentBlockQuote==null)
            {
                Push(ContextTypes.Blockquote);
                _context.Level = 1;
            }
            else
            {
                int currentLevel = currentBlockQuote.Level;
                while (currentLevel < level)
                {
                    Push(ContextTypes.Blockquote);
                    _context.Level = ++currentLevel;
                }
            }
        }
        public override void ExitBlockquote([NotNull] MarkdownPreprocessorParser.BlockquoteContext context)
        {
            while (_context.Type != ContextTypes.Blockquote)
            {
                CloseList();
            }
            while (_context.Type == ContextTypes.Blockquote)
            {
                Pop("blockquote");
            }
        }
        public override string ToString()
        {
            return _context.ToString();
        }
        public TextReader ToTextReader()
        {
            return new StringReader(_context.ToString());
        }

        public Stream ToStream(Encoding encoding)
        {
            return new MemoryStream(encoding.GetBytes(ToString()));
        }
    }
}
