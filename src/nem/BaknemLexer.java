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
		LC_ID=1, ID=2, MIXID=3, CAP_ROMAN_NUM_SEQ=4, UC_ID=5, GREEK_LETTER=6, 
		MISCALPHD46=7, FACTORIAL=8, GENERAL_OMISSION=9, LGRP=10, RGRP=11, BINOP=12, 
		BINOP_PREC=13, INT=14, CMPR=15, SUBSUB=16, SUBSUP=17, SUB=18, SUPSUB=19, 
		SUPSUP=20, SUP=21, MODIF=22, MODOVER=23, MODUNDER=24, TERM=25, SFRAC=26, 
		FRAC_SLASH=27, ESFRAC=28, CFRAC=29, CSLASH=30, ECFRAC=31, HCFRAC=32, HCSLASH=33, 
		EHCFRAC=34, SMIXFR=35, EMIXFR=36, SQRT=37, SQRT1=38, SQRT2=39, SQRT3=40, 
		IRAD1=41, IRAD2=42, IRAD3=43, RTRM1=44, RTRM2=45, RTRM3=46, SPACE=47, 
		NEWLINE=48, INFINITY=49, INTEGRAL=50;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"GREEK_LETTERs", "LC_ID", "ID", "MIXID", "ROMAN_NUMERALS", "CAP_ROMAN_NUM_SEQ", 
		"UC_ID", "GREEK_LETTER", "MISCALPHD46", "FACTORIAL", "GENERAL_OMISSION", 
		"LGRP", "RGRP", "PLUS", "MINUS", "BSLASH", "ASTER", "BINOP", "BINOP_PREC", 
		"INT", "CMPR", "SUBSUB", "SUBSUP", "SUB", "SUPSUB", "SUPSUP", "SUP", "MODIF", 
		"DOT5", "MODOVER", "MODUNDER", "TERM", "SFRAC", "FRAC_SLASH", "ESFRAC", 
		"CFRAC", "CSLASH", "ECFRAC", "HCFRAC", "HCSLASH", "EHCFRAC", "SMIXFR", 
		"EMIXFR", "SQRT", "SQRT1", "SQRT2", "SQRT3", "IRAD1", "IRAD2", "IRAD3", 
		"RTRM1", "RTRM2", "RTRM3", "SPACE", "NEWLINE", "INFINITY", "INTEGRAL"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, "'&'", "'='", "'('", "')'", 
		null, null, null, null, "';;'", "';^'", "';'", "'^;'", "'^^'", "'^'", 
		null, "'<'", "'%'", "']'", "'?'", null, "'#'", "',?'", null, "',#'", "',,?'", 
		null, "',,#'", "'_?'", "'_#'", "'>'", "'.>'", "'..>'", "'...>'", "'.<'", 
		"'..<'", "'...<'", "'.]'", "'..]'", "'...]'", "' '", null, "',='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LC_ID", "ID", "MIXID", "CAP_ROMAN_NUM_SEQ", "UC_ID", "GREEK_LETTER", 
		"MISCALPHD46", "FACTORIAL", "GENERAL_OMISSION", "LGRP", "RGRP", "BINOP", 
		"BINOP_PREC", "INT", "CMPR", "SUBSUB", "SUBSUP", "SUB", "SUPSUB", "SUPSUP", 
		"SUP", "MODIF", "MODOVER", "MODUNDER", "TERM", "SFRAC", "FRAC_SLASH", 
		"ESFRAC", "CFRAC", "CSLASH", "ECFRAC", "HCFRAC", "HCSLASH", "EHCFRAC", 
		"SMIXFR", "EMIXFR", "SQRT", "SQRT1", "SQRT2", "SQRT3", "IRAD1", "IRAD2", 
		"IRAD3", "RTRM1", "RTRM2", "RTRM3", "SPACE", "NEWLINE", "INFINITY", "INTEGRAL"
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
	  static boolean isTrailFA( String name){
	    return FunctionName.trailingFunAbbr( name );
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
			          } //else if{ isTrailFA( getText())){ ...
			         
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u0162\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\3\3\3"+
		"\6\3z\n\3\r\3\16\3{\3\3\3\3\3\4\5\4\u0081\n\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\7\7\u0092\n\7\f\7\16\7\u0095\13\7"+
		"\3\b\3\b\3\b\3\b\3\b\6\b\u009c\n\b\r\b\16\b\u009d\3\t\3\t\5\t\u00a2\n"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00ac\n\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u00c4\n\23\3\24\5\24\u00c7\n\24\3\24\3\24\3\24\5"+
		"\24\u00cc\n\24\3\25\5\25\u00cf\n\25\3\25\6\25\u00d2\n\25\r\25\16\25\u00d3"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00dc\n\26\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\5#\u00fb\n#\3#\3#\3$\3$\3%\3%\3"+
		"%\3&\3&\5&\u0106\n&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\5)\u0115"+
		"\n)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3.\3.\3.\3/\3/\3/\3/\3\60"+
		"\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63"+
		"\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66"+
		"\3\67\3\67\38\68\u014c\n8\r8\168\u014d\39\39\39\3:\3:\6:\u0155\n:\r:\16"+
		":\u0156\3:\3:\3:\3:\3:\5:\u015e\n:\3:\5:\u0161\n:\2\2;\3\2\5\3\7\4\t\5"+
		"\13\2\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\2\37\2!\2#\2%\16\'\17"+
		")\20+\21-\22/\23\61\24\63\25\65\26\67\279\30;\2=\31?\32A\33C\34E\35G\36"+
		"I\37K M!O\"Q#S$U%W&Y\'[(])_*a+c,e-g.i/k\60m\61o\62q\63s\64\3\2\n\21\2"+
		"((<<AACDFIKKNRTWY\\cdfikknrtwy|\4\2C\\c|\f\2EFKKNOXXZZefkknoxxzz\5\2c"+
		"crrtu\t\2&&\62\62@@ccegjjuu\3\2\62;\4\2\f\f\17\17\5\2\66\66eett\2\u016f"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2"+
		"\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2"+
		"q\3\2\2\2\2s\3\2\2\2\3u\3\2\2\2\5w\3\2\2\2\7\u0080\3\2\2\2\t\u0085\3\2"+
		"\2\2\13\u008a\3\2\2\2\r\u008c\3\2\2\2\17\u0096\3\2\2\2\21\u009f\3\2\2"+
		"\2\23\u00ab\3\2\2\2\25\u00ad\3\2\2\2\27\u00af\3\2\2\2\31\u00b1\3\2\2\2"+
		"\33\u00b3\3\2\2\2\35\u00b5\3\2\2\2\37\u00b7\3\2\2\2!\u00b9\3\2\2\2#\u00bb"+
		"\3\2\2\2%\u00c3\3\2\2\2\'\u00cb\3\2\2\2)\u00ce\3\2\2\2+\u00db\3\2\2\2"+
		"-\u00dd\3\2\2\2/\u00e0\3\2\2\2\61\u00e3\3\2\2\2\63\u00e5\3\2\2\2\65\u00e8"+
		"\3\2\2\2\67\u00eb\3\2\2\29\u00ed\3\2\2\2;\u00ef\3\2\2\2=\u00f1\3\2\2\2"+
		"?\u00f3\3\2\2\2A\u00f5\3\2\2\2C\u00f7\3\2\2\2E\u00fa\3\2\2\2G\u00fe\3"+
		"\2\2\2I\u0100\3\2\2\2K\u0103\3\2\2\2M\u0109\3\2\2\2O\u010c\3\2\2\2Q\u0110"+
		"\3\2\2\2S\u0118\3\2\2\2U\u011c\3\2\2\2W\u011f\3\2\2\2Y\u0122\3\2\2\2["+
		"\u0124\3\2\2\2]\u0127\3\2\2\2_\u012b\3\2\2\2a\u0130\3\2\2\2c\u0133\3\2"+
		"\2\2e\u0137\3\2\2\2g\u013c\3\2\2\2i\u013f\3\2\2\2k\u0143\3\2\2\2m\u0148"+
		"\3\2\2\2o\u014b\3\2\2\2q\u014f\3\2\2\2s\u0152\3\2\2\2uv\t\2\2\2v\4\3\2"+
		"\2\2wy\t\3\2\2xz\t\3\2\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|}\3\2"+
		"\2\2}~\b\3\2\2~\6\3\2\2\2\177\u0081\7.\2\2\u0080\177\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\t\3\2\2\u0083\u0084\b\4\3\2\u0084"+
		"\b\3\2\2\2\u0085\u0086\7.\2\2\u0086\u0087\t\3\2\2\u0087\u0088\t\3\2\2"+
		"\u0088\u0089\b\5\4\2\u0089\n\3\2\2\2\u008a\u008b\t\4\2\2\u008b\f\3\2\2"+
		"\2\u008c\u008d\7.\2\2\u008d\u008e\7.\2\2\u008e\u008f\5\13\6\2\u008f\u0093"+
		"\5\13\6\2\u0090\u0092\5\13\6\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2"+
		"\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\16\3\2\2\2\u0095\u0093"+
		"\3\2\2\2\u0096\u0097\7.\2\2\u0097\u0098\7.\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009b\t\3\2\2\u009a\u009c\t\3\2\2\u009b\u009a\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\20\3\2\2\2\u009f\u00a1"+
		"\7\60\2\2\u00a0\u00a2\7.\2\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a4\5\3\2\2\u00a4\22\3\2\2\2\u00a5\u00a6\7B\2\2"+
		"\u00a6\u00a7\7.\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00ac\t\5\2\2\u00a9\u00aa"+
		"\7B\2\2\u00aa\u00ac\t\6\2\2\u00ab\u00a5\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac"+
		"\24\3\2\2\2\u00ad\u00ae\7(\2\2\u00ae\26\3\2\2\2\u00af\u00b0\7?\2\2\u00b0"+
		"\30\3\2\2\2\u00b1\u00b2\7*\2\2\u00b2\32\3\2\2\2\u00b3\u00b4\7+\2\2\u00b4"+
		"\34\3\2\2\2\u00b5\u00b6\7-\2\2\u00b6\36\3\2\2\2\u00b7\u00b8\7/\2\2\u00b8"+
		" \3\2\2\2\u00b9\u00ba\7^\2\2\u00ba\"\3\2\2\2\u00bb\u00bc\7,\2\2\u00bc"+
		"$\3\2\2\2\u00bd\u00c4\5\35\17\2\u00be\u00c4\5\37\20\2\u00bf\u00c0\5\35"+
		"\17\2\u00c0\u00c1\5;\36\2\u00c1\u00c2\5\37\20\2\u00c2\u00c4\3\2\2\2\u00c3"+
		"\u00bd\3\2\2\2\u00c3\u00be\3\2\2\2\u00c3\u00bf\3\2\2\2\u00c4&\3\2\2\2"+
		"\u00c5\u00c7\7B\2\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8"+
		"\3\2\2\2\u00c8\u00cc\5#\22\2\u00c9\u00ca\7\60\2\2\u00ca\u00cc\7\61\2\2"+
		"\u00cb\u00c6\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc(\3\2\2\2\u00cd\u00cf\7"+
		"%\2\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0"+
		"\u00d2\t\7\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d1\3\2"+
		"\2\2\u00d3\u00d4\3\2\2\2\u00d4*\3\2\2\2\u00d5\u00d6\7\"\2\2\u00d6\u00d7"+
		"\7\60\2\2\u00d7\u00dc\7m\2\2\u00d8\u00d9\7\"\2\2\u00d9\u00da\7\60\2\2"+
		"\u00da\u00dc\7M\2\2\u00db\u00d5\3\2\2\2\u00db\u00d8\3\2\2\2\u00dc,\3\2"+
		"\2\2\u00dd\u00de\7=\2\2\u00de\u00df\7=\2\2\u00df.\3\2\2\2\u00e0\u00e1"+
		"\7=\2\2\u00e1\u00e2\7`\2\2\u00e2\60\3\2\2\2\u00e3\u00e4\7=\2\2\u00e4\62"+
		"\3\2\2\2\u00e5\u00e6\7`\2\2\u00e6\u00e7\7=\2\2\u00e7\64\3\2\2\2\u00e8"+
		"\u00e9\7`\2\2\u00e9\u00ea\7`\2\2\u00ea\66\3\2\2\2\u00eb\u00ec\7`\2\2\u00ec"+
		"8\3\2\2\2\u00ed\u00ee\5;\36\2\u00ee:\3\2\2\2\u00ef\u00f0\7$\2\2\u00f0"+
		"<\3\2\2\2\u00f1\u00f2\7>\2\2\u00f2>\3\2\2\2\u00f3\u00f4\7\'\2\2\u00f4"+
		"@\3\2\2\2\u00f5\u00f6\7_\2\2\u00f6B\3\2\2\2\u00f7\u00f8\7A\2\2\u00f8D"+
		"\3\2\2\2\u00f9\u00fb\7a\2\2\u00fa\u00f9\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00fc\3\2\2\2\u00fc\u00fd\7\61\2\2\u00fdF\3\2\2\2\u00fe\u00ff\7%\2\2"+
		"\u00ffH\3\2\2\2\u0100\u0101\7.\2\2\u0101\u0102\7A\2\2\u0102J\3\2\2\2\u0103"+
		"\u0105\7.\2\2\u0104\u0106\7a\2\2\u0105\u0104\3\2\2\2\u0105\u0106\3\2\2"+
		"\2\u0106\u0107\3\2\2\2\u0107\u0108\7\61\2\2\u0108L\3\2\2\2\u0109\u010a"+
		"\7.\2\2\u010a\u010b\7%\2\2\u010bN\3\2\2\2\u010c\u010d\7.\2\2\u010d\u010e"+
		"\7.\2\2\u010e\u010f\7A\2\2\u010fP\3\2\2\2\u0110\u0111\7.\2\2\u0111\u0112"+
		"\7.\2\2\u0112\u0114\3\2\2\2\u0113\u0115\7a\2\2\u0114\u0113\3\2\2\2\u0114"+
		"\u0115\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\7\61\2\2\u0117R\3\2\2\2"+
		"\u0118\u0119\7.\2\2\u0119\u011a\7.\2\2\u011a\u011b\7%\2\2\u011bT\3\2\2"+
		"\2\u011c\u011d\7a\2\2\u011d\u011e\7A\2\2\u011eV\3\2\2\2\u011f\u0120\7"+
		"a\2\2\u0120\u0121\7%\2\2\u0121X\3\2\2\2\u0122\u0123\7@\2\2\u0123Z\3\2"+
		"\2\2\u0124\u0125\7\60\2\2\u0125\u0126\7@\2\2\u0126\\\3\2\2\2\u0127\u0128"+
		"\7\60\2\2\u0128\u0129\7\60\2\2\u0129\u012a\7@\2\2\u012a^\3\2\2\2\u012b"+
		"\u012c\7\60\2\2\u012c\u012d\7\60\2\2\u012d\u012e\7\60\2\2\u012e\u012f"+
		"\7@\2\2\u012f`\3\2\2\2\u0130\u0131\7\60\2\2\u0131\u0132\7>\2\2\u0132b"+
		"\3\2\2\2\u0133\u0134\7\60\2\2\u0134\u0135\7\60\2\2\u0135\u0136\7>\2\2"+
		"\u0136d\3\2\2\2\u0137\u0138\7\60\2\2\u0138\u0139\7\60\2\2\u0139\u013a"+
		"\7\60\2\2\u013a\u013b\7>\2\2\u013bf\3\2\2\2\u013c\u013d\7\60\2\2\u013d"+
		"\u013e\7_\2\2\u013eh\3\2\2\2\u013f\u0140\7\60\2\2\u0140\u0141\7\60\2\2"+
		"\u0141\u0142\7_\2\2\u0142j\3\2\2\2\u0143\u0144\7\60\2\2\u0144\u0145\7"+
		"\60\2\2\u0145\u0146\7\60\2\2\u0146\u0147\7_\2\2\u0147l\3\2\2\2\u0148\u0149"+
		"\7\"\2\2\u0149n\3\2\2\2\u014a\u014c\t\b\2\2\u014b\u014a\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014ep\3\2\2\2"+
		"\u014f\u0150\7.\2\2\u0150\u0151\7?\2\2\u0151r\3\2\2\2\u0152\u0160\7#\2"+
		"\2\u0153\u0155\7#\2\2\u0154\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0154"+
		"\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0161\3\2\2\2\u0158\u015d\7B\2\2\u0159"+
		"\u015a\7&\2\2\u015a\u015e\t\t\2\2\u015b\u015c\7.\2\2\u015c\u015e\7?\2"+
		"\2\u015d\u0159\3\2\2\2\u015d\u015b\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0161"+
		"\7_\2\2\u0160\u0154\3\2\2\2\u0160\u0158\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"t\3\2\2\2\26\2{\u0080\u0093\u009d\u00a1\u00ab\u00c3\u00c6\u00cb\u00ce"+
		"\u00d3\u00db\u00fa\u0105\u0114\u014d\u0156\u015d\u0160\5\3\3\2\3\4\3\3"+
		"\5\4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}