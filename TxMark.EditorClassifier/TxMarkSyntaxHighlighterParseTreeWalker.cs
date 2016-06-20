using Microsoft.VisualStudio.Text.Tagging;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using TxMark.Compiler;
using Antlr4.Runtime.Misc;
using System.Windows.Media;
using Antlr4.Runtime;
using Microsoft.VisualStudio.Text;

namespace TxMark.EditorClassifier
{
    public class TxMarkSyntaxHighlighterParseTreeWalker : TxMarkParserBaseListener
    {
        private ITextSnapshot _textSnapshot;
        private List<ITagSpan<TextMarkerTag>> _tags;
        public IEnumerable<ITagSpan<TextMarkerTag>> Tags
        {
            get
            {
                return _tags;
            }
        }
        public TxMarkSyntaxHighlighterParseTreeWalker(ITextSnapshot textSnapshot )
        {
            _textSnapshot = textSnapshot;
            _tags = new List<ITagSpan<TextMarkerTag>>();
        }
        private void AddTag(IToken token, TextMarkerTag tag)
        {
            AddTag(token.StartIndex, token.StopIndex, tag);
        }
        private void AddTag(int startIndex, int stopIndex, TextMarkerTag tag)
        {
            _tags.Add(new TagSpan<TextMarkerTag>(new SnapshotSpan(_textSnapshot, new Span(startIndex, stopIndex - startIndex + 1)), tag));
        }
        public override void EnterMacro([NotNull] TxMarkParser.MacroContext context)
        {
            AddTag(context.MACRO_OPEN().Symbol, new TxMarkPunctuationTag());
            AddTag(context.macroName().MWORD().Symbol, new TxMarkKeywordTag());
            AddTag(context.MCOLON().Symbol, new TxMarkPunctuationTag());
            AddTag(context.CLOSE_PARENTHESES().Symbol, new TxMarkPunctuationTag());
        }

        public override void EnterHook([NotNull] TxMarkParser.HookContext context)
        {
            AddTag(context.OPEN_HOOK().Symbol, new TxMarkPunctuationTag());
            AddTag(context.CLOSE_HOOK().Symbol, new TxMarkPunctuationTag());
        }

        public override void EnterVariable([NotNull] TxMarkParser.VariableContext context)
        {
            var dollarSign = context.DOLLAR_SIGN() ?? context.MDOLLAR_SIGN();
            var word = context.word().WORD() ?? context.word().MWORD();
            AddTag(dollarSign.Symbol, new TxMarkPunctuationTag());
            AddTag(word.Symbol, new TxMarkKeywordTag());
        }

        public override void EnterIf_clause([NotNull] TxMarkParser.If_clauseContext context)
        {
            AddTag(context.MACRO_OPEN().Symbol, new TxMarkPunctuationTag());
            AddTag(context.KEYWORD_IF().Symbol, new TxMarkKeywordTag());
            AddTag(context.MCOLON().Symbol, new TxMarkPunctuationTag());
            AddTag(context.CLOSE_PARENTHESES().Symbol, new TxMarkPunctuationTag());
        }

        public override void EnterElseIf_clause([NotNull] TxMarkParser.ElseIf_clauseContext context)
        {
            AddTag(context.MACRO_OPEN().Symbol, new TxMarkPunctuationTag());
            AddTag(context.KEYWORD_ELSEIF().Symbol, new TxMarkKeywordTag());
            AddTag(context.MCOLON().Symbol, new TxMarkPunctuationTag());
        }

        public override void EnterElse_clause([NotNull] TxMarkParser.Else_clauseContext context)
        {
            AddTag(context.MACRO_OPEN().Symbol, new TxMarkPunctuationTag());
            AddTag(context.KEYWORD_ELSE().Symbol, new TxMarkKeywordTag());
            AddTag(context.MCOLON().Symbol, new TxMarkPunctuationTag());
        }

        public override void EnterSet_clause([NotNull] TxMarkParser.Set_clauseContext context)
        {
            AddTag(context.MACRO_OPEN().Symbol, new TxMarkPunctuationTag());
            AddTag(context.KEYWORD_SET().Symbol, new TxMarkKeywordTag());
            AddTag(context.MCOLON().Symbol, new TxMarkPunctuationTag());
        }

        public override void EnterHtmlOpenTag([NotNull] TxMarkParser.HtmlOpenTagContext context)
        {
            AddTag(context.LESS_THAN().Symbol, new TxMarkPunctuationTag());
            if (context.SLASH() != null)
            {
                AddTag(context.SLASH().Symbol, new TxMarkPunctuationTag());
            }
            AddTag(context.word().WORD().Symbol, new TxMarkKeywordTag());
            AddTag(context.GREATER_THAN().Symbol, new TxMarkPunctuationTag());
        }

        public override void EnterHtmlCloseTag([NotNull] TxMarkParser.HtmlCloseTagContext context)
        {
            AddTag(context.LESS_THAN().Symbol, new TxMarkPunctuationTag());
            AddTag(context.SLASH().Symbol, new TxMarkPunctuationTag());
            AddTag(context.word().WORD().Symbol, new TxMarkKeywordTag());
            AddTag(context.GREATER_THAN().Symbol, new TxMarkPunctuationTag());
        }

        public override void EnterHtmlAttribute([NotNull] TxMarkParser.HtmlAttributeContext context)
        {
            AddTag(context.EQUALS().Symbol, new TxMarkPunctuationTag());
        }

        public override void EnterHtmlAttributeName([NotNull] TxMarkParser.HtmlAttributeNameContext context)
        {
            AddTag(context.word().WORD().Symbol, new TxMarkKeywordTag());
        }
        public override void EnterHtmlAttributeValue([NotNull] TxMarkParser.HtmlAttributeValueContext context)
        {
            AddTag(context.Start.StartIndex, context.Stop.StopIndex, new TxMarkStringTag());
        }
    }
}
