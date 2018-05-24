// Generated from BaknemLexer.g4 by ANTLR 4.7.1
   
 package nem;
 import nemdata.FunctionName;
 import nemdata.ChemicalElement;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BaknemLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LC_ID=1, ID=2, MIXID=3, CAP_ROMAN_NUM_SEQ=4, FACTORIAL=5, GENERAL_OMISSION=6, 
		LGRP=7, RGRP=8, BINOP=9, INT=10, CMPR=11, SUBSUB=12, SUBSUP=13, SUB=14, 
		SUPSUB=15, SUPSUP=16, SUP=17, MODIF=18, MODOVER=19, MODUNDER=20, TERM=21, 
		SFRAC=22, FRAC_SLASH=23, ESFRAC=24, CFRAC=25, CSLASH=26, ECFRAC=27, HCFRAC=28, 
		HCSLASH=29, EHCFRAC=30, SMIXFR=31, EMIXFR=32, SQRT=33, SQRT1=34, SQRT2=35, 
		SQRT3=36, IRAD1=37, IRAD2=38, IRAD3=39, RTRM1=40, RTRM2=41, RTRM3=42, 
		SPACE=43, NEWLINE=44, INTEGRAL=45;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"GREEK_LETTERs", "LC_ID", "ID", "MIXID", "ROMAN_NUMERALS", "CAP_ROMAN_NUM_SEQ", 
		"FACTORIAL", "GENERAL_OMISSION", "LGRP", "RGRP", "PLUS", "MINUS", "BSLASH", 
		"ASTER", "BINOP", "INT", "CMPR", "SUBSUB", "SUBSUP", "SUB", "SUPSUB", 
		"SUPSUP", "SUP", "MODIF", "DOT5", "MODOVER", "MODUNDER", "TERM", "SFRAC", 
		"FRAC_SLASH", "ESFRAC", "CFRAC", "CSLASH", "ECFRAC", "HCFRAC", "HCSLASH", 
		"EHCFRAC", "SMIXFR", "EMIXFR", "SQRT", "SQRT1", "SQRT2", "SQRT3", "IRAD1", 
		"IRAD2", "IRAD3", "RTRM1", "RTRM2", "RTRM3", "SPACE", "NEWLINE", "INTEGRAL"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, "'&'", "'='", "'('", "')'", null, null, 
		null, "';;'", "';^'", "';'", "'^;'", "'^^'", "'^'", null, "'<'", "'%'", 
		"']'", "'?'", null, "'#'", "',?'", null, "',#'", "',,?'", null, "',,#'", 
		"'_?'", "'_#'", "'>'", "'.>'", "'..>'", "'...>'", "'.<'", "'..<'", "'...<'", 
		"'.]'", "'..]'", "'...]'", "' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LC_ID", "ID", "MIXID", "CAP_ROMAN_NUM_SEQ", "FACTORIAL", "GENERAL_OMISSION", 
		"LGRP", "RGRP", "BINOP", "INT", "CMPR", "SUBSUB", "SUBSUP", "SUB", "SUPSUB", 
		"SUPSUP", "SUP", "MODIF", "MODOVER", "MODUNDER", "TERM", "SFRAC", "FRAC_SLASH", 
		"ESFRAC", "CFRAC", "CSLASH", "ECFRAC", "HCFRAC", "HCSLASH", "EHCFRAC", 
		"SMIXFR", "EMIXFR", "SQRT", "SQRT1", "SQRT2", "SQRT3", "IRAD1", "IRAD2", 
		"IRAD3", "RTRM1", "RTRM2", "RTRM3", "SPACE", "NEWLINE", "INTEGRAL"
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

	  static boolean chkLC_ROMAN_SEQ = false;
	  static boolean isFunAbbr( String name ){
	    return FunctionName.isBrlFunAbbr( name );
	  }
	  static boolean isChemicalSymbol( String brl ){
	    return ChemicalElement.isChemicalSymbol( brl );
	  }


	public BaknemLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BaknemLexer.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 1:
			LC_ID_action((RuleContext)_localctx, actionIndex);
			break;
		case 2:
			ID_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			MIXID_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void LC_ID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			if (isFunAbbr( getText() )){
			           setType( BaknemParser.FUN_ABBR );
			          }
			         
			break;
		}
	}
	private void ID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			if (isChemicalSymbol( getText() )){
			           setType( BaknemParser.POSS_CH_ELEMENT);
			         }
			        
			break;
		}
	}
	private void MIXID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			if (isChemicalSymbol( getText() )){
			           setType( BaknemParser.CHEM_ELEMENT);
			         }
			        
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u013c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\3\2\3\2\3\3\3\3\6\3p\n\3\r\3\16\3q\3\3\3\3\3\4\5\4w\n\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\7\7\u0088"+
		"\n\7\f\7\16\7\u008b\13\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00a4"+
		"\n\20\3\20\3\20\3\20\5\20\u00a9\n\20\3\21\5\21\u00ac\n\21\3\21\6\21\u00af"+
		"\n\21\r\21\16\21\u00b0\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00b9\n\22\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3"+
		"\37\5\37\u00d8\n\37\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\5\"\u00e3\n\"\3\""+
		"\3\"\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\5%\u00f2\n%\3%\3%\3&\3&\3&\3&\3"+
		"\'\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3"+
		"-\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3"+
		"\62\3\62\3\62\3\62\3\63\3\63\3\64\6\64\u0129\n\64\r\64\16\64\u012a\3\65"+
		"\3\65\6\65\u012f\n\65\r\65\16\65\u0130\3\65\3\65\3\65\3\65\3\65\5\65\u0138"+
		"\n\65\3\65\5\65\u013b\n\65\2\2\66\3\2\5\3\7\4\t\5\13\2\r\6\17\7\21\b\23"+
		"\t\25\n\27\2\31\2\33\2\35\2\37\13!\f#\r%\16\'\17)\20+\21-\22/\23\61\24"+
		"\63\2\65\25\67\269\27;\30=\31?\32A\33C\34E\35G\36I\37K M!O\"Q#S$U%W&Y"+
		"\'[(])_*a+c,e-g.i/\3\2\b\21\2((<<AACDFIKKNRTWY\\cdfikknrtwy|\4\2C\\c|"+
		"\f\2EFKKNOXXZZefkknoxxzz\3\2\62;\4\2\f\f\17\17\5\2\66\66eett\2\u0147\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y"+
		"\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2"+
		"\2\2\2g\3\2\2\2\2i\3\2\2\2\3k\3\2\2\2\5m\3\2\2\2\7v\3\2\2\2\t{\3\2\2\2"+
		"\13\u0080\3\2\2\2\r\u0082\3\2\2\2\17\u008c\3\2\2\2\21\u008e\3\2\2\2\23"+
		"\u0090\3\2\2\2\25\u0092\3\2\2\2\27\u0094\3\2\2\2\31\u0096\3\2\2\2\33\u0098"+
		"\3\2\2\2\35\u009a\3\2\2\2\37\u00a8\3\2\2\2!\u00ab\3\2\2\2#\u00b8\3\2\2"+
		"\2%\u00ba\3\2\2\2\'\u00bd\3\2\2\2)\u00c0\3\2\2\2+\u00c2\3\2\2\2-\u00c5"+
		"\3\2\2\2/\u00c8\3\2\2\2\61\u00ca\3\2\2\2\63\u00cc\3\2\2\2\65\u00ce\3\2"+
		"\2\2\67\u00d0\3\2\2\29\u00d2\3\2\2\2;\u00d4\3\2\2\2=\u00d7\3\2\2\2?\u00db"+
		"\3\2\2\2A\u00dd\3\2\2\2C\u00e0\3\2\2\2E\u00e6\3\2\2\2G\u00e9\3\2\2\2I"+
		"\u00ed\3\2\2\2K\u00f5\3\2\2\2M\u00f9\3\2\2\2O\u00fc\3\2\2\2Q\u00ff\3\2"+
		"\2\2S\u0101\3\2\2\2U\u0104\3\2\2\2W\u0108\3\2\2\2Y\u010d\3\2\2\2[\u0110"+
		"\3\2\2\2]\u0114\3\2\2\2_\u0119\3\2\2\2a\u011c\3\2\2\2c\u0120\3\2\2\2e"+
		"\u0125\3\2\2\2g\u0128\3\2\2\2i\u012c\3\2\2\2kl\t\2\2\2l\4\3\2\2\2mo\t"+
		"\3\2\2np\t\3\2\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\b"+
		"\3\2\2t\6\3\2\2\2uw\7.\2\2vu\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\t\3\2\2yz\b"+
		"\4\3\2z\b\3\2\2\2{|\7.\2\2|}\t\3\2\2}~\t\3\2\2~\177\b\5\4\2\177\n\3\2"+
		"\2\2\u0080\u0081\t\4\2\2\u0081\f\3\2\2\2\u0082\u0083\7.\2\2\u0083\u0084"+
		"\7.\2\2\u0084\u0085\5\13\6\2\u0085\u0089\5\13\6\2\u0086\u0088\5\13\6\2"+
		"\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a"+
		"\3\2\2\2\u008a\16\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\7(\2\2\u008d"+
		"\20\3\2\2\2\u008e\u008f\7?\2\2\u008f\22\3\2\2\2\u0090\u0091\7*\2\2\u0091"+
		"\24\3\2\2\2\u0092\u0093\7+\2\2\u0093\26\3\2\2\2\u0094\u0095\7-\2\2\u0095"+
		"\30\3\2\2\2\u0096\u0097\7/\2\2\u0097\32\3\2\2\2\u0098\u0099\7^\2\2\u0099"+
		"\34\3\2\2\2\u009a\u009b\7,\2\2\u009b\36\3\2\2\2\u009c\u00a9\5\27\f\2\u009d"+
		"\u00a9\5\31\r\2\u009e\u009f\5\27\f\2\u009f\u00a0\5\63\32\2\u00a0\u00a1"+
		"\5\31\r\2\u00a1\u00a9\3\2\2\2\u00a2\u00a4\7B\2\2\u00a3\u00a2\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a9\5\35\17\2\u00a6\u00a7\7"+
		"\60\2\2\u00a7\u00a9\7\61\2\2\u00a8\u009c\3\2\2\2\u00a8\u009d\3\2\2\2\u00a8"+
		"\u009e\3\2\2\2\u00a8\u00a3\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9 \3\2\2\2"+
		"\u00aa\u00ac\7%\2\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae"+
		"\3\2\2\2\u00ad\u00af\t\5\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\"\3\2\2\2\u00b2\u00b3\7\"\2\2"+
		"\u00b3\u00b4\7\60\2\2\u00b4\u00b9\7m\2\2\u00b5\u00b6\7\"\2\2\u00b6\u00b7"+
		"\7\60\2\2\u00b7\u00b9\7M\2\2\u00b8\u00b2\3\2\2\2\u00b8\u00b5\3\2\2\2\u00b9"+
		"$\3\2\2\2\u00ba\u00bb\7=\2\2\u00bb\u00bc\7=\2\2\u00bc&\3\2\2\2\u00bd\u00be"+
		"\7=\2\2\u00be\u00bf\7`\2\2\u00bf(\3\2\2\2\u00c0\u00c1\7=\2\2\u00c1*\3"+
		"\2\2\2\u00c2\u00c3\7`\2\2\u00c3\u00c4\7=\2\2\u00c4,\3\2\2\2\u00c5\u00c6"+
		"\7`\2\2\u00c6\u00c7\7`\2\2\u00c7.\3\2\2\2\u00c8\u00c9\7`\2\2\u00c9\60"+
		"\3\2\2\2\u00ca\u00cb\5\63\32\2\u00cb\62\3\2\2\2\u00cc\u00cd\7$\2\2\u00cd"+
		"\64\3\2\2\2\u00ce\u00cf\7>\2\2\u00cf\66\3\2\2\2\u00d0\u00d1\7\'\2\2\u00d1"+
		"8\3\2\2\2\u00d2\u00d3\7_\2\2\u00d3:\3\2\2\2\u00d4\u00d5\7A\2\2\u00d5<"+
		"\3\2\2\2\u00d6\u00d8\7a\2\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\u00da\7\61\2\2\u00da>\3\2\2\2\u00db\u00dc\7%\2\2"+
		"\u00dc@\3\2\2\2\u00dd\u00de\7.\2\2\u00de\u00df\7A\2\2\u00dfB\3\2\2\2\u00e0"+
		"\u00e2\7.\2\2\u00e1\u00e3\7a\2\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2"+
		"\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\7\61\2\2\u00e5D\3\2\2\2\u00e6\u00e7"+
		"\7.\2\2\u00e7\u00e8\7%\2\2\u00e8F\3\2\2\2\u00e9\u00ea\7.\2\2\u00ea\u00eb"+
		"\7.\2\2\u00eb\u00ec\7A\2\2\u00ecH\3\2\2\2\u00ed\u00ee\7.\2\2\u00ee\u00ef"+
		"\7.\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00f2\7a\2\2\u00f1\u00f0\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\7\61\2\2\u00f4J\3\2\2\2"+
		"\u00f5\u00f6\7.\2\2\u00f6\u00f7\7.\2\2\u00f7\u00f8\7%\2\2\u00f8L\3\2\2"+
		"\2\u00f9\u00fa\7a\2\2\u00fa\u00fb\7A\2\2\u00fbN\3\2\2\2\u00fc\u00fd\7"+
		"a\2\2\u00fd\u00fe\7%\2\2\u00feP\3\2\2\2\u00ff\u0100\7@\2\2\u0100R\3\2"+
		"\2\2\u0101\u0102\7\60\2\2\u0102\u0103\7@\2\2\u0103T\3\2\2\2\u0104\u0105"+
		"\7\60\2\2\u0105\u0106\7\60\2\2\u0106\u0107\7@\2\2\u0107V\3\2\2\2\u0108"+
		"\u0109\7\60\2\2\u0109\u010a\7\60\2\2\u010a\u010b\7\60\2\2\u010b\u010c"+
		"\7@\2\2\u010cX\3\2\2\2\u010d\u010e\7\60\2\2\u010e\u010f\7>\2\2\u010fZ"+
		"\3\2\2\2\u0110\u0111\7\60\2\2\u0111\u0112\7\60\2\2\u0112\u0113\7>\2\2"+
		"\u0113\\\3\2\2\2\u0114\u0115\7\60\2\2\u0115\u0116\7\60\2\2\u0116\u0117"+
		"\7\60\2\2\u0117\u0118\7>\2\2\u0118^\3\2\2\2\u0119\u011a\7\60\2\2\u011a"+
		"\u011b\7_\2\2\u011b`\3\2\2\2\u011c\u011d\7\60\2\2\u011d\u011e\7\60\2\2"+
		"\u011e\u011f\7_\2\2\u011fb\3\2\2\2\u0120\u0121\7\60\2\2\u0121\u0122\7"+
		"\60\2\2\u0122\u0123\7\60\2\2\u0123\u0124\7_\2\2\u0124d\3\2\2\2\u0125\u0126"+
		"\7\"\2\2\u0126f\3\2\2\2\u0127\u0129\t\6\2\2\u0128\u0127\3\2\2\2\u0129"+
		"\u012a\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012bh\3\2\2\2"+
		"\u012c\u013a\7#\2\2\u012d\u012f\7#\2\2\u012e\u012d\3\2\2\2\u012f\u0130"+
		"\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u013b\3\2\2\2\u0132"+
		"\u0137\7B\2\2\u0133\u0134\7&\2\2\u0134\u0138\t\7\2\2\u0135\u0136\7.\2"+
		"\2\u0136\u0138\7?\2\2\u0137\u0133\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u0139"+
		"\3\2\2\2\u0139\u013b\7_\2\2\u013a\u012e\3\2\2\2\u013a\u0132\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013bj\3\2\2\2\22\2qv\u0089\u00a3\u00a8\u00ab\u00b0\u00b8"+
		"\u00d7\u00e2\u00f1\u012a\u0130\u0137\u013a\5\3\3\2\3\4\3\3\5\4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}