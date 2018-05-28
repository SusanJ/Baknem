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
	private void CHEM_ELEMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			if (!isChemicalSymbol( getText() )){
			           setType( MIXID );
			          }
			        
			break;
		}
	}
	private void POSS_CH_ELEMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			if (!isChemicalSymbol( getText() )){
			           setType( ID );
			         }
			        
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2?\u0240\b\1\b\1\4"+
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
		"\n\13\r\13\16\13\u00eb\3\f\5\f\u00ef\n\f\3\f\3\f\5\f\u00f3\n\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00fd\n\r\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\5\21\u010a\n\21\5\21\u010c\n\21\3\22\5\22\u010f"+
		"\n\22\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u0117\n\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u011e\n\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0136"+
		"\n\34\3\35\5\35\u0139\n\35\3\35\3\35\3\35\5\35\u013e\n\35\3\36\3\36\3"+
		"\37\3\37\3 \3 \3 \3 \3 \5 \u0149\n \3 \6 \u014c\n \r \16 \u014d\3!\3!"+
		"\3!\3!\3!\5!\u0155\n!\3!\6!\u0158\n!\r!\16!\u0159\3!\3!\7!\u015e\n!\f"+
		"!\16!\u0161\13!\3!\3!\6!\u0165\n!\r!\16!\u0166\5!\u0169\n!\3\"\3\"\3\""+
		"\3\"\3\"\3\"\5\"\u0171\n\"\3#\3#\3#\3$\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3"+
		"\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\5\60\u0192\n\60"+
		"\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\63\3\63\5\63\u019d\n\63\3\63\3\63"+
		"\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\5\66\u01ac\n\66"+
		"\3\66\3\66\3\67\3\67\3\67\3\67\38\38\38\39\39\39\3:\3:\3;\3;\3;\3<\3<"+
		"\3<\3<\3=\3=\3=\3=\3=\3>\3>\3>\3?\3?\3?\3?\3@\3@\3@\3@\3@\3A\3A\3A\3B"+
		"\3B\3B\3B\3C\3C\3C\3C\3C\3D\3D\3D\5D\u01e3\nD\3D\3D\3D\3D\3D\3D\3D\3D"+
		"\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u01fd\nD\3E\3E\3F"+
		"\6F\u0202\nF\rF\16F\u0203\3G\3G\3G\3H\3H\6H\u020b\nH\rH\16H\u020c\3H\3"+
		"H\3H\3H\3H\5H\u0214\nH\3H\5H\u0217\nH\3I\3I\3I\3I\3I\3J\3J\3J\3J\3K\3"+
		"K\3K\5K\u0225\nK\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3"+
		"K\3K\3K\3K\3K\3K\3K\5K\u023f\nK\3\u00aa\2L\4\2\6\3\b\4\n\5\f\6\16\7\20"+
		"\b\22\2\24\t\26\n\30\13\32\f\34\2\36\2 \2\"\r$\16&\17(\20*\21,\22.\23"+
		"\60\2\62\2\64\2\66\28\24:\25<\2>\2@\26B\27D\30F\31H\32J\33L\34N\35P\36"+
		"R\37T\2V\2X Z!\\\"^#`$b%d&f\'h(j)l*n+p,r-t.v/x\60z\61|\62~\63\u0080\64"+
		"\u0082\65\u0084\66\u0086\67\u00888\u008a9\u008c:\u008e;\u0090<\u0092="+
		"\u0094>\u0096?\4\2\3\16\21\2((<<AACDFIKKNRTWY\\cdfikknrtwy|\4\2C\\c|\4"+
		"\2\'\'>>\f\2EFKKNOXXZZefkknoxxzz\4\2\60\60aa\5\2ccrrtu\t\2&&\62\62@@c"+
		"cegjjuu\5\2\64\6688::\3\2\62;\4\2QQqq\4\2\f\f\17\17\5\2\66\66eett\2\u0267"+
		"\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2"+
		"\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\"\3\2\2\2\2"+
		"$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2\2\2\2,\3\2\2\2\2.\3\2\2\2\28\3"+
		"\2\2\2\2:\3\2\2\2\2@\3\2\2\2\2B\3\2\2\2\2D\3\2\2\2\2F\3\2\2\2\2H\3\2\2"+
		"\2\2J\3\2\2\2\2L\3\2\2\2\2N\3\2\2\2\2P\3\2\2\2\2R\3\2\2\2\2X\3\2\2\2\2"+
		"Z\3\2\2\2\2\\\3\2\2\2\2^\3\2\2\2\2`\3\2\2\2\2b\3\2\2\2\2d\3\2\2\2\2f\3"+
		"\2\2\2\2h\3\2\2\2\2j\3\2\2\2\2l\3\2\2\2\2n\3\2\2\2\2p\3\2\2\2\2r\3\2\2"+
		"\2\2t\3\2\2\2\2v\3\2\2\2\2x\3\2\2\2\2z\3\2\2\2\2|\3\2\2\2\2~\3\2\2\2\2"+
		"\u0080\3\2\2\2\2\u0082\3\2\2\2\2\u0084\3\2\2\2\2\u0086\3\2\2\2\2\u0088"+
		"\3\2\2\2\2\u008a\3\2\2\2\2\u008c\3\2\2\2\2\u008e\3\2\2\2\2\u0090\3\2\2"+
		"\2\3\u0092\3\2\2\2\3\u0094\3\2\2\2\3\u0096\3\2\2\2\4\u0098\3\2\2\2\6\u009a"+
		"\3\2\2\2\b\u00a2\3\2\2\2\n\u00b3\3\2\2\2\f\u00be\3\2\2\2\16\u00cc\3\2"+
		"\2\2\20\u00d4\3\2\2\2\22\u00d9\3\2\2\2\24\u00db\3\2\2\2\26\u00e5\3\2\2"+
		"\2\30\u00ee\3\2\2\2\32\u00fc\3\2\2\2\34\u00fe\3\2\2\2\36\u0100\3\2\2\2"+
		" \u0102\3\2\2\2\"\u0104\3\2\2\2$\u010e\3\2\2\2&\u011d\3\2\2\2(\u011f\3"+
		"\2\2\2*\u0121\3\2\2\2,\u0123\3\2\2\2.\u0125\3\2\2\2\60\u0127\3\2\2\2\62"+
		"\u0129\3\2\2\2\64\u012b\3\2\2\2\66\u012d\3\2\2\28\u0135\3\2\2\2:\u013d"+
		"\3\2\2\2<\u013f\3\2\2\2>\u0141\3\2\2\2@\u0148\3\2\2\2B\u0154\3\2\2\2D"+
		"\u0170\3\2\2\2F\u0172\3\2\2\2H\u0175\3\2\2\2J\u0178\3\2\2\2L\u017a\3\2"+
		"\2\2N\u017d\3\2\2\2P\u0180\3\2\2\2R\u0182\3\2\2\2T\u0184\3\2\2\2V\u0186"+
		"\3\2\2\2X\u0188\3\2\2\2Z\u018a\3\2\2\2\\\u018c\3\2\2\2^\u018e\3\2\2\2"+
		"`\u0191\3\2\2\2b\u0195\3\2\2\2d\u0197\3\2\2\2f\u019a\3\2\2\2h\u01a0\3"+
		"\2\2\2j\u01a3\3\2\2\2l\u01a7\3\2\2\2n\u01af\3\2\2\2p\u01b3\3\2\2\2r\u01b6"+
		"\3\2\2\2t\u01b9\3\2\2\2v\u01bb\3\2\2\2x\u01be\3\2\2\2z\u01c2\3\2\2\2|"+
		"\u01c7\3\2\2\2~\u01ca\3\2\2\2\u0080\u01ce\3\2\2\2\u0082\u01d3\3\2\2\2"+
		"\u0084\u01d6\3\2\2\2\u0086\u01da\3\2\2\2\u0088\u01df\3\2\2\2\u008a\u01fe"+
		"\3\2\2\2\u008c\u0201\3\2\2\2\u008e\u0205\3\2\2\2\u0090\u0208\3\2\2\2\u0092"+
		"\u0218\3\2\2\2\u0094\u021d\3\2\2\2\u0096\u0221\3\2\2\2\u0098\u0099\t\2"+
		"\2\2\u0099\5\3\2\2\2\u009a\u009b\7P\2\2\u009b\u009c\7q\2\2\u009c\u009d"+
		"\7V\2\2\u009d\u009e\7j\2\2\u009e\u009f\7K\2\2\u009f\u00a0\7p\2\2\u00a0"+
		"\u00a1\7I\2\2\u00a1\7\3\2\2\2\u00a2\u00a3\7>\2\2\u00a3\u00a4\7j\2\2\u00a4"+
		"\u00a5\7\65\2\2\u00a5\u00a6\7@\2\2\u00a6\u00aa\3\2\2\2\u00a7\u00a9\13"+
		"\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00ab\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\7>"+
		"\2\2\u00ae\u00af\7\61\2\2\u00af\u00b0\7j\2\2\u00b0\u00b1\7\65\2\2\u00b1"+
		"\u00b2\7@\2\2\u00b2\t\3\2\2\2\u00b3\u00b5\t\3\2\2\u00b4\u00b6\t\3\2\2"+
		"\u00b5\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8"+
		"\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\b\5\2\2\u00ba\13\3\2\2\2\u00bb"+
		"\u00bd\t\3\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2"+
		"\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1"+
		"\u00c2\t\4\2\2\u00c2\u00c3\7n\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7o\2"+
		"\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\b\6\3\2\u00c7\r\3\2\2\2\u00c8\u00c9"+
		"\7a\2\2\u00c9\u00cd\7=\2\2\u00ca\u00cb\7\60\2\2\u00cb\u00cd\7=\2\2\u00cc"+
		"\u00c8\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2"+
		"\2\2\u00ce\u00d0\5 \20\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d2\t\3\2\2\u00d2\u00d3\b\7\4\2\u00d3\17\3\2\2"+
		"\2\u00d4\u00d5\5 \20\2\u00d5\u00d6\t\3\2\2\u00d6\u00d7\t\3\2\2\u00d7\u00d8"+
		"\b\b\5\2\u00d8\21\3\2\2\2\u00d9\u00da\t\5\2\2\u00da\23\3\2\2\2\u00db\u00dc"+
		"\5 \20\2\u00dc\u00dd\5 \20\2\u00dd\u00de\5\22\t\2\u00de\u00e2\5\22\t\2"+
		"\u00df\u00e1\5\22\t\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0"+
		"\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\25\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5"+
		"\u00e6\5 \20\2\u00e6\u00e7\5 \20\2\u00e7\u00e9\t\3\2\2\u00e8\u00ea\t\3"+
		"\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\27\3\2\2\2\u00ed\u00ef\t\6\2\2\u00ee\u00ed\3\2\2"+
		"\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\7\60\2\2\u00f1"+
		"\u00f3\5 \20\2\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2"+
		"\2\2\u00f4\u00f5\5\4\2\2\u00f5\31\3\2\2\2\u00f6\u00f7\7B\2\2\u00f7\u00f8"+
		"\7.\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fd\t\7\2\2\u00fa\u00fb\7B\2\2\u00fb"+
		"\u00fd\t\b\2\2\u00fc\u00f6\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\33\3\2\2"+
		"\2\u00fe\u00ff\7a\2\2\u00ff\35\3\2\2\2\u0100\u0101\7)\2\2\u0101\37\3\2"+
		"\2\2\u0102\u0103\7.\2\2\u0103!\3\2\2\2\u0104\u010b\5\34\16\2\u0105\u010c"+
		"\5\36\17\2\u0106\u010c\t\t\2\2\u0107\u0109\7\62\2\2\u0108\u010a\5\36\17"+
		"\2\u0109\u0108\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c\3\2\2\2\u010b\u0105"+
		"\3\2\2\2\u010b\u0106\3\2\2\2\u010b\u0107\3\2\2\2\u010c#\3\2\2\2\u010d"+
		"\u010f\5 \20\2\u010e\u010d\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2"+
		"\2\2\u0110\u0111\7:\2\2\u0111%\3\2\2\2\u0112\u0113\7/\2\2\u0113\u0114"+
		"\7/\2\2\u0114\u0117\7/\2\2\u0115\u0117\7/\2\2\u0116\u0112\3\2\2\2\u0116"+
		"\u0115\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011e\7/"+
		"\2\2\u0119\u011a\5\36\17\2\u011a\u011b\5\36\17\2\u011b\u011c\5\36\17\2"+
		"\u011c\u011e\3\2\2\2\u011d\u0116\3\2\2\2\u011d\u0119\3\2\2\2\u011e\'\3"+
		"\2\2\2\u011f\u0120\7(\2\2\u0120)\3\2\2\2\u0121\u0122\7?\2\2\u0122+\3\2"+
		"\2\2\u0123\u0124\7*\2\2\u0124-\3\2\2\2\u0125\u0126\7+\2\2\u0126/\3\2\2"+
		"\2\u0127\u0128\7-\2\2\u0128\61\3\2\2\2\u0129\u012a\7/\2\2\u012a\63\3\2"+
		"\2\2\u012b\u012c\7^\2\2\u012c\65\3\2\2\2\u012d\u012e\7,\2\2\u012e\67\3"+
		"\2\2\2\u012f\u0136\5\60\30\2\u0130\u0136\5\62\31\2\u0131\u0132\5\60\30"+
		"\2\u0132\u0133\5T*\2\u0133\u0134\5\62\31\2\u0134\u0136\3\2\2\2\u0135\u012f"+
		"\3\2\2\2\u0135\u0130\3\2\2\2\u0135\u0131\3\2\2\2\u01369\3\2\2\2\u0137"+
		"\u0139\7B\2\2\u0138\u0137\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\3\2"+
		"\2\2\u013a\u013e\5\66\33\2\u013b\u013c\7\60\2\2\u013c\u013e\7\61\2\2\u013d"+
		"\u0138\3\2\2\2\u013d\u013b\3\2\2\2\u013e;\3\2\2\2\u013f\u0140\t\n\2\2"+
		"\u0140=\3\2\2\2\u0141\u0142\7\60\2\2\u0142?\3\2\2\2\u0143\u0144\7a\2\2"+
		"\u0144\u0149\7%\2\2\u0145\u0146\7\60\2\2\u0146\u0149\7%\2\2\u0147\u0149"+
		"\7%\2\2\u0148\u0143\3\2\2\2\u0148\u0145\3\2\2\2\u0148\u0147\3\2\2\2\u0148"+
		"\u0149\3\2\2\2\u0149\u014b\3\2\2\2\u014a\u014c\5<\36\2\u014b\u014a\3\2"+
		"\2\2\u014c\u014d\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"A\3\2\2\2\u014f\u0150\7a\2\2\u0150\u0155\7%\2\2\u0151\u0152\7\60\2\2\u0152"+
		"\u0155\7%\2\2\u0153\u0155\7%\2\2\u0154\u014f\3\2\2\2\u0154\u0151\3\2\2"+
		"\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0168\3\2\2\2\u0156\u0158"+
		"\5<\36\2\u0157\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u0157\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015f\5>\37\2\u015c\u015e\5<"+
		"\36\2\u015d\u015c\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f"+
		"\u0160\3\2\2\2\u0160\u0169\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0164\5>"+
		"\37\2\u0163\u0165\5<\36\2\u0164\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166"+
		"\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0169\3\2\2\2\u0168\u0157\3\2"+
		"\2\2\u0168\u0162\3\2\2\2\u0169C\3\2\2\2\u016a\u016b\7\"\2\2\u016b\u016c"+
		"\7\60\2\2\u016c\u0171\7m\2\2\u016d\u016e\7\"\2\2\u016e\u016f\7\60\2\2"+
		"\u016f\u0171\7M\2\2\u0170\u016a\3\2\2\2\u0170\u016d\3\2\2\2\u0171E\3\2"+
		"\2\2\u0172\u0173\7=\2\2\u0173\u0174\7=\2\2\u0174G\3\2\2\2\u0175\u0176"+
		"\7=\2\2\u0176\u0177\7`\2\2\u0177I\3\2\2\2\u0178\u0179\7=\2\2\u0179K\3"+
		"\2\2\2\u017a\u017b\7`\2\2\u017b\u017c\7=\2\2\u017cM\3\2\2\2\u017d\u017e"+
		"\7`\2\2\u017e\u017f\7`\2\2\u017fO\3\2\2\2\u0180\u0181\7`\2\2\u0181Q\3"+
		"\2\2\2\u0182\u0183\5T*\2\u0183S\3\2\2\2\u0184\u0185\7$\2\2\u0185U\3\2"+
		"\2\2\u0186\u0187\7\'\2\2\u0187W\3\2\2\2\u0188\u0189\7>\2\2\u0189Y\3\2"+
		"\2\2\u018a\u018b\5V+\2\u018b[\3\2\2\2\u018c\u018d\7_\2\2\u018d]\3\2\2"+
		"\2\u018e\u018f\7A\2\2\u018f_\3\2\2\2\u0190\u0192\7a\2\2\u0191\u0190\3"+
		"\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194\7\61\2\2\u0194"+
		"a\3\2\2\2\u0195\u0196\7%\2\2\u0196c\3\2\2\2\u0197\u0198\7.\2\2\u0198\u0199"+
		"\7A\2\2\u0199e\3\2\2\2\u019a\u019c\7.\2\2\u019b\u019d\7a\2\2\u019c\u019b"+
		"\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\7\61\2\2"+
		"\u019fg\3\2\2\2\u01a0\u01a1\7.\2\2\u01a1\u01a2\7%\2\2\u01a2i\3\2\2\2\u01a3"+
		"\u01a4\7.\2\2\u01a4\u01a5\7.\2\2\u01a5\u01a6\7A\2\2\u01a6k\3\2\2\2\u01a7"+
		"\u01a8\7.\2\2\u01a8\u01a9\7.\2\2\u01a9\u01ab\3\2\2\2\u01aa\u01ac\7a\2"+
		"\2\u01ab\u01aa\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae"+
		"\7\61\2\2\u01aem\3\2\2\2\u01af\u01b0\7.\2\2\u01b0\u01b1\7.\2\2\u01b1\u01b2"+
		"\7%\2\2\u01b2o\3\2\2\2\u01b3\u01b4\7a\2\2\u01b4\u01b5\7A\2\2\u01b5q\3"+
		"\2\2\2\u01b6\u01b7\7a\2\2\u01b7\u01b8\7%\2\2\u01b8s\3\2\2\2\u01b9\u01ba"+
		"\7@\2\2\u01bau\3\2\2\2\u01bb\u01bc\7\60\2\2\u01bc\u01bd\7@\2\2\u01bdw"+
		"\3\2\2\2\u01be\u01bf\7\60\2\2\u01bf\u01c0\7\60\2\2\u01c0\u01c1\7@\2\2"+
		"\u01c1y\3\2\2\2\u01c2\u01c3\7\60\2\2\u01c3\u01c4\7\60\2\2\u01c4\u01c5"+
		"\7\60\2\2\u01c5\u01c6\7@\2\2\u01c6{\3\2\2\2\u01c7\u01c8\7\60\2\2\u01c8"+
		"\u01c9\7>\2\2\u01c9}\3\2\2\2\u01ca\u01cb\7\60\2\2\u01cb\u01cc\7\60\2\2"+
		"\u01cc\u01cd\7>\2\2\u01cd\177\3\2\2\2\u01ce\u01cf\7\60\2\2\u01cf\u01d0"+
		"\7\60\2\2\u01d0\u01d1\7\60\2\2\u01d1\u01d2\7>\2\2\u01d2\u0081\3\2\2\2"+
		"\u01d3\u01d4\7\60\2\2\u01d4\u01d5\7_\2\2\u01d5\u0083\3\2\2\2\u01d6\u01d7"+
		"\7\60\2\2\u01d7\u01d8\7\60\2\2\u01d8\u01d9\7_\2\2\u01d9\u0085\3\2\2\2"+
		"\u01da\u01db\7\60\2\2\u01db\u01dc\7\60\2\2\u01dc\u01dd\7\60\2\2\u01dd"+
		"\u01de\7_\2\2\u01de\u0087\3\2\2\2\u01df\u01fc\7&\2\2\u01e0\u01e1\7/\2"+
		"\2\u01e1\u01e3\7/\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4"+
		"\3\2\2\2\u01e4\u01fd\t\13\2\2\u01e5\u01e6\7]\2\2\u01e6\u01e7\7/\2\2\u01e7"+
		"\u01fd\7/\2\2\u01e8\u01e9\7]\2\2\u01e9\u01ea\7/\2\2\u01ea\u01eb\7/\2\2"+
		"\u01eb\u01ec\3\2\2\2\u01ec\u01fd\t\13\2\2\u01ed\u01ee\7>\2\2\u01ee\u01ef"+
		"\7/\2\2\u01ef\u01f0\7/\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01fd\t\13\2\2\u01f2"+
		"\u01f3\7\'\2\2\u01f3\u01f4\7/\2\2\u01f4\u01f5\7/\2\2\u01f5\u01f6\3\2\2"+
		"\2\u01f6\u01fd\t\13\2\2\u01f7\u01f8\7]\2\2\u01f8\u01f9\7/\2\2\u01f9\u01fa"+
		"\7/\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fd\t\13\2\2\u01fc\u01e2\3\2\2\2\u01fc"+
		"\u01e5\3\2\2\2\u01fc\u01e8\3\2\2\2\u01fc\u01ed\3\2\2\2\u01fc\u01f2\3\2"+
		"\2\2\u01fc\u01f7\3\2\2\2\u01fd\u0089\3\2\2\2\u01fe\u01ff\7\"\2\2\u01ff"+
		"\u008b\3\2\2\2\u0200\u0202\t\f\2\2\u0201\u0200\3\2\2\2\u0202\u0203\3\2"+
		"\2\2\u0203\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u008d\3\2\2\2\u0205"+
		"\u0206\7.\2\2\u0206\u0207\7?\2\2\u0207\u008f\3\2\2\2\u0208\u0216\7#\2"+
		"\2\u0209\u020b\7#\2\2\u020a\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020a"+
		"\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u0217\3\2\2\2\u020e\u0213\7B\2\2\u020f"+
		"\u0210\7&\2\2\u0210\u0214\t\r\2\2\u0211\u0212\7.\2\2\u0212\u0214\7?\2"+
		"\2\u0213\u020f\3\2\2\2\u0213\u0211\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0217"+
		"\7_\2\2\u0216\u020a\3\2\2\2\u0216\u020e\3\2\2\2\u0216\u0217\3\2\2\2\u0217"+
		"\u0091\3\2\2\2\u0218\u0219\5 \20\2\u0219\u021a\t\3\2\2\u021a\u021b\t\3"+
		"\2\2\u021b\u021c\bI\6\2\u021c\u0093\3\2\2\2\u021d\u021e\5 \20\2\u021e"+
		"\u021f\t\3\2\2\u021f\u0220\bJ\7\2\u0220\u0095\3\2\2\2\u0221\u023e\7&\2"+
		"\2\u0222\u0223\7/\2\2\u0223\u0225\7/\2\2\u0224\u0222\3\2\2\2\u0224\u0225"+
		"\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u023f\t\13\2\2\u0227\u0228\7]\2\2\u0228"+
		"\u0229\7/\2\2\u0229\u023f\7/\2\2\u022a\u022b\7]\2\2\u022b\u022c\7/\2\2"+
		"\u022c\u022d\7/\2\2\u022d\u022e\3\2\2\2\u022e\u023f\t\13\2\2\u022f\u0230"+
		"\7>\2\2\u0230\u0231\7/\2\2\u0231\u0232\7/\2\2\u0232\u0233\3\2\2\2\u0233"+
		"\u023f\t\13\2\2\u0234\u0235\7\'\2\2\u0235\u0236\7/\2\2\u0236\u0237\7/"+
		"\2\2\u0237\u0238\3\2\2\2\u0238\u023f\t\13\2\2\u0239\u023a\7]\2\2\u023a"+
		"\u023b\7/\2\2\u023b\u023c\7/\2\2\u023c\u023d\3\2\2\2\u023d\u023f\t\13"+
		"\2\2\u023e\u0224\3\2\2\2\u023e\u0227\3\2\2\2\u023e\u022a\3\2\2\2\u023e"+
		"\u022f\3\2\2\2\u023e\u0234\3\2\2\2\u023e\u0239\3\2\2\2\u023f\u0097\3\2"+
		"\2\2)\2\3\u00aa\u00b7\u00be\u00cc\u00cf\u00e2\u00eb\u00ee\u00f2\u00fc"+
		"\u0109\u010b\u010e\u0116\u011d\u0135\u0138\u013d\u0148\u014d\u0154\u0159"+
		"\u015f\u0166\u0168\u0170\u0191\u019c\u01ab\u01e2\u01fc\u0203\u020c\u0213"+
		"\u0216\u0224\u023e\b\3\5\2\3\6\3\3\7\4\3\b\5\3I\6\3J\7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}