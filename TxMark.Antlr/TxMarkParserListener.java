// Generated from TxMarkParser.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TxMarkParser}.
 */
public interface TxMarkParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(TxMarkParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(TxMarkParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#whitespace}.
	 * @param ctx the parse tree
	 */
	void enterWhitespace(TxMarkParser.WhitespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#whitespace}.
	 * @param ctx the parse tree
	 */
	void exitWhitespace(TxMarkParser.WhitespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#left_nametag}.
	 * @param ctx the parse tree
	 */
	void enterLeft_nametag(TxMarkParser.Left_nametagContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#left_nametag}.
	 * @param ctx the parse tree
	 */
	void exitLeft_nametag(TxMarkParser.Left_nametagContext ctx);
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#right_nametag}.
	 * @param ctx the parse tree
	 */
	void enterRight_nametag(TxMarkParser.Right_nametagContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#right_nametag}.
	 * @param ctx the parse tree
	 */
	void exitRight_nametag(TxMarkParser.Right_nametagContext ctx);
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(TxMarkParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(TxMarkParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#hookName}.
	 * @param ctx the parse tree
	 */
	void enterHookName(TxMarkParser.HookNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#hookName}.
	 * @param ctx the parse tree
	 */
	void exitHookName(TxMarkParser.HookNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(TxMarkParser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(TxMarkParser.WordContext ctx);
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(TxMarkParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(TxMarkParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#quote}.
	 * @param ctx the parse tree
	 */
	void enterQuote(TxMarkParser.QuoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#quote}.
	 * @param ctx the parse tree
	 */
	void exitQuote(TxMarkParser.QuoteContext ctx);
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(TxMarkParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(TxMarkParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#indexSuffix}.
	 * @param ctx the parse tree
	 */
	void enterIndexSuffix(TxMarkParser.IndexSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#indexSuffix}.
	 * @param ctx the parse tree
	 */
	void exitIndexSuffix(TxMarkParser.IndexSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#indexOperand}.
	 * @param ctx the parse tree
	 */
	void enterIndexOperand(TxMarkParser.IndexOperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#indexOperand}.
	 * @param ctx the parse tree
	 */
	void exitIndexOperand(TxMarkParser.IndexOperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#indexOf_subexpression}.
	 * @param ctx the parse tree
	 */
	void enterIndexOf_subexpression(TxMarkParser.IndexOf_subexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#indexOf_subexpression}.
	 * @param ctx the parse tree
	 */
	void exitIndexOf_subexpression(TxMarkParser.IndexOf_subexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#index_subexpression}.
	 * @param ctx the parse tree
	 */
	void enterIndex_subexpression(TxMarkParser.Index_subexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#index_subexpression}.
	 * @param ctx the parse tree
	 */
	void exitIndex_subexpression(TxMarkParser.Index_subexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#index_expression}.
	 * @param ctx the parse tree
	 */
	void enterIndex_expression(TxMarkParser.Index_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#index_expression}.
	 * @param ctx the parse tree
	 */
	void exitIndex_expression(TxMarkParser.Index_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#signed_index_expression}.
	 * @param ctx the parse tree
	 */
	void enterSigned_index_expression(TxMarkParser.Signed_index_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#signed_index_expression}.
	 * @param ctx the parse tree
	 */
	void exitSigned_index_expression(TxMarkParser.Signed_index_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#booleanOperator}.
	 * @param ctx the parse tree
	 */
	void enterBooleanOperator(TxMarkParser.BooleanOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#booleanOperator}.
	 * @param ctx the parse tree
	 */
	void exitBooleanOperator(TxMarkParser.BooleanOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#subexpression}.
	 * @param ctx the parse tree
	 */
	void enterSubexpression(TxMarkParser.SubexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#subexpression}.
	 * @param ctx the parse tree
	 */
	void exitSubexpression(TxMarkParser.SubexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(TxMarkParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(TxMarkParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#constantTrue}.
	 * @param ctx the parse tree
	 */
	void enterConstantTrue(TxMarkParser.ConstantTrueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#constantTrue}.
	 * @param ctx the parse tree
	 */
	void exitConstantTrue(TxMarkParser.ConstantTrueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#constantFalse}.
	 * @param ctx the parse tree
	 */
	void enterConstantFalse(TxMarkParser.ConstantFalseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#constantFalse}.
	 * @param ctx the parse tree
	 */
	void exitConstantFalse(TxMarkParser.ConstantFalseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#constantNull}.
	 * @param ctx the parse tree
	 */
	void enterConstantNull(TxMarkParser.ConstantNullContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#constantNull}.
	 * @param ctx the parse tree
	 */
	void exitConstantNull(TxMarkParser.ConstantNullContext ctx);
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(TxMarkParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(TxMarkParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#macroArgument}.
	 * @param ctx the parse tree
	 */
	void enterMacroArgument(TxMarkParser.MacroArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#macroArgument}.
	 * @param ctx the parse tree
	 */
	void exitMacroArgument(TxMarkParser.MacroArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(TxMarkParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(TxMarkParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#punctuation}.
	 * @param ctx the parse tree
	 */
	void enterPunctuation(TxMarkParser.PunctuationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#punctuation}.
	 * @param ctx the parse tree
	 */
	void exitPunctuation(TxMarkParser.PunctuationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#htmlOpenTag}.
	 * @param ctx the parse tree
	 */
	void enterHtmlOpenTag(TxMarkParser.HtmlOpenTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#htmlOpenTag}.
	 * @param ctx the parse tree
	 */
	void exitHtmlOpenTag(TxMarkParser.HtmlOpenTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#htmlCloseTag}.
	 * @param ctx the parse tree
	 */
	void enterHtmlCloseTag(TxMarkParser.HtmlCloseTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#htmlCloseTag}.
	 * @param ctx the parse tree
	 */
	void exitHtmlCloseTag(TxMarkParser.HtmlCloseTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(TxMarkParser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(TxMarkParser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single_emphasis}
	 * labeled alternative in {@link TxMarkParser#emphasis}.
	 * @param ctx the parse tree
	 */
	void enterSingle_emphasis(TxMarkParser.Single_emphasisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code single_emphasis}
	 * labeled alternative in {@link TxMarkParser#emphasis}.
	 * @param ctx the parse tree
	 */
	void exitSingle_emphasis(TxMarkParser.Single_emphasisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code double_emphasis}
	 * labeled alternative in {@link TxMarkParser#emphasis}.
	 * @param ctx the parse tree
	 */
	void enterDouble_emphasis(TxMarkParser.Double_emphasisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code double_emphasis}
	 * labeled alternative in {@link TxMarkParser#emphasis}.
	 * @param ctx the parse tree
	 */
	void exitDouble_emphasis(TxMarkParser.Double_emphasisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boldface}
	 * labeled alternative in {@link TxMarkParser#emphasis}.
	 * @param ctx the parse tree
	 */
	void enterBoldface(TxMarkParser.BoldfaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boldface}
	 * labeled alternative in {@link TxMarkParser#emphasis}.
	 * @param ctx the parse tree
	 */
	void exitBoldface(TxMarkParser.BoldfaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code italics}
	 * labeled alternative in {@link TxMarkParser#emphasis}.
	 * @param ctx the parse tree
	 */
	void enterItalics(TxMarkParser.ItalicsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code italics}
	 * labeled alternative in {@link TxMarkParser#emphasis}.
	 * @param ctx the parse tree
	 */
	void exitItalics(TxMarkParser.ItalicsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code deleted}
	 * labeled alternative in {@link TxMarkParser#emphasis}.
	 * @param ctx the parse tree
	 */
	void enterDeleted(TxMarkParser.DeletedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code deleted}
	 * labeled alternative in {@link TxMarkParser#emphasis}.
	 * @param ctx the parse tree
	 */
	void exitDeleted(TxMarkParser.DeletedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code superscript}
	 * labeled alternative in {@link TxMarkParser#emphasis}.
	 * @param ctx the parse tree
	 */
	void enterSuperscript(TxMarkParser.SuperscriptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code superscript}
	 * labeled alternative in {@link TxMarkParser#emphasis}.
	 * @param ctx the parse tree
	 */
	void exitSuperscript(TxMarkParser.SuperscriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#muinuta}.
	 * @param ctx the parse tree
	 */
	void enterMuinuta(TxMarkParser.MuinutaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#muinuta}.
	 * @param ctx the parse tree
	 */
	void exitMuinuta(TxMarkParser.MuinutaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#htmlAttributeName}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttributeName(TxMarkParser.HtmlAttributeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#htmlAttributeName}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttributeName(TxMarkParser.HtmlAttributeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttribute(TxMarkParser.HtmlAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttribute(TxMarkParser.HtmlAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#htmlAttributeValueContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttributeValueContent(TxMarkParser.HtmlAttributeValueContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#htmlAttributeValueContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttributeValueContent(TxMarkParser.HtmlAttributeValueContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#htmlAttributeValue}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttributeValue(TxMarkParser.HtmlAttributeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#htmlAttributeValue}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttributeValue(TxMarkParser.HtmlAttributeValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(TxMarkParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(TxMarkParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#style}.
	 * @param ctx the parse tree
	 */
	void enterStyle(TxMarkParser.StyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#style}.
	 * @param ctx the parse tree
	 */
	void exitStyle(TxMarkParser.StyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(TxMarkParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(TxMarkParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(TxMarkParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(TxMarkParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#phrase}.
	 * @param ctx the parse tree
	 */
	void enterPhrase(TxMarkParser.PhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#phrase}.
	 * @param ctx the parse tree
	 */
	void exitPhrase(TxMarkParser.PhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#hook_clause}.
	 * @param ctx the parse tree
	 */
	void enterHook_clause(TxMarkParser.Hook_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#hook_clause}.
	 * @param ctx the parse tree
	 */
	void exitHook_clause(TxMarkParser.Hook_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#macro_clause}.
	 * @param ctx the parse tree
	 */
	void enterMacro_clause(TxMarkParser.Macro_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#macro_clause}.
	 * @param ctx the parse tree
	 */
	void exitMacro_clause(TxMarkParser.Macro_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#each_clause}.
	 * @param ctx the parse tree
	 */
	void enterEach_clause(TxMarkParser.Each_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#each_clause}.
	 * @param ctx the parse tree
	 */
	void exitEach_clause(TxMarkParser.Each_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#elseIf_clause}.
	 * @param ctx the parse tree
	 */
	void enterElseIf_clause(TxMarkParser.ElseIf_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#elseIf_clause}.
	 * @param ctx the parse tree
	 */
	void exitElseIf_clause(TxMarkParser.ElseIf_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#else_clause}.
	 * @param ctx the parse tree
	 */
	void enterElse_clause(TxMarkParser.Else_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#else_clause}.
	 * @param ctx the parse tree
	 */
	void exitElse_clause(TxMarkParser.Else_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#if_clause}.
	 * @param ctx the parse tree
	 */
	void enterIf_clause(TxMarkParser.If_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#if_clause}.
	 * @param ctx the parse tree
	 */
	void exitIf_clause(TxMarkParser.If_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#when_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhen_clause(TxMarkParser.When_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#when_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhen_clause(TxMarkParser.When_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#otherwise_clause}.
	 * @param ctx the parse tree
	 */
	void enterOtherwise_clause(TxMarkParser.Otherwise_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#otherwise_clause}.
	 * @param ctx the parse tree
	 */
	void exitOtherwise_clause(TxMarkParser.Otherwise_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#choose_clause}.
	 * @param ctx the parse tree
	 */
	void enterChoose_clause(TxMarkParser.Choose_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#choose_clause}.
	 * @param ctx the parse tree
	 */
	void exitChoose_clause(TxMarkParser.Choose_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#set_clause}.
	 * @param ctx the parse tree
	 */
	void enterSet_clause(TxMarkParser.Set_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#set_clause}.
	 * @param ctx the parse tree
	 */
	void exitSet_clause(TxMarkParser.Set_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#hook_definition_clause}.
	 * @param ctx the parse tree
	 */
	void enterHook_definition_clause(TxMarkParser.Hook_definition_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#hook_definition_clause}.
	 * @param ctx the parse tree
	 */
	void exitHook_definition_clause(TxMarkParser.Hook_definition_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#macro}.
	 * @param ctx the parse tree
	 */
	void enterMacro(TxMarkParser.MacroContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#macro}.
	 * @param ctx the parse tree
	 */
	void exitMacro(TxMarkParser.MacroContext ctx);
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#submacro}.
	 * @param ctx the parse tree
	 */
	void enterSubmacro(TxMarkParser.SubmacroContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#submacro}.
	 * @param ctx the parse tree
	 */
	void exitSubmacro(TxMarkParser.SubmacroContext ctx);
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#hook}.
	 * @param ctx the parse tree
	 */
	void enterHook(TxMarkParser.HookContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#hook}.
	 * @param ctx the parse tree
	 */
	void exitHook(TxMarkParser.HookContext ctx);
	/**
	 * Enter a parse tree produced by {@link TxMarkParser#macroName}.
	 * @param ctx the parse tree
	 */
	void enterMacroName(TxMarkParser.MacroNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TxMarkParser#macroName}.
	 * @param ctx the parse tree
	 */
	void exitMacroName(TxMarkParser.MacroNameContext ctx);
}