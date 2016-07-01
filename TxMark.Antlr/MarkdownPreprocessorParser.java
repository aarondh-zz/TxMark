// Generated from MarkdownPreprocessor.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MarkdownPreprocessorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOUBLE_QUOTE=1, SINGLE_QUOTE=2, OPEN_PARENTHESIS=3, CLOSE_PARENTHESIS=4, 
		ASTERISK=5, HASH=6, PERIOD=7, COLON=8, UNDERBAR=9, DASH=10, DIGIT=11, 
		LETTER=12, PUNCTUATION=13, TAB=14, EQUAL=15, SPACE=16, LESS_THAN=17, GREATER_THAN=18, 
		SLASH=19, CARRIAGE_RETURN=20, NON_WHITESPACE=21;
	public static final int
		RULE_document = 0, RULE_line = 1, RULE_carriageReturn = 2, RULE_softCarriageReturn = 3, 
		RULE_hardCarriageReturn = 4, RULE_list = 5, RULE_listItem = 6, RULE_indentedText = 7, 
		RULE_listItemIndicator = 8, RULE_blockquote = 9, RULE_blockquoteItem = 10, 
		RULE_blockQuoteElement = 11, RULE_blockQuoteListItem = 12, RULE_blockquoteIndicator = 13, 
		RULE_heading = 14, RULE_headingIndicator = 15, RULE_textLine = 16, RULE_paragraph_end = 17, 
		RULE_text = 18, RULE_safeText = 19, RULE_attributeContent = 20, RULE_attributeValue = 21, 
		RULE_attributeName = 22, RULE_attribute = 23, RULE_tag = 24, RULE_parenthesisClause = 25, 
		RULE_openTag = 26, RULE_closeTag = 27, RULE_identifier = 28, RULE_whitespace = 29, 
		RULE_space = 30, RULE_tab = 31, RULE_anyNonWhitespace = 32, RULE_nonWhitespace = 33, 
		RULE_anyWhitespace = 34;
	public static final String[] ruleNames = {
		"document", "line", "carriageReturn", "softCarriageReturn", "hardCarriageReturn", 
		"list", "listItem", "indentedText", "listItemIndicator", "blockquote", 
		"blockquoteItem", "blockQuoteElement", "blockQuoteListItem", "blockquoteIndicator", 
		"heading", "headingIndicator", "textLine", "paragraph_end", "text", "safeText", 
		"attributeContent", "attributeValue", "attributeName", "attribute", "tag", 
		"parenthesisClause", "openTag", "closeTag", "identifier", "whitespace", 
		"space", "tab", "anyNonWhitespace", "nonWhitespace", "anyWhitespace"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\"'", "'''", "'('", "')'", "'*'", "'#'", "'.'", "':'", "'_'", 
		"'-'", null, null, null, "'\t'", "'='", "' '", "'<'", "'>'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DOUBLE_QUOTE", "SINGLE_QUOTE", "OPEN_PARENTHESIS", "CLOSE_PARENTHESIS", 
		"ASTERISK", "HASH", "PERIOD", "COLON", "UNDERBAR", "DASH", "DIGIT", "LETTER", 
		"PUNCTUATION", "TAB", "EQUAL", "SPACE", "LESS_THAN", "GREATER_THAN", "SLASH", 
		"CARRIAGE_RETURN", "NON_WHITESPACE"
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
	public String getGrammarFileName() { return "MarkdownPreprocessor.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MarkdownPreprocessorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DocumentContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MarkdownPreprocessorParser.EOF, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public TextLineContext textLine() {
			return getRuleContext(TextLineContext.class,0);
		}
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).exitDocument(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(70);
					line();
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(77);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOUBLE_QUOTE) | (1L << SINGLE_QUOTE) | (1L << OPEN_PARENTHESIS) | (1L << ASTERISK) | (1L << HASH) | (1L << PERIOD) | (1L << COLON) | (1L << UNDERBAR) | (1L << DASH) | (1L << DIGIT) | (1L << LETTER) | (1L << PUNCTUATION) | (1L << TAB) | (1L << EQUAL) | (1L << SPACE) | (1L << LESS_THAN) | (1L << SLASH) | (1L << NON_WHITESPACE))) != 0)) {
				{
				setState(76);
				textLine();
				}
			}

			setState(79);
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

	public static class LineContext extends ParserRuleContext {
		public HeadingContext heading() {
			return getRuleContext(HeadingContext.class,0);
		}
		public CarriageReturnContext carriageReturn() {
			return getRuleContext(CarriageReturnContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public BlockquoteContext blockquote() {
			return getRuleContext(BlockquoteContext.class,0);
		}
		public TextLineContext textLine() {
			return getRuleContext(TextLineContext.class,0);
		}
		public Paragraph_endContext paragraph_end() {
			return getRuleContext(Paragraph_endContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				heading();
				setState(82);
				carriageReturn();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				list();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				blockquote();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(86);
				textLine();
				setState(87);
				carriageReturn();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(89);
				paragraph_end();
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

	public static class CarriageReturnContext extends ParserRuleContext {
		public SoftCarriageReturnContext softCarriageReturn() {
			return getRuleContext(SoftCarriageReturnContext.class,0);
		}
		public HardCarriageReturnContext hardCarriageReturn() {
			return getRuleContext(HardCarriageReturnContext.class,0);
		}
		public CarriageReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_carriageReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).enterCarriageReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).exitCarriageReturn(this);
		}
	}

	public final CarriageReturnContext carriageReturn() throws RecognitionException {
		CarriageReturnContext _localctx = new CarriageReturnContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_carriageReturn);
		try {
			setState(94);
			switch (_input.LA(1)) {
			case CARRIAGE_RETURN:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				softCarriageReturn();
				}
				break;
			case SPACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				hardCarriageReturn();
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

	public static class SoftCarriageReturnContext extends ParserRuleContext {
		public TerminalNode CARRIAGE_RETURN() { return getToken(MarkdownPreprocessorParser.CARRIAGE_RETURN, 0); }
		public SoftCarriageReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_softCarriageReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).enterSoftCarriageReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).exitSoftCarriageReturn(this);
		}
	}

	public final SoftCarriageReturnContext softCarriageReturn() throws RecognitionException {
		SoftCarriageReturnContext _localctx = new SoftCarriageReturnContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_softCarriageReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(CARRIAGE_RETURN);
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

	public static class HardCarriageReturnContext extends ParserRuleContext {
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public TerminalNode CARRIAGE_RETURN() { return getToken(MarkdownPreprocessorParser.CARRIAGE_RETURN, 0); }
		public HardCarriageReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hardCarriageReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).enterHardCarriageReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).exitHardCarriageReturn(this);
		}
	}

	public final HardCarriageReturnContext hardCarriageReturn() throws RecognitionException {
		HardCarriageReturnContext _localctx = new HardCarriageReturnContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_hardCarriageReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			space();
			setState(99);
			space();
			setState(100);
			match(CARRIAGE_RETURN);
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

	public static class ListContext extends ParserRuleContext {
		public List<ListItemContext> listItem() {
			return getRuleContexts(ListItemContext.class);
		}
		public ListItemContext listItem(int i) {
			return getRuleContext(ListItemContext.class,i);
		}
		public List<CarriageReturnContext> carriageReturn() {
			return getRuleContexts(CarriageReturnContext.class);
		}
		public CarriageReturnContext carriageReturn(int i) {
			return getRuleContext(CarriageReturnContext.class,i);
		}
		public List<IndentedTextContext> indentedText() {
			return getRuleContexts(IndentedTextContext.class);
		}
		public IndentedTextContext indentedText(int i) {
			return getRuleContext(IndentedTextContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(108); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(108);
					switch (_input.LA(1)) {
					case ASTERISK:
					case DIGIT:
						{
						setState(102);
						listItem();
						setState(103);
						carriageReturn();
						}
						break;
					case TAB:
					case SPACE:
						{
						setState(105);
						indentedText();
						setState(106);
						carriageReturn();
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
				setState(110); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class ListItemContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public List<ListItemIndicatorContext> listItemIndicator() {
			return getRuleContexts(ListItemIndicatorContext.class);
		}
		public ListItemIndicatorContext listItemIndicator(int i) {
			return getRuleContext(ListItemIndicatorContext.class,i);
		}
		public List<WhitespaceContext> whitespace() {
			return getRuleContexts(WhitespaceContext.class);
		}
		public WhitespaceContext whitespace(int i) {
			return getRuleContext(WhitespaceContext.class,i);
		}
		public ListItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).enterListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).exitListItem(this);
		}
	}

	public final ListItemContext listItem() throws RecognitionException {
		ListItemContext _localctx = new ListItemContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_listItem);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(116); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(112);
					listItemIndicator();
					setState(114);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						setState(113);
						whitespace();
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(118); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(120);
			text();
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

	public static class IndentedTextContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public List<TabContext> tab() {
			return getRuleContexts(TabContext.class);
		}
		public TabContext tab(int i) {
			return getRuleContext(TabContext.class,i);
		}
		public IndentedTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indentedText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).enterIndentedText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).exitIndentedText(this);
		}
	}

	public final IndentedTextContext indentedText() throws RecognitionException {
		IndentedTextContext _localctx = new IndentedTextContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_indentedText);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			switch (_input.LA(1)) {
			case TAB:
				{
				setState(123); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(122);
						tab();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(125); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case SPACE:
				{
				setState(127);
				space();
				setState(128);
				space();
				setState(129);
				space();
				setState(131); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(130);
						space();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(133); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(139);
					switch (_input.LA(1)) {
					case TAB:
						{
						setState(137);
						tab();
						}
						break;
					case SPACE:
						{
						setState(138);
						space();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(144);
			text();
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

	public static class ListItemIndicatorContext extends ParserRuleContext {
		public TerminalNode ASTERISK() { return getToken(MarkdownPreprocessorParser.ASTERISK, 0); }
		public TerminalNode PERIOD() { return getToken(MarkdownPreprocessorParser.PERIOD, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(MarkdownPreprocessorParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(MarkdownPreprocessorParser.DIGIT, i);
		}
		public ListItemIndicatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listItemIndicator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).enterListItemIndicator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).exitListItemIndicator(this);
		}
	}

	public final ListItemIndicatorContext listItemIndicator() throws RecognitionException {
		ListItemIndicatorContext _localctx = new ListItemIndicatorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_listItemIndicator);
		int _la;
		try {
			setState(153);
			switch (_input.LA(1)) {
			case ASTERISK:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(ASTERISK);
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(148); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(147);
					match(DIGIT);
					}
					}
					setState(150); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				setState(152);
				match(PERIOD);
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

	public static class BlockquoteContext extends ParserRuleContext {
		public List<BlockquoteItemContext> blockquoteItem() {
			return getRuleContexts(BlockquoteItemContext.class);
		}
		public BlockquoteItemContext blockquoteItem(int i) {
			return getRuleContext(BlockquoteItemContext.class,i);
		}
		public List<CarriageReturnContext> carriageReturn() {
			return getRuleContexts(CarriageReturnContext.class);
		}
		public CarriageReturnContext carriageReturn(int i) {
			return getRuleContext(CarriageReturnContext.class,i);
		}
		public List<IndentedTextContext> indentedText() {
			return getRuleContexts(IndentedTextContext.class);
		}
		public IndentedTextContext indentedText(int i) {
			return getRuleContext(IndentedTextContext.class,i);
		}
		public BlockquoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockquote; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).enterBlockquote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).exitBlockquote(this);
		}
	}

	public final BlockquoteContext blockquote() throws RecognitionException {
		BlockquoteContext _localctx = new BlockquoteContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_blockquote);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(161); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(161);
					switch (_input.LA(1)) {
					case GREATER_THAN:
						{
						setState(155);
						blockquoteItem();
						setState(156);
						carriageReturn();
						}
						break;
					case TAB:
					case SPACE:
						{
						setState(158);
						indentedText();
						setState(159);
						carriageReturn();
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
				setState(163); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class BlockquoteItemContext extends ParserRuleContext {
		public BlockQuoteElementContext blockQuoteElement() {
			return getRuleContext(BlockQuoteElementContext.class,0);
		}
		public List<BlockquoteIndicatorContext> blockquoteIndicator() {
			return getRuleContexts(BlockquoteIndicatorContext.class);
		}
		public BlockquoteIndicatorContext blockquoteIndicator(int i) {
			return getRuleContext(BlockquoteIndicatorContext.class,i);
		}
		public List<WhitespaceContext> whitespace() {
			return getRuleContexts(WhitespaceContext.class);
		}
		public WhitespaceContext whitespace(int i) {
			return getRuleContext(WhitespaceContext.class,i);
		}
		public BlockquoteItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockquoteItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).enterBlockquoteItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).exitBlockquoteItem(this);
		}
	}

	public final BlockquoteItemContext blockquoteItem() throws RecognitionException {
		BlockquoteItemContext _localctx = new BlockquoteItemContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_blockquoteItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(165);
				blockquoteIndicator();
				setState(167);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(166);
					whitespace();
					}
					break;
				}
				}
				}
				setState(171); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==GREATER_THAN );
			setState(173);
			blockQuoteElement();
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

	public static class BlockQuoteElementContext extends ParserRuleContext {
		public HeadingContext heading() {
			return getRuleContext(HeadingContext.class,0);
		}
		public BlockQuoteListItemContext blockQuoteListItem() {
			return getRuleContext(BlockQuoteListItemContext.class,0);
		}
		public TextLineContext textLine() {
			return getRuleContext(TextLineContext.class,0);
		}
		public BlockQuoteElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockQuoteElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).enterBlockQuoteElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).exitBlockQuoteElement(this);
		}
	}

	public final BlockQuoteElementContext blockQuoteElement() throws RecognitionException {
		BlockQuoteElementContext _localctx = new BlockQuoteElementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_blockQuoteElement);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				heading();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				blockQuoteListItem();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
				textLine();
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

	public static class BlockQuoteListItemContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public List<ListItemIndicatorContext> listItemIndicator() {
			return getRuleContexts(ListItemIndicatorContext.class);
		}
		public ListItemIndicatorContext listItemIndicator(int i) {
			return getRuleContext(ListItemIndicatorContext.class,i);
		}
		public List<WhitespaceContext> whitespace() {
			return getRuleContexts(WhitespaceContext.class);
		}
		public WhitespaceContext whitespace(int i) {
			return getRuleContext(WhitespaceContext.class,i);
		}
		public BlockQuoteListItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockQuoteListItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).enterBlockQuoteListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).exitBlockQuoteListItem(this);
		}
	}

	public final BlockQuoteListItemContext blockQuoteListItem() throws RecognitionException {
		BlockQuoteListItemContext _localctx = new BlockQuoteListItemContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_blockQuoteListItem);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(184); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(180);
					listItemIndicator();
					setState(182);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						setState(181);
						whitespace();
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(186); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(188);
			text();
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

	public static class BlockquoteIndicatorContext extends ParserRuleContext {
		public TerminalNode GREATER_THAN() { return getToken(MarkdownPreprocessorParser.GREATER_THAN, 0); }
		public BlockquoteIndicatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockquoteIndicator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).enterBlockquoteIndicator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).exitBlockquoteIndicator(this);
		}
	}

	public final BlockquoteIndicatorContext blockquoteIndicator() throws RecognitionException {
		BlockquoteIndicatorContext _localctx = new BlockquoteIndicatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_blockquoteIndicator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
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

	public static class HeadingContext extends ParserRuleContext {
		public WhitespaceContext whitespace() {
			return getRuleContext(WhitespaceContext.class,0);
		}
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public List<HeadingIndicatorContext> headingIndicator() {
			return getRuleContexts(HeadingIndicatorContext.class);
		}
		public HeadingIndicatorContext headingIndicator(int i) {
			return getRuleContext(HeadingIndicatorContext.class,i);
		}
		public HeadingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_heading; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).enterHeading(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).exitHeading(this);
		}
	}

	public final HeadingContext heading() throws RecognitionException {
		HeadingContext _localctx = new HeadingContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_heading);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(192);
				headingIndicator();
				}
				}
				setState(195); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==HASH );
			setState(197);
			whitespace();
			setState(198);
			text();
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

	public static class HeadingIndicatorContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(MarkdownPreprocessorParser.HASH, 0); }
		public HeadingIndicatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headingIndicator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).enterHeadingIndicator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).exitHeadingIndicator(this);
		}
	}

	public final HeadingIndicatorContext headingIndicator() throws RecognitionException {
		HeadingIndicatorContext _localctx = new HeadingIndicatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_headingIndicator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(HASH);
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

	public static class TextLineContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public List<WhitespaceContext> whitespace() {
			return getRuleContexts(WhitespaceContext.class);
		}
		public WhitespaceContext whitespace(int i) {
			return getRuleContext(WhitespaceContext.class,i);
		}
		public TextLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).enterTextLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).exitTextLine(this);
		}
	}

	public final TextLineContext textLine() throws RecognitionException {
		TextLineContext _localctx = new TextLineContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_textLine);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(202);
					whitespace();
					}
					} 
				}
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(208);
			text();
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

	public static class Paragraph_endContext extends ParserRuleContext {
		public List<SoftCarriageReturnContext> softCarriageReturn() {
			return getRuleContexts(SoftCarriageReturnContext.class);
		}
		public SoftCarriageReturnContext softCarriageReturn(int i) {
			return getRuleContext(SoftCarriageReturnContext.class,i);
		}
		public List<WhitespaceContext> whitespace() {
			return getRuleContexts(WhitespaceContext.class);
		}
		public WhitespaceContext whitespace(int i) {
			return getRuleContext(WhitespaceContext.class,i);
		}
		public Paragraph_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paragraph_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).enterParagraph_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).exitParagraph_end(this);
		}
	}

	public final Paragraph_endContext paragraph_end() throws RecognitionException {
		Paragraph_endContext _localctx = new Paragraph_endContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_paragraph_end);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(217); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==TAB || _la==SPACE) {
						{
						{
						setState(210);
						whitespace();
						}
						}
						setState(215);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(216);
					softCarriageReturn();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(219); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	public static class TextContext extends ParserRuleContext {
		public List<NonWhitespaceContext> nonWhitespace() {
			return getRuleContexts(NonWhitespaceContext.class);
		}
		public NonWhitespaceContext nonWhitespace(int i) {
			return getRuleContext(NonWhitespaceContext.class,i);
		}
		public List<SafeTextContext> safeText() {
			return getRuleContexts(SafeTextContext.class);
		}
		public SafeTextContext safeText(int i) {
			return getRuleContext(SafeTextContext.class,i);
		}
		public ParenthesisClauseContext parenthesisClause() {
			return getRuleContext(ParenthesisClauseContext.class,0);
		}
		public List<TextLineContext> textLine() {
			return getRuleContexts(TextLineContext.class);
		}
		public TextLineContext textLine(int i) {
			return getRuleContext(TextLineContext.class,i);
		}
		public OpenTagContext openTag() {
			return getRuleContext(OpenTagContext.class,0);
		}
		public CloseTagContext closeTag() {
			return getRuleContext(CloseTagContext.class,0);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).exitText(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_text);
		try {
			int _alt;
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(221);
						nonWhitespace();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(224); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(226);
						safeText();
						}
						} 
					}
					setState(231);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				parenthesisClause();
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(233);
						textLine();
						}
						} 
					}
					setState(238);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(239);
				openTag();
				setState(243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(240);
						textLine();
						}
						} 
					}
					setState(245);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(246);
				closeTag();
				setState(250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(247);
						textLine();
						}
						} 
					}
					setState(252);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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

	public static class SafeTextContext extends ParserRuleContext {
		public WhitespaceContext whitespace() {
			return getRuleContext(WhitespaceContext.class,0);
		}
		public NonWhitespaceContext nonWhitespace() {
			return getRuleContext(NonWhitespaceContext.class,0);
		}
		public TerminalNode HASH() { return getToken(MarkdownPreprocessorParser.HASH, 0); }
		public TerminalNode ASTERISK() { return getToken(MarkdownPreprocessorParser.ASTERISK, 0); }
		public TerminalNode LESS_THAN() { return getToken(MarkdownPreprocessorParser.LESS_THAN, 0); }
		public TerminalNode SLASH() { return getToken(MarkdownPreprocessorParser.SLASH, 0); }
		public TerminalNode PERIOD() { return getToken(MarkdownPreprocessorParser.PERIOD, 0); }
		public SafeTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_safeText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).enterSafeText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).exitSafeText(this);
		}
	}

	public final SafeTextContext safeText() throws RecognitionException {
		SafeTextContext _localctx = new SafeTextContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_safeText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(255);
				whitespace();
				}
				break;
			case 2:
				{
				setState(256);
				nonWhitespace();
				}
				break;
			case 3:
				{
				setState(257);
				match(HASH);
				}
				break;
			case 4:
				{
				setState(258);
				match(ASTERISK);
				}
				break;
			case 5:
				{
				setState(259);
				match(LESS_THAN);
				}
				break;
			case 6:
				{
				setState(260);
				match(SLASH);
				}
				break;
			case 7:
				{
				setState(261);
				match(PERIOD);
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

	public static class AttributeContentContext extends ParserRuleContext {
		public List<WhitespaceContext> whitespace() {
			return getRuleContexts(WhitespaceContext.class);
		}
		public WhitespaceContext whitespace(int i) {
			return getRuleContext(WhitespaceContext.class,i);
		}
		public List<AnyNonWhitespaceContext> anyNonWhitespace() {
			return getRuleContexts(AnyNonWhitespaceContext.class);
		}
		public AnyNonWhitespaceContext anyNonWhitespace(int i) {
			return getRuleContext(AnyNonWhitespaceContext.class,i);
		}
		public List<TerminalNode> CARRIAGE_RETURN() { return getTokens(MarkdownPreprocessorParser.CARRIAGE_RETURN); }
		public TerminalNode CARRIAGE_RETURN(int i) {
			return getToken(MarkdownPreprocessorParser.CARRIAGE_RETURN, i);
		}
		public AttributeContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).enterAttributeContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).exitAttributeContent(this);
		}
	}

	public final AttributeContentContext attributeContent() throws RecognitionException {
		AttributeContentContext _localctx = new AttributeContentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_attributeContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOUBLE_QUOTE) | (1L << SINGLE_QUOTE) | (1L << ASTERISK) | (1L << HASH) | (1L << PERIOD) | (1L << COLON) | (1L << UNDERBAR) | (1L << DASH) | (1L << DIGIT) | (1L << LETTER) | (1L << PUNCTUATION) | (1L << TAB) | (1L << EQUAL) | (1L << SPACE) | (1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << SLASH) | (1L << CARRIAGE_RETURN) | (1L << NON_WHITESPACE))) != 0)) {
				{
				setState(267);
				switch (_input.LA(1)) {
				case TAB:
				case SPACE:
					{
					setState(264);
					whitespace();
					}
					break;
				case DOUBLE_QUOTE:
				case SINGLE_QUOTE:
				case ASTERISK:
				case HASH:
				case PERIOD:
				case COLON:
				case UNDERBAR:
				case DASH:
				case DIGIT:
				case LETTER:
				case PUNCTUATION:
				case EQUAL:
				case LESS_THAN:
				case GREATER_THAN:
				case SLASH:
				case NON_WHITESPACE:
					{
					setState(265);
					anyNonWhitespace();
					}
					break;
				case CARRIAGE_RETURN:
					{
					setState(266);
					match(CARRIAGE_RETURN);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(271);
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

	public static class AttributeValueContext extends ParserRuleContext {
		public List<TerminalNode> DOUBLE_QUOTE() { return getTokens(MarkdownPreprocessorParser.DOUBLE_QUOTE); }
		public TerminalNode DOUBLE_QUOTE(int i) {
			return getToken(MarkdownPreprocessorParser.DOUBLE_QUOTE, i);
		}
		public List<WhitespaceContext> whitespace() {
			return getRuleContexts(WhitespaceContext.class);
		}
		public WhitespaceContext whitespace(int i) {
			return getRuleContext(WhitespaceContext.class,i);
		}
		public List<AnyNonWhitespaceContext> anyNonWhitespace() {
			return getRuleContexts(AnyNonWhitespaceContext.class);
		}
		public AnyNonWhitespaceContext anyNonWhitespace(int i) {
			return getRuleContext(AnyNonWhitespaceContext.class,i);
		}
		public List<TerminalNode> SINGLE_QUOTE() { return getTokens(MarkdownPreprocessorParser.SINGLE_QUOTE); }
		public TerminalNode SINGLE_QUOTE(int i) {
			return getToken(MarkdownPreprocessorParser.SINGLE_QUOTE, i);
		}
		public AttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).enterAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).exitAttributeValue(this);
		}
	}

	public final AttributeValueContext attributeValue() throws RecognitionException {
		AttributeValueContext _localctx = new AttributeValueContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_attributeValue);
		try {
			int _alt;
			setState(290);
			switch (_input.LA(1)) {
			case DOUBLE_QUOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				match(DOUBLE_QUOTE);
				setState(277);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						setState(275);
						switch (_input.LA(1)) {
						case TAB:
						case SPACE:
							{
							setState(273);
							whitespace();
							}
							break;
						case DOUBLE_QUOTE:
						case SINGLE_QUOTE:
						case ASTERISK:
						case HASH:
						case PERIOD:
						case COLON:
						case UNDERBAR:
						case DASH:
						case DIGIT:
						case LETTER:
						case PUNCTUATION:
						case EQUAL:
						case LESS_THAN:
						case GREATER_THAN:
						case SLASH:
						case NON_WHITESPACE:
							{
							setState(274);
							anyNonWhitespace();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(279);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				}
				setState(280);
				match(DOUBLE_QUOTE);
				}
				break;
			case SINGLE_QUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				match(SINGLE_QUOTE);
				setState(286);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						setState(284);
						switch (_input.LA(1)) {
						case TAB:
						case SPACE:
							{
							setState(282);
							whitespace();
							}
							break;
						case DOUBLE_QUOTE:
						case SINGLE_QUOTE:
						case ASTERISK:
						case HASH:
						case PERIOD:
						case COLON:
						case UNDERBAR:
						case DASH:
						case DIGIT:
						case LETTER:
						case PUNCTUATION:
						case EQUAL:
						case LESS_THAN:
						case GREATER_THAN:
						case SLASH:
						case NON_WHITESPACE:
							{
							setState(283);
							anyNonWhitespace();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(288);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				setState(289);
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

	public static class AttributeNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).enterAttributeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).exitAttributeName(this);
		}
	}

	public final AttributeNameContext attributeName() throws RecognitionException {
		AttributeNameContext _localctx = new AttributeNameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_attributeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			identifier();
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

	public static class AttributeContext extends ParserRuleContext {
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(MarkdownPreprocessorParser.EQUAL, 0); }
		public AttributeValueContext attributeValue() {
			return getRuleContext(AttributeValueContext.class,0);
		}
		public List<AnyWhitespaceContext> anyWhitespace() {
			return getRuleContexts(AnyWhitespaceContext.class);
		}
		public AnyWhitespaceContext anyWhitespace(int i) {
			return getRuleContext(AnyWhitespaceContext.class,i);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAB) | (1L << SPACE) | (1L << CARRIAGE_RETURN))) != 0)) {
				{
				{
				setState(294);
				anyWhitespace();
				}
				}
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(300);
			attributeName();
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAB) | (1L << SPACE) | (1L << CARRIAGE_RETURN))) != 0)) {
				{
				{
				setState(301);
				anyWhitespace();
				}
				}
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(307);
			match(EQUAL);
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAB) | (1L << SPACE) | (1L << CARRIAGE_RETURN))) != 0)) {
				{
				{
				setState(308);
				anyWhitespace();
				}
				}
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(314);
			attributeValue();
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

	public static class TagContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).enterTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).exitTag(this);
		}
	}

	public final TagContext tag() throws RecognitionException {
		TagContext _localctx = new TagContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_tag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			identifier();
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

	public static class ParenthesisClauseContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENTHESIS() { return getToken(MarkdownPreprocessorParser.OPEN_PARENTHESIS, 0); }
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(MarkdownPreprocessorParser.CLOSE_PARENTHESIS, 0); }
		public List<SafeTextContext> safeText() {
			return getRuleContexts(SafeTextContext.class);
		}
		public SafeTextContext safeText(int i) {
			return getRuleContext(SafeTextContext.class,i);
		}
		public List<WhitespaceContext> whitespace() {
			return getRuleContexts(WhitespaceContext.class);
		}
		public WhitespaceContext whitespace(int i) {
			return getRuleContext(WhitespaceContext.class,i);
		}
		public List<NonWhitespaceContext> nonWhitespace() {
			return getRuleContexts(NonWhitespaceContext.class);
		}
		public NonWhitespaceContext nonWhitespace(int i) {
			return getRuleContext(NonWhitespaceContext.class,i);
		}
		public List<TerminalNode> HASH() { return getTokens(MarkdownPreprocessorParser.HASH); }
		public TerminalNode HASH(int i) {
			return getToken(MarkdownPreprocessorParser.HASH, i);
		}
		public List<TerminalNode> ASTERISK() { return getTokens(MarkdownPreprocessorParser.ASTERISK); }
		public TerminalNode ASTERISK(int i) {
			return getToken(MarkdownPreprocessorParser.ASTERISK, i);
		}
		public List<TerminalNode> GREATER_THAN() { return getTokens(MarkdownPreprocessorParser.GREATER_THAN); }
		public TerminalNode GREATER_THAN(int i) {
			return getToken(MarkdownPreprocessorParser.GREATER_THAN, i);
		}
		public List<TerminalNode> LESS_THAN() { return getTokens(MarkdownPreprocessorParser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(MarkdownPreprocessorParser.LESS_THAN, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(MarkdownPreprocessorParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(MarkdownPreprocessorParser.SLASH, i);
		}
		public List<TerminalNode> PERIOD() { return getTokens(MarkdownPreprocessorParser.PERIOD); }
		public TerminalNode PERIOD(int i) {
			return getToken(MarkdownPreprocessorParser.PERIOD, i);
		}
		public List<ParenthesisClauseContext> parenthesisClause() {
			return getRuleContexts(ParenthesisClauseContext.class);
		}
		public ParenthesisClauseContext parenthesisClause(int i) {
			return getRuleContext(ParenthesisClauseContext.class,i);
		}
		public ParenthesisClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesisClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).enterParenthesisClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).exitParenthesisClause(this);
		}
	}

	public final ParenthesisClauseContext parenthesisClause() throws RecognitionException {
		ParenthesisClauseContext _localctx = new ParenthesisClauseContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_parenthesisClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOUBLE_QUOTE) | (1L << SINGLE_QUOTE) | (1L << ASTERISK) | (1L << HASH) | (1L << PERIOD) | (1L << COLON) | (1L << UNDERBAR) | (1L << DASH) | (1L << DIGIT) | (1L << LETTER) | (1L << PUNCTUATION) | (1L << TAB) | (1L << EQUAL) | (1L << SPACE) | (1L << LESS_THAN) | (1L << SLASH) | (1L << NON_WHITESPACE))) != 0)) {
				{
				{
				setState(318);
				safeText();
				}
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(324);
			match(OPEN_PARENTHESIS);
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOUBLE_QUOTE) | (1L << SINGLE_QUOTE) | (1L << OPEN_PARENTHESIS) | (1L << ASTERISK) | (1L << HASH) | (1L << PERIOD) | (1L << COLON) | (1L << UNDERBAR) | (1L << DASH) | (1L << DIGIT) | (1L << LETTER) | (1L << PUNCTUATION) | (1L << TAB) | (1L << EQUAL) | (1L << SPACE) | (1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << SLASH) | (1L << NON_WHITESPACE))) != 0)) {
				{
				setState(334);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(325);
					whitespace();
					}
					break;
				case 2:
					{
					setState(326);
					nonWhitespace();
					}
					break;
				case 3:
					{
					setState(327);
					match(HASH);
					}
					break;
				case 4:
					{
					setState(328);
					match(ASTERISK);
					}
					break;
				case 5:
					{
					setState(329);
					match(GREATER_THAN);
					}
					break;
				case 6:
					{
					setState(330);
					match(LESS_THAN);
					}
					break;
				case 7:
					{
					setState(331);
					match(SLASH);
					}
					break;
				case 8:
					{
					setState(332);
					match(PERIOD);
					}
					break;
				case 9:
					{
					setState(333);
					parenthesisClause();
					}
					break;
				}
				}
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(339);
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

	public static class OpenTagContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(MarkdownPreprocessorParser.LESS_THAN, 0); }
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
		}
		public TerminalNode GREATER_THAN() { return getToken(MarkdownPreprocessorParser.GREATER_THAN, 0); }
		public List<SafeTextContext> safeText() {
			return getRuleContexts(SafeTextContext.class);
		}
		public SafeTextContext safeText(int i) {
			return getRuleContext(SafeTextContext.class,i);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<AnyWhitespaceContext> anyWhitespace() {
			return getRuleContexts(AnyWhitespaceContext.class);
		}
		public AnyWhitespaceContext anyWhitespace(int i) {
			return getRuleContext(AnyWhitespaceContext.class,i);
		}
		public TerminalNode SLASH() { return getToken(MarkdownPreprocessorParser.SLASH, 0); }
		public OpenTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).enterOpenTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).exitOpenTag(this);
		}
	}

	public final OpenTagContext openTag() throws RecognitionException {
		OpenTagContext _localctx = new OpenTagContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_openTag);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(341);
					safeText();
					}
					} 
				}
				setState(346);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			setState(347);
			match(LESS_THAN);
			setState(348);
			tag();
			setState(352);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(349);
					attribute();
					}
					} 
				}
				setState(354);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAB) | (1L << SPACE) | (1L << CARRIAGE_RETURN))) != 0)) {
				{
				{
				setState(355);
				anyWhitespace();
				}
				}
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(362);
			_la = _input.LA(1);
			if (_la==SLASH) {
				{
				setState(361);
				match(SLASH);
				}
			}

			setState(364);
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

	public static class CloseTagContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(MarkdownPreprocessorParser.LESS_THAN, 0); }
		public TerminalNode SLASH() { return getToken(MarkdownPreprocessorParser.SLASH, 0); }
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
		}
		public TerminalNode GREATER_THAN() { return getToken(MarkdownPreprocessorParser.GREATER_THAN, 0); }
		public List<SafeTextContext> safeText() {
			return getRuleContexts(SafeTextContext.class);
		}
		public SafeTextContext safeText(int i) {
			return getRuleContext(SafeTextContext.class,i);
		}
		public List<AnyWhitespaceContext> anyWhitespace() {
			return getRuleContexts(AnyWhitespaceContext.class);
		}
		public AnyWhitespaceContext anyWhitespace(int i) {
			return getRuleContext(AnyWhitespaceContext.class,i);
		}
		public CloseTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).enterCloseTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).exitCloseTag(this);
		}
	}

	public final CloseTagContext closeTag() throws RecognitionException {
		CloseTagContext _localctx = new CloseTagContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_closeTag);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(366);
					safeText();
					}
					} 
				}
				setState(371);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			setState(372);
			match(LESS_THAN);
			setState(373);
			match(SLASH);
			setState(374);
			tag();
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAB) | (1L << SPACE) | (1L << CARRIAGE_RETURN))) != 0)) {
				{
				{
				setState(375);
				anyWhitespace();
				}
				}
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(381);
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

	public static class IdentifierContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(MarkdownPreprocessorParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(MarkdownPreprocessorParser.LETTER, i);
		}
		public List<TerminalNode> COLON() { return getTokens(MarkdownPreprocessorParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(MarkdownPreprocessorParser.COLON, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(MarkdownPreprocessorParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(MarkdownPreprocessorParser.DIGIT, i);
		}
		public List<TerminalNode> UNDERBAR() { return getTokens(MarkdownPreprocessorParser.UNDERBAR); }
		public TerminalNode UNDERBAR(int i) {
			return getToken(MarkdownPreprocessorParser.UNDERBAR, i);
		}
		public List<TerminalNode> DASH() { return getTokens(MarkdownPreprocessorParser.DASH); }
		public TerminalNode DASH(int i) {
			return getToken(MarkdownPreprocessorParser.DASH, i);
		}
		public List<TerminalNode> PERIOD() { return getTokens(MarkdownPreprocessorParser.PERIOD); }
		public TerminalNode PERIOD(int i) {
			return getToken(MarkdownPreprocessorParser.PERIOD, i);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_identifier);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(384); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(383);
					_la = _input.LA(1);
					if ( !(_la==COLON || _la==LETTER) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(386); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(391);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(388);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PERIOD) | (1L << COLON) | (1L << UNDERBAR) | (1L << DASH) | (1L << DIGIT) | (1L << LETTER))) != 0)) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					} 
				}
				setState(393);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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

	public static class WhitespaceContext extends ParserRuleContext {
		public SpaceContext space() {
			return getRuleContext(SpaceContext.class,0);
		}
		public TabContext tab() {
			return getRuleContext(TabContext.class,0);
		}
		public WhitespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whitespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).enterWhitespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).exitWhitespace(this);
		}
	}

	public final WhitespaceContext whitespace() throws RecognitionException {
		WhitespaceContext _localctx = new WhitespaceContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_whitespace);
		try {
			setState(396);
			switch (_input.LA(1)) {
			case SPACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				space();
				}
				break;
			case TAB:
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
				tab();
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

	public static class SpaceContext extends ParserRuleContext {
		public TerminalNode SPACE() { return getToken(MarkdownPreprocessorParser.SPACE, 0); }
		public SpaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_space; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).enterSpace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).exitSpace(this);
		}
	}

	public final SpaceContext space() throws RecognitionException {
		SpaceContext _localctx = new SpaceContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_space);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(SPACE);
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

	public static class TabContext extends ParserRuleContext {
		public TerminalNode TAB() { return getToken(MarkdownPreprocessorParser.TAB, 0); }
		public TabContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tab; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).enterTab(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).exitTab(this);
		}
	}

	public final TabContext tab() throws RecognitionException {
		TabContext _localctx = new TabContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_tab);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(TAB);
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

	public static class AnyNonWhitespaceContext extends ParserRuleContext {
		public NonWhitespaceContext nonWhitespace() {
			return getRuleContext(NonWhitespaceContext.class,0);
		}
		public TerminalNode HASH() { return getToken(MarkdownPreprocessorParser.HASH, 0); }
		public TerminalNode ASTERISK() { return getToken(MarkdownPreprocessorParser.ASTERISK, 0); }
		public TerminalNode LESS_THAN() { return getToken(MarkdownPreprocessorParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(MarkdownPreprocessorParser.GREATER_THAN, 0); }
		public TerminalNode SLASH() { return getToken(MarkdownPreprocessorParser.SLASH, 0); }
		public TerminalNode PERIOD() { return getToken(MarkdownPreprocessorParser.PERIOD, 0); }
		public AnyNonWhitespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anyNonWhitespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).enterAnyNonWhitespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).exitAnyNonWhitespace(this);
		}
	}

	public final AnyNonWhitespaceContext anyNonWhitespace() throws RecognitionException {
		AnyNonWhitespaceContext _localctx = new AnyNonWhitespaceContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_anyNonWhitespace);
		try {
			setState(409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				nonWhitespace();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(403);
				match(HASH);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(404);
				match(ASTERISK);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(405);
				match(LESS_THAN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(406);
				match(GREATER_THAN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(407);
				match(SLASH);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(408);
				match(PERIOD);
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

	public static class NonWhitespaceContext extends ParserRuleContext {
		public TerminalNode NON_WHITESPACE() { return getToken(MarkdownPreprocessorParser.NON_WHITESPACE, 0); }
		public TerminalNode PUNCTUATION() { return getToken(MarkdownPreprocessorParser.PUNCTUATION, 0); }
		public TerminalNode DIGIT() { return getToken(MarkdownPreprocessorParser.DIGIT, 0); }
		public TerminalNode LETTER() { return getToken(MarkdownPreprocessorParser.LETTER, 0); }
		public TerminalNode EQUAL() { return getToken(MarkdownPreprocessorParser.EQUAL, 0); }
		public TerminalNode DOUBLE_QUOTE() { return getToken(MarkdownPreprocessorParser.DOUBLE_QUOTE, 0); }
		public TerminalNode SINGLE_QUOTE() { return getToken(MarkdownPreprocessorParser.SINGLE_QUOTE, 0); }
		public TerminalNode COLON() { return getToken(MarkdownPreprocessorParser.COLON, 0); }
		public TerminalNode DASH() { return getToken(MarkdownPreprocessorParser.DASH, 0); }
		public TerminalNode UNDERBAR() { return getToken(MarkdownPreprocessorParser.UNDERBAR, 0); }
		public TerminalNode PERIOD() { return getToken(MarkdownPreprocessorParser.PERIOD, 0); }
		public NonWhitespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWhitespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).enterNonWhitespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).exitNonWhitespace(this);
		}
	}

	public final NonWhitespaceContext nonWhitespace() throws RecognitionException {
		NonWhitespaceContext _localctx = new NonWhitespaceContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_nonWhitespace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOUBLE_QUOTE) | (1L << SINGLE_QUOTE) | (1L << PERIOD) | (1L << COLON) | (1L << UNDERBAR) | (1L << DASH) | (1L << DIGIT) | (1L << LETTER) | (1L << PUNCTUATION) | (1L << EQUAL) | (1L << NON_WHITESPACE))) != 0)) ) {
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

	public static class AnyWhitespaceContext extends ParserRuleContext {
		public WhitespaceContext whitespace() {
			return getRuleContext(WhitespaceContext.class,0);
		}
		public TerminalNode CARRIAGE_RETURN() { return getToken(MarkdownPreprocessorParser.CARRIAGE_RETURN, 0); }
		public AnyWhitespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anyWhitespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).enterAnyWhitespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).exitAnyWhitespace(this);
		}
	}

	public final AnyWhitespaceContext anyWhitespace() throws RecognitionException {
		AnyWhitespaceContext _localctx = new AnyWhitespaceContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_anyWhitespace);
		try {
			setState(415);
			switch (_input.LA(1)) {
			case TAB:
			case SPACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				whitespace();
				}
				break;
			case CARRIAGE_RETURN:
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
				match(CARRIAGE_RETURN);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\27\u01a4\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\7\2J\n\2\f\2\16\2M\13\2\3\2\5\2P\n\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3]\n\3\3\4\3\4\5\4a\n\4\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\6\7o\n\7\r\7\16\7p\3\b\3\b"+
		"\5\bu\n\b\6\bw\n\b\r\b\16\bx\3\b\3\b\3\t\6\t~\n\t\r\t\16\t\177\3\t\3\t"+
		"\3\t\3\t\6\t\u0086\n\t\r\t\16\t\u0087\5\t\u008a\n\t\3\t\3\t\7\t\u008e"+
		"\n\t\f\t\16\t\u0091\13\t\3\t\3\t\3\n\3\n\6\n\u0097\n\n\r\n\16\n\u0098"+
		"\3\n\5\n\u009c\n\n\3\13\3\13\3\13\3\13\3\13\3\13\6\13\u00a4\n\13\r\13"+
		"\16\13\u00a5\3\f\3\f\5\f\u00aa\n\f\6\f\u00ac\n\f\r\f\16\f\u00ad\3\f\3"+
		"\f\3\r\3\r\3\r\5\r\u00b5\n\r\3\16\3\16\5\16\u00b9\n\16\6\16\u00bb\n\16"+
		"\r\16\16\16\u00bc\3\16\3\16\3\17\3\17\3\20\6\20\u00c4\n\20\r\20\16\20"+
		"\u00c5\3\20\3\20\3\20\3\21\3\21\3\22\7\22\u00ce\n\22\f\22\16\22\u00d1"+
		"\13\22\3\22\3\22\3\23\7\23\u00d6\n\23\f\23\16\23\u00d9\13\23\3\23\6\23"+
		"\u00dc\n\23\r\23\16\23\u00dd\3\24\6\24\u00e1\n\24\r\24\16\24\u00e2\3\24"+
		"\7\24\u00e6\n\24\f\24\16\24\u00e9\13\24\3\24\3\24\7\24\u00ed\n\24\f\24"+
		"\16\24\u00f0\13\24\3\24\3\24\7\24\u00f4\n\24\f\24\16\24\u00f7\13\24\3"+
		"\24\3\24\7\24\u00fb\n\24\f\24\16\24\u00fe\13\24\5\24\u0100\n\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\5\25\u0109\n\25\3\26\3\26\3\26\7\26\u010e"+
		"\n\26\f\26\16\26\u0111\13\26\3\27\3\27\3\27\7\27\u0116\n\27\f\27\16\27"+
		"\u0119\13\27\3\27\3\27\3\27\3\27\7\27\u011f\n\27\f\27\16\27\u0122\13\27"+
		"\3\27\5\27\u0125\n\27\3\30\3\30\3\31\7\31\u012a\n\31\f\31\16\31\u012d"+
		"\13\31\3\31\3\31\7\31\u0131\n\31\f\31\16\31\u0134\13\31\3\31\3\31\7\31"+
		"\u0138\n\31\f\31\16\31\u013b\13\31\3\31\3\31\3\32\3\32\3\33\7\33\u0142"+
		"\n\33\f\33\16\33\u0145\13\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\7\33\u0151\n\33\f\33\16\33\u0154\13\33\3\33\3\33\3\34\7\34\u0159"+
		"\n\34\f\34\16\34\u015c\13\34\3\34\3\34\3\34\7\34\u0161\n\34\f\34\16\34"+
		"\u0164\13\34\3\34\7\34\u0167\n\34\f\34\16\34\u016a\13\34\3\34\5\34\u016d"+
		"\n\34\3\34\3\34\3\35\7\35\u0172\n\35\f\35\16\35\u0175\13\35\3\35\3\35"+
		"\3\35\3\35\7\35\u017b\n\35\f\35\16\35\u017e\13\35\3\35\3\35\3\36\6\36"+
		"\u0183\n\36\r\36\16\36\u0184\3\36\7\36\u0188\n\36\f\36\16\36\u018b\13"+
		"\36\3\37\3\37\5\37\u018f\n\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\5\"\u019c\n\"\3#\3#\3$\3$\5$\u01a2\n$\3$\4\u0117\u0120\2%\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF\2\5\4\2\n\n\16"+
		"\16\3\2\t\16\6\2\3\4\t\17\21\21\27\27\u01d1\2K\3\2\2\2\4\\\3\2\2\2\6`"+
		"\3\2\2\2\bb\3\2\2\2\nd\3\2\2\2\fn\3\2\2\2\16v\3\2\2\2\20\u0089\3\2\2\2"+
		"\22\u009b\3\2\2\2\24\u00a3\3\2\2\2\26\u00ab\3\2\2\2\30\u00b4\3\2\2\2\32"+
		"\u00ba\3\2\2\2\34\u00c0\3\2\2\2\36\u00c3\3\2\2\2 \u00ca\3\2\2\2\"\u00cf"+
		"\3\2\2\2$\u00db\3\2\2\2&\u00ff\3\2\2\2(\u0108\3\2\2\2*\u010f\3\2\2\2,"+
		"\u0124\3\2\2\2.\u0126\3\2\2\2\60\u012b\3\2\2\2\62\u013e\3\2\2\2\64\u0143"+
		"\3\2\2\2\66\u015a\3\2\2\28\u0173\3\2\2\2:\u0182\3\2\2\2<\u018e\3\2\2\2"+
		">\u0190\3\2\2\2@\u0192\3\2\2\2B\u019b\3\2\2\2D\u019d\3\2\2\2F\u01a1\3"+
		"\2\2\2HJ\5\4\3\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LO\3\2\2\2MK\3"+
		"\2\2\2NP\5\"\22\2ON\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QR\7\2\2\3R\3\3\2\2\2S"+
		"T\5\36\20\2TU\5\6\4\2U]\3\2\2\2V]\5\f\7\2W]\5\24\13\2XY\5\"\22\2YZ\5\6"+
		"\4\2Z]\3\2\2\2[]\5$\23\2\\S\3\2\2\2\\V\3\2\2\2\\W\3\2\2\2\\X\3\2\2\2\\"+
		"[\3\2\2\2]\5\3\2\2\2^a\5\b\5\2_a\5\n\6\2`^\3\2\2\2`_\3\2\2\2a\7\3\2\2"+
		"\2bc\7\26\2\2c\t\3\2\2\2de\5> \2ef\5> \2fg\7\26\2\2g\13\3\2\2\2hi\5\16"+
		"\b\2ij\5\6\4\2jo\3\2\2\2kl\5\20\t\2lm\5\6\4\2mo\3\2\2\2nh\3\2\2\2nk\3"+
		"\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\r\3\2\2\2rt\5\22\n\2su\5<\37\2t"+
		"s\3\2\2\2tu\3\2\2\2uw\3\2\2\2vr\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2"+
		"yz\3\2\2\2z{\5&\24\2{\17\3\2\2\2|~\5@!\2}|\3\2\2\2~\177\3\2\2\2\177}\3"+
		"\2\2\2\177\u0080\3\2\2\2\u0080\u008a\3\2\2\2\u0081\u0082\5> \2\u0082\u0083"+
		"\5> \2\u0083\u0085\5> \2\u0084\u0086\5> \2\u0085\u0084\3\2\2\2\u0086\u0087"+
		"\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089"+
		"}\3\2\2\2\u0089\u0081\3\2\2\2\u008a\u008f\3\2\2\2\u008b\u008e\5@!\2\u008c"+
		"\u008e\5> \2\u008d\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2"+
		"\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u008f"+
		"\3\2\2\2\u0092\u0093\5&\24\2\u0093\21\3\2\2\2\u0094\u009c\7\7\2\2\u0095"+
		"\u0097\7\r\2\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2"+
		"\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\7\t\2\2\u009b"+
		"\u0094\3\2\2\2\u009b\u0096\3\2\2\2\u009c\23\3\2\2\2\u009d\u009e\5\26\f"+
		"\2\u009e\u009f\5\6\4\2\u009f\u00a4\3\2\2\2\u00a0\u00a1\5\20\t\2\u00a1"+
		"\u00a2\5\6\4\2\u00a2\u00a4\3\2\2\2\u00a3\u009d\3\2\2\2\u00a3\u00a0\3\2"+
		"\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\25\3\2\2\2\u00a7\u00a9\5\34\17\2\u00a8\u00aa\5<\37\2\u00a9\u00a8\3\2"+
		"\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a7\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\3\2"+
		"\2\2\u00af\u00b0\5\30\r\2\u00b0\27\3\2\2\2\u00b1\u00b5\5\36\20\2\u00b2"+
		"\u00b5\5\32\16\2\u00b3\u00b5\5\"\22\2\u00b4\u00b1\3\2\2\2\u00b4\u00b2"+
		"\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\31\3\2\2\2\u00b6\u00b8\5\22\n\2\u00b7"+
		"\u00b9\5<\37\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2"+
		"\2\2\u00ba\u00b6\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\5&\24\2\u00bf\33\3\2\2"+
		"\2\u00c0\u00c1\7\24\2\2\u00c1\35\3\2\2\2\u00c2\u00c4\5 \21\2\u00c3\u00c2"+
		"\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\u00c8\5<\37\2\u00c8\u00c9\5&\24\2\u00c9\37\3\2\2"+
		"\2\u00ca\u00cb\7\b\2\2\u00cb!\3\2\2\2\u00cc\u00ce\5<\37\2\u00cd\u00cc"+
		"\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\5&\24\2\u00d3#\3\2\2\2"+
		"\u00d4\u00d6\5<\37\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5"+
		"\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da"+
		"\u00dc\5\b\5\2\u00db\u00d7\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00db\3\2"+
		"\2\2\u00dd\u00de\3\2\2\2\u00de%\3\2\2\2\u00df\u00e1\5D#\2\u00e0\u00df"+
		"\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\u00e7\3\2\2\2\u00e4\u00e6\5(\25\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2"+
		"\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u0100\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00ea\u00ee\5\64\33\2\u00eb\u00ed\5\"\22\2\u00ec\u00eb"+
		"\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"\u0100\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f5\5\66\34\2\u00f2\u00f4\5"+
		"\"\22\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u0100\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00fc\58"+
		"\35\2\u00f9\u00fb\5\"\22\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc"+
		"\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2"+
		"\2\2\u00ff\u00e0\3\2\2\2\u00ff\u00ea\3\2\2\2\u00ff\u00f1\3\2\2\2\u00ff"+
		"\u00f8\3\2\2\2\u0100\'\3\2\2\2\u0101\u0109\5<\37\2\u0102\u0109\5D#\2\u0103"+
		"\u0109\7\b\2\2\u0104\u0109\7\7\2\2\u0105\u0109\7\23\2\2\u0106\u0109\7"+
		"\25\2\2\u0107\u0109\7\t\2\2\u0108\u0101\3\2\2\2\u0108\u0102\3\2\2\2\u0108"+
		"\u0103\3\2\2\2\u0108\u0104\3\2\2\2\u0108\u0105\3\2\2\2\u0108\u0106\3\2"+
		"\2\2\u0108\u0107\3\2\2\2\u0109)\3\2\2\2\u010a\u010e\5<\37\2\u010b\u010e"+
		"\5B\"\2\u010c\u010e\7\26\2\2\u010d\u010a\3\2\2\2\u010d\u010b\3\2\2\2\u010d"+
		"\u010c\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2"+
		"\2\2\u0110+\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0117\7\3\2\2\u0113\u0116"+
		"\5<\37\2\u0114\u0116\5B\"\2\u0115\u0113\3\2\2\2\u0115\u0114\3\2\2\2\u0116"+
		"\u0119\3\2\2\2\u0117\u0118\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u011a\3\2"+
		"\2\2\u0119\u0117\3\2\2\2\u011a\u0125\7\3\2\2\u011b\u0120\7\4\2\2\u011c"+
		"\u011f\5<\37\2\u011d\u011f\5B\"\2\u011e\u011c\3\2\2\2\u011e\u011d\3\2"+
		"\2\2\u011f\u0122\3\2\2\2\u0120\u0121\3\2\2\2\u0120\u011e\3\2\2\2\u0121"+
		"\u0123\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0125\7\4\2\2\u0124\u0112\3\2"+
		"\2\2\u0124\u011b\3\2\2\2\u0125-\3\2\2\2\u0126\u0127\5:\36\2\u0127/\3\2"+
		"\2\2\u0128\u012a\5F$\2\u0129\u0128\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129"+
		"\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012e\3\2\2\2\u012d\u012b\3\2\2\2\u012e"+
		"\u0132\5.\30\2\u012f\u0131\5F$\2\u0130\u012f\3\2\2\2\u0131\u0134\3\2\2"+
		"\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0135\3\2\2\2\u0134\u0132"+
		"\3\2\2\2\u0135\u0139\7\21\2\2\u0136\u0138\5F$\2\u0137\u0136\3\2\2\2\u0138"+
		"\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013c\3\2"+
		"\2\2\u013b\u0139\3\2\2\2\u013c\u013d\5,\27\2\u013d\61\3\2\2\2\u013e\u013f"+
		"\5:\36\2\u013f\63\3\2\2\2\u0140\u0142\5(\25\2\u0141\u0140\3\2\2\2\u0142"+
		"\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0146\3\2"+
		"\2\2\u0145\u0143\3\2\2\2\u0146\u0152\7\5\2\2\u0147\u0151\5<\37\2\u0148"+
		"\u0151\5D#\2\u0149\u0151\7\b\2\2\u014a\u0151\7\7\2\2\u014b\u0151\7\24"+
		"\2\2\u014c\u0151\7\23\2\2\u014d\u0151\7\25\2\2\u014e\u0151\7\t\2\2\u014f"+
		"\u0151\5\64\33\2\u0150\u0147\3\2\2\2\u0150\u0148\3\2\2\2\u0150\u0149\3"+
		"\2\2\2\u0150\u014a\3\2\2\2\u0150\u014b\3\2\2\2\u0150\u014c\3\2\2\2\u0150"+
		"\u014d\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u014f\3\2\2\2\u0151\u0154\3\2"+
		"\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0155\3\2\2\2\u0154"+
		"\u0152\3\2\2\2\u0155\u0156\7\6\2\2\u0156\65\3\2\2\2\u0157\u0159\5(\25"+
		"\2\u0158\u0157\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b"+
		"\3\2\2\2\u015b\u015d\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u015e\7\23\2\2"+
		"\u015e\u0162\5\62\32\2\u015f\u0161\5\60\31\2\u0160\u015f\3\2\2\2\u0161"+
		"\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0168\3\2"+
		"\2\2\u0164\u0162\3\2\2\2\u0165\u0167\5F$\2\u0166\u0165\3\2\2\2\u0167\u016a"+
		"\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016c\3\2\2\2\u016a"+
		"\u0168\3\2\2\2\u016b\u016d\7\25\2\2\u016c\u016b\3\2\2\2\u016c\u016d\3"+
		"\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\7\24\2\2\u016f\67\3\2\2\2\u0170"+
		"\u0172\5(\25\2\u0171\u0170\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2"+
		"\2\2\u0173\u0174\3\2\2\2\u0174\u0176\3\2\2\2\u0175\u0173\3\2\2\2\u0176"+
		"\u0177\7\23\2\2\u0177\u0178\7\25\2\2\u0178\u017c\5\62\32\2\u0179\u017b"+
		"\5F$\2\u017a\u0179\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c"+
		"\u017d\3\2\2\2\u017d\u017f\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0180\7\24"+
		"\2\2\u01809\3\2\2\2\u0181\u0183\t\2\2\2\u0182\u0181\3\2\2\2\u0183\u0184"+
		"\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0189\3\2\2\2\u0186"+
		"\u0188\t\3\2\2\u0187\u0186\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u0187\3\2"+
		"\2\2\u0189\u018a\3\2\2\2\u018a;\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018f"+
		"\5> \2\u018d\u018f\5@!\2\u018e\u018c\3\2\2\2\u018e\u018d\3\2\2\2\u018f"+
		"=\3\2\2\2\u0190\u0191\7\22\2\2\u0191?\3\2\2\2\u0192\u0193\7\20\2\2\u0193"+
		"A\3\2\2\2\u0194\u019c\5D#\2\u0195\u019c\7\b\2\2\u0196\u019c\7\7\2\2\u0197"+
		"\u019c\7\23\2\2\u0198\u019c\7\24\2\2\u0199\u019c\7\25\2\2\u019a\u019c"+
		"\7\t\2\2\u019b\u0194\3\2\2\2\u019b\u0195\3\2\2\2\u019b\u0196\3\2\2\2\u019b"+
		"\u0197\3\2\2\2\u019b\u0198\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019a\3\2"+
		"\2\2\u019cC\3\2\2\2\u019d\u019e\t\4\2\2\u019eE\3\2\2\2\u019f\u01a2\5<"+
		"\37\2\u01a0\u01a2\7\26\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a0\3\2\2\2\u01a2"+
		"G\3\2\2\2;KO\\`nptx\177\u0087\u0089\u008d\u008f\u0098\u009b\u00a3\u00a5"+
		"\u00a9\u00ad\u00b4\u00b8\u00bc\u00c5\u00cf\u00d7\u00dd\u00e2\u00e7\u00ee"+
		"\u00f5\u00fc\u00ff\u0108\u010d\u010f\u0115\u0117\u011e\u0120\u0124\u012b"+
		"\u0132\u0139\u0143\u0150\u0152\u015a\u0162\u0168\u016c\u0173\u017c\u0184"+
		"\u0189\u018e\u019b\u01a1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}