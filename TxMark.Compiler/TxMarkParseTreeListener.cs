using Antlr4.Runtime.Tree;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using System.Diagnostics;

namespace TxMark.Compiler
{
    public class TxMarkParseTreeListener : TxMarkParserBaseListener
    {
        private ICompileContext _compileContext;
        public TxMarkParseTreeListener(ICompileContext compileContext)
        {
            _compileContext = compileContext;
        }
        public override void EnterDocument([NotNull] TxMarkParser.DocumentContext context)
        {
            _compileContext.Push(CodeContextTypes.Method, "View");
        }

        public override void ExitDocument([NotNull] TxMarkParser.DocumentContext context)
        {
            _compileContext.PopTo(CodeContextTypes.Document);
            _compileContext.Pop();
        }
        public override void EnterQuote([NotNull] TxMarkParser.QuoteContext context)
        {
            string quote = context.DOUBLE_QUOTE_STRING().GetText();
            quote = quote.Substring(1, quote.Length - 2);
            _compileContext.Quote(quote);
        }
        public override void EnterNumber([NotNull] TxMarkParser.NumberContext context)
        {
            _compileContext.Number(context.GetText());
        }
        public override void EnterWord([NotNull] TxMarkParser.WordContext context)
        {
            if (context.Parent is TxMarkParser.PhraseContext)
            {
                _compileContext.Word(context.GetText());
            }
            else if (context.Parent is TxMarkParser.ConstantContext)
            {
                _compileContext.Quote(context.GetText());
            }
            else if (context.Parent is TxMarkParser.HtmlAttributeContext)
            {
                _compileContext.Quote(context.GetText());
            }
        }
        public override void EnterWhitespace([NotNull] TxMarkParser.WhitespaceContext context)
        {
            if (context.Parent is TxMarkParser.PhraseContext|| context.Parent is TxMarkParser.HtmlAttributeValueContentContext)
            {
                var whitespace = context.GetText();
                var newLines = whitespace.Split('\n');
                if ( newLines.Length == 1)
                {
                    _compileContext.Whitespace();
                }
                else
                {
                    for( int i=1;i<newLines.Length;i++)
                    {
                        _compileContext.NewLine();
                    }
                }
            }
            else
            {
                Debug.WriteLine($"Whitespace ignored under {context.Parent.GetType()}");
            }
        }
        public override void EnterPunctuation([NotNull] TxMarkParser.PunctuationContext context)
        {
            if (context.Parent is TxMarkParser.PhraseContext)
            {
                _compileContext.Punctuation(context.GetText()[0]);
            }
        }

        public override void EnterMacro_clause([NotNull] TxMarkParser.Macro_clauseContext context)
        {
            var macroName = context.macro().macroName().GetText();
            var macroDefinition = _compileContext.ResolveMacro(macroName);
            if (!macroDefinition.Defined)
            {
                _compileContext.Log(LogLevel.Error, $"Macro ({macroName}:) was not found.", context.Start.Line, context.Start.Column);
            }
            string hookName = null;
            if (macroDefinition.RequiresHook)
            {
                if (context.hook() == null)
                {
                    _compileContext.Log(LogLevel.Error, $"Macro ({macroName}:) requires a hook, which was not supplied.", context.Start.Line, context.Start.Column);
                }
                else
                {
                    hookName = _compileContext.ResolveHookName(context.hook());
                }
            }
            _compileContext.SetLocation(context.Start.Line, context.Start.Column);
            _compileContext.PushMacro(macroDefinition, hookName);
        }

        public override void ExitMacro_clause([NotNull] TxMarkParser.Macro_clauseContext context)
        {
            _compileContext.Pop();
        }

        public override void EnterSet_clause([NotNull] TxMarkParser.Set_clauseContext context)
        {
            _compileContext.SetLocation(context.Start.Line, context.Start.Column);
            _compileContext.Push(CodeContextTypes.Set);
        }

        public override void ExitSet_clause([NotNull] TxMarkParser.Set_clauseContext context)
        {
            _compileContext.Pop();
        }

