// Generated from TxMarkParser.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TxMarkParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HTML_COMMENT=1, MACRO_OPEN=2, OPEN_HOOK=3, CLOSE_HOOK=4, OPEN_SCRIPT=5, 
		OPEN_STYLE=6, LESS_THAN=7, QUESTION_MARK=8, DOLLAR_SIGN=9, VERTICAL_BAR=10, 
		COLON=11, SLASH=12, EQUALS=13, DOUBLE_QUOTE=14, SINGLE_QUOTE=15, GREATER_THAN=16, 
		ASTERISK=17, DOUBLE_SINGLE_QUOTE=18, DOUBLE_SLASH=19, DOUBLE_TILDA=20, 
		DOUBLE_CIRCUMFLEX=21, DOUBLE_ASTERISK=22, PUNCTUATION=23, LITERAL=24, 
		WORD=25, NUMBER=26, WHITESPACE=27, SYMBOL=28, MWHITESPACE=29, MCOMMA=30, 
		MCOLON=31, MNUMBER=32, MDOLLAR_SIGN=33, MQUESTION_MARK=34, KEYWORD_IF=35, 
		KEYWORD_CHOOSE=36, KEYWORD_WHEN=37, KEYWORD_OTHERWISE=38, KEYWORD_SET=39, 
		KEYWORD_HOOK=40, KEYWORD_TO=41, KEYWORD_ELSEIF=42, KEYWORD_EACH=43, KEYWORD_ELSE=44, 
		CONSTANT_TRUE=45, CONSTANT_FALSE=46, CONSTANT_NULL=47, OPERATOR_AS=48, 
		OPERATOR_ST=49, OPERATOR_RD=50, OPERATOR_ND=51, OPERATOR_TH=52, OPERATOR_LESS_THAN=53, 
		OPERATOR_GREATER_THAN=54, OPERATOR_LESS_OR_EQUAL=55, OPERATOR_GREATER_OR_EQUAL=56, 
		OPERATOR_EQUAL=57, OPERATOR_AND=58, OPERATOR_CONTAINS=59, OPERATOR_OR=60, 
		OPERATOR_IN=61, OPERATOR_LAST=62, OPERATOR_IS=63, OPERATOR_NOT=64, OPERATOR_TO=65, 
		OPERATOR_POSSESSIVE=66, OPERATOR_OF=67, OPERATOR_PLUS=68, OPERATOR_MINUS=69, 
		OPERATOR_DIVIDE=70, OPERATOR_MULTIPLY=71, OPERATOR_MODULO=72, OPERATOR_POWER=73, 
		OPEN_PARENTHESIS=74, CLOSE_PARENTHESIS=75, DOUBLE_QUOTE_STRING=76, MWORD=77, 
		SCRIPT_BODY=78, SCRIPT_SHORT_BODY=79, STYLE_BODY=80, STYLE_SHORT_BODY=81;
	public static final int
		RULE_document = 0, RULE_whitespace = 1, RULE_left_nametag = 2, RULE_right_nametag = 3, 
		RULE_variable = 4, RULE_hookName = 5, RULE_word = 6, RULE_number = 7, 
		RULE_quote = 8, RULE_operand = 9, RULE_indexSuffix = 10, RULE_indexOperand = 11, 
		RULE_indexOf_subexpression = 12, RULE_index_subexpression = 13, RULE_index_expression = 14, 
		RULE_signed_index_expression = 15, RULE_booleanOperator = 16, RULE_subexpression = 17, 
		RULE_expression = 18, RULE_constantTrue = 19, RULE_constantFalse = 20, 
		RULE_constantNull = 21, RULE_constant = 22, RULE_macroArgument = 23, RULE_literal = 24, 
		RULE_punctuation = 25, RULE_htmlOpenTag = 26, RULE_htmlCloseTag = 27, 
		RULE_htmlElement = 28, RULE_emphasis = 29, RULE_muinuta = 30, RULE_htmlAttributeName = 31, 
		RULE_htmlAttribute = 32, RULE_htmlAttributeValueContent = 33, RULE_htmlAttributeValue = 34, 
		RULE_script = 35, RULE_style = 36, RULE_element = 37, RULE_content = 38, 
		RULE_phrase = 39, RULE_hook_clause = 40, RULE_macro_clause = 41, RULE_each_clause = 42, 
		RULE_elseIf_clause = 43, RULE_else_clause = 44, RULE_if_clause = 45, RULE_when_clause = 46, 
		RULE_otherwise_clause = 47, RULE_choose_clause = 48, RULE_set_clause = 49, 
		RULE_hook_definition_clause = 50, RULE_macro = 51, RULE_submacro = 52, 
		RULE_hook = 53, RULE_macroName = 54;
	public static final String[] ruleNames = {
		"document", "whitespace", "left_nametag", "right_nametag", "variable", 
		"hookName", "word", "number", "quote", "operand", "indexSuffix", "indexOperand", 
		"indexOf_subexpression", "index_subexpression", "index_expression", "signed_index_expression", 
		"booleanOperator", "subexpression", "expression", "constantTrue", "constantFalse", 
		"constantNull", "constant", "macroArgument", "literal", "punctuation", 
		"htmlOpenTag", "htmlCloseTag", "htmlElement", "emphasis", "muinuta", "htmlAttributeName", 
		"htmlAttribute", "htmlAttributeValueContent", "htmlAttributeValue", "script", 
		"style", "element", "content", "phrase", "hook_clause", "macro_clause", 
		"each_clause", "elseIf_clause", "else_clause", "if_clause", "when_clause", 
		"otherwise_clause", "choose_clause", "set_clause", "hook_definition_clause", 
		"macro", "submacro", "hook", "macroName"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'['", "']'", null, null, null, null, null, "'|'", null, 
		null, null, "'\"'", "'''", null, null, "''''", "'//'", "'~~'", "'^^'", 
		"'**'", null, null, null, null, null, null, null, "','", null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "'<='", "'>='", 
		null, null, null, null, null, null, null, null, null, null, null, "'+'", 
		"'-'", null, null, "'%'", "'^'", null, "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "HTML_COMMENT", "MACRO_OPEN", "OPEN_HOOK", "CLOSE_HOOK", "OPEN_SCRIPT", 
		"OPEN_STYLE", "LESS_THAN", "QUESTION_MARK", "DOLLAR_SIGN", "VERTICAL_BAR", 
		"COLON", "SLASH", "EQUALS", "DOUBLE_QUOTE", "SINGLE_QUOTE", "GREATER_THAN", 
		"ASTERISK", "DOUBLE_SINGLE_QUOTE", "DOUBLE_SLASH", "DOUBLE_TILDA", "DOUBLE_CIRCUMFLEX", 
		"DOUBLE_ASTERISK", "PUNCTUATION", "LITERAL", "WORD", "NUMBER", "WHITESPACE", 
		"SYMBOL", "MWHITESPACE", "MCOMMA", "MCOLON", "MNUMBER", "MDOLLAR_SIGN", 
		"MQUESTION_MARK", "KEYWORD_IF", "KEYWORD_CHOOSE", "KEYWORD_WHEN", "KEYWORD_OTHERWISE", 
		"KEYWORD_SET", "KEYWORD_HOOK", "KEYWORD_TO", "KEYWORD_ELSEIF", "KEYWORD_EACH", 
		"KEYWORD_ELSE", "CONSTANT_TRUE", "CONSTANT_FALSE", "CONSTANT_NULL", "OPERATOR_AS", 
		"OPERATOR_ST", "OPERATOR_RD", "OPERATOR_ND", "OPERATOR_TH", "OPERATOR_LESS_THAN", 
		"OPERATOR_GREATER_THAN", "OPERATOR_LESS_OR_EQUAL", "OPERATOR_GREATER_OR_EQUAL", 
		"OPERATOR_EQUAL", "OPERATOR_AND", "OPERATOR_CONTAINS", "OPERATOR_OR", 
		"OPERATOR_IN", "OPERATOR_LAST", "OPERATOR_IS", "OPERATOR_NOT", "OPERATOR_TO", 
		"OPERATOR_POSSESSIVE", "OPERATOR_OF", "OPERATOR_PLUS", "OPERATOR_MINUS", 
		"OPERATOR_DIVIDE", "OPERATOR_MULTIPLY", "OPERATOR_MODULO", "OPERATOR_POWER", 
		"OPEN_PARENTHESIS", "CLOSE_PARENTHESIS", "DOUBLE_QUOTE_STRING", "MWORD", 
		"SCRIPT_BODY", "SCRIPT_SHORT_BODY", "STYLE_BODY", "STYLE_SHORT_BODY"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "TxMarkParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TxMarkParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DocumentContext extends ParserRuleContext {
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode EOF() { return getToken(TxMarkParser.EOF, 0); }
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitDocument(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			content();
			setState(111);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhitespaceContext extends ParserRuleContext {
		public TerminalNode WHITESPACE() { return getToken(TxMarkParser.WHITESPACE, 0); }
		public WhitespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whitespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterWhitespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitWhitespace(this);
		}
	}

	public final WhitespaceContext whitespace() throws RecognitionException {
		WhitespaceContext _localctx = new WhitespaceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_whitespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(WHITESPACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Left_nametagContext extends ParserRuleContext {
		public TerminalNode VERTICAL_BAR() { return getToken(TxMarkParser.VERTICAL_BAR, 0); }
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public TerminalNode COLON() { return getToken(TxMarkParser.COLON, 0); }
		public Left_nametagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_left_nametag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterLeft_nametag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitLeft_nametag(this);
		}
	}

	public final Left_nametagContext left_nametag() throws RecognitionException {
		Left_nametagContext _localctx = new Left_nametagContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_left_nametag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(VERTICAL_BAR);
			setState(116);
			word();
			setState(117);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Right_nametagContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(TxMarkParser.COLON, 0); }
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public TerminalNode VERTICAL_BAR() { return getToken(TxMarkParser.VERTICAL_BAR, 0); }
		public Right_nametagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right_nametag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterRight_nametag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitRight_nametag(this);
		}
	}

	public final Right_nametagContext right_nametag() throws RecognitionException {
		Right_nametagContext _localctx = new Right_nametagContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_right_nametag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(COLON);
			setState(120);
			word();
			setState(121);
			match(VERTICAL_BAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode DOLLAR_SIGN() { return getToken(TxMarkParser.DOLLAR_SIGN, 0); }
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public TerminalNode MDOLLAR_SIGN() { return getToken(TxMarkParser.MDOLLAR_SIGN, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variable);
		try {
			setState(127);
			switch (_input.LA(1)) {
			case DOLLAR_SIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(DOLLAR_SIGN);
				setState(124);
				word();
				}
				break;
			case MDOLLAR_SIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(MDOLLAR_SIGN);
				setState(126);
				word();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HookNameContext extends ParserRuleContext {
		public TerminalNode QUESTION_MARK() { return getToken(TxMarkParser.QUESTION_MARK, 0); }
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public TerminalNode MQUESTION_MARK() { return getToken(TxMarkParser.MQUESTION_MARK, 0); }
		public HookNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hookName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterHookName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitHookName(this);
		}
	}

	public final HookNameContext hookName() throws RecognitionException {
		HookNameContext _localctx = new HookNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_hookName);
		try {
			setState(133);
			switch (_input.LA(1)) {
			case QUESTION_MARK:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(QUESTION_MARK);
				setState(130);
				word();
				}
				break;
			case MQUESTION_MARK:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(MQUESTION_MARK);
				setState(132);
				word();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WordContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(TxMarkParser.WORD, 0); }
		public TerminalNode MWORD() { return getToken(TxMarkParser.MWORD, 0); }
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitWord(this);
		}
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_word);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_la = _input.LA(1);
			if ( !(_la==WORD || _la==MWORD) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(TxMarkParser.NUMBER, 0); }
		public TerminalNode MNUMBER() { return getToken(TxMarkParser.MNUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==MNUMBER) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuoteContext extends ParserRuleContext {
		public TerminalNode DOUBLE_QUOTE_STRING() { return getToken(TxMarkParser.DOUBLE_QUOTE_STRING, 0); }
		public QuoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quote; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterQuote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitQuote(this);
		}
	}

	public final QuoteContext quote() throws RecognitionException {
		QuoteContext _localctx = new QuoteContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_quote);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(DOUBLE_QUOTE_STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperandContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public HookNameContext hookName() {
			return getRuleContext(HookNameContext.class,0);
		}
		public SubmacroContext submacro() {
			return getRuleContext(SubmacroContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public TerminalNode OPEN_PARENTHESIS() { return getToken(TxMarkParser.OPEN_PARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(TxMarkParser.CLOSE_PARENTHESIS, 0); }
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitOperand(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operand);
		try {
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				hookName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				submacro();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(144);
				constant();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(145);
				word();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(146);
				match(OPEN_PARENTHESIS);
				setState(147);
				expression();
				setState(148);
				match(CLOSE_PARENTHESIS);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexSuffixContext extends ParserRuleContext {
		public TerminalNode OPERATOR_ST() { return getToken(TxMarkParser.OPERATOR_ST, 0); }
		public TerminalNode OPERATOR_ND() { return getToken(TxMarkParser.OPERATOR_ND, 0); }
		public TerminalNode OPERATOR_RD() { return getToken(TxMarkParser.OPERATOR_RD, 0); }
		public TerminalNode OPERATOR_TH() { return getToken(TxMarkParser.OPERATOR_TH, 0); }
		public IndexSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterIndexSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitIndexSuffix(this);
		}
	}

	public final IndexSuffixContext indexSuffix() throws RecognitionException {
		IndexSuffixContext _localctx = new IndexSuffixContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_indexSuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPERATOR_ST) | (1L << OPERATOR_RD) | (1L << OPERATOR_ND) | (1L << OPERATOR_TH))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexOperandContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public IndexSuffixContext indexSuffix() {
			return getRuleContext(IndexSuffixContext.class,0);
		}
		public TerminalNode OPERATOR_LAST() { return getToken(TxMarkParser.OPERATOR_LAST, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(TxMarkParser.OPEN_PARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(TxMarkParser.CLOSE_PARENTHESIS, 0); }
		public QuoteContext quote() {
			return getRuleContext(QuoteContext.class,0);
		}
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public IndexOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexOperand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterIndexOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitIndexOperand(this);
		}
	}

	public final IndexOperandContext indexOperand() throws RecognitionException {
		IndexOperandContext _localctx = new IndexOperandContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_indexOperand);
		int _la;
		try {
			setState(166);
			switch (_input.LA(1)) {
			case NUMBER:
			case MNUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				number();
				setState(155);
				indexSuffix();
				setState(157);
				_la = _input.LA(1);
				if (_la==OPERATOR_LAST) {
					{
					setState(156);
					match(OPERATOR_LAST);
					}
				}

				}
				break;
			case OPERATOR_LAST:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(OPERATOR_LAST);
				}
				break;
			case OPEN_PARENTHESIS:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				match(OPEN_PARENTHESIS);
				setState(161);
				expression();
				setState(162);
				match(CLOSE_PARENTHESIS);
				}
				break;
			case DOUBLE_QUOTE_STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(164);
				quote();
				}
				break;
			case WORD:
			case MWORD:
				enterOuterAlt(_localctx, 5);
				{
				setState(165);
				word();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexOf_subexpressionContext extends ParserRuleContext {
		public TerminalNode OPERATOR_OF() { return getToken(TxMarkParser.OPERATOR_OF, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public IndexOf_subexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexOf_subexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterIndexOf_subexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitIndexOf_subexpression(this);
		}
	}

	public final IndexOf_subexpressionContext indexOf_subexpression() throws RecognitionException {
		IndexOf_subexpressionContext _localctx = new IndexOf_subexpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_indexOf_subexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(OPERATOR_OF);
			setState(169);
			operand();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_subexpressionContext extends ParserRuleContext {
		public TerminalNode OPERATOR_POSSESSIVE() { return getToken(TxMarkParser.OPERATOR_POSSESSIVE, 0); }
		public IndexOperandContext indexOperand() {
			return getRuleContext(IndexOperandContext.class,0);
		}
		public Index_subexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_subexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterIndex_subexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitIndex_subexpression(this);
		}
	}

	public final Index_subexpressionContext index_subexpression() throws RecognitionException {
		Index_subexpressionContext _localctx = new Index_subexpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_index_subexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(OPERATOR_POSSESSIVE);
			setState(172);
			indexOperand();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_expressionContext extends ParserRuleContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public List<Index_subexpressionContext> index_subexpression() {
			return getRuleContexts(Index_subexpressionContext.class);
		}
		public Index_subexpressionContext index_subexpression(int i) {
			return getRuleContext(Index_subexpressionContext.class,i);
		}
		public IndexOperandContext indexOperand() {
			return getRuleContext(IndexOperandContext.class,0);
		}
		public TerminalNode OPERATOR_OF() { return getToken(TxMarkParser.OPERATOR_OF, 0); }
		public Index_expressionContext index_expression() {
			return getRuleContext(Index_expressionContext.class,0);
		}
		public Index_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterIndex_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitIndex_expression(this);
		}
	}

	public final Index_expressionContext index_expression() throws RecognitionException {
		Index_expressionContext _localctx = new Index_expressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_index_expression);
		int _la;
		try {
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				operand();
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPERATOR_POSSESSIVE) {
					{
					{
					setState(175);
					index_subexpression();
					}
					}
					setState(180);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				indexOperand();
				setState(182);
				match(OPERATOR_OF);
				setState(183);
				index_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signed_index_expressionContext extends ParserRuleContext {
		public Index_expressionContext index_expression() {
			return getRuleContext(Index_expressionContext.class,0);
		}
		public TerminalNode OPERATOR_MINUS() { return getToken(TxMarkParser.OPERATOR_MINUS, 0); }
		public Signed_index_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_index_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterSigned_index_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitSigned_index_expression(this);
		}
	}

	public final Signed_index_expressionContext signed_index_expression() throws RecognitionException {
		Signed_index_expressionContext _localctx = new Signed_index_expressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_signed_index_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_la = _input.LA(1);
			if (_la==OPERATOR_MINUS) {
				{
				setState(187);
				match(OPERATOR_MINUS);
				}
			}

			setState(190);
			index_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanOperatorContext extends ParserRuleContext {
		public TerminalNode OPERATOR_AND() { return getToken(TxMarkParser.OPERATOR_AND, 0); }
		public TerminalNode OPERATOR_OR() { return getToken(TxMarkParser.OPERATOR_OR, 0); }
		public TerminalNode OPERATOR_LESS_THAN() { return getToken(TxMarkParser.OPERATOR_LESS_THAN, 0); }
		public TerminalNode OPERATOR_GREATER_THAN() { return getToken(TxMarkParser.OPERATOR_GREATER_THAN, 0); }
		public TerminalNode OPERATOR_LESS_OR_EQUAL() { return getToken(TxMarkParser.OPERATOR_LESS_OR_EQUAL, 0); }
		public TerminalNode OPERATOR_GREATER_OR_EQUAL() { return getToken(TxMarkParser.OPERATOR_GREATER_OR_EQUAL, 0); }
		public TerminalNode OPERATOR_IS() { return getToken(TxMarkParser.OPERATOR_IS, 0); }
		public TerminalNode OPERATOR_NOT() { return getToken(TxMarkParser.OPERATOR_NOT, 0); }
		public TerminalNode OPERATOR_IN() { return getToken(TxMarkParser.OPERATOR_IN, 0); }
		public TerminalNode OPERATOR_CONTAINS() { return getToken(TxMarkParser.OPERATOR_CONTAINS, 0); }
		public TerminalNode OPERATOR_POWER() { return getToken(TxMarkParser.OPERATOR_POWER, 0); }
		public TerminalNode OPERATOR_MULTIPLY() { return getToken(TxMarkParser.OPERATOR_MULTIPLY, 0); }
		public TerminalNode OPERATOR_DIVIDE() { return getToken(TxMarkParser.OPERATOR_DIVIDE, 0); }
		public TerminalNode OPERATOR_MODULO() { return getToken(TxMarkParser.OPERATOR_MODULO, 0); }
		public TerminalNode OPERATOR_PLUS() { return getToken(TxMarkParser.OPERATOR_PLUS, 0); }
		public TerminalNode OPERATOR_MINUS() { return getToken(TxMarkParser.OPERATOR_MINUS, 0); }
		public BooleanOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterBooleanOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitBooleanOperator(this);
		}
	}

	public final BooleanOperatorContext booleanOperator() throws RecognitionException {
		BooleanOperatorContext _localctx = new BooleanOperatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_booleanOperator);
		try {
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(OPERATOR_AND);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				match(OPERATOR_OR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				match(OPERATOR_LESS_THAN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(195);
				match(OPERATOR_GREATER_THAN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(196);
				match(OPERATOR_LESS_OR_EQUAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(197);
				match(OPERATOR_GREATER_OR_EQUAL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(198);
				match(OPERATOR_IS);
				setState(199);
				match(OPERATOR_NOT);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(200);
				match(OPERATOR_IS);
				setState(201);
				match(OPERATOR_IN);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(202);
				match(OPERATOR_IS);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(203);
				match(OPERATOR_CONTAINS);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(204);
				match(OPERATOR_POWER);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(205);
				match(OPERATOR_MULTIPLY);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(206);
				match(OPERATOR_DIVIDE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(207);
				match(OPERATOR_MODULO);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(208);
				match(OPERATOR_PLUS);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(209);
				match(OPERATOR_MINUS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubexpressionContext extends ParserRuleContext {
		public BooleanOperatorContext booleanOperator() {
			return getRuleContext(BooleanOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SubexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterSubexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitSubexpression(this);
		}
	}

	public final SubexpressionContext subexpression() throws RecognitionException {
		SubexpressionContext _localctx = new SubexpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_subexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			booleanOperator();
			setState(213);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Signed_index_expressionContext signed_index_expression() {
			return getRuleContext(Signed_index_expressionContext.class,0);
		}
		public List<SubexpressionContext> subexpression() {
			return getRuleContexts(SubexpressionContext.class);
		}
		public SubexpressionContext subexpression(int i) {
			return getRuleContext(SubexpressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			signed_index_expression();
			setState(219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(216);
					subexpression();
					}
					} 
				}
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantTrueContext extends ParserRuleContext {
		public TerminalNode CONSTANT_TRUE() { return getToken(TxMarkParser.CONSTANT_TRUE, 0); }
		public ConstantTrueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantTrue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterConstantTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitConstantTrue(this);
		}
	}

	public final ConstantTrueContext constantTrue() throws RecognitionException {
		ConstantTrueContext _localctx = new ConstantTrueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_constantTrue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(CONSTANT_TRUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantFalseContext extends ParserRuleContext {
		public TerminalNode CONSTANT_FALSE() { return getToken(TxMarkParser.CONSTANT_FALSE, 0); }
		public ConstantFalseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantFalse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterConstantFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitConstantFalse(this);
		}
	}

	public final ConstantFalseContext constantFalse() throws RecognitionException {
		ConstantFalseContext _localctx = new ConstantFalseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_constantFalse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(CONSTANT_FALSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantNullContext extends ParserRuleContext {
		public TerminalNode CONSTANT_NULL() { return getToken(TxMarkParser.CONSTANT_NULL, 0); }
		public ConstantNullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantNull; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterConstantNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitConstantNull(this);
		}
	}

	public final ConstantNullContext constantNull() throws RecognitionException {
		ConstantNullContext _localctx = new ConstantNullContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_constantNull);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(CONSTANT_NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ConstantTrueContext constantTrue() {
			return getRuleContext(ConstantTrueContext.class,0);
		}
		public ConstantFalseContext constantFalse() {
			return getRuleContext(ConstantFalseContext.class,0);
		}
		public ConstantNullContext constantNull() {
			return getRuleContext(ConstantNullContext.class,0);
		}
		public QuoteContext quote() {
			return getRuleContext(QuoteContext.class,0);
		}
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_constant);
		try {
			setState(234);
			switch (_input.LA(1)) {
			case NUMBER:
			case MNUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				number();
				}
				break;
			case CONSTANT_TRUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				constantTrue();
				}
				break;
			case CONSTANT_FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				constantFalse();
				}
				break;
			case CONSTANT_NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(231);
				constantNull();
				}
				break;
			case DOUBLE_QUOTE_STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(232);
				quote();
				}
				break;
			case WORD:
			case MWORD:
				enterOuterAlt(_localctx, 6);
				{
				setState(233);
				word();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MacroArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MacroArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterMacroArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitMacroArgument(this);
		}
	}

	public final MacroArgumentContext macroArgument() throws RecognitionException {
		MacroArgumentContext _localctx = new MacroArgumentContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_macroArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode LITERAL() { return getToken(TxMarkParser.LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PunctuationContext extends ParserRuleContext {
		public TerminalNode PUNCTUATION() { return getToken(TxMarkParser.PUNCTUATION, 0); }
		public PunctuationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_punctuation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterPunctuation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitPunctuation(this);
		}
	}

	public final PunctuationContext punctuation() throws RecognitionException {
		PunctuationContext _localctx = new PunctuationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_punctuation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(PUNCTUATION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlOpenTagContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(TxMarkParser.LESS_THAN, 0); }
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public TerminalNode GREATER_THAN() { return getToken(TxMarkParser.GREATER_THAN, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public TerminalNode SLASH() { return getToken(TxMarkParser.SLASH, 0); }
		public HtmlOpenTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlOpenTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterHtmlOpenTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitHtmlOpenTag(this);
		}
	}

	public final HtmlOpenTagContext htmlOpenTag() throws RecognitionException {
		HtmlOpenTagContext _localctx = new HtmlOpenTagContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_htmlOpenTag);
		int _la;
		try {
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				match(LESS_THAN);
				setState(243);
				word();
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (WORD - 25)) | (1L << (WHITESPACE - 25)) | (1L << (MWORD - 25)))) != 0)) {
					{
					{
					setState(244);
					htmlAttribute();
					}
					}
					setState(249);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(250);
				match(GREATER_THAN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				match(LESS_THAN);
				setState(253);
				word();
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (WORD - 25)) | (1L << (WHITESPACE - 25)) | (1L << (MWORD - 25)))) != 0)) {
					{
					{
					setState(254);
					htmlAttribute();
					}
					}
					setState(259);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(260);
				match(SLASH);
				setState(261);
				match(GREATER_THAN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlCloseTagContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(TxMarkParser.LESS_THAN, 0); }
		public TerminalNode SLASH() { return getToken(TxMarkParser.SLASH, 0); }
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public TerminalNode GREATER_THAN() { return getToken(TxMarkParser.GREATER_THAN, 0); }
		public HtmlCloseTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlCloseTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterHtmlCloseTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitHtmlCloseTag(this);
		}
	}

	public final HtmlCloseTagContext htmlCloseTag() throws RecognitionException {
		HtmlCloseTagContext _localctx = new HtmlCloseTagContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_htmlCloseTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(LESS_THAN);
			setState(266);
			match(SLASH);
			setState(267);
			word();
			setState(268);
			match(GREATER_THAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlElementContext extends ParserRuleContext {
		public HtmlOpenTagContext htmlOpenTag() {
			return getRuleContext(HtmlOpenTagContext.class,0);
		}
		public HtmlCloseTagContext htmlCloseTag() {
			return getRuleContext(HtmlCloseTagContext.class,0);
		}
		public ScriptContext script() {
			return getRuleContext(ScriptContext.class,0);
		}
		public StyleContext style() {
			return getRuleContext(StyleContext.class,0);
		}
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitHtmlElement(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_htmlElement);
		try {
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				htmlOpenTag();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				htmlCloseTag();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
				script();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(273);
				style();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmphasisContext extends ParserRuleContext {
		public EmphasisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emphasis; }
	 
		public EmphasisContext() { }
		public void copyFrom(EmphasisContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoldfaceContext extends EmphasisContext {
		public List<TerminalNode> DOUBLE_SINGLE_QUOTE() { return getTokens(TxMarkParser.DOUBLE_SINGLE_QUOTE); }
		public TerminalNode DOUBLE_SINGLE_QUOTE(int i) {
			return getToken(TxMarkParser.DOUBLE_SINGLE_QUOTE, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public BoldfaceContext(EmphasisContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterBoldface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitBoldface(this);
		}
	}
	public static class DeletedContext extends EmphasisContext {
		public List<TerminalNode> DOUBLE_TILDA() { return getTokens(TxMarkParser.DOUBLE_TILDA); }
		public TerminalNode DOUBLE_TILDA(int i) {
			return getToken(TxMarkParser.DOUBLE_TILDA, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public DeletedContext(EmphasisContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterDeleted(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitDeleted(this);
		}
	}
	public static class SuperscriptContext extends EmphasisContext {
		public List<TerminalNode> DOUBLE_CIRCUMFLEX() { return getTokens(TxMarkParser.DOUBLE_CIRCUMFLEX); }
		public TerminalNode DOUBLE_CIRCUMFLEX(int i) {
			return getToken(TxMarkParser.DOUBLE_CIRCUMFLEX, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public SuperscriptContext(EmphasisContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterSuperscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitSuperscript(this);
		}
	}
	public static class ItalicsContext extends EmphasisContext {
		public List<TerminalNode> DOUBLE_SLASH() { return getTokens(TxMarkParser.DOUBLE_SLASH); }
		public TerminalNode DOUBLE_SLASH(int i) {
			return getToken(TxMarkParser.DOUBLE_SLASH, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public ItalicsContext(EmphasisContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterItalics(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitItalics(this);
		}
	}
	public static class Double_emphasisContext extends EmphasisContext {
		public List<TerminalNode> DOUBLE_ASTERISK() { return getTokens(TxMarkParser.DOUBLE_ASTERISK); }
		public TerminalNode DOUBLE_ASTERISK(int i) {
			return getToken(TxMarkParser.DOUBLE_ASTERISK, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public Double_emphasisContext(EmphasisContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterDouble_emphasis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitDouble_emphasis(this);
		}
	}
	public static class Single_emphasisContext extends EmphasisContext {
		public List<TerminalNode> ASTERISK() { return getTokens(TxMarkParser.ASTERISK); }
		public TerminalNode ASTERISK(int i) {
			return getToken(TxMarkParser.ASTERISK, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public Single_emphasisContext(EmphasisContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterSingle_emphasis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitSingle_emphasis(this);
		}
	}

	public final EmphasisContext emphasis() throws RecognitionException {
		EmphasisContext _localctx = new EmphasisContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_emphasis);
		try {
			setState(300);
			switch (_input.LA(1)) {
			case ASTERISK:
				_localctx = new Single_emphasisContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				match(ASTERISK);
				setState(277);
				content();
				setState(278);
				match(ASTERISK);
				}
				break;
			case DOUBLE_ASTERISK:
				_localctx = new Double_emphasisContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				match(DOUBLE_ASTERISK);
				setState(281);
				content();
				setState(282);
				match(DOUBLE_ASTERISK);
				}
				break;
			case DOUBLE_SINGLE_QUOTE:
				_localctx = new BoldfaceContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				match(DOUBLE_SINGLE_QUOTE);
				setState(285);
				content();
				setState(286);
				match(DOUBLE_SINGLE_QUOTE);
				}
				break;
			case DOUBLE_SLASH:
				_localctx = new ItalicsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(288);
				match(DOUBLE_SLASH);
				setState(289);
				content();
				setState(290);
				match(DOUBLE_SLASH);
				}
				break;
			case DOUBLE_TILDA:
				_localctx = new DeletedContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(292);
				match(DOUBLE_TILDA);
				setState(293);
				content();
				setState(294);
				match(DOUBLE_TILDA);
				}
				break;
			case DOUBLE_CIRCUMFLEX:
				_localctx = new SuperscriptContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(296);
				match(DOUBLE_CIRCUMFLEX);
				setState(297);
				content();
				setState(298);
				match(DOUBLE_CIRCUMFLEX);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MuinutaContext extends ParserRuleContext {
		public TerminalNode DOLLAR_SIGN() { return getToken(TxMarkParser.DOLLAR_SIGN, 0); }
		public TerminalNode QUESTION_MARK() { return getToken(TxMarkParser.QUESTION_MARK, 0); }
		public TerminalNode COLON() { return getToken(TxMarkParser.COLON, 0); }
		public TerminalNode SLASH() { return getToken(TxMarkParser.SLASH, 0); }
		public TerminalNode EQUALS() { return getToken(TxMarkParser.EQUALS, 0); }
		public TerminalNode LESS_THAN() { return getToken(TxMarkParser.LESS_THAN, 0); }
		public List<TerminalNode> GREATER_THAN() { return getTokens(TxMarkParser.GREATER_THAN); }
		public TerminalNode GREATER_THAN(int i) {
			return getToken(TxMarkParser.GREATER_THAN, i);
		}
		public TerminalNode VERTICAL_BAR() { return getToken(TxMarkParser.VERTICAL_BAR, 0); }
		public TerminalNode DOUBLE_QUOTE() { return getToken(TxMarkParser.DOUBLE_QUOTE, 0); }
		public TerminalNode SINGLE_QUOTE() { return getToken(TxMarkParser.SINGLE_QUOTE, 0); }
		public MuinutaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_muinuta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterMuinuta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitMuinuta(this);
		}
	}

	public final MuinutaContext muinuta() throws RecognitionException {
		MuinutaContext _localctx = new MuinutaContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_muinuta);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << QUESTION_MARK) | (1L << DOLLAR_SIGN) | (1L << VERTICAL_BAR) | (1L << COLON) | (1L << SLASH) | (1L << EQUALS) | (1L << DOUBLE_QUOTE) | (1L << SINGLE_QUOTE) | (1L << GREATER_THAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlAttributeNameContext extends ParserRuleContext {
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public HtmlAttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttributeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterHtmlAttributeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitHtmlAttributeName(this);
		}
	}

	public final HtmlAttributeNameContext htmlAttributeName() throws RecognitionException {
		HtmlAttributeNameContext _localctx = new HtmlAttributeNameContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_htmlAttributeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			word();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlAttributeContext extends ParserRuleContext {
		public HtmlAttributeNameContext htmlAttributeName() {
			return getRuleContext(HtmlAttributeNameContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(TxMarkParser.EQUALS, 0); }
		public HtmlAttributeValueContext htmlAttributeValue() {
			return getRuleContext(HtmlAttributeValueContext.class,0);
		}
		public List<WhitespaceContext> whitespace() {
			return getRuleContexts(WhitespaceContext.class);
		}
		public WhitespaceContext whitespace(int i) {
			return getRuleContext(WhitespaceContext.class,i);
		}
		public HtmlAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterHtmlAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitHtmlAttribute(this);
		}
	}

	public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
		HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_htmlAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(306);
				whitespace();
				}
			}

			setState(309);
			htmlAttributeName();
			setState(311);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(310);
				whitespace();
				}
			}

			setState(313);
			match(EQUALS);
			setState(315);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(314);
				whitespace();
				}
			}

			setState(317);
			htmlAttributeValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlAttributeValueContentContext extends ParserRuleContext {
		public PhraseContext phrase() {
			return getRuleContext(PhraseContext.class,0);
		}
		public HookNameContext hookName() {
			return getRuleContext(HookNameContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public MuinutaContext muinuta() {
			return getRuleContext(MuinutaContext.class,0);
		}
		public WhitespaceContext whitespace() {
			return getRuleContext(WhitespaceContext.class,0);
		}
		public PunctuationContext punctuation() {
			return getRuleContext(PunctuationContext.class,0);
		}
		public HtmlAttributeValueContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttributeValueContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterHtmlAttributeValueContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitHtmlAttributeValueContent(this);
		}
	}

	public final HtmlAttributeValueContentContext htmlAttributeValueContent() throws RecognitionException {
		HtmlAttributeValueContentContext _localctx = new HtmlAttributeValueContentContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_htmlAttributeValueContent);
		try {
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				phrase();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				hookName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(321);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(322);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(323);
				muinuta();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(324);
				whitespace();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(325);
				punctuation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlAttributeValueContext extends ParserRuleContext {
		public List<TerminalNode> DOUBLE_QUOTE() { return getTokens(TxMarkParser.DOUBLE_QUOTE); }
		public TerminalNode DOUBLE_QUOTE(int i) {
			return getToken(TxMarkParser.DOUBLE_QUOTE, i);
		}
		public List<HtmlAttributeValueContentContext> htmlAttributeValueContent() {
			return getRuleContexts(HtmlAttributeValueContentContext.class);
		}
		public HtmlAttributeValueContentContext htmlAttributeValueContent(int i) {
			return getRuleContext(HtmlAttributeValueContentContext.class,i);
		}
		public List<TerminalNode> SINGLE_QUOTE() { return getTokens(TxMarkParser.SINGLE_QUOTE); }
		public TerminalNode SINGLE_QUOTE(int i) {
			return getToken(TxMarkParser.SINGLE_QUOTE, i);
		}
		public HtmlAttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttributeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterHtmlAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitHtmlAttributeValue(this);
		}
	}

	public final HtmlAttributeValueContext htmlAttributeValue() throws RecognitionException {
		HtmlAttributeValueContext _localctx = new HtmlAttributeValueContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_htmlAttributeValue);
		try {
			int _alt;
			setState(344);
			switch (_input.LA(1)) {
			case DOUBLE_QUOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				match(DOUBLE_QUOTE);
				setState(332);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(329);
						htmlAttributeValueContent();
						}
						} 
					}
					setState(334);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				setState(335);
				match(DOUBLE_QUOTE);
				}
				break;
			case SINGLE_QUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(336);
				match(SINGLE_QUOTE);
				setState(340);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(337);
						htmlAttributeValueContent();
						}
						} 
					}
					setState(342);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				setState(343);
				match(SINGLE_QUOTE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScriptContext extends ParserRuleContext {
		public TerminalNode OPEN_SCRIPT() { return getToken(TxMarkParser.OPEN_SCRIPT, 0); }
		public TerminalNode SCRIPT_BODY() { return getToken(TxMarkParser.SCRIPT_BODY, 0); }
		public TerminalNode SCRIPT_SHORT_BODY() { return getToken(TxMarkParser.SCRIPT_SHORT_BODY, 0); }
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitScript(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(OPEN_SCRIPT);
			setState(347);
			_la = _input.LA(1);
			if ( !(_la==SCRIPT_BODY || _la==SCRIPT_SHORT_BODY) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StyleContext extends ParserRuleContext {
		public TerminalNode OPEN_STYLE() { return getToken(TxMarkParser.OPEN_STYLE, 0); }
		public TerminalNode STYLE_BODY() { return getToken(TxMarkParser.STYLE_BODY, 0); }
		public TerminalNode STYLE_SHORT_BODY() { return getToken(TxMarkParser.STYLE_SHORT_BODY, 0); }
		public StyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_style; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitStyle(this);
		}
	}

	public final StyleContext style() throws RecognitionException {
		StyleContext _localctx = new StyleContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_style);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(OPEN_STYLE);
			setState(350);
			_la = _input.LA(1);
			if ( !(_la==STYLE_BODY || _la==STYLE_SHORT_BODY) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public If_clauseContext if_clause() {
			return getRuleContext(If_clauseContext.class,0);
		}
		public Choose_clauseContext choose_clause() {
			return getRuleContext(Choose_clauseContext.class,0);
		}
		public Each_clauseContext each_clause() {
			return getRuleContext(Each_clauseContext.class,0);
		}
		public Set_clauseContext set_clause() {
			return getRuleContext(Set_clauseContext.class,0);
		}
		public Hook_definition_clauseContext hook_definition_clause() {
			return getRuleContext(Hook_definition_clauseContext.class,0);
		}
		public List<Macro_clauseContext> macro_clause() {
			return getRuleContexts(Macro_clauseContext.class);
		}
		public Macro_clauseContext macro_clause(int i) {
			return getRuleContext(Macro_clauseContext.class,i);
		}
		public List<WhitespaceContext> whitespace() {
			return getRuleContexts(WhitespaceContext.class);
		}
		public WhitespaceContext whitespace(int i) {
			return getRuleContext(WhitespaceContext.class,i);
		}
		public Hook_clauseContext hook_clause() {
			return getRuleContext(Hook_clauseContext.class,0);
		}
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public HookNameContext hookName() {
			return getRuleContext(HookNameContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public EmphasisContext emphasis() {
			return getRuleContext(EmphasisContext.class,0);
		}
		public MuinutaContext muinuta() {
			return getRuleContext(MuinutaContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_element);
		int _la;
		try {
			int _alt;
			setState(374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				if_clause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				choose_clause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(354);
				each_clause();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(355);
				set_clause();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(356);
				hook_definition_clause();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(357);
				macro_clause();
				setState(364);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(359);
						_la = _input.LA(1);
						if (_la==WHITESPACE) {
							{
							setState(358);
							whitespace();
							}
						}

						setState(361);
						macro_clause();
						}
						} 
					}
					setState(366);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(367);
				hook_clause();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(368);
				htmlElement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(369);
				hookName();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(370);
				variable();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(371);
				literal();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(372);
				emphasis();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(373);
				muinuta();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContentContext extends ParserRuleContext {
		public List<PhraseContext> phrase() {
			return getRuleContexts(PhraseContext.class);
		}
		public PhraseContext phrase(int i) {
			return getRuleContext(PhraseContext.class,i);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitContent(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_content);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			_la = _input.LA(1);
			if (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & ((1L << (PUNCTUATION - 23)) | (1L << (WORD - 23)) | (1L << (NUMBER - 23)) | (1L << (WHITESPACE - 23)) | (1L << (MNUMBER - 23)) | (1L << (MWORD - 23)))) != 0)) {
				{
				setState(376);
				phrase();
				}
			}

			setState(385);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(379);
					element();
					setState(381);
					_la = _input.LA(1);
					if (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & ((1L << (PUNCTUATION - 23)) | (1L << (WORD - 23)) | (1L << (NUMBER - 23)) | (1L << (WHITESPACE - 23)) | (1L << (MNUMBER - 23)) | (1L << (MWORD - 23)))) != 0)) {
						{
						setState(380);
						phrase();
						}
					}

					}
					} 
				}
				setState(387);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PhraseContext extends ParserRuleContext {
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<WhitespaceContext> whitespace() {
			return getRuleContexts(WhitespaceContext.class);
		}
		public WhitespaceContext whitespace(int i) {
			return getRuleContext(WhitespaceContext.class,i);
		}
		public List<PunctuationContext> punctuation() {
			return getRuleContexts(PunctuationContext.class);
		}
		public PunctuationContext punctuation(int i) {
			return getRuleContext(PunctuationContext.class,i);
		}
		public PhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_phrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitPhrase(this);
		}
	}

	public final PhraseContext phrase() throws RecognitionException {
		PhraseContext _localctx = new PhraseContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_phrase);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(392); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(392);
					switch (_input.LA(1)) {
					case WORD:
					case MWORD:
						{
						setState(388);
						word();
						}
						break;
					case NUMBER:
					case MNUMBER:
						{
						setState(389);
						number();
						}
						break;
					case WHITESPACE:
						{
						setState(390);
						whitespace();
						}
						break;
					case PUNCTUATION:
						{
						setState(391);
						punctuation();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(394); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Hook_clauseContext extends ParserRuleContext {
		public HookContext hook() {
			return getRuleContext(HookContext.class,0);
		}
		public Left_nametagContext left_nametag() {
			return getRuleContext(Left_nametagContext.class,0);
		}
		public Right_nametagContext right_nametag() {
			return getRuleContext(Right_nametagContext.class,0);
		}
		public Hook_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hook_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterHook_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitHook_clause(this);
		}
	}

	public final Hook_clauseContext hook_clause() throws RecognitionException {
		Hook_clauseContext _localctx = new Hook_clauseContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_hook_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			_la = _input.LA(1);
			if (_la==VERTICAL_BAR) {
				{
				setState(396);
				left_nametag();
				}
			}

			setState(399);
			hook();
			setState(401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(400);
				right_nametag();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Macro_clauseContext extends ParserRuleContext {
		public MacroContext macro() {
			return getRuleContext(MacroContext.class,0);
		}
		public Left_nametagContext left_nametag() {
			return getRuleContext(Left_nametagContext.class,0);
		}
		public HookContext hook() {
			return getRuleContext(HookContext.class,0);
		}
		public WhitespaceContext whitespace() {
			return getRuleContext(WhitespaceContext.class,0);
		}
		public Right_nametagContext right_nametag() {
			return getRuleContext(Right_nametagContext.class,0);
		}
		public Macro_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterMacro_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitMacro_clause(this);
		}
	}

	public final Macro_clauseContext macro_clause() throws RecognitionException {
		Macro_clauseContext _localctx = new Macro_clauseContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_macro_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			_la = _input.LA(1);
			if (_la==VERTICAL_BAR) {
				{
				setState(403);
				left_nametag();
				}
			}

			setState(406);
			macro();
			setState(414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(408);
				_la = _input.LA(1);
				if (_la==WHITESPACE) {
					{
					setState(407);
					whitespace();
					}
				}

				setState(410);
				hook();
				setState(412);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(411);
					right_nametag();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Each_clauseContext extends ParserRuleContext {
		public TerminalNode MACRO_OPEN() { return getToken(TxMarkParser.MACRO_OPEN, 0); }
		public TerminalNode KEYWORD_EACH() { return getToken(TxMarkParser.KEYWORD_EACH, 0); }
		public TerminalNode MCOLON() { return getToken(TxMarkParser.MCOLON, 0); }
		public MacroArgumentContext macroArgument() {
			return getRuleContext(MacroArgumentContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(TxMarkParser.CLOSE_PARENTHESIS, 0); }
		public TerminalNode OPERATOR_AS() { return getToken(TxMarkParser.OPERATOR_AS, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public HookContext hook() {
			return getRuleContext(HookContext.class,0);
		}
		public WhitespaceContext whitespace() {
			return getRuleContext(WhitespaceContext.class,0);
		}
		public Each_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_each_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterEach_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitEach_clause(this);
		}
	}

	public final Each_clauseContext each_clause() throws RecognitionException {
		Each_clauseContext _localctx = new Each_clauseContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_each_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(MACRO_OPEN);
			setState(417);
			match(KEYWORD_EACH);
			setState(418);
			match(MCOLON);
			setState(419);
			macroArgument();
			setState(422);
			_la = _input.LA(1);
			if (_la==OPERATOR_AS) {
				{
				setState(420);
				match(OPERATOR_AS);
				setState(421);
				variable();
				}
			}

			setState(424);
			match(CLOSE_PARENTHESIS);
			setState(429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(426);
				_la = _input.LA(1);
				if (_la==WHITESPACE) {
					{
					setState(425);
					whitespace();
					}
				}

				setState(428);
				hook();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseIf_clauseContext extends ParserRuleContext {
		public TerminalNode MACRO_OPEN() { return getToken(TxMarkParser.MACRO_OPEN, 0); }
		public TerminalNode KEYWORD_ELSEIF() { return getToken(TxMarkParser.KEYWORD_ELSEIF, 0); }
		public TerminalNode MCOLON() { return getToken(TxMarkParser.MCOLON, 0); }
		public MacroArgumentContext macroArgument() {
			return getRuleContext(MacroArgumentContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(TxMarkParser.CLOSE_PARENTHESIS, 0); }
		public HookContext hook() {
			return getRuleContext(HookContext.class,0);
		}
		public ElseIf_clauseContext elseIf_clause() {
			return getRuleContext(ElseIf_clauseContext.class,0);
		}
		public Else_clauseContext else_clause() {
			return getRuleContext(Else_clauseContext.class,0);
		}
		public List<WhitespaceContext> whitespace() {
			return getRuleContexts(WhitespaceContext.class);
		}
		public WhitespaceContext whitespace(int i) {
			return getRuleContext(WhitespaceContext.class,i);
		}
		public ElseIf_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIf_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterElseIf_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitElseIf_clause(this);
		}
	}

	public final ElseIf_clauseContext elseIf_clause() throws RecognitionException {
		ElseIf_clauseContext _localctx = new ElseIf_clauseContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_elseIf_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(MACRO_OPEN);
			setState(432);
			match(KEYWORD_ELSEIF);
			setState(433);
			match(MCOLON);
			setState(434);
			macroArgument();
			setState(435);
			match(CLOSE_PARENTHESIS);
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(437);
				_la = _input.LA(1);
				if (_la==WHITESPACE) {
					{
					setState(436);
					whitespace();
					}
				}

				setState(439);
				hook();
				}
				break;
			}
			setState(449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(443);
				_la = _input.LA(1);
				if (_la==WHITESPACE) {
					{
					setState(442);
					whitespace();
					}
				}

				setState(447);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(445);
					elseIf_clause();
					}
					break;
				case 2:
					{
					setState(446);
					else_clause();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_clauseContext extends ParserRuleContext {
		public TerminalNode MACRO_OPEN() { return getToken(TxMarkParser.MACRO_OPEN, 0); }
		public TerminalNode KEYWORD_ELSE() { return getToken(TxMarkParser.KEYWORD_ELSE, 0); }
		public TerminalNode MCOLON() { return getToken(TxMarkParser.MCOLON, 0); }
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(TxMarkParser.CLOSE_PARENTHESIS, 0); }
		public HookContext hook() {
			return getRuleContext(HookContext.class,0);
		}
		public WhitespaceContext whitespace() {
			return getRuleContext(WhitespaceContext.class,0);
		}
		public Else_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterElse_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitElse_clause(this);
		}
	}

	public final Else_clauseContext else_clause() throws RecognitionException {
		Else_clauseContext _localctx = new Else_clauseContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_else_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(MACRO_OPEN);
			setState(452);
			match(KEYWORD_ELSE);
			setState(453);
			match(MCOLON);
			setState(454);
			match(CLOSE_PARENTHESIS);
			setState(459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(456);
				_la = _input.LA(1);
				if (_la==WHITESPACE) {
					{
					setState(455);
					whitespace();
					}
				}

				setState(458);
				hook();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_clauseContext extends ParserRuleContext {
		public TerminalNode MACRO_OPEN() { return getToken(TxMarkParser.MACRO_OPEN, 0); }
		public TerminalNode KEYWORD_IF() { return getToken(TxMarkParser.KEYWORD_IF, 0); }
		public TerminalNode MCOLON() { return getToken(TxMarkParser.MCOLON, 0); }
		public MacroArgumentContext macroArgument() {
			return getRuleContext(MacroArgumentContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(TxMarkParser.CLOSE_PARENTHESIS, 0); }
		public HookContext hook() {
			return getRuleContext(HookContext.class,0);
		}
		public ElseIf_clauseContext elseIf_clause() {
			return getRuleContext(ElseIf_clauseContext.class,0);
		}
		public Else_clauseContext else_clause() {
			return getRuleContext(Else_clauseContext.class,0);
		}
		public List<WhitespaceContext> whitespace() {
			return getRuleContexts(WhitespaceContext.class);
		}
		public WhitespaceContext whitespace(int i) {
			return getRuleContext(WhitespaceContext.class,i);
		}
		public If_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterIf_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitIf_clause(this);
		}
	}

	public final If_clauseContext if_clause() throws RecognitionException {
		If_clauseContext _localctx = new If_clauseContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_if_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(MACRO_OPEN);
			setState(462);
			match(KEYWORD_IF);
			setState(463);
			match(MCOLON);
			setState(464);
			macroArgument();
			setState(465);
			match(CLOSE_PARENTHESIS);
			setState(470);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(467);
				_la = _input.LA(1);
				if (_la==WHITESPACE) {
					{
					setState(466);
					whitespace();
					}
				}

				setState(469);
				hook();
				}
				break;
			}
			setState(479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(473);
				_la = _input.LA(1);
				if (_la==WHITESPACE) {
					{
					setState(472);
					whitespace();
					}
				}

				setState(477);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(475);
					elseIf_clause();
					}
					break;
				case 2:
					{
					setState(476);
					else_clause();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class When_clauseContext extends ParserRuleContext {
		public TerminalNode MACRO_OPEN() { return getToken(TxMarkParser.MACRO_OPEN, 0); }
		public TerminalNode KEYWORD_WHEN() { return getToken(TxMarkParser.KEYWORD_WHEN, 0); }
		public TerminalNode MCOLON() { return getToken(TxMarkParser.MCOLON, 0); }
		public MacroArgumentContext macroArgument() {
			return getRuleContext(MacroArgumentContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(TxMarkParser.CLOSE_PARENTHESIS, 0); }
		public HookContext hook() {
			return getRuleContext(HookContext.class,0);
		}
		public When_clauseContext when_clause() {
			return getRuleContext(When_clauseContext.class,0);
		}
		public Otherwise_clauseContext otherwise_clause() {
			return getRuleContext(Otherwise_clauseContext.class,0);
		}
		public List<WhitespaceContext> whitespace() {
			return getRuleContexts(WhitespaceContext.class);
		}
		public WhitespaceContext whitespace(int i) {
			return getRuleContext(WhitespaceContext.class,i);
		}
		public When_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_when_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterWhen_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitWhen_clause(this);
		}
	}

	public final When_clauseContext when_clause() throws RecognitionException {
		When_clauseContext _localctx = new When_clauseContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_when_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(MACRO_OPEN);
			setState(482);
			match(KEYWORD_WHEN);
			setState(483);
			match(MCOLON);
			setState(484);
			macroArgument();
			setState(485);
			match(CLOSE_PARENTHESIS);
			setState(490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(487);
				_la = _input.LA(1);
				if (_la==WHITESPACE) {
					{
					setState(486);
					whitespace();
					}
				}

				setState(489);
				hook();
				}
				break;
			}
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(493);
				_la = _input.LA(1);
				if (_la==WHITESPACE) {
					{
					setState(492);
					whitespace();
					}
				}

				setState(497);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(495);
					when_clause();
					}
					break;
				case 2:
					{
					setState(496);
					otherwise_clause();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Otherwise_clauseContext extends ParserRuleContext {
		public TerminalNode MACRO_OPEN() { return getToken(TxMarkParser.MACRO_OPEN, 0); }
		public TerminalNode KEYWORD_OTHERWISE() { return getToken(TxMarkParser.KEYWORD_OTHERWISE, 0); }
		public TerminalNode MCOLON() { return getToken(TxMarkParser.MCOLON, 0); }
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(TxMarkParser.CLOSE_PARENTHESIS, 0); }
		public HookContext hook() {
			return getRuleContext(HookContext.class,0);
		}
		public WhitespaceContext whitespace() {
			return getRuleContext(WhitespaceContext.class,0);
		}
		public Otherwise_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherwise_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterOtherwise_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitOtherwise_clause(this);
		}
	}

	public final Otherwise_clauseContext otherwise_clause() throws RecognitionException {
		Otherwise_clauseContext _localctx = new Otherwise_clauseContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_otherwise_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(MACRO_OPEN);
			setState(502);
			match(KEYWORD_OTHERWISE);
			setState(503);
			match(MCOLON);
			setState(504);
			match(CLOSE_PARENTHESIS);
			setState(509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(506);
				_la = _input.LA(1);
				if (_la==WHITESPACE) {
					{
					setState(505);
					whitespace();
					}
				}

				setState(508);
				hook();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Choose_clauseContext extends ParserRuleContext {
		public TerminalNode MACRO_OPEN() { return getToken(TxMarkParser.MACRO_OPEN, 0); }
		public TerminalNode KEYWORD_CHOOSE() { return getToken(TxMarkParser.KEYWORD_CHOOSE, 0); }
		public TerminalNode MCOLON() { return getToken(TxMarkParser.MCOLON, 0); }
		public MacroArgumentContext macroArgument() {
			return getRuleContext(MacroArgumentContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(TxMarkParser.CLOSE_PARENTHESIS, 0); }
		public When_clauseContext when_clause() {
			return getRuleContext(When_clauseContext.class,0);
		}
		public Otherwise_clauseContext otherwise_clause() {
			return getRuleContext(Otherwise_clauseContext.class,0);
		}
		public WhitespaceContext whitespace() {
			return getRuleContext(WhitespaceContext.class,0);
		}
		public Choose_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choose_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterChoose_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitChoose_clause(this);
		}
	}

	public final Choose_clauseContext choose_clause() throws RecognitionException {
		Choose_clauseContext _localctx = new Choose_clauseContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_choose_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(MACRO_OPEN);
			setState(512);
			match(KEYWORD_CHOOSE);
			setState(513);
			match(MCOLON);
			setState(514);
			macroArgument();
			setState(515);
			match(CLOSE_PARENTHESIS);
			setState(523);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(517);
				_la = _input.LA(1);
				if (_la==WHITESPACE) {
					{
					setState(516);
					whitespace();
					}
				}

				setState(521);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(519);
					when_clause();
					}
					break;
				case 2:
					{
					setState(520);
					otherwise_clause();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_clauseContext extends ParserRuleContext {
		public TerminalNode MACRO_OPEN() { return getToken(TxMarkParser.MACRO_OPEN, 0); }
		public TerminalNode KEYWORD_SET() { return getToken(TxMarkParser.KEYWORD_SET, 0); }
		public TerminalNode MCOLON() { return getToken(TxMarkParser.MCOLON, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode KEYWORD_TO() { return getToken(TxMarkParser.KEYWORD_TO, 0); }
		public MacroArgumentContext macroArgument() {
			return getRuleContext(MacroArgumentContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(TxMarkParser.CLOSE_PARENTHESIS, 0); }
		public Set_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterSet_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitSet_clause(this);
		}
	}

	public final Set_clauseContext set_clause() throws RecognitionException {
		Set_clauseContext _localctx = new Set_clauseContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_set_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(MACRO_OPEN);
			setState(526);
			match(KEYWORD_SET);
			setState(527);
			match(MCOLON);
			setState(528);
			variable();
			setState(529);
			match(KEYWORD_TO);
			setState(530);
			macroArgument();
			setState(531);
			match(CLOSE_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Hook_definition_clauseContext extends ParserRuleContext {
		public TerminalNode MACRO_OPEN() { return getToken(TxMarkParser.MACRO_OPEN, 0); }
		public TerminalNode KEYWORD_HOOK() { return getToken(TxMarkParser.KEYWORD_HOOK, 0); }
		public TerminalNode MCOLON() { return getToken(TxMarkParser.MCOLON, 0); }
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(TxMarkParser.CLOSE_PARENTHESIS, 0); }
		public HookContext hook() {
			return getRuleContext(HookContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public HookNameContext hookName() {
			return getRuleContext(HookNameContext.class,0);
		}
		public Hook_definition_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hook_definition_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterHook_definition_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitHook_definition_clause(this);
		}
	}

	public final Hook_definition_clauseContext hook_definition_clause() throws RecognitionException {
		Hook_definition_clauseContext _localctx = new Hook_definition_clauseContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_hook_definition_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			match(MACRO_OPEN);
			setState(534);
			match(KEYWORD_HOOK);
			setState(535);
			match(MCOLON);
			setState(538);
			switch (_input.LA(1)) {
			case DOLLAR_SIGN:
			case MDOLLAR_SIGN:
				{
				setState(536);
				variable();
				}
				break;
			case QUESTION_MARK:
			case MQUESTION_MARK:
				{
				setState(537);
				hookName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(540);
			match(CLOSE_PARENTHESIS);
			setState(541);
			hook();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MacroContext extends ParserRuleContext {
		public TerminalNode MACRO_OPEN() { return getToken(TxMarkParser.MACRO_OPEN, 0); }
		public MacroNameContext macroName() {
			return getRuleContext(MacroNameContext.class,0);
		}
		public TerminalNode MCOLON() { return getToken(TxMarkParser.MCOLON, 0); }
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(TxMarkParser.CLOSE_PARENTHESIS, 0); }
		public List<MacroArgumentContext> macroArgument() {
			return getRuleContexts(MacroArgumentContext.class);
		}
		public MacroArgumentContext macroArgument(int i) {
			return getRuleContext(MacroArgumentContext.class,i);
		}
		public TerminalNode OPERATOR_AS() { return getToken(TxMarkParser.OPERATOR_AS, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<TerminalNode> MCOMMA() { return getTokens(TxMarkParser.MCOMMA); }
		public TerminalNode MCOMMA(int i) {
			return getToken(TxMarkParser.MCOMMA, i);
		}
		public MacroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterMacro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitMacro(this);
		}
	}

	public final MacroContext macro() throws RecognitionException {
		MacroContext _localctx = new MacroContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_macro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			match(MACRO_OPEN);
			setState(544);
			macroName();
			setState(545);
			match(MCOLON);
			setState(554);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUESTION_MARK) | (1L << DOLLAR_SIGN) | (1L << WORD) | (1L << NUMBER) | (1L << MNUMBER) | (1L << MDOLLAR_SIGN) | (1L << MQUESTION_MARK) | (1L << CONSTANT_TRUE) | (1L << CONSTANT_FALSE) | (1L << CONSTANT_NULL) | (1L << OPERATOR_LAST))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (OPERATOR_MINUS - 69)) | (1L << (OPEN_PARENTHESIS - 69)) | (1L << (DOUBLE_QUOTE_STRING - 69)) | (1L << (MWORD - 69)))) != 0)) {
				{
				setState(546);
				macroArgument();
				setState(551);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MCOMMA) {
					{
					{
					setState(547);
					match(MCOMMA);
					setState(548);
					macroArgument();
					}
					}
					setState(553);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(558);
			_la = _input.LA(1);
			if (_la==OPERATOR_AS) {
				{
				setState(556);
				match(OPERATOR_AS);
				setState(557);
				variable();
				}
			}

			setState(560);
			match(CLOSE_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubmacroContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENTHESIS() { return getToken(TxMarkParser.OPEN_PARENTHESIS, 0); }
		public MacroNameContext macroName() {
			return getRuleContext(MacroNameContext.class,0);
		}
		public TerminalNode MCOLON() { return getToken(TxMarkParser.MCOLON, 0); }
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(TxMarkParser.CLOSE_PARENTHESIS, 0); }
		public List<MacroArgumentContext> macroArgument() {
			return getRuleContexts(MacroArgumentContext.class);
		}
		public MacroArgumentContext macroArgument(int i) {
			return getRuleContext(MacroArgumentContext.class,i);
		}
		public List<TerminalNode> MCOMMA() { return getTokens(TxMarkParser.MCOMMA); }
		public TerminalNode MCOMMA(int i) {
			return getToken(TxMarkParser.MCOMMA, i);
		}
		public SubmacroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_submacro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterSubmacro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitSubmacro(this);
		}
	}

	public final SubmacroContext submacro() throws RecognitionException {
		SubmacroContext _localctx = new SubmacroContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_submacro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			match(OPEN_PARENTHESIS);
			setState(563);
			macroName();
			setState(564);
			match(MCOLON);
			setState(573);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUESTION_MARK) | (1L << DOLLAR_SIGN) | (1L << WORD) | (1L << NUMBER) | (1L << MNUMBER) | (1L << MDOLLAR_SIGN) | (1L << MQUESTION_MARK) | (1L << CONSTANT_TRUE) | (1L << CONSTANT_FALSE) | (1L << CONSTANT_NULL) | (1L << OPERATOR_LAST))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (OPERATOR_MINUS - 69)) | (1L << (OPEN_PARENTHESIS - 69)) | (1L << (DOUBLE_QUOTE_STRING - 69)) | (1L << (MWORD - 69)))) != 0)) {
				{
				setState(565);
				macroArgument();
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MCOMMA) {
					{
					{
					setState(566);
					match(MCOMMA);
					setState(567);
					macroArgument();
					}
					}
					setState(572);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(575);
			match(CLOSE_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HookContext extends ParserRuleContext {
		public TerminalNode OPEN_HOOK() { return getToken(TxMarkParser.OPEN_HOOK, 0); }
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode CLOSE_HOOK() { return getToken(TxMarkParser.CLOSE_HOOK, 0); }
		public HookContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hook; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterHook(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitHook(this);
		}
	}

	public final HookContext hook() throws RecognitionException {
		HookContext _localctx = new HookContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_hook);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			match(OPEN_HOOK);
			setState(578);
			content();
			setState(579);
			match(CLOSE_HOOK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MacroNameContext extends ParserRuleContext {
		public TerminalNode MWORD() { return getToken(TxMarkParser.MWORD, 0); }
		public MacroNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).enterMacroName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TxMarkParserListener ) ((TxMarkParserListener)listener).exitMacroName(this);
		}
	}

	public final MacroNameContext macroName() throws RecognitionException {
		MacroNameContext _localctx = new MacroNameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_macroName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			match(MWORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3S\u024a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6\u0082\n\6\3\7\3\7\3\7\3\7\5"+
		"\7\u0088\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u0099\n\13\3\f\3\f\3\r\3\r\3\r\5\r\u00a0\n\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\5\r\u00a9\n\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3"+
		"\20\7\20\u00b3\n\20\f\20\16\20\u00b6\13\20\3\20\3\20\3\20\3\20\5\20\u00bc"+
		"\n\20\3\21\5\21\u00bf\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00d5\n\22"+
		"\3\23\3\23\3\23\3\24\3\24\7\24\u00dc\n\24\f\24\16\24\u00df\13\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00ed\n\30"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\7\34\u00f8\n\34\f\34\16"+
		"\34\u00fb\13\34\3\34\3\34\3\34\3\34\3\34\7\34\u0102\n\34\f\34\16\34\u0105"+
		"\13\34\3\34\3\34\3\34\5\34\u010a\n\34\3\35\3\35\3\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\36\5\36\u0115\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\5\37\u012f\n\37\3 \3 \3!\3!\3\"\5\"\u0136\n\"\3\"\3\"\5\"\u013a"+
		"\n\"\3\"\3\"\5\"\u013e\n\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\5#\u0149\n#\3"+
		"$\3$\7$\u014d\n$\f$\16$\u0150\13$\3$\3$\3$\7$\u0155\n$\f$\16$\u0158\13"+
		"$\3$\5$\u015b\n$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u016a"+
		"\n\'\3\'\7\'\u016d\n\'\f\'\16\'\u0170\13\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\5\'\u0179\n\'\3(\5(\u017c\n(\3(\3(\5(\u0180\n(\7(\u0182\n(\f(\16(\u0185"+
		"\13(\3)\3)\3)\3)\6)\u018b\n)\r)\16)\u018c\3*\5*\u0190\n*\3*\3*\5*\u0194"+
		"\n*\3+\5+\u0197\n+\3+\3+\5+\u019b\n+\3+\3+\5+\u019f\n+\5+\u01a1\n+\3,"+
		"\3,\3,\3,\3,\3,\5,\u01a9\n,\3,\3,\5,\u01ad\n,\3,\5,\u01b0\n,\3-\3-\3-"+
		"\3-\3-\3-\5-\u01b8\n-\3-\5-\u01bb\n-\3-\5-\u01be\n-\3-\3-\5-\u01c2\n-"+
		"\5-\u01c4\n-\3.\3.\3.\3.\3.\5.\u01cb\n.\3.\5.\u01ce\n.\3/\3/\3/\3/\3/"+
		"\3/\5/\u01d6\n/\3/\5/\u01d9\n/\3/\5/\u01dc\n/\3/\3/\5/\u01e0\n/\5/\u01e2"+
		"\n/\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u01ea\n\60\3\60\5\60\u01ed\n\60"+
		"\3\60\5\60\u01f0\n\60\3\60\3\60\5\60\u01f4\n\60\5\60\u01f6\n\60\3\61\3"+
		"\61\3\61\3\61\3\61\5\61\u01fd\n\61\3\61\5\61\u0200\n\61\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\5\62\u0208\n\62\3\62\3\62\5\62\u020c\n\62\5\62\u020e\n"+
		"\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\5"+
		"\64\u021d\n\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\7\65\u0228"+
		"\n\65\f\65\16\65\u022b\13\65\5\65\u022d\n\65\3\65\3\65\5\65\u0231\n\65"+
		"\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\7\66\u023b\n\66\f\66\16\66\u023e"+
		"\13\66\5\66\u0240\n\66\3\66\3\66\3\67\3\67\3\67\3\67\38\38\38\5\u014e"+
		"\u0156\u0183\29\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjln\2\b\4\2\33\33OO\4\2\34\34\"\"\3\2"+
		"\63\66\3\2\t\22\3\2PQ\3\2RS\u0287\2p\3\2\2\2\4s\3\2\2\2\6u\3\2\2\2\by"+
		"\3\2\2\2\n\u0081\3\2\2\2\f\u0087\3\2\2\2\16\u0089\3\2\2\2\20\u008b\3\2"+
		"\2\2\22\u008d\3\2\2\2\24\u0098\3\2\2\2\26\u009a\3\2\2\2\30\u00a8\3\2\2"+
		"\2\32\u00aa\3\2\2\2\34\u00ad\3\2\2\2\36\u00bb\3\2\2\2 \u00be\3\2\2\2\""+
		"\u00d4\3\2\2\2$\u00d6\3\2\2\2&\u00d9\3\2\2\2(\u00e0\3\2\2\2*\u00e2\3\2"+
		"\2\2,\u00e4\3\2\2\2.\u00ec\3\2\2\2\60\u00ee\3\2\2\2\62\u00f0\3\2\2\2\64"+
		"\u00f2\3\2\2\2\66\u0109\3\2\2\28\u010b\3\2\2\2:\u0114\3\2\2\2<\u012e\3"+
		"\2\2\2>\u0130\3\2\2\2@\u0132\3\2\2\2B\u0135\3\2\2\2D\u0148\3\2\2\2F\u015a"+
		"\3\2\2\2H\u015c\3\2\2\2J\u015f\3\2\2\2L\u0178\3\2\2\2N\u017b\3\2\2\2P"+
		"\u018a\3\2\2\2R\u018f\3\2\2\2T\u0196\3\2\2\2V\u01a2\3\2\2\2X\u01b1\3\2"+
		"\2\2Z\u01c5\3\2\2\2\\\u01cf\3\2\2\2^\u01e3\3\2\2\2`\u01f7\3\2\2\2b\u0201"+
		"\3\2\2\2d\u020f\3\2\2\2f\u0217\3\2\2\2h\u0221\3\2\2\2j\u0234\3\2\2\2l"+
		"\u0243\3\2\2\2n\u0247\3\2\2\2pq\5N(\2qr\7\2\2\3r\3\3\2\2\2st\7\35\2\2"+
		"t\5\3\2\2\2uv\7\f\2\2vw\5\16\b\2wx\7\r\2\2x\7\3\2\2\2yz\7\r\2\2z{\5\16"+
		"\b\2{|\7\f\2\2|\t\3\2\2\2}~\7\13\2\2~\u0082\5\16\b\2\177\u0080\7#\2\2"+
		"\u0080\u0082\5\16\b\2\u0081}\3\2\2\2\u0081\177\3\2\2\2\u0082\13\3\2\2"+
		"\2\u0083\u0084\7\n\2\2\u0084\u0088\5\16\b\2\u0085\u0086\7$\2\2\u0086\u0088"+
		"\5\16\b\2\u0087\u0083\3\2\2\2\u0087\u0085\3\2\2\2\u0088\r\3\2\2\2\u0089"+
		"\u008a\t\2\2\2\u008a\17\3\2\2\2\u008b\u008c\t\3\2\2\u008c\21\3\2\2\2\u008d"+
		"\u008e\7N\2\2\u008e\23\3\2\2\2\u008f\u0099\5\n\6\2\u0090\u0099\5\f\7\2"+
		"\u0091\u0099\5j\66\2\u0092\u0099\5.\30\2\u0093\u0099\5\16\b\2\u0094\u0095"+
		"\7L\2\2\u0095\u0096\5&\24\2\u0096\u0097\7M\2\2\u0097\u0099\3\2\2\2\u0098"+
		"\u008f\3\2\2\2\u0098\u0090\3\2\2\2\u0098\u0091\3\2\2\2\u0098\u0092\3\2"+
		"\2\2\u0098\u0093\3\2\2\2\u0098\u0094\3\2\2\2\u0099\25\3\2\2\2\u009a\u009b"+
		"\t\4\2\2\u009b\27\3\2\2\2\u009c\u009d\5\20\t\2\u009d\u009f\5\26\f\2\u009e"+
		"\u00a0\7@\2\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a9\3\2"+
		"\2\2\u00a1\u00a9\7@\2\2\u00a2\u00a3\7L\2\2\u00a3\u00a4\5&\24\2\u00a4\u00a5"+
		"\7M\2\2\u00a5\u00a9\3\2\2\2\u00a6\u00a9\5\22\n\2\u00a7\u00a9\5\16\b\2"+
		"\u00a8\u009c\3\2\2\2\u00a8\u00a1\3\2\2\2\u00a8\u00a2\3\2\2\2\u00a8\u00a6"+
		"\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\31\3\2\2\2\u00aa\u00ab\7E\2\2\u00ab"+
		"\u00ac\5\24\13\2\u00ac\33\3\2\2\2\u00ad\u00ae\7D\2\2\u00ae\u00af\5\30"+
		"\r\2\u00af\35\3\2\2\2\u00b0\u00b4\5\24\13\2\u00b1\u00b3\5\34\17\2\u00b2"+
		"\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2"+
		"\2\2\u00b5\u00bc\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\5\30\r\2\u00b8"+
		"\u00b9\7E\2\2\u00b9\u00ba\5\36\20\2\u00ba\u00bc\3\2\2\2\u00bb\u00b0\3"+
		"\2\2\2\u00bb\u00b7\3\2\2\2\u00bc\37\3\2\2\2\u00bd\u00bf\7G\2\2\u00be\u00bd"+
		"\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\5\36\20\2"+
		"\u00c1!\3\2\2\2\u00c2\u00d5\7<\2\2\u00c3\u00d5\7>\2\2\u00c4\u00d5\7\67"+
		"\2\2\u00c5\u00d5\78\2\2\u00c6\u00d5\79\2\2\u00c7\u00d5\7:\2\2\u00c8\u00c9"+
		"\7A\2\2\u00c9\u00d5\7B\2\2\u00ca\u00cb\7A\2\2\u00cb\u00d5\7?\2\2\u00cc"+
		"\u00d5\7A\2\2\u00cd\u00d5\7=\2\2\u00ce\u00d5\7K\2\2\u00cf\u00d5\7I\2\2"+
		"\u00d0\u00d5\7H\2\2\u00d1\u00d5\7J\2\2\u00d2\u00d5\7F\2\2\u00d3\u00d5"+
		"\7G\2\2\u00d4\u00c2\3\2\2\2\u00d4\u00c3\3\2\2\2\u00d4\u00c4\3\2\2\2\u00d4"+
		"\u00c5\3\2\2\2\u00d4\u00c6\3\2\2\2\u00d4\u00c7\3\2\2\2\u00d4\u00c8\3\2"+
		"\2\2\u00d4\u00ca\3\2\2\2\u00d4\u00cc\3\2\2\2\u00d4\u00cd\3\2\2\2\u00d4"+
		"\u00ce\3\2\2\2\u00d4\u00cf\3\2\2\2\u00d4\u00d0\3\2\2\2\u00d4\u00d1\3\2"+
		"\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5#\3\2\2\2\u00d6\u00d7"+
		"\5\"\22\2\u00d7\u00d8\5&\24\2\u00d8%\3\2\2\2\u00d9\u00dd\5 \21\2\u00da"+
		"\u00dc\5$\23\2\u00db\u00da\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2"+
		"\2\2\u00dd\u00de\3\2\2\2\u00de\'\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e1"+
		"\7/\2\2\u00e1)\3\2\2\2\u00e2\u00e3\7\60\2\2\u00e3+\3\2\2\2\u00e4\u00e5"+
		"\7\61\2\2\u00e5-\3\2\2\2\u00e6\u00ed\5\20\t\2\u00e7\u00ed\5(\25\2\u00e8"+
		"\u00ed\5*\26\2\u00e9\u00ed\5,\27\2\u00ea\u00ed\5\22\n\2\u00eb\u00ed\5"+
		"\16\b\2\u00ec\u00e6\3\2\2\2\u00ec\u00e7\3\2\2\2\u00ec\u00e8\3\2\2\2\u00ec"+
		"\u00e9\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed/\3\2\2\2"+
		"\u00ee\u00ef\5&\24\2\u00ef\61\3\2\2\2\u00f0\u00f1\7\32\2\2\u00f1\63\3"+
		"\2\2\2\u00f2\u00f3\7\31\2\2\u00f3\65\3\2\2\2\u00f4\u00f5\7\t\2\2\u00f5"+
		"\u00f9\5\16\b\2\u00f6\u00f8\5B\"\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2"+
		"\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb"+
		"\u00f9\3\2\2\2\u00fc\u00fd\7\22\2\2\u00fd\u010a\3\2\2\2\u00fe\u00ff\7"+
		"\t\2\2\u00ff\u0103\5\16\b\2\u0100\u0102\5B\"\2\u0101\u0100\3\2\2\2\u0102"+
		"\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\3\2"+
		"\2\2\u0105\u0103\3\2\2\2\u0106\u0107\7\16\2\2\u0107\u0108\7\22\2\2\u0108"+
		"\u010a\3\2\2\2\u0109\u00f4\3\2\2\2\u0109\u00fe\3\2\2\2\u010a\67\3\2\2"+
		"\2\u010b\u010c\7\t\2\2\u010c\u010d\7\16\2\2\u010d\u010e\5\16\b\2\u010e"+
		"\u010f\7\22\2\2\u010f9\3\2\2\2\u0110\u0115\5\66\34\2\u0111\u0115\58\35"+
		"\2\u0112\u0115\5H%\2\u0113\u0115\5J&\2\u0114\u0110\3\2\2\2\u0114\u0111"+
		"\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0113\3\2\2\2\u0115;\3\2\2\2\u0116"+
		"\u0117\7\23\2\2\u0117\u0118\5N(\2\u0118\u0119\7\23\2\2\u0119\u012f\3\2"+
		"\2\2\u011a\u011b\7\30\2\2\u011b\u011c\5N(\2\u011c\u011d\7\30\2\2\u011d"+
		"\u012f\3\2\2\2\u011e\u011f\7\24\2\2\u011f\u0120\5N(\2\u0120\u0121\7\24"+
		"\2\2\u0121\u012f\3\2\2\2\u0122\u0123\7\25\2\2\u0123\u0124\5N(\2\u0124"+
		"\u0125\7\25\2\2\u0125\u012f\3\2\2\2\u0126\u0127\7\26\2\2\u0127\u0128\5"+
		"N(\2\u0128\u0129\7\26\2\2\u0129\u012f\3\2\2\2\u012a\u012b\7\27\2\2\u012b"+
		"\u012c\5N(\2\u012c\u012d\7\27\2\2\u012d\u012f\3\2\2\2\u012e\u0116\3\2"+
		"\2\2\u012e\u011a\3\2\2\2\u012e\u011e\3\2\2\2\u012e\u0122\3\2\2\2\u012e"+
		"\u0126\3\2\2\2\u012e\u012a\3\2\2\2\u012f=\3\2\2\2\u0130\u0131\t\5\2\2"+
		"\u0131?\3\2\2\2\u0132\u0133\5\16\b\2\u0133A\3\2\2\2\u0134\u0136\5\4\3"+
		"\2\u0135\u0134\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139"+
		"\5@!\2\u0138\u013a\5\4\3\2\u0139\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013b\u013d\7\17\2\2\u013c\u013e\5\4\3\2\u013d\u013c\3"+
		"\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\5F$\2\u0140"+
		"C\3\2\2\2\u0141\u0149\5P)\2\u0142\u0149\5\f\7\2\u0143\u0149\5\n\6\2\u0144"+
		"\u0149\5\62\32\2\u0145\u0149\5> \2\u0146\u0149\5\4\3\2\u0147\u0149\5\64"+
		"\33\2\u0148\u0141\3\2\2\2\u0148\u0142\3\2\2\2\u0148\u0143\3\2\2\2\u0148"+
		"\u0144\3\2\2\2\u0148\u0145\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0147\3\2"+
		"\2\2\u0149E\3\2\2\2\u014a\u014e\7\20\2\2\u014b\u014d\5D#\2\u014c\u014b"+
		"\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014f\3\2\2\2\u014e\u014c\3\2\2\2\u014f"+
		"\u0151\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u015b\7\20\2\2\u0152\u0156\7"+
		"\21\2\2\u0153\u0155\5D#\2\u0154\u0153\3\2\2\2\u0155\u0158\3\2\2\2\u0156"+
		"\u0157\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u0159\3\2\2\2\u0158\u0156\3\2"+
		"\2\2\u0159\u015b\7\21\2\2\u015a\u014a\3\2\2\2\u015a\u0152\3\2\2\2\u015b"+
		"G\3\2\2\2\u015c\u015d\7\7\2\2\u015d\u015e\t\6\2\2\u015eI\3\2\2\2\u015f"+
		"\u0160\7\b\2\2\u0160\u0161\t\7\2\2\u0161K\3\2\2\2\u0162\u0179\5\\/\2\u0163"+
		"\u0179\5b\62\2\u0164\u0179\5V,\2\u0165\u0179\5d\63\2\u0166\u0179\5f\64"+
		"\2\u0167\u016e\5T+\2\u0168\u016a\5\4\3\2\u0169\u0168\3\2\2\2\u0169\u016a"+
		"\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016d\5T+\2\u016c\u0169\3\2\2\2\u016d"+
		"\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0179\3\2"+
		"\2\2\u0170\u016e\3\2\2\2\u0171\u0179\5R*\2\u0172\u0179\5:\36\2\u0173\u0179"+
		"\5\f\7\2\u0174\u0179\5\n\6\2\u0175\u0179\5\62\32\2\u0176\u0179\5<\37\2"+
		"\u0177\u0179\5> \2\u0178\u0162\3\2\2\2\u0178\u0163\3\2\2\2\u0178\u0164"+
		"\3\2\2\2\u0178\u0165\3\2\2\2\u0178\u0166\3\2\2\2\u0178\u0167\3\2\2\2\u0178"+
		"\u0171\3\2\2\2\u0178\u0172\3\2\2\2\u0178\u0173\3\2\2\2\u0178\u0174\3\2"+
		"\2\2\u0178\u0175\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0177\3\2\2\2\u0179"+
		"M\3\2\2\2\u017a\u017c\5P)\2\u017b\u017a\3\2\2\2\u017b\u017c\3\2\2\2\u017c"+
		"\u0183\3\2\2\2\u017d\u017f\5L\'\2\u017e\u0180\5P)\2\u017f\u017e\3\2\2"+
		"\2\u017f\u0180\3\2\2\2\u0180\u0182\3\2\2\2\u0181\u017d\3\2\2\2\u0182\u0185"+
		"\3\2\2\2\u0183\u0184\3\2\2\2\u0183\u0181\3\2\2\2\u0184O\3\2\2\2\u0185"+
		"\u0183\3\2\2\2\u0186\u018b\5\16\b\2\u0187\u018b\5\20\t\2\u0188\u018b\5"+
		"\4\3\2\u0189\u018b\5\64\33\2\u018a\u0186\3\2\2\2\u018a\u0187\3\2\2\2\u018a"+
		"\u0188\3\2\2\2\u018a\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018a\3\2"+
		"\2\2\u018c\u018d\3\2\2\2\u018dQ\3\2\2\2\u018e\u0190\5\6\4\2\u018f\u018e"+
		"\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0193\5l\67\2\u0192"+
		"\u0194\5\b\5\2\u0193\u0192\3\2\2\2\u0193\u0194\3\2\2\2\u0194S\3\2\2\2"+
		"\u0195\u0197\5\6\4\2\u0196\u0195\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198"+
		"\3\2\2\2\u0198\u01a0\5h\65\2\u0199\u019b\5\4\3\2\u019a\u0199\3\2\2\2\u019a"+
		"\u019b\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019e\5l\67\2\u019d\u019f\5\b"+
		"\5\2\u019e\u019d\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0"+
		"\u019a\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1U\3\2\2\2\u01a2\u01a3\7\4\2\2"+
		"\u01a3\u01a4\7-\2\2\u01a4\u01a5\7!\2\2\u01a5\u01a8\5\60\31\2\u01a6\u01a7"+
		"\7\62\2\2\u01a7\u01a9\5\n\6\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2"+
		"\u01a9\u01aa\3\2\2\2\u01aa\u01af\7M\2\2\u01ab\u01ad\5\4\3\2\u01ac\u01ab"+
		"\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01b0\5l\67\2\u01af"+
		"\u01ac\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0W\3\2\2\2\u01b1\u01b2\7\4\2\2"+
		"\u01b2\u01b3\7,\2\2\u01b3\u01b4\7!\2\2\u01b4\u01b5\5\60\31\2\u01b5\u01ba"+
		"\7M\2\2\u01b6\u01b8\5\4\3\2\u01b7\u01b6\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8"+
		"\u01b9\3\2\2\2\u01b9\u01bb\5l\67\2\u01ba\u01b7\3\2\2\2\u01ba\u01bb\3\2"+
		"\2\2\u01bb\u01c3\3\2\2\2\u01bc\u01be\5\4\3\2\u01bd\u01bc\3\2\2\2\u01bd"+
		"\u01be\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01c2\5X-\2\u01c0\u01c2\5Z.\2"+
		"\u01c1\u01bf\3\2\2\2\u01c1\u01c0\3\2\2\2\u01c2\u01c4\3\2\2\2\u01c3\u01bd"+
		"\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4Y\3\2\2\2\u01c5\u01c6\7\4\2\2\u01c6"+
		"\u01c7\7.\2\2\u01c7\u01c8\7!\2\2\u01c8\u01cd\7M\2\2\u01c9\u01cb\5\4\3"+
		"\2\u01ca\u01c9\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01ce"+
		"\5l\67\2\u01cd\u01ca\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce[\3\2\2\2\u01cf"+
		"\u01d0\7\4\2\2\u01d0\u01d1\7%\2\2\u01d1\u01d2\7!\2\2\u01d2\u01d3\5\60"+
		"\31\2\u01d3\u01d8\7M\2\2\u01d4\u01d6\5\4\3\2\u01d5\u01d4\3\2\2\2\u01d5"+
		"\u01d6\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d9\5l\67\2\u01d8\u01d5\3\2"+
		"\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01e1\3\2\2\2\u01da\u01dc\5\4\3\2\u01db"+
		"\u01da\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd\u01e0\5X"+
		"-\2\u01de\u01e0\5Z.\2\u01df\u01dd\3\2\2\2\u01df\u01de\3\2\2\2\u01e0\u01e2"+
		"\3\2\2\2\u01e1\u01db\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2]\3\2\2\2\u01e3"+
		"\u01e4\7\4\2\2\u01e4\u01e5\7\'\2\2\u01e5\u01e6\7!\2\2\u01e6\u01e7\5\60"+
		"\31\2\u01e7\u01ec\7M\2\2\u01e8\u01ea\5\4\3\2\u01e9\u01e8\3\2\2\2\u01e9"+
		"\u01ea\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ed\5l\67\2\u01ec\u01e9\3\2"+
		"\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01f5\3\2\2\2\u01ee\u01f0\5\4\3\2\u01ef"+
		"\u01ee\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1\u01f4\5^"+
		"\60\2\u01f2\u01f4\5`\61\2\u01f3\u01f1\3\2\2\2\u01f3\u01f2\3\2\2\2\u01f4"+
		"\u01f6\3\2\2\2\u01f5\u01ef\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6_\3\2\2\2"+
		"\u01f7\u01f8\7\4\2\2\u01f8\u01f9\7(\2\2\u01f9\u01fa\7!\2\2\u01fa\u01ff"+
		"\7M\2\2\u01fb\u01fd\5\4\3\2\u01fc\u01fb\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd"+
		"\u01fe\3\2\2\2\u01fe\u0200\5l\67\2\u01ff\u01fc\3\2\2\2\u01ff\u0200\3\2"+
		"\2\2\u0200a\3\2\2\2\u0201\u0202\7\4\2\2\u0202\u0203\7&\2\2\u0203\u0204"+
		"\7!\2\2\u0204\u0205\5\60\31\2\u0205\u020d\7M\2\2\u0206\u0208\5\4\3\2\u0207"+
		"\u0206\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u020b\3\2\2\2\u0209\u020c\5^"+
		"\60\2\u020a\u020c\5`\61\2\u020b\u0209\3\2\2\2\u020b\u020a\3\2\2\2\u020c"+
		"\u020e\3\2\2\2\u020d\u0207\3\2\2\2\u020d\u020e\3\2\2\2\u020ec\3\2\2\2"+
		"\u020f\u0210\7\4\2\2\u0210\u0211\7)\2\2\u0211\u0212\7!\2\2\u0212\u0213"+
		"\5\n\6\2\u0213\u0214\7+\2\2\u0214\u0215\5\60\31\2\u0215\u0216\7M\2\2\u0216"+
		"e\3\2\2\2\u0217\u0218\7\4\2\2\u0218\u0219\7*\2\2\u0219\u021c\7!\2\2\u021a"+
		"\u021d\5\n\6\2\u021b\u021d\5\f\7\2\u021c\u021a\3\2\2\2\u021c\u021b\3\2"+
		"\2\2\u021d\u021e\3\2\2\2\u021e\u021f\7M\2\2\u021f\u0220\5l\67\2\u0220"+
		"g\3\2\2\2\u0221\u0222\7\4\2\2\u0222\u0223\5n8\2\u0223\u022c\7!\2\2\u0224"+
		"\u0229\5\60\31\2\u0225\u0226\7 \2\2\u0226\u0228\5\60\31\2\u0227\u0225"+
		"\3\2\2\2\u0228\u022b\3\2\2\2\u0229\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a"+
		"\u022d\3\2\2\2\u022b\u0229\3\2\2\2\u022c\u0224\3\2\2\2\u022c\u022d\3\2"+
		"\2\2\u022d\u0230\3\2\2\2\u022e\u022f\7\62\2\2\u022f\u0231\5\n\6\2\u0230"+
		"\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0233\7M"+
		"\2\2\u0233i\3\2\2\2\u0234\u0235\7L\2\2\u0235\u0236\5n8\2\u0236\u023f\7"+
		"!\2\2\u0237\u023c\5\60\31\2\u0238\u0239\7 \2\2\u0239\u023b\5\60\31\2\u023a"+
		"\u0238\3\2\2\2\u023b\u023e\3\2\2\2\u023c\u023a\3\2\2\2\u023c\u023d\3\2"+
		"\2\2\u023d\u0240\3\2\2\2\u023e\u023c\3\2\2\2\u023f\u0237\3\2\2\2\u023f"+
		"\u0240\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0242\7M\2\2\u0242k\3\2\2\2\u0243"+
		"\u0244\7\5\2\2\u0244\u0245\5N(\2\u0245\u0246\7\6\2\2\u0246m\3\2\2\2\u0247"+
		"\u0248\7O\2\2\u0248o\3\2\2\2F\u0081\u0087\u0098\u009f\u00a8\u00b4\u00bb"+
		"\u00be\u00d4\u00dd\u00ec\u00f9\u0103\u0109\u0114\u012e\u0135\u0139\u013d"+
		"\u0148\u014e\u0156\u015a\u0169\u016e\u0178\u017b\u017f\u0183\u018a\u018c"+
		"\u018f\u0193\u0196\u019a\u019e\u01a0\u01a8\u01ac\u01af\u01b7\u01ba\u01bd"+
		"\u01c1\u01c3\u01ca\u01cd\u01d5\u01d8\u01db\u01df\u01e1\u01e9\u01ec\u01ef"+
		"\u01f3\u01f5\u01fc\u01ff\u0207\u020b\u020d\u021c\u0229\u022c\u0230\u023c"+
		"\u023f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}