// Generated from MarkdownPreprocessor.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MarkdownPreprocessorParser}.
 */
public interface MarkdownPreprocessorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MarkdownPreprocessorParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(MarkdownPreprocessorParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownPreprocessorParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(MarkdownPreprocessorParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownPreprocessorParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(MarkdownPreprocessorParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownPreprocessorParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(MarkdownPreprocessorParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownPreprocessorParser#carriageReturn}.
	 * @param ctx the parse tree
	 */
	void enterCarriageReturn(MarkdownPreprocessorParser.CarriageReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownPreprocessorParser#carriageReturn}.
	 * @param ctx the parse tree
	 */
	void exitCarriageReturn(MarkdownPreprocessorParser.CarriageReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownPreprocessorParser#softCarriageReturn}.
	 * @param ctx the parse tree
	 */
	void enterSoftCarriageReturn(MarkdownPreprocessorParser.SoftCarriageReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownPreprocessorParser#softCarriageReturn}.
	 * @param ctx the parse tree
	 */
	void exitSoftCarriageReturn(MarkdownPreprocessorParser.SoftCarriageReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownPreprocessorParser#hardCarriageReturn}.
	 * @param ctx the parse tree
	 */
	void enterHardCarriageReturn(MarkdownPreprocessorParser.HardCarriageReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownPreprocessorParser#hardCarriageReturn}.
	 * @param ctx the parse tree
	 */
	void exitHardCarriageReturn(MarkdownPreprocessorParser.HardCarriageReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownPreprocessorParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(MarkdownPreprocessorParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownPreprocessorParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(MarkdownPreprocessorParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownPreprocessorParser#listItem}.
	 * @param ctx the parse tree
	 */
	void enterListItem(MarkdownPreprocessorParser.ListItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownPreprocessorParser#listItem}.
	 * @param ctx the parse tree
	 */
	void exitListItem(MarkdownPreprocessorParser.ListItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownPreprocessorParser#indentedText}.
	 * @param ctx the parse tree
	 */
	void enterIndentedText(MarkdownPreprocessorParser.IndentedTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownPreprocessorParser#indentedText}.
	 * @param ctx the parse tree
	 */
	void exitIndentedText(MarkdownPreprocessorParser.IndentedTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownPreprocessorParser#listItemIndicator}.
	 * @param ctx the parse tree
	 */
	void enterListItemIndicator(MarkdownPreprocessorParser.ListItemIndicatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownPreprocessorParser#listItemIndicator}.
	 * @param ctx the parse tree
	 */
	void exitListItemIndicator(MarkdownPreprocessorParser.ListItemIndicatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownPreprocessorParser#blockquote}.
	 * @param ctx the parse tree
	 */
	void enterBlockquote(MarkdownPreprocessorParser.BlockquoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownPreprocessorParser#blockquote}.
	 * @param ctx the parse tree
	 */
	void exitBlockquote(MarkdownPreprocessorParser.BlockquoteContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownPreprocessorParser#blockquoteItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockquoteItem(MarkdownPreprocessorParser.BlockquoteItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownPreprocessorParser#blockquoteItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockquoteItem(MarkdownPreprocessorParser.BlockquoteItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownPreprocessorParser#blockQuoteElement}.
	 * @param ctx the parse tree
	 */
	void enterBlockQuoteElement(MarkdownPreprocessorParser.BlockQuoteElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownPreprocessorParser#blockQuoteElement}.
	 * @param ctx the parse tree
	 */
	void exitBlockQuoteElement(MarkdownPreprocessorParser.BlockQuoteElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownPreprocessorParser#blockQuoteListItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockQuoteListItem(MarkdownPreprocessorParser.BlockQuoteListItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownPreprocessorParser#blockQuoteListItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockQuoteListItem(MarkdownPreprocessorParser.BlockQuoteListItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownPreprocessorParser#blockquoteIndicator}.
	 * @param ctx the parse tree
	 */
	void enterBlockquoteIndicator(MarkdownPreprocessorParser.BlockquoteIndicatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownPreprocessorParser#blockquoteIndicator}.
	 * @param ctx the parse tree
	 */
	void exitBlockquoteIndicator(MarkdownPreprocessorParser.BlockquoteIndicatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownPreprocessorParser#heading}.
	 * @param ctx the parse tree
	 */
	void enterHeading(MarkdownPreprocessorParser.HeadingContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownPreprocessorParser#heading}.
	 * @param ctx the parse tree
	 */
	void exitHeading(MarkdownPreprocessorParser.HeadingContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownPreprocessorParser#headingIndicator}.
	 * @param ctx the parse tree
	 */
	void enterHeadingIndicator(MarkdownPreprocessorParser.HeadingIndicatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownPreprocessorParser#headingIndicator}.
	 * @param ctx the parse tree
	 */
	void exitHeadingIndicator(MarkdownPreprocessorParser.HeadingIndicatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownPreprocessorParser#textLine}.
	 * @param ctx the parse tree
	 */
	void enterTextLine(MarkdownPreprocessorParser.TextLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownPreprocessorParser#textLine}.
	 * @param ctx the parse tree
	 */
	void exitTextLine(MarkdownPreprocessorParser.TextLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownPreprocessorParser#paragraph_end}.
	 * @param ctx the parse tree
	 */
	void enterParagraph_end(MarkdownPreprocessorParser.Paragraph_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownPreprocessorParser#paragraph_end}.
	 * @param ctx the parse tree
	 */
	void exitParagraph_end(MarkdownPreprocessorParser.Paragraph_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownPreprocessorParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(MarkdownPreprocessorParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownPreprocessorParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(MarkdownPreprocessorParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownPreprocessorParser#safeText}.
	 * @param ctx the parse tree
	 */
	void enterSafeText(MarkdownPreprocessorParser.SafeTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownPreprocessorParser#safeText}.
	 * @param ctx the parse tree
	 */
	void exitSafeText(MarkdownPreprocessorParser.SafeTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownPreprocessorParser#attributeContent}.
	 * @param ctx the parse tree
	 */
	void enterAttributeContent(MarkdownPreprocessorParser.AttributeContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownPreprocessorParser#attributeContent}.
	 * @param ctx the parse tree
	 */
	void exitAttributeContent(MarkdownPreprocessorParser.AttributeContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownPreprocessorParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void enterAttributeValue(MarkdownPreprocessorParser.AttributeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownPreprocessorParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void exitAttributeValue(MarkdownPreprocessorParser.AttributeValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownPreprocessorParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void enterAttributeName(MarkdownPreprocessorParser.AttributeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownPreprocessorParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void exitAttributeName(MarkdownPreprocessorParser.AttributeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownPreprocessorParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(MarkdownPreprocessorParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownPreprocessorParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(MarkdownPreprocessorParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownPreprocessorParser#tag}.
	 * @param ctx the parse tree
	 */
	void enterTag(MarkdownPreprocessorParser.TagContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownPreprocessorParser#tag}.
	 * @param ctx the parse tree
	 */
	void exitTag(MarkdownPreprocessorParser.TagContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownPreprocessorParser#parenthesisClause}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisClause(MarkdownPreprocessorParser.ParenthesisClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownPreprocessorParser#parenthesisClause}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisClause(MarkdownPreprocessorParser.ParenthesisClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownPreprocessorParser#openTag}.
	 * @param ctx the parse tree
	 */
	void enterOpenTag(MarkdownPreprocessorParser.OpenTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownPreprocessorParser#openTag}.
	 * @param ctx the parse tree
	 */
	void exitOpenTag(MarkdownPreprocessorParser.OpenTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownPreprocessorParser#closeTag}.
	 * @param ctx the parse tree
	 */
	void enterCloseTag(MarkdownPreprocessorParser.CloseTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownPreprocessorParser#closeTag}.
	 * @param ctx the parse tree
	 */
	void exitCloseTag(MarkdownPreprocessorParser.CloseTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownPreprocessorParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(MarkdownPreprocessorParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownPreprocessorParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(MarkdownPreprocessorParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownPreprocessorParser#whitespace}.
	 * @param ctx the parse tree
	 */
	void enterWhitespace(MarkdownPreprocessorParser.WhitespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownPreprocessorParser#whitespace}.
	 * @param ctx the parse tree
	 */
	void exitWhitespace(MarkdownPreprocessorParser.WhitespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownPreprocessorParser#space}.
	 * @param ctx the parse tree
	 */
	void enterSpace(MarkdownPreprocessorParser.SpaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownPreprocessorParser#space}.
	 * @param ctx the parse tree
	 */
	void exitSpace(MarkdownPreprocessorParser.SpaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownPreprocessorParser#tab}.
	 * @param ctx the parse tree
	 */
	void enterTab(MarkdownPreprocessorParser.TabContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownPreprocessorParser#tab}.
	 * @param ctx the parse tree
	 */
	void exitTab(MarkdownPreprocessorParser.TabContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownPreprocessorParser#anyNonWhitespace}.
	 * @param ctx the parse tree
	 */
	void enterAnyNonWhitespace(MarkdownPreprocessorParser.AnyNonWhitespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownPreprocessorParser#anyNonWhitespace}.
	 * @param ctx the parse tree
	 */
	void exitAnyNonWhitespace(MarkdownPreprocessorParser.AnyNonWhitespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownPreprocessorParser#nonWhitespace}.
	 * @param ctx the parse tree
	 */
	void enterNonWhitespace(MarkdownPreprocessorParser.NonWhitespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownPreprocessorParser#nonWhitespace}.
	 * @param ctx the parse tree
	 */
	void exitNonWhitespace(MarkdownPreprocessorParser.NonWhitespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownPreprocessorParser#anyWhitespace}.
	 * @param ctx the parse tree
	 */
	void enterAnyWhitespace(MarkdownPreprocessorParser.AnyWhitespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownPreprocessorParser#anyWhitespace}.
	 * @param ctx the parse tree
	 */
	void exitAnyWhitespace(MarkdownPreprocessorParser.AnyWhitespaceContext ctx);
}