        public override void EnterEach_clause([NotNull] TxMarkParser.Each_clauseContext context)
        {
            string hookName = null;
            if (context.hook() == null)
            {
                _compileContext.Log(LogLevel.Warning, $"Macro (each:) does nothing. Did you forget a hook?", context.Start.Line, context.Start.Column);
            }
            else
            {
                hookName = _compileContext.ResolveHookName(context.hook());
            }
            _compileContext.SetLocation(context.Start.Line, context.Start.Column);
            _compileContext.Push(CodeContextTypes.Each, hookName);
        }

        public override void ExitEach_clause([NotNull] TxMarkParser.Each_clauseContext context)
        {
            _compileContext.Pop();
        }

        public override void EnterIf_clause([NotNull] TxMarkParser.If_clauseContext context)
        {
            string hookName = null;
            if (context.hook() == null)
            {
                _compileContext.Log(LogLevel.Warning, $"Macro (if:) does nothing. Did you forget a hook?", context.Start.Line, context.Start.Column);
            }
            else
            {
                hookName = _compileContext.ResolveHookName(context.hook());
            }
            _compileContext.SetLocation(context.Start.Line, context.Start.Column);
            _compileContext.Push(CodeContextTypes.If, hookName);
        }


        public override void ExitIf_clause([NotNull] TxMarkParser.If_clauseContext context)
        {
            _compileContext.Pop();
        }

        public override void EnterElseIf_clause([NotNull] TxMarkParser.ElseIf_clauseContext context)
        {
            string hookName = null;
            if (context.hook() == null)
            {
                _compileContext.Log(LogLevel.Warning, $"Macro (elseif:) does nothing. Did you forget a hook?", context.Start.Line, context.Start.Column);
            }
            else
            {
                hookName = _compileContext.ResolveHookName(context.hook());
            }
            _compileContext.SetLocation(context.Start.Line, context.Start.Column);
            _compileContext.Push(CodeContextTypes.ElseIf, hookName);
        }

        public override void ExitElseIf_clause([NotNull] TxMarkParser.ElseIf_clauseContext context)
        {
            _compileContext.Pop();
        }

        public override void EnterElse_clause([NotNull] TxMarkParser.Else_clauseContext context)
        {
            string hookName = null;
            if (context.hook() == null)
            {
                _compileContext.Log(LogLevel.Warning, $"Macro (else:) does nothing. Did you forget a hook?", context.Start.Line, context.Start.Column);
            }
            else
            {
                hookName = _compileContext.ResolveHookName(context.hook());
            }
            _compileContext.SetLocation(context.Start.Line, context.Start.Column);
            _compileContext.Push(CodeContextTypes.Else, hookName);
        }

        public override void ExitElse_clause([NotNull] TxMarkParser.Else_clauseContext context)
        {
            _compileContext.Pop();
        }
        public override void EnterVariable([NotNull] TxMarkParser.VariableContext context)
        {
            _compileContext.SetLocation(context.Start.Line, context.Start.Column);
            var word = context.word();
            if (word == null )
            {
                _compileContext.Punctuation('$');
            }
            else
            {
                _compileContext.Variable(word.GetText());
            }
        }
        public override void EnterMacroArgument([NotNull] TxMarkParser.MacroArgumentContext context)
        {
            _compileContext.SetLocation(context.Start.Line, context.Start.Column);
            _compileContext.Push(CodeContextTypes.Argument);
        }
        public override void ExitMacroArgument([NotNull] TxMarkParser.MacroArgumentContext context)
        {
            _compileContext.Pop();
        }
        public override void EnterLeft_nametag([NotNull] TxMarkParser.Left_nametagContext context)
        {
            _compileContext.AddNameTag(context.Parent, context.word().GetText());
        }

