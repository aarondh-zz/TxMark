//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.5-SNAPSHOT
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from C:\Users\v-adai\Documents\Visual Studio 2015\Projects\TxMark\TxMark.Antlr\MarkdownPreprocessor.g4 by ANTLR 4.5-SNAPSHOT

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

namespace TxMark.Compiler {

using Antlr4.Runtime.Misc;
using IErrorNode = Antlr4.Runtime.Tree.IErrorNode;
using ITerminalNode = Antlr4.Runtime.Tree.ITerminalNode;
using IToken = Antlr4.Runtime.IToken;
using ParserRuleContext = Antlr4.Runtime.ParserRuleContext;

/// <summary>
/// This class provides an empty implementation of <see cref="IMarkdownPreprocessorListener"/>,
/// which can be extended to create a listener which only needs to handle a subset
/// of the available methods.
/// </summary>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.5-SNAPSHOT")]
[System.CLSCompliant(false)]
public partial class MarkdownPreprocessorBaseListener : IMarkdownPreprocessorListener {
	/// <summary>
	/// Enter a parse tree produced by <see cref="MarkdownPreprocessorParser.document"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterDocument([NotNull] MarkdownPreprocessorParser.DocumentContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="MarkdownPreprocessorParser.document"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitDocument([NotNull] MarkdownPreprocessorParser.DocumentContext context) { }

	/// <summary>
	/// Enter a parse tree produced by <see cref="MarkdownPreprocessorParser.content"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterContent([NotNull] MarkdownPreprocessorParser.ContentContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="MarkdownPreprocessorParser.content"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitContent([NotNull] MarkdownPreprocessorParser.ContentContext context) { }

	/// <summary>
	/// Enter a parse tree produced by <see cref="MarkdownPreprocessorParser.line"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterLine([NotNull] MarkdownPreprocessorParser.LineContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="MarkdownPreprocessorParser.line"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitLine([NotNull] MarkdownPreprocessorParser.LineContext context) { }

	/// <summary>
	/// Enter a parse tree produced by <see cref="MarkdownPreprocessorParser.list"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterList([NotNull] MarkdownPreprocessorParser.ListContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="MarkdownPreprocessorParser.list"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitList([NotNull] MarkdownPreprocessorParser.ListContext context) { }

	/// <summary>
	/// Enter a parse tree produced by <see cref="MarkdownPreprocessorParser.listItem"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterListItem([NotNull] MarkdownPreprocessorParser.ListItemContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="MarkdownPreprocessorParser.listItem"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitListItem([NotNull] MarkdownPreprocessorParser.ListItemContext context) { }

	/// <summary>
	/// Enter a parse tree produced by <see cref="MarkdownPreprocessorParser.indentedText"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterIndentedText([NotNull] MarkdownPreprocessorParser.IndentedTextContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="MarkdownPreprocessorParser.indentedText"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitIndentedText([NotNull] MarkdownPreprocessorParser.IndentedTextContext context) { }

	/// <summary>
	/// Enter a parse tree produced by <see cref="MarkdownPreprocessorParser.listItemIndicator"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterListItemIndicator([NotNull] MarkdownPreprocessorParser.ListItemIndicatorContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="MarkdownPreprocessorParser.listItemIndicator"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitListItemIndicator([NotNull] MarkdownPreprocessorParser.ListItemIndicatorContext context) { }

	/// <summary>
	/// Enter a parse tree produced by <see cref="MarkdownPreprocessorParser.blockquote"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterBlockquote([NotNull] MarkdownPreprocessorParser.BlockquoteContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="MarkdownPreprocessorParser.blockquote"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitBlockquote([NotNull] MarkdownPreprocessorParser.BlockquoteContext context) { }

	/// <summary>
	/// Enter a parse tree produced by <see cref="MarkdownPreprocessorParser.blockquoteItem"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterBlockquoteItem([NotNull] MarkdownPreprocessorParser.BlockquoteItemContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="MarkdownPreprocessorParser.blockquoteItem"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitBlockquoteItem([NotNull] MarkdownPreprocessorParser.BlockquoteItemContext context) { }

	/// <summary>
	/// Enter a parse tree produced by <see cref="MarkdownPreprocessorParser.blockQuoteElement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterBlockQuoteElement([NotNull] MarkdownPreprocessorParser.BlockQuoteElementContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="MarkdownPreprocessorParser.blockQuoteElement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitBlockQuoteElement([NotNull] MarkdownPreprocessorParser.BlockQuoteElementContext context) { }

	/// <summary>
	/// Enter a parse tree produced by <see cref="MarkdownPreprocessorParser.blockQuoteListItem"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterBlockQuoteListItem([NotNull] MarkdownPreprocessorParser.BlockQuoteListItemContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="MarkdownPreprocessorParser.blockQuoteListItem"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitBlockQuoteListItem([NotNull] MarkdownPreprocessorParser.BlockQuoteListItemContext context) { }

	/// <summary>
	/// Enter a parse tree produced by <see cref="MarkdownPreprocessorParser.blockquoteIndicator"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterBlockquoteIndicator([NotNull] MarkdownPreprocessorParser.BlockquoteIndicatorContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="MarkdownPreprocessorParser.blockquoteIndicator"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitBlockquoteIndicator([NotNull] MarkdownPreprocessorParser.BlockquoteIndicatorContext context) { }

