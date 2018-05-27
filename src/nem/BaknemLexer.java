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
		NOTHING=1, BLURB=2, LC_ID=3, LIMS=4, ID=5, MIXID=6, CAP_ROMAN_NUM_SEQ=7, 
		UC_ID=8, GREEK_LETTER=9, MISCALPHD46=10, FACTORIAL=11, GENERAL_OMISSION=12, 
		LGRP=13, RGRP=14, BINOP=15, BINOP_PREC=16, INT=17, CMPR=18, SUBSUB=19, 
		SUBSUP=20, SUB=21, SUPSUB=22, SUPSUP=23, SUP=24, MODIF=25, MODOVER=26, 
		MODUNDER=27, TERM=28, SFRAC=29, FRAC_SLASH=30, ESFRAC=31, CFRAC=32, CSLASH=33, 
		ECFRAC=34, HCFRAC=35, HCSLASH=36, EHCFRAC=37, SMIXFR=38, EMIXFR=39, SQRT=40, 
		SQRT1=41, SQRT2=42, SQRT3=43, IRAD1=44, IRAD2=45, IRAD3=46, RTRM1=47, 
		RTRM2=48, RTRM3=49, SPACE=50, NEWLINE=51, INFINITY=52, INTEGRAL=53;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"GREEK_LETTERs", "NOTHING", "BLURB", "LC_ID", "LIMS", "ID", "MIXID", "ROMAN_NUMERALS", 
		"CAP_ROMAN_NUM_SEQ", "UC_ID", "GREEK_LETTER", "MISCALPHD46", "FACTORIAL", 
		"GENERAL_OMISSION", "LGRP", "RGRP", "PLUS", "MINUS", "BSLASH", "ASTER", 
		"BINOP", "BINOP_PREC", "INT", "CMPR", "SUBSUB", "SUBSUP", "SUB", "SUPSUB", 
		"SUPSUP", "SUP", "MODIF", "DOT5", "DOTS146", "MODOVER", "MODUNDER", "TERM", 
		"SFRAC", "FRAC_SLASH", "ESFRAC", "CFRAC", "CSLASH", "ECFRAC", "HCFRAC", 
		"HCSLASH", "EHCFRAC", "SMIXFR", "EMIXFR", "SQRT", "SQRT1", "SQRT2", "SQRT3", 
		"IRAD1", "IRAD2", "IRAD3", "RTRM1", "RTRM2", "RTRM3", "SPACE", "NEWLINE", 
		"INFINITY", "INTEGRAL"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'NoThInG'", null, null, null, null, null, null, null, null, null, 
		"'&'", "'='", "'('", "')'", null, null, null, null, "';;'", "';^'", "';'", 
		"'^;'", "'^^'", "'^'", null, "'<'", null, "']'", "'?'", null, "'#'", "',?'", 
		null, "',#'", "',,?'", null, "',,#'", "'_?'", "'_#'", "'>'", "'.>'", "'..>'", 
		"'...>'", "'.<'", "'..<'", "'...<'", "'.]'", "'..]'", "'...]'", "' '", 
		null, "',='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NOTHING", "BLURB", "LC_ID", "LIMS", "ID", "MIXID", "CAP_ROMAN_NUM_SEQ", 
		"UC_ID", "GREEK_LETTER", "MISCALPHD46", "FACTORIAL", "GENERAL_OMISSION", 
		"LGRP", "RGRP", "BINOP", "BINOP_PREC", "INT", "CMPR", "SUBSUB", "SUBSUP", 
		"SUB", "SUPSUB", "SUPSUP", "SUP", "MODIF", "MODOVER", "MODUNDER", "TERM", 
		"SFRAC", "FRAC_SLASH", "ESFRAC", "CFRAC", "CSLASH", "ECFRAC", "HCFRAC", 
		"HCSLASH", "EHCFRAC", "SMIXFR", "EMIXFR", "SQRT", "SQRT1", "SQRT2", "SQRT3", 
		"IRAD1", "IRAD2", "IRAD3", "RTRM1", "RTRM2", "RTRM3", "SPACE", "NEWLINE", 
		"INFINITY", "INTEGRAL"
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
		case 3:
			LC_ID_action((RuleContext)_localctx, actionIndex);
			break;
		case 4:
			LIMS_action((RuleContext)_localctx, actionIndex);
			break;
		case 5:
			ID_action((RuleContext)_localctx, actionIndex);
			break;
		case 6:
			MIXID_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void LC_ID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			  if (isFunAbbr( getText() )){
			             setType( BaknemParser.FUN_ABBR );
			            } else if (isTrailFA( getText() )){ 
			             setType( BaknemParser.TRAIL_FUN_ABBR );
			            }
			         
			break;
		}
	}
	private void LIMS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			    if (isFunAbbr( getText() )){
			             setType( BaknemParser.FUN_ABBR );
			            } else if (isTrailFA( getText() )){ 
			             setType( BaknemParser.TRAIL_FUN_ABBR );
			            }
			       
			break;
		}
	}
	private void ID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			if (isChemicalSymbol( getText() )){
			           setType( BaknemParser.POSS_CH_ELEMENT);
			         }
			        
			break;
		}
	}
	private void MIXID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			if (isChemicalSymbol( getText() )){
			           setType( BaknemParser.CHEM_ELEMENT);
			         }
			        
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\67\u0192\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\7\4\u008e\n\4\f\4\16\4\u0091\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\6"+
		"\5\u009b\n\5\r\5\16\5\u009c\3\5\3\5\3\6\7\6\u00a2\n\6\f\6\16\6\u00a5\13"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\5\7\u00af\n\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\7\n\u00c0\n\n\f\n\16\n\u00c3\13"+
		"\n\3\13\3\13\3\13\3\13\3\13\6\13\u00ca\n\13\r\13\16\13\u00cb\3\f\3\f\5"+
		"\f\u00d0\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00da\n\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\5\26\u00f2\n\26\3\27\5\27\u00f5\n\27\3\27"+
		"\3\27\3\27\5\27\u00fa\n\27\3\30\5\30\u00fd\n\30\3\30\6\30\u0100\n\30\r"+
		"\30\16\30\u0101\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u010a\n\31\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37"+
		"\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\5\'\u012b\n\'\3\'\3\'"+
		"\3(\3(\3)\3)\3)\3*\3*\5*\u0136\n*\3*\3*\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-"+
		"\3-\5-\u0145\n-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3"+
		"\62\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3"+
		"\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38\38\39\39\39\39"+
		"\3:\3:\3:\3:\3:\3;\3;\3<\6<\u017c\n<\r<\16<\u017d\3=\3=\3=\3>\3>\6>\u0185"+
		"\n>\r>\16>\u0186\3>\3>\3>\3>\3>\5>\u018e\n>\3>\5>\u0191\n>\3\u008f\2?"+
		"\3\2\5\3\7\4\t\5\13\6\r\7\17\b\21\2\23\t\25\n\27\13\31\f\33\r\35\16\37"+
		"\17!\20#\2%\2\'\2)\2+\21-\22/\23\61\24\63\25\65\26\67\279\30;\31=\32?"+
		"\33A\2C\2E\34G\35I\36K\37M O!Q\"S#U$W%Y&[\'](_)a*c+e,g-i.k/m\60o\61q\62"+
		"s\63u\64w\65y\66{\67\3\2\13\21\2((<<AACDFIKKNRTWY\\cdfikknrtwy|\4\2C\\"+
		"c|\4\2\'\'>>\f\2EFKKNOXXZZefkknoxxzz\5\2ccrrtu\t\2&&\62\62@@ccegjjuu\3"+
		"\2\62;\4\2\f\f\17\17\5\2\66\66eett\2\u01a0\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3"+
		"\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2"+
		"\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2"+
		"k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3"+
		"\2\2\2\2y\3\2\2\2\2{\3\2\2\2\3}\3\2\2\2\5\177\3\2\2\2\7\u0087\3\2\2\2"+
		"\t\u0098\3\2\2\2\13\u00a3\3\2\2\2\r\u00ae\3\2\2\2\17\u00b3\3\2\2\2\21"+
		"\u00b8\3\2\2\2\23\u00ba\3\2\2\2\25\u00c4\3\2\2\2\27\u00cd\3\2\2\2\31\u00d9"+
		"\3\2\2\2\33\u00db\3\2\2\2\35\u00dd\3\2\2\2\37\u00df\3\2\2\2!\u00e1\3\2"+
		"\2\2#\u00e3\3\2\2\2%\u00e5\3\2\2\2\'\u00e7\3\2\2\2)\u00e9\3\2\2\2+\u00f1"+
		"\3\2\2\2-\u00f9\3\2\2\2/\u00fc\3\2\2\2\61\u0109\3\2\2\2\63\u010b\3\2\2"+
		"\2\65\u010e\3\2\2\2\67\u0111\3\2\2\29\u0113\3\2\2\2;\u0116\3\2\2\2=\u0119"+
		"\3\2\2\2?\u011b\3\2\2\2A\u011d\3\2\2\2C\u011f\3\2\2\2E\u0121\3\2\2\2G"+
		"\u0123\3\2\2\2I\u0125\3\2\2\2K\u0127\3\2\2\2M\u012a\3\2\2\2O\u012e\3\2"+
		"\2\2Q\u0130\3\2\2\2S\u0133\3\2\2\2U\u0139\3\2\2\2W\u013c\3\2\2\2Y\u0140"+
		"\3\2\2\2[\u0148\3\2\2\2]\u014c\3\2\2\2_\u014f\3\2\2\2a\u0152\3\2\2\2c"+
		"\u0154\3\2\2\2e\u0157\3\2\2\2g\u015b\3\2\2\2i\u0160\3\2\2\2k\u0163\3\2"+
		"\2\2m\u0167\3\2\2\2o\u016c\3\2\2\2q\u016f\3\2\2\2s\u0173\3\2\2\2u\u0178"+
		"\3\2\2\2w\u017b\3\2\2\2y\u017f\3\2\2\2{\u0182\3\2\2\2}~\t\2\2\2~\4\3\2"+
		"\2\2\177\u0080\7P\2\2\u0080\u0081\7q\2\2\u0081\u0082\7V\2\2\u0082\u0083"+
		"\7j\2\2\u0083\u0084\7K\2\2\u0084\u0085\7p\2\2\u0085\u0086\7I\2\2\u0086"+
		"\6\3\2\2\2\u0087\u0088\7>\2\2\u0088\u0089\7j\2\2\u0089\u008a\7\65\2\2"+
		"\u008a\u008b\7@\2\2\u008b\u008f\3\2\2\2\u008c\u008e\13\2\2\2\u008d\u008c"+
		"\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090"+
		"\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\7>\2\2\u0093\u0094\7\61"+
		"\2\2\u0094\u0095\7j\2\2\u0095\u0096\7\65\2\2\u0096\u0097\7@\2\2\u0097"+
		"\b\3\2\2\2\u0098\u009a\t\3\2\2\u0099\u009b\t\3\2\2\u009a\u0099\3\2\2\2"+
		"\u009b\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e"+
		"\3\2\2\2\u009e\u009f\b\5\2\2\u009f\n\3\2\2\2\u00a0\u00a2\t\3\2\2\u00a1"+
		"\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2"+
		"\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\t\4\2\2\u00a7"+
		"\u00a8\7n\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7o\2\2\u00aa\u00ab\3\2\2"+
		"\2\u00ab\u00ac\b\6\3\2\u00ac\f\3\2\2\2\u00ad\u00af\7.\2\2\u00ae\u00ad"+
		"\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\t\3\2\2\u00b1"+
		"\u00b2\b\7\4\2\u00b2\16\3\2\2\2\u00b3\u00b4\7.\2\2\u00b4\u00b5\t\3\2\2"+
		"\u00b5\u00b6\t\3\2\2\u00b6\u00b7\b\b\5\2\u00b7\20\3\2\2\2\u00b8\u00b9"+
		"\t\5\2\2\u00b9\22\3\2\2\2\u00ba\u00bb\7.\2\2\u00bb\u00bc\7.\2\2\u00bc"+
		"\u00bd\5\21\t\2\u00bd\u00c1\5\21\t\2\u00be\u00c0\5\21\t\2\u00bf\u00be"+
		"\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\24\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\7.\2\2\u00c5\u00c6\7.\2\2"+
		"\u00c6\u00c7\3\2\2\2\u00c7\u00c9\t\3\2\2\u00c8\u00ca\t\3\2\2\u00c9\u00c8"+
		"\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\26\3\2\2\2\u00cd\u00cf\7\60\2\2\u00ce\u00d0\7.\2\2\u00cf\u00ce\3\2\2"+
		"\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\5\3\2\2\u00d2\30"+
		"\3\2\2\2\u00d3\u00d4\7B\2\2\u00d4\u00d5\7.\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\u00da\t\6\2\2\u00d7\u00d8\7B\2\2\u00d8\u00da\t\7\2\2\u00d9\u00d3\3\2"+
		"\2\2\u00d9\u00d7\3\2\2\2\u00da\32\3\2\2\2\u00db\u00dc\7(\2\2\u00dc\34"+
		"\3\2\2\2\u00dd\u00de\7?\2\2\u00de\36\3\2\2\2\u00df\u00e0\7*\2\2\u00e0"+
		" \3\2\2\2\u00e1\u00e2\7+\2\2\u00e2\"\3\2\2\2\u00e3\u00e4\7-\2\2\u00e4"+
		"$\3\2\2\2\u00e5\u00e6\7/\2\2\u00e6&\3\2\2\2\u00e7\u00e8\7^\2\2\u00e8("+
		"\3\2\2\2\u00e9\u00ea\7,\2\2\u00ea*\3\2\2\2\u00eb\u00f2\5#\22\2\u00ec\u00f2"+
		"\5%\23\2\u00ed\u00ee\5#\22\2\u00ee\u00ef\5A!\2\u00ef\u00f0\5%\23\2\u00f0"+
		"\u00f2\3\2\2\2\u00f1\u00eb\3\2\2\2\u00f1\u00ec\3\2\2\2\u00f1\u00ed\3\2"+
		"\2\2\u00f2,\3\2\2\2\u00f3\u00f5\7B\2\2\u00f4\u00f3\3\2\2\2\u00f4\u00f5"+
		"\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00fa\5)\25\2\u00f7\u00f8\7\60\2\2"+
		"\u00f8\u00fa\7\61\2\2\u00f9\u00f4\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa.\3"+
		"\2\2\2\u00fb\u00fd\7%\2\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u00ff\3\2\2\2\u00fe\u0100\t\b\2\2\u00ff\u00fe\3\2\2\2\u0100\u0101\3\2"+
		"\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\60\3\2\2\2\u0103\u0104"+
		"\7\"\2\2\u0104\u0105\7\60\2\2\u0105\u010a\7m\2\2\u0106\u0107\7\"\2\2\u0107"+
		"\u0108\7\60\2\2\u0108\u010a\7M\2\2\u0109\u0103\3\2\2\2\u0109\u0106\3\2"+
		"\2\2\u010a\62\3\2\2\2\u010b\u010c\7=\2\2\u010c\u010d\7=\2\2\u010d\64\3"+
		"\2\2\2\u010e\u010f\7=\2\2\u010f\u0110\7`\2\2\u0110\66\3\2\2\2\u0111\u0112"+
		"\7=\2\2\u01128\3\2\2\2\u0113\u0114\7`\2\2\u0114\u0115\7=\2\2\u0115:\3"+
		"\2\2\2\u0116\u0117\7`\2\2\u0117\u0118\7`\2\2\u0118<\3\2\2\2\u0119\u011a"+
		"\7`\2\2\u011a>\3\2\2\2\u011b\u011c\5A!\2\u011c@\3\2\2\2\u011d\u011e\7"+
		"$\2\2\u011eB\3\2\2\2\u011f\u0120\7\'\2\2\u0120D\3\2\2\2\u0121\u0122\7"+
		">\2\2\u0122F\3\2\2\2\u0123\u0124\5C\"\2\u0124H\3\2\2\2\u0125\u0126\7_"+
		"\2\2\u0126J\3\2\2\2\u0127\u0128\7A\2\2\u0128L\3\2\2\2\u0129\u012b\7a\2"+
		"\2\u012a\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d"+
		"\7\61\2\2\u012dN\3\2\2\2\u012e\u012f\7%\2\2\u012fP\3\2\2\2\u0130\u0131"+
		"\7.\2\2\u0131\u0132\7A\2\2\u0132R\3\2\2\2\u0133\u0135\7.\2\2\u0134\u0136"+
		"\7a\2\2\u0135\u0134\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\3\2\2\2\u0137"+
		"\u0138\7\61\2\2\u0138T\3\2\2\2\u0139\u013a\7.\2\2\u013a\u013b\7%\2\2\u013b"+
		"V\3\2\2\2\u013c\u013d\7.\2\2\u013d\u013e\7.\2\2\u013e\u013f\7A\2\2\u013f"+
		"X\3\2\2\2\u0140\u0141\7.\2\2\u0141\u0142\7.\2\2\u0142\u0144\3\2\2\2\u0143"+
		"\u0145\7a\2\2\u0144\u0143\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\3\2"+
		"\2\2\u0146\u0147\7\61\2\2\u0147Z\3\2\2\2\u0148\u0149\7.\2\2\u0149\u014a"+
		"\7.\2\2\u014a\u014b\7%\2\2\u014b\\\3\2\2\2\u014c\u014d\7a\2\2\u014d\u014e"+
		"\7A\2\2\u014e^\3\2\2\2\u014f\u0150\7a\2\2\u0150\u0151\7%\2\2\u0151`\3"+
		"\2\2\2\u0152\u0153\7@\2\2\u0153b\3\2\2\2\u0154\u0155\7\60\2\2\u0155\u0156"+
		"\7@\2\2\u0156d\3\2\2\2\u0157\u0158\7\60\2\2\u0158\u0159\7\60\2\2\u0159"+
		"\u015a\7@\2\2\u015af\3\2\2\2\u015b\u015c\7\60\2\2\u015c\u015d\7\60\2\2"+
		"\u015d\u015e\7\60\2\2\u015e\u015f\7@\2\2\u015fh\3\2\2\2\u0160\u0161\7"+
		"\60\2\2\u0161\u0162\7>\2\2\u0162j\3\2\2\2\u0163\u0164\7\60\2\2\u0164\u0165"+
		"\7\60\2\2\u0165\u0166\7>\2\2\u0166l\3\2\2\2\u0167\u0168\7\60\2\2\u0168"+
		"\u0169\7\60\2\2\u0169\u016a\7\60\2\2\u016a\u016b\7>\2\2\u016bn\3\2\2\2"+
		"\u016c\u016d\7\60\2\2\u016d\u016e\7_\2\2\u016ep\3\2\2\2\u016f\u0170\7"+
		"\60\2\2\u0170\u0171\7\60\2\2\u0171\u0172\7_\2\2\u0172r\3\2\2\2\u0173\u0174"+
		"\7\60\2\2\u0174\u0175\7\60\2\2\u0175\u0176\7\60\2\2\u0176\u0177\7_\2\2"+
		"\u0177t\3\2\2\2\u0178\u0179\7\"\2\2\u0179v\3\2\2\2\u017a\u017c\t\t\2\2"+
		"\u017b\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e"+
		"\3\2\2\2\u017ex\3\2\2\2\u017f\u0180\7.\2\2\u0180\u0181\7?\2\2\u0181z\3"+
		"\2\2\2\u0182\u0190\7#\2\2\u0183\u0185\7#\2\2\u0184\u0183\3\2\2\2\u0185"+
		"\u0186\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0191\3\2"+
		"\2\2\u0188\u018d\7B\2\2\u0189\u018a\7&\2\2\u018a\u018e\t\n\2\2\u018b\u018c"+
		"\7.\2\2\u018c\u018e\7?\2\2\u018d\u0189\3\2\2\2\u018d\u018b\3\2\2\2\u018e"+
		"\u018f\3\2\2\2\u018f\u0191\7_\2\2\u0190\u0184\3\2\2\2\u0190\u0188\3\2"+
		"\2\2\u0190\u0191\3\2\2\2\u0191|\3\2\2\2\30\2\u008f\u009c\u00a3\u00ae\u00c1"+
		"\u00cb\u00cf\u00d9\u00f1\u00f4\u00f9\u00fc\u0101\u0109\u012a\u0135\u0144"+
		"\u017d\u0186\u018d\u0190\6\3\5\2\3\6\3\3\7\4\3\b\5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}