        public override void EnterRight_nametag([NotNull] TxMarkParser.Right_nametagContext context)
        {
            _compileContext.AddNameTag(context.Parent, context.word().GetText());
        }
        public override void EnterHookName([NotNull] TxMarkParser.HookNameContext context)
        {
            _compileContext.NameTag(context.word().GetText());
        }
        public override void EnterHook([NotNull] TxMarkParser.HookContext context)
        {
            _compileContext.SetLocation(context.Start.Line, context.Start.Column);
            _compileContext.Push(CodeContextTypes.Hook, _compileContext.ResolveHookName(context.Parent));
        }

        public override void ExitHook([NotNull] TxMarkParser.HookContext context)
        {
            _compileContext.PopTo(CodeContextTypes.Hook);
            _compileContext.Pop();
        }
        public override void EnterContent([NotNull] TxMarkParser.ContentContext context)
        {
            if ( context.Parent is TxMarkParser.HtmlElementContext || context.Parent is TxMarkParser.EmphasisContext)
            {
                _compileContext.Push(CodeContextTypes.Block);
            }
        }
        public override void ExitContent([NotNull] TxMarkParser.ContentContext context)
        {
            if (context.Parent is TxMarkParser.HtmlElementContext || context.Parent is TxMarkParser.EmphasisContext)
            {
                _compileContext.Pop();
            }
        }

        public override void EnterHtmlOpenTag([NotNull] TxMarkParser.HtmlOpenTagContext context)
        {
            _compileContext.SetLocation(context.Start.Line, context.Start.Column);
            _compileContext.Push(CodeContextTypes.TagOpen, context.word().GetText(), new Bag<string>().Set<bool>("closing", context.SLASH() != null));
        }

        public override void ExitHtmlOpenTag([NotNull] TxMarkParser.HtmlOpenTagContext context)
        {
            //In this special case the CloseTagContext will pop the matching tag context via ICodeContext.PopTag() when it exits
            if ( context.SLASH() != null)
            {
                _compileContext.Pop();
            }
        }

        public override void EnterHtmlCloseTag([NotNull] TxMarkParser.HtmlCloseTagContext context)
        {
            _compileContext.SetLocation(context.Start.Line, context.Start.Column);
            _compileContext.Push(CodeContextTypes.TagClose, context.word().GetText());
        }

        public override void ExitHtmlCloseTag([NotNull] TxMarkParser.HtmlCloseTagContext context)
        {
            _compileContext.Pop();
            _compileContext.PopTag(context.word().GetText());
        }
        public override void EnterHtmlAttribute([NotNull] TxMarkParser.HtmlAttributeContext context)
        {
            _compileContext.Push(CodeContextTypes.Attribute, context.htmlAttributeName().GetText());
        }

        public override void ExitHtmlAttribute([NotNull] TxMarkParser.HtmlAttributeContext context)
        {
            _compileContext.Pop();
        }

        public override void EnterMuinuta([NotNull] TxMarkParser.MuinutaContext context)
        {
            _compileContext.Text(context.GetText());
        }

        public override void EnterConstantFalse([NotNull] TxMarkParser.ConstantFalseContext context)
        {
            _compileContext.Boolean(false);
        }

        public override void EnterConstantTrue([NotNull] TxMarkParser.ConstantTrueContext context)
        {
            _compileContext.Boolean(true);
        }

