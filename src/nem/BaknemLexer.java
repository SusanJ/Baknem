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
		UC_ID=8, GREEK_LETTER=9, MISCALPHD4=10, PI_PUNC=11, PRE_PUNC=12, MISC_PUNC=13, 
		FACTORIAL=14, GENERAL_OMISSION=15, LGRP=16, RGRP=17, BINOP=18, BINOP_PREC=19, 
		INT=20, REAL=21, CMPR=22, SUBSUB=23, SUBSUP=24, SUB=25, SUPSUB=26, SUPSUP=27, 
		SUP=28, MODIF=29, MODOVER=30, MODUNDER=31, TERM=32, SFRAC=33, FRAC_SLASH=34, 
		ESFRAC=35, CFRAC=36, CSLASH=37, ECFRAC=38, HCFRAC=39, HCSLASH=40, EHCFRAC=41, 
		SMIXFR=42, EMIXFR=43, SQRT=44, SQRT1=45, SQRT2=46, SQRT3=47, IRAD1=48, 
		IRAD2=49, IRAD3=50, RTRM1=51, RTRM2=52, RTRM3=53, ARROW=54, SPACE=55, 
		NEWLINE=56, INFINITY=57, INTEGRAL=58, CHEM_ELEMENT=59, POSS_CH_ELEMENT=60, 
		CHM_ARROW=61;
	public static final int
		CHEMISTRY=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "CHEMISTRY"
	};

	public static final String[] ruleNames = {
		"GREEK_LETTERs", "NOTHING", "BLURB", "LC_ID", "LIMS", "ID", "MIXID", "ROMAN_NUMERALS", 
		"CAP_ROMAN_NUM_SEQ", "UC_ID", "GREEK_LETTER", "MISCALPHD4", "USCORE", 
		"APOS", "DOT6", "PI_PUNC", "PRE_PUNC", "MISC_PUNC", "FACTORIAL", "GENERAL_OMISSION", 
		"LGRP", "RGRP", "PLUS", "MINUS", "BSLASH", "ASTER", "BINOP", "BINOP_PREC", 
		"DEC_DIG", "DOTS46", "INT", "REAL", "CMPR", "SUBSUB", "SUBSUP", "SUB", 
		"SUPSUB", "SUPSUP", "SUP", "MODIF", "DOT5", "DOTS146", "MODOVER", "MODUNDER", 
		"TERM", "SFRAC", "FRAC_SLASH", "ESFRAC", "CFRAC", "CSLASH", "ECFRAC", 
		"HCFRAC", "HCSLASH", "EHCFRAC", "SMIXFR", "EMIXFR", "SQRT", "SQRT1", "SQRT2", 
		"SQRT3", "IRAD1", "IRAD2", "IRAD3", "RTRM1", "RTRM2", "RTRM3", "ARROW", 
		"SPACE", "NEWLINE", "INFINITY", "INTEGRAL", "CHEM_ELEMENT", "POSS_CH_ELEMENT", 
		"CHM_ARROW"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'NoThInG'", null, null, null, null, null, null, null, null, null, 
		null, null, null, "'&'", "'='", "'('", "')'", null, null, null, null, 
		null, "';;'", "';^'", "';'", "'^;'", "'^^'", "'^'", null, "'<'", null, 
		"']'", "'?'", null, "'#'", "',?'", null, "',#'", "',,?'", null, "',,#'", 
		"'_?'", "'_#'", "'>'", "'.>'", "'..>'", "'...>'", "'.<'", "'..<'", "'...<'", 
		"'.]'", "'..]'", "'...]'", null, "' '", null, "',='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NOTHING", "BLURB", "LC_ID", "LIMS", "ID", "MIXID", "CAP_ROMAN_NUM_SEQ", 
		"UC_ID", "GREEK_LETTER", "MISCALPHD4", "PI_PUNC", "PRE_PUNC", "MISC_PUNC", 
		"FACTORIAL", "GENERAL_OMISSION", "LGRP", "RGRP", "BINOP", "BINOP_PREC", 
		"INT", "REAL", "CMPR", "SUBSUB", "SUBSUP", "SUB", "SUPSUB", "SUPSUP", 
		"SUP", "MODIF", "MODOVER", "MODUNDER", "TERM", "SFRAC", "FRAC_SLASH", 
		"ESFRAC", "CFRAC", "CSLASH", "ECFRAC", "HCFRAC", "HCSLASH", "EHCFRAC", 
		"SMIXFR", "EMIXFR", "SQRT", "SQRT1", "SQRT2", "SQRT3", "IRAD1", "IRAD2", 
		"IRAD3", "RTRM1", "RTRM2", "RTRM3", "ARROW", "SPACE", "NEWLINE", "INFINITY", 
		"INTEGRAL", "CHEM_ELEMENT", "POSS_CH_ELEMENT", "CHM_ARROW"
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
		case 30:
			INT_action((RuleContext)_localctx, actionIndex);
			break;
		case 71:
			CHEM_ELEMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 72:
			POSS_CH_ELEMENT_action((RuleContext)_localctx, actionIndex);
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
	private void INT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			setType( BaknemParser.INTxGREEK);
			break;
		}
	}
	private void CHEM_ELEMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			if (!isChemicalSymbol( getText() )){
			           setType( MIXID );
			          }
			        
			break;
		}
	}
	private void POSS_CH_ELEMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			if (!isChemicalSymbol( getText() )){
			           setType( ID );
			         }
			        
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2?\u024d\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\7\4\u00a9\n\4\f\4\16\4\u00ac\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\6\5\u00b6\n\5\r\5\16\5\u00b7\3\5\3\5\3\6\7\6\u00bd\n\6\f\6\16\6"+
		"\u00c0\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7\u00cd\n\7"+
		"\3\7\5\7\u00d0\n\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\7\n\u00e1\n\n\f\n\16\n\u00e4\13\n\3\13\3\13\3\13\3\13\6\13\u00ea"+
		"\n\13\r\13\16\13\u00eb\3\f\3\f\5\f\u00f0\n\f\3\f\3\f\5\f\u00f4\n\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00fe\n\r\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\5\21\u010b\n\21\5\21\u010d\n\21\3\22\5\22"+
		"\u0110\n\22\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u0118\n\23\3\23\3\23\3"+
		"\23\3\23\3\23\5\23\u011f\n\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u0137\n\34\3\35\5\35\u013a\n\35\3\35\3\35\3\35\5\35\u013f\n\35\3"+
		"\36\3\36\3\37\3\37\3 \3 \3 \3 \3 \5 \u014a\n \3 \6 \u014d\n \r \16 \u014e"+
		"\3 \3 \5 \u0153\n \3 \5 \u0156\n \3 \3 \3 \5 \u015b\n \3!\3!\3!\3!\3!"+
		"\5!\u0162\n!\3!\6!\u0165\n!\r!\16!\u0166\3!\3!\3!\5!\u016c\n!\3!\3!\6"+
		"!\u0170\n!\r!\16!\u0171\5!\u0174\n!\3\"\3\"\5\"\u0178\n\"\3\"\3\"\3\""+
		"\3\"\5\"\u017e\n\"\3#\3#\3#\3$\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3("+
		"\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\5\60\u019f\n\60\3\60\3"+
		"\60\3\61\3\61\3\62\3\62\3\62\3\63\3\63\5\63\u01aa\n\63\3\63\3\63\3\64"+
		"\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\5\66\u01b9\n\66\3\66"+
		"\3\66\3\67\3\67\3\67\3\67\38\38\38\39\39\39\3:\3:\3;\3;\3;\3<\3<\3<\3"+
		"<\3=\3=\3=\3=\3=\3>\3>\3>\3?\3?\3?\3?\3@\3@\3@\3@\3@\3A\3A\3A\3B\3B\3"+
		"B\3B\3C\3C\3C\3C\3C\3D\3D\3D\5D\u01f0\nD\3D\3D\3D\3D\3D\3D\3D\3D\3D\3"+
		"D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u020a\nD\3E\3E\3F\6F\u020f"+
		"\nF\rF\16F\u0210\3G\3G\3G\3H\3H\6H\u0218\nH\rH\16H\u0219\3H\3H\3H\3H\3"+
		"H\5H\u0221\nH\3H\5H\u0224\nH\3I\3I\3I\3I\3I\3J\3J\3J\3J\3K\3K\3K\5K\u0232"+
		"\nK\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K"+
		"\3K\3K\5K\u024c\nK\3\u00aa\2L\4\2\6\3\b\4\n\5\f\6\16\7\20\b\22\2\24\t"+
		"\26\n\30\13\32\f\34\2\36\2 \2\"\r$\16&\17(\20*\21,\22.\23\60\2\62\2\64"+
		"\2\66\28\24:\25<\2>\2@\26B\27D\30F\31H\32J\33L\34N\35P\36R\37T\2V\2X "+
		"Z!\\\"^#`$b%d&f\'h(j)l*n+p,r-t.v/x\60z\61|\62~\63\u0080\64\u0082\65\u0084"+
		"\66\u0086\67\u00888\u008a9\u008c:\u008e;\u0090<\u0092=\u0094>\u0096?\4"+
		"\2\3\r\21\2((<<AACDFIKKNRTWY\\cdfikknrtwy|\4\2C\\c|\4\2\'\'>>\f\2EFKK"+
		"NOXXZZefkknoxxzz\5\2ccrrtu\t\2&&\62\62@@ccegjjuu\5\2\64\6688::\3\2\62"+
		";\4\2QQqq\4\2\f\f\17\17\5\2\66\66eett\2\u0278\2\6\3\2\2\2\2\b\3\2\2\2"+
		"\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\24\3\2\2\2\2\26\3"+
		"\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2("+
		"\3\2\2\2\2*\3\2\2\2\2,\3\2\2\2\2.\3\2\2\2\28\3\2\2\2\2:\3\2\2\2\2@\3\2"+
		"\2\2\2B\3\2\2\2\2D\3\2\2\2\2F\3\2\2\2\2H\3\2\2\2\2J\3\2\2\2\2L\3\2\2\2"+
		"\2N\3\2\2\2\2P\3\2\2\2\2R\3\2\2\2\2X\3\2\2\2\2Z\3\2\2\2\2\\\3\2\2\2\2"+
		"^\3\2\2\2\2`\3\2\2\2\2b\3\2\2\2\2d\3\2\2\2\2f\3\2\2\2\2h\3\2\2\2\2j\3"+
		"\2\2\2\2l\3\2\2\2\2n\3\2\2\2\2p\3\2\2\2\2r\3\2\2\2\2t\3\2\2\2\2v\3\2\2"+
		"\2\2x\3\2\2\2\2z\3\2\2\2\2|\3\2\2\2\2~\3\2\2\2\2\u0080\3\2\2\2\2\u0082"+
		"\3\2\2\2\2\u0084\3\2\2\2\2\u0086\3\2\2\2\2\u0088\3\2\2\2\2\u008a\3\2\2"+
		"\2\2\u008c\3\2\2\2\2\u008e\3\2\2\2\2\u0090\3\2\2\2\3\u0092\3\2\2\2\3\u0094"+
		"\3\2\2\2\3\u0096\3\2\2\2\4\u0098\3\2\2\2\6\u009a\3\2\2\2\b\u00a2\3\2\2"+
		"\2\n\u00b3\3\2\2\2\f\u00be\3\2\2\2\16\u00cc\3\2\2\2\20\u00d4\3\2\2\2\22"+
		"\u00d9\3\2\2\2\24\u00db\3\2\2\2\26\u00e5\3\2\2\2\30\u00ef\3\2\2\2\32\u00fd"+
		"\3\2\2\2\34\u00ff\3\2\2\2\36\u0101\3\2\2\2 \u0103\3\2\2\2\"\u0105\3\2"+
		"\2\2$\u010f\3\2\2\2&\u011e\3\2\2\2(\u0120\3\2\2\2*\u0122\3\2\2\2,\u0124"+
		"\3\2\2\2.\u0126\3\2\2\2\60\u0128\3\2\2\2\62\u012a\3\2\2\2\64\u012c\3\2"+
		"\2\2\66\u012e\3\2\2\28\u0136\3\2\2\2:\u013e\3\2\2\2<\u0140\3\2\2\2>\u0142"+
		"\3\2\2\2@\u0149\3\2\2\2B\u0161\3\2\2\2D\u0175\3\2\2\2F\u017f\3\2\2\2H"+
		"\u0182\3\2\2\2J\u0185\3\2\2\2L\u0187\3\2\2\2N\u018a\3\2\2\2P\u018d\3\2"+
		"\2\2R\u018f\3\2\2\2T\u0191\3\2\2\2V\u0193\3\2\2\2X\u0195\3\2\2\2Z\u0197"+
		"\3\2\2\2\\\u0199\3\2\2\2^\u019b\3\2\2\2`\u019e\3\2\2\2b\u01a2\3\2\2\2"+
		"d\u01a4\3\2\2\2f\u01a7\3\2\2\2h\u01ad\3\2\2\2j\u01b0\3\2\2\2l\u01b4\3"+
		"\2\2\2n\u01bc\3\2\2\2p\u01c0\3\2\2\2r\u01c3\3\2\2\2t\u01c6\3\2\2\2v\u01c8"+
		"\3\2\2\2x\u01cb\3\2\2\2z\u01cf\3\2\2\2|\u01d4\3\2\2\2~\u01d7\3\2\2\2\u0080"+
		"\u01db\3\2\2\2\u0082\u01e0\3\2\2\2\u0084\u01e3\3\2\2\2\u0086\u01e7\3\2"+
		"\2\2\u0088\u01ec\3\2\2\2\u008a\u020b\3\2\2\2\u008c\u020e\3\2\2\2\u008e"+
		"\u0212\3\2\2\2\u0090\u0215\3\2\2\2\u0092\u0225\3\2\2\2\u0094\u022a\3\2"+
		"\2\2\u0096\u022e\3\2\2\2\u0098\u0099\t\2\2\2\u0099\5\3\2\2\2\u009a\u009b"+
		"\7P\2\2\u009b\u009c\7q\2\2\u009c\u009d\7V\2\2\u009d\u009e\7j\2\2\u009e"+
		"\u009f\7K\2\2\u009f\u00a0\7p\2\2\u00a0\u00a1\7I\2\2\u00a1\7\3\2\2\2\u00a2"+
		"\u00a3\7>\2\2\u00a3\u00a4\7j\2\2\u00a4\u00a5\7\65\2\2\u00a5\u00a6\7@\2"+
		"\2\u00a6\u00aa\3\2\2\2\u00a7\u00a9\13\2\2\2\u00a8\u00a7\3\2\2\2\u00a9"+
		"\u00ac\3\2\2\2\u00aa\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ad\3\2"+
		"\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\7>\2\2\u00ae\u00af\7\61\2\2\u00af"+
		"\u00b0\7j\2\2\u00b0\u00b1\7\65\2\2\u00b1\u00b2\7@\2\2\u00b2\t\3\2\2\2"+
		"\u00b3\u00b5\t\3\2\2\u00b4\u00b6\t\3\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b7"+
		"\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00ba\b\5\2\2\u00ba\13\3\2\2\2\u00bb\u00bd\t\3\2\2\u00bc\u00bb\3\2\2"+
		"\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1"+
		"\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\t\4\2\2\u00c2\u00c3\7n\2\2\u00c3"+
		"\u00c4\7k\2\2\u00c4\u00c5\7o\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\b\6\3"+
		"\2\u00c7\r\3\2\2\2\u00c8\u00c9\7a\2\2\u00c9\u00cd\7=\2\2\u00ca\u00cb\7"+
		"\60\2\2\u00cb\u00cd\7=\2\2\u00cc\u00c8\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00d0\5 \20\2\u00cf\u00ce\3\2"+
		"\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\t\3\2\2\u00d2"+
		"\u00d3\b\7\4\2\u00d3\17\3\2\2\2\u00d4\u00d5\5 \20\2\u00d5\u00d6\t\3\2"+
		"\2\u00d6\u00d7\t\3\2\2\u00d7\u00d8\b\b\5\2\u00d8\21\3\2\2\2\u00d9\u00da"+
		"\t\5\2\2\u00da\23\3\2\2\2\u00db\u00dc\5 \20\2\u00dc\u00dd\5 \20\2\u00dd"+
		"\u00de\5\22\t\2\u00de\u00e2\5\22\t\2\u00df\u00e1\5\22\t\2\u00e0\u00df"+
		"\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\25\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\5 \20\2\u00e6\u00e7\5 \20"+
		"\2\u00e7\u00e9\t\3\2\2\u00e8\u00ea\t\3\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb"+
		"\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\27\3\2\2\2\u00ed"+
		"\u00f0\7a\2\2\u00ee\u00f0\5>\37\2\u00ef\u00ed\3\2\2\2\u00ef\u00ee\3\2"+
		"\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\5>\37\2\u00f2"+
		"\u00f4\5 \20\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\3\2"+
		"\2\2\u00f5\u00f6\5\4\2\2\u00f6\31\3\2\2\2\u00f7\u00f8\7B\2\2\u00f8\u00f9"+
		"\7.\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fe\t\6\2\2\u00fb\u00fc\7B\2\2\u00fc"+
		"\u00fe\t\7\2\2\u00fd\u00f7\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\33\3\2\2"+
		"\2\u00ff\u0100\7a\2\2\u0100\35\3\2\2\2\u0101\u0102\7)\2\2\u0102\37\3\2"+
		"\2\2\u0103\u0104\7.\2\2\u0104!\3\2\2\2\u0105\u010c\5\34\16\2\u0106\u010d"+
		"\5\36\17\2\u0107\u010d\t\b\2\2\u0108\u010a\7\62\2\2\u0109\u010b\5\36\17"+
		"\2\u010a\u0109\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d\3\2\2\2\u010c\u0106"+
		"\3\2\2\2\u010c\u0107\3\2\2\2\u010c\u0108\3\2\2\2\u010d#\3\2\2\2\u010e"+
		"\u0110\5 \20\2\u010f\u010e\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\3\2"+
		"\2\2\u0111\u0112\7:\2\2\u0112%\3\2\2\2\u0113\u0114\7/\2\2\u0114\u0115"+
		"\7/\2\2\u0115\u0118\7/\2\2\u0116\u0118\7/\2\2\u0117\u0113\3\2\2\2\u0117"+
		"\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011f\7/\2\2\u011a\u011b\5\36"+
		"\17\2\u011b\u011c\5\36\17\2\u011c\u011d\5\36\17\2\u011d\u011f\3\2\2\2"+
		"\u011e\u0117\3\2\2\2\u011e\u011a\3\2\2\2\u011f\'\3\2\2\2\u0120\u0121\7"+
		"(\2\2\u0121)\3\2\2\2\u0122\u0123\7?\2\2\u0123+\3\2\2\2\u0124\u0125\7*"+
		"\2\2\u0125-\3\2\2\2\u0126\u0127\7+\2\2\u0127/\3\2\2\2\u0128\u0129\7-\2"+
		"\2\u0129\61\3\2\2\2\u012a\u012b\7/\2\2\u012b\63\3\2\2\2\u012c\u012d\7"+
		"^\2\2\u012d\65\3\2\2\2\u012e\u012f\7,\2\2\u012f\67\3\2\2\2\u0130\u0137"+
		"\5\60\30\2\u0131\u0137\5\62\31\2\u0132\u0133\5\60\30\2\u0133\u0134\5T"+
		"*\2\u0134\u0135\5\62\31\2\u0135\u0137\3\2\2\2\u0136\u0130\3\2\2\2\u0136"+
		"\u0131\3\2\2\2\u0136\u0132\3\2\2\2\u01379\3\2\2\2\u0138\u013a\7B\2\2\u0139"+
		"\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013f\5\66"+
		"\33\2\u013c\u013d\7\60\2\2\u013d\u013f\7\61\2\2\u013e\u0139\3\2\2\2\u013e"+
		"\u013c\3\2\2\2\u013f;\3\2\2\2\u0140\u0141\t\t\2\2\u0141=\3\2\2\2\u0142"+
		"\u0143\7\60\2\2\u0143?\3\2\2\2\u0144\u0145\7a\2\2\u0145\u014a\7%\2\2\u0146"+
		"\u0147\7\60\2\2\u0147\u014a\7%\2\2\u0148\u014a\7%\2\2\u0149\u0144\3\2"+
		"\2\2\u0149\u0146\3\2\2\2\u0149\u0148\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"\u014c\3\2\2\2\u014b\u014d\5<\36\2\u014c\u014b\3\2\2\2\u014d\u014e\3\2"+
		"\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u015a\3\2\2\2\u0150"+
		"\u0152\5>\37\2\u0151\u0153\5>\37\2\u0152\u0151\3\2\2\2\u0152\u0153\3\2"+
		"\2\2\u0153\u0155\3\2\2\2\u0154\u0156\5 \20\2\u0155\u0154\3\2\2\2\u0155"+
		"\u0156\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\5\4\2\2\u0158\u0159\b "+
		"\6\2\u0159\u015b\3\2\2\2\u015a\u0150\3\2\2\2\u015a\u015b\3\2\2\2\u015b"+
		"A\3\2\2\2\u015c\u015d\7a\2\2\u015d\u0162\7%\2\2\u015e\u015f\7\60\2\2\u015f"+
		"\u0162\7%\2\2\u0160\u0162\7%\2\2\u0161\u015c\3\2\2\2\u0161\u015e\3\2\2"+
		"\2\u0161\u0160\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0173\3\2\2\2\u0163\u0165"+
		"\5<\36\2\u0164\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0164\3\2\2\2\u0166"+
		"\u0167\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016b\5>\37\2\u0169\u016c\5T"+
		"*\2\u016a\u016c\5<\36\2\u016b\u0169\3\2\2\2\u016b\u016a\3\2\2\2\u016c"+
		"\u0174\3\2\2\2\u016d\u016f\5>\37\2\u016e\u0170\5<\36\2\u016f\u016e\3\2"+
		"\2\2\u0170\u0171\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172"+
		"\u0174\3\2\2\2\u0173\u0164\3\2\2\2\u0173\u016d\3\2\2\2\u0174C\3\2\2\2"+
		"\u0175\u0177\7\"\2\2\u0176\u0178\7\61\2\2\u0177\u0176\3\2\2\2\u0177\u0178"+
		"\3\2\2\2\u0178\u017d\3\2\2\2\u0179\u017a\7\60\2\2\u017a\u017e\7m\2\2\u017b"+
		"\u017c\7\60\2\2\u017c\u017e\7M\2\2\u017d\u0179\3\2\2\2\u017d\u017b\3\2"+
		"\2\2\u017eE\3\2\2\2\u017f\u0180\7=\2\2\u0180\u0181\7=\2\2\u0181G\3\2\2"+
		"\2\u0182\u0183\7=\2\2\u0183\u0184\7`\2\2\u0184I\3\2\2\2\u0185\u0186\7"+
		"=\2\2\u0186K\3\2\2\2\u0187\u0188\7`\2\2\u0188\u0189\7=\2\2\u0189M\3\2"+
		"\2\2\u018a\u018b\7`\2\2\u018b\u018c\7`\2\2\u018cO\3\2\2\2\u018d\u018e"+
		"\7`\2\2\u018eQ\3\2\2\2\u018f\u0190\5T*\2\u0190S\3\2\2\2\u0191\u0192\7"+
		"$\2\2\u0192U\3\2\2\2\u0193\u0194\7\'\2\2\u0194W\3\2\2\2\u0195\u0196\7"+
		">\2\2\u0196Y\3\2\2\2\u0197\u0198\5V+\2\u0198[\3\2\2\2\u0199\u019a\7_\2"+
		"\2\u019a]\3\2\2\2\u019b\u019c\7A\2\2\u019c_\3\2\2\2\u019d\u019f\7a\2\2"+
		"\u019e\u019d\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1"+
		"\7\61\2\2\u01a1a\3\2\2\2\u01a2\u01a3\7%\2\2\u01a3c\3\2\2\2\u01a4\u01a5"+
		"\7.\2\2\u01a5\u01a6\7A\2\2\u01a6e\3\2\2\2\u01a7\u01a9\7.\2\2\u01a8\u01aa"+
		"\7a\2\2\u01a9\u01a8\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab"+
		"\u01ac\7\61\2\2\u01acg\3\2\2\2\u01ad\u01ae\7.\2\2\u01ae\u01af\7%\2\2\u01af"+
		"i\3\2\2\2\u01b0\u01b1\7.\2\2\u01b1\u01b2\7.\2\2\u01b2\u01b3\7A\2\2\u01b3"+
		"k\3\2\2\2\u01b4\u01b5\7.\2\2\u01b5\u01b6\7.\2\2\u01b6\u01b8\3\2\2\2\u01b7"+
		"\u01b9\7a\2\2\u01b8\u01b7\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba\3\2"+
		"\2\2\u01ba\u01bb\7\61\2\2\u01bbm\3\2\2\2\u01bc\u01bd\7.\2\2\u01bd\u01be"+
		"\7.\2\2\u01be\u01bf\7%\2\2\u01bfo\3\2\2\2\u01c0\u01c1\7a\2\2\u01c1\u01c2"+
		"\7A\2\2\u01c2q\3\2\2\2\u01c3\u01c4\7a\2\2\u01c4\u01c5\7%\2\2\u01c5s\3"+
		"\2\2\2\u01c6\u01c7\7@\2\2\u01c7u\3\2\2\2\u01c8\u01c9\7\60\2\2\u01c9\u01ca"+
		"\7@\2\2\u01caw\3\2\2\2\u01cb\u01cc\7\60\2\2\u01cc\u01cd\7\60\2\2\u01cd"+
		"\u01ce\7@\2\2\u01cey\3\2\2\2\u01cf\u01d0\7\60\2\2\u01d0\u01d1\7\60\2\2"+
		"\u01d1\u01d2\7\60\2\2\u01d2\u01d3\7@\2\2\u01d3{\3\2\2\2\u01d4\u01d5\7"+
		"\60\2\2\u01d5\u01d6\7>\2\2\u01d6}\3\2\2\2\u01d7\u01d8\7\60\2\2\u01d8\u01d9"+
		"\7\60\2\2\u01d9\u01da\7>\2\2\u01da\177\3\2\2\2\u01db\u01dc\7\60\2\2\u01dc"+
		"\u01dd\7\60\2\2\u01dd\u01de\7\60\2\2\u01de\u01df\7>\2\2\u01df\u0081\3"+
		"\2\2\2\u01e0\u01e1\7\60\2\2\u01e1\u01e2\7_\2\2\u01e2\u0083\3\2\2\2\u01e3"+
		"\u01e4\7\60\2\2\u01e4\u01e5\7\60\2\2\u01e5\u01e6\7_\2\2\u01e6\u0085\3"+
		"\2\2\2\u01e7\u01e8\7\60\2\2\u01e8\u01e9\7\60\2\2\u01e9\u01ea\7\60\2\2"+
		"\u01ea\u01eb\7_\2\2\u01eb\u0087\3\2\2\2\u01ec\u0209\7&\2\2\u01ed\u01ee"+
		"\7/\2\2\u01ee\u01f0\7/\2\2\u01ef\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0"+
		"\u01f1\3\2\2\2\u01f1\u020a\t\n\2\2\u01f2\u01f3\7]\2\2\u01f3\u01f4\7/\2"+
		"\2\u01f4\u020a\7/\2\2\u01f5\u01f6\7]\2\2\u01f6\u01f7\7/\2\2\u01f7\u01f8"+
		"\7/\2\2\u01f8\u01f9\3\2\2\2\u01f9\u020a\t\n\2\2\u01fa\u01fb\7>\2\2\u01fb"+
		"\u01fc\7/\2\2\u01fc\u01fd\7/\2\2\u01fd\u01fe\3\2\2\2\u01fe\u020a\t\n\2"+
		"\2\u01ff\u0200\7\'\2\2\u0200\u0201\7/\2\2\u0201\u0202\7/\2\2\u0202\u0203"+
		"\3\2\2\2\u0203\u020a\t\n\2\2\u0204\u0205\7]\2\2\u0205\u0206\7/\2\2\u0206"+
		"\u0207\7/\2\2\u0207\u0208\3\2\2\2\u0208\u020a\t\n\2\2\u0209\u01ef\3\2"+
		"\2\2\u0209\u01f2\3\2\2\2\u0209\u01f5\3\2\2\2\u0209\u01fa\3\2\2\2\u0209"+
		"\u01ff\3\2\2\2\u0209\u0204\3\2\2\2\u020a\u0089\3\2\2\2\u020b\u020c\7\""+
		"\2\2\u020c\u008b\3\2\2\2\u020d\u020f\t\13\2\2\u020e\u020d\3\2\2\2\u020f"+
		"\u0210\3\2\2\2\u0210\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u008d\3\2"+
		"\2\2\u0212\u0213\7.\2\2\u0213\u0214\7?\2\2\u0214\u008f\3\2\2\2\u0215\u0223"+
		"\7#\2\2\u0216\u0218\7#\2\2\u0217\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219"+
		"\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u0224\3\2\2\2\u021b\u0220\7B"+
		"\2\2\u021c\u021d\7&\2\2\u021d\u0221\t\f\2\2\u021e\u021f\7.\2\2\u021f\u0221"+
		"\7?\2\2\u0220\u021c\3\2\2\2\u0220\u021e\3\2\2\2\u0221\u0222\3\2\2\2\u0222"+
		"\u0224\7_\2\2\u0223\u0217\3\2\2\2\u0223\u021b\3\2\2\2\u0223\u0224\3\2"+
		"\2\2\u0224\u0091\3\2\2\2\u0225\u0226\5 \20\2\u0226\u0227\t\3\2\2\u0227"+
		"\u0228\t\3\2\2\u0228\u0229\bI\7\2\u0229\u0093\3\2\2\2\u022a\u022b\5 \20"+
		"\2\u022b\u022c\t\3\2\2\u022c\u022d\bJ\b\2\u022d\u0095\3\2\2\2\u022e\u024b"+
		"\7&\2\2\u022f\u0230\7/\2\2\u0230\u0232\7/\2\2\u0231\u022f\3\2\2\2\u0231"+
		"\u0232\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u024c\t\n\2\2\u0234\u0235\7]"+
		"\2\2\u0235\u0236\7/\2\2\u0236\u024c\7/\2\2\u0237\u0238\7]\2\2\u0238\u0239"+
		"\7/\2\2\u0239\u023a\7/\2\2\u023a\u023b\3\2\2\2\u023b\u024c\t\n\2\2\u023c"+
		"\u023d\7>\2\2\u023d\u023e\7/\2\2\u023e\u023f\7/\2\2\u023f\u0240\3\2\2"+
		"\2\u0240\u024c\t\n\2\2\u0241\u0242\7\'\2\2\u0242\u0243\7/\2\2\u0243\u0244"+
		"\7/\2\2\u0244\u0245\3\2\2\2\u0245\u024c\t\n\2\2\u0246\u0247\7]\2\2\u0247"+
		"\u0248\7/\2\2\u0248\u0249\7/\2\2\u0249\u024a\3\2\2\2\u024a\u024c\t\n\2"+
		"\2\u024b\u0231\3\2\2\2\u024b\u0234\3\2\2\2\u024b\u0237\3\2\2\2\u024b\u023c"+
		"\3\2\2\2\u024b\u0241\3\2\2\2\u024b\u0246\3\2\2\2\u024c\u0097\3\2\2\2-"+
		"\2\3\u00aa\u00b7\u00be\u00cc\u00cf\u00e2\u00eb\u00ef\u00f3\u00fd\u010a"+
		"\u010c\u010f\u0117\u011e\u0136\u0139\u013e\u0149\u014e\u0152\u0155\u015a"+
		"\u0161\u0166\u016b\u0171\u0173\u0177\u017d\u019e\u01a9\u01b8\u01ef\u0209"+
		"\u0210\u0219\u0220\u0223\u0231\u024b\t\3\5\2\3\6\3\3\7\4\3\b\5\3 \6\3"+
		"I\7\3J\b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}