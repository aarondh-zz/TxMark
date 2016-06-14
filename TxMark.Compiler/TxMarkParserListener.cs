//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.5-SNAPSHOT
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from C:\Users\v-adai\Documents\Visual Studio 2015\Projects\TxMark\TxMark.Antlr\TxMarkParser.g4 by ANTLR 4.5-SNAPSHOT

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
using IParseTreeListener = Antlr4.Runtime.Tree.IParseTreeListener;
using IToken = Antlr4.Runtime.IToken;

/// <summary>
/// This interface defines a complete listener for a parse tree produced by
/// <see cref="TxMarkParser"/>.
/// </summary>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.5-SNAPSHOT")]
[System.CLSCompliant(false)]
public interface ITxMarkParserListener : IParseTreeListener {
	/// <summary>
	/// Enter a parse tree produced by the <c>boldface</c>
	/// labeled alternative in <see cref="TxMarkParser.emphasis"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterBoldface([NotNull] TxMarkParser.BoldfaceContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>boldface</c>
	/// labeled alternative in <see cref="TxMarkParser.emphasis"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitBoldface([NotNull] TxMarkParser.BoldfaceContext context);

	/// <summary>
	/// Enter a parse tree produced by the <c>deleted</c>
	/// labeled alternative in <see cref="TxMarkParser.emphasis"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterDeleted([NotNull] TxMarkParser.DeletedContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>deleted</c>
	/// labeled alternative in <see cref="TxMarkParser.emphasis"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitDeleted([NotNull] TxMarkParser.DeletedContext context);

	/// <summary>
	/// Enter a parse tree produced by the <c>superscript</c>
	/// labeled alternative in <see cref="TxMarkParser.emphasis"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterSuperscript([NotNull] TxMarkParser.SuperscriptContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>superscript</c>
	/// labeled alternative in <see cref="TxMarkParser.emphasis"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitSuperscript([NotNull] TxMarkParser.SuperscriptContext context);

	/// <summary>
	/// Enter a parse tree produced by the <c>italics</c>
	/// labeled alternative in <see cref="TxMarkParser.emphasis"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterItalics([NotNull] TxMarkParser.ItalicsContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>italics</c>
	/// labeled alternative in <see cref="TxMarkParser.emphasis"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitItalics([NotNull] TxMarkParser.ItalicsContext context);

	/// <summary>
	/// Enter a parse tree produced by the <c>double_emphasis</c>
	/// labeled alternative in <see cref="TxMarkParser.emphasis"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterDouble_emphasis([NotNull] TxMarkParser.Double_emphasisContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>double_emphasis</c>
	/// labeled alternative in <see cref="TxMarkParser.emphasis"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitDouble_emphasis([NotNull] TxMarkParser.Double_emphasisContext context);

