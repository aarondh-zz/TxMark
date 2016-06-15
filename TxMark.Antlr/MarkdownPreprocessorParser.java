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
		RULE_tag = 18, RULE_openTag = 19, RULE_closeTag = 20, RULE_nonWhitespace = 21, 
		RULE_whitespace = 22, RULE_space = 23, RULE_tab = 24, RULE_carriageReturn = 25, 
		RULE_softCarriageReturn = 26, RULE_hardCarriageReturn = 27;
	public static final String[] ruleNames = {
		"document", "content", "line", "list", "listItem", "indentedText", "listItemIndicator", 
		"blockquote", "blockquoteItem", "blockQuoteElement", "blockQuoteListItem", 
		"blockquoteIndicator", "heading", "headingIndicator", "textLine", "paragraph_end", 
		"text", "attributeContent", "tag", "openTag", "closeTag", "nonWhitespace", 
		"whitespace", "space", "tab", "carriageReturn", "softCarriageReturn", 
		"hardCarriageReturn"
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
			setState(56);
			content();
			setState(57);
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
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << DIGITS) | (1L << PUNCTUATION) | (1L << TAB) | (1L << SPACE) | (1L << CARRIAGE_RETURN) | (1L << NON_WHITESPACE))) != 0)) {
				{
				{
				setState(59);
				line();
				}
				}
				setState(64);
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
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				heading();
				setState(66);
				carriageReturn();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				list();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				blockquote();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(70);
				textLine();
				setState(71);
				carriageReturn();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(73);
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
			setState(82); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(82);
					switch (_input.LA(1)) {
					case T__0:
					case DIGITS:
						{
						setState(76);
						listItem();
						setState(77);
						carriageReturn();
						}
						break;
					case TAB:
					case SPACE:
						{
						setState(79);
						indentedText();
						setState(80);
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
				setState(84); 
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
			setState(90); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(86);
					listItemIndicator();
					setState(88);
					_la = _input.LA(1);
					if (_la==TAB || _la==SPACE) {
						{
						setState(87);
						whitespace();
						}
					}

					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(92); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(94);
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
			setState(109);
			switch (_input.LA(1)) {
			case TAB:
				{
				setState(97); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(96);
						tab();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(99); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case SPACE:
				{
				setState(101);
				space();
				setState(102);
				space();
				setState(103);
				space();
				setState(105); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(104);
						space();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(107); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAB || _la==SPACE) {
				{
				setState(113);
				switch (_input.LA(1)) {
				case TAB:
					{
					setState(111);
					tab();
					}
					break;
				case SPACE:
					{
					setState(112);
					space();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
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
			setState(123);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(T__0);
				}
				break;
			case DIGITS:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				match(DIGITS);
				setState(122);
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
			setState(131); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(131);
					switch (_input.LA(1)) {
					case T__2:
						{
						setState(125);
						blockquoteItem();
						setState(126);
						carriageReturn();
						}
						break;
					case TAB:
					case SPACE:
						{
						setState(128);
						indentedText();
						setState(129);
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
				setState(133); 
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
			setState(139); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(135);
				blockquoteIndicator();
				setState(137);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(136);
					whitespace();
					}
					break;
				}
				}
				}
				setState(141); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 );
			setState(143);
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
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				heading();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				blockQuoteListItem();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
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
			setState(154); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(150);
					listItemIndicator();
					setState(152);
					_la = _input.LA(1);
					if (_la==TAB || _la==SPACE) {
						{
						setState(151);
						whitespace();
						}
					}

					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(156); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(158);
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
			setState(160);
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
			setState(163); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(162);
				headingIndicator();
				}
				}
				setState(165); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
			setState(167);
			whitespace();
			setState(168);
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
			setState(170);
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
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAB || _la==SPACE) {
				{
				{
				setState(172);
				whitespace();
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
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
			setState(187); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(183);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(180);
							whitespace();
							}
							} 
						}
						setState(185);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
					}
					setState(186);
					carriageReturn();
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
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				nonWhitespace();
				setState(200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						setState(198);
						switch (_input.LA(1)) {
						case TAB:
						case SPACE:
							{
							setState(192);
							whitespace();
							}
							break;
						case DIGITS:
						case PUNCTUATION:
						case NON_WHITESPACE:
							{
							setState(193);
							nonWhitespace();
							}
							break;
						case T__3:
							{
							setState(194);
							match(T__3);
							}
							break;
						case T__0:
							{
							setState(195);
							match(T__0);
							}
							break;
						case T__2:
							{
							setState(196);
							match(T__2);
							}
							break;
						case T__1:
							{
							setState(197);
							match(T__1);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(202);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				openTag();
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(204);
						textLine();
						}
						} 
					}
					setState(209);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(210);
				closeTag();
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(211);
						textLine();
						}
						} 
					}
					setState(216);
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
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << DIGITS) | (1L << PUNCTUATION) | (1L << TAB) | (1L << SPACE) | (1L << CARRIAGE_RETURN) | (1L << NON_WHITESPACE))) != 0)) {
				{
				setState(225);
				switch (_input.LA(1)) {
				case TAB:
				case SPACE:
					{
					setState(219);
					whitespace();
					}
					break;
				case DIGITS:
				case PUNCTUATION:
				case NON_WHITESPACE:
					{
					setState(220);
					nonWhitespace();
					}
					break;
				case T__3:
					{
					setState(221);
					match(T__3);
					}
					break;
				case T__0:
					{
					setState(222);
					match(T__0);
					}
					break;
				case T__1:
					{
					setState(223);
					match(T__1);
					}
					break;
				case CARRIAGE_RETURN:
					{
					setState(224);
					match(CARRIAGE_RETURN);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(229);
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

	public static class TagContext extends ParserRuleContext {
		public List<NonWhitespaceContext> nonWhitespace() {
			return getRuleContexts(NonWhitespaceContext.class);
		}
		public NonWhitespaceContext nonWhitespace(int i) {
			return getRuleContext(NonWhitespaceContext.class,i);
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
		enterRule(_localctx, 36, RULE_tag);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(231); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(230);
					nonWhitespace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(233); 
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

	public static class OpenTagContext extends ParserRuleContext {
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
		}
		public AttributeContentContext attributeContent() {
			return getRuleContext(AttributeContentContext.class,0);
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
		enterRule(_localctx, 38, RULE_openTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(T__4);
			setState(236);
			tag();
			setState(237);
			attributeContent();
			setState(239);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(238);
				match(T__5);
				}
			}

			setState(241);
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
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
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
		enterRule(_localctx, 40, RULE_closeTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(T__4);
			setState(244);
			match(T__5);
			setState(245);
			tag();
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAB || _la==SPACE) {
				{
				{
				setState(246);
				whitespace();
				}
				}
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(252);
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
		enterRule(_localctx, 42, RULE_nonWhitespace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
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
		enterRule(_localctx, 44, RULE_whitespace);
		try {
			setState(258);
			switch (_input.LA(1)) {
			case SPACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				space();
				}
				break;
			case TAB:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
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
		enterRule(_localctx, 46, RULE_space);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
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
		enterRule(_localctx, 48, RULE_tab);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
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
		enterRule(_localctx, 50, RULE_carriageReturn);
		try {
			setState(266);
			switch (_input.LA(1)) {
			case CARRIAGE_RETURN:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				softCarriageReturn();
				}
				break;
			case SPACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
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
		enterRule(_localctx, 52, RULE_softCarriageReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
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
		enterRule(_localctx, 54, RULE_hardCarriageReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			space();
			setState(272); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(271);
				space();
				}
				}
				setState(274); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(276);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\16\u0119\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\3\7\3?\n\3\f\3"+
		"\16\3B\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4M\n\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\6\5U\n\5\r\5\16\5V\3\6\3\6\5\6[\n\6\6\6]\n\6\r\6\16\6^\3\6"+
		"\3\6\3\7\6\7d\n\7\r\7\16\7e\3\7\3\7\3\7\3\7\6\7l\n\7\r\7\16\7m\5\7p\n"+
		"\7\3\7\3\7\7\7t\n\7\f\7\16\7w\13\7\3\7\3\7\3\b\3\b\3\b\5\b~\n\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\6\t\u0086\n\t\r\t\16\t\u0087\3\n\3\n\5\n\u008c\n\n"+
		"\6\n\u008e\n\n\r\n\16\n\u008f\3\n\3\n\3\13\3\13\3\13\5\13\u0097\n\13\3"+
		"\f\3\f\5\f\u009b\n\f\6\f\u009d\n\f\r\f\16\f\u009e\3\f\3\f\3\r\3\r\3\16"+
		"\6\16\u00a6\n\16\r\16\16\16\u00a7\3\16\3\16\3\16\3\17\3\17\3\20\7\20\u00b0"+
		"\n\20\f\20\16\20\u00b3\13\20\3\20\3\20\3\21\7\21\u00b8\n\21\f\21\16\21"+
		"\u00bb\13\21\3\21\6\21\u00be\n\21\r\21\16\21\u00bf\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\7\22\u00c9\n\22\f\22\16\22\u00cc\13\22\3\22\3\22\7\22"+
		"\u00d0\n\22\f\22\16\22\u00d3\13\22\3\22\3\22\7\22\u00d7\n\22\f\22\16\22"+
		"\u00da\13\22\5\22\u00dc\n\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00e4"+
		"\n\23\f\23\16\23\u00e7\13\23\3\24\6\24\u00ea\n\24\r\24\16\24\u00eb\3\25"+
		"\3\25\3\25\3\25\5\25\u00f2\n\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u00fa"+
		"\n\26\f\26\16\26\u00fd\13\26\3\26\3\26\3\27\3\27\3\30\3\30\5\30\u0105"+
		"\n\30\3\31\3\31\3\32\3\32\3\33\3\33\5\33\u010d\n\33\3\34\3\34\3\35\3\35"+
		"\6\35\u0113\n\35\r\35\16\35\u0114\3\35\3\35\3\35\3\u00ca\2\36\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668\2\3\4\2\t\n\16\16"+
		"\u012d\2:\3\2\2\2\4@\3\2\2\2\6L\3\2\2\2\bT\3\2\2\2\n\\\3\2\2\2\fo\3\2"+
		"\2\2\16}\3\2\2\2\20\u0085\3\2\2\2\22\u008d\3\2\2\2\24\u0096\3\2\2\2\26"+
		"\u009c\3\2\2\2\30\u00a2\3\2\2\2\32\u00a5\3\2\2\2\34\u00ac\3\2\2\2\36\u00b1"+
		"\3\2\2\2 \u00bd\3\2\2\2\"\u00db\3\2\2\2$\u00e5\3\2\2\2&\u00e9\3\2\2\2"+
		"(\u00ed\3\2\2\2*\u00f5\3\2\2\2,\u0100\3\2\2\2.\u0104\3\2\2\2\60\u0106"+
		"\3\2\2\2\62\u0108\3\2\2\2\64\u010c\3\2\2\2\66\u010e\3\2\2\28\u0110\3\2"+
		"\2\2:;\5\4\3\2;<\7\2\2\3<\3\3\2\2\2=?\5\6\4\2>=\3\2\2\2?B\3\2\2\2@>\3"+
		"\2\2\2@A\3\2\2\2A\5\3\2\2\2B@\3\2\2\2CD\5\32\16\2DE\5\64\33\2EM\3\2\2"+
		"\2FM\5\b\5\2GM\5\20\t\2HI\5\36\20\2IJ\5\64\33\2JM\3\2\2\2KM\5 \21\2LC"+
		"\3\2\2\2LF\3\2\2\2LG\3\2\2\2LH\3\2\2\2LK\3\2\2\2M\7\3\2\2\2NO\5\n\6\2"+
		"OP\5\64\33\2PU\3\2\2\2QR\5\f\7\2RS\5\64\33\2SU\3\2\2\2TN\3\2\2\2TQ\3\2"+
		"\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\t\3\2\2\2XZ\5\16\b\2Y[\5.\30\2ZY\3"+
		"\2\2\2Z[\3\2\2\2[]\3\2\2\2\\X\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_"+
		"`\3\2\2\2`a\5\"\22\2a\13\3\2\2\2bd\5\62\32\2cb\3\2\2\2de\3\2\2\2ec\3\2"+
		"\2\2ef\3\2\2\2fp\3\2\2\2gh\5\60\31\2hi\5\60\31\2ik\5\60\31\2jl\5\60\31"+
		"\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2oc\3\2\2\2og\3\2\2"+
		"\2pu\3\2\2\2qt\5\62\32\2rt\5\60\31\2sq\3\2\2\2sr\3\2\2\2tw\3\2\2\2us\3"+
		"\2\2\2uv\3\2\2\2vx\3\2\2\2wu\3\2\2\2xy\5\"\22\2y\r\3\2\2\2z~\7\3\2\2{"+
		"|\7\t\2\2|~\7\4\2\2}z\3\2\2\2}{\3\2\2\2~\17\3\2\2\2\177\u0080\5\22\n\2"+
		"\u0080\u0081\5\64\33\2\u0081\u0086\3\2\2\2\u0082\u0083\5\f\7\2\u0083\u0084"+
		"\5\64\33\2\u0084\u0086\3\2\2\2\u0085\177\3\2\2\2\u0085\u0082\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\21\3\2\2"+
		"\2\u0089\u008b\5\30\r\2\u008a\u008c\5.\30\2\u008b\u008a\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u0089\3\2\2\2\u008e\u008f\3\2"+
		"\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0092\5\24\13\2\u0092\23\3\2\2\2\u0093\u0097\5\32\16\2\u0094\u0097\5"+
		"\26\f\2\u0095\u0097\5\36\20\2\u0096\u0093\3\2\2\2\u0096\u0094\3\2\2\2"+
		"\u0096\u0095\3\2\2\2\u0097\25\3\2\2\2\u0098\u009a\5\16\b\2\u0099\u009b"+
		"\5.\30\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c"+
		"\u0098\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2"+
		"\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\5\"\22\2\u00a1\27\3\2\2\2\u00a2\u00a3"+
		"\7\5\2\2\u00a3\31\3\2\2\2\u00a4\u00a6\5\34\17\2\u00a5\u00a4\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\u00aa\5.\30\2\u00aa\u00ab\5\"\22\2\u00ab\33\3\2\2\2\u00ac\u00ad"+
		"\7\6\2\2\u00ad\35\3\2\2\2\u00ae\u00b0\5.\30\2\u00af\u00ae\3\2\2\2\u00b0"+
		"\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2"+
		"\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\5\"\22\2\u00b5\37\3\2\2\2\u00b6\u00b8"+
		"\5.\30\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00be\5\64"+
		"\33\2\u00bd\u00b9\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0!\3\2\2\2\u00c1\u00ca\5,\27\2\u00c2\u00c9\5.\30\2"+
		"\u00c3\u00c9\5,\27\2\u00c4\u00c9\7\6\2\2\u00c5\u00c9\7\3\2\2\u00c6\u00c9"+
		"\7\5\2\2\u00c7\u00c9\7\4\2\2\u00c8\u00c2\3\2\2\2\u00c8\u00c3\3\2\2\2\u00c8"+
		"\u00c4\3\2\2\2\u00c8\u00c5\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2"+
		"\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb"+
		"\u00dc\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00d1\5(\25\2\u00ce\u00d0\5\36"+
		"\20\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2\u00dc\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d8\5*"+
		"\26\2\u00d5\u00d7\5\36\20\2\u00d6\u00d5\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2"+
		"\2\2\u00db\u00c1\3\2\2\2\u00db\u00cd\3\2\2\2\u00db\u00d4\3\2\2\2\u00dc"+
		"#\3\2\2\2\u00dd\u00e4\5.\30\2\u00de\u00e4\5,\27\2\u00df\u00e4\7\6\2\2"+
		"\u00e0\u00e4\7\3\2\2\u00e1\u00e4\7\4\2\2\u00e2\u00e4\7\r\2\2\u00e3\u00dd"+
		"\3\2\2\2\u00e3\u00de\3\2\2\2\u00e3\u00df\3\2\2\2\u00e3\u00e0\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2"+
		"\2\2\u00e5\u00e6\3\2\2\2\u00e6%\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00ea"+
		"\5,\27\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\'\3\2\2\2\u00ed\u00ee\7\7\2\2\u00ee\u00ef\5&\24\2"+
		"\u00ef\u00f1\5$\23\2\u00f0\u00f2\7\b\2\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2"+
		"\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\7\5\2\2\u00f4)\3\2\2\2\u00f5"+
		"\u00f6\7\7\2\2\u00f6\u00f7\7\b\2\2\u00f7\u00fb\5&\24\2\u00f8\u00fa\5."+
		"\30\2\u00f9\u00f8\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb"+
		"\u00fc\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u00ff\7\5"+
		"\2\2\u00ff+\3\2\2\2\u0100\u0101\t\2\2\2\u0101-\3\2\2\2\u0102\u0105\5\60"+
		"\31\2\u0103\u0105\5\62\32\2\u0104\u0102\3\2\2\2\u0104\u0103\3\2\2\2\u0105"+
		"/\3\2\2\2\u0106\u0107\7\f\2\2\u0107\61\3\2\2\2\u0108\u0109\7\13\2\2\u0109"+
		"\63\3\2\2\2\u010a\u010d\5\66\34\2\u010b\u010d\58\35\2\u010c\u010a\3\2"+
		"\2\2\u010c\u010b\3\2\2\2\u010d\65\3\2\2\2\u010e\u010f\7\r\2\2\u010f\67"+
		"\3\2\2\2\u0110\u0112\5\60\31\2\u0111\u0113\5\60\31\2\u0112\u0111\3\2\2"+
		"\2\u0113\u0114\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116"+
		"\3\2\2\2\u0116\u0117\7\r\2\2\u01179\3\2\2\2&@LTVZ^emosu}\u0085\u0087\u008b"+
		"\u008f\u0096\u009a\u009e\u00a7\u00b1\u00b9\u00bf\u00c8\u00ca\u00d1\u00d8"+
		"\u00db\u00e3\u00e5\u00eb\u00f1\u00fb\u0104\u010c\u0114";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}