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
		KEYWORD_TO=40, KEYWORD_ELSEIF=41, KEYWORD_EACH=42, KEYWORD_ELSE=43, CONSTANT_TRUE=44, 
		CONSTANT_FALSE=45, CONSTANT_NULL=46, OPERATOR_AS=47, OPERATOR_ST=48, OPERATOR_RD=49, 
		OPERATOR_ND=50, OPERATOR_TH=51, OPERATOR_LESS_THAN=52, OPERATOR_GREATER_THAN=53, 
		OPERATOR_LESS_OR_EQUAL=54, OPERATOR_GREATER_OR_EQUAL=55, OPERATOR_EQUAL=56, 
		OPERATOR_AND=57, OPERATOR_OR=58, OPERATOR_IS=59, OPERATOR_NOT=60, OPERATOR_TO=61, 
		OPERATOR_POSSESSIVE=62, OPERATOR_OF=63, OPERATOR_PLUS=64, OPERATOR_MINUS=65, 
		OPERATOR_DIVIDE=66, OPERATOR_MULTIPLY=67, OPERATOR_MODULO=68, OPERATOR_POWER=69, 
		OPEN_PARENTHESES=70, CLOSE_PARENTHESES=71, DOUBLE_QUOTE_STRING=72, MWORD=73, 
		SCRIPT_BODY=74, SCRIPT_SHORT_BODY=75, STYLE_BODY=76, STYLE_SHORT_BODY=77;
	public static final int
		RULE_document = 0, RULE_whitespace = 1, RULE_left_nametag = 2, RULE_right_nametag = 3, 
		RULE_variable = 4, RULE_hookName = 5, RULE_word = 6, RULE_number = 7, 
		RULE_quote = 8, RULE_operand = 9, RULE_indexSuffix = 10, RULE_index_subexpression = 11, 
		RULE_index_expression = 12, RULE_signed_index_expression = 13, RULE_booleanOperator = 14, 
		RULE_subexpression = 15, RULE_expression = 16, RULE_constantTrue = 17, 
		RULE_constantFalse = 18, RULE_constantNull = 19, RULE_constant = 20, RULE_macroArgument = 21, 
		RULE_literal = 22, RULE_punctuation = 23, RULE_htmlOpenTag = 24, RULE_htmlCloseTag = 25, 
		RULE_htmlElement = 26, RULE_emphasis = 27, RULE_muinuta = 28, RULE_htmlAttributeName = 29, 
		RULE_htmlAttribute = 30, RULE_htmlAttributeValueContent = 31, RULE_htmlAttributeValue = 32, 
		RULE_script = 33, RULE_style = 34, RULE_element = 35, RULE_content = 36, 
		RULE_phrase = 37, RULE_hook_clause = 38, RULE_macro_clause = 39, RULE_each_clause = 40, 
		RULE_elseIf_clause = 41, RULE_else_clause = 42, RULE_if_clause = 43, RULE_when_clause = 44, 
		RULE_otherwise_clause = 45, RULE_choose_clause = 46, RULE_set_clause = 47, 
		RULE_macro = 48, RULE_hook = 49, RULE_macroName = 50;
	public static final String[] ruleNames = {
		"document", "whitespace", "left_nametag", "right_nametag", "variable", 
		"hookName", "word", "number", "quote", "operand", "indexSuffix", "index_subexpression", 
		"index_expression", "signed_index_expression", "booleanOperator", "subexpression", 
		"expression", "constantTrue", "constantFalse", "constantNull", "constant", 
		"macroArgument", "literal", "punctuation", "htmlOpenTag", "htmlCloseTag", 
		"htmlElement", "emphasis", "muinuta", "htmlAttributeName", "htmlAttribute", 
		"htmlAttributeValueContent", "htmlAttributeValue", "script", "style", 
		"element", "content", "phrase", "hook_clause", "macro_clause", "each_clause", 
		"elseIf_clause", "else_clause", "if_clause", "when_clause", "otherwise_clause", 
		"choose_clause", "set_clause", "macro", "hook", "macroName"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'['", "']'", null, null, null, "'?'", null, "'|'", 
		null, null, null, "'\"'", "'''", null, null, "''''", "'//'", "'~~'", "'^^'", 
		"'**'", null, null, null, null, null, null, null, "','", null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "'<='", "'>='", null, 
		null, null, null, null, null, null, null, "'+'", "'-'", null, null, "'%'", 
		"'^'", null, "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "HTML_COMMENT", "MACRO_OPEN", "OPEN_HOOK", "CLOSE_HOOK", "OPEN_SCRIPT", 
		"OPEN_STYLE", "LESS_THAN", "QUESTION_MARK", "DOLLAR_SIGN", "VERTICAL_BAR", 
		"COLON", "SLASH", "EQUALS", "DOUBLE_QUOTE", "SINGLE_QUOTE", "GREATER_THAN", 
		"ASTERISK", "DOUBLE_SINGLE_QUOTE", "DOUBLE_SLASH", "DOUBLE_TILDA", "DOUBLE_CIRCUMFLEX", 
		"DOUBLE_ASTERISK", "PUNCTUATION", "LITERAL", "WORD", "NUMBER", "WHITESPACE", 
		"SYMBOL", "MWHITESPACE", "MCOMMA", "MCOLON", "MNUMBER", "MDOLLAR_SIGN", 
		"MQUESTION_MARK", "KEYWORD_IF", "KEYWORD_CHOOSE", "KEYWORD_WHEN", "KEYWORD_OTHERWISE", 
		"KEYWORD_SET", "KEYWORD_TO", "KEYWORD_ELSEIF", "KEYWORD_EACH", "KEYWORD_ELSE", 
		"CONSTANT_TRUE", "CONSTANT_FALSE", "CONSTANT_NULL", "OPERATOR_AS", "OPERATOR_ST", 
		"OPERATOR_RD", "OPERATOR_ND", "OPERATOR_TH", "OPERATOR_LESS_THAN", "OPERATOR_GREATER_THAN", 
		"OPERATOR_LESS_OR_EQUAL", "OPERATOR_GREATER_OR_EQUAL", "OPERATOR_EQUAL", 
		"OPERATOR_AND", "OPERATOR_OR", "OPERATOR_IS", "OPERATOR_NOT", "OPERATOR_TO", 
		"OPERATOR_POSSESSIVE", "OPERATOR_OF", "OPERATOR_PLUS", "OPERATOR_MINUS", 
		"OPERATOR_DIVIDE", "OPERATOR_MULTIPLY", "OPERATOR_MODULO", "OPERATOR_POWER", 
		"OPEN_PARENTHESES", "CLOSE_PARENTHESES", "DOUBLE_QUOTE_STRING", "MWORD", 
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
			setState(102);
			content();
			setState(103);
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
			setState(105);
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
			setState(107);
			match(VERTICAL_BAR);
			setState(108);
			word();
			setState(109);
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
			setState(111);
			match(COLON);
			setState(112);
			word();
			setState(113);
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
			setState(119);
			switch (_input.LA(1)) {
			case DOLLAR_SIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(DOLLAR_SIGN);
				setState(116);
				word();
				}
				break;
			case MDOLLAR_SIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(MDOLLAR_SIGN);
				setState(118);
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
			setState(125);
			switch (_input.LA(1)) {
			case QUESTION_MARK:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(QUESTION_MARK);
				setState(122);
				word();
				}
				break;
			case MQUESTION_MARK:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				match(MQUESTION_MARK);
				setState(124);
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
			setState(127);
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
			setState(129);
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
			setState(131);
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
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public TerminalNode OPEN_PARENTHESES() { return getToken(TxMarkParser.OPEN_PARENTHESES, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESES() { return getToken(TxMarkParser.CLOSE_PARENTHESES, 0); }
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
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				hookName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				constant();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
				word();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(137);
				match(OPEN_PARENTHESES);
				setState(138);
				expression();
				setState(139);
				match(CLOSE_PARENTHESES);
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
			setState(143);
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

	public static class Index_subexpressionContext extends ParserRuleContext {
		public TerminalNode OPERATOR_POSSESSIVE() { return getToken(TxMarkParser.OPERATOR_POSSESSIVE, 0); }
		public QuoteContext quote() {
			return getRuleContext(QuoteContext.class,0);
		}
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public IndexSuffixContext indexSuffix() {
			return getRuleContext(IndexSuffixContext.class,0);
		}
		public TerminalNode OPEN_PARENTHESES() { return getToken(TxMarkParser.OPEN_PARENTHESES, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESES() { return getToken(TxMarkParser.CLOSE_PARENTHESES, 0); }
		public TerminalNode OPERATOR_OF() { return getToken(TxMarkParser.OPERATOR_OF, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
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
		enterRule(_localctx, 22, RULE_index_subexpression);
		try {
			setState(159);
			switch (_input.LA(1)) {
			case OPERATOR_POSSESSIVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(OPERATOR_POSSESSIVE);
				setState(155);
				switch (_input.LA(1)) {
				case NUMBER:
				case MNUMBER:
					{
					{
					setState(146);
					number();
					setState(147);
					indexSuffix();
					}
					}
					break;
				case OPEN_PARENTHESES:
					{
					{
					setState(149);
					match(OPEN_PARENTHESES);
					setState(150);
					expression();
					setState(151);
					match(CLOSE_PARENTHESES);
					}
					}
					break;
				case DOUBLE_QUOTE_STRING:
					{
					setState(153);
					quote();
					}
					break;
				case WORD:
				case MWORD:
					{
					setState(154);
					word();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case OPERATOR_OF:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				match(OPERATOR_OF);
				setState(158);
				operand();
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
		enterRule(_localctx, 24, RULE_index_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			operand();
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPERATOR_POSSESSIVE || _la==OPERATOR_OF) {
				{
				{
				setState(162);
				index_subexpression();
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
		enterRule(_localctx, 26, RULE_signed_index_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_la = _input.LA(1);
			if (_la==OPERATOR_MINUS) {
				{
				setState(168);
				match(OPERATOR_MINUS);
				}
			}

			setState(171);
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
		enterRule(_localctx, 28, RULE_booleanOperator);
		try {
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(OPERATOR_AND);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(OPERATOR_OR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				match(OPERATOR_LESS_THAN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(176);
				match(OPERATOR_GREATER_THAN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(177);
				match(OPERATOR_LESS_OR_EQUAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(178);
				match(OPERATOR_GREATER_OR_EQUAL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(179);
				match(OPERATOR_IS);
				setState(180);
				match(OPERATOR_NOT);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(181);
				match(OPERATOR_IS);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(182);
				match(OPERATOR_POWER);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(183);
				match(OPERATOR_MULTIPLY);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(184);
				match(OPERATOR_DIVIDE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(185);
				match(OPERATOR_MODULO);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(186);
				match(OPERATOR_PLUS);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(187);
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
		enterRule(_localctx, 30, RULE_subexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			booleanOperator();
			setState(191);
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
		enterRule(_localctx, 32, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			signed_index_expression();
			setState(197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(194);
					subexpression();
					}
					} 
				}
				setState(199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		enterRule(_localctx, 34, RULE_constantTrue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
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
		enterRule(_localctx, 36, RULE_constantFalse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
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
		enterRule(_localctx, 38, RULE_constantNull);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
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
		enterRule(_localctx, 40, RULE_constant);
		try {
			setState(212);
			switch (_input.LA(1)) {
			case NUMBER:
			case MNUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				number();
				}
				break;
			case CONSTANT_TRUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				constantTrue();
				}
				break;
			case CONSTANT_FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				constantFalse();
				}
				break;
			case CONSTANT_NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(209);
				constantNull();
				}
				break;
			case DOUBLE_QUOTE_STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(210);
				quote();
				}
				break;
			case WORD:
			case MWORD:
				enterOuterAlt(_localctx, 6);
				{
				setState(211);
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
		enterRule(_localctx, 42, RULE_macroArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
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
		enterRule(_localctx, 44, RULE_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
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
		enterRule(_localctx, 46, RULE_punctuation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
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
		enterRule(_localctx, 48, RULE_htmlOpenTag);
		int _la;
		try {
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(LESS_THAN);
				setState(221);
				word();
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (WORD - 25)) | (1L << (WHITESPACE - 25)) | (1L << (MWORD - 25)))) != 0)) {
					{
					{
					setState(222);
					htmlAttribute();
					}
					}
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(228);
				match(GREATER_THAN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				match(LESS_THAN);
				setState(231);
				word();
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (WORD - 25)) | (1L << (WHITESPACE - 25)) | (1L << (MWORD - 25)))) != 0)) {
					{
					{
					setState(232);
					htmlAttribute();
					}
					}
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(238);
				match(SLASH);
				setState(239);
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
		enterRule(_localctx, 50, RULE_htmlCloseTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(LESS_THAN);
			setState(244);
			match(SLASH);
			setState(245);
			word();
			setState(246);
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
		enterRule(_localctx, 52, RULE_htmlElement);
		try {
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				htmlOpenTag();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				htmlCloseTag();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				script();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(251);
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
		enterRule(_localctx, 54, RULE_emphasis);
		try {
			setState(278);
			switch (_input.LA(1)) {
			case ASTERISK:
				_localctx = new Single_emphasisContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				match(ASTERISK);
				setState(255);
				content();
				setState(256);
				match(ASTERISK);
				}
				break;
			case DOUBLE_ASTERISK:
				_localctx = new Double_emphasisContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				match(DOUBLE_ASTERISK);
				setState(259);
				content();
				setState(260);
				match(DOUBLE_ASTERISK);
				}
				break;
			case DOUBLE_SINGLE_QUOTE:
				_localctx = new BoldfaceContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(262);
				match(DOUBLE_SINGLE_QUOTE);
				setState(263);
				content();
				setState(264);
				match(DOUBLE_SINGLE_QUOTE);
				}
				break;
			case DOUBLE_SLASH:
				_localctx = new ItalicsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(266);
				match(DOUBLE_SLASH);
				setState(267);
				content();
				setState(268);
				match(DOUBLE_SLASH);
				}
				break;
			case DOUBLE_TILDA:
				_localctx = new DeletedContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(270);
				match(DOUBLE_TILDA);
				setState(271);
				content();
				setState(272);
				match(DOUBLE_TILDA);
				}
				break;
			case DOUBLE_CIRCUMFLEX:
				_localctx = new SuperscriptContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(274);
				match(DOUBLE_CIRCUMFLEX);
				setState(275);
				content();
				setState(276);
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
		enterRule(_localctx, 56, RULE_muinuta);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
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
		enterRule(_localctx, 58, RULE_htmlAttributeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
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
		enterRule(_localctx, 60, RULE_htmlAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(284);
				whitespace();
				}
			}

			setState(287);
			htmlAttributeName();
			setState(289);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(288);
				whitespace();
				}
			}

			setState(291);
			match(EQUALS);
			setState(293);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(292);
				whitespace();
				}
			}

			setState(295);
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
		enterRule(_localctx, 62, RULE_htmlAttributeValueContent);
		try {
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				phrase();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				hookName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(300);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(301);
				muinuta();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(302);
				whitespace();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(303);
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
		enterRule(_localctx, 64, RULE_htmlAttributeValue);
		try {
			int _alt;
			setState(322);
			switch (_input.LA(1)) {
			case DOUBLE_QUOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				match(DOUBLE_QUOTE);
				setState(310);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(307);
						htmlAttributeValueContent();
						}
						} 
					}
					setState(312);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				setState(313);
				match(DOUBLE_QUOTE);
				}
				break;
			case SINGLE_QUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				match(SINGLE_QUOTE);
				setState(318);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(315);
						htmlAttributeValueContent();
						}
						} 
					}
					setState(320);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				setState(321);
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
		enterRule(_localctx, 66, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(OPEN_SCRIPT);
			setState(325);
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
		enterRule(_localctx, 68, RULE_style);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(OPEN_STYLE);
			setState(328);
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
		enterRule(_localctx, 70, RULE_element);
		int _la;
		try {
			int _alt;
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				if_clause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				choose_clause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(332);
				each_clause();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(333);
				set_clause();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(334);
				macro_clause();
				setState(341);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(336);
						_la = _input.LA(1);
						if (_la==WHITESPACE) {
							{
							setState(335);
							whitespace();
							}
						}

						setState(338);
						macro_clause();
						}
						} 
					}
					setState(343);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(344);
				hook_clause();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(345);
				htmlElement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(346);
				hookName();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(347);
				variable();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(348);
				literal();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(349);
				emphasis();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(350);
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
		enterRule(_localctx, 72, RULE_content);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			_la = _input.LA(1);
			if (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & ((1L << (PUNCTUATION - 23)) | (1L << (WORD - 23)) | (1L << (NUMBER - 23)) | (1L << (WHITESPACE - 23)) | (1L << (MNUMBER - 23)) | (1L << (MWORD - 23)))) != 0)) {
				{
				setState(353);
				phrase();
				}
			}

			setState(362);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(356);
					element();
					setState(358);
					_la = _input.LA(1);
					if (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & ((1L << (PUNCTUATION - 23)) | (1L << (WORD - 23)) | (1L << (NUMBER - 23)) | (1L << (WHITESPACE - 23)) | (1L << (MNUMBER - 23)) | (1L << (MWORD - 23)))) != 0)) {
						{
						setState(357);
						phrase();
						}
					}

					}
					} 
				}
				setState(364);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		enterRule(_localctx, 74, RULE_phrase);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(369); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(369);
					switch (_input.LA(1)) {
					case WORD:
					case MWORD:
						{
						setState(365);
						word();
						}
						break;
					case NUMBER:
					case MNUMBER:
						{
						setState(366);
						number();
						}
						break;
					case WHITESPACE:
						{
						setState(367);
						whitespace();
						}
						break;
					case PUNCTUATION:
						{
						setState(368);
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
				setState(371); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		enterRule(_localctx, 76, RULE_hook_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			_la = _input.LA(1);
			if (_la==VERTICAL_BAR) {
				{
				setState(373);
				left_nametag();
				}
			}

			setState(376);
			hook();
			setState(378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(377);
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
		enterRule(_localctx, 78, RULE_macro_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			_la = _input.LA(1);
			if (_la==VERTICAL_BAR) {
				{
				setState(380);
				left_nametag();
				}
			}

			setState(383);
			macro();
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(385);
				_la = _input.LA(1);
				if (_la==WHITESPACE) {
					{
					setState(384);
					whitespace();
					}
				}

				setState(387);
				hook();
				setState(389);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(388);
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
		public TerminalNode CLOSE_PARENTHESES() { return getToken(TxMarkParser.CLOSE_PARENTHESES, 0); }
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
		enterRule(_localctx, 80, RULE_each_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(MACRO_OPEN);
			setState(394);
			match(KEYWORD_EACH);
			setState(395);
			match(MCOLON);
			setState(396);
			macroArgument();
			setState(399);
			_la = _input.LA(1);
			if (_la==OPERATOR_AS) {
				{
				setState(397);
				match(OPERATOR_AS);
				setState(398);
				variable();
				}
			}

			setState(401);
			match(CLOSE_PARENTHESES);
			setState(406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(403);
				_la = _input.LA(1);
				if (_la==WHITESPACE) {
					{
					setState(402);
					whitespace();
					}
				}

				setState(405);
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
		public TerminalNode CLOSE_PARENTHESES() { return getToken(TxMarkParser.CLOSE_PARENTHESES, 0); }
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
		enterRule(_localctx, 82, RULE_elseIf_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(MACRO_OPEN);
			setState(409);
			match(KEYWORD_ELSEIF);
			setState(410);
			match(MCOLON);
			setState(411);
			macroArgument();
			setState(412);
			match(CLOSE_PARENTHESES);
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(414);
				_la = _input.LA(1);
				if (_la==WHITESPACE) {
					{
					setState(413);
					whitespace();
					}
				}

				setState(416);
				hook();
				}
				break;
			}
			setState(426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(420);
				_la = _input.LA(1);
				if (_la==WHITESPACE) {
					{
					setState(419);
					whitespace();
					}
				}

				setState(424);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(422);
					elseIf_clause();
					}
					break;
				case 2:
					{
					setState(423);
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
		public TerminalNode CLOSE_PARENTHESES() { return getToken(TxMarkParser.CLOSE_PARENTHESES, 0); }
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
		enterRule(_localctx, 84, RULE_else_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(MACRO_OPEN);
			setState(429);
			match(KEYWORD_ELSE);
			setState(430);
			match(MCOLON);
			setState(431);
			match(CLOSE_PARENTHESES);
			setState(436);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(433);
				_la = _input.LA(1);
				if (_la==WHITESPACE) {
					{
					setState(432);
					whitespace();
					}
				}

				setState(435);
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
		public TerminalNode CLOSE_PARENTHESES() { return getToken(TxMarkParser.CLOSE_PARENTHESES, 0); }
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
		enterRule(_localctx, 86, RULE_if_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(MACRO_OPEN);
			setState(439);
			match(KEYWORD_IF);
			setState(440);
			match(MCOLON);
			setState(441);
			macroArgument();
			setState(442);
			match(CLOSE_PARENTHESES);
			setState(447);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(444);
				_la = _input.LA(1);
				if (_la==WHITESPACE) {
					{
					setState(443);
					whitespace();
					}
				}

				setState(446);
				hook();
				}
				break;
			}
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(450);
				_la = _input.LA(1);
				if (_la==WHITESPACE) {
					{
					setState(449);
					whitespace();
					}
				}

				setState(454);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(452);
					elseIf_clause();
					}
					break;
				case 2:
					{
					setState(453);
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
		public TerminalNode CLOSE_PARENTHESES() { return getToken(TxMarkParser.CLOSE_PARENTHESES, 0); }
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
		enterRule(_localctx, 88, RULE_when_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(MACRO_OPEN);
			setState(459);
			match(KEYWORD_WHEN);
			setState(460);
			match(MCOLON);
			setState(461);
			macroArgument();
			setState(462);
			match(CLOSE_PARENTHESES);
			setState(467);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(464);
				_la = _input.LA(1);
				if (_la==WHITESPACE) {
					{
					setState(463);
					whitespace();
					}
				}

				setState(466);
				hook();
				}
				break;
			}
			setState(476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(470);
				_la = _input.LA(1);
				if (_la==WHITESPACE) {
					{
					setState(469);
					whitespace();
					}
				}

				setState(474);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(472);
					when_clause();
					}
					break;
				case 2:
					{
					setState(473);
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
		public TerminalNode CLOSE_PARENTHESES() { return getToken(TxMarkParser.CLOSE_PARENTHESES, 0); }
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
		enterRule(_localctx, 90, RULE_otherwise_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			match(MACRO_OPEN);
			setState(479);
			match(KEYWORD_OTHERWISE);
			setState(480);
			match(MCOLON);
			setState(481);
			match(CLOSE_PARENTHESES);
			setState(486);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(483);
				_la = _input.LA(1);
				if (_la==WHITESPACE) {
					{
					setState(482);
					whitespace();
					}
				}

				setState(485);
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
		public TerminalNode CLOSE_PARENTHESES() { return getToken(TxMarkParser.CLOSE_PARENTHESES, 0); }
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
		enterRule(_localctx, 92, RULE_choose_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(MACRO_OPEN);
			setState(489);
			match(KEYWORD_CHOOSE);
			setState(490);
			match(MCOLON);
			setState(491);
			macroArgument();
			setState(492);
			match(CLOSE_PARENTHESES);
			setState(500);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(494);
				_la = _input.LA(1);
				if (_la==WHITESPACE) {
					{
					setState(493);
					whitespace();
					}
				}

				setState(498);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(496);
					when_clause();
					}
					break;
				case 2:
					{
					setState(497);
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
		public TerminalNode CLOSE_PARENTHESES() { return getToken(TxMarkParser.CLOSE_PARENTHESES, 0); }
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
		enterRule(_localctx, 94, RULE_set_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			match(MACRO_OPEN);
			setState(503);
			match(KEYWORD_SET);
			setState(504);
			match(MCOLON);
			setState(505);
			variable();
			setState(506);
			match(KEYWORD_TO);
			setState(507);
			macroArgument();
			setState(508);
			match(CLOSE_PARENTHESES);
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
		public TerminalNode CLOSE_PARENTHESES() { return getToken(TxMarkParser.CLOSE_PARENTHESES, 0); }
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
		enterRule(_localctx, 96, RULE_macro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(MACRO_OPEN);
			setState(511);
			macroName();
			setState(512);
			match(MCOLON);
			setState(521);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUESTION_MARK) | (1L << DOLLAR_SIGN) | (1L << WORD) | (1L << NUMBER) | (1L << MNUMBER) | (1L << MDOLLAR_SIGN) | (1L << MQUESTION_MARK) | (1L << CONSTANT_TRUE) | (1L << CONSTANT_FALSE) | (1L << CONSTANT_NULL))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (OPERATOR_MINUS - 65)) | (1L << (OPEN_PARENTHESES - 65)) | (1L << (DOUBLE_QUOTE_STRING - 65)) | (1L << (MWORD - 65)))) != 0)) {
				{
				setState(513);
				macroArgument();
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MCOMMA) {
					{
					{
					setState(514);
					match(MCOMMA);
					setState(515);
					macroArgument();
					}
					}
					setState(520);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(525);
			_la = _input.LA(1);
			if (_la==OPERATOR_AS) {
				{
				setState(523);
				match(OPERATOR_AS);
				setState(524);
				variable();
				}
			}

			setState(527);
			match(CLOSE_PARENTHESES);
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
		enterRule(_localctx, 98, RULE_hook);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			match(OPEN_HOOK);
			setState(530);
			content();
			setState(531);
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
		enterRule(_localctx, 100, RULE_macroName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3O\u021a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\5\6z\n\6\3\7\3\7\3\7\3\7\5\7\u0080\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0090\n\13\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u009e\n\r\3\r\3\r\5\r\u00a2\n\r\3\16"+
		"\3\16\7\16\u00a6\n\16\f\16\16\16\u00a9\13\16\3\17\5\17\u00ac\n\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u00bf\n\20\3\21\3\21\3\21\3\22\3\22\7\22\u00c6\n\22\f"+
		"\22\16\22\u00c9\13\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u00d7\n\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32"+
		"\7\32\u00e2\n\32\f\32\16\32\u00e5\13\32\3\32\3\32\3\32\3\32\3\32\7\32"+
		"\u00ec\n\32\f\32\16\32\u00ef\13\32\3\32\3\32\3\32\5\32\u00f4\n\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\5\34\u00ff\n\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0119\n\35\3\36\3\36\3\37\3\37"+
		"\3 \5 \u0120\n \3 \3 \5 \u0124\n \3 \3 \5 \u0128\n \3 \3 \3!\3!\3!\3!"+
		"\3!\3!\3!\5!\u0133\n!\3\"\3\"\7\"\u0137\n\"\f\"\16\"\u013a\13\"\3\"\3"+
		"\"\3\"\7\"\u013f\n\"\f\"\16\"\u0142\13\"\3\"\5\"\u0145\n\"\3#\3#\3#\3"+
		"$\3$\3$\3%\3%\3%\3%\3%\3%\5%\u0153\n%\3%\7%\u0156\n%\f%\16%\u0159\13%"+
		"\3%\3%\3%\3%\3%\3%\3%\5%\u0162\n%\3&\5&\u0165\n&\3&\3&\5&\u0169\n&\7&"+
		"\u016b\n&\f&\16&\u016e\13&\3\'\3\'\3\'\3\'\6\'\u0174\n\'\r\'\16\'\u0175"+
		"\3(\5(\u0179\n(\3(\3(\5(\u017d\n(\3)\5)\u0180\n)\3)\3)\5)\u0184\n)\3)"+
		"\3)\5)\u0188\n)\5)\u018a\n)\3*\3*\3*\3*\3*\3*\5*\u0192\n*\3*\3*\5*\u0196"+
		"\n*\3*\5*\u0199\n*\3+\3+\3+\3+\3+\3+\5+\u01a1\n+\3+\5+\u01a4\n+\3+\5+"+
		"\u01a7\n+\3+\3+\5+\u01ab\n+\5+\u01ad\n+\3,\3,\3,\3,\3,\5,\u01b4\n,\3,"+
		"\5,\u01b7\n,\3-\3-\3-\3-\3-\3-\5-\u01bf\n-\3-\5-\u01c2\n-\3-\5-\u01c5"+
		"\n-\3-\3-\5-\u01c9\n-\5-\u01cb\n-\3.\3.\3.\3.\3.\3.\5.\u01d3\n.\3.\5."+
		"\u01d6\n.\3.\5.\u01d9\n.\3.\3.\5.\u01dd\n.\5.\u01df\n.\3/\3/\3/\3/\3/"+
		"\5/\u01e6\n/\3/\5/\u01e9\n/\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u01f1\n"+
		"\60\3\60\3\60\5\60\u01f5\n\60\5\60\u01f7\n\60\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u0207\n\62\f\62\16"+
		"\62\u020a\13\62\5\62\u020c\n\62\3\62\3\62\5\62\u0210\n\62\3\62\3\62\3"+
		"\63\3\63\3\63\3\63\3\64\3\64\3\64\5\u0138\u0140\u016c\2\65\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^"+
		"`bdf\2\b\4\2\33\33KK\4\2\34\34\"\"\3\2\62\65\3\2\t\22\3\2LM\3\2NO\u0252"+
		"\2h\3\2\2\2\4k\3\2\2\2\6m\3\2\2\2\bq\3\2\2\2\ny\3\2\2\2\f\177\3\2\2\2"+
		"\16\u0081\3\2\2\2\20\u0083\3\2\2\2\22\u0085\3\2\2\2\24\u008f\3\2\2\2\26"+
		"\u0091\3\2\2\2\30\u00a1\3\2\2\2\32\u00a3\3\2\2\2\34\u00ab\3\2\2\2\36\u00be"+
		"\3\2\2\2 \u00c0\3\2\2\2\"\u00c3\3\2\2\2$\u00ca\3\2\2\2&\u00cc\3\2\2\2"+
		"(\u00ce\3\2\2\2*\u00d6\3\2\2\2,\u00d8\3\2\2\2.\u00da\3\2\2\2\60\u00dc"+
		"\3\2\2\2\62\u00f3\3\2\2\2\64\u00f5\3\2\2\2\66\u00fe\3\2\2\28\u0118\3\2"+
		"\2\2:\u011a\3\2\2\2<\u011c\3\2\2\2>\u011f\3\2\2\2@\u0132\3\2\2\2B\u0144"+
		"\3\2\2\2D\u0146\3\2\2\2F\u0149\3\2\2\2H\u0161\3\2\2\2J\u0164\3\2\2\2L"+
		"\u0173\3\2\2\2N\u0178\3\2\2\2P\u017f\3\2\2\2R\u018b\3\2\2\2T\u019a\3\2"+
		"\2\2V\u01ae\3\2\2\2X\u01b8\3\2\2\2Z\u01cc\3\2\2\2\\\u01e0\3\2\2\2^\u01ea"+
		"\3\2\2\2`\u01f8\3\2\2\2b\u0200\3\2\2\2d\u0213\3\2\2\2f\u0217\3\2\2\2h"+
		"i\5J&\2ij\7\2\2\3j\3\3\2\2\2kl\7\35\2\2l\5\3\2\2\2mn\7\f\2\2no\5\16\b"+
		"\2op\7\r\2\2p\7\3\2\2\2qr\7\r\2\2rs\5\16\b\2st\7\f\2\2t\t\3\2\2\2uv\7"+
		"\13\2\2vz\5\16\b\2wx\7#\2\2xz\5\16\b\2yu\3\2\2\2yw\3\2\2\2z\13\3\2\2\2"+
		"{|\7\n\2\2|\u0080\5\16\b\2}~\7$\2\2~\u0080\5\16\b\2\177{\3\2\2\2\177}"+
		"\3\2\2\2\u0080\r\3\2\2\2\u0081\u0082\t\2\2\2\u0082\17\3\2\2\2\u0083\u0084"+
		"\t\3\2\2\u0084\21\3\2\2\2\u0085\u0086\7J\2\2\u0086\23\3\2\2\2\u0087\u0090"+
		"\5\n\6\2\u0088\u0090\5\f\7\2\u0089\u0090\5*\26\2\u008a\u0090\5\16\b\2"+
		"\u008b\u008c\7H\2\2\u008c\u008d\5\"\22\2\u008d\u008e\7I\2\2\u008e\u0090"+
		"\3\2\2\2\u008f\u0087\3\2\2\2\u008f\u0088\3\2\2\2\u008f\u0089\3\2\2\2\u008f"+
		"\u008a\3\2\2\2\u008f\u008b\3\2\2\2\u0090\25\3\2\2\2\u0091\u0092\t\4\2"+
		"\2\u0092\27\3\2\2\2\u0093\u009d\7@\2\2\u0094\u0095\5\20\t\2\u0095\u0096"+
		"\5\26\f\2\u0096\u009e\3\2\2\2\u0097\u0098\7H\2\2\u0098\u0099\5\"\22\2"+
		"\u0099\u009a\7I\2\2\u009a\u009e\3\2\2\2\u009b\u009e\5\22\n\2\u009c\u009e"+
		"\5\16\b\2\u009d\u0094\3\2\2\2\u009d\u0097\3\2\2\2\u009d\u009b\3\2\2\2"+
		"\u009d\u009c\3\2\2\2\u009e\u00a2\3\2\2\2\u009f\u00a0\7A\2\2\u00a0\u00a2"+
		"\5\24\13\2\u00a1\u0093\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\31\3\2\2\2\u00a3"+
		"\u00a7\5\24\13\2\u00a4\u00a6\5\30\r\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9"+
		"\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\33\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00aa\u00ac\7C\2\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2"+
		"\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\5\32\16\2\u00ae\35\3\2\2\2\u00af"+
		"\u00bf\7;\2\2\u00b0\u00bf\7<\2\2\u00b1\u00bf\7\66\2\2\u00b2\u00bf\7\67"+
		"\2\2\u00b3\u00bf\78\2\2\u00b4\u00bf\79\2\2\u00b5\u00b6\7=\2\2\u00b6\u00bf"+
		"\7>\2\2\u00b7\u00bf\7=\2\2\u00b8\u00bf\7G\2\2\u00b9\u00bf\7E\2\2\u00ba"+
		"\u00bf\7D\2\2\u00bb\u00bf\7F\2\2\u00bc\u00bf\7B\2\2\u00bd\u00bf\7C\2\2"+
		"\u00be\u00af\3\2\2\2\u00be\u00b0\3\2\2\2\u00be\u00b1\3\2\2\2\u00be\u00b2"+
		"\3\2\2\2\u00be\u00b3\3\2\2\2\u00be\u00b4\3\2\2\2\u00be\u00b5\3\2\2\2\u00be"+
		"\u00b7\3\2\2\2\u00be\u00b8\3\2\2\2\u00be\u00b9\3\2\2\2\u00be\u00ba\3\2"+
		"\2\2\u00be\u00bb\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf"+
		"\37\3\2\2\2\u00c0\u00c1\5\36\20\2\u00c1\u00c2\5\"\22\2\u00c2!\3\2\2\2"+
		"\u00c3\u00c7\5\34\17\2\u00c4\u00c6\5 \21\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9"+
		"\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8#\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00ca\u00cb\7.\2\2\u00cb%\3\2\2\2\u00cc\u00cd\7/\2\2\u00cd"+
		"\'\3\2\2\2\u00ce\u00cf\7\60\2\2\u00cf)\3\2\2\2\u00d0\u00d7\5\20\t\2\u00d1"+
		"\u00d7\5$\23\2\u00d2\u00d7\5&\24\2\u00d3\u00d7\5(\25\2\u00d4\u00d7\5\22"+
		"\n\2\u00d5\u00d7\5\16\b\2\u00d6\u00d0\3\2\2\2\u00d6\u00d1\3\2\2\2\u00d6"+
		"\u00d2\3\2\2\2\u00d6\u00d3\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d5\3\2"+
		"\2\2\u00d7+\3\2\2\2\u00d8\u00d9\5\"\22\2\u00d9-\3\2\2\2\u00da\u00db\7"+
		"\32\2\2\u00db/\3\2\2\2\u00dc\u00dd\7\31\2\2\u00dd\61\3\2\2\2\u00de\u00df"+
		"\7\t\2\2\u00df\u00e3\5\16\b\2\u00e0\u00e2\5> \2\u00e1\u00e0\3\2\2\2\u00e2"+
		"\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2"+
		"\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7\7\22\2\2\u00e7\u00f4\3\2\2\2\u00e8"+
		"\u00e9\7\t\2\2\u00e9\u00ed\5\16\b\2\u00ea\u00ec\5> \2\u00eb\u00ea\3\2"+
		"\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00f0\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f1\7\16\2\2\u00f1\u00f2\7"+
		"\22\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00de\3\2\2\2\u00f3\u00e8\3\2\2\2\u00f4"+
		"\63\3\2\2\2\u00f5\u00f6\7\t\2\2\u00f6\u00f7\7\16\2\2\u00f7\u00f8\5\16"+
		"\b\2\u00f8\u00f9\7\22\2\2\u00f9\65\3\2\2\2\u00fa\u00ff\5\62\32\2\u00fb"+
		"\u00ff\5\64\33\2\u00fc\u00ff\5D#\2\u00fd\u00ff\5F$\2\u00fe\u00fa\3\2\2"+
		"\2\u00fe\u00fb\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff\67"+
		"\3\2\2\2\u0100\u0101\7\23\2\2\u0101\u0102\5J&\2\u0102\u0103\7\23\2\2\u0103"+
		"\u0119\3\2\2\2\u0104\u0105\7\30\2\2\u0105\u0106\5J&\2\u0106\u0107\7\30"+
		"\2\2\u0107\u0119\3\2\2\2\u0108\u0109\7\24\2\2\u0109\u010a\5J&\2\u010a"+
		"\u010b\7\24\2\2\u010b\u0119\3\2\2\2\u010c\u010d\7\25\2\2\u010d\u010e\5"+
		"J&\2\u010e\u010f\7\25\2\2\u010f\u0119\3\2\2\2\u0110\u0111\7\26\2\2\u0111"+
		"\u0112\5J&\2\u0112\u0113\7\26\2\2\u0113\u0119\3\2\2\2\u0114\u0115\7\27"+
		"\2\2\u0115\u0116\5J&\2\u0116\u0117\7\27\2\2\u0117\u0119\3\2\2\2\u0118"+
		"\u0100\3\2\2\2\u0118\u0104\3\2\2\2\u0118\u0108\3\2\2\2\u0118\u010c\3\2"+
		"\2\2\u0118\u0110\3\2\2\2\u0118\u0114\3\2\2\2\u01199\3\2\2\2\u011a\u011b"+
		"\t\5\2\2\u011b;\3\2\2\2\u011c\u011d\5\16\b\2\u011d=\3\2\2\2\u011e\u0120"+
		"\5\4\3\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\u0123\5<\37\2\u0122\u0124\5\4\3\2\u0123\u0122\3\2\2\2\u0123\u0124\3\2"+
		"\2\2\u0124\u0125\3\2\2\2\u0125\u0127\7\17\2\2\u0126\u0128\5\4\3\2\u0127"+
		"\u0126\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\5B"+
		"\"\2\u012a?\3\2\2\2\u012b\u0133\5L\'\2\u012c\u0133\5\f\7\2\u012d\u0133"+
		"\5\n\6\2\u012e\u0133\5.\30\2\u012f\u0133\5:\36\2\u0130\u0133\5\4\3\2\u0131"+
		"\u0133\5\60\31\2\u0132\u012b\3\2\2\2\u0132\u012c\3\2\2\2\u0132\u012d\3"+
		"\2\2\2\u0132\u012e\3\2\2\2\u0132\u012f\3\2\2\2\u0132\u0130\3\2\2\2\u0132"+
		"\u0131\3\2\2\2\u0133A\3\2\2\2\u0134\u0138\7\20\2\2\u0135\u0137\5@!\2\u0136"+
		"\u0135\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0139\3\2\2\2\u0138\u0136\3\2"+
		"\2\2\u0139\u013b\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u0145\7\20\2\2\u013c"+
		"\u0140\7\21\2\2\u013d\u013f\5@!\2\u013e\u013d\3\2\2\2\u013f\u0142\3\2"+
		"\2\2\u0140\u0141\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0143\3\2\2\2\u0142"+
		"\u0140\3\2\2\2\u0143\u0145\7\21\2\2\u0144\u0134\3\2\2\2\u0144\u013c\3"+
		"\2\2\2\u0145C\3\2\2\2\u0146\u0147\7\7\2\2\u0147\u0148\t\6\2\2\u0148E\3"+
		"\2\2\2\u0149\u014a\7\b\2\2\u014a\u014b\t\7\2\2\u014bG\3\2\2\2\u014c\u0162"+
		"\5X-\2\u014d\u0162\5^\60\2\u014e\u0162\5R*\2\u014f\u0162\5`\61\2\u0150"+
		"\u0157\5P)\2\u0151\u0153\5\4\3\2\u0152\u0151\3\2\2\2\u0152\u0153\3\2\2"+
		"\2\u0153\u0154\3\2\2\2\u0154\u0156\5P)\2\u0155\u0152\3\2\2\2\u0156\u0159"+
		"\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0162\3\2\2\2\u0159"+
		"\u0157\3\2\2\2\u015a\u0162\5N(\2\u015b\u0162\5\66\34\2\u015c\u0162\5\f"+
		"\7\2\u015d\u0162\5\n\6\2\u015e\u0162\5.\30\2\u015f\u0162\58\35\2\u0160"+
		"\u0162\5:\36\2\u0161\u014c\3\2\2\2\u0161\u014d\3\2\2\2\u0161\u014e\3\2"+
		"\2\2\u0161\u014f\3\2\2\2\u0161\u0150\3\2\2\2\u0161\u015a\3\2\2\2\u0161"+
		"\u015b\3\2\2\2\u0161\u015c\3\2\2\2\u0161\u015d\3\2\2\2\u0161\u015e\3\2"+
		"\2\2\u0161\u015f\3\2\2\2\u0161\u0160\3\2\2\2\u0162I\3\2\2\2\u0163\u0165"+
		"\5L\'\2\u0164\u0163\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u016c\3\2\2\2\u0166"+
		"\u0168\5H%\2\u0167\u0169\5L\'\2\u0168\u0167\3\2\2\2\u0168\u0169\3\2\2"+
		"\2\u0169\u016b\3\2\2\2\u016a\u0166\3\2\2\2\u016b\u016e\3\2\2\2\u016c\u016d"+
		"\3\2\2\2\u016c\u016a\3\2\2\2\u016dK\3\2\2\2\u016e\u016c\3\2\2\2\u016f"+
		"\u0174\5\16\b\2\u0170\u0174\5\20\t\2\u0171\u0174\5\4\3\2\u0172\u0174\5"+
		"\60\31\2\u0173\u016f\3\2\2\2\u0173\u0170\3\2\2\2\u0173\u0171\3\2\2\2\u0173"+
		"\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2"+
		"\2\2\u0176M\3\2\2\2\u0177\u0179\5\6\4\2\u0178\u0177\3\2\2\2\u0178\u0179"+
		"\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017c\5d\63\2\u017b\u017d\5\b\5\2\u017c"+
		"\u017b\3\2\2\2\u017c\u017d\3\2\2\2\u017dO\3\2\2\2\u017e\u0180\5\6\4\2"+
		"\u017f\u017e\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0189"+
		"\5b\62\2\u0182\u0184\5\4\3\2\u0183\u0182\3\2\2\2\u0183\u0184\3\2\2\2\u0184"+
		"\u0185\3\2\2\2\u0185\u0187\5d\63\2\u0186\u0188\5\b\5\2\u0187\u0186\3\2"+
		"\2\2\u0187\u0188\3\2\2\2\u0188\u018a\3\2\2\2\u0189\u0183\3\2\2\2\u0189"+
		"\u018a\3\2\2\2\u018aQ\3\2\2\2\u018b\u018c\7\4\2\2\u018c\u018d\7,\2\2\u018d"+
		"\u018e\7!\2\2\u018e\u0191\5,\27\2\u018f\u0190\7\61\2\2\u0190\u0192\5\n"+
		"\6\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193\3\2\2\2\u0193"+
		"\u0198\7I\2\2\u0194\u0196\5\4\3\2\u0195\u0194\3\2\2\2\u0195\u0196\3\2"+
		"\2\2\u0196\u0197\3\2\2\2\u0197\u0199\5d\63\2\u0198\u0195\3\2\2\2\u0198"+
		"\u0199\3\2\2\2\u0199S\3\2\2\2\u019a\u019b\7\4\2\2\u019b\u019c\7+\2\2\u019c"+
		"\u019d\7!\2\2\u019d\u019e\5,\27\2\u019e\u01a3\7I\2\2\u019f\u01a1\5\4\3"+
		"\2\u01a0\u019f\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a4"+
		"\5d\63\2\u01a3\u01a0\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01ac\3\2\2\2\u01a5"+
		"\u01a7\5\4\3\2\u01a6\u01a5\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01aa\3\2"+
		"\2\2\u01a8\u01ab\5T+\2\u01a9\u01ab\5V,\2\u01aa\u01a8\3\2\2\2\u01aa\u01a9"+
		"\3\2\2\2\u01ab\u01ad\3\2\2\2\u01ac\u01a6\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad"+
		"U\3\2\2\2\u01ae\u01af\7\4\2\2\u01af\u01b0\7-\2\2\u01b0\u01b1\7!\2\2\u01b1"+
		"\u01b6\7I\2\2\u01b2\u01b4\5\4\3\2\u01b3\u01b2\3\2\2\2\u01b3\u01b4\3\2"+
		"\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b7\5d\63\2\u01b6\u01b3\3\2\2\2\u01b6"+
		"\u01b7\3\2\2\2\u01b7W\3\2\2\2\u01b8\u01b9\7\4\2\2\u01b9\u01ba\7%\2\2\u01ba"+
		"\u01bb\7!\2\2\u01bb\u01bc\5,\27\2\u01bc\u01c1\7I\2\2\u01bd\u01bf\5\4\3"+
		"\2\u01be\u01bd\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c2"+
		"\5d\63\2\u01c1\u01be\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01ca\3\2\2\2\u01c3"+
		"\u01c5\5\4\3\2\u01c4\u01c3\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c8\3\2"+
		"\2\2\u01c6\u01c9\5T+\2\u01c7\u01c9\5V,\2\u01c8\u01c6\3\2\2\2\u01c8\u01c7"+
		"\3\2\2\2\u01c9\u01cb\3\2\2\2\u01ca\u01c4\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb"+
		"Y\3\2\2\2\u01cc\u01cd\7\4\2\2\u01cd\u01ce\7\'\2\2\u01ce\u01cf\7!\2\2\u01cf"+
		"\u01d0\5,\27\2\u01d0\u01d5\7I\2\2\u01d1\u01d3\5\4\3\2\u01d2\u01d1\3\2"+
		"\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d6\5d\63\2\u01d5"+
		"\u01d2\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01de\3\2\2\2\u01d7\u01d9\5\4"+
		"\3\2\u01d8\u01d7\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01dc\3\2\2\2\u01da"+
		"\u01dd\5Z.\2\u01db\u01dd\5\\/\2\u01dc\u01da\3\2\2\2\u01dc\u01db\3\2\2"+
		"\2\u01dd\u01df\3\2\2\2\u01de\u01d8\3\2\2\2\u01de\u01df\3\2\2\2\u01df["+
		"\3\2\2\2\u01e0\u01e1\7\4\2\2\u01e1\u01e2\7(\2\2\u01e2\u01e3\7!\2\2\u01e3"+
		"\u01e8\7I\2\2\u01e4\u01e6\5\4\3\2\u01e5\u01e4\3\2\2\2\u01e5\u01e6\3\2"+
		"\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e9\5d\63\2\u01e8\u01e5\3\2\2\2\u01e8"+
		"\u01e9\3\2\2\2\u01e9]\3\2\2\2\u01ea\u01eb\7\4\2\2\u01eb\u01ec\7&\2\2\u01ec"+
		"\u01ed\7!\2\2\u01ed\u01ee\5,\27\2\u01ee\u01f6\7I\2\2\u01ef\u01f1\5\4\3"+
		"\2\u01f0\u01ef\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f4\3\2\2\2\u01f2\u01f5"+
		"\5Z.\2\u01f3\u01f5\5\\/\2\u01f4\u01f2\3\2\2\2\u01f4\u01f3\3\2\2\2\u01f5"+
		"\u01f7\3\2\2\2\u01f6\u01f0\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7_\3\2\2\2"+
		"\u01f8\u01f9\7\4\2\2\u01f9\u01fa\7)\2\2\u01fa\u01fb\7!\2\2\u01fb\u01fc"+
		"\5\n\6\2\u01fc\u01fd\7*\2\2\u01fd\u01fe\5,\27\2\u01fe\u01ff\7I\2\2\u01ff"+
		"a\3\2\2\2\u0200\u0201\7\4\2\2\u0201\u0202\5f\64\2\u0202\u020b\7!\2\2\u0203"+
		"\u0208\5,\27\2\u0204\u0205\7 \2\2\u0205\u0207\5,\27\2\u0206\u0204\3\2"+
		"\2\2\u0207\u020a\3\2\2\2\u0208\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209"+
		"\u020c\3\2\2\2\u020a\u0208\3\2\2\2\u020b\u0203\3\2\2\2\u020b\u020c\3\2"+
		"\2\2\u020c\u020f\3\2\2\2\u020d\u020e\7\61\2\2\u020e\u0210\5\n\6\2\u020f"+
		"\u020d\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0212\7I"+
		"\2\2\u0212c\3\2\2\2\u0213\u0214\7\5\2\2\u0214\u0215\5J&\2\u0215\u0216"+
		"\7\6\2\2\u0216e\3\2\2\2\u0217\u0218\7K\2\2\u0218g\3\2\2\2By\177\u008f"+
		"\u009d\u00a1\u00a7\u00ab\u00be\u00c7\u00d6\u00e3\u00ed\u00f3\u00fe\u0118"+
		"\u011f\u0123\u0127\u0132\u0138\u0140\u0144\u0152\u0157\u0161\u0164\u0168"+
		"\u016c\u0173\u0175\u0178\u017c\u017f\u0183\u0187\u0189\u0191\u0195\u0198"+
		"\u01a0\u01a3\u01a6\u01aa\u01ac\u01b3\u01b6\u01be\u01c1\u01c4\u01c8\u01ca"+
		"\u01d2\u01d5\u01d8\u01dc\u01de\u01e5\u01e8\u01f0\u01f4\u01f6\u0208\u020b"+
		"\u020f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}