        public override void EnterConstantNull([NotNull] TxMarkParser.ConstantNullContext context)
        {
            _compileContext.Null();
        }
        public override void EnterItalics([NotNull] TxMarkParser.ItalicsContext context)
        {
            _compileContext.Push(CodeContextTypes.TagOpen, "i");
        }
        public override void ExitItalics([NotNull] TxMarkParser.ItalicsContext context)
        {
            _compileContext.Pop();
        }
        public override void EnterSuperscript([NotNull] TxMarkParser.SuperscriptContext context)
        {
            _compileContext.Push(CodeContextTypes.TagOpen, "sup");
        }
        public override void ExitSuperscript([NotNull] TxMarkParser.SuperscriptContext context)
        {
            _compileContext.Pop();
        }
        public override void EnterSingle_emphasis([NotNull] TxMarkParser.Single_emphasisContext context)
        {
            _compileContext.Push(CodeContextTypes.TagOpen, "em");
        }
        public override void ExitSingle_emphasis([NotNull] TxMarkParser.Single_emphasisContext context)
        {
            _compileContext.Pop();
        }
        public override void EnterDouble_emphasis([NotNull] TxMarkParser.Double_emphasisContext context)
        {
            _compileContext.Push(CodeContextTypes.TagOpen, "strong");
        }
        public override void ExitDouble_emphasis([NotNull] TxMarkParser.Double_emphasisContext context)
        {
            _compileContext.Pop();
        }
        public override void EnterBoldface([NotNull] TxMarkParser.BoldfaceContext context)
        {
            _compileContext.Push(CodeContextTypes.TagOpen, "b");
        }
        public override void ExitBoldface([NotNull] TxMarkParser.BoldfaceContext context)
        {
            _compileContext.Pop();
        }
        private OperatorTypes? GetOperatorType(TxMarkParser.SubequationContext context)
        {
            if (context.OPERATOR_MINUS() != null)
            {
                return OperatorTypes.Subtract;
            }
            else if (context.OPERATOR_PLUS() != null)
            {
                return OperatorTypes.Add;
            }
            else
            {
                return null;
            }
        }
        public override void EnterExpression([NotNull] TxMarkParser.ExpressionContext context)
        {
            _compileContext.Push(CodeContextTypes.Expression);

        }
        public override void ExitExpression([NotNull] TxMarkParser.ExpressionContext context)
        {
            _compileContext.Pop();
        }

        public override void EnterSigned_index_expression([NotNull] TxMarkParser.Signed_index_expressionContext context)
        {
            if ( context.OPERATOR_MINUS()!=null)
            {
                _compileContext.Push(CodeContextTypes.SignedExpression);
            }
        }

        public override void ExitSigned_index_expression([NotNull] TxMarkParser.Signed_index_expressionContext context)
        {
            if (context.OPERATOR_MINUS() != null)
            {
                _compileContext.Pop();
            }
        }

        public override void EnterSubexpression([NotNull] TxMarkParser.SubexpressionContext context)
        {
            var operatorType = GetOperatorType(context);
                _compileContext.Push(CodeContextTypes.BinaryExpression,
                    null,
                    new Bag<string>().Add<OperatorTypes>("operator",operatorType.Value)
                    );
        }

        public override void ExitSubexpression([NotNull] TxMarkParser.SubexpressionContext context)
        {
            _compileContext.Pop();
        }
        public override void EnterIndex_expression([NotNull] TxMarkParser.Index_expressionContext context)
        {
            _compileContext.Push(CodeContextTypes.Expression);
        }

        public override void EnterIndex_subexpression([NotNull] TxMarkParser.Index_subexpressionContext context)
        {
            if (context.OPERATOR_POSSESSIVE() != null)
            {
                _compileContext.Push(CodeContextTypes.IndexExpression);
            }
            else if (context.OPERATOR_OF() != null)
            {
                _compileContext.Push(CodeContextTypes.OfExpression);
            }
        }

        public override void ExitIndex_subexpression([NotNull] TxMarkParser.Index_subexpressionContext context)
        {
            _compileContext.Pop();
        }
        public override void ExitIndex_expression([NotNull] TxMarkParser.Index_expressionContext context)
        {
            _compileContext.Pop();
        }

        public override void EnterPower_expression([NotNull] TxMarkParser.Power_expressionContext context)
        {
            _compileContext.Push(CodeContextTypes.Expression);
        }

        public override void EnterPower_subexpression([NotNull] TxMarkParser.Power_subexpressionContext context)
        {
            _compileContext.Push(CodeContextTypes.BinaryExpression,
                null,
                new Bag<string>().Add<OperatorTypes>("operator", OperatorTypes.Power)
                );
        }

        public override void ExitPower_subexpression([NotNull] TxMarkParser.Power_subexpressionContext context)
        {
            _compileContext.Pop();
        }

