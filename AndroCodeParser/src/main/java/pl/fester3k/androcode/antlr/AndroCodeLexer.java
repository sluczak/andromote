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
		T__21=1, T__20=2, T__19=3, T__18=4, T__17=5, T__16=6, T__15=7, T__14=8, 
		T__13=9, T__12=10, T__11=11, T__10=12, T__9=13, T__8=14, T__7=15, T__6=16, 
		T__5=17, T__4=18, T__3=19, T__2=20, T__1=21, T__0=22, K_INT_TYPE=23, K_VOID_TYPE=24, 
		K_FLOAT_TYPE=25, K_CHAR_TYPE=26, K_STRING_TYPE=27, K_BOOLEAN_TYPE=28, 
		K_DEV_TYPE=29, LIBNAME=30, ID=31, LP=32, RP=33, ADD_OP=34, MINUS_OP=35, 
		MULT_OP=36, DEV_OP=37, INCR_OP=38, DECR_OP=39, EQ_OP=40, NOT_EQ_OP=41, 
		GT_OP=42, LT_OP=43, GTEQ_OP=44, LTEQ_OP=45, AND_OP=46, OR_OP=47, CHAR=48, 
		NEGATED_INT=49, INT=50, NEGATED_FLOAT=51, FLOAT=52, STRING=53, BOOLEAN=54, 
		NULL=55, LINE_COMMENT=56, COMMENT=57, WS=58;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'use'", "'exec'", "'.'", "','", "'setParam'", "'while'", "'print'", "'for'", 
		"'if'", "'return'", "'='", "';'", "'sleep'", "'release'", "'{'", "'begin'", 
		"'else'", "'getAction'", "'}'", "'end'", "'!'", "'elseif'", "'int'", "'void'", 
		"'float'", "'char'", "'String'", "'bool'", "'action'", "LIBNAME", "ID", 
		"'('", "')'", "'+'", "'-'", "'*'", "'/'", "'++'", "'--'", "'=='", "'!='", 
		"'>'", "'<'", "'>='", "'<='", "'&&'", "'||'", "CHAR", "NEGATED_INT", "INT", 
		"NEGATED_FLOAT", "FLOAT", "STRING", "BOOLEAN", "'null'", "LINE_COMMENT", 
		"COMMENT", "WS"
	};
	public static final String[] ruleNames = {
		"T__21", "T__20", "T__19", "T__18", "T__17", "T__16", "T__15", "T__14", 
		"T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", 
		"T__4", "T__3", "T__2", "T__1", "T__0", "K_INT_TYPE", "K_VOID_TYPE", "K_FLOAT_TYPE", 
		"K_CHAR_TYPE", "K_STRING_TYPE", "K_BOOLEAN_TYPE", "K_DEV_TYPE", "LIBNAME", 
		"ID", "LP", "RP", "ADD_OP", "MINUS_OP", "MULT_OP", "DEV_OP", "INCR_OP", 
		"DECR_OP", "EQ_OP", "NOT_EQ_OP", "GT_OP", "LT_OP", "GTEQ_OP", "LTEQ_OP", 
		"AND_OP", "OR_OP", "CHAR", "NEGATED_INT", "INT", "NEGATED_FLOAT", "FLOAT", 
		"STRING", "BOOLEAN", "NULL", "ESC", "LOWERCASE_LETTER", "UPPERCASE_LETTER", 
		"DIGIT", "LINE_COMMENT", "COMMENT", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2<\u01c0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\7\37\u0113\n\37\f\37\16\37\u0116\13\37\3\37\3\37\3\37\3\37\3\37\3 \6"+
		" \u011e\n \r \16 \u011f\3 \3 \3 \3 \7 \u0126\n \f \16 \u0129\13 \3!\3"+
		"!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*"+
		"\3*\3+\3+\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3"+
		"\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\7\63\u015d\n\63\f\63\16\63\u0160"+
		"\13\63\5\63\u0162\n\63\3\64\3\64\3\64\3\65\7\65\u0168\n\65\f\65\16\65"+
		"\u016b\13\65\3\65\3\65\7\65\u016f\n\65\f\65\16\65\u0172\13\65\3\65\3\65"+
		"\6\65\u0176\n\65\r\65\16\65\u0177\5\65\u017a\n\65\3\66\3\66\3\66\7\66"+
		"\u017f\n\66\f\66\16\66\u0182\13\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\5\67\u018f\n\67\38\38\38\38\38\39\39\39\3:\3:\3;"+
		"\3;\3<\3<\3=\3=\3=\3=\7=\u01a3\n=\f=\16=\u01a6\13=\3=\3=\3=\3=\3>\3>\3"+
		">\3>\7>\u01b0\n>\f>\16>\u01b3\13>\3>\3>\3>\3>\3>\3?\6?\u01bb\n?\r?\16"+
		"?\u01bc\3?\3?\5\u0180\u01a4\u01b1\2@\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q\2s\2u\2w\2y:{;}<\3\2\b\3\2\63;"+
		"\b\2$$^^ddppttvv\3\2c|\3\2C\\\3\2\62;\5\2\13\f\17\17\"\"\u01d0\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2"+
		"\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2"+
		"c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3"+
		"\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\3\177\3\2\2\2\5\u0083\3\2\2\2"+
		"\7\u0088\3\2\2\2\t\u008a\3\2\2\2\13\u008c\3\2\2\2\r\u0095\3\2\2\2\17\u009b"+
		"\3\2\2\2\21\u00a1\3\2\2\2\23\u00a5\3\2\2\2\25\u00a8\3\2\2\2\27\u00af\3"+
		"\2\2\2\31\u00b1\3\2\2\2\33\u00b3\3\2\2\2\35\u00b9\3\2\2\2\37\u00c1\3\2"+
		"\2\2!\u00c3\3\2\2\2#\u00c9\3\2\2\2%\u00ce\3\2\2\2\'\u00d8\3\2\2\2)\u00da"+
		"\3\2\2\2+\u00de\3\2\2\2-\u00e0\3\2\2\2/\u00e7\3\2\2\2\61\u00eb\3\2\2\2"+
		"\63\u00f0\3\2\2\2\65\u00f6\3\2\2\2\67\u00fb\3\2\2\29\u0102\3\2\2\2;\u0107"+
		"\3\2\2\2=\u0114\3\2\2\2?\u011d\3\2\2\2A\u012a\3\2\2\2C\u012c\3\2\2\2E"+
		"\u012e\3\2\2\2G\u0130\3\2\2\2I\u0132\3\2\2\2K\u0134\3\2\2\2M\u0136\3\2"+
		"\2\2O\u0139\3\2\2\2Q\u013c\3\2\2\2S\u013f\3\2\2\2U\u0142\3\2\2\2W\u0144"+
		"\3\2\2\2Y\u0146\3\2\2\2[\u0149\3\2\2\2]\u014c\3\2\2\2_\u014f\3\2\2\2a"+
		"\u0152\3\2\2\2c\u0156\3\2\2\2e\u0161\3\2\2\2g\u0163\3\2\2\2i\u0179\3\2"+
		"\2\2k\u017b\3\2\2\2m\u018e\3\2\2\2o\u0190\3\2\2\2q\u0195\3\2\2\2s\u0198"+
		"\3\2\2\2u\u019a\3\2\2\2w\u019c\3\2\2\2y\u019e\3\2\2\2{\u01ab\3\2\2\2}"+
		"\u01ba\3\2\2\2\177\u0080\7w\2\2\u0080\u0081\7u\2\2\u0081\u0082\7g\2\2"+
		"\u0082\4\3\2\2\2\u0083\u0084\7g\2\2\u0084\u0085\7z\2\2\u0085\u0086\7g"+
		"\2\2\u0086\u0087\7e\2\2\u0087\6\3\2\2\2\u0088\u0089\7\60\2\2\u0089\b\3"+
		"\2\2\2\u008a\u008b\7.\2\2\u008b\n\3\2\2\2\u008c\u008d\7u\2\2\u008d\u008e"+
		"\7g\2\2\u008e\u008f\7v\2\2\u008f\u0090\7R\2\2\u0090\u0091\7c\2\2\u0091"+
		"\u0092\7t\2\2\u0092\u0093\7c\2\2\u0093\u0094\7o\2\2\u0094\f\3\2\2\2\u0095"+
		"\u0096\7y\2\2\u0096\u0097\7j\2\2\u0097\u0098\7k\2\2\u0098\u0099\7n\2\2"+
		"\u0099\u009a\7g\2\2\u009a\16\3\2\2\2\u009b\u009c\7r\2\2\u009c\u009d\7"+
		"t\2\2\u009d\u009e\7k\2\2\u009e\u009f\7p\2\2\u009f\u00a0\7v\2\2\u00a0\20"+
		"\3\2\2\2\u00a1\u00a2\7h\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7t\2\2\u00a4"+
		"\22\3\2\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7h\2\2\u00a7\24\3\2\2\2\u00a8"+
		"\u00a9\7t\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7v\2\2\u00ab\u00ac\7w\2\2"+
		"\u00ac\u00ad\7t\2\2\u00ad\u00ae\7p\2\2\u00ae\26\3\2\2\2\u00af\u00b0\7"+
		"?\2\2\u00b0\30\3\2\2\2\u00b1\u00b2\7=\2\2\u00b2\32\3\2\2\2\u00b3\u00b4"+
		"\7u\2\2\u00b4\u00b5\7n\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7g\2\2\u00b7"+
		"\u00b8\7r\2\2\u00b8\34\3\2\2\2\u00b9\u00ba\7t\2\2\u00ba\u00bb\7g\2\2\u00bb"+
		"\u00bc\7n\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7c\2\2\u00be\u00bf\7u\2\2"+
		"\u00bf\u00c0\7g\2\2\u00c0\36\3\2\2\2\u00c1\u00c2\7}\2\2\u00c2 \3\2\2\2"+
		"\u00c3\u00c4\7d\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7i\2\2\u00c6\u00c7"+
		"\7k\2\2\u00c7\u00c8\7p\2\2\u00c8\"\3\2\2\2\u00c9\u00ca\7g\2\2\u00ca\u00cb"+
		"\7n\2\2\u00cb\u00cc\7u\2\2\u00cc\u00cd\7g\2\2\u00cd$\3\2\2\2\u00ce\u00cf"+
		"\7i\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7v\2\2\u00d1\u00d2\7C\2\2\u00d2"+
		"\u00d3\7e\2\2\u00d3\u00d4\7v\2\2\u00d4\u00d5\7k\2\2\u00d5\u00d6\7q\2\2"+
		"\u00d6\u00d7\7p\2\2\u00d7&\3\2\2\2\u00d8\u00d9\7\177\2\2\u00d9(\3\2\2"+
		"\2\u00da\u00db\7g\2\2\u00db\u00dc\7p\2\2\u00dc\u00dd\7f\2\2\u00dd*\3\2"+
		"\2\2\u00de\u00df\7#\2\2\u00df,\3\2\2\2\u00e0\u00e1\7g\2\2\u00e1\u00e2"+
		"\7n\2\2\u00e2\u00e3\7u\2\2\u00e3\u00e4\7g\2\2\u00e4\u00e5\7k\2\2\u00e5"+
		"\u00e6\7h\2\2\u00e6.\3\2\2\2\u00e7\u00e8\7k\2\2\u00e8\u00e9\7p\2\2\u00e9"+
		"\u00ea\7v\2\2\u00ea\60\3\2\2\2\u00eb\u00ec\7x\2\2\u00ec\u00ed\7q\2\2\u00ed"+
		"\u00ee\7k\2\2\u00ee\u00ef\7f\2\2\u00ef\62\3\2\2\2\u00f0\u00f1\7h\2\2\u00f1"+
		"\u00f2\7n\2\2\u00f2\u00f3\7q\2\2\u00f3\u00f4\7c\2\2\u00f4\u00f5\7v\2\2"+
		"\u00f5\64\3\2\2\2\u00f6\u00f7\7e\2\2\u00f7\u00f8\7j\2\2\u00f8\u00f9\7"+
		"c\2\2\u00f9\u00fa\7t\2\2\u00fa\66\3\2\2\2\u00fb\u00fc\7U\2\2\u00fc\u00fd"+
		"\7v\2\2\u00fd\u00fe\7t\2\2\u00fe\u00ff\7k\2\2\u00ff\u0100\7p\2\2\u0100"+
		"\u0101\7i\2\2\u01018\3\2\2\2\u0102\u0103\7d\2\2\u0103\u0104\7q\2\2\u0104"+
		"\u0105\7q\2\2\u0105\u0106\7n\2\2\u0106:\3\2\2\2\u0107\u0108\7c\2\2\u0108"+
		"\u0109\7e\2\2\u0109\u010a\7v\2\2\u010a\u010b\7k\2\2\u010b\u010c\7q\2\2"+
		"\u010c\u010d\7p\2\2\u010d<\3\2\2\2\u010e\u0113\5s:\2\u010f\u0113\5u;\2"+
		"\u0110\u0113\5w<\2\u0111\u0113\7a\2\2\u0112\u010e\3\2\2\2\u0112\u010f"+
		"\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0111\3\2\2\2\u0113\u0116\3\2\2\2\u0114"+
		"\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\3\2\2\2\u0116\u0114\3\2"+
		"\2\2\u0117\u0118\7\60\2\2\u0118\u0119\7c\2\2\u0119\u011a\7p\2\2\u011a"+
		"\u011b\7f\2\2\u011b>\3\2\2\2\u011c\u011e\5s:\2\u011d\u011c\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0127\3\2"+
		"\2\2\u0121\u0126\5s:\2\u0122\u0126\5u;\2\u0123\u0126\5w<\2\u0124\u0126"+
		"\7a\2\2\u0125\u0121\3\2\2\2\u0125\u0122\3\2\2\2\u0125\u0123\3\2\2\2\u0125"+
		"\u0124\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2"+
		"\2\2\u0128@\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012b\7*\2\2\u012bB\3\2"+
		"\2\2\u012c\u012d\7+\2\2\u012dD\3\2\2\2\u012e\u012f\7-\2\2\u012fF\3\2\2"+
		"\2\u0130\u0131\7/\2\2\u0131H\3\2\2\2\u0132\u0133\7,\2\2\u0133J\3\2\2\2"+
		"\u0134\u0135\7\61\2\2\u0135L\3\2\2\2\u0136\u0137\7-\2\2\u0137\u0138\7"+
		"-\2\2\u0138N\3\2\2\2\u0139\u013a\7/\2\2\u013a\u013b\7/\2\2\u013bP\3\2"+
		"\2\2\u013c\u013d\7?\2\2\u013d\u013e\7?\2\2\u013eR\3\2\2\2\u013f\u0140"+
		"\7#\2\2\u0140\u0141\7?\2\2\u0141T\3\2\2\2\u0142\u0143\7@\2\2\u0143V\3"+
		"\2\2\2\u0144\u0145\7>\2\2\u0145X\3\2\2\2\u0146\u0147\7@\2\2\u0147\u0148"+
		"\7?\2\2\u0148Z\3\2\2\2\u0149\u014a\7>\2\2\u014a\u014b\7?\2\2\u014b\\\3"+
		"\2\2\2\u014c\u014d\7(\2\2\u014d\u014e\7(\2\2\u014e^\3\2\2\2\u014f\u0150"+
		"\7~\2\2\u0150\u0151\7~\2\2\u0151`\3\2\2\2\u0152\u0153\7)\2\2\u0153\u0154"+
		"\13\2\2\2\u0154\u0155\7)\2\2\u0155b\3\2\2\2\u0156\u0157\5G$\2\u0157\u0158"+
		"\5e\63\2\u0158d\3\2\2\2\u0159\u0162\7\62\2\2\u015a\u015e\t\2\2\2\u015b"+
		"\u015d\5w<\2\u015c\u015b\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2"+
		"\2\u015e\u015f\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0159"+
		"\3\2\2\2\u0161\u015a\3\2\2\2\u0162f\3\2\2\2\u0163\u0164\5G$\2\u0164\u0165"+
		"\5i\65\2\u0165h\3\2\2\2\u0166\u0168\5w<\2\u0167\u0166\3\2\2\2\u0168\u016b"+
		"\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016c\3\2\2\2\u016b"+
		"\u0169\3\2\2\2\u016c\u0170\7\60\2\2\u016d\u016f\5w<\2\u016e\u016d\3\2"+
		"\2\2\u016f\u0172\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171"+
		"\u017a\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u0175\7\60\2\2\u0174\u0176\5"+
		"w<\2\u0175\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0175\3\2\2\2\u0177"+
		"\u0178\3\2\2\2\u0178\u017a\3\2\2\2\u0179\u0169\3\2\2\2\u0179\u0173\3\2"+
		"\2\2\u017aj\3\2\2\2\u017b\u0180\7$\2\2\u017c\u017f\5q9\2\u017d\u017f\13"+
		"\2\2\2\u017e\u017c\3\2\2\2\u017e\u017d\3\2\2\2\u017f\u0182\3\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0180\u017e\3\2\2\2\u0181\u0183\3\2\2\2\u0182\u0180\3\2"+
		"\2\2\u0183\u0184\7$\2\2\u0184l\3\2\2\2\u0185\u0186\7V\2\2\u0186\u0187"+
		"\7T\2\2\u0187\u0188\7W\2\2\u0188\u018f\7G\2\2\u0189\u018a\7H\2\2\u018a"+
		"\u018b\7C\2\2\u018b\u018c\7N\2\2\u018c\u018d\7U\2\2\u018d\u018f\7G\2\2"+
		"\u018e\u0185\3\2\2\2\u018e\u0189\3\2\2\2\u018fn\3\2\2\2\u0190\u0191\7"+
		"p\2\2\u0191\u0192\7w\2\2\u0192\u0193\7n\2\2\u0193\u0194\7n\2\2\u0194p"+
		"\3\2\2\2\u0195\u0196\7^\2\2\u0196\u0197\t\3\2\2\u0197r\3\2\2\2\u0198\u0199"+
		"\t\4\2\2\u0199t\3\2\2\2\u019a\u019b\t\5\2\2\u019bv\3\2\2\2\u019c\u019d"+
		"\t\6\2\2\u019dx\3\2\2\2\u019e\u019f\7\61\2\2\u019f\u01a0\7\61\2\2\u01a0"+
		"\u01a4\3\2\2\2\u01a1\u01a3\13\2\2\2\u01a2\u01a1\3\2\2\2\u01a3\u01a6\3"+
		"\2\2\2\u01a4\u01a5\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5\u01a7\3\2\2\2\u01a6"+
		"\u01a4\3\2\2\2\u01a7\u01a8\7\f\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\b="+
		"\2\2\u01aaz\3\2\2\2\u01ab\u01ac\7\61\2\2\u01ac\u01ad\7,\2\2\u01ad\u01b1"+
		"\3\2\2\2\u01ae\u01b0\13\2\2\2\u01af\u01ae\3\2\2\2\u01b0\u01b3\3\2\2\2"+
		"\u01b1\u01b2\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b4\3\2\2\2\u01b3\u01b1"+
		"\3\2\2\2\u01b4\u01b5\7,\2\2\u01b5\u01b6\7\61\2\2\u01b6\u01b7\3\2\2\2\u01b7"+
		"\u01b8\b>\2\2\u01b8|\3\2\2\2\u01b9\u01bb\t\7\2\2\u01ba\u01b9\3\2\2\2\u01bb"+
		"\u01bc\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\3\2"+
		"\2\2\u01be\u01bf\b?\3\2\u01bf~\3\2\2\2\24\2\u0112\u0114\u011f\u0125\u0127"+
		"\u015e\u0161\u0169\u0170\u0177\u0179\u017e\u0180\u018e\u01a4\u01b1\u01bc"+
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