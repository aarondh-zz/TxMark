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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, DIGITS=7, PUNCTUATION=8, 
		TAB=9, SPACE=10, CARRIAGE_RETURN=11, NON_WHITESPACE=12;
	public static final int
		RULE_document = 0, RULE_content = 1, RULE_line = 2, RULE_list = 3, RULE_listItem = 4, 
		RULE_indentedText = 5, RULE_listItemIndicator = 6, RULE_blockquote = 7, 
		RULE_blockquoteItem = 8, RULE_blockQuoteElement = 9, RULE_blockQuoteListItem = 10, 
		RULE_blockquoteIndicator = 11, RULE_heading = 12, RULE_headingIndicator = 13, 
		RULE_textLine = 14, RULE_paragraph_end = 15, RULE_text = 16, RULE_attributeContent = 17, 
		RULE_openTag = 18, RULE_closeTag = 19, RULE_nonWhitespace = 20, RULE_whitespace = 21, 
		RULE_space = 22, RULE_tab = 23, RULE_carriageReturn = 24, RULE_softCarriageReturn = 25, 
		RULE_hardCarriageReturn = 26;
	public static final String[] ruleNames = {
		"document", "content", "line", "list", "listItem", "indentedText", "listItemIndicator", 
		"blockquote", "blockquoteItem", "blockQuoteElement", "blockQuoteListItem", 
		"blockquoteIndicator", "heading", "headingIndicator", "textLine", "paragraph_end", 
		"text", "attributeContent", "openTag", "closeTag", "nonWhitespace", "whitespace", 
		"space", "tab", "carriageReturn", "softCarriageReturn", "hardCarriageReturn"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'*'", "'.'", "'>'", "'#'", "'<'", "'/'", null, null, "'\t'", "' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "DIGITS", "PUNCTUATION", "TAB", 
		"SPACE", "CARRIAGE_RETURN", "NON_WHITESPACE"
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
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MarkdownPreprocessorParser.EOF, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			content();
			setState(55);
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

	public static class ContentContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownPreprocessorListener ) ((MarkdownPreprocessorListener)listener).exitContent(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << DIGITS) | (1L << PUNCTUATION) | (1L << TAB) | (1L << SPACE) | (1L << CARRIAGE_RETURN) | (1L << NON_WHITESPACE))) != 0)) {
				{
				{
				setState(57);
				line();
				}
				}
				setState(62);
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
		enterRule(_localctx, 4, RULE_line);
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				heading();
				setState(64);
				carriageReturn();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				list();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				blockquote();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				textLine();
				setState(69);
				carriageReturn();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(71);
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
		enterRule(_localctx, 6, RULE_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(80); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(80);
					switch (_input.LA(1)) {
					case T__0:
					case DIGITS:
						{
						setState(74);
						listItem();
						setState(75);
						carriageReturn();
						}
						break;
					case TAB:
					case SPACE:
						{
						setState(77);
						indentedText();
						setState(78);
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
				setState(82); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
		enterRule(_localctx, 8, RULE_listItem);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(88); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(84);
					listItemIndicator();
					setState(86);
					_la = _input.LA(1);
					if (_la==TAB || _la==SPACE) {
						{
						setState(85);
						whitespace();
						}
					}

					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(90); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(92);
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
		enterRule(_localctx, 10, RULE_indentedText);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			switch (_input.LA(1)) {
			case TAB:
				{
				setState(95); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(94);
						tab();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(97); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case SPACE:
				{
				setState(99);
				space();
				setState(100);
				space();
				setState(101);
				space();
				setState(103); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(102);
						space();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(105); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAB || _la==SPACE) {
				{
				setState(111);
				switch (_input.LA(1)) {
				case TAB:
					{
					setState(109);
					tab();
					}
					break;
				case SPACE:
					{
					setState(110);
					space();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ListItemIndicatorContext extends ParserRuleContext {
		public TerminalNode DIGITS() { return getToken(MarkdownPreprocessorParser.DIGITS, 0); }
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
		enterRule(_localctx, 12, RULE_listItemIndicator);
		try {
			setState(121);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				match(T__0);
				}
				break;
			case DIGITS:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(DIGITS);
				setState(120);
				match(T__1);
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
		enterRule(_localctx, 14, RULE_blockquote);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(129); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(129);
					switch (_input.LA(1)) {
					case T__2:
						{
						setState(123);
						blockquoteItem();
						setState(124);
						carriageReturn();
						}
						break;
					case TAB:
					case SPACE:
						{
						setState(126);
						indentedText();
						setState(127);
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
				setState(131); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		enterRule(_localctx, 16, RULE_blockquoteItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(133);
				blockquoteIndicator();
				setState(135);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(134);
					whitespace();
					}
					break;
				}
				}
				}
				setState(139); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 );
			setState(141);
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
		enterRule(_localctx, 18, RULE_blockQuoteElement);
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				heading();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				blockQuoteListItem();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
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
		enterRule(_localctx, 20, RULE_blockQuoteListItem);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(152); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(148);
					listItemIndicator();
					setState(150);
					_la = _input.LA(1);
					if (_la==TAB || _la==SPACE) {
						{
						setState(149);
						whitespace();
						}
					}

					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(154); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(156);
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
		enterRule(_localctx, 22, RULE_blockquoteIndicator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__2);
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
		enterRule(_localctx, 24, RULE_heading);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(160);
				headingIndicator();
				}
				}
				setState(163); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
			setState(165);
			whitespace();
			setState(166);
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
		enterRule(_localctx, 26, RULE_headingIndicator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(T__3);
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
		enterRule(_localctx, 28, RULE_textLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAB || _la==SPACE) {
				{
				{
				setState(170);
				whitespace();
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
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
		public List<CarriageReturnContext> carriageReturn() {
			return getRuleContexts(CarriageReturnContext.class);
		}
		public CarriageReturnContext carriageReturn(int i) {
			return getRuleContext(CarriageReturnContext.class,i);
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
		enterRule(_localctx, 30, RULE_paragraph_end);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(185); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(181);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(178);
							whitespace();
							}
							} 
						}
						setState(183);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
					}
					setState(184);
					carriageReturn();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(187); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		enterRule(_localctx, 32, RULE_text);
		try {
			int _alt;
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				nonWhitespace();
				setState(198);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						setState(196);
						switch (_input.LA(1)) {
						case TAB:
						case SPACE:
							{
							setState(190);
							whitespace();
							}
							break;
						case DIGITS:
						case PUNCTUATION:
						case NON_WHITESPACE:
							{
							setState(191);
							nonWhitespace();
							}
							break;
						case T__3:
							{
							setState(192);
							match(T__3);
							}
							break;
						case T__0:
							{
							setState(193);
							match(T__0);
							}
							break;
						case T__2:
							{
							setState(194);
							match(T__2);
							}
							break;
						case T__1:
							{
							setState(195);
							match(T__1);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(200);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				openTag();
				setState(205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(202);
						textLine();
						}
						} 
					}
					setState(207);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				closeTag();
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(209);
						textLine();
						}
						} 
					}
					setState(214);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		public List<NonWhitespaceContext> nonWhitespace() {
			return getRuleContexts(NonWhitespaceContext.class);
		}
		public NonWhitespaceContext nonWhitespace(int i) {
			return getRuleContext(NonWhitespaceContext.class,i);
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
		enterRule(_localctx, 34, RULE_attributeContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << DIGITS) | (1L << PUNCTUATION) | (1L << TAB) | (1L << SPACE) | (1L << CARRIAGE_RETURN) | (1L << NON_WHITESPACE))) != 0)) {
				{
				setState(223);
				switch (_input.LA(1)) {
				case TAB:
				case SPACE:
					{
					setState(217);
					whitespace();
					}
					break;
				case DIGITS:
				case PUNCTUATION:
				case NON_WHITESPACE:
					{
					setState(218);
					nonWhitespace();
					}
					break;
				case T__3:
					{
					setState(219);
					match(T__3);
					}
					break;
				case T__0:
					{
					setState(220);
					match(T__0);
					}
					break;
				case T__1:
					{
					setState(221);
					match(T__1);
					}
					break;
				case CARRIAGE_RETURN:
					{
					setState(222);
					match(CARRIAGE_RETURN);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(227);
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

	public static class OpenTagContext extends ParserRuleContext {
		public AttributeContentContext attributeContent() {
			return getRuleContext(AttributeContentContext.class,0);
		}
		public List<NonWhitespaceContext> nonWhitespace() {
			return getRuleContexts(NonWhitespaceContext.class);
		}
		public NonWhitespaceContext nonWhitespace(int i) {
			return getRuleContext(NonWhitespaceContext.class,i);
		}
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
		enterRule(_localctx, 36, RULE_openTag);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(T__4);
			setState(230); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(229);
					nonWhitespace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(232); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(234);
			attributeContent();
			setState(236);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(235);
				match(T__5);
				}
			}

			setState(238);
			match(T__2);
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
		enterRule(_localctx, 38, RULE_closeTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(T__4);
			setState(241);
			match(T__5);
			setState(243); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(242);
				nonWhitespace();
				}
				}
				setState(245); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGITS) | (1L << PUNCTUATION) | (1L << NON_WHITESPACE))) != 0) );
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAB || _la==SPACE) {
				{
				{
				setState(247);
				whitespace();
				}
				}
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(253);
			match(T__2);
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
		public TerminalNode DIGITS() { return getToken(MarkdownPreprocessorParser.DIGITS, 0); }
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
		enterRule(_localctx, 40, RULE_nonWhitespace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGITS) | (1L << PUNCTUATION) | (1L << NON_WHITESPACE))) != 0)) ) {
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
		enterRule(_localctx, 42, RULE_whitespace);
		try {
			setState(259);
			switch (_input.LA(1)) {
			case SPACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				space();
				}
				break;
			case TAB:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
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
		enterRule(_localctx, 44, RULE_space);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
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
		enterRule(_localctx, 46, RULE_tab);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
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
		enterRule(_localctx, 48, RULE_carriageReturn);
		try {
			setState(267);
			switch (_input.LA(1)) {
			case CARRIAGE_RETURN:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				softCarriageReturn();
				}
				break;
			case SPACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
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
		enterRule(_localctx, 50, RULE_softCarriageReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
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
		enterRule(_localctx, 52, RULE_hardCarriageReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			space();
			setState(273); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(272);
				space();
				}
				}
				setState(275); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(277);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\16\u011a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\3\7\3=\n\3\f\3\16\3@\13\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4K\n\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\6\5S\n\5\r\5\16\5T\3\6\3\6\5\6Y\n\6\6\6[\n\6\r\6\16\6\\\3\6\3\6\3\7\6"+
		"\7b\n\7\r\7\16\7c\3\7\3\7\3\7\3\7\6\7j\n\7\r\7\16\7k\5\7n\n\7\3\7\3\7"+
		"\7\7r\n\7\f\7\16\7u\13\7\3\7\3\7\3\b\3\b\3\b\5\b|\n\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\6\t\u0084\n\t\r\t\16\t\u0085\3\n\3\n\5\n\u008a\n\n\6\n\u008c"+
		"\n\n\r\n\16\n\u008d\3\n\3\n\3\13\3\13\3\13\5\13\u0095\n\13\3\f\3\f\5\f"+
		"\u0099\n\f\6\f\u009b\n\f\r\f\16\f\u009c\3\f\3\f\3\r\3\r\3\16\6\16\u00a4"+
		"\n\16\r\16\16\16\u00a5\3\16\3\16\3\16\3\17\3\17\3\20\7\20\u00ae\n\20\f"+
		"\20\16\20\u00b1\13\20\3\20\3\20\3\21\7\21\u00b6\n\21\f\21\16\21\u00b9"+
		"\13\21\3\21\6\21\u00bc\n\21\r\21\16\21\u00bd\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\7\22\u00c7\n\22\f\22\16\22\u00ca\13\22\3\22\3\22\7\22\u00ce"+
		"\n\22\f\22\16\22\u00d1\13\22\3\22\3\22\7\22\u00d5\n\22\f\22\16\22\u00d8"+
		"\13\22\5\22\u00da\n\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00e2\n\23\f"+
		"\23\16\23\u00e5\13\23\3\24\3\24\6\24\u00e9\n\24\r\24\16\24\u00ea\3\24"+
		"\3\24\5\24\u00ef\n\24\3\24\3\24\3\25\3\25\3\25\6\25\u00f6\n\25\r\25\16"+
		"\25\u00f7\3\25\7\25\u00fb\n\25\f\25\16\25\u00fe\13\25\3\25\3\25\3\26\3"+
		"\26\3\27\3\27\5\27\u0106\n\27\3\30\3\30\3\31\3\31\3\32\3\32\5\32\u010e"+
		"\n\32\3\33\3\33\3\34\3\34\6\34\u0114\n\34\r\34\16\34\u0115\3\34\3\34\3"+
		"\34\3\u00c8\2\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\66\2\3\4\2\t\n\16\16\u0130\28\3\2\2\2\4>\3\2\2\2\6J\3\2\2\2\bR\3\2"+
		"\2\2\nZ\3\2\2\2\fm\3\2\2\2\16{\3\2\2\2\20\u0083\3\2\2\2\22\u008b\3\2\2"+
		"\2\24\u0094\3\2\2\2\26\u009a\3\2\2\2\30\u00a0\3\2\2\2\32\u00a3\3\2\2\2"+
		"\34\u00aa\3\2\2\2\36\u00af\3\2\2\2 \u00bb\3\2\2\2\"\u00d9\3\2\2\2$\u00e3"+
		"\3\2\2\2&\u00e6\3\2\2\2(\u00f2\3\2\2\2*\u0101\3\2\2\2,\u0105\3\2\2\2."+
		"\u0107\3\2\2\2\60\u0109\3\2\2\2\62\u010d\3\2\2\2\64\u010f\3\2\2\2\66\u0111"+
		"\3\2\2\289\5\4\3\29:\7\2\2\3:\3\3\2\2\2;=\5\6\4\2<;\3\2\2\2=@\3\2\2\2"+
		"><\3\2\2\2>?\3\2\2\2?\5\3\2\2\2@>\3\2\2\2AB\5\32\16\2BC\5\62\32\2CK\3"+
		"\2\2\2DK\5\b\5\2EK\5\20\t\2FG\5\36\20\2GH\5\62\32\2HK\3\2\2\2IK\5 \21"+
		"\2JA\3\2\2\2JD\3\2\2\2JE\3\2\2\2JF\3\2\2\2JI\3\2\2\2K\7\3\2\2\2LM\5\n"+
		"\6\2MN\5\62\32\2NS\3\2\2\2OP\5\f\7\2PQ\5\62\32\2QS\3\2\2\2RL\3\2\2\2R"+
		"O\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\t\3\2\2\2VX\5\16\b\2WY\5,\27"+
		"\2XW\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZV\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3"+
		"\2\2\2]^\3\2\2\2^_\5\"\22\2_\13\3\2\2\2`b\5\60\31\2a`\3\2\2\2bc\3\2\2"+
		"\2ca\3\2\2\2cd\3\2\2\2dn\3\2\2\2ef\5.\30\2fg\5.\30\2gi\5.\30\2hj\5.\30"+
		"\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2ma\3\2\2\2me\3\2\2"+
		"\2ns\3\2\2\2or\5\60\31\2pr\5.\30\2qo\3\2\2\2qp\3\2\2\2ru\3\2\2\2sq\3\2"+
		"\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\5\"\22\2w\r\3\2\2\2x|\7\3\2\2yz\7"+
		"\t\2\2z|\7\4\2\2{x\3\2\2\2{y\3\2\2\2|\17\3\2\2\2}~\5\22\n\2~\177\5\62"+
		"\32\2\177\u0084\3\2\2\2\u0080\u0081\5\f\7\2\u0081\u0082\5\62\32\2\u0082"+
		"\u0084\3\2\2\2\u0083}\3\2\2\2\u0083\u0080\3\2\2\2\u0084\u0085\3\2\2\2"+
		"\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\21\3\2\2\2\u0087\u0089"+
		"\5\30\r\2\u0088\u008a\5,\27\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2"+
		"\u008a\u008c\3\2\2\2\u008b\u0087\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b"+
		"\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\5\24\13\2"+
		"\u0090\23\3\2\2\2\u0091\u0095\5\32\16\2\u0092\u0095\5\26\f\2\u0093\u0095"+
		"\5\36\20\2\u0094\u0091\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2"+
		"\u0095\25\3\2\2\2\u0096\u0098\5\16\b\2\u0097\u0099\5,\27\2\u0098\u0097"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0096\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2"+
		"\2\2\u009e\u009f\5\"\22\2\u009f\27\3\2\2\2\u00a0\u00a1\7\5\2\2\u00a1\31"+
		"\3\2\2\2\u00a2\u00a4\5\34\17\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2"+
		"\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8"+
		"\5,\27\2\u00a8\u00a9\5\"\22\2\u00a9\33\3\2\2\2\u00aa\u00ab\7\6\2\2\u00ab"+
		"\35\3\2\2\2\u00ac\u00ae\5,\27\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2"+
		"\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af"+
		"\3\2\2\2\u00b2\u00b3\5\"\22\2\u00b3\37\3\2\2\2\u00b4\u00b6\5,\27\2\u00b5"+
		"\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2"+
		"\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bc\5\62\32\2\u00bb"+
		"\u00b7\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be!\3\2\2\2\u00bf\u00c8\5*\26\2\u00c0\u00c7\5,\27\2\u00c1\u00c7"+
		"\5*\26\2\u00c2\u00c7\7\6\2\2\u00c3\u00c7\7\3\2\2\u00c4\u00c7\7\5\2\2\u00c5"+
		"\u00c7\7\4\2\2\u00c6\u00c0\3\2\2\2\u00c6\u00c1\3\2\2\2\u00c6\u00c2\3\2"+
		"\2\2\u00c6\u00c3\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7"+
		"\u00ca\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00da\3\2"+
		"\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cf\5&\24\2\u00cc\u00ce\5\36\20\2\u00cd"+
		"\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\u00da\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d6\5(\25\2\u00d3"+
		"\u00d5\5\36\20\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3"+
		"\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9"+
		"\u00bf\3\2\2\2\u00d9\u00cb\3\2\2\2\u00d9\u00d2\3\2\2\2\u00da#\3\2\2\2"+
		"\u00db\u00e2\5,\27\2\u00dc\u00e2\5*\26\2\u00dd\u00e2\7\6\2\2\u00de\u00e2"+
		"\7\3\2\2\u00df\u00e2\7\4\2\2\u00e0\u00e2\7\r\2\2\u00e1\u00db\3\2\2\2\u00e1"+
		"\u00dc\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e1\u00de\3\2\2\2\u00e1\u00df\3\2"+
		"\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4%\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e8\7\7\2\2"+
		"\u00e7\u00e9\5*\26\2\u00e8\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00e8"+
		"\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\5$\23\2\u00ed"+
		"\u00ef\7\b\2\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0\u00f1\7\5\2\2\u00f1\'\3\2\2\2\u00f2\u00f3\7\7\2\2\u00f3\u00f5"+
		"\7\b\2\2\u00f4\u00f6\5*\26\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fc\3\2\2\2\u00f9\u00fb\5,"+
		"\27\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0100\7\5"+
		"\2\2\u0100)\3\2\2\2\u0101\u0102\t\2\2\2\u0102+\3\2\2\2\u0103\u0106\5."+
		"\30\2\u0104\u0106\5\60\31\2\u0105\u0103\3\2\2\2\u0105\u0104\3\2\2\2\u0106"+
		"-\3\2\2\2\u0107\u0108\7\f\2\2\u0108/\3\2\2\2\u0109\u010a\7\13\2\2\u010a"+
		"\61\3\2\2\2\u010b\u010e\5\64\33\2\u010c\u010e\5\66\34\2\u010d\u010b\3"+
		"\2\2\2\u010d\u010c\3\2\2\2\u010e\63\3\2\2\2\u010f\u0110\7\r\2\2\u0110"+
		"\65\3\2\2\2\u0111\u0113\5.\30\2\u0112\u0114\5.\30\2\u0113\u0112\3\2\2"+
		"\2\u0114\u0115\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117"+
		"\3\2\2\2\u0117\u0118\7\r\2\2\u0118\67\3\2\2\2\'>JRTX\\ckmqs{\u0083\u0085"+
		"\u0089\u008d\u0094\u0098\u009c\u00a5\u00af\u00b7\u00bd\u00c6\u00c8\u00cf"+
		"\u00d6\u00d9\u00e1\u00e3\u00ea\u00ee\u00f7\u00fc\u0105\u010d\u0115";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}