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
		FACTORIAL=14, GENERAL_OMISSION=15, LGRP=16, ENLGRP=17, RGRP=18, ENRGRP=19, 
		BINOP=20, BINOP_PREC=21, INT=22, REAL=23, CMPR=24, SUBSUB=25, SUBSUP=26, 
		SUB=27, SUPSUB=28, SUPSUP=29, SUP=30, MODIF=31, MODOVER=32, MODUNDER=33, 
		TERM=34, SFRAC=35, FRAC_SLASH=36, ESFRAC=37, CFRAC=38, CSLASH=39, ECFRAC=40, 
		HCFRAC=41, HCSLASH=42, EHCFRAC=43, SMIXFR=44, EMIXFR=45, SQRT=46, SQRT1=47, 
		SQRT2=48, SQRT3=49, IRAD1=50, IRAD2=51, IRAD3=52, RTRM1=53, RTRM2=54, 
		RTRM3=55, ARROW=56, SPACE=57, NEWLINE=58, INFINITY=59, INTEGRAL=60, CHEM_ELEMENT=61, 
		POSS_CH_ELEMENT=62, CHM_ARROW=63;
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
		"APOS", "DOT6", "DOTS156", "PI_PUNC", "PRE_PUNC", "MISC_PUNC", "FACTORIAL", 
		"GENERAL_OMISSION", "LGRP", "ENLGRP", "RGRP", "ENRGRP", "PLUS", "MINUS", 
		"BSLASH", "ASTER", "BINOP", "BINOP_PREC", "DEC_DIG", "DOTS46", "INT", 
		"REAL", "CMPR", "SUBSUB", "SUBSUP", "SUB", "SUPSUB", "SUPSUP", "SUP", 
		"MODIF", "DOT5", "DOTS146", "MODOVER", "MODUNDER", "TERM", "SFRAC", "FRAC_SLASH", 
		"ESFRAC", "CFRAC", "CSLASH", "ECFRAC", "HCFRAC", "HCSLASH", "EHCFRAC", 
		"SMIXFR", "EMIXFR", "SQRT", "SQRT1", "SQRT2", "SQRT3", "IRAD1", "IRAD2", 
		"IRAD3", "RTRM1", "RTRM2", "RTRM3", "ARROW", "SPACE", "NEWLINE", "INFINITY", 
		"INTEGRAL", "CHEM_ELEMENT", "POSS_CH_ELEMENT", "CHM_ARROW"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'NoThInG'", null, null, null, null, null, null, null, null, null, 
		null, null, null, "'&'", "'='", "'('", null, "')'", null, null, null, 
		null, null, null, "';;'", "';^'", "';'", "'^;'", "'^^'", "'^'", null, 
		"'<'", null, "']'", "'?'", null, "'#'", "',?'", null, "',#'", "',,?'", 
		null, "',,#'", "'_?'", "'_#'", "'>'", "'.>'", "'..>'", "'...>'", "'.<'", 
		"'..<'", "'...<'", "'.]'", "'..]'", "'...]'", null, "' '", null, "',='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NOTHING", "BLURB", "LC_ID", "LIMS", "ID", "MIXID", "CAP_ROMAN_NUM_SEQ", 
		"UC_ID", "GREEK_LETTER", "MISCALPHD4", "PI_PUNC", "PRE_PUNC", "MISC_PUNC", 
		"FACTORIAL", "GENERAL_OMISSION", "LGRP", "ENLGRP", "RGRP", "ENRGRP", "BINOP", 
		"BINOP_PREC", "INT", "REAL", "CMPR", "SUBSUB", "SUBSUP", "SUB", "SUPSUB", 
		"SUPSUP", "SUP", "MODIF", "MODOVER", "MODUNDER", "TERM", "SFRAC", "FRAC_SLASH", 
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
		case 33:
			INT_action((RuleContext)_localctx, actionIndex);
			break;
		case 74:
			CHEM_ELEMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 75:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2A\u0261\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u00af\n\4\f\4\16\4\u00b2\13\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\6\5\u00bc\n\5\r\5\16\5\u00bd\3\5\3\5\3\6\7\6"+
		"\u00c3\n\6\f\6\16\6\u00c6\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\5\7\u00d3\n\7\3\7\5\7\u00d6\n\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\7\n\u00e7\n\n\f\n\16\n\u00ea\13\n\3\13\3\13"+
		"\3\13\3\13\6\13\u00f0\n\13\r\13\16\13\u00f1\3\f\3\f\5\f\u00f6\n\f\3\f"+
		"\3\f\5\f\u00fa\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0104\n\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u0113"+
		"\n\22\5\22\u0115\n\22\3\23\5\23\u0118\n\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\5\24\u0120\n\24\3\24\3\24\3\24\3\24\3\24\5\24\u0127\n\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\30\5\30\u0130\n\30\3\30\3\30\3\30\3\31\3\31\3\32"+
		"\5\32\u0138\n\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u014b\n\37\3 \5 \u014e\n \3 \3 \3"+
		" \5 \u0153\n \3!\3!\3\"\3\"\3#\3#\3#\3#\3#\5#\u015e\n#\3#\6#\u0161\n#"+
		"\r#\16#\u0162\3#\3#\5#\u0167\n#\3#\5#\u016a\n#\3#\3#\3#\5#\u016f\n#\3"+
		"$\3$\3$\3$\3$\5$\u0176\n$\3$\6$\u0179\n$\r$\16$\u017a\3$\3$\3$\5$\u0180"+
		"\n$\3$\3$\6$\u0184\n$\r$\16$\u0185\5$\u0188\n$\3%\3%\5%\u018c\n%\3%\3"+
		"%\3%\3%\5%\u0192\n%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3*\3+\3"+
		"+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\5\63\u01b3"+
		"\n\63\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\66\3\66\5\66\u01be\n\66\3\66"+
		"\3\66\3\67\3\67\3\67\38\38\38\38\39\39\39\39\59\u01cd\n9\39\39\3:\3:\3"+
		":\3:\3;\3;\3;\3<\3<\3<\3=\3=\3>\3>\3>\3?\3?\3?\3?\3@\3@\3@\3@\3@\3A\3"+
		"A\3A\3B\3B\3B\3B\3C\3C\3C\3C\3C\3D\3D\3D\3E\3E\3E\3E\3F\3F\3F\3F\3F\3"+
		"G\3G\3G\5G\u0204\nG\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3"+
		"G\3G\3G\3G\3G\3G\3G\3G\5G\u021e\nG\3H\3H\3I\6I\u0223\nI\rI\16I\u0224\3"+
		"J\3J\3J\3K\3K\6K\u022c\nK\rK\16K\u022d\3K\3K\3K\3K\3K\5K\u0235\nK\3K\5"+
		"K\u0238\nK\3L\3L\3L\3L\3L\3M\3M\3M\3M\3N\3N\3N\5N\u0246\nN\3N\3N\3N\3"+
		"N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\5N\u0260"+
		"\nN\3\u00b0\2O\4\2\6\3\b\4\n\5\f\6\16\7\20\b\22\2\24\t\26\n\30\13\32\f"+
		"\34\2\36\2 \2\"\2$\r&\16(\17*\20,\21.\22\60\23\62\24\64\25\66\28\2:\2"+
		"<\2>\26@\27B\2D\2F\30H\31J\32L\33N\34P\35R\36T\37V X!Z\2\\\2^\"`#b$d%"+
		"f&h\'j(l)n*p+r,t-v.x/z\60|\61~\62\u0080\63\u0082\64\u0084\65\u0086\66"+
		"\u0088\67\u008a8\u008c9\u008e:\u0090;\u0092<\u0094=\u0096>\u0098?\u009a"+
		"@\u009cA\4\2\3\r\21\2((<<AACDFIKKNRTWY\\cdfikknrtwy|\4\2C\\c|\4\2\'\'"+
		">>\f\2EFKKNOXXZZefkknoxxzz\5\2ccrrtu\t\2&&\62\62@@ccegjjuu\5\2\64\668"+
		"8::\3\2\62;\4\2QQqq\4\2\f\f\17\17\5\2\66\66eett\2\u028e\2\6\3\2\2\2\2"+
		"\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\24\3\2"+
		"\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3"+
		"\2\2\2\2*\3\2\2\2\2,\3\2\2\2\2.\3\2\2\2\2\60\3\2\2\2\2\62\3\2\2\2\2\64"+
		"\3\2\2\2\2>\3\2\2\2\2@\3\2\2\2\2F\3\2\2\2\2H\3\2\2\2\2J\3\2\2\2\2L\3\2"+
		"\2\2\2N\3\2\2\2\2P\3\2\2\2\2R\3\2\2\2\2T\3\2\2\2\2V\3\2\2\2\2X\3\2\2\2"+
		"\2^\3\2\2\2\2`\3\2\2\2\2b\3\2\2\2\2d\3\2\2\2\2f\3\2\2\2\2h\3\2\2\2\2j"+
		"\3\2\2\2\2l\3\2\2\2\2n\3\2\2\2\2p\3\2\2\2\2r\3\2\2\2\2t\3\2\2\2\2v\3\2"+
		"\2\2\2x\3\2\2\2\2z\3\2\2\2\2|\3\2\2\2\2~\3\2\2\2\2\u0080\3\2\2\2\2\u0082"+
		"\3\2\2\2\2\u0084\3\2\2\2\2\u0086\3\2\2\2\2\u0088\3\2\2\2\2\u008a\3\2\2"+
		"\2\2\u008c\3\2\2\2\2\u008e\3\2\2\2\2\u0090\3\2\2\2\2\u0092\3\2\2\2\2\u0094"+
		"\3\2\2\2\2\u0096\3\2\2\2\3\u0098\3\2\2\2\3\u009a\3\2\2\2\3\u009c\3\2\2"+
		"\2\4\u009e\3\2\2\2\6\u00a0\3\2\2\2\b\u00a8\3\2\2\2\n\u00b9\3\2\2\2\f\u00c4"+
		"\3\2\2\2\16\u00d2\3\2\2\2\20\u00da\3\2\2\2\22\u00df\3\2\2\2\24\u00e1\3"+
		"\2\2\2\26\u00eb\3\2\2\2\30\u00f5\3\2\2\2\32\u0103\3\2\2\2\34\u0105\3\2"+
		"\2\2\36\u0107\3\2\2\2 \u0109\3\2\2\2\"\u010b\3\2\2\2$\u010d\3\2\2\2&\u0117"+
		"\3\2\2\2(\u0126\3\2\2\2*\u0128\3\2\2\2,\u012a\3\2\2\2.\u012c\3\2\2\2\60"+
		"\u012f\3\2\2\2\62\u0134\3\2\2\2\64\u0137\3\2\2\2\66\u013c\3\2\2\28\u013e"+
		"\3\2\2\2:\u0140\3\2\2\2<\u0142\3\2\2\2>\u014a\3\2\2\2@\u0152\3\2\2\2B"+
		"\u0154\3\2\2\2D\u0156\3\2\2\2F\u015d\3\2\2\2H\u0175\3\2\2\2J\u0189\3\2"+
		"\2\2L\u0193\3\2\2\2N\u0196\3\2\2\2P\u0199\3\2\2\2R\u019b\3\2\2\2T\u019e"+
		"\3\2\2\2V\u01a1\3\2\2\2X\u01a3\3\2\2\2Z\u01a5\3\2\2\2\\\u01a7\3\2\2\2"+
		"^\u01a9\3\2\2\2`\u01ab\3\2\2\2b\u01ad\3\2\2\2d\u01af\3\2\2\2f\u01b2\3"+
		"\2\2\2h\u01b6\3\2\2\2j\u01b8\3\2\2\2l\u01bb\3\2\2\2n\u01c1\3\2\2\2p\u01c4"+
		"\3\2\2\2r\u01c8\3\2\2\2t\u01d0\3\2\2\2v\u01d4\3\2\2\2x\u01d7\3\2\2\2z"+
		"\u01da\3\2\2\2|\u01dc\3\2\2\2~\u01df\3\2\2\2\u0080\u01e3\3\2\2\2\u0082"+
		"\u01e8\3\2\2\2\u0084\u01eb\3\2\2\2\u0086\u01ef\3\2\2\2\u0088\u01f4\3\2"+
		"\2\2\u008a\u01f7\3\2\2\2\u008c\u01fb\3\2\2\2\u008e\u0200\3\2\2\2\u0090"+
		"\u021f\3\2\2\2\u0092\u0222\3\2\2\2\u0094\u0226\3\2\2\2\u0096\u0229\3\2"+
		"\2\2\u0098\u0239\3\2\2\2\u009a\u023e\3\2\2\2\u009c\u0242\3\2\2\2\u009e"+
		"\u009f\t\2\2\2\u009f\5\3\2\2\2\u00a0\u00a1\7P\2\2\u00a1\u00a2\7q\2\2\u00a2"+
		"\u00a3\7V\2\2\u00a3\u00a4\7j\2\2\u00a4\u00a5\7K\2\2\u00a5\u00a6\7p\2\2"+
		"\u00a6\u00a7\7I\2\2\u00a7\7\3\2\2\2\u00a8\u00a9\7>\2\2\u00a9\u00aa\7j"+
		"\2\2\u00aa\u00ab\7\65\2\2\u00ab\u00ac\7@\2\2\u00ac\u00b0\3\2\2\2\u00ad"+
		"\u00af\13\2\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00b1\3"+
		"\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3"+
		"\u00b4\7>\2\2\u00b4\u00b5\7\61\2\2\u00b5\u00b6\7j\2\2\u00b6\u00b7\7\65"+
		"\2\2\u00b7\u00b8\7@\2\2\u00b8\t\3\2\2\2\u00b9\u00bb\t\3\2\2\u00ba\u00bc"+
		"\t\3\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\b\5\2\2\u00c0\13\3\2\2"+
		"\2\u00c1\u00c3\t\3\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2"+
		"\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7"+
		"\u00c8\t\4\2\2\u00c8\u00c9\7n\2\2\u00c9\u00ca\7k\2\2\u00ca\u00cb\7o\2"+
		"\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\b\6\3\2\u00cd\r\3\2\2\2\u00ce\u00cf"+
		"\7a\2\2\u00cf\u00d3\7=\2\2\u00d0\u00d1\7\60\2\2\u00d1\u00d3\7=\2\2\u00d2"+
		"\u00ce\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2"+
		"\2\2\u00d4\u00d6\5 \20\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\u00d8\t\3\2\2\u00d8\u00d9\b\7\4\2\u00d9\17\3\2\2"+
		"\2\u00da\u00db\5 \20\2\u00db\u00dc\t\3\2\2\u00dc\u00dd\t\3\2\2\u00dd\u00de"+
		"\b\b\5\2\u00de\21\3\2\2\2\u00df\u00e0\t\5\2\2\u00e0\23\3\2\2\2\u00e1\u00e2"+
		"\5 \20\2\u00e2\u00e3\5 \20\2\u00e3\u00e4\5\22\t\2\u00e4\u00e8\5\22\t\2"+
		"\u00e5\u00e7\5\22\t\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6"+
		"\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\25\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb"+
		"\u00ec\5 \20\2\u00ec\u00ed\5 \20\2\u00ed\u00ef\t\3\2\2\u00ee\u00f0\t\3"+
		"\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\27\3\2\2\2\u00f3\u00f6\7a\2\2\u00f4\u00f6\5D\"\2"+
		"\u00f5\u00f3\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7"+
		"\3\2\2\2\u00f7\u00f9\5D\"\2\u00f8\u00fa\5 \20\2\u00f9\u00f8\3\2\2\2\u00f9"+
		"\u00fa\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\5\4\2\2\u00fc\31\3\2\2"+
		"\2\u00fd\u00fe\7B\2\2\u00fe\u00ff\7.\2\2\u00ff\u0100\3\2\2\2\u0100\u0104"+
		"\t\6\2\2\u0101\u0102\7B\2\2\u0102\u0104\t\7\2\2\u0103\u00fd\3\2\2\2\u0103"+
		"\u0101\3\2\2\2\u0104\33\3\2\2\2\u0105\u0106\7a\2\2\u0106\35\3\2\2\2\u0107"+
		"\u0108\7)\2\2\u0108\37\3\2\2\2\u0109\u010a\7.\2\2\u010a!\3\2\2\2\u010b"+
		"\u010c\7<\2\2\u010c#\3\2\2\2\u010d\u0114\5\34\16\2\u010e\u0115\5\36\17"+
		"\2\u010f\u0115\t\b\2\2\u0110\u0112\7\62\2\2\u0111\u0113\5\36\17\2\u0112"+
		"\u0111\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0115\3\2\2\2\u0114\u010e\3\2"+
		"\2\2\u0114\u010f\3\2\2\2\u0114\u0110\3\2\2\2\u0115%\3\2\2\2\u0116\u0118"+
		"\5 \20\2\u0117\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"\u011a\7:\2\2\u011a\'\3\2\2\2\u011b\u011c\7/\2\2\u011c\u011d\7/\2\2\u011d"+
		"\u0120\7/\2\2\u011e\u0120\7/\2\2\u011f\u011b\3\2\2\2\u011f\u011e\3\2\2"+
		"\2\u0120\u0121\3\2\2\2\u0121\u0127\7/\2\2\u0122\u0123\5\36\17\2\u0123"+
		"\u0124\5\36\17\2\u0124\u0125\5\36\17\2\u0125\u0127\3\2\2\2\u0126\u011f"+
		"\3\2\2\2\u0126\u0122\3\2\2\2\u0127)\3\2\2\2\u0128\u0129\7(\2\2\u0129+"+
		"\3\2\2\2\u012a\u012b\7?\2\2\u012b-\3\2\2\2\u012c\u012d\7*\2\2\u012d/\3"+
		"\2\2\2\u012e\u0130\7B\2\2\u012f\u012e\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\u0132\7.\2\2\u0132\u0133\7*\2\2\u0133\61\3\2\2\2"+
		"\u0134\u0135\7+\2\2\u0135\63\3\2\2\2\u0136\u0138\7B\2\2\u0137\u0136\3"+
		"\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\7.\2\2\u013a"+
		"\u013b\7+\2\2\u013b\65\3\2\2\2\u013c\u013d\7-\2\2\u013d\67\3\2\2\2\u013e"+
		"\u013f\7/\2\2\u013f9\3\2\2\2\u0140\u0141\7^\2\2\u0141;\3\2\2\2\u0142\u0143"+
		"\7,\2\2\u0143=\3\2\2\2\u0144\u014b\5\66\33\2\u0145\u014b\58\34\2\u0146"+
		"\u0147\5\66\33\2\u0147\u0148\5Z-\2\u0148\u0149\58\34\2\u0149\u014b\3\2"+
		"\2\2\u014a\u0144\3\2\2\2\u014a\u0145\3\2\2\2\u014a\u0146\3\2\2\2\u014b"+
		"?\3\2\2\2\u014c\u014e\7B\2\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014f\u0153\5<\36\2\u0150\u0151\7\60\2\2\u0151\u0153\7"+
		"\61\2\2\u0152\u014d\3\2\2\2\u0152\u0150\3\2\2\2\u0153A\3\2\2\2\u0154\u0155"+
		"\t\t\2\2\u0155C\3\2\2\2\u0156\u0157\7\60\2\2\u0157E\3\2\2\2\u0158\u0159"+
		"\7a\2\2\u0159\u015e\7%\2\2\u015a\u015b\7\60\2\2\u015b\u015e\7%\2\2\u015c"+
		"\u015e\7%\2\2\u015d\u0158\3\2\2\2\u015d\u015a\3\2\2\2\u015d\u015c\3\2"+
		"\2\2\u015d\u015e\3\2\2\2\u015e\u0160\3\2\2\2\u015f\u0161\5B!\2\u0160\u015f"+
		"\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163"+
		"\u016e\3\2\2\2\u0164\u0166\5D\"\2\u0165\u0167\5D\"\2\u0166\u0165\3\2\2"+
		"\2\u0166\u0167\3\2\2\2\u0167\u0169\3\2\2\2\u0168\u016a\5 \20\2\u0169\u0168"+
		"\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\5\4\2\2\u016c"+
		"\u016d\b#\6\2\u016d\u016f\3\2\2\2\u016e\u0164\3\2\2\2\u016e\u016f\3\2"+
		"\2\2\u016fG\3\2\2\2\u0170\u0171\7a\2\2\u0171\u0176\7%\2\2\u0172\u0173"+
		"\7\60\2\2\u0173\u0176\7%\2\2\u0174\u0176\7%\2\2\u0175\u0170\3\2\2\2\u0175"+
		"\u0172\3\2\2\2\u0175\u0174\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0187\3\2"+
		"\2\2\u0177\u0179\5B!\2\u0178\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u0178"+
		"\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017f\5D\"\2\u017d"+
		"\u0180\5Z-\2\u017e\u0180\5B!\2\u017f\u017d\3\2\2\2\u017f\u017e\3\2\2\2"+
		"\u017f\u0180\3\2\2\2\u0180\u0188\3\2\2\2\u0181\u0183\5D\"\2\u0182\u0184"+
		"\5B!\2\u0183\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0183\3\2\2\2\u0185"+
		"\u0186\3\2\2\2\u0186\u0188\3\2\2\2\u0187\u0178\3\2\2\2\u0187\u0181\3\2"+
		"\2\2\u0188I\3\2\2\2\u0189\u018b\7\"\2\2\u018a\u018c\7\61\2\2\u018b\u018a"+
		"\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u0191\3\2\2\2\u018d\u018e\7\60\2\2"+
		"\u018e\u0192\7m\2\2\u018f\u0190\7\60\2\2\u0190\u0192\7M\2\2\u0191\u018d"+
		"\3\2\2\2\u0191\u018f\3\2\2\2\u0192K\3\2\2\2\u0193\u0194\7=\2\2\u0194\u0195"+
		"\7=\2\2\u0195M\3\2\2\2\u0196\u0197\7=\2\2\u0197\u0198\7`\2\2\u0198O\3"+
		"\2\2\2\u0199\u019a\7=\2\2\u019aQ\3\2\2\2\u019b\u019c\7`\2\2\u019c\u019d"+
		"\7=\2\2\u019dS\3\2\2\2\u019e\u019f\7`\2\2\u019f\u01a0\7`\2\2\u01a0U\3"+
		"\2\2\2\u01a1\u01a2\7`\2\2\u01a2W\3\2\2\2\u01a3\u01a4\5Z-\2\u01a4Y\3\2"+
		"\2\2\u01a5\u01a6\7$\2\2\u01a6[\3\2\2\2\u01a7\u01a8\7\'\2\2\u01a8]\3\2"+
		"\2\2\u01a9\u01aa\7>\2\2\u01aa_\3\2\2\2\u01ab\u01ac\5\\.\2\u01aca\3\2\2"+
		"\2\u01ad\u01ae\7_\2\2\u01aec\3\2\2\2\u01af\u01b0\7A\2\2\u01b0e\3\2\2\2"+
		"\u01b1\u01b3\7a\2\2\u01b2\u01b1\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4"+
		"\3\2\2\2\u01b4\u01b5\7\61\2\2\u01b5g\3\2\2\2\u01b6\u01b7\7%\2\2\u01b7"+
		"i\3\2\2\2\u01b8\u01b9\7.\2\2\u01b9\u01ba\7A\2\2\u01bak\3\2\2\2\u01bb\u01bd"+
		"\7.\2\2\u01bc\u01be\7a\2\2\u01bd\u01bc\3\2\2\2\u01bd\u01be\3\2\2\2\u01be"+
		"\u01bf\3\2\2\2\u01bf\u01c0\7\61\2\2\u01c0m\3\2\2\2\u01c1\u01c2\7.\2\2"+
		"\u01c2\u01c3\7%\2\2\u01c3o\3\2\2\2\u01c4\u01c5\7.\2\2\u01c5\u01c6\7.\2"+
		"\2\u01c6\u01c7\7A\2\2\u01c7q\3\2\2\2\u01c8\u01c9\7.\2\2\u01c9\u01ca\7"+
		".\2\2\u01ca\u01cc\3\2\2\2\u01cb\u01cd\7a\2\2\u01cc\u01cb\3\2\2\2\u01cc"+
		"\u01cd\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01cf\7\61\2\2\u01cfs\3\2\2\2"+
		"\u01d0\u01d1\7.\2\2\u01d1\u01d2\7.\2\2\u01d2\u01d3\7%\2\2\u01d3u\3\2\2"+
		"\2\u01d4\u01d5\7a\2\2\u01d5\u01d6\7A\2\2\u01d6w\3\2\2\2\u01d7\u01d8\7"+
		"a\2\2\u01d8\u01d9\7%\2\2\u01d9y\3\2\2\2\u01da\u01db\7@\2\2\u01db{\3\2"+
		"\2\2\u01dc\u01dd\7\60\2\2\u01dd\u01de\7@\2\2\u01de}\3\2\2\2\u01df\u01e0"+
		"\7\60\2\2\u01e0\u01e1\7\60\2\2\u01e1\u01e2\7@\2\2\u01e2\177\3\2\2\2\u01e3"+
		"\u01e4\7\60\2\2\u01e4\u01e5\7\60\2\2\u01e5\u01e6\7\60\2\2\u01e6\u01e7"+
		"\7@\2\2\u01e7\u0081\3\2\2\2\u01e8\u01e9\7\60\2\2\u01e9\u01ea\7>\2\2\u01ea"+
		"\u0083\3\2\2\2\u01eb\u01ec\7\60\2\2\u01ec\u01ed\7\60\2\2\u01ed\u01ee\7"+
		">\2\2\u01ee\u0085\3\2\2\2\u01ef\u01f0\7\60\2\2\u01f0\u01f1\7\60\2\2\u01f1"+
		"\u01f2\7\60\2\2\u01f2\u01f3\7>\2\2\u01f3\u0087\3\2\2\2\u01f4\u01f5\7\60"+
		"\2\2\u01f5\u01f6\7_\2\2\u01f6\u0089\3\2\2\2\u01f7\u01f8\7\60\2\2\u01f8"+
		"\u01f9\7\60\2\2\u01f9\u01fa\7_\2\2\u01fa\u008b\3\2\2\2\u01fb\u01fc\7\60"+
		"\2\2\u01fc\u01fd\7\60\2\2\u01fd\u01fe\7\60\2\2\u01fe\u01ff\7_\2\2\u01ff"+
		"\u008d\3\2\2\2\u0200\u021d\7&\2\2\u0201\u0202\7/\2\2\u0202\u0204\7/\2"+
		"\2\u0203\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u021e"+
		"\t\n\2\2\u0206\u0207\7]\2\2\u0207\u0208\7/\2\2\u0208\u021e\7/\2\2\u0209"+
		"\u020a\7]\2\2\u020a\u020b\7/\2\2\u020b\u020c\7/\2\2\u020c\u020d\3\2\2"+
		"\2\u020d\u021e\t\n\2\2\u020e\u020f\7>\2\2\u020f\u0210\7/\2\2\u0210\u0211"+
		"\7/\2\2\u0211\u0212\3\2\2\2\u0212\u021e\t\n\2\2\u0213\u0214\7\'\2\2\u0214"+
		"\u0215\7/\2\2\u0215\u0216\7/\2\2\u0216\u0217\3\2\2\2\u0217\u021e\t\n\2"+
		"\2\u0218\u0219\7]\2\2\u0219\u021a\7/\2\2\u021a\u021b\7/\2\2\u021b\u021c"+
		"\3\2\2\2\u021c\u021e\t\n\2\2\u021d\u0203\3\2\2\2\u021d\u0206\3\2\2\2\u021d"+
		"\u0209\3\2\2\2\u021d\u020e\3\2\2\2\u021d\u0213\3\2\2\2\u021d\u0218\3\2"+
		"\2\2\u021e\u008f\3\2\2\2\u021f\u0220\7\"\2\2\u0220\u0091\3\2\2\2\u0221"+
		"\u0223\t\13\2\2\u0222\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0222\3"+
		"\2\2\2\u0224\u0225\3\2\2\2\u0225\u0093\3\2\2\2\u0226\u0227\7.\2\2\u0227"+
		"\u0228\7?\2\2\u0228\u0095\3\2\2\2\u0229\u0237\7#\2\2\u022a\u022c\7#\2"+
		"\2\u022b\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022b\3\2\2\2\u022d\u022e"+
		"\3\2\2\2\u022e\u0238\3\2\2\2\u022f\u0234\7B\2\2\u0230\u0231\7&\2\2\u0231"+
		"\u0235\t\f\2\2\u0232\u0233\7.\2\2\u0233\u0235\7?\2\2\u0234\u0230\3\2\2"+
		"\2\u0234\u0232\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0238\7_\2\2\u0237\u022b"+
		"\3\2\2\2\u0237\u022f\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u0097\3\2\2\2\u0239"+
		"\u023a\5 \20\2\u023a\u023b\t\3\2\2\u023b\u023c\t\3\2\2\u023c\u023d\bL"+
		"\7\2\u023d\u0099\3\2\2\2\u023e\u023f\5 \20\2\u023f\u0240\t\3\2\2\u0240"+
		"\u0241\bM\b\2\u0241\u009b\3\2\2\2\u0242\u025f\7&\2\2\u0243\u0244\7/\2"+
		"\2\u0244\u0246\7/\2\2\u0245\u0243\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0247"+
		"\3\2\2\2\u0247\u0260\t\n\2\2\u0248\u0249\7]\2\2\u0249\u024a\7/\2\2\u024a"+
		"\u0260\7/\2\2\u024b\u024c\7]\2\2\u024c\u024d\7/\2\2\u024d\u024e\7/\2\2"+
		"\u024e\u024f\3\2\2\2\u024f\u0260\t\n\2\2\u0250\u0251\7>\2\2\u0251\u0252"+
		"\7/\2\2\u0252\u0253\7/\2\2\u0253\u0254\3\2\2\2\u0254\u0260\t\n\2\2\u0255"+
		"\u0256\7\'\2\2\u0256\u0257\7/\2\2\u0257\u0258\7/\2\2\u0258\u0259\3\2\2"+
		"\2\u0259\u0260\t\n\2\2\u025a\u025b\7]\2\2\u025b\u025c\7/\2\2\u025c\u025d"+
		"\7/\2\2\u025d\u025e\3\2\2\2\u025e\u0260\t\n\2\2\u025f\u0245\3\2\2\2\u025f"+
		"\u0248\3\2\2\2\u025f\u024b\3\2\2\2\u025f\u0250\3\2\2\2\u025f\u0255\3\2"+
		"\2\2\u025f\u025a\3\2\2\2\u0260\u009d\3\2\2\2/\2\3\u00b0\u00bd\u00c4\u00d2"+
		"\u00d5\u00e8\u00f1\u00f5\u00f9\u0103\u0112\u0114\u0117\u011f\u0126\u012f"+
		"\u0137\u014a\u014d\u0152\u015d\u0162\u0166\u0169\u016e\u0175\u017a\u017f"+
		"\u0185\u0187\u018b\u0191\u01b2\u01bd\u01cc\u0203\u021d\u0224\u022d\u0234"+
		"\u0237\u0245\u025f\t\3\5\2\3\6\3\3\7\4\3\b\5\3#\6\3L\7\3M\b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}