// Generated from Grammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, PLAY=11, SLEEP=12, USE=13, REPEAT=14, TIMES=15, FOR=16, EACH=17, 
		IN=18, DO=19, END=20, FUNCTION=21, Var=22, LOWERCASE=23, UPPERCASE=24, 
		DIGIT=25, BOL=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "PLAY", "SLEEP", "USE", "REPEAT", "TIMES", "FOR", "EACH", "IN", 
			"DO", "END", "FUNCTION", "Var", "LOWERCASE", "UPPERCASE", "DIGIT", "BOL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'_'", "'piano'", "'guitar'", "'violin'", "'drums'", 
			"'.'", "','", "'='", "'play'", "'sleep'", "'use'", "'repeat'", "'times'", 
			"'for'", "'each'", "'in'", "'do'", "'end'", "'function'", "'var'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "PLAY", 
			"SLEEP", "USE", "REPEAT", "TIMES", "FOR", "EACH", "IN", "DO", "END", 
			"FUNCTION", "Var", "LOWERCASE", "UPPERCASE", "DIGIT", "BOL"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u00a6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\6\33\u00a1\n\33\r\33\16\33\u00a2\3\33\3\33\2\2\34\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\3\2\6\3\2c|\3\2C\\"+
		"\3\2\62;\5\2\13\f\17\17\"\"\2\u00a6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\3\67\3\2\2\2\59\3\2\2\2\7;\3\2\2\2\t=\3\2\2\2\13C\3\2\2\2\rJ\3"+
		"\2\2\2\17Q\3\2\2\2\21W\3\2\2\2\23Y\3\2\2\2\25[\3\2\2\2\27]\3\2\2\2\31"+
		"b\3\2\2\2\33h\3\2\2\2\35l\3\2\2\2\37s\3\2\2\2!y\3\2\2\2#}\3\2\2\2%\u0082"+
		"\3\2\2\2\'\u0085\3\2\2\2)\u0088\3\2\2\2+\u008c\3\2\2\2-\u0095\3\2\2\2"+
		"/\u0099\3\2\2\2\61\u009b\3\2\2\2\63\u009d\3\2\2\2\65\u00a0\3\2\2\2\67"+
		"8\7]\2\28\4\3\2\2\29:\7_\2\2:\6\3\2\2\2;<\7a\2\2<\b\3\2\2\2=>\7r\2\2>"+
		"?\7k\2\2?@\7c\2\2@A\7p\2\2AB\7q\2\2B\n\3\2\2\2CD\7i\2\2DE\7w\2\2EF\7k"+
		"\2\2FG\7v\2\2GH\7c\2\2HI\7t\2\2I\f\3\2\2\2JK\7x\2\2KL\7k\2\2LM\7q\2\2"+
		"MN\7n\2\2NO\7k\2\2OP\7p\2\2P\16\3\2\2\2QR\7f\2\2RS\7t\2\2ST\7w\2\2TU\7"+
		"o\2\2UV\7u\2\2V\20\3\2\2\2WX\7\60\2\2X\22\3\2\2\2YZ\7.\2\2Z\24\3\2\2\2"+
		"[\\\7?\2\2\\\26\3\2\2\2]^\7r\2\2^_\7n\2\2_`\7c\2\2`a\7{\2\2a\30\3\2\2"+
		"\2bc\7u\2\2cd\7n\2\2de\7g\2\2ef\7g\2\2fg\7r\2\2g\32\3\2\2\2hi\7w\2\2i"+
		"j\7u\2\2jk\7g\2\2k\34\3\2\2\2lm\7t\2\2mn\7g\2\2no\7r\2\2op\7g\2\2pq\7"+
		"c\2\2qr\7v\2\2r\36\3\2\2\2st\7v\2\2tu\7k\2\2uv\7o\2\2vw\7g\2\2wx\7u\2"+
		"\2x \3\2\2\2yz\7h\2\2z{\7q\2\2{|\7t\2\2|\"\3\2\2\2}~\7g\2\2~\177\7c\2"+
		"\2\177\u0080\7e\2\2\u0080\u0081\7j\2\2\u0081$\3\2\2\2\u0082\u0083\7k\2"+
		"\2\u0083\u0084\7p\2\2\u0084&\3\2\2\2\u0085\u0086\7f\2\2\u0086\u0087\7"+
		"q\2\2\u0087(\3\2\2\2\u0088\u0089\7g\2\2\u0089\u008a\7p\2\2\u008a\u008b"+
		"\7f\2\2\u008b*\3\2\2\2\u008c\u008d\7h\2\2\u008d\u008e\7w\2\2\u008e\u008f"+
		"\7p\2\2\u008f\u0090\7e\2\2\u0090\u0091\7v\2\2\u0091\u0092\7k\2\2\u0092"+
		"\u0093\7q\2\2\u0093\u0094\7p\2\2\u0094,\3\2\2\2\u0095\u0096\7x\2\2\u0096"+
		"\u0097\7c\2\2\u0097\u0098\7t\2\2\u0098.\3\2\2\2\u0099\u009a\t\2\2\2\u009a"+
		"\60\3\2\2\2\u009b\u009c\t\3\2\2\u009c\62\3\2\2\2\u009d\u009e\t\4\2\2\u009e"+
		"\64\3\2\2\2\u009f\u00a1\t\5\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a2\3\2\2"+
		"\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5"+
		"\b\33\2\2\u00a5\66\3\2\2\2\4\2\u00a2\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}