	/// <summary>
	/// Enter a parse tree produced by <see cref="MarkdownPreprocessorParser.heading"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterHeading([NotNull] MarkdownPreprocessorParser.HeadingContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="MarkdownPreprocessorParser.heading"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitHeading([NotNull] MarkdownPreprocessorParser.HeadingContext context) { }

	/// <summary>
	/// Enter a parse tree produced by <see cref="MarkdownPreprocessorParser.headingIndicator"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterHeadingIndicator([NotNull] MarkdownPreprocessorParser.HeadingIndicatorContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="MarkdownPreprocessorParser.headingIndicator"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitHeadingIndicator([NotNull] MarkdownPreprocessorParser.HeadingIndicatorContext context) { }

	/// <summary>
	/// Enter a parse tree produced by <see cref="MarkdownPreprocessorParser.textLine"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterTextLine([NotNull] MarkdownPreprocessorParser.TextLineContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="MarkdownPreprocessorParser.textLine"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitTextLine([NotNull] MarkdownPreprocessorParser.TextLineContext context) { }

	/// <summary>
	/// Enter a parse tree produced by <see cref="MarkdownPreprocessorParser.paragraph_end"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterParagraph_end([NotNull] MarkdownPreprocessorParser.Paragraph_endContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="MarkdownPreprocessorParser.paragraph_end"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitParagraph_end([NotNull] MarkdownPreprocessorParser.Paragraph_endContext context) { }

	/// <summary>
	/// Enter a parse tree produced by <see cref="MarkdownPreprocessorParser.text"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterText([NotNull] MarkdownPreprocessorParser.TextContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="MarkdownPreprocessorParser.text"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitText([NotNull] MarkdownPreprocessorParser.TextContext context) { }

	/// <summary>
	/// Enter a parse tree produced by <see cref="MarkdownPreprocessorParser.nonWhitespace"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterNonWhitespace([NotNull] MarkdownPreprocessorParser.NonWhitespaceContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="MarkdownPreprocessorParser.nonWhitespace"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitNonWhitespace([NotNull] MarkdownPreprocessorParser.NonWhitespaceContext context) { }

	/// <summary>
	/// Enter a parse tree produced by <see cref="MarkdownPreprocessorParser.whitespace"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterWhitespace([NotNull] MarkdownPreprocessorParser.WhitespaceContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="MarkdownPreprocessorParser.whitespace"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitWhitespace([NotNull] MarkdownPreprocessorParser.WhitespaceContext context) { }

	/// <summary>
	/// Enter a parse tree produced by <see cref="MarkdownPreprocessorParser.space"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterSpace([NotNull] MarkdownPreprocessorParser.SpaceContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="MarkdownPreprocessorParser.space"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitSpace([NotNull] MarkdownPreprocessorParser.SpaceContext context) { }

	/// <summary>
	/// Enter a parse tree produced by <see cref="MarkdownPreprocessorParser.tab"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterTab([NotNull] MarkdownPreprocessorParser.TabContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="MarkdownPreprocessorParser.tab"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitTab([NotNull] MarkdownPreprocessorParser.TabContext context) { }

	/// <summary>
	/// Enter a parse tree produced by <see cref="MarkdownPreprocessorParser.carriageReturn"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterCarriageReturn([NotNull] MarkdownPreprocessorParser.CarriageReturnContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="MarkdownPreprocessorParser.carriageReturn"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitCarriageReturn([NotNull] MarkdownPreprocessorParser.CarriageReturnContext context) { }

	/// <summary>
	/// Enter a parse tree produced by <see cref="MarkdownPreprocessorParser.softCarriageReturn"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterSoftCarriageReturn([NotNull] MarkdownPreprocessorParser.SoftCarriageReturnContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="MarkdownPreprocessorParser.softCarriageReturn"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitSoftCarriageReturn([NotNull] MarkdownPreprocessorParser.SoftCarriageReturnContext context) { }

	/// <summary>
	/// Enter a parse tree produced by <see cref="MarkdownPreprocessorParser.hardCarriageReturn"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterHardCarriageReturn([NotNull] MarkdownPreprocessorParser.HardCarriageReturnContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="MarkdownPreprocessorParser.hardCarriageReturn"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitHardCarriageReturn([NotNull] MarkdownPreprocessorParser.HardCarriageReturnContext context) { }

	/// <inheritdoc/>
	/// <remarks>The default implementation does nothing.</remarks>
	public virtual void EnterEveryRule([NotNull] ParserRuleContext context) { }
	/// <inheritdoc/>
	/// <remarks>The default implementation does nothing.</remarks>
	public virtual void ExitEveryRule([NotNull] ParserRuleContext context) { }
	/// <inheritdoc/>
	/// <remarks>The default implementation does nothing.</remarks>
	public virtual void VisitTerminal([NotNull] ITerminalNode node) { }
	/// <inheritdoc/>
	/// <remarks>The default implementation does nothing.</remarks>
	public virtual void VisitErrorNode([NotNull] IErrorNode node) { }
}
} // namespace TxMark.Compiler
