// Generated from AndroCode.g4 by ANTLR 4.2.2

    package pl.fester3k.androcode.antlr;
    import pl.fester3k.androcode.antlr.enums.Type;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AndroCodeLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__19=1, T__18=2, T__17=3, T__16=4, T__15=5, T__14=6, T__13=7, T__12=8, 
		T__11=9, T__10=10, T__9=11, T__8=12, T__7=13, T__6=14, T__5=15, T__4=16, 
		T__3=17, T__2=18, T__1=19, T__0=20, K_INT_TYPE=21, K_VOID_TYPE=22, K_FLOAT_TYPE=23, 
		K_CHAR_TYPE=24, K_STRING_TYPE=25, K_BOOLEAN_TYPE=26, K_DEV_TYPE=27, LIBNAME=28, 
		ID=29, LP=30, RP=31, ADD_OP=32, MINUS_OP=33, MULT_OP=34, DEV_OP=35, INCR_OP=36, 
		DECR_OP=37, EQ_OP=38, NOT_EQ_OP=39, GT_OP=40, LT_OP=41, GTEQ_OP=42, LTEQ_OP=43, 
		AND_OP=44, OR_OP=45, CHAR=46, NEGATED_INT=47, INT=48, NEGATED_FLOAT=49, 
		FLOAT=50, STRING=51, BOOLEAN=52, NULL=53, LINE_COMMENT=54, COMMENT=55, 
		WS=56;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'use'", "'exec'", "'.'", "','", "'setParam'", "'while'", "'print'", "'for'", 
		"'if'", "'getFeature'", "'='", "'return'", "';'", "'sleep'", "'release'", 
		"'{'", "'else'", "'}'", "'!'", "'elseif'", "'int'", "'void'", "'float'", 
		"'char'", "'String'", "'bool'", "'feature'", "LIBNAME", "ID", "'('", "')'", 
		"'+'", "'-'", "'*'", "'/'", "'++'", "'--'", "'=='", "'!='", "'>'", "'<'", 
		"'>='", "'<='", "'&&'", "'||'", "CHAR", "NEGATED_INT", "INT", "NEGATED_FLOAT", 
		"FLOAT", "STRING", "BOOLEAN", "'null'", "LINE_COMMENT", "COMMENT", "WS"
	};
	public static final String[] ruleNames = {
		"T__19", "T__18", "T__17", "T__16", "T__15", "T__14", "T__13", "T__12", 
		"T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", 
		"T__2", "T__1", "T__0", "K_INT_TYPE", "K_VOID_TYPE", "K_FLOAT_TYPE", "K_CHAR_TYPE", 
		"K_STRING_TYPE", "K_BOOLEAN_TYPE", "K_DEV_TYPE", "LIBNAME", "ID", "LP", 
		"RP", "ADD_OP", "MINUS_OP", "MULT_OP", "DEV_OP", "INCR_OP", "DECR_OP", 
		"EQ_OP", "NOT_EQ_OP", "GT_OP", "LT_OP", "GTEQ_OP", "LTEQ_OP", "AND_OP", 
		"OR_OP", "CHAR", "NEGATED_INT", "INT", "NEGATED_FLOAT", "FLOAT", "STRING", 
		"BOOLEAN", "NULL", "ESC", "LOWERCASE_LETTER", "UPPERCASE_LETTER", "DIGIT", 
		"LINE_COMMENT", "COMMENT", "WS"
	};


	public AndroCodeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AndroCode.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2:\u01b4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\7\35\u0107\n\35\f\35\16\35\u010a\13\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\36\6\36\u0112\n\36\r\36\16\36\u0113\3\36\3\36\3\36\3\36\7"+
		"\36\u011a\n\36\f\36\16\36\u011d\13\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3"+
		"#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3+\3+\3"+
		"+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61"+
		"\7\61\u0151\n\61\f\61\16\61\u0154\13\61\5\61\u0156\n\61\3\62\3\62\3\62"+
		"\3\63\7\63\u015c\n\63\f\63\16\63\u015f\13\63\3\63\3\63\7\63\u0163\n\63"+
		"\f\63\16\63\u0166\13\63\3\63\3\63\6\63\u016a\n\63\r\63\16\63\u016b\5\63"+
		"\u016e\n\63\3\64\3\64\3\64\7\64\u0173\n\64\f\64\16\64\u0176\13\64\3\64"+
		"\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u0183\n\65\3\66"+
		"\3\66\3\66\3\66\3\66\3\67\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3;\3;\7;\u0197"+
		"\n;\f;\16;\u019a\13;\3;\3;\3;\3;\3<\3<\3<\3<\7<\u01a4\n<\f<\16<\u01a7"+
		"\13<\3<\3<\3<\3<\3<\3=\6=\u01af\n=\r=\16=\u01b0\3=\3=\5\u0174\u0198\u01a5"+
		"\2>\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67"+
		"m\2o\2q\2s\2u8w9y:\3\2\b\3\2\63;\b\2$$^^ddppttvv\3\2c|\3\2C\\\3\2\62;"+
		"\5\2\13\f\17\17\"\"\u01c4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2"+
		"\2\2\2k\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\3{\3\2\2\2\5\177\3\2"+
		"\2\2\7\u0084\3\2\2\2\t\u0086\3\2\2\2\13\u0088\3\2\2\2\r\u0091\3\2\2\2"+
		"\17\u0097\3\2\2\2\21\u009d\3\2\2\2\23\u00a1\3\2\2\2\25\u00a4\3\2\2\2\27"+
		"\u00af\3\2\2\2\31\u00b1\3\2\2\2\33\u00b8\3\2\2\2\35\u00ba\3\2\2\2\37\u00c0"+
		"\3\2\2\2!\u00c8\3\2\2\2#\u00ca\3\2\2\2%\u00cf\3\2\2\2\'\u00d1\3\2\2\2"+
		")\u00d3\3\2\2\2+\u00da\3\2\2\2-\u00de\3\2\2\2/\u00e3\3\2\2\2\61\u00e9"+
		"\3\2\2\2\63\u00ee\3\2\2\2\65\u00f5\3\2\2\2\67\u00fa\3\2\2\29\u0108\3\2"+
		"\2\2;\u0111\3\2\2\2=\u011e\3\2\2\2?\u0120\3\2\2\2A\u0122\3\2\2\2C\u0124"+
		"\3\2\2\2E\u0126\3\2\2\2G\u0128\3\2\2\2I\u012a\3\2\2\2K\u012d\3\2\2\2M"+
		"\u0130\3\2\2\2O\u0133\3\2\2\2Q\u0136\3\2\2\2S\u0138\3\2\2\2U\u013a\3\2"+
		"\2\2W\u013d\3\2\2\2Y\u0140\3\2\2\2[\u0143\3\2\2\2]\u0146\3\2\2\2_\u014a"+
		"\3\2\2\2a\u0155\3\2\2\2c\u0157\3\2\2\2e\u016d\3\2\2\2g\u016f\3\2\2\2i"+
		"\u0182\3\2\2\2k\u0184\3\2\2\2m\u0189\3\2\2\2o\u018c\3\2\2\2q\u018e\3\2"+
		"\2\2s\u0190\3\2\2\2u\u0192\3\2\2\2w\u019f\3\2\2\2y\u01ae\3\2\2\2{|\7w"+
		"\2\2|}\7u\2\2}~\7g\2\2~\4\3\2\2\2\177\u0080\7g\2\2\u0080\u0081\7z\2\2"+
		"\u0081\u0082\7g\2\2\u0082\u0083\7e\2\2\u0083\6\3\2\2\2\u0084\u0085\7\60"+
		"\2\2\u0085\b\3\2\2\2\u0086\u0087\7.\2\2\u0087\n\3\2\2\2\u0088\u0089\7"+
		"u\2\2\u0089\u008a\7g\2\2\u008a\u008b\7v\2\2\u008b\u008c\7R\2\2\u008c\u008d"+
		"\7c\2\2\u008d\u008e\7t\2\2\u008e\u008f\7c\2\2\u008f\u0090\7o\2\2\u0090"+
		"\f\3\2\2\2\u0091\u0092\7y\2\2\u0092\u0093\7j\2\2\u0093\u0094\7k\2\2\u0094"+
		"\u0095\7n\2\2\u0095\u0096\7g\2\2\u0096\16\3\2\2\2\u0097\u0098\7r\2\2\u0098"+
		"\u0099\7t\2\2\u0099\u009a\7k\2\2\u009a\u009b\7p\2\2\u009b\u009c\7v\2\2"+
		"\u009c\20\3\2\2\2\u009d\u009e\7h\2\2\u009e\u009f\7q\2\2\u009f\u00a0\7"+
		"t\2\2\u00a0\22\3\2\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7h\2\2\u00a3\24"+
		"\3\2\2\2\u00a4\u00a5\7i\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7v\2\2\u00a7"+
		"\u00a8\7H\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab\7v\2\2"+
		"\u00ab\u00ac\7w\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae\7g\2\2\u00ae\26\3\2"+
		"\2\2\u00af\u00b0\7?\2\2\u00b0\30\3\2\2\2\u00b1\u00b2\7t\2\2\u00b2\u00b3"+
		"\7g\2\2\u00b3\u00b4\7v\2\2\u00b4\u00b5\7w\2\2\u00b5\u00b6\7t\2\2\u00b6"+
		"\u00b7\7p\2\2\u00b7\32\3\2\2\2\u00b8\u00b9\7=\2\2\u00b9\34\3\2\2\2\u00ba"+
		"\u00bb\7u\2\2\u00bb\u00bc\7n\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7g\2\2"+
		"\u00be\u00bf\7r\2\2\u00bf\36\3\2\2\2\u00c0\u00c1\7t\2\2\u00c1\u00c2\7"+
		"g\2\2\u00c2\u00c3\7n\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6"+
		"\7u\2\2\u00c6\u00c7\7g\2\2\u00c7 \3\2\2\2\u00c8\u00c9\7}\2\2\u00c9\"\3"+
		"\2\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc\7n\2\2\u00cc\u00cd\7u\2\2\u00cd"+
		"\u00ce\7g\2\2\u00ce$\3\2\2\2\u00cf\u00d0\7\177\2\2\u00d0&\3\2\2\2\u00d1"+
		"\u00d2\7#\2\2\u00d2(\3\2\2\2\u00d3\u00d4\7g\2\2\u00d4\u00d5\7n\2\2\u00d5"+
		"\u00d6\7u\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9\7h\2\2"+
		"\u00d9*\3\2\2\2\u00da\u00db\7k\2\2\u00db\u00dc\7p\2\2\u00dc\u00dd\7v\2"+
		"\2\u00dd,\3\2\2\2\u00de\u00df\7x\2\2\u00df\u00e0\7q\2\2\u00e0\u00e1\7"+
		"k\2\2\u00e1\u00e2\7f\2\2\u00e2.\3\2\2\2\u00e3\u00e4\7h\2\2\u00e4\u00e5"+
		"\7n\2\2\u00e5\u00e6\7q\2\2\u00e6\u00e7\7c\2\2\u00e7\u00e8\7v\2\2\u00e8"+
		"\60\3\2\2\2\u00e9\u00ea\7e\2\2\u00ea\u00eb\7j\2\2\u00eb\u00ec\7c\2\2\u00ec"+
		"\u00ed\7t\2\2\u00ed\62\3\2\2\2\u00ee\u00ef\7U\2\2\u00ef\u00f0\7v\2\2\u00f0"+
		"\u00f1\7t\2\2\u00f1\u00f2\7k\2\2\u00f2\u00f3\7p\2\2\u00f3\u00f4\7i\2\2"+
		"\u00f4\64\3\2\2\2\u00f5\u00f6\7d\2\2\u00f6\u00f7\7q\2\2\u00f7\u00f8\7"+
		"q\2\2\u00f8\u00f9\7n\2\2\u00f9\66\3\2\2\2\u00fa\u00fb\7h\2\2\u00fb\u00fc"+
		"\7g\2\2\u00fc\u00fd\7c\2\2\u00fd\u00fe\7v\2\2\u00fe\u00ff\7w\2\2\u00ff"+
		"\u0100\7t\2\2\u0100\u0101\7g\2\2\u01018\3\2\2\2\u0102\u0107\5o8\2\u0103"+
		"\u0107\5q9\2\u0104\u0107\5s:\2\u0105\u0107\7a\2\2\u0106\u0102\3\2\2\2"+
		"\u0106\u0103\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0105\3\2\2\2\u0107\u010a"+
		"\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\3\2\2\2\u010a"+
		"\u0108\3\2\2\2\u010b\u010c\7\60\2\2\u010c\u010d\7c\2\2\u010d\u010e\7p"+
		"\2\2\u010e\u010f\7f\2\2\u010f:\3\2\2\2\u0110\u0112\5o8\2\u0111\u0110\3"+
		"\2\2\2\u0112\u0113\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\u011b\3\2\2\2\u0115\u011a\5o8\2\u0116\u011a\5q9\2\u0117\u011a\5s:\2\u0118"+
		"\u011a\7a\2\2\u0119\u0115\3\2\2\2\u0119\u0116\3\2\2\2\u0119\u0117\3\2"+
		"\2\2\u0119\u0118\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011c<\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u011f\7*\2\2\u011f"+
		">\3\2\2\2\u0120\u0121\7+\2\2\u0121@\3\2\2\2\u0122\u0123\7-\2\2\u0123B"+
		"\3\2\2\2\u0124\u0125\7/\2\2\u0125D\3\2\2\2\u0126\u0127\7,\2\2\u0127F\3"+
		"\2\2\2\u0128\u0129\7\61\2\2\u0129H\3\2\2\2\u012a\u012b\7-\2\2\u012b\u012c"+
		"\7-\2\2\u012cJ\3\2\2\2\u012d\u012e\7/\2\2\u012e\u012f\7/\2\2\u012fL\3"+
		"\2\2\2\u0130\u0131\7?\2\2\u0131\u0132\7?\2\2\u0132N\3\2\2\2\u0133\u0134"+
		"\7#\2\2\u0134\u0135\7?\2\2\u0135P\3\2\2\2\u0136\u0137\7@\2\2\u0137R\3"+
		"\2\2\2\u0138\u0139\7>\2\2\u0139T\3\2\2\2\u013a\u013b\7@\2\2\u013b\u013c"+
		"\7?\2\2\u013cV\3\2\2\2\u013d\u013e\7>\2\2\u013e\u013f\7?\2\2\u013fX\3"+
		"\2\2\2\u0140\u0141\7(\2\2\u0141\u0142\7(\2\2\u0142Z\3\2\2\2\u0143\u0144"+
		"\7~\2\2\u0144\u0145\7~\2\2\u0145\\\3\2\2\2\u0146\u0147\7)\2\2\u0147\u0148"+
		"\13\2\2\2\u0148\u0149\7)\2\2\u0149^\3\2\2\2\u014a\u014b\5C\"\2\u014b\u014c"+
		"\5a\61\2\u014c`\3\2\2\2\u014d\u0156\7\62\2\2\u014e\u0152\t\2\2\2\u014f"+
		"\u0151\5s:\2\u0150\u014f\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2"+
		"\2\u0152\u0153\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u014d"+
		"\3\2\2\2\u0155\u014e\3\2\2\2\u0156b\3\2\2\2\u0157\u0158\5C\"\2\u0158\u0159"+
		"\5e\63\2\u0159d\3\2\2\2\u015a\u015c\5s:\2\u015b\u015a\3\2\2\2\u015c\u015f"+
		"\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0160\3\2\2\2\u015f"+
		"\u015d\3\2\2\2\u0160\u0164\7\60\2\2\u0161\u0163\5s:\2\u0162\u0161\3\2"+
		"\2\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
		"\u016e\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u0169\7\60\2\2\u0168\u016a\5"+
		"s:\2\u0169\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u0169\3\2\2\2\u016b"+
		"\u016c\3\2\2\2\u016c\u016e\3\2\2\2\u016d\u015d\3\2\2\2\u016d\u0167\3\2"+
		"\2\2\u016ef\3\2\2\2\u016f\u0174\7$\2\2\u0170\u0173\5m\67\2\u0171\u0173"+
		"\13\2\2\2\u0172\u0170\3\2\2\2\u0172\u0171\3\2\2\2\u0173\u0176\3\2\2\2"+
		"\u0174\u0175\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0177\3\2\2\2\u0176\u0174"+
		"\3\2\2\2\u0177\u0178\7$\2\2\u0178h\3\2\2\2\u0179\u017a\7V\2\2\u017a\u017b"+
		"\7T\2\2\u017b\u017c\7W\2\2\u017c\u0183\7G\2\2\u017d\u017e\7H\2\2\u017e"+
		"\u017f\7C\2\2\u017f\u0180\7N\2\2\u0180\u0181\7U\2\2\u0181\u0183\7G\2\2"+
		"\u0182\u0179\3\2\2\2\u0182\u017d\3\2\2\2\u0183j\3\2\2\2\u0184\u0185\7"+
		"p\2\2\u0185\u0186\7w\2\2\u0186\u0187\7n\2\2\u0187\u0188\7n\2\2\u0188l"+
		"\3\2\2\2\u0189\u018a\7^\2\2\u018a\u018b\t\3\2\2\u018bn\3\2\2\2\u018c\u018d"+
		"\t\4\2\2\u018dp\3\2\2\2\u018e\u018f\t\5\2\2\u018fr\3\2\2\2\u0190\u0191"+
		"\t\6\2\2\u0191t\3\2\2\2\u0192\u0193\7\61\2\2\u0193\u0194\7\61\2\2\u0194"+
		"\u0198\3\2\2\2\u0195\u0197\13\2\2\2\u0196\u0195\3\2\2\2\u0197\u019a\3"+
		"\2\2\2\u0198\u0199\3\2\2\2\u0198\u0196\3\2\2\2\u0199\u019b\3\2\2\2\u019a"+
		"\u0198\3\2\2\2\u019b\u019c\7\f\2\2\u019c\u019d\3\2\2\2\u019d\u019e\b;"+
		"\2\2\u019ev\3\2\2\2\u019f\u01a0\7\61\2\2\u01a0\u01a1\7,\2\2\u01a1\u01a5"+
		"\3\2\2\2\u01a2\u01a4\13\2\2\2\u01a3\u01a2\3\2\2\2\u01a4\u01a7\3\2\2\2"+
		"\u01a5\u01a6\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6\u01a8\3\2\2\2\u01a7\u01a5"+
		"\3\2\2\2\u01a8\u01a9\7,\2\2\u01a9\u01aa\7\61\2\2\u01aa\u01ab\3\2\2\2\u01ab"+
		"\u01ac\b<\2\2\u01acx\3\2\2\2\u01ad\u01af\t\7\2\2\u01ae\u01ad\3\2\2\2\u01af"+
		"\u01b0\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b2\3\2"+
		"\2\2\u01b2\u01b3\b=\3\2\u01b3z\3\2\2\2\24\2\u0106\u0108\u0113\u0119\u011b"+
		"\u0152\u0155\u015d\u0164\u016b\u016d\u0172\u0174\u0182\u0198\u01a5\u01b0"+
		"\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}