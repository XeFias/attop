// Generated from GrammarVocab.g4 by ANTLR 4.5.2
 
	package parser.antlr4;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarVocab extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LCB=1, RCB=2, LB=3, RB=4, LSB=5, RSB=6, ASSIGN=7, ADDASSIGN=8, COLON=9, 
		SEMI=10, ARROW=11, COMMA=12, DOT=13, STATE=14, TRANSITIONS=15, TRANSITION=16, 
		DELAY=17, MINUS=18, PLUS=19, MULT=20, EQ=21, NE=22, GE=23, GT=24, LE=25, 
		LT=26, EQ_TOKEN=27, AND=28, OR=29, EXCL=30, QM=31, TIMEZERO=32, BOOL=33, 
		OBJECTREF=34, VARREF=35, REAL=36, NUM=37, WS=38, LINECOMMENT=39, BLOCKCOMMENT=40, 
		CHAR=41, DIGIT=42, DIVIDE=43;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LCB", "RCB", "LB", "RB", "LSB", "RSB", "ASSIGN", "ADDASSIGN", "COLON", 
		"SEMI", "ARROW", "COMMA", "DOT", "STATE", "TRANSITIONS", "TRANSITION", 
		"DELAY", "MINUS", "PLUS", "MULT", "EQ", "NE", "GE", "GT", "LE", "LT", 
		"EQ_TOKEN", "AND", "OR", "EXCL", "QM", "TIMEZERO", "BOOL", "OBJECTREF", 
		"VARREF", "REAL", "NUM", "WS", "LINECOMMENT", "BLOCKCOMMENT", "CHAR", 
		"DIGIT", "DIVIDE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'('", "')'", "'['", "']'", "':='", "'+='", "':'", 
		"';'", "'->'", "','", "'.'", "'State:'", "'Transitions:'", "'Transition:'", 
		"'Delay:'", "'-'", "'+'", "'*'", null, "'!='", "'>='", "'>'", "'<='", 
		"'<'", "'='", "'&&'", "'||'", "'!'", "'?'", "'t(0)'", null, null, null, 
		null, null, null, null, null, null, null, "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LCB", "RCB", "LB", "RB", "LSB", "RSB", "ASSIGN", "ADDASSIGN", "COLON", 
		"SEMI", "ARROW", "COMMA", "DOT", "STATE", "TRANSITIONS", "TRANSITION", 
		"DELAY", "MINUS", "PLUS", "MULT", "EQ", "NE", "GE", "GT", "LE", "LT", 
		"EQ_TOKEN", "AND", "OR", "EXCL", "QM", "TIMEZERO", "BOOL", "OBJECTREF", 
		"VARREF", "REAL", "NUM", "WS", "LINECOMMENT", "BLOCKCOMMENT", "CHAR", 
		"DIGIT", "DIVIDE"
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


	public GrammarVocab(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GrammarVocab.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2-\u0132\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\5\26\u00a6\n\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37"+
		"\3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u00cf\n"+
		"\"\3#\3#\3#\3#\3#\7#\u00d6\n#\f#\16#\u00d9\13#\5#\u00db\n#\3$\3$\3$\7"+
		"$\u00e0\n$\f$\16$\u00e3\13$\3$\3$\6$\u00e7\n$\r$\16$\u00e8\3$\5$\u00ec"+
		"\n$\3$\3$\7$\u00f0\n$\f$\16$\u00f3\13$\3%\3%\3%\3%\5%\u00f9\n%\3%\3%\3"+
		"%\5%\u00fe\n%\3%\3%\3%\5%\u0103\n%\3&\5&\u0106\n&\3&\6&\u0109\n&\r&\16"+
		"&\u010a\3\'\6\'\u010e\n\'\r\'\16\'\u010f\3\'\3\'\3(\3(\3(\3(\7(\u0118"+
		"\n(\f(\16(\u011b\13(\3(\3(\3)\3)\3)\3)\7)\u0123\n)\f)\16)\u0126\13)\3"+
		")\3)\3)\3)\3)\3*\3*\3+\3+\3,\3,\3\u0124\2-\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-\3\2\6\5\2\13\f\17\17\"\"\4\2\f\f\17\17\6\2%%C\\aac|\3\2\62;\u0142"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\3Y\3\2\2\2\5[\3\2\2\2\7]\3\2\2\2\t_\3\2\2\2\13a\3"+
		"\2\2\2\rc\3\2\2\2\17e\3\2\2\2\21h\3\2\2\2\23k\3\2\2\2\25m\3\2\2\2\27o"+
		"\3\2\2\2\31r\3\2\2\2\33t\3\2\2\2\35v\3\2\2\2\37}\3\2\2\2!\u008a\3\2\2"+
		"\2#\u0096\3\2\2\2%\u009d\3\2\2\2\'\u009f\3\2\2\2)\u00a1\3\2\2\2+\u00a3"+
		"\3\2\2\2-\u00a7\3\2\2\2/\u00aa\3\2\2\2\61\u00ad\3\2\2\2\63\u00af\3\2\2"+
		"\2\65\u00b2\3\2\2\2\67\u00b4\3\2\2\29\u00b6\3\2\2\2;\u00b9\3\2\2\2=\u00bc"+
		"\3\2\2\2?\u00be\3\2\2\2A\u00c0\3\2\2\2C\u00ce\3\2\2\2E\u00da\3\2\2\2G"+
		"\u00dc\3\2\2\2I\u00f4\3\2\2\2K\u0105\3\2\2\2M\u010d\3\2\2\2O\u0113\3\2"+
		"\2\2Q\u011e\3\2\2\2S\u012c\3\2\2\2U\u012e\3\2\2\2W\u0130\3\2\2\2YZ\7}"+
		"\2\2Z\4\3\2\2\2[\\\7\177\2\2\\\6\3\2\2\2]^\7*\2\2^\b\3\2\2\2_`\7+\2\2"+
		"`\n\3\2\2\2ab\7]\2\2b\f\3\2\2\2cd\7_\2\2d\16\3\2\2\2ef\7<\2\2fg\7?\2\2"+
		"g\20\3\2\2\2hi\7-\2\2ij\7?\2\2j\22\3\2\2\2kl\7<\2\2l\24\3\2\2\2mn\7=\2"+
		"\2n\26\3\2\2\2op\7/\2\2pq\7@\2\2q\30\3\2\2\2rs\7.\2\2s\32\3\2\2\2tu\7"+
		"\60\2\2u\34\3\2\2\2vw\7U\2\2wx\7v\2\2xy\7c\2\2yz\7v\2\2z{\7g\2\2{|\7<"+
		"\2\2|\36\3\2\2\2}~\7V\2\2~\177\7t\2\2\177\u0080\7c\2\2\u0080\u0081\7p"+
		"\2\2\u0081\u0082\7u\2\2\u0082\u0083\7k\2\2\u0083\u0084\7v\2\2\u0084\u0085"+
		"\7k\2\2\u0085\u0086\7q\2\2\u0086\u0087\7p\2\2\u0087\u0088\7u\2\2\u0088"+
		"\u0089\7<\2\2\u0089 \3\2\2\2\u008a\u008b\7V\2\2\u008b\u008c\7t\2\2\u008c"+
		"\u008d\7c\2\2\u008d\u008e\7p\2\2\u008e\u008f\7u\2\2\u008f\u0090\7k\2\2"+
		"\u0090\u0091\7v\2\2\u0091\u0092\7k\2\2\u0092\u0093\7q\2\2\u0093\u0094"+
		"\7p\2\2\u0094\u0095\7<\2\2\u0095\"\3\2\2\2\u0096\u0097\7F\2\2\u0097\u0098"+
		"\7g\2\2\u0098\u0099\7n\2\2\u0099\u009a\7c\2\2\u009a\u009b\7{\2\2\u009b"+
		"\u009c\7<\2\2\u009c$\3\2\2\2\u009d\u009e\7/\2\2\u009e&\3\2\2\2\u009f\u00a0"+
		"\7-\2\2\u00a0(\3\2\2\2\u00a1\u00a2\7,\2\2\u00a2*\3\2\2\2\u00a3\u00a5\5"+
		"\67\34\2\u00a4\u00a6\5\67\34\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2"+
		"\u00a6,\3\2\2\2\u00a7\u00a8\7#\2\2\u00a8\u00a9\7?\2\2\u00a9.\3\2\2\2\u00aa"+
		"\u00ab\7@\2\2\u00ab\u00ac\7?\2\2\u00ac\60\3\2\2\2\u00ad\u00ae\7@\2\2\u00ae"+
		"\62\3\2\2\2\u00af\u00b0\7>\2\2\u00b0\u00b1\7?\2\2\u00b1\64\3\2\2\2\u00b2"+
		"\u00b3\7>\2\2\u00b3\66\3\2\2\2\u00b4\u00b5\7?\2\2\u00b58\3\2\2\2\u00b6"+
		"\u00b7\7(\2\2\u00b7\u00b8\7(\2\2\u00b8:\3\2\2\2\u00b9\u00ba\7~\2\2\u00ba"+
		"\u00bb\7~\2\2\u00bb<\3\2\2\2\u00bc\u00bd\7#\2\2\u00bd>\3\2\2\2\u00be\u00bf"+
		"\7A\2\2\u00bf@\3\2\2\2\u00c0\u00c1\7v\2\2\u00c1\u00c2\7*\2\2\u00c2\u00c3"+
		"\7\62\2\2\u00c3\u00c4\7+\2\2\u00c4B\3\2\2\2\u00c5\u00c6\7v\2\2\u00c6\u00c7"+
		"\7t\2\2\u00c7\u00c8\7w\2\2\u00c8\u00cf\7g\2\2\u00c9\u00ca\7h\2\2\u00ca"+
		"\u00cb\7c\2\2\u00cb\u00cc\7n\2\2\u00cc\u00cd\7u\2\2\u00cd\u00cf\7g\2\2"+
		"\u00ce\u00c5\3\2\2\2\u00ce\u00c9\3\2\2\2\u00cfD\3\2\2\2\u00d0\u00db\5"+
		"A!\2\u00d1\u00d7\5G$\2\u00d2\u00d3\5\33\16\2\u00d3\u00d4\5E#\2\u00d4\u00d6"+
		"\3\2\2\2\u00d5\u00d2\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00d0\3\2"+
		"\2\2\u00da\u00d1\3\2\2\2\u00dbF\3\2\2\2\u00dc\u00e1\5S*\2\u00dd\u00e0"+
		"\5S*\2\u00de\u00e0\5U+\2\u00df\u00dd\3\2\2\2\u00df\u00de\3\2\2\2\u00e0"+
		"\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00f1\3\2"+
		"\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00eb\5\13\6\2\u00e5\u00e7\5U+\2\u00e6"+
		"\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2"+
		"\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00ec\5G$\2\u00eb\u00e6\3\2\2\2\u00eb\u00ea"+
		"\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\5\r\7\2\u00ee\u00f0\3\2\2\2\u00ef"+
		"\u00e4\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2"+
		"\2\2\u00f2H\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f8\5K&\2\u00f5\u00f6"+
		"\5\33\16\2\u00f6\u00f7\5K&\2\u00f7\u00f9\3\2\2\2\u00f8\u00f5\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u0102\3\2\2\2\u00fa\u00fd\7g\2\2\u00fb\u00fe\5\'"+
		"\24\2\u00fc\u00fe\5%\23\2\u00fd\u00fb\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u0100\5U+\2\u0100\u0101\5U+\2\u0101\u0103\3\2\2\2"+
		"\u0102\u00fa\3\2\2\2\u0102\u0103\3\2\2\2\u0103J\3\2\2\2\u0104\u0106\5"+
		"%\23\2\u0105\u0104\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2\2\2\u0107"+
		"\u0109\5U+\2\u0108\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0108\3\2\2"+
		"\2\u010a\u010b\3\2\2\2\u010bL\3\2\2\2\u010c\u010e\t\2\2\2\u010d\u010c"+
		"\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111\u0112\b\'\2\2\u0112N\3\2\2\2\u0113\u0114\7\61\2\2"+
		"\u0114\u0115\7\61\2\2\u0115\u0119\3\2\2\2\u0116\u0118\n\3\2\2\u0117\u0116"+
		"\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u011c\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011d\b(\2\2\u011dP\3\2\2\2\u011e"+
		"\u011f\7\61\2\2\u011f\u0120\7,\2\2\u0120\u0124\3\2\2\2\u0121\u0123\13"+
		"\2\2\2\u0122\u0121\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0125\3\2\2\2\u0124"+
		"\u0122\3\2\2\2\u0125\u0127\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0128\7,"+
		"\2\2\u0128\u0129\7\61\2\2\u0129\u012a\3\2\2\2\u012a\u012b\b)\2\2\u012b"+
		"R\3\2\2\2\u012c\u012d\t\4\2\2\u012dT\3\2\2\2\u012e\u012f\t\5\2\2\u012f"+
		"V\3\2\2\2\u0130\u0131\7\61\2\2\u0131X\3\2\2\2\24\2\u00a5\u00ce\u00d7\u00da"+
		"\u00df\u00e1\u00e8\u00eb\u00f1\u00f8\u00fd\u0102\u0105\u010a\u010f\u0119"+
		"\u0124\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}