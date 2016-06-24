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
		DOUBLE_QUOTE=1, SINGLE_QUOTE=2, ASTERISK=3, HASH=4, PERIOD=5, COLON=6, 
		UNDERBAR=7, DASH=8, DIGIT=9, LETTER=10, PUNCTUATION=11, TAB=12, EQUAL=13, 
		SPACE=14, LESS_THAN=15, GREATER_THAN=16, SLASH=17, CARRIAGE_RETURN=18, 
		NON_WHITESPACE=19;
	public static final int
		RULE_document = 0, RULE_line = 1, RULE_carriageReturn = 2, RULE_softCarriageReturn = 3, 
		RULE_hardCarriageReturn = 4, RULE_list = 5, RULE_listItem = 6, RULE_indentedText = 7, 
		RULE_listItemIndicator = 8, RULE_blockquote = 9, RULE_blockquoteItem = 10, 
		RULE_blockQuoteElement = 11, RULE_blockQuoteListItem = 12, RULE_blockquoteIndicator = 13, 
		RULE_heading = 14, RULE_headingIndicator = 15, RULE_textLine = 16, RULE_paragraph_end = 17, 
		RULE_text = 18, RULE_attributeContent = 19, RULE_attributeValue = 20, 
		RULE_attributeName = 21, RULE_attribute = 22, RULE_tag = 23, RULE_openTag = 24, 
		RULE_closeTag = 25, RULE_identifier = 26, RULE_whitespace = 27, RULE_space = 28, 
		RULE_tab = 29, RULE_anyNonWhitespace = 30, RULE_nonWhitespace = 31, RULE_anyWhitespace = 32;
	public static final String[] ruleNames = {
		"document", "line", "carriageReturn", "softCarriageReturn", "hardCarriageReturn", 
		"list", "listItem", "indentedText", "listItemIndicator", "blockquote", 
		"blockquoteItem", "blockQuoteElement", "blockQuoteListItem", "blockquoteIndicator", 
		"heading", "headingIndicator", "textLine", "paragraph_end", "text", "attributeContent", 
		"attributeValue", "attributeName", "attribute", "tag", "openTag", "closeTag", 
		"identifier", "whitespace", "space", "tab", "anyNonWhitespace", "nonWhitespace", 
		"anyWhitespace"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\"'", "'''", "'*'", "'#'", "'.'", "':'", "'_'", "'-'", null, null, 
		null, "'\t'", "'='", "' '", "'<'", "'>'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DOUBLE_QUOTE", "SINGLE_QUOTE", "ASTERISK", "HASH", "PERIOD", "COLON", 
		"UNDERBAR", "DASH", "DIGIT", "LETTER", "PUNCTUATION", "TAB", "EQUAL", 
		"SPACE", "LESS_THAN", "GREATER_THAN", "SLASH", "CARRIAGE_RETURN", "NON_WHITESPACE"
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
			setState(69);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(66);
					line();
					}
					} 
				}
				setState(71);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(73);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOUBLE_QUOTE) | (1L << SINGLE_QUOTE) | (1L << PERIOD) | (1L << COLON) | (1L << UNDERBAR) | (1L << DASH) | (1L << DIGIT) | (1L << LETTER) | (1L << PUNCTUATION) | (1L << TAB) | (1L << EQUAL) | (1L << SPACE) | (1L << LESS_THAN) | (1L << NON_WHITESPACE))) != 0)) {
				{
				setState(72);
				textLine();
				}
			}

			setState(75);
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
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				heading();
				setState(78);
				carriageReturn();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				list();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				blockquote();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				textLine();
				setState(83);
				carriageReturn();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(85);
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
			setState(90);
			switch (_input.LA(1)) {
			case CARRIAGE_RETURN:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				softCarriageReturn();
				}
				break;
			case SPACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
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
			setState(92);
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
			setState(94);
			space();
			setState(95);
			space();
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
			setState(104); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(104);
					switch (_input.LA(1)) {
					case ASTERISK:
					case DIGIT:
						{
						setState(98);
						listItem();
						setState(99);
						carriageReturn();
						}
						break;
					case TAB:
					case SPACE:
						{
						setState(101);
						indentedText();
						setState(102);
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
				setState(106); 
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(112); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(108);
					listItemIndicator();
					setState(110);
					_la = _input.LA(1);
					if (_la==TAB || _la==SPACE) {
						{
						setState(109);
						whitespace();
						}
					}

					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(114); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(116);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			switch (_input.LA(1)) {
			case TAB:
				{
				setState(119); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(118);
						tab();
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
				}
				break;
			case SPACE:
				{
				setState(123);
				space();
				setState(124);
				space();
				setState(125);
				space();
				setState(127); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(126);
						space();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(129); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAB || _la==SPACE) {
				{
				setState(135);
				switch (_input.LA(1)) {
				case TAB:
					{
					setState(133);
					tab();
					}
					break;
				case SPACE:
					{
					setState(134);
					space();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
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
			setState(149);
			switch (_input.LA(1)) {
			case ASTERISK:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(ASTERISK);
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(144); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(143);
					match(DIGIT);
					}
					}
					setState(146); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				setState(148);
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
			setState(157); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(157);
					switch (_input.LA(1)) {
					case GREATER_THAN:
						{
						setState(151);
						blockquoteItem();
						setState(152);
						carriageReturn();
						}
						break;
					case TAB:
					case SPACE:
						{
						setState(154);
						indentedText();
						setState(155);
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
				setState(159); 
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
			setState(165); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(161);
				blockquoteIndicator();
				setState(163);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(162);
					whitespace();
					}
					break;
				}
				}
				}
				setState(167); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==GREATER_THAN );
			setState(169);
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
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				heading();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				blockQuoteListItem();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(180); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(176);
					listItemIndicator();
					setState(178);
					_la = _input.LA(1);
					if (_la==TAB || _la==SPACE) {
						{
						setState(177);
						whitespace();
						}
					}

					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(182); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(184);
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
			setState(186);
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
			setState(189); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(188);
				headingIndicator();
				}
				}
				setState(191); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==HASH );
			setState(193);
			whitespace();
			setState(194);
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
			setState(196);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAB || _la==SPACE) {
				{
				{
				setState(198);
				whitespace();
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
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
			setState(213); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==TAB || _la==SPACE) {
						{
						{
						setState(206);
						whitespace();
						}
						}
						setState(211);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(212);
					softCarriageReturn();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(215); 
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
		public List<WhitespaceContext> whitespace() {
			return getRuleContexts(WhitespaceContext.class);
		}
		public WhitespaceContext whitespace(int i) {
			return getRuleContext(WhitespaceContext.class,i);
		}
		public List<TerminalNode> HASH() { return getTokens(MarkdownPreprocessorParser.HASH); }
		public TerminalNode HASH(int i) {
			return getToken(MarkdownPreprocessorParser.HASH, i);
		}
		public List<TerminalNode> ASTERISK() { return getTokens(MarkdownPreprocessorParser.ASTERISK); }
		public TerminalNode ASTERISK(int i) {
			return getToken(MarkdownPreprocessorParser.ASTERISK, i);
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
		public OpenTagContext openTag() {
			return getRuleContext(OpenTagContext.class,0);
		}
		public List<TextLineContext> textLine() {
			return getRuleContexts(TextLineContext.class);
		}
		public TextLineContext textLine(int i) {
			return getRuleContext(TextLineContext.class,i);
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
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(218); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(217);
						nonWhitespace();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(220); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(229);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
						case 1:
							{
							setState(222);
							whitespace();
							}
							break;
						case 2:
							{
							setState(223);
							nonWhitespace();
							}
							break;
						case 3:
							{
							setState(224);
							match(HASH);
							}
							break;
						case 4:
							{
							setState(225);
							match(ASTERISK);
							}
							break;
						case 5:
							{
							setState(226);
							match(LESS_THAN);
							}
							break;
						case 6:
							{
							setState(227);
							match(SLASH);
							}
							break;
						case 7:
							{
							setState(228);
							match(PERIOD);
							}
							break;
						}
						} 
					}
					setState(233);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				openTag();
				setState(238);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(235);
						textLine();
						}
						} 
					}
					setState(240);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				closeTag();
				setState(245);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(242);
						textLine();
						}
						} 
					}
					setState(247);
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
		enterRule(_localctx, 38, RULE_attributeContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOUBLE_QUOTE) | (1L << SINGLE_QUOTE) | (1L << ASTERISK) | (1L << HASH) | (1L << PERIOD) | (1L << COLON) | (1L << UNDERBAR) | (1L << DASH) | (1L << DIGIT) | (1L << LETTER) | (1L << PUNCTUATION) | (1L << TAB) | (1L << EQUAL) | (1L << SPACE) | (1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << SLASH) | (1L << CARRIAGE_RETURN) | (1L << NON_WHITESPACE))) != 0)) {
				{
				setState(253);
				switch (_input.LA(1)) {
				case TAB:
				case SPACE:
					{
					setState(250);
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
					setState(251);
					anyNonWhitespace();
					}
					break;
				case CARRIAGE_RETURN:
					{
					setState(252);
					match(CARRIAGE_RETURN);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(257);
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
		enterRule(_localctx, 40, RULE_attributeValue);
		try {
			int _alt;
			setState(276);
			switch (_input.LA(1)) {
			case DOUBLE_QUOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				match(DOUBLE_QUOTE);
				setState(263);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						setState(261);
						switch (_input.LA(1)) {
						case TAB:
						case SPACE:
							{
							setState(259);
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
							setState(260);
							anyNonWhitespace();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(265);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				setState(266);
				match(DOUBLE_QUOTE);
				}
				break;
			case SINGLE_QUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				match(SINGLE_QUOTE);
				setState(272);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						setState(270);
						switch (_input.LA(1)) {
						case TAB:
						case SPACE:
							{
							setState(268);
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
							setState(269);
							anyNonWhitespace();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(274);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				setState(275);
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
		enterRule(_localctx, 42, RULE_attributeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
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
		enterRule(_localctx, 44, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAB) | (1L << SPACE) | (1L << CARRIAGE_RETURN))) != 0)) {
				{
				{
				setState(280);
				anyWhitespace();
				}
				}
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(286);
			attributeName();
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAB) | (1L << SPACE) | (1L << CARRIAGE_RETURN))) != 0)) {
				{
				{
				setState(287);
				anyWhitespace();
				}
				}
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(293);
			match(EQUAL);
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
		enterRule(_localctx, 46, RULE_tag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
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

	public static class OpenTagContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(MarkdownPreprocessorParser.LESS_THAN, 0); }
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
		}
		public TerminalNode GREATER_THAN() { return getToken(MarkdownPreprocessorParser.GREATER_THAN, 0); }
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
		enterRule(_localctx, 48, RULE_openTag);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(LESS_THAN);
			setState(305);
			tag();
			setState(309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(306);
					attribute();
					}
					} 
				}
				setState(311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAB) | (1L << SPACE) | (1L << CARRIAGE_RETURN))) != 0)) {
				{
				{
				setState(312);
				anyWhitespace();
				}
				}
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(319);
			_la = _input.LA(1);
			if (_la==SLASH) {
				{
				setState(318);
				match(SLASH);
				}
			}

			setState(321);
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
		enterRule(_localctx, 50, RULE_closeTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(LESS_THAN);
			setState(324);
			match(SLASH);
			setState(325);
			tag();
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAB) | (1L << SPACE) | (1L << CARRIAGE_RETURN))) != 0)) {
				{
				{
				setState(326);
				anyWhitespace();
				}
				}
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(332);
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
		enterRule(_localctx, 52, RULE_identifier);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(335); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(334);
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
				setState(337); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(342);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(339);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PERIOD) | (1L << COLON) | (1L << UNDERBAR) | (1L << DASH) | (1L << DIGIT) | (1L << LETTER))) != 0)) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					} 
				}
				setState(344);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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
		enterRule(_localctx, 54, RULE_whitespace);
		try {
			setState(347);
			switch (_input.LA(1)) {
			case SPACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				space();
				}
				break;
			case TAB:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
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
		enterRule(_localctx, 56, RULE_space);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
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
		enterRule(_localctx, 58, RULE_tab);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
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
		enterRule(_localctx, 60, RULE_anyNonWhitespace);
		try {
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				nonWhitespace();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(354);
				match(HASH);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(355);
				match(ASTERISK);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(356);
				match(LESS_THAN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(357);
				match(GREATER_THAN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(358);
				match(SLASH);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(359);
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
		enterRule(_localctx, 62, RULE_nonWhitespace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
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
		enterRule(_localctx, 64, RULE_anyWhitespace);
		try {
			setState(366);
			switch (_input.LA(1)) {
			case TAB:
			case SPACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				whitespace();
				}
				break;
			case CARRIAGE_RETURN:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\25\u0173\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\5\2L\n\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3Y\n\3\3\4\3\4\5\4]\n\4\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\6\7k\n\7\r\7\16\7l\3\b\3\b\5\bq\n\b\6\b"+
		"s\n\b\r\b\16\bt\3\b\3\b\3\t\6\tz\n\t\r\t\16\t{\3\t\3\t\3\t\3\t\6\t\u0082"+
		"\n\t\r\t\16\t\u0083\5\t\u0086\n\t\3\t\3\t\7\t\u008a\n\t\f\t\16\t\u008d"+
		"\13\t\3\t\3\t\3\n\3\n\6\n\u0093\n\n\r\n\16\n\u0094\3\n\5\n\u0098\n\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\6\13\u00a0\n\13\r\13\16\13\u00a1\3\f\3\f"+
		"\5\f\u00a6\n\f\6\f\u00a8\n\f\r\f\16\f\u00a9\3\f\3\f\3\r\3\r\3\r\5\r\u00b1"+
		"\n\r\3\16\3\16\5\16\u00b5\n\16\6\16\u00b7\n\16\r\16\16\16\u00b8\3\16\3"+
		"\16\3\17\3\17\3\20\6\20\u00c0\n\20\r\20\16\20\u00c1\3\20\3\20\3\20\3\21"+
		"\3\21\3\22\7\22\u00ca\n\22\f\22\16\22\u00cd\13\22\3\22\3\22\3\23\7\23"+
		"\u00d2\n\23\f\23\16\23\u00d5\13\23\3\23\6\23\u00d8\n\23\r\23\16\23\u00d9"+
		"\3\24\6\24\u00dd\n\24\r\24\16\24\u00de\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\7\24\u00e8\n\24\f\24\16\24\u00eb\13\24\3\24\3\24\7\24\u00ef\n\24\f"+
		"\24\16\24\u00f2\13\24\3\24\3\24\7\24\u00f6\n\24\f\24\16\24\u00f9\13\24"+
		"\5\24\u00fb\n\24\3\25\3\25\3\25\7\25\u0100\n\25\f\25\16\25\u0103\13\25"+
		"\3\26\3\26\3\26\7\26\u0108\n\26\f\26\16\26\u010b\13\26\3\26\3\26\3\26"+
		"\3\26\7\26\u0111\n\26\f\26\16\26\u0114\13\26\3\26\5\26\u0117\n\26\3\27"+
		"\3\27\3\30\7\30\u011c\n\30\f\30\16\30\u011f\13\30\3\30\3\30\7\30\u0123"+
		"\n\30\f\30\16\30\u0126\13\30\3\30\3\30\7\30\u012a\n\30\f\30\16\30\u012d"+
		"\13\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\7\32\u0136\n\32\f\32\16\32\u0139"+
		"\13\32\3\32\7\32\u013c\n\32\f\32\16\32\u013f\13\32\3\32\5\32\u0142\n\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\7\33\u014a\n\33\f\33\16\33\u014d\13\33"+
		"\3\33\3\33\3\34\6\34\u0152\n\34\r\34\16\34\u0153\3\34\7\34\u0157\n\34"+
		"\f\34\16\34\u015a\13\34\3\35\3\35\5\35\u015e\n\35\3\36\3\36\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3 \3 \5 \u016b\n \3!\3!\3\"\3\"\5\"\u0171\n\"\3\"\4\u0109"+
		"\u0112\2#\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@B\2\5\4\2\b\b\f\f\3\2\7\f\6\2\3\4\7\r\17\17\25\25\u0194\2G\3\2\2"+
		"\2\4X\3\2\2\2\6\\\3\2\2\2\b^\3\2\2\2\n`\3\2\2\2\fj\3\2\2\2\16r\3\2\2\2"+
		"\20\u0085\3\2\2\2\22\u0097\3\2\2\2\24\u009f\3\2\2\2\26\u00a7\3\2\2\2\30"+
		"\u00b0\3\2\2\2\32\u00b6\3\2\2\2\34\u00bc\3\2\2\2\36\u00bf\3\2\2\2 \u00c6"+
		"\3\2\2\2\"\u00cb\3\2\2\2$\u00d7\3\2\2\2&\u00fa\3\2\2\2(\u0101\3\2\2\2"+
		"*\u0116\3\2\2\2,\u0118\3\2\2\2.\u011d\3\2\2\2\60\u0130\3\2\2\2\62\u0132"+
		"\3\2\2\2\64\u0145\3\2\2\2\66\u0151\3\2\2\28\u015d\3\2\2\2:\u015f\3\2\2"+
		"\2<\u0161\3\2\2\2>\u016a\3\2\2\2@\u016c\3\2\2\2B\u0170\3\2\2\2DF\5\4\3"+
		"\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HK\3\2\2\2IG\3\2\2\2JL\5\"\22"+
		"\2KJ\3\2\2\2KL\3\2\2\2LM\3\2\2\2MN\7\2\2\3N\3\3\2\2\2OP\5\36\20\2PQ\5"+
		"\6\4\2QY\3\2\2\2RY\5\f\7\2SY\5\24\13\2TU\5\"\22\2UV\5\6\4\2VY\3\2\2\2"+
		"WY\5$\23\2XO\3\2\2\2XR\3\2\2\2XS\3\2\2\2XT\3\2\2\2XW\3\2\2\2Y\5\3\2\2"+
		"\2Z]\5\b\5\2[]\5\n\6\2\\Z\3\2\2\2\\[\3\2\2\2]\7\3\2\2\2^_\7\24\2\2_\t"+
		"\3\2\2\2`a\5:\36\2ab\5:\36\2bc\7\24\2\2c\13\3\2\2\2de\5\16\b\2ef\5\6\4"+
		"\2fk\3\2\2\2gh\5\20\t\2hi\5\6\4\2ik\3\2\2\2jd\3\2\2\2jg\3\2\2\2kl\3\2"+
		"\2\2lj\3\2\2\2lm\3\2\2\2m\r\3\2\2\2np\5\22\n\2oq\58\35\2po\3\2\2\2pq\3"+
		"\2\2\2qs\3\2\2\2rn\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\5"+
		"&\24\2w\17\3\2\2\2xz\5<\37\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|"+
		"\u0086\3\2\2\2}~\5:\36\2~\177\5:\36\2\177\u0081\5:\36\2\u0080\u0082\5"+
		":\36\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085y\3\2\2\2\u0085}\3\2\2\2\u0086"+
		"\u008b\3\2\2\2\u0087\u008a\5<\37\2\u0088\u008a\5:\36\2\u0089\u0087\3\2"+
		"\2\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\5&"+
		"\24\2\u008f\21\3\2\2\2\u0090\u0098\7\5\2\2\u0091\u0093\7\13\2\2\u0092"+
		"\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2"+
		"\2\2\u0095\u0096\3\2\2\2\u0096\u0098\7\7\2\2\u0097\u0090\3\2\2\2\u0097"+
		"\u0092\3\2\2\2\u0098\23\3\2\2\2\u0099\u009a\5\26\f\2\u009a\u009b\5\6\4"+
		"\2\u009b\u00a0\3\2\2\2\u009c\u009d\5\20\t\2\u009d\u009e\5\6\4\2\u009e"+
		"\u00a0\3\2\2\2\u009f\u0099\3\2\2\2\u009f\u009c\3\2\2\2\u00a0\u00a1\3\2"+
		"\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\25\3\2\2\2\u00a3\u00a5"+
		"\5\34\17\2\u00a4\u00a6\58\35\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2"+
		"\u00a6\u00a8\3\2\2\2\u00a7\u00a3\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00a7"+
		"\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\5\30\r\2"+
		"\u00ac\27\3\2\2\2\u00ad\u00b1\5\36\20\2\u00ae\u00b1\5\32\16\2\u00af\u00b1"+
		"\5\"\22\2\u00b0\u00ad\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2"+
		"\u00b1\31\3\2\2\2\u00b2\u00b4\5\22\n\2\u00b3\u00b5\58\35\2\u00b4\u00b3"+
		"\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b2\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\3\2"+
		"\2\2\u00ba\u00bb\5&\24\2\u00bb\33\3\2\2\2\u00bc\u00bd\7\22\2\2\u00bd\35"+
		"\3\2\2\2\u00be\u00c0\5 \21\2\u00bf\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\58"+
		"\35\2\u00c4\u00c5\5&\24\2\u00c5\37\3\2\2\2\u00c6\u00c7\7\6\2\2\u00c7!"+
		"\3\2\2\2\u00c8\u00ca\58\35\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb\3\2"+
		"\2\2\u00ce\u00cf\5&\24\2\u00cf#\3\2\2\2\u00d0\u00d2\58\35\2\u00d1\u00d0"+
		"\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\u00d6\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d8\5\b\5\2\u00d7\u00d3\3\2"+
		"\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"%\3\2\2\2\u00db\u00dd\5@!\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e9\3\2\2\2\u00e0\u00e8\58"+
		"\35\2\u00e1\u00e8\5@!\2\u00e2\u00e8\7\6\2\2\u00e3\u00e8\7\5\2\2\u00e4"+
		"\u00e8\7\21\2\2\u00e5\u00e8\7\23\2\2\u00e6\u00e8\7\7\2\2\u00e7\u00e0\3"+
		"\2\2\2\u00e7\u00e1\3\2\2\2\u00e7\u00e2\3\2\2\2\u00e7\u00e3\3\2\2\2\u00e7"+
		"\u00e4\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00eb\3\2"+
		"\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00fb\3\2\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00ec\u00f0\5\62\32\2\u00ed\u00ef\5\"\22\2\u00ee\u00ed"+
		"\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00fb\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f7\5\64\33\2\u00f4\u00f6\5"+
		"\"\22\2\u00f5\u00f4\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00dc\3\2"+
		"\2\2\u00fa\u00ec\3\2\2\2\u00fa\u00f3\3\2\2\2\u00fb\'\3\2\2\2\u00fc\u0100"+
		"\58\35\2\u00fd\u0100\5> \2\u00fe\u0100\7\24\2\2\u00ff\u00fc\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2"+
		"\2\2\u0101\u0102\3\2\2\2\u0102)\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0109"+
		"\7\3\2\2\u0105\u0108\58\35\2\u0106\u0108\5> \2\u0107\u0105\3\2\2\2\u0107"+
		"\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u010a\3\2\2\2\u0109\u0107\3\2"+
		"\2\2\u010a\u010c\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u0117\7\3\2\2\u010d"+
		"\u0112\7\4\2\2\u010e\u0111\58\35\2\u010f\u0111\5> \2\u0110\u010e\3\2\2"+
		"\2\u0110\u010f\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0113\3\2\2\2\u0112\u0110"+
		"\3\2\2\2\u0113\u0115\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0117\7\4\2\2\u0116"+
		"\u0104\3\2\2\2\u0116\u010d\3\2\2\2\u0117+\3\2\2\2\u0118\u0119\5\66\34"+
		"\2\u0119-\3\2\2\2\u011a\u011c\5B\"\2\u011b\u011a\3\2\2\2\u011c\u011f\3"+
		"\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120\3\2\2\2\u011f"+
		"\u011d\3\2\2\2\u0120\u0124\5,\27\2\u0121\u0123\5B\"\2\u0122\u0121\3\2"+
		"\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125"+
		"\u0127\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u012b\7\17\2\2\u0128\u012a\5"+
		"B\"\2\u0129\u0128\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\u012e\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u012f\5*"+
		"\26\2\u012f/\3\2\2\2\u0130\u0131\5\66\34\2\u0131\61\3\2\2\2\u0132\u0133"+
		"\7\21\2\2\u0133\u0137\5\60\31\2\u0134\u0136\5.\30\2\u0135\u0134\3\2\2"+
		"\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013d"+
		"\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013c\5B\"\2\u013b\u013a\3\2\2\2\u013c"+
		"\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0141\3\2"+
		"\2\2\u013f\u013d\3\2\2\2\u0140\u0142\7\23\2\2\u0141\u0140\3\2\2\2\u0141"+
		"\u0142\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\7\22\2\2\u0144\63\3\2\2"+
		"\2\u0145\u0146\7\21\2\2\u0146\u0147\7\23\2\2\u0147\u014b\5\60\31\2\u0148"+
		"\u014a\5B\"\2\u0149\u0148\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2"+
		"\2\2\u014b\u014c\3\2\2\2\u014c\u014e\3\2\2\2\u014d\u014b\3\2\2\2\u014e"+
		"\u014f\7\22\2\2\u014f\65\3\2\2\2\u0150\u0152\t\2\2\2\u0151\u0150\3\2\2"+
		"\2\u0152\u0153\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0158"+
		"\3\2\2\2\u0155\u0157\t\3\2\2\u0156\u0155\3\2\2\2\u0157\u015a\3\2\2\2\u0158"+
		"\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\67\3\2\2\2\u015a\u0158\3\2\2"+
		"\2\u015b\u015e\5:\36\2\u015c\u015e\5<\37\2\u015d\u015b\3\2\2\2\u015d\u015c"+
		"\3\2\2\2\u015e9\3\2\2\2\u015f\u0160\7\20\2\2\u0160;\3\2\2\2\u0161\u0162"+
		"\7\16\2\2\u0162=\3\2\2\2\u0163\u016b\5@!\2\u0164\u016b\7\6\2\2\u0165\u016b"+
		"\7\5\2\2\u0166\u016b\7\21\2\2\u0167\u016b\7\22\2\2\u0168\u016b\7\23\2"+
		"\2\u0169\u016b\7\7\2\2\u016a\u0163\3\2\2\2\u016a\u0164\3\2\2\2\u016a\u0165"+
		"\3\2\2\2\u016a\u0166\3\2\2\2\u016a\u0167\3\2\2\2\u016a\u0168\3\2\2\2\u016a"+
		"\u0169\3\2\2\2\u016b?\3\2\2\2\u016c\u016d\t\4\2\2\u016dA\3\2\2\2\u016e"+
		"\u0171\58\35\2\u016f\u0171\7\24\2\2\u0170\u016e\3\2\2\2\u0170\u016f\3"+
		"\2\2\2\u0171C\3\2\2\2\65GKX\\jlpt{\u0083\u0085\u0089\u008b\u0094\u0097"+
		"\u009f\u00a1\u00a5\u00a9\u00b0\u00b4\u00b8\u00c1\u00cb\u00d3\u00d9\u00de"+
		"\u00e7\u00e9\u00f0\u00f7\u00fa\u00ff\u0101\u0107\u0109\u0110\u0112\u0116"+
		"\u011d\u0124\u012b\u0137\u013d\u0141\u014b\u0153\u0158\u015d\u016a\u0170";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}