        public override void ExitPower_expression([NotNull] TxMarkParser.Power_expressionContext context)
        {
            _compileContext.Pop();
        }

        public override void EnterOperand([NotNull] TxMarkParser.OperandContext context)
        {
            if ( context.OPEN_PARENTHESES()!=null)
            {
                _compileContext.Push(CodeContextTypes.ParenthesizedExpression);
            }
            else
            {
                _compileContext.Push(CodeContextTypes.Expression);
            }
        }
        public override void ExitOperand([NotNull] TxMarkParser.OperandContext context)
        {
            _compileContext.Pop();
        }
        private OperatorTypes? GetOperatorType(TxMarkParser.Multiply_subexpressionContext context)
        {
            if (context.OPERATOR_MULTIPLY() != null)
            {
                return OperatorTypes.Multiply;
            }
            else if (context.OPERATOR_MODULO() != null)
            {
                return OperatorTypes.Modulo;
            }
            else if (context.OPERATOR_DIVIDE() != null)
            {
                return OperatorTypes.Divide;
            }
            else
            {
                return null;
            }
        }
        public override void EnterMultiply_expression([NotNull] TxMarkParser.Multiply_expressionContext context)
        {
            _compileContext.Push(CodeContextTypes.Expression);
        }
        public override void ExitMultiply_expression([NotNull] TxMarkParser.Multiply_expressionContext context)
        {
            _compileContext.Pop();
        }
        public override void EnterMultiply_subexpression([NotNull] TxMarkParser.Multiply_subexpressionContext context)
        {
            var operatorType = GetOperatorType(context);
                _compileContext.Push(CodeContextTypes.BinaryExpression,
                    null,
                    new Bag<string>().Add<OperatorTypes>("operator", operatorType.Value)
                );
        }
        public override void ExitMultiply_subexpression([NotNull] TxMarkParser.Multiply_subexpressionContext context)
        {
            _compileContext.Pop();
        }
        private OperatorTypes? GetOperatorType(TxMarkParser.SubexpressionContext context)
        {
            var booleanOperator = context.booleanOperator();
            if (booleanOperator.OPERATOR_AND() != null)
            {
                return OperatorTypes.And;
            }
            else if (booleanOperator.OPERATOR_OR() != null)
            {
                return OperatorTypes.Or;
            }
            else if (booleanOperator.OPERATOR_GREATER_OR_EQUAL() != null)
            {
                return OperatorTypes.GreaterOrEqual;
            }
            else if (booleanOperator.OPERATOR_GREATER_THAN() != null)
            {
                return OperatorTypes.GreaterThan;
            }
            else if (booleanOperator.OPERATOR_IS() != null)
            {
                return OperatorTypes.Is;
            }
            else if (booleanOperator.OPERATOR_LESS_OR_EQUAL() != null)
            {
                return OperatorTypes.LessOrEqual;
            }
            else if (booleanOperator.OPERATOR_LESS_THAN() != null)
            {
                return OperatorTypes.LessThan;
            }
            else if (booleanOperator.OPERATOR_NOT() != null)
            {
                return OperatorTypes.IsNot;
            }
            else
            {
                return null;
            }
        }
        public override void EnterEquation([NotNull] TxMarkParser.EquationContext context)
        {
            _compileContext.Push(CodeContextTypes.Expression);

        }
        public override void ExitEquation([NotNull] TxMarkParser.EquationContext context)
        {
            _compileContext.Pop();
        }
        public override void EnterSubequation([NotNull] TxMarkParser.SubequationContext context)
        {
            var operatorType = GetOperatorType(context);
         
                _compileContext.Push(CodeContextTypes.BinaryExpression,
                    null,
                    new Bag<string>().Add<OperatorTypes>("operator", operatorType.Value)
                    );
        }

        public override void ExitSubequation([NotNull] TxMarkParser.SubequationContext context)
        {
                _compileContext.Pop();
        }
    }
}