	/// <summary>
	/// Enter a parse tree produced by the <c>single_emphasis</c>
	/// labeled alternative in <see cref="TxMarkParser.emphasis"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterSingle_emphasis([NotNull] TxMarkParser.Single_emphasisContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>single_emphasis</c>
	/// labeled alternative in <see cref="TxMarkParser.emphasis"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitSingle_emphasis([NotNull] TxMarkParser.Single_emphasisContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TxMarkParser.document"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterDocument([NotNull] TxMarkParser.DocumentContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TxMarkParser.document"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitDocument([NotNull] TxMarkParser.DocumentContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TxMarkParser.word"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterWord([NotNull] TxMarkParser.WordContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TxMarkParser.word"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitWord([NotNull] TxMarkParser.WordContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TxMarkParser.whitespace"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterWhitespace([NotNull] TxMarkParser.WhitespaceContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TxMarkParser.whitespace"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitWhitespace([NotNull] TxMarkParser.WhitespaceContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TxMarkParser.left_nametag"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterLeft_nametag([NotNull] TxMarkParser.Left_nametagContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TxMarkParser.left_nametag"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitLeft_nametag([NotNull] TxMarkParser.Left_nametagContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TxMarkParser.right_nametag"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterRight_nametag([NotNull] TxMarkParser.Right_nametagContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TxMarkParser.right_nametag"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitRight_nametag([NotNull] TxMarkParser.Right_nametagContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TxMarkParser.variable"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterVariable([NotNull] TxMarkParser.VariableContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TxMarkParser.variable"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitVariable([NotNull] TxMarkParser.VariableContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TxMarkParser.hookName"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterHookName([NotNull] TxMarkParser.HookNameContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TxMarkParser.hookName"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitHookName([NotNull] TxMarkParser.HookNameContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TxMarkParser.number"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterNumber([NotNull] TxMarkParser.NumberContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TxMarkParser.number"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitNumber([NotNull] TxMarkParser.NumberContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TxMarkParser.quote"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterQuote([NotNull] TxMarkParser.QuoteContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TxMarkParser.quote"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitQuote([NotNull] TxMarkParser.QuoteContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TxMarkParser.operand"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterOperand([NotNull] TxMarkParser.OperandContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TxMarkParser.operand"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitOperand([NotNull] TxMarkParser.OperandContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TxMarkParser.indexSuffix"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterIndexSuffix([NotNull] TxMarkParser.IndexSuffixContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TxMarkParser.indexSuffix"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitIndexSuffix([NotNull] TxMarkParser.IndexSuffixContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TxMarkParser.index_subexpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterIndex_subexpression([NotNull] TxMarkParser.Index_subexpressionContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TxMarkParser.index_subexpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitIndex_subexpression([NotNull] TxMarkParser.Index_subexpressionContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TxMarkParser.index_expression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterIndex_expression([NotNull] TxMarkParser.Index_expressionContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TxMarkParser.index_expression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitIndex_expression([NotNull] TxMarkParser.Index_expressionContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TxMarkParser.signed_index_expression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterSigned_index_expression([NotNull] TxMarkParser.Signed_index_expressionContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TxMarkParser.signed_index_expression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitSigned_index_expression([NotNull] TxMarkParser.Signed_index_expressionContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TxMarkParser.power_subexpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterPower_subexpression([NotNull] TxMarkParser.Power_subexpressionContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TxMarkParser.power_subexpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitPower_subexpression([NotNull] TxMarkParser.Power_subexpressionContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TxMarkParser.power_expression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterPower_expression([NotNull] TxMarkParser.Power_expressionContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TxMarkParser.power_expression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitPower_expression([NotNull] TxMarkParser.Power_expressionContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TxMarkParser.multiply_subexpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterMultiply_subexpression([NotNull] TxMarkParser.Multiply_subexpressionContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TxMarkParser.multiply_subexpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitMultiply_subexpression([NotNull] TxMarkParser.Multiply_subexpressionContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TxMarkParser.multiply_expression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterMultiply_expression([NotNull] TxMarkParser.Multiply_expressionContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TxMarkParser.multiply_expression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitMultiply_expression([NotNull] TxMarkParser.Multiply_expressionContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TxMarkParser.subequation"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterSubequation([NotNull] TxMarkParser.SubequationContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TxMarkParser.subequation"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitSubequation([NotNull] TxMarkParser.SubequationContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TxMarkParser.equation"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterEquation([NotNull] TxMarkParser.EquationContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TxMarkParser.equation"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitEquation([NotNull] TxMarkParser.EquationContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TxMarkParser.booleanOperator"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterBooleanOperator([NotNull] TxMarkParser.BooleanOperatorContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TxMarkParser.booleanOperator"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitBooleanOperator([NotNull] TxMarkParser.BooleanOperatorContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TxMarkParser.subexpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterSubexpression([NotNull] TxMarkParser.SubexpressionContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TxMarkParser.subexpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitSubexpression([NotNull] TxMarkParser.SubexpressionContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TxMarkParser.expression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterExpression([NotNull] TxMarkParser.ExpressionContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TxMarkParser.expression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitExpression([NotNull] TxMarkParser.ExpressionContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TxMarkParser.constantTrue"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterConstantTrue([NotNull] TxMarkParser.ConstantTrueContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TxMarkParser.constantTrue"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitConstantTrue([NotNull] TxMarkParser.ConstantTrueContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TxMarkParser.constantFalse"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterConstantFalse([NotNull] TxMarkParser.ConstantFalseContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TxMarkParser.constantFalse"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitConstantFalse([NotNull] TxMarkParser.ConstantFalseContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TxMarkParser.constantNull"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterConstantNull([NotNull] TxMarkParser.ConstantNullContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TxMarkParser.constantNull"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitConstantNull([NotNull] TxMarkParser.ConstantNullContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TxMarkParser.constant"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterConstant([NotNull] TxMarkParser.ConstantContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TxMarkParser.constant"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitConstant([NotNull] TxMarkParser.ConstantContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TxMarkParser.macroArgument"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterMacroArgument([NotNull] TxMarkParser.MacroArgumentContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TxMarkParser.macroArgument"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitMacroArgument([NotNull] TxMarkParser.MacroArgumentContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TxMarkParser.literal"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterLiteral([NotNull] TxMarkParser.LiteralContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TxMarkParser.literal"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitLiteral([NotNull] TxMarkParser.LiteralContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TxMarkParser.punctuation"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterPunctuation([NotNull] TxMarkParser.PunctuationContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TxMarkParser.punctuation"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitPunctuation([NotNull] TxMarkParser.PunctuationContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TxMarkParser.muinuta"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterMuinuta([NotNull] TxMarkParser.MuinutaContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TxMarkParser.muinuta"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitMuinuta([NotNull] TxMarkParser.MuinutaContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TxMarkParser.htmlOpenTag"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterHtmlOpenTag([NotNull] TxMarkParser.HtmlOpenTagContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TxMarkParser.htmlOpenTag"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitHtmlOpenTag([NotNull] TxMarkParser.HtmlOpenTagContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TxMarkParser.htmlCloseTag"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterHtmlCloseTag([NotNull] TxMarkParser.HtmlCloseTagContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TxMarkParser.htmlCloseTag"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitHtmlCloseTag([NotNull] TxMarkParser.HtmlCloseTagContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TxMarkParser.htmlElement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterHtmlElement([NotNull] TxMarkParser.HtmlElementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TxMarkParser.htmlElement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitHtmlElement([NotNull] TxMarkParser.HtmlElementContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TxMarkParser.emphasis"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterEmphasis([NotNull] TxMarkParser.EmphasisContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TxMarkParser.emphasis"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitEmphasis([NotNull] TxMarkParser.EmphasisContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TxMarkParser.htmlAttribute"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterHtmlAttribute([NotNull] TxMarkParser.HtmlAttributeContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TxMarkParser.htmlAttribute"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitHtmlAttribute([NotNull] TxMarkParser.HtmlAttributeContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TxMarkParser.htmlAttributeValueContent"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterHtmlAttributeValueContent([NotNull] TxMarkParser.HtmlAttributeValueContentContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TxMarkParser.htmlAttributeValueContent"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitHtmlAttributeValueContent([NotNull] TxMarkParser.HtmlAttributeValueContentContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TxMarkParser.htmlAttributeValue"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterHtmlAttributeValue([NotNull] TxMarkParser.HtmlAttributeValueContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TxMarkParser.htmlAttributeValue"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitHtmlAttributeValue([NotNull] TxMarkParser.HtmlAttributeValueContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TxMarkParser.script"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterScript([NotNull] TxMarkParser.ScriptContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TxMarkParser.script"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitScript([NotNull] TxMarkParser.ScriptContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TxMarkParser.style"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterStyle([NotNull] TxMarkParser.StyleContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TxMarkParser.style"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitStyle([NotNull] TxMarkParser.StyleContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TxMarkParser.element"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterElement([NotNull] TxMarkParser.ElementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TxMarkParser.element"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitElement([NotNull] TxMarkParser.ElementContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TxMarkParser.content"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterContent([NotNull] TxMarkParser.ContentContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TxMarkParser.content"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitContent([NotNull] TxMarkParser.ContentContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TxMarkParser.phrase"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterPhrase([NotNull] TxMarkParser.PhraseContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TxMarkParser.phrase"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitPhrase([NotNull] TxMarkParser.PhraseContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TxMarkParser.hook_clause"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterHook_clause([NotNull] TxMarkParser.Hook_clauseContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TxMarkParser.hook_clause"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitHook_clause([NotNull] TxMarkParser.Hook_clauseContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TxMarkParser.macro_clause"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterMacro_clause([NotNull] TxMarkParser.Macro_clauseContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TxMarkParser.macro_clause"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitMacro_clause([NotNull] TxMarkParser.Macro_clauseContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TxMarkParser.each_clause"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterEach_clause([NotNull] TxMarkParser.Each_clauseContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TxMarkParser.each_clause"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitEach_clause([NotNull] TxMarkParser.Each_clauseContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TxMarkParser.elseIf_clause"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterElseIf_clause([NotNull] TxMarkParser.ElseIf_clauseContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TxMarkParser.elseIf_clause"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitElseIf_clause([NotNull] TxMarkParser.ElseIf_clauseContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TxMarkParser.else_clause"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterElse_clause([NotNull] TxMarkParser.Else_clauseContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TxMarkParser.else_clause"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitElse_clause([NotNull] TxMarkParser.Else_clauseContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TxMarkParser.if_clause"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterIf_clause([NotNull] TxMarkParser.If_clauseContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TxMarkParser.if_clause"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitIf_clause([NotNull] TxMarkParser.If_clauseContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TxMarkParser.set_clause"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterSet_clause([NotNull] TxMarkParser.Set_clauseContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TxMarkParser.set_clause"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitSet_clause([NotNull] TxMarkParser.Set_clauseContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TxMarkParser.macro"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterMacro([NotNull] TxMarkParser.MacroContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TxMarkParser.macro"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitMacro([NotNull] TxMarkParser.MacroContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TxMarkParser.hook"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterHook([NotNull] TxMarkParser.HookContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TxMarkParser.hook"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitHook([NotNull] TxMarkParser.HookContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="TxMarkParser.macroName"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterMacroName([NotNull] TxMarkParser.MacroNameContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TxMarkParser.macroName"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitMacroName([NotNull] TxMarkParser.MacroNameContext context);
}
} // namespace TxMark.Compiler
