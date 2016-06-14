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
		T__0=1, T__1=2, T__2=3, T__3=4, DIGITS=5, PUNCTUATION=6, TAB=7, SPACE=8, 
		CARRIAGE_RETURN=9, NON_WHITESPACE=10;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "DIGITS", "PUNCTUATION", "TAB", "SPACE", 
		"CARRIAGE_RETURN", "NON_WHITESPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'*'", "'.'", "'>'", "'#'", null, null, "'\t'", "' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "DIGITS", "PUNCTUATION", "TAB", "SPACE", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\f\64\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\6\6!\n\6\r\6\16\6\"\3\7\6\7"+
		"&\n\7\r\7\16\7\'\3\b\3\b\3\t\3\t\3\n\5\n/\n\n\3\n\3\n\3\13\3\13\2\2\f"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\3\2\5\3\2\62;\13\2#$&+"+
		"..\61\61<?AB]`bb}\u0080\n\2\13\f\17\17\"\"%%)),,\60\60@@\66\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\3\27\3\2\2\2\5\31\3\2\2"+
		"\2\7\33\3\2\2\2\t\35\3\2\2\2\13 \3\2\2\2\r%\3\2\2\2\17)\3\2\2\2\21+\3"+
		"\2\2\2\23.\3\2\2\2\25\62\3\2\2\2\27\30\7,\2\2\30\4\3\2\2\2\31\32\7\60"+
		"\2\2\32\6\3\2\2\2\33\34\7@\2\2\34\b\3\2\2\2\35\36\7%\2\2\36\n\3\2\2\2"+
		"\37!\t\2\2\2 \37\3\2\2\2!\"\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#\f\3\2\2\2$"+
		"&\t\3\2\2%$\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\16\3\2\2\2)*\7\13"+
		"\2\2*\20\3\2\2\2+,\7\"\2\2,\22\3\2\2\2-/\7\17\2\2.-\3\2\2\2./\3\2\2\2"+
		"/\60\3\2\2\2\60\61\7\f\2\2\61\24\3\2\2\2\62\63\n\4\2\2\63\26\3\2\2\2\6"+
		"\2\"\'.\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}