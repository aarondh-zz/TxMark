// Generated from MarkdownPreprocessor.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MarkdownPreprocessorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOUBLE_QUOTE=1, SINGLE_QUOTE=2, OPEN_PARENTHESIS=3, CLOSE_PARENTHESIS=4, 
		ASTERISK=5, HASH=6, PERIOD=7, COLON=8, UNDERBAR=9, DASH=10, DIGIT=11, 
		LETTER=12, PUNCTUATION=13, TAB=14, EQUAL=15, SPACE=16, LESS_THAN=17, GREATER_THAN=18, 
		SLASH=19, CARRIAGE_RETURN=20, NON_WHITESPACE=21;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"DOUBLE_QUOTE", "SINGLE_QUOTE", "OPEN_PARENTHESIS", "CLOSE_PARENTHESIS", 
		"ASTERISK", "HASH", "PERIOD", "COLON", "UNDERBAR", "DASH", "DIGIT", "LETTER", 
		"PUNCTUATION", "TAB", "EQUAL", "SPACE", "LESS_THAN", "GREATER_THAN", "SLASH", 
		"CARRIAGE_RETURN", "NON_WHITESPACE"
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


	public MarkdownPreprocessorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MarkdownPreprocessor.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\27Z\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3"+
		"\25\5\25U\n\25\3\25\3\25\3\26\3\26\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27\3\2\6\3\2\62;\4\2C\\c|\n\2##&(-.==AB]`bb}\u0080\13\2\13\f\17\17\""+
		"\"%%)),,\60\61>>@@Z\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\3-\3\2\2\2\5/\3\2\2\2\7\61\3\2\2\2\t\63\3\2\2\2\13\65\3\2\2\2\r\67\3"+
		"\2\2\2\179\3\2\2\2\21;\3\2\2\2\23=\3\2\2\2\25?\3\2\2\2\27A\3\2\2\2\31"+
		"C\3\2\2\2\33E\3\2\2\2\35G\3\2\2\2\37I\3\2\2\2!K\3\2\2\2#M\3\2\2\2%O\3"+
		"\2\2\2\'Q\3\2\2\2)T\3\2\2\2+X\3\2\2\2-.\7$\2\2.\4\3\2\2\2/\60\7)\2\2\60"+
		"\6\3\2\2\2\61\62\7*\2\2\62\b\3\2\2\2\63\64\7+\2\2\64\n\3\2\2\2\65\66\7"+
		",\2\2\66\f\3\2\2\2\678\7%\2\28\16\3\2\2\29:\7\60\2\2:\20\3\2\2\2;<\7<"+
		"\2\2<\22\3\2\2\2=>\7a\2\2>\24\3\2\2\2?@\7/\2\2@\26\3\2\2\2AB\t\2\2\2B"+
		"\30\3\2\2\2CD\t\3\2\2D\32\3\2\2\2EF\t\4\2\2F\34\3\2\2\2GH\7\13\2\2H\36"+
		"\3\2\2\2IJ\7?\2\2J \3\2\2\2KL\7\"\2\2L\"\3\2\2\2MN\7>\2\2N$\3\2\2\2OP"+
		"\7@\2\2P&\3\2\2\2QR\7\61\2\2R(\3\2\2\2SU\7\17\2\2TS\3\2\2\2TU\3\2\2\2"+
		"UV\3\2\2\2VW\7\f\2\2W*\3\2\2\2XY\n\5\2\2Y,\3\2\2\2\4\2T\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}