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
            Text,
            Heading,
            List,
            UnorderedList,
            OrderedList,
            ListItem,
            Blockquote,
            OpenTag,
            CloseTag
        }
        private class Context
        {
            public ContextTypes Type { get; private set; }
            public Context Parent { get; private set; }
            public string Tag { get; set; }
            public int Level { get; set; }

            private StringBuilder _content = new StringBuilder();
            public Context(ContextTypes contextType = ContextTypes.Text, string tag = null, Context parent = null)
            {
                this.Type = contextType;
                this.Tag = tag;
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
        private void Push(ContextTypes contextType = ContextTypes.Text, string tag = null)
        {
            _contextStack.Push(_context);
            _context = new Context(contextType,tag, _context);
        }
        private void Pop(string tag = null)
        {
            _context.Emit(tag);

            _context = _contextStack.Pop();
        }
        private bool IsContext(ContextTypes contextType, string tag = null)
        {
            return _context.Type == contextType && string.Equals(_context.Tag, tag, StringComparison.InvariantCultureIgnoreCase);
        }
        private void PopTo(ContextTypes contextType, string tag = null)
        {
            while(_contextStack.Count > 0 && !IsContext(contextType, tag))
            {
                Pop();
            }
            if (IsContext(contextType, tag))
            {
                Pop();//pop the actual open tag context
            }
        }
        private void PopAll()
        {
            while( _contextStack.Count > 0)
            {
                Pop();
            }
        }
        public override void EnterWhitespace([NotNull] MarkdownPreprocessorParser.WhitespaceContext context)
        {
            if (context.Parent is MarkdownPreprocessorParser.TextLineContext || context.Parent is MarkdownPreprocessorParser.TextContext)
            {
                _context.Append(context.GetText());
            }
        }
        public override void EnterText([NotNull] MarkdownPreprocessorParser.TextContext context)
        {
            if ( context.openTag() == null && context.closeTag() == null)
            {
                _context.Append(context.GetText());
            }
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
                    Push(listType, listType == ContextTypes.UnorderedList ? "ul" : "ol");
                    _context.Level++;
                    Push(ContextTypes.ListItem,"li");
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
                Push(listType, listType== ContextTypes.UnorderedList?"ul":"ol");
                _context.Level = level;
            }
            Push(ContextTypes.ListItem,"li");
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
                Push(ContextTypes.Blockquote,"blockquote");
                _context.Level = 1;
            }
            else
            {
                int currentLevel = currentBlockQuote.Level;
                while (currentLevel < level)
                {
                    Push(ContextTypes.Blockquote, "blockquote");
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

        public override void EnterOpenTag([NotNull] MarkdownPreprocessorParser.OpenTagContext context)
        {
            Push(ContextTypes.OpenTag, context.tag().GetText());
            _context.Append(context.GetText());
            Push(ContextTypes.Text);
        }
        public override void ExitOpenTag([NotNull] MarkdownPreprocessorParser.OpenTagContext context)
        {
        }

        public override void EnterCloseTag([NotNull] MarkdownPreprocessorParser.CloseTagContext context)
        {
            Push(ContextTypes.CloseTag, context.tag().GetText());
            _context.Append(context.GetText());
        }

        public override void ExitCloseTag([NotNull] MarkdownPreprocessorParser.CloseTagContext context)
        {
            var tag = _context.Tag;
            Pop();
            PopTo(ContextTypes.OpenTag, tag);
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
