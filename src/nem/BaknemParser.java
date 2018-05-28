// Generated from BaknemParser.g4 by ANTLR 4.7.1
   
 package nem;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BaknemParser extends Parser {
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
		CHM_ARROW=61, LATIN_LETTER=62, FUN_ABBR=63, FUNCTION_NAME=64, TRAIL_FUN_ABBR=65, 
		LC_ROMAN_NUM_SEQ=66, SUPER_SUP=67, SUPER_SUB=68, SUPER_SUP_SUB=69, SUPER_SUB_SUB=70, 
		SUPER_SUP_SUP=71, SUPER_SUB_SUP=72, HOLLOW_DOT=73, BFPLUS=74, PLUS_MINUS=75, 
		BFMINUS=76, MINUS_PLUS=77;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_header3 = 2, RULE_funWithArg = 3, RULE_space = 4, 
		RULE_postpunc = 5, RULE_exprs = 6, RULE_expr = 7, RULE_layexpr = 8, RULE_nor = 9, 
		RULE_nor1 = 10, RULE_nor2 = 11, RULE_nor3 = 12, RULE_nom = 13, RULE_nof = 14, 
		RULE_nofc = 15, RULE_nofch = 16, RULE_mfrac = 17, RULE_mmfrac = 18, RULE_mmmfrac = 19, 
		RULE_rindex = 20, RULE_sqrt = 21, RULE_irad = 22, RULE_sqrt1 = 23, RULE_irad1 = 24, 
		RULE_sqrt2 = 25, RULE_irad2 = 26, RULE_sqrt3 = 27, RULE_irad3 = 28, RULE_nomod = 29, 
		RULE_begmod = 30, RULE_munder = 31, RULE_mover = 32, RULE_mundov = 33, 
		RULE_endmod = 34, RULE_varXfunabb = 35, RULE_funabb = 36, RULE_func = 37, 
		RULE_lgrp = 38, RULE_rgrp = 39, RULE_binop = 40, RULE_binop1 = 41, RULE_cmpr = 42, 
		RULE_singleLet = 43, RULE_var = 44, RULE_greeks = 45, RULE_specsym = 46, 
		RULE_number = 47, RULE_numsub = 48, RULE_chelement = 49, RULE_chnumsub = 50, 
		RULE_chradical = 51, RULE_chformula = 52, RULE_sup2 = 53, RULE_sup2b = 54, 
		RULE_sup22 = 55, RULE_sub2 = 56, RULE_sub2p = 57, RULE_sub22 = 58, RULE_base = 59, 
		RULE_script = 60, RULE_subscript = 61, RULE_supscript = 62, RULE_msub = 63, 
		RULE_msup = 64, RULE_msubsup = 65, RULE_mscript = 66;
	public static final String[] ruleNames = {
		"prog", "stat", "header3", "funWithArg", "space", "postpunc", "exprs", 
		"expr", "layexpr", "nor", "nor1", "nor2", "nor3", "nom", "nof", "nofc", 
		"nofch", "mfrac", "mmfrac", "mmmfrac", "rindex", "sqrt", "irad", "sqrt1", 
		"irad1", "sqrt2", "irad2", "sqrt3", "irad3", "nomod", "begmod", "munder", 
		"mover", "mundov", "endmod", "varXfunabb", "funabb", "func", "lgrp", "rgrp", 
		"binop", "binop1", "cmpr", "singleLet", "var", "greeks", "specsym", "number", 
		"numsub", "chelement", "chnumsub", "chradical", "chformula", "sup2", "sup2b", 
		"sup22", "sub2", "sub2p", "sub22", "base", "script", "subscript", "supscript", 
		"msub", "msup", "msubsup", "mscript"
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
		"INTEGRAL", "CHEM_ELEMENT", "POSS_CH_ELEMENT", "CHM_ARROW", "LATIN_LETTER", 
		"FUN_ABBR", "FUNCTION_NAME", "TRAIL_FUN_ABBR", "LC_ROMAN_NUM_SEQ", "SUPER_SUP", 
		"SUPER_SUB", "SUPER_SUP_SUB", "SUPER_SUB_SUB", "SUPER_SUP_SUP", "SUPER_SUB_SUP", 
		"HOLLOW_DOT", "BFPLUS", "PLUS_MINUS", "BFMINUS", "MINUS_PLUS"
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

	@Override
	public String getGrammarFileName() { return "BaknemParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BaknemParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(134);
				stat();
				}
				}
				setState(137); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (LC_ID - 3)) | (1L << (ID - 3)) | (1L << (MIXID - 3)) | (1L << (UC_ID - 3)) | (1L << (GREEK_LETTER - 3)) | (1L << (MISCALPHD4 - 3)) | (1L << (LGRP - 3)) | (1L << (INT - 3)) | (1L << (REAL - 3)) | (1L << (MODIF - 3)) | (1L << (MODOVER - 3)) | (1L << (SFRAC - 3)) | (1L << (CFRAC - 3)) | (1L << (HCFRAC - 3)) | (1L << (SQRT - 3)) | (1L << (SPACE - 3)) | (1L << (NEWLINE - 3)) | (1L << (INFINITY - 3)) | (1L << (INTEGRAL - 3)) | (1L << (CHEM_ELEMENT - 3)) | (1L << (POSS_CH_ELEMENT - 3)) | (1L << (FUN_ABBR - 3)) | (1L << (TRAIL_FUN_ABBR - 3)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public List<ExprsContext> exprs() {
			return getRuleContexts(ExprsContext.class);
		}
		public ExprsContext exprs(int i) {
			return getRuleContext(ExprsContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(BaknemParser.NEWLINE, 0); }
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		int _la;
		try {
			int _alt;
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LC_ID:
			case ID:
			case MIXID:
			case UC_ID:
			case GREEK_LETTER:
			case MISCALPHD4:
			case LGRP:
			case INT:
			case REAL:
			case MODIF:
			case MODOVER:
			case SFRAC:
			case CFRAC:
			case HCFRAC:
			case SQRT:
			case SPACE:
			case INFINITY:
			case INTEGRAL:
			case CHEM_ELEMENT:
			case POSS_CH_ELEMENT:
			case FUN_ABBR:
			case TRAIL_FUN_ABBR:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(139);
					space();
					}
					}
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(145);
				exprs();
				setState(155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(147); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(146);
							space();
							}
							}
							setState(149); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==SPACE );
						setState(151);
						exprs();
						}
						} 
					}
					setState(157);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(158);
					space();
					}
					}
					setState(163);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(164);
				match(NEWLINE);
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(NEWLINE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Header3Context extends ParserRuleContext {
		public TerminalNode BLURB() { return getToken(BaknemParser.BLURB, 0); }
		public Header3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterHeader3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitHeader3(this);
		}
	}

	public final Header3Context header3() throws RecognitionException {
		Header3Context _localctx = new Header3Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_header3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(BLURB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunWithArgContext extends ParserRuleContext {
		public TerminalNode MODIF() { return getToken(BaknemParser.MODIF, 0); }
		public FunabbContext funabb() {
			return getRuleContext(FunabbContext.class,0);
		}
		public SpaceContext space() {
			return getRuleContext(SpaceContext.class,0);
		}
		public LayexprContext layexpr() {
			return getRuleContext(LayexprContext.class,0);
		}
		public EndmodContext endmod() {
			return getRuleContext(EndmodContext.class,0);
		}
		public VarXfunabbContext varXfunabb() {
			return getRuleContext(VarXfunabbContext.class,0);
		}
		public TerminalNode MODUNDER() { return getToken(BaknemParser.MODUNDER, 0); }
		public TerminalNode MODOVER() { return getToken(BaknemParser.MODOVER, 0); }
		public TerminalNode SUB() { return getToken(BaknemParser.SUB, 0); }
		public ScriptContext script() {
			return getRuleContext(ScriptContext.class,0);
		}
		public TerminalNode SUP() { return getToken(BaknemParser.SUP, 0); }
		public FunWithArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funWithArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterFunWithArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitFunWithArg(this);
		}
	}

	public final FunWithArgContext funWithArg() throws RecognitionException {
		FunWithArgContext _localctx = new FunWithArgContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funWithArg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODIF:
				{
				setState(171);
				match(MODIF);
				setState(172);
				funabb();
				{
				setState(173);
				_la = _input.LA(1);
				if ( !(_la==MODOVER || _la==MODUNDER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(174);
				endmod();
				}
				}
				break;
			case FUN_ABBR:
			case TRAIL_FUN_ABBR:
				{
				setState(178);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FUN_ABBR:
					{
					setState(176);
					funabb();
					}
					break;
				case TRAIL_FUN_ABBR:
					{
					setState(177);
					varXfunabb();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(184);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SUB:
					{
					setState(180);
					match(SUB);
					setState(181);
					script();
					}
					break;
				case SUP:
					{
					setState(182);
					match(SUP);
					setState(183);
					script();
					}
					break;
				case SPACE:
					break;
				default:
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			{
			setState(188);
			space();
			setState(189);
			layexpr(0);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpaceContext extends ParserRuleContext {
		public TerminalNode SPACE() { return getToken(BaknemParser.SPACE, 0); }
		public SpaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_space; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterSpace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitSpace(this);
		}
	}

	public final SpaceContext space() throws RecognitionException {
		SpaceContext _localctx = new SpaceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_space);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(SPACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostpuncContext extends ParserRuleContext {
		public TerminalNode PI_PUNC() { return getToken(BaknemParser.PI_PUNC, 0); }
		public PostpuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postpunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterPostpunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitPostpunc(this);
		}
	}

	public final PostpuncContext postpunc() throws RecognitionException {
		PostpuncContext _localctx = new PostpuncContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_postpunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(PI_PUNC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprsContext extends ParserRuleContext {
		public FunWithArgContext funWithArg() {
			return getRuleContext(FunWithArgContext.class,0);
		}
		public LayexprContext layexpr() {
			return getRuleContext(LayexprContext.class,0);
		}
		public PostpuncContext postpunc() {
			return getRuleContext(PostpuncContext.class,0);
		}
		public ExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitExprs(this);
		}
	}

	public final ExprsContext exprs() throws RecognitionException {
		ExprsContext _localctx = new ExprsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_exprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(195);
				funWithArg();
				}
				break;
			case 2:
				{
				setState(196);
				layexpr(0);
				}
				break;
			}
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PI_PUNC) {
				{
				setState(199);
				postpunc();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public LgrpContext lgrp() {
			return getRuleContext(LgrpContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RgrpContext rgrp() {
			return getRuleContext(RgrpContext.class,0);
		}
		public NumsubContext numsub() {
			return getRuleContext(NumsubContext.class,0);
		}
		public ChnumsubContext chnumsub() {
			return getRuleContext(ChnumsubContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public SpecsymContext specsym() {
			return getRuleContext(SpecsymContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ChelementContext chelement() {
			return getRuleContext(ChelementContext.class,0);
		}
		public ChformulaContext chformula() {
			return getRuleContext(ChformulaContext.class,0);
		}
		public Binop1Context binop1() {
			return getRuleContext(Binop1Context.class,0);
		}
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public CmprContext cmpr() {
			return getRuleContext(CmprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(203);
				lgrp();
				setState(204);
				expr(0);
				setState(205);
				rgrp();
				}
				break;
			case 2:
				{
				setState(207);
				numsub();
				}
				break;
			case 3:
				{
				setState(208);
				chnumsub();
				}
				break;
			case 4:
				{
				setState(209);
				var();
				}
				break;
			case 5:
				{
				setState(210);
				specsym();
				}
				break;
			case 6:
				{
				setState(211);
				number();
				}
				break;
			case 7:
				{
				setState(212);
				chelement();
				}
				break;
			case 8:
				{
				setState(213);
				chformula();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(230);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(216);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(217);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(218);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(219);
						binop1();
						setState(220);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(222);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(223);
						binop();
						setState(224);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(226);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(227);
						cmpr();
						setState(228);
						expr(9);
						}
						break;
					}
					} 
				}
				setState(234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LayexprContext extends ParserRuleContext {
		public LgrpContext lgrp() {
			return getRuleContext(LgrpContext.class,0);
		}
		public List<LayexprContext> layexpr() {
			return getRuleContexts(LayexprContext.class);
		}
		public LayexprContext layexpr(int i) {
			return getRuleContext(LayexprContext.class,i);
		}
		public RgrpContext rgrp() {
			return getRuleContext(RgrpContext.class,0);
		}
		public MfracContext mfrac() {
			return getRuleContext(MfracContext.class,0);
		}
		public MmfracContext mmfrac() {
			return getRuleContext(MmfracContext.class,0);
		}
		public MmmfracContext mmmfrac() {
			return getRuleContext(MmmfracContext.class,0);
		}
		public MunderContext munder() {
			return getRuleContext(MunderContext.class,0);
		}
		public MoverContext mover() {
			return getRuleContext(MoverContext.class,0);
		}
		public MundovContext mundov() {
			return getRuleContext(MundovContext.class,0);
		}
		public MscriptContext mscript() {
			return getRuleContext(MscriptContext.class,0);
		}
		public SqrtContext sqrt() {
			return getRuleContext(SqrtContext.class,0);
		}
		public IradContext irad() {
			return getRuleContext(IradContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public Binop1Context binop1() {
			return getRuleContext(Binop1Context.class,0);
		}
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public CmprContext cmpr() {
			return getRuleContext(CmprContext.class,0);
		}
		public LayexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterLayexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitLayexpr(this);
		}
	}

	public final LayexprContext layexpr() throws RecognitionException {
		return layexpr(0);
	}

	private LayexprContext layexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LayexprContext _localctx = new LayexprContext(_ctx, _parentState);
		LayexprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_layexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(236);
				lgrp();
				setState(237);
				layexpr(0);
				setState(238);
				rgrp();
				}
				break;
			case 2:
				{
				setState(240);
				mfrac();
				}
				break;
			case 3:
				{
				setState(241);
				mmfrac();
				}
				break;
			case 4:
				{
				setState(242);
				mmmfrac();
				}
				break;
			case 5:
				{
				setState(243);
				munder();
				}
				break;
			case 6:
				{
				setState(244);
				mover();
				}
				break;
			case 7:
				{
				setState(245);
				mundov();
				}
				break;
			case 8:
				{
				setState(246);
				mscript();
				}
				break;
			case 9:
				{
				setState(247);
				sqrt();
				}
				break;
			case 10:
				{
				setState(248);
				irad();
				}
				break;
			case 11:
				{
				setState(249);
				expr(0);
				}
				break;
			case 12:
				{
				setState(250);
				func();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(269);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(267);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new LayexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_layexpr);
						setState(253);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(254);
						layexpr(17);
						}
						break;
					case 2:
						{
						_localctx = new LayexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_layexpr);
						setState(255);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(256);
						binop1();
						setState(257);
						layexpr(15);
						}
						break;
					case 3:
						{
						_localctx = new LayexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_layexpr);
						setState(259);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(260);
						binop();
						setState(261);
						layexpr(14);
						}
						break;
					case 4:
						{
						_localctx = new LayexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_layexpr);
						setState(263);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(264);
						cmpr();
						setState(265);
						layexpr(13);
						}
						break;
					}
					} 
				}
				setState(271);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NorContext extends ParserRuleContext {
		public LgrpContext lgrp() {
			return getRuleContext(LgrpContext.class,0);
		}
		public List<NorContext> nor() {
			return getRuleContexts(NorContext.class);
		}
		public NorContext nor(int i) {
			return getRuleContext(NorContext.class,i);
		}
		public RgrpContext rgrp() {
			return getRuleContext(RgrpContext.class,0);
		}
		public MfracContext mfrac() {
			return getRuleContext(MfracContext.class,0);
		}
		public MmfracContext mmfrac() {
			return getRuleContext(MmfracContext.class,0);
		}
		public MmmfracContext mmmfrac() {
			return getRuleContext(MmmfracContext.class,0);
		}
		public MunderContext munder() {
			return getRuleContext(MunderContext.class,0);
		}
		public MoverContext mover() {
			return getRuleContext(MoverContext.class,0);
		}
		public MundovContext mundov() {
			return getRuleContext(MundovContext.class,0);
		}
		public MscriptContext mscript() {
			return getRuleContext(MscriptContext.class,0);
		}
		public Irad1Context irad1() {
			return getRuleContext(Irad1Context.class,0);
		}
		public Sqrt1Context sqrt1() {
			return getRuleContext(Sqrt1Context.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public Binop1Context binop1() {
			return getRuleContext(Binop1Context.class,0);
		}
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public NorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterNor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitNor(this);
		}
	}

	public final NorContext nor() throws RecognitionException {
		return nor(0);
	}

	private NorContext nor(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NorContext _localctx = new NorContext(_ctx, _parentState);
		NorContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_nor, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(273);
				lgrp();
				setState(274);
				nor(0);
				setState(275);
				rgrp();
				}
				break;
			case 2:
				{
				setState(277);
				mfrac();
				}
				break;
			case 3:
				{
				setState(278);
				mmfrac();
				}
				break;
			case 4:
				{
				setState(279);
				mmmfrac();
				}
				break;
			case 5:
				{
				setState(280);
				munder();
				}
				break;
			case 6:
				{
				setState(281);
				mover();
				}
				break;
			case 7:
				{
				setState(282);
				mundov();
				}
				break;
			case 8:
				{
				setState(283);
				mscript();
				}
				break;
			case 9:
				{
				setState(284);
				irad1();
				}
				break;
			case 10:
				{
				setState(285);
				sqrt1();
				}
				break;
			case 11:
				{
				setState(286);
				expr(0);
				}
				break;
			case 12:
				{
				setState(287);
				func();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(302);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(300);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new NorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor);
						setState(290);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(291);
						nor(15);
						}
						break;
					case 2:
						{
						_localctx = new NorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor);
						setState(292);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(293);
						binop1();
						setState(294);
						nor(14);
						}
						break;
					case 3:
						{
						_localctx = new NorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor);
						setState(296);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(297);
						binop();
						setState(298);
						nor(13);
						}
						break;
					}
					} 
				}
				setState(304);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Nor1Context extends ParserRuleContext {
		public LgrpContext lgrp() {
			return getRuleContext(LgrpContext.class,0);
		}
		public List<Nor1Context> nor1() {
			return getRuleContexts(Nor1Context.class);
		}
		public Nor1Context nor1(int i) {
			return getRuleContext(Nor1Context.class,i);
		}
		public RgrpContext rgrp() {
			return getRuleContext(RgrpContext.class,0);
		}
		public MfracContext mfrac() {
			return getRuleContext(MfracContext.class,0);
		}
		public MmfracContext mmfrac() {
			return getRuleContext(MmfracContext.class,0);
		}
		public MmmfracContext mmmfrac() {
			return getRuleContext(MmmfracContext.class,0);
		}
		public MunderContext munder() {
			return getRuleContext(MunderContext.class,0);
		}
		public MoverContext mover() {
			return getRuleContext(MoverContext.class,0);
		}
		public MundovContext mundov() {
			return getRuleContext(MundovContext.class,0);
		}
		public MscriptContext mscript() {
			return getRuleContext(MscriptContext.class,0);
		}
		public Irad2Context irad2() {
			return getRuleContext(Irad2Context.class,0);
		}
		public Sqrt2Context sqrt2() {
			return getRuleContext(Sqrt2Context.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public Binop1Context binop1() {
			return getRuleContext(Binop1Context.class,0);
		}
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public Nor1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nor1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterNor1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitNor1(this);
		}
	}

	public final Nor1Context nor1() throws RecognitionException {
		return nor1(0);
	}

	private Nor1Context nor1(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Nor1Context _localctx = new Nor1Context(_ctx, _parentState);
		Nor1Context _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_nor1, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(306);
				lgrp();
				setState(307);
				nor1(0);
				setState(308);
				rgrp();
				}
				break;
			case 2:
				{
				setState(310);
				mfrac();
				}
				break;
			case 3:
				{
				setState(311);
				mmfrac();
				}
				break;
			case 4:
				{
				setState(312);
				mmmfrac();
				}
				break;
			case 5:
				{
				setState(313);
				munder();
				}
				break;
			case 6:
				{
				setState(314);
				mover();
				}
				break;
			case 7:
				{
				setState(315);
				mundov();
				}
				break;
			case 8:
				{
				setState(316);
				mscript();
				}
				break;
			case 9:
				{
				setState(317);
				irad2();
				}
				break;
			case 10:
				{
				setState(318);
				sqrt2();
				}
				break;
			case 11:
				{
				setState(319);
				expr(0);
				}
				break;
			case 12:
				{
				setState(320);
				func();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(335);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(333);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new Nor1Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor1);
						setState(323);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(324);
						nor1(15);
						}
						break;
					case 2:
						{
						_localctx = new Nor1Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor1);
						setState(325);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(326);
						binop1();
						setState(327);
						nor1(14);
						}
						break;
					case 3:
						{
						_localctx = new Nor1Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor1);
						setState(329);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(330);
						binop();
						setState(331);
						nor1(13);
						}
						break;
					}
					} 
				}
				setState(337);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Nor2Context extends ParserRuleContext {
		public LgrpContext lgrp() {
			return getRuleContext(LgrpContext.class,0);
		}
		public List<Nor2Context> nor2() {
			return getRuleContexts(Nor2Context.class);
		}
		public Nor2Context nor2(int i) {
			return getRuleContext(Nor2Context.class,i);
		}
		public RgrpContext rgrp() {
			return getRuleContext(RgrpContext.class,0);
		}
		public MfracContext mfrac() {
			return getRuleContext(MfracContext.class,0);
		}
		public MmfracContext mmfrac() {
			return getRuleContext(MmfracContext.class,0);
		}
		public MmmfracContext mmmfrac() {
			return getRuleContext(MmmfracContext.class,0);
		}
		public MunderContext munder() {
			return getRuleContext(MunderContext.class,0);
		}
		public MoverContext mover() {
			return getRuleContext(MoverContext.class,0);
		}
		public MundovContext mundov() {
			return getRuleContext(MundovContext.class,0);
		}
		public MscriptContext mscript() {
			return getRuleContext(MscriptContext.class,0);
		}
		public Irad3Context irad3() {
			return getRuleContext(Irad3Context.class,0);
		}
		public Sqrt3Context sqrt3() {
			return getRuleContext(Sqrt3Context.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public Binop1Context binop1() {
			return getRuleContext(Binop1Context.class,0);
		}
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public Nor2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nor2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterNor2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitNor2(this);
		}
	}

	public final Nor2Context nor2() throws RecognitionException {
		return nor2(0);
	}

	private Nor2Context nor2(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Nor2Context _localctx = new Nor2Context(_ctx, _parentState);
		Nor2Context _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_nor2, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(339);
				lgrp();
				setState(340);
				nor2(0);
				setState(341);
				rgrp();
				}
				break;
			case 2:
				{
				setState(343);
				mfrac();
				}
				break;
			case 3:
				{
				setState(344);
				mmfrac();
				}
				break;
			case 4:
				{
				setState(345);
				mmmfrac();
				}
				break;
			case 5:
				{
				setState(346);
				munder();
				}
				break;
			case 6:
				{
				setState(347);
				mover();
				}
				break;
			case 7:
				{
				setState(348);
				mundov();
				}
				break;
			case 8:
				{
				setState(349);
				mscript();
				}
				break;
			case 9:
				{
				setState(350);
				irad3();
				}
				break;
			case 10:
				{
				setState(351);
				sqrt3();
				}
				break;
			case 11:
				{
				setState(352);
				expr(0);
				}
				break;
			case 12:
				{
				setState(353);
				func();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(368);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(366);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new Nor2Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor2);
						setState(356);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(357);
						nor2(15);
						}
						break;
					case 2:
						{
						_localctx = new Nor2Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor2);
						setState(358);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(359);
						binop1();
						setState(360);
						nor2(14);
						}
						break;
					case 3:
						{
						_localctx = new Nor2Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor2);
						setState(362);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(363);
						binop();
						setState(364);
						nor2(13);
						}
						break;
					}
					} 
				}
				setState(370);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Nor3Context extends ParserRuleContext {
		public LgrpContext lgrp() {
			return getRuleContext(LgrpContext.class,0);
		}
		public List<Nor3Context> nor3() {
			return getRuleContexts(Nor3Context.class);
		}
		public Nor3Context nor3(int i) {
			return getRuleContext(Nor3Context.class,i);
		}
		public RgrpContext rgrp() {
			return getRuleContext(RgrpContext.class,0);
		}
		public MfracContext mfrac() {
			return getRuleContext(MfracContext.class,0);
		}
		public MmfracContext mmfrac() {
			return getRuleContext(MmfracContext.class,0);
		}
		public MmmfracContext mmmfrac() {
			return getRuleContext(MmmfracContext.class,0);
		}
		public MunderContext munder() {
			return getRuleContext(MunderContext.class,0);
		}
		public MoverContext mover() {
			return getRuleContext(MoverContext.class,0);
		}
		public MundovContext mundov() {
			return getRuleContext(MundovContext.class,0);
		}
		public MscriptContext mscript() {
			return getRuleContext(MscriptContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public Binop1Context binop1() {
			return getRuleContext(Binop1Context.class,0);
		}
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public Nor3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nor3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterNor3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitNor3(this);
		}
	}

	public final Nor3Context nor3() throws RecognitionException {
		return nor3(0);
	}

	private Nor3Context nor3(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Nor3Context _localctx = new Nor3Context(_ctx, _parentState);
		Nor3Context _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_nor3, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(372);
				lgrp();
				setState(373);
				nor3(0);
				setState(374);
				rgrp();
				}
				break;
			case 2:
				{
				setState(376);
				mfrac();
				}
				break;
			case 3:
				{
				setState(377);
				mmfrac();
				}
				break;
			case 4:
				{
				setState(378);
				mmmfrac();
				}
				break;
			case 5:
				{
				setState(379);
				munder();
				}
				break;
			case 6:
				{
				setState(380);
				mover();
				}
				break;
			case 7:
				{
				setState(381);
				mundov();
				}
				break;
			case 8:
				{
				setState(382);
				mscript();
				}
				break;
			case 9:
				{
				setState(383);
				expr(0);
				}
				break;
			case 10:
				{
				setState(384);
				func();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(399);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(397);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new Nor3Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor3);
						setState(387);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(388);
						nor3(13);
						}
						break;
					case 2:
						{
						_localctx = new Nor3Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor3);
						setState(389);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(390);
						binop1();
						setState(391);
						nor3(12);
						}
						break;
					case 3:
						{
						_localctx = new Nor3Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor3);
						setState(393);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(394);
						binop();
						setState(395);
						nor3(11);
						}
						break;
					}
					} 
				}
				setState(401);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NomContext extends ParserRuleContext {
		public LgrpContext lgrp() {
			return getRuleContext(LgrpContext.class,0);
		}
		public List<NomContext> nom() {
			return getRuleContexts(NomContext.class);
		}
		public NomContext nom(int i) {
			return getRuleContext(NomContext.class,i);
		}
		public RgrpContext rgrp() {
			return getRuleContext(RgrpContext.class,0);
		}
		public MfracContext mfrac() {
			return getRuleContext(MfracContext.class,0);
		}
		public MmfracContext mmfrac() {
			return getRuleContext(MmfracContext.class,0);
		}
		public MmmfracContext mmmfrac() {
			return getRuleContext(MmmfracContext.class,0);
		}
		public MunderContext munder() {
			return getRuleContext(MunderContext.class,0);
		}
		public MoverContext mover() {
			return getRuleContext(MoverContext.class,0);
		}
		public MundovContext mundov() {
			return getRuleContext(MundovContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FunWithArgContext funWithArg() {
			return getRuleContext(FunWithArgContext.class,0);
		}
		public SqrtContext sqrt() {
			return getRuleContext(SqrtContext.class,0);
		}
		public IradContext irad() {
			return getRuleContext(IradContext.class,0);
		}
		public Binop1Context binop1() {
			return getRuleContext(Binop1Context.class,0);
		}
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public CmprContext cmpr() {
			return getRuleContext(CmprContext.class,0);
		}
		public NomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterNom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitNom(this);
		}
	}

	public final NomContext nom() throws RecognitionException {
		return nom(0);
	}

	private NomContext nom(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NomContext _localctx = new NomContext(_ctx, _parentState);
		NomContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_nom, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(403);
				lgrp();
				setState(404);
				nom(0);
				setState(405);
				rgrp();
				}
				break;
			case 2:
				{
				setState(407);
				mfrac();
				}
				break;
			case 3:
				{
				setState(408);
				mmfrac();
				}
				break;
			case 4:
				{
				setState(409);
				mmmfrac();
				}
				break;
			case 5:
				{
				setState(410);
				munder();
				}
				break;
			case 6:
				{
				setState(411);
				mover();
				}
				break;
			case 7:
				{
				setState(412);
				mundov();
				}
				break;
			case 8:
				{
				setState(413);
				expr(0);
				}
				break;
			case 9:
				{
				setState(414);
				funWithArg();
				}
				break;
			case 10:
				{
				setState(415);
				sqrt();
				}
				break;
			case 11:
				{
				setState(416);
				irad();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(435);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(433);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new NomContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nom);
						setState(419);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(420);
						nom(15);
						}
						break;
					case 2:
						{
						_localctx = new NomContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nom);
						setState(421);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(422);
						binop1();
						setState(423);
						nom(14);
						}
						break;
					case 3:
						{
						_localctx = new NomContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nom);
						setState(425);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(426);
						binop();
						setState(427);
						nom(13);
						}
						break;
					case 4:
						{
						_localctx = new NomContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nom);
						setState(429);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(430);
						cmpr();
						setState(431);
						nom(12);
						}
						break;
					}
					} 
				}
				setState(437);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NofContext extends ParserRuleContext {
		public LgrpContext lgrp() {
			return getRuleContext(LgrpContext.class,0);
		}
		public List<NofContext> nof() {
			return getRuleContexts(NofContext.class);
		}
		public NofContext nof(int i) {
			return getRuleContext(NofContext.class,i);
		}
		public RgrpContext rgrp() {
			return getRuleContext(RgrpContext.class,0);
		}
		public MunderContext munder() {
			return getRuleContext(MunderContext.class,0);
		}
		public MoverContext mover() {
			return getRuleContext(MoverContext.class,0);
		}
		public MundovContext mundov() {
			return getRuleContext(MundovContext.class,0);
		}
		public MscriptContext mscript() {
			return getRuleContext(MscriptContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public SqrtContext sqrt() {
			return getRuleContext(SqrtContext.class,0);
		}
		public IradContext irad() {
			return getRuleContext(IradContext.class,0);
		}
		public Binop1Context binop1() {
			return getRuleContext(Binop1Context.class,0);
		}
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public CmprContext cmpr() {
			return getRuleContext(CmprContext.class,0);
		}
		public NofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterNof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitNof(this);
		}
	}

	public final NofContext nof() throws RecognitionException {
		return nof(0);
	}

	private NofContext nof(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NofContext _localctx = new NofContext(_ctx, _parentState);
		NofContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_nof, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(439);
				lgrp();
				setState(440);
				nof(0);
				setState(441);
				rgrp();
				}
				break;
			case 2:
				{
				setState(443);
				munder();
				}
				break;
			case 3:
				{
				setState(444);
				mover();
				}
				break;
			case 4:
				{
				setState(445);
				mundov();
				}
				break;
			case 5:
				{
				setState(446);
				mscript();
				}
				break;
			case 6:
				{
				setState(447);
				expr(0);
				}
				break;
			case 7:
				{
				setState(448);
				func();
				}
				break;
			case 8:
				{
				setState(449);
				sqrt();
				}
				break;
			case 9:
				{
				setState(450);
				irad();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(469);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(467);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						_localctx = new NofContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nof);
						setState(453);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(454);
						nof(13);
						}
						break;
					case 2:
						{
						_localctx = new NofContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nof);
						setState(455);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(456);
						binop1();
						setState(457);
						nof(12);
						}
						break;
					case 3:
						{
						_localctx = new NofContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nof);
						setState(459);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(460);
						binop();
						setState(461);
						nof(11);
						}
						break;
					case 4:
						{
						_localctx = new NofContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nof);
						setState(463);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(464);
						cmpr();
						setState(465);
						nof(10);
						}
						break;
					}
					} 
				}
				setState(471);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NofcContext extends ParserRuleContext {
		public LgrpContext lgrp() {
			return getRuleContext(LgrpContext.class,0);
		}
		public List<NofcContext> nofc() {
			return getRuleContexts(NofcContext.class);
		}
		public NofcContext nofc(int i) {
			return getRuleContext(NofcContext.class,i);
		}
		public RgrpContext rgrp() {
			return getRuleContext(RgrpContext.class,0);
		}
		public MunderContext munder() {
			return getRuleContext(MunderContext.class,0);
		}
		public MoverContext mover() {
			return getRuleContext(MoverContext.class,0);
		}
		public MundovContext mundov() {
			return getRuleContext(MundovContext.class,0);
		}
		public MscriptContext mscript() {
			return getRuleContext(MscriptContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public MfracContext mfrac() {
			return getRuleContext(MfracContext.class,0);
		}
		public SqrtContext sqrt() {
			return getRuleContext(SqrtContext.class,0);
		}
		public IradContext irad() {
			return getRuleContext(IradContext.class,0);
		}
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public CmprContext cmpr() {
			return getRuleContext(CmprContext.class,0);
		}
		public Binop1Context binop1() {
			return getRuleContext(Binop1Context.class,0);
		}
		public NofContext nof() {
			return getRuleContext(NofContext.class,0);
		}
		public NofcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nofc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterNofc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitNofc(this);
		}
	}

	public final NofcContext nofc() throws RecognitionException {
		return nofc(0);
	}

	private NofcContext nofc(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NofcContext _localctx = new NofcContext(_ctx, _parentState);
		NofcContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_nofc, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(473);
				lgrp();
				setState(474);
				nofc(0);
				setState(475);
				rgrp();
				}
				break;
			case 2:
				{
				setState(477);
				munder();
				}
				break;
			case 3:
				{
				setState(478);
				mover();
				}
				break;
			case 4:
				{
				setState(479);
				mundov();
				}
				break;
			case 5:
				{
				setState(480);
				mscript();
				}
				break;
			case 6:
				{
				setState(481);
				expr(0);
				}
				break;
			case 7:
				{
				setState(482);
				func();
				}
				break;
			case 8:
				{
				setState(483);
				mfrac();
				}
				break;
			case 9:
				{
				setState(484);
				sqrt();
				}
				break;
			case 10:
				{
				setState(485);
				irad();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(504);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(502);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						_localctx = new NofcContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nofc);
						setState(488);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(489);
						nofc(14);
						}
						break;
					case 2:
						{
						_localctx = new NofcContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nofc);
						setState(490);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(491);
						binop();
						setState(492);
						nofc(12);
						}
						break;
					case 3:
						{
						_localctx = new NofcContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nofc);
						setState(494);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(495);
						cmpr();
						setState(496);
						nofc(11);
						}
						break;
					case 4:
						{
						_localctx = new NofcContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nofc);
						setState(498);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(499);
						binop1();
						setState(500);
						nof(0);
						}
						break;
					}
					} 
				}
				setState(506);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NofchContext extends ParserRuleContext {
		public LgrpContext lgrp() {
			return getRuleContext(LgrpContext.class,0);
		}
		public List<NofchContext> nofch() {
			return getRuleContexts(NofchContext.class);
		}
		public NofchContext nofch(int i) {
			return getRuleContext(NofchContext.class,i);
		}
		public RgrpContext rgrp() {
			return getRuleContext(RgrpContext.class,0);
		}
		public MunderContext munder() {
			return getRuleContext(MunderContext.class,0);
		}
		public MoverContext mover() {
			return getRuleContext(MoverContext.class,0);
		}
		public MundovContext mundov() {
			return getRuleContext(MundovContext.class,0);
		}
		public MscriptContext mscript() {
			return getRuleContext(MscriptContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public MfracContext mfrac() {
			return getRuleContext(MfracContext.class,0);
		}
		public MmfracContext mmfrac() {
			return getRuleContext(MmfracContext.class,0);
		}
		public SqrtContext sqrt() {
			return getRuleContext(SqrtContext.class,0);
		}
		public IradContext irad() {
			return getRuleContext(IradContext.class,0);
		}
		public Binop1Context binop1() {
			return getRuleContext(Binop1Context.class,0);
		}
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public CmprContext cmpr() {
			return getRuleContext(CmprContext.class,0);
		}
		public NofchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nofch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterNofch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitNofch(this);
		}
	}

	public final NofchContext nofch() throws RecognitionException {
		return nofch(0);
	}

	private NofchContext nofch(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NofchContext _localctx = new NofchContext(_ctx, _parentState);
		NofchContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_nofch, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(508);
				lgrp();
				setState(509);
				nofch(0);
				setState(510);
				rgrp();
				}
				break;
			case 2:
				{
				setState(512);
				munder();
				}
				break;
			case 3:
				{
				setState(513);
				mover();
				}
				break;
			case 4:
				{
				setState(514);
				mundov();
				}
				break;
			case 5:
				{
				setState(515);
				mscript();
				}
				break;
			case 6:
				{
				setState(516);
				expr(0);
				}
				break;
			case 7:
				{
				setState(517);
				func();
				}
				break;
			case 8:
				{
				setState(518);
				mfrac();
				}
				break;
			case 9:
				{
				setState(519);
				mmfrac();
				}
				break;
			case 10:
				{
				setState(520);
				sqrt();
				}
				break;
			case 11:
				{
				setState(521);
				irad();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(540);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(538);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						_localctx = new NofchContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nofch);
						setState(524);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(525);
						nofch(15);
						}
						break;
					case 2:
						{
						_localctx = new NofchContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nofch);
						setState(526);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(527);
						binop1();
						setState(528);
						nofch(14);
						}
						break;
					case 3:
						{
						_localctx = new NofchContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nofch);
						setState(530);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(531);
						binop();
						setState(532);
						nofch(13);
						}
						break;
					case 4:
						{
						_localctx = new NofchContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nofch);
						setState(534);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(535);
						cmpr();
						setState(536);
						nofch(12);
						}
						break;
					}
					} 
				}
				setState(542);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MfracContext extends ParserRuleContext {
		public TerminalNode SFRAC() { return getToken(BaknemParser.SFRAC, 0); }
		public List<NofContext> nof() {
			return getRuleContexts(NofContext.class);
		}
		public NofContext nof(int i) {
			return getRuleContext(NofContext.class,i);
		}
		public TerminalNode FRAC_SLASH() { return getToken(BaknemParser.FRAC_SLASH, 0); }
		public TerminalNode ESFRAC() { return getToken(BaknemParser.ESFRAC, 0); }
		public MfracContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mfrac; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterMfrac(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitMfrac(this);
		}
	}

	public final MfracContext mfrac() throws RecognitionException {
		MfracContext _localctx = new MfracContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_mfrac);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			match(SFRAC);
			setState(544);
			nof(0);
			setState(545);
			match(FRAC_SLASH);
			setState(546);
			nof(0);
			setState(547);
			match(ESFRAC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MmfracContext extends ParserRuleContext {
		public TerminalNode CFRAC() { return getToken(BaknemParser.CFRAC, 0); }
		public List<NofcContext> nofc() {
			return getRuleContexts(NofcContext.class);
		}
		public NofcContext nofc(int i) {
			return getRuleContext(NofcContext.class,i);
		}
		public TerminalNode CSLASH() { return getToken(BaknemParser.CSLASH, 0); }
		public TerminalNode ECFRAC() { return getToken(BaknemParser.ECFRAC, 0); }
		public MmfracContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mmfrac; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterMmfrac(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitMmfrac(this);
		}
	}

	public final MmfracContext mmfrac() throws RecognitionException {
		MmfracContext _localctx = new MmfracContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_mmfrac);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			match(CFRAC);
			setState(550);
			nofc(0);
			setState(551);
			match(CSLASH);
			setState(552);
			nofc(0);
			setState(553);
			match(ECFRAC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MmmfracContext extends ParserRuleContext {
		public TerminalNode HCFRAC() { return getToken(BaknemParser.HCFRAC, 0); }
		public List<NofchContext> nofch() {
			return getRuleContexts(NofchContext.class);
		}
		public NofchContext nofch(int i) {
			return getRuleContext(NofchContext.class,i);
		}
		public TerminalNode HCSLASH() { return getToken(BaknemParser.HCSLASH, 0); }
		public TerminalNode EHCFRAC() { return getToken(BaknemParser.EHCFRAC, 0); }
		public MmmfracContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mmmfrac; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterMmmfrac(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitMmmfrac(this);
		}
	}

	public final MmmfracContext mmmfrac() throws RecognitionException {
		MmmfracContext _localctx = new MmmfracContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_mmmfrac);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			match(HCFRAC);
			setState(556);
			nofch(0);
			setState(557);
			match(HCSLASH);
			setState(558);
			nofch(0);
			setState(559);
			match(EHCFRAC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RindexContext extends ParserRuleContext {
		public Nor3Context nor3() {
			return getRuleContext(Nor3Context.class,0);
		}
		public RindexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rindex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterRindex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitRindex(this);
		}
	}

	public final RindexContext rindex() throws RecognitionException {
		RindexContext _localctx = new RindexContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_rindex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			nor3(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqrtContext extends ParserRuleContext {
		public TerminalNode SQRT() { return getToken(BaknemParser.SQRT, 0); }
		public NorContext nor() {
			return getRuleContext(NorContext.class,0);
		}
		public TerminalNode TERM() { return getToken(BaknemParser.TERM, 0); }
		public SqrtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqrt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterSqrt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitSqrt(this);
		}
	}

	public final SqrtContext sqrt() throws RecognitionException {
		SqrtContext _localctx = new SqrtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_sqrt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			match(SQRT);
			setState(564);
			nor(0);
			setState(565);
			match(TERM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IradContext extends ParserRuleContext {
		public TerminalNode MODOVER() { return getToken(BaknemParser.MODOVER, 0); }
		public RindexContext rindex() {
			return getRuleContext(RindexContext.class,0);
		}
		public TerminalNode SQRT() { return getToken(BaknemParser.SQRT, 0); }
		public NorContext nor() {
			return getRuleContext(NorContext.class,0);
		}
		public TerminalNode TERM() { return getToken(BaknemParser.TERM, 0); }
		public IradContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_irad; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterIrad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitIrad(this);
		}
	}

	public final IradContext irad() throws RecognitionException {
		IradContext _localctx = new IradContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_irad);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			match(MODOVER);
			setState(568);
			rindex();
			setState(569);
			match(SQRT);
			setState(570);
			nor(0);
			setState(571);
			match(TERM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sqrt1Context extends ParserRuleContext {
		public TerminalNode SQRT1() { return getToken(BaknemParser.SQRT1, 0); }
		public Nor1Context nor1() {
			return getRuleContext(Nor1Context.class,0);
		}
		public TerminalNode RTRM1() { return getToken(BaknemParser.RTRM1, 0); }
		public Sqrt1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqrt1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterSqrt1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitSqrt1(this);
		}
	}

	public final Sqrt1Context sqrt1() throws RecognitionException {
		Sqrt1Context _localctx = new Sqrt1Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_sqrt1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			match(SQRT1);
			setState(574);
			nor1(0);
			setState(575);
			match(RTRM1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Irad1Context extends ParserRuleContext {
		public TerminalNode IRAD1() { return getToken(BaknemParser.IRAD1, 0); }
		public RindexContext rindex() {
			return getRuleContext(RindexContext.class,0);
		}
		public TerminalNode SQRT() { return getToken(BaknemParser.SQRT, 0); }
		public Nor1Context nor1() {
			return getRuleContext(Nor1Context.class,0);
		}
		public TerminalNode RTRM1() { return getToken(BaknemParser.RTRM1, 0); }
		public Irad1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_irad1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterIrad1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitIrad1(this);
		}
	}

	public final Irad1Context irad1() throws RecognitionException {
		Irad1Context _localctx = new Irad1Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_irad1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			match(IRAD1);
			setState(578);
			rindex();
			setState(579);
			match(SQRT);
			setState(580);
			nor1(0);
			setState(581);
			match(RTRM1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sqrt2Context extends ParserRuleContext {
		public TerminalNode SQRT2() { return getToken(BaknemParser.SQRT2, 0); }
		public Nor2Context nor2() {
			return getRuleContext(Nor2Context.class,0);
		}
		public TerminalNode RTRM2() { return getToken(BaknemParser.RTRM2, 0); }
		public Sqrt2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqrt2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterSqrt2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitSqrt2(this);
		}
	}

	public final Sqrt2Context sqrt2() throws RecognitionException {
		Sqrt2Context _localctx = new Sqrt2Context(_ctx, getState());
		enterRule(_localctx, 50, RULE_sqrt2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			match(SQRT2);
			setState(584);
			nor2(0);
			setState(585);
			match(RTRM2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Irad2Context extends ParserRuleContext {
		public TerminalNode IRAD2() { return getToken(BaknemParser.IRAD2, 0); }
		public RindexContext rindex() {
			return getRuleContext(RindexContext.class,0);
		}
		public TerminalNode SQRT() { return getToken(BaknemParser.SQRT, 0); }
		public Nor2Context nor2() {
			return getRuleContext(Nor2Context.class,0);
		}
		public TerminalNode RTRM2() { return getToken(BaknemParser.RTRM2, 0); }
		public Irad2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_irad2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterIrad2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitIrad2(this);
		}
	}

	public final Irad2Context irad2() throws RecognitionException {
		Irad2Context _localctx = new Irad2Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_irad2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			match(IRAD2);
			setState(588);
			rindex();
			setState(589);
			match(SQRT);
			setState(590);
			nor2(0);
			setState(591);
			match(RTRM2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sqrt3Context extends ParserRuleContext {
		public TerminalNode SQRT3() { return getToken(BaknemParser.SQRT3, 0); }
		public Nor3Context nor3() {
			return getRuleContext(Nor3Context.class,0);
		}
		public TerminalNode RTRM3() { return getToken(BaknemParser.RTRM3, 0); }
		public Sqrt3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqrt3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterSqrt3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitSqrt3(this);
		}
	}

	public final Sqrt3Context sqrt3() throws RecognitionException {
		Sqrt3Context _localctx = new Sqrt3Context(_ctx, getState());
		enterRule(_localctx, 54, RULE_sqrt3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			match(SQRT3);
			setState(594);
			nor3(0);
			setState(595);
			match(RTRM3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Irad3Context extends ParserRuleContext {
		public TerminalNode IRAD3() { return getToken(BaknemParser.IRAD3, 0); }
		public RindexContext rindex() {
			return getRuleContext(RindexContext.class,0);
		}
		public TerminalNode SQRT() { return getToken(BaknemParser.SQRT, 0); }
		public Nor3Context nor3() {
			return getRuleContext(Nor3Context.class,0);
		}
		public TerminalNode RTRM3() { return getToken(BaknemParser.RTRM3, 0); }
		public Irad3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_irad3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterIrad3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitIrad3(this);
		}
	}

	public final Irad3Context irad3() throws RecognitionException {
		Irad3Context _localctx = new Irad3Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_irad3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			match(IRAD3);
			setState(598);
			rindex();
			setState(599);
			match(SQRT);
			setState(600);
			nor3(0);
			setState(601);
			match(RTRM3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NomodContext extends ParserRuleContext {
		public LgrpContext lgrp() {
			return getRuleContext(LgrpContext.class,0);
		}
		public List<NomodContext> nomod() {
			return getRuleContexts(NomodContext.class);
		}
		public NomodContext nomod(int i) {
			return getRuleContext(NomodContext.class,i);
		}
		public RgrpContext rgrp() {
			return getRuleContext(RgrpContext.class,0);
		}
		public MfracContext mfrac() {
			return getRuleContext(MfracContext.class,0);
		}
		public MmfracContext mmfrac() {
			return getRuleContext(MmfracContext.class,0);
		}
		public MmmfracContext mmmfrac() {
			return getRuleContext(MmmfracContext.class,0);
		}
		public MscriptContext mscript() {
			return getRuleContext(MscriptContext.class,0);
		}
		public IradContext irad() {
			return getRuleContext(IradContext.class,0);
		}
		public SqrtContext sqrt() {
			return getRuleContext(SqrtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Binop1Context binop1() {
			return getRuleContext(Binop1Context.class,0);
		}
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public CmprContext cmpr() {
			return getRuleContext(CmprContext.class,0);
		}
		public NomodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterNomod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitNomod(this);
		}
	}

	public final NomodContext nomod() throws RecognitionException {
		return nomod(0);
	}

	private NomodContext nomod(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NomodContext _localctx = new NomodContext(_ctx, _parentState);
		NomodContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_nomod, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(604);
				lgrp();
				setState(605);
				nomod(0);
				setState(606);
				rgrp();
				}
				break;
			case 2:
				{
				setState(608);
				mfrac();
				}
				break;
			case 3:
				{
				setState(609);
				mmfrac();
				}
				break;
			case 4:
				{
				setState(610);
				mmmfrac();
				}
				break;
			case 5:
				{
				setState(611);
				mscript();
				}
				break;
			case 6:
				{
				setState(612);
				irad();
				}
				break;
			case 7:
				{
				setState(613);
				sqrt();
				}
				break;
			case 8:
				{
				setState(614);
				expr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(633);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(631);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						_localctx = new NomodContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nomod);
						setState(617);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(618);
						nomod(12);
						}
						break;
					case 2:
						{
						_localctx = new NomodContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nomod);
						setState(619);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(620);
						binop1();
						setState(621);
						nomod(11);
						}
						break;
					case 3:
						{
						_localctx = new NomodContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nomod);
						setState(623);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(624);
						binop();
						setState(625);
						nomod(10);
						}
						break;
					case 4:
						{
						_localctx = new NomodContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nomod);
						setState(627);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(628);
						cmpr();
						setState(629);
						nomod(9);
						}
						break;
					}
					} 
				}
				setState(635);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BegmodContext extends ParserRuleContext {
		public NomodContext nomod() {
			return getRuleContext(NomodContext.class,0);
		}
		public BegmodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begmod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterBegmod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitBegmod(this);
		}
	}

	public final BegmodContext begmod() throws RecognitionException {
		BegmodContext _localctx = new BegmodContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_begmod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			nomod(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MunderContext extends ParserRuleContext {
		public TerminalNode MODIF() { return getToken(BaknemParser.MODIF, 0); }
		public BegmodContext begmod() {
			return getRuleContext(BegmodContext.class,0);
		}
		public TerminalNode MODUNDER() { return getToken(BaknemParser.MODUNDER, 0); }
		public EndmodContext endmod() {
			return getRuleContext(EndmodContext.class,0);
		}
		public TerminalNode TERM() { return getToken(BaknemParser.TERM, 0); }
		public MunderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_munder; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterMunder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitMunder(this);
		}
	}

	public final MunderContext munder() throws RecognitionException {
		MunderContext _localctx = new MunderContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_munder);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			match(MODIF);
			setState(639);
			begmod();
			setState(640);
			match(MODUNDER);
			setState(641);
			endmod();
			setState(642);
			match(TERM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MoverContext extends ParserRuleContext {
		public TerminalNode MODIF() { return getToken(BaknemParser.MODIF, 0); }
		public BegmodContext begmod() {
			return getRuleContext(BegmodContext.class,0);
		}
		public TerminalNode MODOVER() { return getToken(BaknemParser.MODOVER, 0); }
		public EndmodContext endmod() {
			return getRuleContext(EndmodContext.class,0);
		}
		public TerminalNode TERM() { return getToken(BaknemParser.TERM, 0); }
		public MoverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mover; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterMover(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitMover(this);
		}
	}

	public final MoverContext mover() throws RecognitionException {
		MoverContext _localctx = new MoverContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_mover);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			match(MODIF);
			setState(645);
			begmod();
			setState(646);
			match(MODOVER);
			setState(647);
			endmod();
			setState(648);
			match(TERM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MundovContext extends ParserRuleContext {
		public TerminalNode MODIF() { return getToken(BaknemParser.MODIF, 0); }
		public BegmodContext begmod() {
			return getRuleContext(BegmodContext.class,0);
		}
		public TerminalNode MODUNDER() { return getToken(BaknemParser.MODUNDER, 0); }
		public List<EndmodContext> endmod() {
			return getRuleContexts(EndmodContext.class);
		}
		public EndmodContext endmod(int i) {
			return getRuleContext(EndmodContext.class,i);
		}
		public TerminalNode MODOVER() { return getToken(BaknemParser.MODOVER, 0); }
		public TerminalNode TERM() { return getToken(BaknemParser.TERM, 0); }
		public MundovContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mundov; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterMundov(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitMundov(this);
		}
	}

	public final MundovContext mundov() throws RecognitionException {
		MundovContext _localctx = new MundovContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_mundov);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			match(MODIF);
			setState(651);
			begmod();
			setState(652);
			match(MODUNDER);
			setState(653);
			endmod();
			setState(654);
			match(MODOVER);
			setState(655);
			endmod();
			setState(656);
			match(TERM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndmodContext extends ParserRuleContext {
		public NomodContext nomod() {
			return getRuleContext(NomodContext.class,0);
		}
		public EndmodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endmod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterEndmod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitEndmod(this);
		}
	}

	public final EndmodContext endmod() throws RecognitionException {
		EndmodContext _localctx = new EndmodContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_endmod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			nomod(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarXfunabbContext extends ParserRuleContext {
		public TerminalNode TRAIL_FUN_ABBR() { return getToken(BaknemParser.TRAIL_FUN_ABBR, 0); }
		public VarXfunabbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varXfunabb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterVarXfunabb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitVarXfunabb(this);
		}
	}

	public final VarXfunabbContext varXfunabb() throws RecognitionException {
		VarXfunabbContext _localctx = new VarXfunabbContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_varXfunabb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			match(TRAIL_FUN_ABBR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunabbContext extends ParserRuleContext {
		public TerminalNode FUN_ABBR() { return getToken(BaknemParser.FUN_ABBR, 0); }
		public FunabbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funabb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterFunabb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitFunabb(this);
		}
	}

	public final FunabbContext funabb() throws RecognitionException {
		FunabbContext _localctx = new FunabbContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_funabb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
			match(FUN_ABBR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncContext extends ParserRuleContext {
		public TerminalNode MODIF() { return getToken(BaknemParser.MODIF, 0); }
		public FunabbContext funabb() {
			return getRuleContext(FunabbContext.class,0);
		}
		public EndmodContext endmod() {
			return getRuleContext(EndmodContext.class,0);
		}
		public VarXfunabbContext varXfunabb() {
			return getRuleContext(VarXfunabbContext.class,0);
		}
		public TerminalNode MODUNDER() { return getToken(BaknemParser.MODUNDER, 0); }
		public TerminalNode MODOVER() { return getToken(BaknemParser.MODOVER, 0); }
		public TerminalNode SUB() { return getToken(BaknemParser.SUB, 0); }
		public ScriptContext script() {
			return getRuleContext(ScriptContext.class,0);
		}
		public TerminalNode SUP() { return getToken(BaknemParser.SUP, 0); }
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitFunc(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODIF:
				{
				setState(664);
				match(MODIF);
				setState(665);
				funabb();
				{
				setState(666);
				_la = _input.LA(1);
				if ( !(_la==MODOVER || _la==MODUNDER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(667);
				endmod();
				}
				}
				break;
			case FUN_ABBR:
			case TRAIL_FUN_ABBR:
				{
				setState(671);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FUN_ABBR:
					{
					setState(669);
					funabb();
					}
					break;
				case TRAIL_FUN_ABBR:
					{
					setState(670);
					varXfunabb();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(677);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(673);
					match(SUB);
					setState(674);
					script();
					}
					break;
				case 2:
					{
					setState(675);
					match(SUP);
					setState(676);
					script();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LgrpContext extends ParserRuleContext {
		public TerminalNode LGRP() { return getToken(BaknemParser.LGRP, 0); }
		public LgrpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lgrp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterLgrp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitLgrp(this);
		}
	}

	public final LgrpContext lgrp() throws RecognitionException {
		LgrpContext _localctx = new LgrpContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_lgrp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			match(LGRP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RgrpContext extends ParserRuleContext {
		public TerminalNode RGRP() { return getToken(BaknemParser.RGRP, 0); }
		public RgrpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rgrp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterRgrp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitRgrp(this);
		}
	}

	public final RgrpContext rgrp() throws RecognitionException {
		RgrpContext _localctx = new RgrpContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_rgrp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			match(RGRP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinopContext extends ParserRuleContext {
		public TerminalNode BINOP() { return getToken(BaknemParser.BINOP, 0); }
		public BinopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterBinop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitBinop(this);
		}
	}

	public final BinopContext binop() throws RecognitionException {
		BinopContext _localctx = new BinopContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_binop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			match(BINOP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Binop1Context extends ParserRuleContext {
		public TerminalNode BINOP_PREC() { return getToken(BaknemParser.BINOP_PREC, 0); }
		public TerminalNode FRAC_SLASH() { return getToken(BaknemParser.FRAC_SLASH, 0); }
		public Binop1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binop1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterBinop1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitBinop1(this);
		}
	}

	public final Binop1Context binop1() throws RecognitionException {
		Binop1Context _localctx = new Binop1Context(_ctx, getState());
		enterRule(_localctx, 82, RULE_binop1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			_la = _input.LA(1);
			if ( !(_la==BINOP_PREC || _la==FRAC_SLASH) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmprContext extends ParserRuleContext {
		public TerminalNode CMPR() { return getToken(BaknemParser.CMPR, 0); }
		public TerminalNode ARROW() { return getToken(BaknemParser.ARROW, 0); }
		public CmprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterCmpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitCmpr(this);
		}
	}

	public final CmprContext cmpr() throws RecognitionException {
		CmprContext _localctx = new CmprContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_cmpr);
		try {
			setState(694);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CMPR:
				enterOuterAlt(_localctx, 1);
				{
				setState(689);
				match(CMPR);
				setState(690);
				match(SPACE);
				}
				break;
			case SPACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(691);
				match(SPACE);
				setState(692);
				match(ARROW);
				setState(693);
				match(SPACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleLetContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BaknemParser.ID, 0); }
		public TerminalNode POSS_CH_ELEMENT() { return getToken(BaknemParser.POSS_CH_ELEMENT, 0); }
		public SingleLetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleLet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterSingleLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitSingleLet(this);
		}
	}

	public final SingleLetContext singleLet() throws RecognitionException {
		SingleLetContext _localctx = new SingleLetContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_singleLet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==POSS_CH_ELEMENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public List<SingleLetContext> singleLet() {
			return getRuleContexts(SingleLetContext.class);
		}
		public SingleLetContext singleLet(int i) {
			return getRuleContext(SingleLetContext.class,i);
		}
		public TerminalNode LC_ID() { return getToken(BaknemParser.LC_ID, 0); }
		public TerminalNode UC_ID() { return getToken(BaknemParser.UC_ID, 0); }
		public TerminalNode MIXID() { return getToken(BaknemParser.MIXID, 0); }
		public GreeksContext greeks() {
			return getRuleContext(GreeksContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_var);
		try {
			int _alt;
			setState(707);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case POSS_CH_ELEMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(699); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(698);
						singleLet();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(701); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case LC_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(703);
				match(LC_ID);
				}
				break;
			case UC_ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(704);
				match(UC_ID);
				}
				break;
			case MIXID:
				enterOuterAlt(_localctx, 4);
				{
				setState(705);
				match(MIXID);
				}
				break;
			case GREEK_LETTER:
				enterOuterAlt(_localctx, 5);
				{
				setState(706);
				greeks();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GreeksContext extends ParserRuleContext {
		public List<TerminalNode> GREEK_LETTER() { return getTokens(BaknemParser.GREEK_LETTER); }
		public TerminalNode GREEK_LETTER(int i) {
			return getToken(BaknemParser.GREEK_LETTER, i);
		}
		public GreeksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greeks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterGreeks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitGreeks(this);
		}
	}

	public final GreeksContext greeks() throws RecognitionException {
		GreeksContext _localctx = new GreeksContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_greeks);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(710); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(709);
					match(GREEK_LETTER);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(712); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecsymContext extends ParserRuleContext {
		public TerminalNode INTEGRAL() { return getToken(BaknemParser.INTEGRAL, 0); }
		public TerminalNode INFINITY() { return getToken(BaknemParser.INFINITY, 0); }
		public TerminalNode MISCALPHD4() { return getToken(BaknemParser.MISCALPHD4, 0); }
		public SpecsymContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specsym; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterSpecsym(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitSpecsym(this);
		}
	}

	public final SpecsymContext specsym() throws RecognitionException {
		SpecsymContext _localctx = new SpecsymContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_specsym);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MISCALPHD4) | (1L << INFINITY) | (1L << INTEGRAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(BaknemParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(BaknemParser.INT, i);
		}
		public TerminalNode REAL() { return getToken(BaknemParser.REAL, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_number);
		int _la;
		try {
			int _alt;
			setState(736);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(716);
				match(INT);
				setState(720);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(717);
						match(INT);
						}
						} 
					}
					setState(722);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(726);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==INT) {
					{
					{
					setState(723);
					match(INT);
					}
					}
					setState(728);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(729);
				match(REAL);
				setState(733);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(730);
						match(INT);
						}
						} 
					}
					setState(735);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumsubContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public FunabbContext funabb() {
			return getRuleContext(FunabbContext.class,0);
		}
		public NumsubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numsub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterNumsub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitNumsub(this);
		}
	}

	public final NumsubContext numsub() throws RecognitionException {
		NumsubContext _localctx = new NumsubContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_numsub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LC_ID:
			case ID:
			case MIXID:
			case UC_ID:
			case GREEK_LETTER:
			case POSS_CH_ELEMENT:
				{
				setState(738);
				var();
				}
				break;
			case FUN_ABBR:
				{
				setState(739);
				funabb();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(742);
			number();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChelementContext extends ParserRuleContext {
		public TerminalNode CHEM_ELEMENT() { return getToken(BaknemParser.CHEM_ELEMENT, 0); }
		public TerminalNode POSS_CH_ELEMENT() { return getToken(BaknemParser.POSS_CH_ELEMENT, 0); }
		public ChelementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chelement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterChelement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitChelement(this);
		}
	}

	public final ChelementContext chelement() throws RecognitionException {
		ChelementContext _localctx = new ChelementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_chelement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			_la = _input.LA(1);
			if ( !(_la==CHEM_ELEMENT || _la==POSS_CH_ELEMENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChnumsubContext extends ParserRuleContext {
		public ChelementContext chelement() {
			return getRuleContext(ChelementContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ChnumsubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chnumsub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterChnumsub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitChnumsub(this);
		}
	}

	public final ChnumsubContext chnumsub() throws RecognitionException {
		ChnumsubContext _localctx = new ChnumsubContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_chnumsub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			chelement();
			setState(747);
			number();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChradicalContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(BaknemParser.SUB, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public List<ChelementContext> chelement() {
			return getRuleContexts(ChelementContext.class);
		}
		public ChelementContext chelement(int i) {
			return getRuleContext(ChelementContext.class,i);
		}
		public List<ChnumsubContext> chnumsub() {
			return getRuleContexts(ChnumsubContext.class);
		}
		public ChnumsubContext chnumsub(int i) {
			return getRuleContext(ChnumsubContext.class,i);
		}
		public ChradicalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chradical; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterChradical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitChradical(this);
		}
	}

	public final ChradicalContext chradical() throws RecognitionException {
		ChradicalContext _localctx = new ChradicalContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_chradical);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			match(LGRP);
			setState(752); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(752);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(750);
					chelement();
					}
					break;
				case 2:
					{
					setState(751);
					chnumsub();
					}
					break;
				}
				}
				setState(754); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CHEM_ELEMENT || _la==POSS_CH_ELEMENT );
			setState(756);
			match(RGRP);
			setState(757);
			match(SUB);
			setState(758);
			number();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChformulaContext extends ParserRuleContext {
		public List<ChnumsubContext> chnumsub() {
			return getRuleContexts(ChnumsubContext.class);
		}
		public ChnumsubContext chnumsub(int i) {
			return getRuleContext(ChnumsubContext.class,i);
		}
		public List<ChelementContext> chelement() {
			return getRuleContexts(ChelementContext.class);
		}
		public ChelementContext chelement(int i) {
			return getRuleContext(ChelementContext.class,i);
		}
		public List<ChradicalContext> chradical() {
			return getRuleContexts(ChradicalContext.class);
		}
		public ChradicalContext chradical(int i) {
			return getRuleContext(ChradicalContext.class,i);
		}
		public ChformulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chformula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterChformula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitChformula(this);
		}
	}

	public final ChformulaContext chformula() throws RecognitionException {
		ChformulaContext _localctx = new ChformulaContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_chformula);
		try {
			int _alt;
			setState(773);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(760);
				chnumsub();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(764);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(761);
					chelement();
					}
					break;
				case 2:
					{
					setState(762);
					chnumsub();
					}
					break;
				case 3:
					{
					setState(763);
					chradical();
					}
					break;
				}
				setState(769); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(769);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
						case 1:
							{
							setState(766);
							chelement();
							}
							break;
						case 2:
							{
							setState(767);
							chnumsub();
							}
							break;
						case 3:
							{
							setState(768);
							chradical();
							}
							break;
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(771); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sup2Context extends ParserRuleContext {
		public ScriptContext script() {
			return getRuleContext(ScriptContext.class,0);
		}
		public TerminalNode SUPSUP() { return getToken(BaknemParser.SUPSUP, 0); }
		public Sup2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sup2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterSup2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitSup2(this);
		}
	}

	public final Sup2Context sup2() throws RecognitionException {
		Sup2Context _localctx = new Sup2Context(_ctx, getState());
		enterRule(_localctx, 106, RULE_sup2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(775);
			match(SUPSUP);
			}
			setState(776);
			script();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sup2bContext extends ParserRuleContext {
		public ScriptContext script() {
			return getRuleContext(ScriptContext.class,0);
		}
		public TerminalNode SUPSUB() { return getToken(BaknemParser.SUPSUB, 0); }
		public Sup2bContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sup2b; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterSup2b(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitSup2b(this);
		}
	}

	public final Sup2bContext sup2b() throws RecognitionException {
		Sup2bContext _localctx = new Sup2bContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_sup2b);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(778);
			match(SUPSUB);
			}
			setState(779);
			script();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sup22Context extends ParserRuleContext {
		public List<ScriptContext> script() {
			return getRuleContexts(ScriptContext.class);
		}
		public ScriptContext script(int i) {
			return getRuleContext(ScriptContext.class,i);
		}
		public TerminalNode SUPSUB() { return getToken(BaknemParser.SUPSUB, 0); }
		public TerminalNode SUPSUP() { return getToken(BaknemParser.SUPSUP, 0); }
		public Sup22Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sup22; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterSup22(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitSup22(this);
		}
	}

	public final Sup22Context sup22() throws RecognitionException {
		Sup22Context _localctx = new Sup22Context(_ctx, getState());
		enterRule(_localctx, 110, RULE_sup22);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(781);
			match(SUPSUB);
			}
			setState(782);
			script();
			{
			setState(783);
			match(SUPSUP);
			}
			setState(784);
			script();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sub2Context extends ParserRuleContext {
		public ScriptContext script() {
			return getRuleContext(ScriptContext.class,0);
		}
		public TerminalNode SUBSUB() { return getToken(BaknemParser.SUBSUB, 0); }
		public Sub2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterSub2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitSub2(this);
		}
	}

	public final Sub2Context sub2() throws RecognitionException {
		Sub2Context _localctx = new Sub2Context(_ctx, getState());
		enterRule(_localctx, 112, RULE_sub2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(786);
			match(SUBSUB);
			}
			setState(787);
			script();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sub2pContext extends ParserRuleContext {
		public ScriptContext script() {
			return getRuleContext(ScriptContext.class,0);
		}
		public TerminalNode SUBSUP() { return getToken(BaknemParser.SUBSUP, 0); }
		public Sub2pContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub2p; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterSub2p(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitSub2p(this);
		}
	}

	public final Sub2pContext sub2p() throws RecognitionException {
		Sub2pContext _localctx = new Sub2pContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_sub2p);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(789);
			match(SUBSUP);
			}
			setState(790);
			script();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sub22Context extends ParserRuleContext {
		public List<ScriptContext> script() {
			return getRuleContexts(ScriptContext.class);
		}
		public ScriptContext script(int i) {
			return getRuleContext(ScriptContext.class,i);
		}
		public TerminalNode SUBSUB() { return getToken(BaknemParser.SUBSUB, 0); }
		public TerminalNode SUBSUP() { return getToken(BaknemParser.SUBSUP, 0); }
		public Sub22Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub22; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterSub22(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitSub22(this);
		}
	}

	public final Sub22Context sub22() throws RecognitionException {
		Sub22Context _localctx = new Sub22Context(_ctx, getState());
		enterRule(_localctx, 116, RULE_sub22);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(792);
			match(SUBSUB);
			}
			setState(793);
			script();
			{
			setState(794);
			match(SUBSUP);
			}
			setState(795);
			script();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BaseContext extends ParserRuleContext {
		public NomContext nom() {
			return getRuleContext(NomContext.class,0);
		}
		public BaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitBase(this);
		}
	}

	public final BaseContext base() throws RecognitionException {
		BaseContext _localctx = new BaseContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_base);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			nom(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScriptContext extends ParserRuleContext {
		public NomContext nom() {
			return getRuleContext(NomContext.class,0);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitScript(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_script);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			nom(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubscriptContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(BaknemParser.SUB, 0); }
		public ScriptContext script() {
			return getRuleContext(ScriptContext.class,0);
		}
		public SubscriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscript; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitSubscript(this);
		}
	}

	public final SubscriptContext subscript() throws RecognitionException {
		SubscriptContext _localctx = new SubscriptContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_subscript);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
			match(SUB);
			setState(802);
			script();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SupscriptContext extends ParserRuleContext {
		public TerminalNode SUP() { return getToken(BaknemParser.SUP, 0); }
		public ScriptContext script() {
			return getRuleContext(ScriptContext.class,0);
		}
		public SupscriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supscript; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterSupscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitSupscript(this);
		}
	}

	public final SupscriptContext supscript() throws RecognitionException {
		SupscriptContext _localctx = new SupscriptContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_supscript);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			match(SUP);
			setState(805);
			script();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MsubContext extends ParserRuleContext {
		public BaseContext base() {
			return getRuleContext(BaseContext.class,0);
		}
		public TerminalNode SUB() { return getToken(BaknemParser.SUB, 0); }
		public ScriptContext script() {
			return getRuleContext(ScriptContext.class,0);
		}
		public Sub2Context sub2() {
			return getRuleContext(Sub2Context.class,0);
		}
		public Sub2pContext sub2p() {
			return getRuleContext(Sub2pContext.class,0);
		}
		public Sub22Context sub22() {
			return getRuleContext(Sub22Context.class,0);
		}
		public TerminalNode MODIF() { return getToken(BaknemParser.MODIF, 0); }
		public MsubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_msub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterMsub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitMsub(this);
		}
	}

	public final MsubContext msub() throws RecognitionException {
		MsubContext _localctx = new MsubContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_msub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			base();
			setState(808);
			match(SUB);
			setState(809);
			script();
			setState(813);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(810);
				sub2();
				}
				break;
			case 2:
				{
				setState(811);
				sub2p();
				}
				break;
			case 3:
				{
				setState(812);
				sub22();
				}
				break;
			}
			setState(816);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(815);
				match(MODIF);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MsupContext extends ParserRuleContext {
		public BaseContext base() {
			return getRuleContext(BaseContext.class,0);
		}
		public TerminalNode SUP() { return getToken(BaknemParser.SUP, 0); }
		public ScriptContext script() {
			return getRuleContext(ScriptContext.class,0);
		}
		public Sup2Context sup2() {
			return getRuleContext(Sup2Context.class,0);
		}
		public Sup2bContext sup2b() {
			return getRuleContext(Sup2bContext.class,0);
		}
		public Sup22Context sup22() {
			return getRuleContext(Sup22Context.class,0);
		}
		public TerminalNode MODIF() { return getToken(BaknemParser.MODIF, 0); }
		public MsupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_msup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterMsup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitMsup(this);
		}
	}

	public final MsupContext msup() throws RecognitionException {
		MsupContext _localctx = new MsupContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_msup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
			base();
			setState(819);
			match(SUP);
			setState(820);
			script();
			setState(824);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(821);
				sup2();
				}
				break;
			case 2:
				{
				setState(822);
				sup2b();
				}
				break;
			case 3:
				{
				setState(823);
				sup22();
				}
				break;
			}
			setState(827);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(826);
				match(MODIF);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MsubsupContext extends ParserRuleContext {
		public BaseContext base() {
			return getRuleContext(BaseContext.class,0);
		}
		public SubscriptContext subscript() {
			return getRuleContext(SubscriptContext.class,0);
		}
		public SupscriptContext supscript() {
			return getRuleContext(SupscriptContext.class,0);
		}
		public TerminalNode MODIF() { return getToken(BaknemParser.MODIF, 0); }
		public MsubsupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_msubsup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterMsubsup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitMsubsup(this);
		}
	}

	public final MsubsupContext msubsup() throws RecognitionException {
		MsubsupContext _localctx = new MsubsupContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_msubsup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			base();
			setState(830);
			subscript();
			setState(831);
			supscript();
			setState(833);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(832);
				match(MODIF);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MscriptContext extends ParserRuleContext {
		public MsubContext msub() {
			return getRuleContext(MsubContext.class,0);
		}
		public MsupContext msup() {
			return getRuleContext(MsupContext.class,0);
		}
		public MsubsupContext msubsup() {
			return getRuleContext(MsubsupContext.class,0);
		}
		public MscriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mscript; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterMscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitMscript(this);
		}
	}

	public final MscriptContext mscript() throws RecognitionException {
		MscriptContext _localctx = new MscriptContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_mscript);
		try {
			setState(838);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(835);
				msub();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(836);
				msup();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(837);
				msubsup();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 8:
			return layexpr_sempred((LayexprContext)_localctx, predIndex);
		case 9:
			return nor_sempred((NorContext)_localctx, predIndex);
		case 10:
			return nor1_sempred((Nor1Context)_localctx, predIndex);
		case 11:
			return nor2_sempred((Nor2Context)_localctx, predIndex);
		case 12:
			return nor3_sempred((Nor3Context)_localctx, predIndex);
		case 13:
			return nom_sempred((NomContext)_localctx, predIndex);
		case 14:
			return nof_sempred((NofContext)_localctx, predIndex);
		case 15:
			return nofc_sempred((NofcContext)_localctx, predIndex);
		case 16:
			return nofch_sempred((NofchContext)_localctx, predIndex);
		case 29:
			return nomod_sempred((NomodContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		}
		return true;
	}
	private boolean layexpr_sempred(LayexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 16);
		case 5:
			return precpred(_ctx, 14);
		case 6:
			return precpred(_ctx, 13);
		case 7:
			return precpred(_ctx, 12);
		}
		return true;
	}
	private boolean nor_sempred(NorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 14);
		case 9:
			return precpred(_ctx, 13);
		case 10:
			return precpred(_ctx, 12);
		}
		return true;
	}
	private boolean nor1_sempred(Nor1Context _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 14);
		case 12:
			return precpred(_ctx, 13);
		case 13:
			return precpred(_ctx, 12);
		}
		return true;
	}
	private boolean nor2_sempred(Nor2Context _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 14);
		case 15:
			return precpred(_ctx, 13);
		case 16:
			return precpred(_ctx, 12);
		}
		return true;
	}
	private boolean nor3_sempred(Nor3Context _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 12);
		case 18:
			return precpred(_ctx, 11);
		case 19:
			return precpred(_ctx, 10);
		}
		return true;
	}
	private boolean nom_sempred(NomContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 14);
		case 21:
			return precpred(_ctx, 13);
		case 22:
			return precpred(_ctx, 12);
		case 23:
			return precpred(_ctx, 11);
		}
		return true;
	}
	private boolean nof_sempred(NofContext _localctx, int predIndex) {
		switch (predIndex) {
		case 24:
			return precpred(_ctx, 12);
		case 25:
			return precpred(_ctx, 11);
		case 26:
			return precpred(_ctx, 10);
		case 27:
			return precpred(_ctx, 9);
		}
		return true;
	}
	private boolean nofc_sempred(NofcContext _localctx, int predIndex) {
		switch (predIndex) {
		case 28:
			return precpred(_ctx, 13);
		case 29:
			return precpred(_ctx, 11);
		case 30:
			return precpred(_ctx, 10);
		case 31:
			return precpred(_ctx, 12);
		}
		return true;
	}
	private boolean nofch_sempred(NofchContext _localctx, int predIndex) {
		switch (predIndex) {
		case 32:
			return precpred(_ctx, 14);
		case 33:
			return precpred(_ctx, 13);
		case 34:
			return precpred(_ctx, 12);
		case 35:
			return precpred(_ctx, 11);
		}
		return true;
	}
	private boolean nomod_sempred(NomodContext _localctx, int predIndex) {
		switch (predIndex) {
		case 36:
			return precpred(_ctx, 11);
		case 37:
			return precpred(_ctx, 10);
		case 38:
			return precpred(_ctx, 9);
		case 39:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3O\u034b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\3\2\6\2\u008a\n\2\r\2\16\2"+
		"\u008b\3\3\7\3\u008f\n\3\f\3\16\3\u0092\13\3\3\3\3\3\6\3\u0096\n\3\r\3"+
		"\16\3\u0097\3\3\3\3\7\3\u009c\n\3\f\3\16\3\u009f\13\3\3\3\7\3\u00a2\n"+
		"\3\f\3\16\3\u00a5\13\3\3\3\3\3\3\3\5\3\u00aa\n\3\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5\u00b5\n\5\3\5\3\5\3\5\3\5\5\5\u00bb\n\5\5\5\u00bd\n"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\5\b\u00c8\n\b\3\b\5\b\u00cb\n\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00d9\n\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00e9\n\t\f\t\16"+
		"\t\u00ec\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\n\u00fe\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\7\n\u010e\n\n\f\n\16\n\u0111\13\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0123\n\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u012f\n\13\f\13"+
		"\16\13\u0132\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\5\f\u0144\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f"+
		"\u0150\n\f\f\f\16\f\u0153\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0165\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\7\r\u0171\n\r\f\r\16\r\u0174\13\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0184\n\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0190\n\16\f\16\16\16\u0193"+
		"\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u01a4\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\7\17\u01b4\n\17\f\17\16\17\u01b7\13\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u01c6"+
		"\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\7\20\u01d6\n\20\f\20\16\20\u01d9\13\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u01e9\n\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u01f9"+
		"\n\21\f\21\16\21\u01fc\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u020d\n\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u021d\n\22\f\22"+
		"\16\22\u0220\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3"+
		"\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\5\37\u026a\n\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u027a\n\37\f\37\16"+
		"\37\u027d\13\37\3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u02a2"+
		"\n\'\3\'\3\'\3\'\3\'\5\'\u02a8\n\'\5\'\u02aa\n\'\3(\3(\3)\3)\3*\3*\3+"+
		"\3+\3,\3,\3,\3,\3,\5,\u02b9\n,\3-\3-\3.\6.\u02be\n.\r.\16.\u02bf\3.\3"+
		".\3.\3.\5.\u02c6\n.\3/\6/\u02c9\n/\r/\16/\u02ca\3\60\3\60\3\61\3\61\7"+
		"\61\u02d1\n\61\f\61\16\61\u02d4\13\61\3\61\7\61\u02d7\n\61\f\61\16\61"+
		"\u02da\13\61\3\61\3\61\7\61\u02de\n\61\f\61\16\61\u02e1\13\61\5\61\u02e3"+
		"\n\61\3\62\3\62\5\62\u02e7\n\62\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3\65"+
		"\3\65\3\65\6\65\u02f3\n\65\r\65\16\65\u02f4\3\65\3\65\3\65\3\65\3\66\3"+
		"\66\3\66\3\66\5\66\u02ff\n\66\3\66\3\66\3\66\6\66\u0304\n\66\r\66\16\66"+
		"\u0305\5\66\u0308\n\66\3\67\3\67\3\67\38\38\38\39\39\39\39\39\3:\3:\3"+
		":\3;\3;\3;\3<\3<\3<\3<\3<\3=\3=\3>\3>\3?\3?\3?\3@\3@\3@\3A\3A\3A\3A\3"+
		"A\3A\5A\u0330\nA\3A\5A\u0333\nA\3B\3B\3B\3B\3B\3B\5B\u033b\nB\3B\5B\u033e"+
		"\nB\3C\3C\3C\3C\5C\u0344\nC\3D\3D\3D\5D\u0349\nD\3D\2\r\20\22\24\26\30"+
		"\32\34\36 \"<E\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\2\7\3"+
		"\2 !\4\2\25\25$$\4\2\7\7>>\4\2\f\f;<\3\2=>\2\u03c6\2\u0089\3\2\2\2\4\u00a9"+
		"\3\2\2\2\6\u00ab\3\2\2\2\b\u00bc\3\2\2\2\n\u00c1\3\2\2\2\f\u00c3\3\2\2"+
		"\2\16\u00c7\3\2\2\2\20\u00d8\3\2\2\2\22\u00fd\3\2\2\2\24\u0122\3\2\2\2"+
		"\26\u0143\3\2\2\2\30\u0164\3\2\2\2\32\u0183\3\2\2\2\34\u01a3\3\2\2\2\36"+
		"\u01c5\3\2\2\2 \u01e8\3\2\2\2\"\u020c\3\2\2\2$\u0221\3\2\2\2&\u0227\3"+
		"\2\2\2(\u022d\3\2\2\2*\u0233\3\2\2\2,\u0235\3\2\2\2.\u0239\3\2\2\2\60"+
		"\u023f\3\2\2\2\62\u0243\3\2\2\2\64\u0249\3\2\2\2\66\u024d\3\2\2\28\u0253"+
		"\3\2\2\2:\u0257\3\2\2\2<\u0269\3\2\2\2>\u027e\3\2\2\2@\u0280\3\2\2\2B"+
		"\u0286\3\2\2\2D\u028c\3\2\2\2F\u0294\3\2\2\2H\u0296\3\2\2\2J\u0298\3\2"+
		"\2\2L\u02a9\3\2\2\2N\u02ab\3\2\2\2P\u02ad\3\2\2\2R\u02af\3\2\2\2T\u02b1"+
		"\3\2\2\2V\u02b8\3\2\2\2X\u02ba\3\2\2\2Z\u02c5\3\2\2\2\\\u02c8\3\2\2\2"+
		"^\u02cc\3\2\2\2`\u02e2\3\2\2\2b\u02e6\3\2\2\2d\u02ea\3\2\2\2f\u02ec\3"+
		"\2\2\2h\u02ef\3\2\2\2j\u0307\3\2\2\2l\u0309\3\2\2\2n\u030c\3\2\2\2p\u030f"+
		"\3\2\2\2r\u0314\3\2\2\2t\u0317\3\2\2\2v\u031a\3\2\2\2x\u031f\3\2\2\2z"+
		"\u0321\3\2\2\2|\u0323\3\2\2\2~\u0326\3\2\2\2\u0080\u0329\3\2\2\2\u0082"+
		"\u0334\3\2\2\2\u0084\u033f\3\2\2\2\u0086\u0348\3\2\2\2\u0088\u008a\5\4"+
		"\3\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\3\3\2\2\2\u008d\u008f\5\n\6\2\u008e\u008d\3\2\2\2"+
		"\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093"+
		"\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u009d\5\16\b\2\u0094\u0096\5\n\6\2"+
		"\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\5\16\b\2\u009a\u009c\3\2\2\2"+
		"\u009b\u0095\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e"+
		"\3\2\2\2\u009e\u00a3\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a2\5\n\6\2\u00a1"+
		"\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2"+
		"\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\7:\2\2\u00a7"+
		"\u00aa\3\2\2\2\u00a8\u00aa\7:\2\2\u00a9\u0090\3\2\2\2\u00a9\u00a8\3\2"+
		"\2\2\u00aa\5\3\2\2\2\u00ab\u00ac\7\4\2\2\u00ac\7\3\2\2\2\u00ad\u00ae\7"+
		"\37\2\2\u00ae\u00af\5J&\2\u00af\u00b0\t\2\2\2\u00b0\u00b1\5F$\2\u00b1"+
		"\u00bd\3\2\2\2\u00b2\u00b5\5J&\2\u00b3\u00b5\5H%\2\u00b4\u00b2\3\2\2\2"+
		"\u00b4\u00b3\3\2\2\2\u00b5\u00ba\3\2\2\2\u00b6\u00b7\7\33\2\2\u00b7\u00bb"+
		"\5z>\2\u00b8\u00b9\7\36\2\2\u00b9\u00bb\5z>\2\u00ba\u00b6\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00ad\3\2"+
		"\2\2\u00bc\u00b4\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\5\n\6\2\u00bf"+
		"\u00c0\5\22\n\2\u00c0\t\3\2\2\2\u00c1\u00c2\79\2\2\u00c2\13\3\2\2\2\u00c3"+
		"\u00c4\7\r\2\2\u00c4\r\3\2\2\2\u00c5\u00c8\5\b\5\2\u00c6\u00c8\5\22\n"+
		"\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00cb"+
		"\5\f\7\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\17\3\2\2\2\u00cc"+
		"\u00cd\b\t\1\2\u00cd\u00ce\5N(\2\u00ce\u00cf\5\20\t\2\u00cf\u00d0\5P)"+
		"\2\u00d0\u00d9\3\2\2\2\u00d1\u00d9\5b\62\2\u00d2\u00d9\5f\64\2\u00d3\u00d9"+
		"\5Z.\2\u00d4\u00d9\5^\60\2\u00d5\u00d9\5`\61\2\u00d6\u00d9\5d\63\2\u00d7"+
		"\u00d9\5j\66\2\u00d8\u00cc\3\2\2\2\u00d8\u00d1\3\2\2\2\u00d8\u00d2\3\2"+
		"\2\2\u00d8\u00d3\3\2\2\2\u00d8\u00d4\3\2\2\2\u00d8\u00d5\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00ea\3\2\2\2\u00da\u00db\f\r"+
		"\2\2\u00db\u00e9\5\20\t\16\u00dc\u00dd\f\f\2\2\u00dd\u00de\5T+\2\u00de"+
		"\u00df\5\20\t\r\u00df\u00e9\3\2\2\2\u00e0\u00e1\f\13\2\2\u00e1\u00e2\5"+
		"R*\2\u00e2\u00e3\5\20\t\f\u00e3\u00e9\3\2\2\2\u00e4\u00e5\f\n\2\2\u00e5"+
		"\u00e6\5V,\2\u00e6\u00e7\5\20\t\13\u00e7\u00e9\3\2\2\2\u00e8\u00da\3\2"+
		"\2\2\u00e8\u00dc\3\2\2\2\u00e8\u00e0\3\2\2\2\u00e8\u00e4\3\2\2\2\u00e9"+
		"\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\21\3\2\2"+
		"\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\b\n\1\2\u00ee\u00ef\5N(\2\u00ef\u00f0"+
		"\5\22\n\2\u00f0\u00f1\5P)\2\u00f1\u00fe\3\2\2\2\u00f2\u00fe\5$\23\2\u00f3"+
		"\u00fe\5&\24\2\u00f4\u00fe\5(\25\2\u00f5\u00fe\5@!\2\u00f6\u00fe\5B\""+
		"\2\u00f7\u00fe\5D#\2\u00f8\u00fe\5\u0086D\2\u00f9\u00fe\5,\27\2\u00fa"+
		"\u00fe\5.\30\2\u00fb\u00fe\5\20\t\2\u00fc\u00fe\5L\'\2\u00fd\u00ed\3\2"+
		"\2\2\u00fd\u00f2\3\2\2\2\u00fd\u00f3\3\2\2\2\u00fd\u00f4\3\2\2\2\u00fd"+
		"\u00f5\3\2\2\2\u00fd\u00f6\3\2\2\2\u00fd\u00f7\3\2\2\2\u00fd\u00f8\3\2"+
		"\2\2\u00fd\u00f9\3\2\2\2\u00fd\u00fa\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd"+
		"\u00fc\3\2\2\2\u00fe\u010f\3\2\2\2\u00ff\u0100\f\22\2\2\u0100\u010e\5"+
		"\22\n\23\u0101\u0102\f\20\2\2\u0102\u0103\5T+\2\u0103\u0104\5\22\n\21"+
		"\u0104\u010e\3\2\2\2\u0105\u0106\f\17\2\2\u0106\u0107\5R*\2\u0107\u0108"+
		"\5\22\n\20\u0108\u010e\3\2\2\2\u0109\u010a\f\16\2\2\u010a\u010b\5V,\2"+
		"\u010b\u010c\5\22\n\17\u010c\u010e\3\2\2\2\u010d\u00ff\3\2\2\2\u010d\u0101"+
		"\3\2\2\2\u010d\u0105\3\2\2\2\u010d\u0109\3\2\2\2\u010e\u0111\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\23\3\2\2\2\u0111\u010f\3\2\2"+
		"\2\u0112\u0113\b\13\1\2\u0113\u0114\5N(\2\u0114\u0115\5\24\13\2\u0115"+
		"\u0116\5P)\2\u0116\u0123\3\2\2\2\u0117\u0123\5$\23\2\u0118\u0123\5&\24"+
		"\2\u0119\u0123\5(\25\2\u011a\u0123\5@!\2\u011b\u0123\5B\"\2\u011c\u0123"+
		"\5D#\2\u011d\u0123\5\u0086D\2\u011e\u0123\5\62\32\2\u011f\u0123\5\60\31"+
		"\2\u0120\u0123\5\20\t\2\u0121\u0123\5L\'\2\u0122\u0112\3\2\2\2\u0122\u0117"+
		"\3\2\2\2\u0122\u0118\3\2\2\2\u0122\u0119\3\2\2\2\u0122\u011a\3\2\2\2\u0122"+
		"\u011b\3\2\2\2\u0122\u011c\3\2\2\2\u0122\u011d\3\2\2\2\u0122\u011e\3\2"+
		"\2\2\u0122\u011f\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0121\3\2\2\2\u0123"+
		"\u0130\3\2\2\2\u0124\u0125\f\20\2\2\u0125\u012f\5\24\13\21\u0126\u0127"+
		"\f\17\2\2\u0127\u0128\5T+\2\u0128\u0129\5\24\13\20\u0129\u012f\3\2\2\2"+
		"\u012a\u012b\f\16\2\2\u012b\u012c\5R*\2\u012c\u012d\5\24\13\17\u012d\u012f"+
		"\3\2\2\2\u012e\u0124\3\2\2\2\u012e\u0126\3\2\2\2\u012e\u012a\3\2\2\2\u012f"+
		"\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\25\3\2\2"+
		"\2\u0132\u0130\3\2\2\2\u0133\u0134\b\f\1\2\u0134\u0135\5N(\2\u0135\u0136"+
		"\5\26\f\2\u0136\u0137\5P)\2\u0137\u0144\3\2\2\2\u0138\u0144\5$\23\2\u0139"+
		"\u0144\5&\24\2\u013a\u0144\5(\25\2\u013b\u0144\5@!\2\u013c\u0144\5B\""+
		"\2\u013d\u0144\5D#\2\u013e\u0144\5\u0086D\2\u013f\u0144\5\66\34\2\u0140"+
		"\u0144\5\64\33\2\u0141\u0144\5\20\t\2\u0142\u0144\5L\'\2\u0143\u0133\3"+
		"\2\2\2\u0143\u0138\3\2\2\2\u0143\u0139\3\2\2\2\u0143\u013a\3\2\2\2\u0143"+
		"\u013b\3\2\2\2\u0143\u013c\3\2\2\2\u0143\u013d\3\2\2\2\u0143\u013e\3\2"+
		"\2\2\u0143\u013f\3\2\2\2\u0143\u0140\3\2\2\2\u0143\u0141\3\2\2\2\u0143"+
		"\u0142\3\2\2\2\u0144\u0151\3\2\2\2\u0145\u0146\f\20\2\2\u0146\u0150\5"+
		"\26\f\21\u0147\u0148\f\17\2\2\u0148\u0149\5T+\2\u0149\u014a\5\26\f\20"+
		"\u014a\u0150\3\2\2\2\u014b\u014c\f\16\2\2\u014c\u014d\5R*\2\u014d\u014e"+
		"\5\26\f\17\u014e\u0150\3\2\2\2\u014f\u0145\3\2\2\2\u014f\u0147\3\2\2\2"+
		"\u014f\u014b\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152"+
		"\3\2\2\2\u0152\27\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0155\b\r\1\2\u0155"+
		"\u0156\5N(\2\u0156\u0157\5\30\r\2\u0157\u0158\5P)\2\u0158\u0165\3\2\2"+
		"\2\u0159\u0165\5$\23\2\u015a\u0165\5&\24\2\u015b\u0165\5(\25\2\u015c\u0165"+
		"\5@!\2\u015d\u0165\5B\"\2\u015e\u0165\5D#\2\u015f\u0165\5\u0086D\2\u0160"+
		"\u0165\5:\36\2\u0161\u0165\58\35\2\u0162\u0165\5\20\t\2\u0163\u0165\5"+
		"L\'\2\u0164\u0154\3\2\2\2\u0164\u0159\3\2\2\2\u0164\u015a\3\2\2\2\u0164"+
		"\u015b\3\2\2\2\u0164\u015c\3\2\2\2\u0164\u015d\3\2\2\2\u0164\u015e\3\2"+
		"\2\2\u0164\u015f\3\2\2\2\u0164\u0160\3\2\2\2\u0164\u0161\3\2\2\2\u0164"+
		"\u0162\3\2\2\2\u0164\u0163\3\2\2\2\u0165\u0172\3\2\2\2\u0166\u0167\f\20"+
		"\2\2\u0167\u0171\5\30\r\21\u0168\u0169\f\17\2\2\u0169\u016a\5T+\2\u016a"+
		"\u016b\5\30\r\20\u016b\u0171\3\2\2\2\u016c\u016d\f\16\2\2\u016d\u016e"+
		"\5R*\2\u016e\u016f\5\30\r\17\u016f\u0171\3\2\2\2\u0170\u0166\3\2\2\2\u0170"+
		"\u0168\3\2\2\2\u0170\u016c\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2"+
		"\2\2\u0172\u0173\3\2\2\2\u0173\31\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0176"+
		"\b\16\1\2\u0176\u0177\5N(\2\u0177\u0178\5\32\16\2\u0178\u0179\5P)\2\u0179"+
		"\u0184\3\2\2\2\u017a\u0184\5$\23\2\u017b\u0184\5&\24\2\u017c\u0184\5("+
		"\25\2\u017d\u0184\5@!\2\u017e\u0184\5B\"\2\u017f\u0184\5D#\2\u0180\u0184"+
		"\5\u0086D\2\u0181\u0184\5\20\t\2\u0182\u0184\5L\'\2\u0183\u0175\3\2\2"+
		"\2\u0183\u017a\3\2\2\2\u0183\u017b\3\2\2\2\u0183\u017c\3\2\2\2\u0183\u017d"+
		"\3\2\2\2\u0183\u017e\3\2\2\2\u0183\u017f\3\2\2\2\u0183\u0180\3\2\2\2\u0183"+
		"\u0181\3\2\2\2\u0183\u0182\3\2\2\2\u0184\u0191\3\2\2\2\u0185\u0186\f\16"+
		"\2\2\u0186\u0190\5\32\16\17\u0187\u0188\f\r\2\2\u0188\u0189\5T+\2\u0189"+
		"\u018a\5\32\16\16\u018a\u0190\3\2\2\2\u018b\u018c\f\f\2\2\u018c\u018d"+
		"\5R*\2\u018d\u018e\5\32\16\r\u018e\u0190\3\2\2\2\u018f\u0185\3\2\2\2\u018f"+
		"\u0187\3\2\2\2\u018f\u018b\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f\3\2"+
		"\2\2\u0191\u0192\3\2\2\2\u0192\33\3\2\2\2\u0193\u0191\3\2\2\2\u0194\u0195"+
		"\b\17\1\2\u0195\u0196\5N(\2\u0196\u0197\5\34\17\2\u0197\u0198\5P)\2\u0198"+
		"\u01a4\3\2\2\2\u0199\u01a4\5$\23\2\u019a\u01a4\5&\24\2\u019b\u01a4\5("+
		"\25\2\u019c\u01a4\5@!\2\u019d\u01a4\5B\"\2\u019e\u01a4\5D#\2\u019f\u01a4"+
		"\5\20\t\2\u01a0\u01a4\5\b\5\2\u01a1\u01a4\5,\27\2\u01a2\u01a4\5.\30\2"+
		"\u01a3\u0194\3\2\2\2\u01a3\u0199\3\2\2\2\u01a3\u019a\3\2\2\2\u01a3\u019b"+
		"\3\2\2\2\u01a3\u019c\3\2\2\2\u01a3\u019d\3\2\2\2\u01a3\u019e\3\2\2\2\u01a3"+
		"\u019f\3\2\2\2\u01a3\u01a0\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a2\3\2"+
		"\2\2\u01a4\u01b5\3\2\2\2\u01a5\u01a6\f\20\2\2\u01a6\u01b4\5\34\17\21\u01a7"+
		"\u01a8\f\17\2\2\u01a8\u01a9\5T+\2\u01a9\u01aa\5\34\17\20\u01aa\u01b4\3"+
		"\2\2\2\u01ab\u01ac\f\16\2\2\u01ac\u01ad\5R*\2\u01ad\u01ae\5\34\17\17\u01ae"+
		"\u01b4\3\2\2\2\u01af\u01b0\f\r\2\2\u01b0\u01b1\5V,\2\u01b1\u01b2\5\34"+
		"\17\16\u01b2\u01b4\3\2\2\2\u01b3\u01a5\3\2\2\2\u01b3\u01a7\3\2\2\2\u01b3"+
		"\u01ab\3\2\2\2\u01b3\u01af\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2"+
		"\2\2\u01b5\u01b6\3\2\2\2\u01b6\35\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01b9"+
		"\b\20\1\2\u01b9\u01ba\5N(\2\u01ba\u01bb\5\36\20\2\u01bb\u01bc\5P)\2\u01bc"+
		"\u01c6\3\2\2\2\u01bd\u01c6\5@!\2\u01be\u01c6\5B\"\2\u01bf\u01c6\5D#\2"+
		"\u01c0\u01c6\5\u0086D\2\u01c1\u01c6\5\20\t\2\u01c2\u01c6\5L\'\2\u01c3"+
		"\u01c6\5,\27\2\u01c4\u01c6\5.\30\2\u01c5\u01b8\3\2\2\2\u01c5\u01bd\3\2"+
		"\2\2\u01c5\u01be\3\2\2\2\u01c5\u01bf\3\2\2\2\u01c5\u01c0\3\2\2\2\u01c5"+
		"\u01c1\3\2\2\2\u01c5\u01c2\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c4\3\2"+
		"\2\2\u01c6\u01d7\3\2\2\2\u01c7\u01c8\f\16\2\2\u01c8\u01d6\5\36\20\17\u01c9"+
		"\u01ca\f\r\2\2\u01ca\u01cb\5T+\2\u01cb\u01cc\5\36\20\16\u01cc\u01d6\3"+
		"\2\2\2\u01cd\u01ce\f\f\2\2\u01ce\u01cf\5R*\2\u01cf\u01d0\5\36\20\r\u01d0"+
		"\u01d6\3\2\2\2\u01d1\u01d2\f\13\2\2\u01d2\u01d3\5V,\2\u01d3\u01d4\5\36"+
		"\20\f\u01d4\u01d6\3\2\2\2\u01d5\u01c7\3\2\2\2\u01d5\u01c9\3\2\2\2\u01d5"+
		"\u01cd\3\2\2\2\u01d5\u01d1\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7\u01d5\3\2"+
		"\2\2\u01d7\u01d8\3\2\2\2\u01d8\37\3\2\2\2\u01d9\u01d7\3\2\2\2\u01da\u01db"+
		"\b\21\1\2\u01db\u01dc\5N(\2\u01dc\u01dd\5 \21\2\u01dd\u01de\5P)\2\u01de"+
		"\u01e9\3\2\2\2\u01df\u01e9\5@!\2\u01e0\u01e9\5B\"\2\u01e1\u01e9\5D#\2"+
		"\u01e2\u01e9\5\u0086D\2\u01e3\u01e9\5\20\t\2\u01e4\u01e9\5L\'\2\u01e5"+
		"\u01e9\5$\23\2\u01e6\u01e9\5,\27\2\u01e7\u01e9\5.\30\2\u01e8\u01da\3\2"+
		"\2\2\u01e8\u01df\3\2\2\2\u01e8\u01e0\3\2\2\2\u01e8\u01e1\3\2\2\2\u01e8"+
		"\u01e2\3\2\2\2\u01e8\u01e3\3\2\2\2\u01e8\u01e4\3\2\2\2\u01e8\u01e5\3\2"+
		"\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e7\3\2\2\2\u01e9\u01fa\3\2\2\2\u01ea"+
		"\u01eb\f\17\2\2\u01eb\u01f9\5 \21\20\u01ec\u01ed\f\r\2\2\u01ed\u01ee\5"+
		"R*\2\u01ee\u01ef\5 \21\16\u01ef\u01f9\3\2\2\2\u01f0\u01f1\f\f\2\2\u01f1"+
		"\u01f2\5V,\2\u01f2\u01f3\5 \21\r\u01f3\u01f9\3\2\2\2\u01f4\u01f5\f\16"+
		"\2\2\u01f5\u01f6\5T+\2\u01f6\u01f7\5\36\20\2\u01f7\u01f9\3\2\2\2\u01f8"+
		"\u01ea\3\2\2\2\u01f8\u01ec\3\2\2\2\u01f8\u01f0\3\2\2\2\u01f8\u01f4\3\2"+
		"\2\2\u01f9\u01fc\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb"+
		"!\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fd\u01fe\b\22\1\2\u01fe\u01ff\5N(\2\u01ff"+
		"\u0200\5\"\22\2\u0200\u0201\5P)\2\u0201\u020d\3\2\2\2\u0202\u020d\5@!"+
		"\2\u0203\u020d\5B\"\2\u0204\u020d\5D#\2\u0205\u020d\5\u0086D\2\u0206\u020d"+
		"\5\20\t\2\u0207\u020d\5L\'\2\u0208\u020d\5$\23\2\u0209\u020d\5&\24\2\u020a"+
		"\u020d\5,\27\2\u020b\u020d\5.\30\2\u020c\u01fd\3\2\2\2\u020c\u0202\3\2"+
		"\2\2\u020c\u0203\3\2\2\2\u020c\u0204\3\2\2\2\u020c\u0205\3\2\2\2\u020c"+
		"\u0206\3\2\2\2\u020c\u0207\3\2\2\2\u020c\u0208\3\2\2\2\u020c\u0209\3\2"+
		"\2\2\u020c\u020a\3\2\2\2\u020c\u020b\3\2\2\2\u020d\u021e\3\2\2\2\u020e"+
		"\u020f\f\20\2\2\u020f\u021d\5\"\22\21\u0210\u0211\f\17\2\2\u0211\u0212"+
		"\5T+\2\u0212\u0213\5\"\22\20\u0213\u021d\3\2\2\2\u0214\u0215\f\16\2\2"+
		"\u0215\u0216\5R*\2\u0216\u0217\5\"\22\17\u0217\u021d\3\2\2\2\u0218\u0219"+
		"\f\r\2\2\u0219\u021a\5V,\2\u021a\u021b\5\"\22\16\u021b\u021d\3\2\2\2\u021c"+
		"\u020e\3\2\2\2\u021c\u0210\3\2\2\2\u021c\u0214\3\2\2\2\u021c\u0218\3\2"+
		"\2\2\u021d\u0220\3\2\2\2\u021e\u021c\3\2\2\2\u021e\u021f\3\2\2\2\u021f"+
		"#\3\2\2\2\u0220\u021e\3\2\2\2\u0221\u0222\7#\2\2\u0222\u0223\5\36\20\2"+
		"\u0223\u0224\7$\2\2\u0224\u0225\5\36\20\2\u0225\u0226\7%\2\2\u0226%\3"+
		"\2\2\2\u0227\u0228\7&\2\2\u0228\u0229\5 \21\2\u0229\u022a\7\'\2\2\u022a"+
		"\u022b\5 \21\2\u022b\u022c\7(\2\2\u022c\'\3\2\2\2\u022d\u022e\7)\2\2\u022e"+
		"\u022f\5\"\22\2\u022f\u0230\7*\2\2\u0230\u0231\5\"\22\2\u0231\u0232\7"+
		"+\2\2\u0232)\3\2\2\2\u0233\u0234\5\32\16\2\u0234+\3\2\2\2\u0235\u0236"+
		"\7.\2\2\u0236\u0237\5\24\13\2\u0237\u0238\7\"\2\2\u0238-\3\2\2\2\u0239"+
		"\u023a\7 \2\2\u023a\u023b\5*\26\2\u023b\u023c\7.\2\2\u023c\u023d\5\24"+
		"\13\2\u023d\u023e\7\"\2\2\u023e/\3\2\2\2\u023f\u0240\7/\2\2\u0240\u0241"+
		"\5\26\f\2\u0241\u0242\7\65\2\2\u0242\61\3\2\2\2\u0243\u0244\7\62\2\2\u0244"+
		"\u0245\5*\26\2\u0245\u0246\7.\2\2\u0246\u0247\5\26\f\2\u0247\u0248\7\65"+
		"\2\2\u0248\63\3\2\2\2\u0249\u024a\7\60\2\2\u024a\u024b\5\30\r\2\u024b"+
		"\u024c\7\66\2\2\u024c\65\3\2\2\2\u024d\u024e\7\63\2\2\u024e\u024f\5*\26"+
		"\2\u024f\u0250\7.\2\2\u0250\u0251\5\30\r\2\u0251\u0252\7\66\2\2\u0252"+
		"\67\3\2\2\2\u0253\u0254\7\61\2\2\u0254\u0255\5\32\16\2\u0255\u0256\7\67"+
		"\2\2\u02569\3\2\2\2\u0257\u0258\7\64\2\2\u0258\u0259\5*\26\2\u0259\u025a"+
		"\7.\2\2\u025a\u025b\5\32\16\2\u025b\u025c\7\67\2\2\u025c;\3\2\2\2\u025d"+
		"\u025e\b\37\1\2\u025e\u025f\5N(\2\u025f\u0260\5<\37\2\u0260\u0261\5P)"+
		"\2\u0261\u026a\3\2\2\2\u0262\u026a\5$\23\2\u0263\u026a\5&\24\2\u0264\u026a"+
		"\5(\25\2\u0265\u026a\5\u0086D\2\u0266\u026a\5.\30\2\u0267\u026a\5,\27"+
		"\2\u0268\u026a\5\20\t\2\u0269\u025d\3\2\2\2\u0269\u0262\3\2\2\2\u0269"+
		"\u0263\3\2\2\2\u0269\u0264\3\2\2\2\u0269\u0265\3\2\2\2\u0269\u0266\3\2"+
		"\2\2\u0269\u0267\3\2\2\2\u0269\u0268\3\2\2\2\u026a\u027b\3\2\2\2\u026b"+
		"\u026c\f\r\2\2\u026c\u027a\5<\37\16\u026d\u026e\f\f\2\2\u026e\u026f\5"+
		"T+\2\u026f\u0270\5<\37\r\u0270\u027a\3\2\2\2\u0271\u0272\f\13\2\2\u0272"+
		"\u0273\5R*\2\u0273\u0274\5<\37\f\u0274\u027a\3\2\2\2\u0275\u0276\f\n\2"+
		"\2\u0276\u0277\5V,\2\u0277\u0278\5<\37\13\u0278\u027a\3\2\2\2\u0279\u026b"+
		"\3\2\2\2\u0279\u026d\3\2\2\2\u0279\u0271\3\2\2\2\u0279\u0275\3\2\2\2\u027a"+
		"\u027d\3\2\2\2\u027b\u0279\3\2\2\2\u027b\u027c\3\2\2\2\u027c=\3\2\2\2"+
		"\u027d\u027b\3\2\2\2\u027e\u027f\5<\37\2\u027f?\3\2\2\2\u0280\u0281\7"+
		"\37\2\2\u0281\u0282\5> \2\u0282\u0283\7!\2\2\u0283\u0284\5F$\2\u0284\u0285"+
		"\7\"\2\2\u0285A\3\2\2\2\u0286\u0287\7\37\2\2\u0287\u0288\5> \2\u0288\u0289"+
		"\7 \2\2\u0289\u028a\5F$\2\u028a\u028b\7\"\2\2\u028bC\3\2\2\2\u028c\u028d"+
		"\7\37\2\2\u028d\u028e\5> \2\u028e\u028f\7!\2\2\u028f\u0290\5F$\2\u0290"+
		"\u0291\7 \2\2\u0291\u0292\5F$\2\u0292\u0293\7\"\2\2\u0293E\3\2\2\2\u0294"+
		"\u0295\5<\37\2\u0295G\3\2\2\2\u0296\u0297\7C\2\2\u0297I\3\2\2\2\u0298"+
		"\u0299\7A\2\2\u0299K\3\2\2\2\u029a\u029b\7\37\2\2\u029b\u029c\5J&\2\u029c"+
		"\u029d\t\2\2\2\u029d\u029e\5F$\2\u029e\u02aa\3\2\2\2\u029f\u02a2\5J&\2"+
		"\u02a0\u02a2\5H%\2\u02a1\u029f\3\2\2\2\u02a1\u02a0\3\2\2\2\u02a2\u02a7"+
		"\3\2\2\2\u02a3\u02a4\7\33\2\2\u02a4\u02a8\5z>\2\u02a5\u02a6\7\36\2\2\u02a6"+
		"\u02a8\5z>\2\u02a7\u02a3\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a7\u02a8\3\2\2"+
		"\2\u02a8\u02aa\3\2\2\2\u02a9\u029a\3\2\2\2\u02a9\u02a1\3\2\2\2\u02aaM"+
		"\3\2\2\2\u02ab\u02ac\7\22\2\2\u02acO\3\2\2\2\u02ad\u02ae\7\23\2\2\u02ae"+
		"Q\3\2\2\2\u02af\u02b0\7\24\2\2\u02b0S\3\2\2\2\u02b1\u02b2\t\3\2\2\u02b2"+
		"U\3\2\2\2\u02b3\u02b4\7\30\2\2\u02b4\u02b9\79\2\2\u02b5\u02b6\79\2\2\u02b6"+
		"\u02b7\78\2\2\u02b7\u02b9\79\2\2\u02b8\u02b3\3\2\2\2\u02b8\u02b5\3\2\2"+
		"\2\u02b9W\3\2\2\2\u02ba\u02bb\t\4\2\2\u02bbY\3\2\2\2\u02bc\u02be\5X-\2"+
		"\u02bd\u02bc\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02bd\3\2\2\2\u02bf\u02c0"+
		"\3\2\2\2\u02c0\u02c6\3\2\2\2\u02c1\u02c6\7\5\2\2\u02c2\u02c6\7\n\2\2\u02c3"+
		"\u02c6\7\b\2\2\u02c4\u02c6\5\\/\2\u02c5\u02bd\3\2\2\2\u02c5\u02c1\3\2"+
		"\2\2\u02c5\u02c2\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c5\u02c4\3\2\2\2\u02c6"+
		"[\3\2\2\2\u02c7\u02c9\7\13\2\2\u02c8\u02c7\3\2\2\2\u02c9\u02ca\3\2\2\2"+
		"\u02ca\u02c8\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb]\3\2\2\2\u02cc\u02cd\t"+
		"\5\2\2\u02cd_\3\2\2\2\u02ce\u02d2\7\26\2\2\u02cf\u02d1\7\26\2\2\u02d0"+
		"\u02cf\3\2\2\2\u02d1\u02d4\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d2\u02d3\3\2"+
		"\2\2\u02d3\u02e3\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d5\u02d7\7\26\2\2\u02d6"+
		"\u02d5\3\2\2\2\u02d7\u02da\3\2\2\2\u02d8\u02d6\3\2\2\2\u02d8\u02d9\3\2"+
		"\2\2\u02d9\u02db\3\2\2\2\u02da\u02d8\3\2\2\2\u02db\u02df\7\27\2\2\u02dc"+
		"\u02de\7\26\2\2\u02dd\u02dc\3\2\2\2\u02de\u02e1\3\2\2\2\u02df\u02dd\3"+
		"\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e3\3\2\2\2\u02e1\u02df\3\2\2\2\u02e2"+
		"\u02ce\3\2\2\2\u02e2\u02d8\3\2\2\2\u02e3a\3\2\2\2\u02e4\u02e7\5Z.\2\u02e5"+
		"\u02e7\5J&\2\u02e6\u02e4\3\2\2\2\u02e6\u02e5\3\2\2\2\u02e7\u02e8\3\2\2"+
		"\2\u02e8\u02e9\5`\61\2\u02e9c\3\2\2\2\u02ea\u02eb\t\6\2\2\u02ebe\3\2\2"+
		"\2\u02ec\u02ed\5d\63\2\u02ed\u02ee\5`\61\2\u02eeg\3\2\2\2\u02ef\u02f2"+
		"\7\22\2\2\u02f0\u02f3\5d\63\2\u02f1\u02f3\5f\64\2\u02f2\u02f0\3\2\2\2"+
		"\u02f2\u02f1\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f4\u02f5"+
		"\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f7\7\23\2\2\u02f7\u02f8\7\33\2\2"+
		"\u02f8\u02f9\5`\61\2\u02f9i\3\2\2\2\u02fa\u0308\5f\64\2\u02fb\u02ff\5"+
		"d\63\2\u02fc\u02ff\5f\64\2\u02fd\u02ff\5h\65\2\u02fe\u02fb\3\2\2\2\u02fe"+
		"\u02fc\3\2\2\2\u02fe\u02fd\3\2\2\2\u02ff\u0303\3\2\2\2\u0300\u0304\5d"+
		"\63\2\u0301\u0304\5f\64\2\u0302\u0304\5h\65\2\u0303\u0300\3\2\2\2\u0303"+
		"\u0301\3\2\2\2\u0303\u0302\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u0303\3\2"+
		"\2\2\u0305\u0306\3\2\2\2\u0306\u0308\3\2\2\2\u0307\u02fa\3\2\2\2\u0307"+
		"\u02fe\3\2\2\2\u0308k\3\2\2\2\u0309\u030a\7\35\2\2\u030a\u030b\5z>\2\u030b"+
		"m\3\2\2\2\u030c\u030d\7\34\2\2\u030d\u030e\5z>\2\u030eo\3\2\2\2\u030f"+
		"\u0310\7\34\2\2\u0310\u0311\5z>\2\u0311\u0312\7\35\2\2\u0312\u0313\5z"+
		">\2\u0313q\3\2\2\2\u0314\u0315\7\31\2\2\u0315\u0316\5z>\2\u0316s\3\2\2"+
		"\2\u0317\u0318\7\32\2\2\u0318\u0319\5z>\2\u0319u\3\2\2\2\u031a\u031b\7"+
		"\31\2\2\u031b\u031c\5z>\2\u031c\u031d\7\32\2\2\u031d\u031e\5z>\2\u031e"+
		"w\3\2\2\2\u031f\u0320\5\34\17\2\u0320y\3\2\2\2\u0321\u0322\5\34\17\2\u0322"+
		"{\3\2\2\2\u0323\u0324\7\33\2\2\u0324\u0325\5z>\2\u0325}\3\2\2\2\u0326"+
		"\u0327\7\36\2\2\u0327\u0328\5z>\2\u0328\177\3\2\2\2\u0329\u032a\5x=\2"+
		"\u032a\u032b\7\33\2\2\u032b\u032f\5z>\2\u032c\u0330\5r:\2\u032d\u0330"+
		"\5t;\2\u032e\u0330\5v<\2\u032f\u032c\3\2\2\2\u032f\u032d\3\2\2\2\u032f"+
		"\u032e\3\2\2\2\u032f\u0330\3\2\2\2\u0330\u0332\3\2\2\2\u0331\u0333\7\37"+
		"\2\2\u0332\u0331\3\2\2\2\u0332\u0333\3\2\2\2\u0333\u0081\3\2\2\2\u0334"+
		"\u0335\5x=\2\u0335\u0336\7\36\2\2\u0336\u033a\5z>\2\u0337\u033b\5l\67"+
		"\2\u0338\u033b\5n8\2\u0339\u033b\5p9\2\u033a\u0337\3\2\2\2\u033a\u0338"+
		"\3\2\2\2\u033a\u0339\3\2\2\2\u033a\u033b\3\2\2\2\u033b\u033d\3\2\2\2\u033c"+
		"\u033e\7\37\2\2\u033d\u033c\3\2\2\2\u033d\u033e\3\2\2\2\u033e\u0083\3"+
		"\2\2\2\u033f\u0340\5x=\2\u0340\u0341\5|?\2\u0341\u0343\5~@\2\u0342\u0344"+
		"\7\37\2\2\u0343\u0342\3\2\2\2\u0343\u0344\3\2\2\2\u0344\u0085\3\2\2\2"+
		"\u0345\u0349\5\u0080A\2\u0346\u0349\5\u0082B\2\u0347\u0349\5\u0084C\2"+
		"\u0348\u0345\3\2\2\2\u0348\u0346\3\2\2\2\u0348\u0347\3\2\2\2\u0349\u0087"+
		"\3\2\2\2F\u008b\u0090\u0097\u009d\u00a3\u00a9\u00b4\u00ba\u00bc\u00c7"+
		"\u00ca\u00d8\u00e8\u00ea\u00fd\u010d\u010f\u0122\u012e\u0130\u0143\u014f"+
		"\u0151\u0164\u0170\u0172\u0183\u018f\u0191\u01a3\u01b3\u01b5\u01c5\u01d5"+
		"\u01d7\u01e8\u01f8\u01fa\u020c\u021c\u021e\u0269\u0279\u027b\u02a1\u02a7"+
		"\u02a9\u02b8\u02bf\u02c5\u02ca\u02d2\u02d8\u02df\u02e2\u02e6\u02f2\u02f4"+
		"\u02fe\u0303\u0305\u0307\u032f\u0332\u033a\u033d\u0343\u0348";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}