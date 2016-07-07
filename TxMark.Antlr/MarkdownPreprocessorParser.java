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
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				softCarriageReturn();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				hardCarriageReturn();
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

	public static class SoftCarriageReturnContext extends ParserRuleContext {
		public TerminalNode CARRIAGE_RETURN() { return getToken(MarkdownPreprocessorParser.CARRIAGE_RETURN, 0); }
		public SpaceContext space() {
			return getRuleContext(SpaceContext.class,0);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(96);
				space();
				}
			}

			setState(99);
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
			setState(101);
			space();
			setState(102);
			space();
			setState(103);
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
			setState(111); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(111);
					switch (_input.LA(1)) {
					case ASTERISK:
					case DIGIT:
						{
						setState(105);
						listItem();
						setState(106);
						carriageReturn();
						}
						break;
					case TAB:
					case SPACE:
						{
						setState(108);
						indentedText();
						setState(109);
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
				setState(113); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
			setState(119); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(115);
					listItemIndicator();
					setState(117);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						setState(116);
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
				setState(121); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(123);
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
			setState(138);
			switch (_input.LA(1)) {
			case TAB:
				{
				setState(126); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(125);
						tab();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(128); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case SPACE:
				{
				setState(130);
				space();
				setState(131);
				space();
				setState(132);
				space();
				setState(134); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(133);
						space();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(136); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(142);
					switch (_input.LA(1)) {
					case TAB:
						{
						setState(140);
						tab();
						}
						break;
					case SPACE:
						{
						setState(141);
						space();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(147);
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
			setState(156);
			switch (_input.LA(1)) {
			case ASTERISK:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(ASTERISK);
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(151); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(150);
					match(DIGIT);
					}
					}
					setState(153); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				setState(155);
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
			setState(164); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(164);
					switch (_input.LA(1)) {
					case GREATER_THAN:
						{
						setState(158);
						blockquoteItem();
						setState(159);
						carriageReturn();
						}
						break;
					case TAB:
					case SPACE:
						{
						setState(161);
						indentedText();
						setState(162);
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
				setState(166); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
			setState(172); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(168);
				blockquoteIndicator();
				setState(170);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(169);
					whitespace();
					}
					break;
				}
				}
				}
				setState(174); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==GREATER_THAN );
			setState(176);
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
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				heading();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				blockQuoteListItem();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
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
			setState(187); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(183);
					listItemIndicator();
					setState(185);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						setState(184);
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
				setState(189); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(191);
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
			setState(193);
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
			setState(196); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(195);
				headingIndicator();
				}
				}
				setState(198); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==HASH );
			setState(200);
			whitespace();
			setState(201);
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
			setState(203);
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
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(205);
					whitespace();
					}
					} 
				}
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(211);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(220); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(216);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(213);
							whitespace();
							}
							} 
						}
						setState(218);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
					}
					setState(219);
					softCarriageReturn();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(222); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(224);
						nonWhitespace();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(227); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(229);
						safeText();
						}
						} 
					}
					setState(234);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				parenthesisClause();
				setState(239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(236);
						textLine();
						}
						} 
					}
					setState(241);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				openTag();
				setState(246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(243);
						textLine();
						}
						} 
					}
					setState(248);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(249);
				closeTag();
				setState(253);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(250);
						textLine();
						}
						} 
					}
					setState(255);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(258);
				whitespace();
				}
				break;
			case 2:
				{
				setState(259);
				nonWhitespace();
				}
				break;
			case 3:
				{
				setState(260);
				match(HASH);
				}
				break;
			case 4:
				{
				setState(261);
				match(ASTERISK);
				}
				break;
			case 5:
				{
				setState(262);
				match(LESS_THAN);
				}
				break;
			case 6:
				{
				setState(263);
				match(SLASH);
				}
				break;
			case 7:
				{
				setState(264);
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
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOUBLE_QUOTE) | (1L << SINGLE_QUOTE) | (1L << ASTERISK) | (1L << HASH) | (1L << PERIOD) | (1L << COLON) | (1L << UNDERBAR) | (1L << DASH) | (1L << DIGIT) | (1L << LETTER) | (1L << PUNCTUATION) | (1L << TAB) | (1L << EQUAL) | (1L << SPACE) | (1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << SLASH) | (1L << CARRIAGE_RETURN) | (1L << NON_WHITESPACE))) != 0)) {
				{
				setState(270);
				switch (_input.LA(1)) {
				case TAB:
				case SPACE:
					{
					setState(267);
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
					setState(268);
					anyNonWhitespace();
					}
					break;
				case CARRIAGE_RETURN:
					{
					setState(269);
					match(CARRIAGE_RETURN);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(274);
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
			setState(293);
			switch (_input.LA(1)) {
			case DOUBLE_QUOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				match(DOUBLE_QUOTE);
				setState(280);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						setState(278);
						switch (_input.LA(1)) {
						case TAB:
						case SPACE:
							{
							setState(276);
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
							setState(277);
							anyNonWhitespace();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(282);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				setState(283);
				match(DOUBLE_QUOTE);
				}
				break;
			case SINGLE_QUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				match(SINGLE_QUOTE);
				setState(289);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						setState(287);
						switch (_input.LA(1)) {
						case TAB:
						case SPACE:
							{
							setState(285);
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
							setState(286);
							anyNonWhitespace();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(291);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				}
				setState(292);
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
			setState(295);
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
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAB) | (1L << SPACE) | (1L << CARRIAGE_RETURN))) != 0)) {
				{
				{
				setState(297);
				anyWhitespace();
				}
				}
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(303);
			attributeName();
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAB) | (1L << SPACE) | (1L << CARRIAGE_RETURN))) != 0)) {
				{
				{
				setState(304);
				anyWhitespace();
				}
				}
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(310);
			match(EQUAL);
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAB) | (1L << SPACE) | (1L << CARRIAGE_RETURN))) != 0)) {
				{
				{
				setState(311);
				anyWhitespace();
				}
				}
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(317);
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
			setState(319);
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
		public List<AnyWhitespaceContext> anyWhitespace() {
			return getRuleContexts(AnyWhitespaceContext.class);
		}
		public AnyWhitespaceContext anyWhitespace(int i) {
			return getRuleContext(AnyWhitespaceContext.class,i);
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
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOUBLE_QUOTE) | (1L << SINGLE_QUOTE) | (1L << ASTERISK) | (1L << HASH) | (1L << PERIOD) | (1L << COLON) | (1L << UNDERBAR) | (1L << DASH) | (1L << DIGIT) | (1L << LETTER) | (1L << PUNCTUATION) | (1L << TAB) | (1L << EQUAL) | (1L << SPACE) | (1L << LESS_THAN) | (1L << SLASH) | (1L << NON_WHITESPACE))) != 0)) {
				{
				{
				setState(321);
				safeText();
				}
				}
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(327);
			match(OPEN_PARENTHESIS);
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOUBLE_QUOTE) | (1L << SINGLE_QUOTE) | (1L << OPEN_PARENTHESIS) | (1L << ASTERISK) | (1L << HASH) | (1L << PERIOD) | (1L << COLON) | (1L << UNDERBAR) | (1L << DASH) | (1L << DIGIT) | (1L << LETTER) | (1L << PUNCTUATION) | (1L << TAB) | (1L << EQUAL) | (1L << SPACE) | (1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << SLASH) | (1L << CARRIAGE_RETURN) | (1L << NON_WHITESPACE))) != 0)) {
				{
				setState(337);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(328);
					anyWhitespace();
					}
					break;
				case 2:
					{
					setState(329);
					nonWhitespace();
					}
					break;
				case 3:
					{
					setState(330);
					match(HASH);
					}
					break;
				case 4:
					{
					setState(331);
					match(ASTERISK);
					}
					break;
				case 5:
					{
					setState(332);
					match(GREATER_THAN);
					}
					break;
				case 6:
					{
					setState(333);
					match(LESS_THAN);
					}
					break;
				case 7:
					{
					setState(334);
					match(SLASH);
					}
					break;
				case 8:
					{
					setState(335);
					match(PERIOD);
					}
					break;
				case 9:
					{
					setState(336);
					parenthesisClause();
					}
					break;
				}
				}
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(342);
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
			setState(347);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(344);
					safeText();
					}
					} 
				}
				setState(349);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			setState(350);
			match(LESS_THAN);
			setState(351);
			tag();
			setState(355);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(352);
					attribute();
					}
					} 
				}
				setState(357);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAB) | (1L << SPACE) | (1L << CARRIAGE_RETURN))) != 0)) {
				{
				{
				setState(358);
				anyWhitespace();
				}
				}
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(365);
			_la = _input.LA(1);
			if (_la==SLASH) {
				{
				setState(364);
				match(SLASH);
				}
			}

			setState(367);
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
			setState(372);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(369);
					safeText();
					}
					} 
				}
				setState(374);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			}
			setState(375);
			match(LESS_THAN);
			setState(376);
			match(SLASH);
			setState(377);
			tag();
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAB) | (1L << SPACE) | (1L << CARRIAGE_RETURN))) != 0)) {
				{
				{
				setState(378);
				anyWhitespace();
				}
				}
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(384);
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
			setState(387); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(386);
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
				setState(389); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(394);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(391);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PERIOD) | (1L << COLON) | (1L << UNDERBAR) | (1L << DASH) | (1L << DIGIT) | (1L << LETTER))) != 0)) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					} 
				}
				setState(396);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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
			setState(399);
			switch (_input.LA(1)) {
			case SPACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(397);
				space();
				}
				break;
			case TAB:
				enterOuterAlt(_localctx, 2);
				{
				setState(398);
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
			setState(401);
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
			setState(403);
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
			setState(412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
				nonWhitespace();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
				match(HASH);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(407);
				match(ASTERISK);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(408);
				match(LESS_THAN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(409);
				match(GREATER_THAN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(410);
				match(SLASH);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(411);
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
			setState(414);
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
			setState(418);
			switch (_input.LA(1)) {
			case TAB:
			case SPACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				whitespace();
				}
				break;
			case CARRIAGE_RETURN:
				enterOuterAlt(_localctx, 2);
				{
				setState(417);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\27\u01a7\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\7\2J\n\2\f\2\16\2M\13\2\3\2\5\2P\n\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3]\n\3\3\4\3\4\5\4a\n\4\3\5\5"+
		"\5d\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\6\7r\n\7\r\7\16"+
		"\7s\3\b\3\b\5\bx\n\b\6\bz\n\b\r\b\16\b{\3\b\3\b\3\t\6\t\u0081\n\t\r\t"+
		"\16\t\u0082\3\t\3\t\3\t\3\t\6\t\u0089\n\t\r\t\16\t\u008a\5\t\u008d\n\t"+
		"\3\t\3\t\7\t\u0091\n\t\f\t\16\t\u0094\13\t\3\t\3\t\3\n\3\n\6\n\u009a\n"+
		"\n\r\n\16\n\u009b\3\n\5\n\u009f\n\n\3\13\3\13\3\13\3\13\3\13\3\13\6\13"+
		"\u00a7\n\13\r\13\16\13\u00a8\3\f\3\f\5\f\u00ad\n\f\6\f\u00af\n\f\r\f\16"+
		"\f\u00b0\3\f\3\f\3\r\3\r\3\r\5\r\u00b8\n\r\3\16\3\16\5\16\u00bc\n\16\6"+
		"\16\u00be\n\16\r\16\16\16\u00bf\3\16\3\16\3\17\3\17\3\20\6\20\u00c7\n"+
		"\20\r\20\16\20\u00c8\3\20\3\20\3\20\3\21\3\21\3\22\7\22\u00d1\n\22\f\22"+
		"\16\22\u00d4\13\22\3\22\3\22\3\23\7\23\u00d9\n\23\f\23\16\23\u00dc\13"+
		"\23\3\23\6\23\u00df\n\23\r\23\16\23\u00e0\3\24\6\24\u00e4\n\24\r\24\16"+
		"\24\u00e5\3\24\7\24\u00e9\n\24\f\24\16\24\u00ec\13\24\3\24\3\24\7\24\u00f0"+
		"\n\24\f\24\16\24\u00f3\13\24\3\24\3\24\7\24\u00f7\n\24\f\24\16\24\u00fa"+
		"\13\24\3\24\3\24\7\24\u00fe\n\24\f\24\16\24\u0101\13\24\5\24\u0103\n\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u010c\n\25\3\26\3\26\3\26\7\26"+
		"\u0111\n\26\f\26\16\26\u0114\13\26\3\27\3\27\3\27\7\27\u0119\n\27\f\27"+
		"\16\27\u011c\13\27\3\27\3\27\3\27\3\27\7\27\u0122\n\27\f\27\16\27\u0125"+
		"\13\27\3\27\5\27\u0128\n\27\3\30\3\30\3\31\7\31\u012d\n\31\f\31\16\31"+
		"\u0130\13\31\3\31\3\31\7\31\u0134\n\31\f\31\16\31\u0137\13\31\3\31\3\31"+
		"\7\31\u013b\n\31\f\31\16\31\u013e\13\31\3\31\3\31\3\32\3\32\3\33\7\33"+
		"\u0145\n\33\f\33\16\33\u0148\13\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\7\33\u0154\n\33\f\33\16\33\u0157\13\33\3\33\3\33\3\34"+
		"\7\34\u015c\n\34\f\34\16\34\u015f\13\34\3\34\3\34\3\34\7\34\u0164\n\34"+
		"\f\34\16\34\u0167\13\34\3\34\7\34\u016a\n\34\f\34\16\34\u016d\13\34\3"+
		"\34\5\34\u0170\n\34\3\34\3\34\3\35\7\35\u0175\n\35\f\35\16\35\u0178\13"+
		"\35\3\35\3\35\3\35\3\35\7\35\u017e\n\35\f\35\16\35\u0181\13\35\3\35\3"+
		"\35\3\36\6\36\u0186\n\36\r\36\16\36\u0187\3\36\7\36\u018b\n\36\f\36\16"+
		"\36\u018e\13\36\3\37\3\37\5\37\u0192\n\37\3 \3 \3!\3!\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\5\"\u019f\n\"\3#\3#\3$\3$\5$\u01a5\n$\3$\4\u011a\u0123\2"+
		"%\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF"+
		"\2\5\4\2\n\n\16\16\3\2\t\16\6\2\3\4\t\17\21\21\27\27\u01d5\2K\3\2\2\2"+
		"\4\\\3\2\2\2\6`\3\2\2\2\bc\3\2\2\2\ng\3\2\2\2\fq\3\2\2\2\16y\3\2\2\2\20"+
		"\u008c\3\2\2\2\22\u009e\3\2\2\2\24\u00a6\3\2\2\2\26\u00ae\3\2\2\2\30\u00b7"+
		"\3\2\2\2\32\u00bd\3\2\2\2\34\u00c3\3\2\2\2\36\u00c6\3\2\2\2 \u00cd\3\2"+
		"\2\2\"\u00d2\3\2\2\2$\u00de\3\2\2\2&\u0102\3\2\2\2(\u010b\3\2\2\2*\u0112"+
		"\3\2\2\2,\u0127\3\2\2\2.\u0129\3\2\2\2\60\u012e\3\2\2\2\62\u0141\3\2\2"+
		"\2\64\u0146\3\2\2\2\66\u015d\3\2\2\28\u0176\3\2\2\2:\u0185\3\2\2\2<\u0191"+
		"\3\2\2\2>\u0193\3\2\2\2@\u0195\3\2\2\2B\u019e\3\2\2\2D\u01a0\3\2\2\2F"+
		"\u01a4\3\2\2\2HJ\5\4\3\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LO\3\2"+
		"\2\2MK\3\2\2\2NP\5\"\22\2ON\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QR\7\2\2\3R\3\3"+
		"\2\2\2ST\5\36\20\2TU\5\6\4\2U]\3\2\2\2V]\5\f\7\2W]\5\24\13\2XY\5\"\22"+
		"\2YZ\5\6\4\2Z]\3\2\2\2[]\5$\23\2\\S\3\2\2\2\\V\3\2\2\2\\W\3\2\2\2\\X\3"+
		"\2\2\2\\[\3\2\2\2]\5\3\2\2\2^a\5\b\5\2_a\5\n\6\2`^\3\2\2\2`_\3\2\2\2a"+
		"\7\3\2\2\2bd\5> \2cb\3\2\2\2cd\3\2\2\2de\3\2\2\2ef\7\26\2\2f\t\3\2\2\2"+
		"gh\5> \2hi\5> \2ij\7\26\2\2j\13\3\2\2\2kl\5\16\b\2lm\5\6\4\2mr\3\2\2\2"+
		"no\5\20\t\2op\5\6\4\2pr\3\2\2\2qk\3\2\2\2qn\3\2\2\2rs\3\2\2\2sq\3\2\2"+
		"\2st\3\2\2\2t\r\3\2\2\2uw\5\22\n\2vx\5<\37\2wv\3\2\2\2wx\3\2\2\2xz\3\2"+
		"\2\2yu\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\5&\24\2~\17\3"+
		"\2\2\2\177\u0081\5@!\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u008d\3\2\2\2\u0084\u0085\5> \2\u0085"+
		"\u0086\5> \2\u0086\u0088\5> \2\u0087\u0089\5> \2\u0088\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2"+
		"\2\2\u008c\u0080\3\2\2\2\u008c\u0084\3\2\2\2\u008d\u0092\3\2\2\2\u008e"+
		"\u0091\5@!\2\u008f\u0091\5> \2\u0090\u008e\3\2\2\2\u0090\u008f\3\2\2\2"+
		"\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095"+
		"\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096\5&\24\2\u0096\21\3\2\2\2\u0097"+
		"\u009f\7\7\2\2\u0098\u009a\7\r\2\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2"+
		"\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009f\7\t\2\2\u009e\u0097\3\2\2\2\u009e\u0099\3\2\2\2\u009f\23\3\2\2"+
		"\2\u00a0\u00a1\5\26\f\2\u00a1\u00a2\5\6\4\2\u00a2\u00a7\3\2\2\2\u00a3"+
		"\u00a4\5\20\t\2\u00a4\u00a5\5\6\4\2\u00a5\u00a7\3\2\2\2\u00a6\u00a0\3"+
		"\2\2\2\u00a6\u00a3\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\25\3\2\2\2\u00aa\u00ac\5\34\17\2\u00ab\u00ad\5<\37"+
		"\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00aa"+
		"\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b3\5\30\r\2\u00b3\27\3\2\2\2\u00b4\u00b8\5\36"+
		"\20\2\u00b5\u00b8\5\32\16\2\u00b6\u00b8\5\"\22\2\u00b7\u00b4\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\31\3\2\2\2\u00b9\u00bb\5\22\n"+
		"\2\u00ba\u00bc\5<\37\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be"+
		"\3\2\2\2\u00bd\u00b9\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\5&\24\2\u00c2\33\3\2\2"+
		"\2\u00c3\u00c4\7\24\2\2\u00c4\35\3\2\2\2\u00c5\u00c7\5 \21\2\u00c6\u00c5"+
		"\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00cb\5<\37\2\u00cb\u00cc\5&\24\2\u00cc\37\3\2\2"+
		"\2\u00cd\u00ce\7\b\2\2\u00ce!\3\2\2\2\u00cf\u00d1\5<\37\2\u00d0\u00cf"+
		"\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\5&\24\2\u00d6#\3\2\2\2"+
		"\u00d7\u00d9\5<\37\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8"+
		"\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd"+
		"\u00df\5\b\5\2\u00de\u00da\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00de\3\2"+
		"\2\2\u00e0\u00e1\3\2\2\2\u00e1%\3\2\2\2\u00e2\u00e4\5D#\2\u00e3\u00e2"+
		"\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00ea\3\2\2\2\u00e7\u00e9\5(\25\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec\3\2"+
		"\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u0103\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ed\u00f1\5\64\33\2\u00ee\u00f0\5\"\22\2\u00ef\u00ee"+
		"\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\u0103\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f8\5\66\34\2\u00f5\u00f7\5"+
		"\"\22\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u0103\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00ff\58"+
		"\35\2\u00fc\u00fe\5\"\22\2\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2"+
		"\2\2\u0102\u00e3\3\2\2\2\u0102\u00ed\3\2\2\2\u0102\u00f4\3\2\2\2\u0102"+
		"\u00fb\3\2\2\2\u0103\'\3\2\2\2\u0104\u010c\5<\37\2\u0105\u010c\5D#\2\u0106"+
		"\u010c\7\b\2\2\u0107\u010c\7\7\2\2\u0108\u010c\7\23\2\2\u0109\u010c\7"+
		"\25\2\2\u010a\u010c\7\t\2\2\u010b\u0104\3\2\2\2\u010b\u0105\3\2\2\2\u010b"+
		"\u0106\3\2\2\2\u010b\u0107\3\2\2\2\u010b\u0108\3\2\2\2\u010b\u0109\3\2"+
		"\2\2\u010b\u010a\3\2\2\2\u010c)\3\2\2\2\u010d\u0111\5<\37\2\u010e\u0111"+
		"\5B\"\2\u010f\u0111\7\26\2\2\u0110\u010d\3\2\2\2\u0110\u010e\3\2\2\2\u0110"+
		"\u010f\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2"+
		"\2\2\u0113+\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u011a\7\3\2\2\u0116\u0119"+
		"\5<\37\2\u0117\u0119\5B\"\2\u0118\u0116\3\2\2\2\u0118\u0117\3\2\2\2\u0119"+
		"\u011c\3\2\2\2\u011a\u011b\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011d\3\2"+
		"\2\2\u011c\u011a\3\2\2\2\u011d\u0128\7\3\2\2\u011e\u0123\7\4\2\2\u011f"+
		"\u0122\5<\37\2\u0120\u0122\5B\"\2\u0121\u011f\3\2\2\2\u0121\u0120\3\2"+
		"\2\2\u0122\u0125\3\2\2\2\u0123\u0124\3\2\2\2\u0123\u0121\3\2\2\2\u0124"+
		"\u0126\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u0128\7\4\2\2\u0127\u0115\3\2"+
		"\2\2\u0127\u011e\3\2\2\2\u0128-\3\2\2\2\u0129\u012a\5:\36\2\u012a/\3\2"+
		"\2\2\u012b\u012d\5F$\2\u012c\u012b\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c"+
		"\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0131\3\2\2\2\u0130\u012e\3\2\2\2\u0131"+
		"\u0135\5.\30\2\u0132\u0134\5F$\2\u0133\u0132\3\2\2\2\u0134\u0137\3\2\2"+
		"\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u0135"+
		"\3\2\2\2\u0138\u013c\7\21\2\2\u0139\u013b\5F$\2\u013a\u0139\3\2\2\2\u013b"+
		"\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013f\3\2"+
		"\2\2\u013e\u013c\3\2\2\2\u013f\u0140\5,\27\2\u0140\61\3\2\2\2\u0141\u0142"+
		"\5:\36\2\u0142\63\3\2\2\2\u0143\u0145\5(\25\2\u0144\u0143\3\2\2\2\u0145"+
		"\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0149\3\2"+
		"\2\2\u0148\u0146\3\2\2\2\u0149\u0155\7\5\2\2\u014a\u0154\5F$\2\u014b\u0154"+
		"\5D#\2\u014c\u0154\7\b\2\2\u014d\u0154\7\7\2\2\u014e\u0154\7\24\2\2\u014f"+
		"\u0154\7\23\2\2\u0150\u0154\7\25\2\2\u0151\u0154\7\t\2\2\u0152\u0154\5"+
		"\64\33\2\u0153\u014a\3\2\2\2\u0153\u014b\3\2\2\2\u0153\u014c\3\2\2\2\u0153"+
		"\u014d\3\2\2\2\u0153\u014e\3\2\2\2\u0153\u014f\3\2\2\2\u0153\u0150\3\2"+
		"\2\2\u0153\u0151\3\2\2\2\u0153\u0152\3\2\2\2\u0154\u0157\3\2\2\2\u0155"+
		"\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0158\3\2\2\2\u0157\u0155\3\2"+
		"\2\2\u0158\u0159\7\6\2\2\u0159\65\3\2\2\2\u015a\u015c\5(\25\2\u015b\u015a"+
		"\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e"+
		"\u0160\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0161\7\23\2\2\u0161\u0165\5"+
		"\62\32\2\u0162\u0164\5\60\31\2\u0163\u0162\3\2\2\2\u0164\u0167\3\2\2\2"+
		"\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u016b\3\2\2\2\u0167\u0165"+
		"\3\2\2\2\u0168\u016a\5F$\2\u0169\u0168\3\2\2\2\u016a\u016d\3\2\2\2\u016b"+
		"\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2"+
		"\2\2\u016e\u0170\7\25\2\2\u016f\u016e\3\2\2\2\u016f\u0170\3\2\2\2\u0170"+
		"\u0171\3\2\2\2\u0171\u0172\7\24\2\2\u0172\67\3\2\2\2\u0173\u0175\5(\25"+
		"\2\u0174\u0173\3\2\2\2\u0175\u0178\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177"+
		"\3\2\2\2\u0177\u0179\3\2\2\2\u0178\u0176\3\2\2\2\u0179\u017a\7\23\2\2"+
		"\u017a\u017b\7\25\2\2\u017b\u017f\5\62\32\2\u017c\u017e\5F$\2\u017d\u017c"+
		"\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180"+
		"\u0182\3\2\2\2\u0181\u017f\3\2\2\2\u0182\u0183\7\24\2\2\u01839\3\2\2\2"+
		"\u0184\u0186\t\2\2\2\u0185\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0185"+
		"\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018c\3\2\2\2\u0189\u018b\t\3\2\2\u018a"+
		"\u0189\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2"+
		"\2\2\u018d;\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0192\5> \2\u0190\u0192"+
		"\5@!\2\u0191\u018f\3\2\2\2\u0191\u0190\3\2\2\2\u0192=\3\2\2\2\u0193\u0194"+
		"\7\22\2\2\u0194?\3\2\2\2\u0195\u0196\7\20\2\2\u0196A\3\2\2\2\u0197\u019f"+
		"\5D#\2\u0198\u019f\7\b\2\2\u0199\u019f\7\7\2\2\u019a\u019f\7\23\2\2\u019b"+
		"\u019f\7\24\2\2\u019c\u019f\7\25\2\2\u019d\u019f\7\t\2\2\u019e\u0197\3"+
		"\2\2\2\u019e\u0198\3\2\2\2\u019e\u0199\3\2\2\2\u019e\u019a\3\2\2\2\u019e"+
		"\u019b\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019d\3\2\2\2\u019fC\3\2\2\2"+
		"\u01a0\u01a1\t\4\2\2\u01a1E\3\2\2\2\u01a2\u01a5\5<\37\2\u01a3\u01a5\7"+
		"\26\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a3\3\2\2\2\u01a5G\3\2\2\2<KO\\`c"+
		"qsw{\u0082\u008a\u008c\u0090\u0092\u009b\u009e\u00a6\u00a8\u00ac\u00b0"+
		"\u00b7\u00bb\u00bf\u00c8\u00d2\u00da\u00e0\u00e5\u00ea\u00f1\u00f8\u00ff"+
		"\u0102\u010b\u0110\u0112\u0118\u011a\u0121\u0123\u0127\u012e\u0135\u013c"+
		"\u0146\u0153\u0155\u015d\u0165\u016b\u016f\u0176\u017f\u0187\u018c\u0191"+
		"\u019e\u01a4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}