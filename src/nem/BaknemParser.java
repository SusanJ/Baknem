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
		LC_ID=1, ID=2, MIXID=3, CAP_ROMAN_NUM_SEQ=4, UC_ID=5, GREEK_LETTER=6, 
		MISCALPHD46=7, FACTORIAL=8, GENERAL_OMISSION=9, LGRP=10, RGRP=11, BINOP=12, 
		BINOP_PREC=13, INT=14, CMPR=15, SUBSUB=16, SUBSUP=17, SUB=18, SUPSUB=19, 
		SUPSUP=20, SUP=21, MODIF=22, MODOVER=23, MODUNDER=24, TERM=25, SFRAC=26, 
		FRAC_SLASH=27, ESFRAC=28, CFRAC=29, CSLASH=30, ECFRAC=31, HCFRAC=32, HCSLASH=33, 
		EHCFRAC=34, SMIXFR=35, EMIXFR=36, SQRT=37, SQRT1=38, SQRT2=39, SQRT3=40, 
		IRAD1=41, IRAD2=42, IRAD3=43, RTRM1=44, RTRM2=45, RTRM3=46, SPACE=47, 
		NEWLINE=48, INFINITY=49, INTEGRAL=50, LATIN_LETTER=51, FUN_ABBR=52, FUNCTION_NAME=53, 
		TRAIL_FUN_ABBR=54, LC_ROMAN_NUM_SEQ=55, CHEM_ELEMENT=56, POSS_CH_ELEMENT=57, 
		SUPER_SUP=58, SUPER_SUB=59, SUPER_SUP_SUB=60, SUPER_SUB_SUB=61, SUPER_SUP_SUP=62, 
		SUPER_SUB_SUP=63, HOLLOW_DOT=64, BFPLUS=65, PLUS_MINUS=66, BFMINUS=67, 
		MINUS_PLUS=68;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_space = 2, RULE_exprs = 3, RULE_expr = 4, 
		RULE_layexpr = 5, RULE_nor = 6, RULE_nor1 = 7, RULE_nor2 = 8, RULE_nor3 = 9, 
		RULE_nom = 10, RULE_nof = 11, RULE_nofc = 12, RULE_nofch = 13, RULE_mfrac = 14, 
		RULE_mmfrac = 15, RULE_mmmfrac = 16, RULE_rindex = 17, RULE_sqrt = 18, 
		RULE_irad = 19, RULE_sqrt1 = 20, RULE_irad1 = 21, RULE_sqrt2 = 22, RULE_irad2 = 23, 
		RULE_sqrt3 = 24, RULE_irad3 = 25, RULE_nomod = 26, RULE_begmod = 27, RULE_munder = 28, 
		RULE_mover = 29, RULE_mundov = 30, RULE_endmod = 31, RULE_funabb = 32, 
		RULE_func = 33, RULE_lgrp = 34, RULE_rgrp = 35, RULE_binop = 36, RULE_binop1 = 37, 
		RULE_cmpr = 38, RULE_var = 39, RULE_greeks = 40, RULE_specsym = 41, RULE_integer = 42, 
		RULE_numsub = 43, RULE_chelement = 44, RULE_chnumsub = 45, RULE_chradical = 46, 
		RULE_chformula = 47, RULE_sup2 = 48, RULE_sup2b = 49, RULE_sup22 = 50, 
		RULE_sub2 = 51, RULE_sub2p = 52, RULE_sub22 = 53, RULE_base = 54, RULE_script = 55, 
		RULE_supscript = 56, RULE_msub = 57, RULE_msup = 58, RULE_msubsup = 59, 
		RULE_mscript = 60;
	public static final String[] ruleNames = {
		"prog", "stat", "space", "exprs", "expr", "layexpr", "nor", "nor1", "nor2", 
		"nor3", "nom", "nof", "nofc", "nofch", "mfrac", "mmfrac", "mmmfrac", "rindex", 
		"sqrt", "irad", "sqrt1", "irad1", "sqrt2", "irad2", "sqrt3", "irad3", 
		"nomod", "begmod", "munder", "mover", "mundov", "endmod", "funabb", "func", 
		"lgrp", "rgrp", "binop", "binop1", "cmpr", "var", "greeks", "specsym", 
		"integer", "numsub", "chelement", "chnumsub", "chradical", "chformula", 
		"sup2", "sup2b", "sup22", "sub2", "sub2p", "sub22", "base", "script", 
		"supscript", "msub", "msup", "msubsup", "mscript"
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
		"IRAD3", "RTRM1", "RTRM2", "RTRM3", "SPACE", "NEWLINE", "INFINITY", "INTEGRAL", 
		"LATIN_LETTER", "FUN_ABBR", "FUNCTION_NAME", "TRAIL_FUN_ABBR", "LC_ROMAN_NUM_SEQ", 
		"CHEM_ELEMENT", "POSS_CH_ELEMENT", "SUPER_SUP", "SUPER_SUB", "SUPER_SUP_SUB", 
		"SUPER_SUB_SUB", "SUPER_SUP_SUP", "SUPER_SUB_SUP", "HOLLOW_DOT", "BFPLUS", 
		"PLUS_MINUS", "BFMINUS", "MINUS_PLUS"
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
			setState(123); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(122);
				stat();
				}
				}
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LC_ID) | (1L << ID) | (1L << MIXID) | (1L << UC_ID) | (1L << GREEK_LETTER) | (1L << MISCALPHD46) | (1L << LGRP) | (1L << INT) | (1L << MODIF) | (1L << MODOVER) | (1L << SFRAC) | (1L << CFRAC) | (1L << HCFRAC) | (1L << SQRT) | (1L << SPACE) | (1L << NEWLINE) | (1L << INFINITY) | (1L << INTEGRAL) | (1L << FUN_ABBR) | (1L << CHEM_ELEMENT) | (1L << POSS_CH_ELEMENT))) != 0) );
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
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LC_ID:
			case ID:
			case MIXID:
			case UC_ID:
			case GREEK_LETTER:
			case MISCALPHD46:
			case LGRP:
			case INT:
			case MODIF:
			case MODOVER:
			case SFRAC:
			case CFRAC:
			case HCFRAC:
			case SQRT:
			case SPACE:
			case INFINITY:
			case INTEGRAL:
			case FUN_ABBR:
			case CHEM_ELEMENT:
			case POSS_CH_ELEMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(127);
					space();
					}
					}
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(133);
				exprs();
				setState(143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(135); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(134);
							space();
							}
							}
							setState(137); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==SPACE );
						setState(139);
						exprs();
						}
						} 
					}
					setState(145);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(146);
					space();
					}
					}
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(152);
				match(NEWLINE);
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
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
		enterRule(_localctx, 4, RULE_space);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
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

	public static class ExprsContext extends ParserRuleContext {
		public LayexprContext layexpr() {
			return getRuleContext(LayexprContext.class,0);
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
		enterRule(_localctx, 6, RULE_exprs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(159);
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
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public SpecsymContext specsym() {
			return getRuleContext(SpecsymContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public NumsubContext numsub() {
			return getRuleContext(NumsubContext.class,0);
		}
		public ChnumsubContext chnumsub() {
			return getRuleContext(ChnumsubContext.class,0);
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(162);
				lgrp();
				setState(163);
				expr(0);
				setState(164);
				rgrp();
				}
				break;
			case 2:
				{
				setState(166);
				var();
				}
				break;
			case 3:
				{
				setState(167);
				specsym();
				}
				break;
			case 4:
				{
				setState(168);
				integer();
				}
				break;
			case 5:
				{
				setState(169);
				numsub();
				}
				break;
			case 6:
				{
				setState(170);
				chnumsub();
				}
				break;
			case 7:
				{
				setState(171);
				chelement();
				}
				break;
			case 8:
				{
				setState(172);
				chformula();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(189);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(175);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(176);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(177);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(178);
						binop1();
						setState(179);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(181);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(182);
						binop();
						setState(183);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(185);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(186);
						cmpr();
						setState(187);
						expr(9);
						}
						break;
					}
					} 
				}
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_layexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(195);
				lgrp();
				setState(196);
				layexpr(0);
				setState(197);
				rgrp();
				}
				break;
			case 2:
				{
				setState(199);
				mfrac();
				}
				break;
			case 3:
				{
				setState(200);
				mmfrac();
				}
				break;
			case 4:
				{
				setState(201);
				mmmfrac();
				}
				break;
			case 5:
				{
				setState(202);
				munder();
				}
				break;
			case 6:
				{
				setState(203);
				mover();
				}
				break;
			case 7:
				{
				setState(204);
				mundov();
				}
				break;
			case 8:
				{
				setState(205);
				mscript();
				}
				break;
			case 9:
				{
				setState(206);
				sqrt();
				}
				break;
			case 10:
				{
				setState(207);
				irad();
				}
				break;
			case 11:
				{
				setState(208);
				expr(0);
				}
				break;
			case 12:
				{
				setState(209);
				func();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(228);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(226);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new LayexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_layexpr);
						setState(212);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(213);
						layexpr(17);
						}
						break;
					case 2:
						{
						_localctx = new LayexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_layexpr);
						setState(214);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(215);
						binop1();
						setState(216);
						layexpr(15);
						}
						break;
					case 3:
						{
						_localctx = new LayexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_layexpr);
						setState(218);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(219);
						binop();
						setState(220);
						layexpr(14);
						}
						break;
					case 4:
						{
						_localctx = new LayexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_layexpr);
						setState(222);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(223);
						cmpr();
						setState(224);
						layexpr(13);
						}
						break;
					}
					} 
				}
				setState(230);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_nor, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(232);
				lgrp();
				setState(233);
				nor(0);
				setState(234);
				rgrp();
				}
				break;
			case 2:
				{
				setState(236);
				mfrac();
				}
				break;
			case 3:
				{
				setState(237);
				mmfrac();
				}
				break;
			case 4:
				{
				setState(238);
				mmmfrac();
				}
				break;
			case 5:
				{
				setState(239);
				munder();
				}
				break;
			case 6:
				{
				setState(240);
				mover();
				}
				break;
			case 7:
				{
				setState(241);
				mundov();
				}
				break;
			case 8:
				{
				setState(242);
				mscript();
				}
				break;
			case 9:
				{
				setState(243);
				irad1();
				}
				break;
			case 10:
				{
				setState(244);
				sqrt1();
				}
				break;
			case 11:
				{
				setState(245);
				expr(0);
				}
				break;
			case 12:
				{
				setState(246);
				func();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(261);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(259);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new NorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor);
						setState(249);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(250);
						nor(15);
						}
						break;
					case 2:
						{
						_localctx = new NorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor);
						setState(251);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(252);
						binop1();
						setState(253);
						nor(14);
						}
						break;
					case 3:
						{
						_localctx = new NorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor);
						setState(255);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(256);
						binop();
						setState(257);
						nor(13);
						}
						break;
					}
					} 
				}
				setState(263);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_nor1, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(265);
				lgrp();
				setState(266);
				nor1(0);
				setState(267);
				rgrp();
				}
				break;
			case 2:
				{
				setState(269);
				mfrac();
				}
				break;
			case 3:
				{
				setState(270);
				mmfrac();
				}
				break;
			case 4:
				{
				setState(271);
				mmmfrac();
				}
				break;
			case 5:
				{
				setState(272);
				munder();
				}
				break;
			case 6:
				{
				setState(273);
				mover();
				}
				break;
			case 7:
				{
				setState(274);
				mundov();
				}
				break;
			case 8:
				{
				setState(275);
				mscript();
				}
				break;
			case 9:
				{
				setState(276);
				irad2();
				}
				break;
			case 10:
				{
				setState(277);
				sqrt2();
				}
				break;
			case 11:
				{
				setState(278);
				expr(0);
				}
				break;
			case 12:
				{
				setState(279);
				func();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(294);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(292);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new Nor1Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor1);
						setState(282);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(283);
						nor1(15);
						}
						break;
					case 2:
						{
						_localctx = new Nor1Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor1);
						setState(284);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(285);
						binop1();
						setState(286);
						nor1(14);
						}
						break;
					case 3:
						{
						_localctx = new Nor1Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor1);
						setState(288);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(289);
						binop();
						setState(290);
						nor1(13);
						}
						break;
					}
					} 
				}
				setState(296);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_nor2, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(298);
				lgrp();
				setState(299);
				nor2(0);
				setState(300);
				rgrp();
				}
				break;
			case 2:
				{
				setState(302);
				mfrac();
				}
				break;
			case 3:
				{
				setState(303);
				mmfrac();
				}
				break;
			case 4:
				{
				setState(304);
				mmmfrac();
				}
				break;
			case 5:
				{
				setState(305);
				munder();
				}
				break;
			case 6:
				{
				setState(306);
				mover();
				}
				break;
			case 7:
				{
				setState(307);
				mundov();
				}
				break;
			case 8:
				{
				setState(308);
				mscript();
				}
				break;
			case 9:
				{
				setState(309);
				irad3();
				}
				break;
			case 10:
				{
				setState(310);
				sqrt3();
				}
				break;
			case 11:
				{
				setState(311);
				expr(0);
				}
				break;
			case 12:
				{
				setState(312);
				func();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(327);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(325);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new Nor2Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor2);
						setState(315);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(316);
						nor2(15);
						}
						break;
					case 2:
						{
						_localctx = new Nor2Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor2);
						setState(317);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(318);
						binop1();
						setState(319);
						nor2(14);
						}
						break;
					case 3:
						{
						_localctx = new Nor2Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor2);
						setState(321);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(322);
						binop();
						setState(323);
						nor2(13);
						}
						break;
					}
					} 
				}
				setState(329);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_nor3, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(331);
				lgrp();
				setState(332);
				nor3(0);
				setState(333);
				rgrp();
				}
				break;
			case 2:
				{
				setState(335);
				mfrac();
				}
				break;
			case 3:
				{
				setState(336);
				mmfrac();
				}
				break;
			case 4:
				{
				setState(337);
				mmmfrac();
				}
				break;
			case 5:
				{
				setState(338);
				munder();
				}
				break;
			case 6:
				{
				setState(339);
				mover();
				}
				break;
			case 7:
				{
				setState(340);
				mundov();
				}
				break;
			case 8:
				{
				setState(341);
				mscript();
				}
				break;
			case 9:
				{
				setState(342);
				expr(0);
				}
				break;
			case 10:
				{
				setState(343);
				func();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(358);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(356);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new Nor3Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor3);
						setState(346);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(347);
						nor3(13);
						}
						break;
					case 2:
						{
						_localctx = new Nor3Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor3);
						setState(348);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(349);
						binop1();
						setState(350);
						nor3(12);
						}
						break;
					case 3:
						{
						_localctx = new Nor3Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor3);
						setState(352);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(353);
						binop();
						setState(354);
						nor3(11);
						}
						break;
					}
					} 
				}
				setState(360);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_nom, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(362);
				lgrp();
				setState(363);
				nom(0);
				setState(364);
				rgrp();
				}
				break;
			case 2:
				{
				setState(366);
				mfrac();
				}
				break;
			case 3:
				{
				setState(367);
				mmfrac();
				}
				break;
			case 4:
				{
				setState(368);
				mmmfrac();
				}
				break;
			case 5:
				{
				setState(369);
				munder();
				}
				break;
			case 6:
				{
				setState(370);
				mover();
				}
				break;
			case 7:
				{
				setState(371);
				mundov();
				}
				break;
			case 8:
				{
				setState(372);
				expr(0);
				}
				break;
			case 9:
				{
				setState(373);
				func();
				}
				break;
			case 10:
				{
				setState(374);
				sqrt();
				}
				break;
			case 11:
				{
				setState(375);
				irad();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(394);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(392);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new NomContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nom);
						setState(378);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(379);
						nom(15);
						}
						break;
					case 2:
						{
						_localctx = new NomContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nom);
						setState(380);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(381);
						binop1();
						setState(382);
						nom(14);
						}
						break;
					case 3:
						{
						_localctx = new NomContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nom);
						setState(384);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(385);
						binop();
						setState(386);
						nom(13);
						}
						break;
					case 4:
						{
						_localctx = new NomContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nom);
						setState(388);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(389);
						cmpr();
						setState(390);
						nom(12);
						}
						break;
					}
					} 
				}
				setState(396);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_nof, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(398);
				lgrp();
				setState(399);
				nof(0);
				setState(400);
				rgrp();
				}
				break;
			case 2:
				{
				setState(402);
				munder();
				}
				break;
			case 3:
				{
				setState(403);
				mover();
				}
				break;
			case 4:
				{
				setState(404);
				mundov();
				}
				break;
			case 5:
				{
				setState(405);
				mscript();
				}
				break;
			case 6:
				{
				setState(406);
				expr(0);
				}
				break;
			case 7:
				{
				setState(407);
				func();
				}
				break;
			case 8:
				{
				setState(408);
				sqrt();
				}
				break;
			case 9:
				{
				setState(409);
				irad();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(428);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(426);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new NofContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nof);
						setState(412);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(413);
						nof(13);
						}
						break;
					case 2:
						{
						_localctx = new NofContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nof);
						setState(414);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(415);
						binop1();
						setState(416);
						nof(12);
						}
						break;
					case 3:
						{
						_localctx = new NofContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nof);
						setState(418);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(419);
						binop();
						setState(420);
						nof(11);
						}
						break;
					case 4:
						{
						_localctx = new NofContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nof);
						setState(422);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(423);
						cmpr();
						setState(424);
						nof(10);
						}
						break;
					}
					} 
				}
				setState(430);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_nofc, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(432);
				lgrp();
				setState(433);
				nofc(0);
				setState(434);
				rgrp();
				}
				break;
			case 2:
				{
				setState(436);
				munder();
				}
				break;
			case 3:
				{
				setState(437);
				mover();
				}
				break;
			case 4:
				{
				setState(438);
				mundov();
				}
				break;
			case 5:
				{
				setState(439);
				mscript();
				}
				break;
			case 6:
				{
				setState(440);
				expr(0);
				}
				break;
			case 7:
				{
				setState(441);
				func();
				}
				break;
			case 8:
				{
				setState(442);
				mfrac();
				}
				break;
			case 9:
				{
				setState(443);
				sqrt();
				}
				break;
			case 10:
				{
				setState(444);
				irad();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(463);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(461);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new NofcContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nofc);
						setState(447);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(448);
						nofc(14);
						}
						break;
					case 2:
						{
						_localctx = new NofcContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nofc);
						setState(449);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(450);
						binop();
						setState(451);
						nofc(12);
						}
						break;
					case 3:
						{
						_localctx = new NofcContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nofc);
						setState(453);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(454);
						cmpr();
						setState(455);
						nofc(11);
						}
						break;
					case 4:
						{
						_localctx = new NofcContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nofc);
						setState(457);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(458);
						binop1();
						setState(459);
						nof(0);
						}
						break;
					}
					} 
				}
				setState(465);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_nofch, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(467);
				lgrp();
				setState(468);
				nofch(0);
				setState(469);
				rgrp();
				}
				break;
			case 2:
				{
				setState(471);
				munder();
				}
				break;
			case 3:
				{
				setState(472);
				mover();
				}
				break;
			case 4:
				{
				setState(473);
				mundov();
				}
				break;
			case 5:
				{
				setState(474);
				mscript();
				}
				break;
			case 6:
				{
				setState(475);
				expr(0);
				}
				break;
			case 7:
				{
				setState(476);
				func();
				}
				break;
			case 8:
				{
				setState(477);
				mfrac();
				}
				break;
			case 9:
				{
				setState(478);
				mmfrac();
				}
				break;
			case 10:
				{
				setState(479);
				sqrt();
				}
				break;
			case 11:
				{
				setState(480);
				irad();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(499);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(497);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						_localctx = new NofchContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nofch);
						setState(483);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(484);
						nofch(15);
						}
						break;
					case 2:
						{
						_localctx = new NofchContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nofch);
						setState(485);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(486);
						binop1();
						setState(487);
						nofch(14);
						}
						break;
					case 3:
						{
						_localctx = new NofchContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nofch);
						setState(489);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(490);
						binop();
						setState(491);
						nofch(13);
						}
						break;
					case 4:
						{
						_localctx = new NofchContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nofch);
						setState(493);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(494);
						cmpr();
						setState(495);
						nofch(12);
						}
						break;
					}
					} 
				}
				setState(501);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
		enterRule(_localctx, 28, RULE_mfrac);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			match(SFRAC);
			setState(503);
			nof(0);
			setState(504);
			match(FRAC_SLASH);
			setState(505);
			nof(0);
			setState(506);
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
		enterRule(_localctx, 30, RULE_mmfrac);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(CFRAC);
			setState(509);
			nofc(0);
			setState(510);
			match(CSLASH);
			setState(511);
			nofc(0);
			setState(512);
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
		enterRule(_localctx, 32, RULE_mmmfrac);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			match(HCFRAC);
			setState(515);
			nofch(0);
			setState(516);
			match(HCSLASH);
			setState(517);
			nofch(0);
			setState(518);
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
		enterRule(_localctx, 34, RULE_rindex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
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
		enterRule(_localctx, 36, RULE_sqrt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(SQRT);
			setState(523);
			nor(0);
			setState(524);
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
		enterRule(_localctx, 38, RULE_irad);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(MODOVER);
			setState(527);
			rindex();
			setState(528);
			match(SQRT);
			setState(529);
			nor(0);
			setState(530);
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
		enterRule(_localctx, 40, RULE_sqrt1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			match(SQRT1);
			setState(533);
			nor1(0);
			setState(534);
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
		enterRule(_localctx, 42, RULE_irad1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			match(IRAD1);
			setState(537);
			rindex();
			setState(538);
			match(SQRT);
			setState(539);
			nor1(0);
			setState(540);
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
		enterRule(_localctx, 44, RULE_sqrt2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			match(SQRT2);
			setState(543);
			nor2(0);
			setState(544);
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
		enterRule(_localctx, 46, RULE_irad2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			match(IRAD2);
			setState(547);
			rindex();
			setState(548);
			match(SQRT);
			setState(549);
			nor2(0);
			setState(550);
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
		enterRule(_localctx, 48, RULE_sqrt3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			match(SQRT3);
			setState(553);
			nor3(0);
			setState(554);
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
		enterRule(_localctx, 50, RULE_irad3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			match(IRAD3);
			setState(557);
			rindex();
			setState(558);
			match(SQRT);
			setState(559);
			nor3(0);
			setState(560);
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
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_nomod, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(563);
				lgrp();
				setState(564);
				nomod(0);
				setState(565);
				rgrp();
				}
				break;
			case 2:
				{
				setState(567);
				mfrac();
				}
				break;
			case 3:
				{
				setState(568);
				mmfrac();
				}
				break;
			case 4:
				{
				setState(569);
				mmmfrac();
				}
				break;
			case 5:
				{
				setState(570);
				mscript();
				}
				break;
			case 6:
				{
				setState(571);
				irad();
				}
				break;
			case 7:
				{
				setState(572);
				sqrt();
				}
				break;
			case 8:
				{
				setState(573);
				expr(0);
				}
				break;
			case 9:
				{
				setState(574);
				func();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(593);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(591);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						_localctx = new NomodContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nomod);
						setState(577);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(578);
						nomod(13);
						}
						break;
					case 2:
						{
						_localctx = new NomodContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nomod);
						setState(579);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(580);
						binop1();
						setState(581);
						nomod(12);
						}
						break;
					case 3:
						{
						_localctx = new NomodContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nomod);
						setState(583);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(584);
						binop();
						setState(585);
						nomod(11);
						}
						break;
					case 4:
						{
						_localctx = new NomodContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nomod);
						setState(587);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(588);
						cmpr();
						setState(589);
						nomod(10);
						}
						break;
					}
					} 
				}
				setState(595);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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
		enterRule(_localctx, 54, RULE_begmod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
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
		enterRule(_localctx, 56, RULE_munder);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			match(MODIF);
			setState(599);
			begmod();
			setState(600);
			match(MODUNDER);
			setState(601);
			endmod();
			setState(602);
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
		enterRule(_localctx, 58, RULE_mover);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			match(MODIF);
			setState(605);
			begmod();
			setState(606);
			match(MODOVER);
			setState(607);
			endmod();
			setState(608);
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
		enterRule(_localctx, 60, RULE_mundov);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			match(MODIF);
			setState(611);
			begmod();
			setState(612);
			match(MODUNDER);
			setState(613);
			endmod();
			setState(614);
			match(MODOVER);
			setState(615);
			endmod();
			setState(616);
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
		enterRule(_localctx, 62, RULE_endmod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
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
		enterRule(_localctx, 64, RULE_funabb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
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
		public SpaceContext space() {
			return getRuleContext(SpaceContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode MODIF() { return getToken(BaknemParser.MODIF, 0); }
		public FunabbContext funabb() {
			return getRuleContext(FunabbContext.class,0);
		}
		public EndmodContext endmod() {
			return getRuleContext(EndmodContext.class,0);
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
		enterRule(_localctx, 66, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODIF:
				{
				setState(622);
				match(MODIF);
				setState(623);
				funabb();
				{
				setState(624);
				_la = _input.LA(1);
				if ( !(_la==MODOVER || _la==MODUNDER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(625);
				endmod();
				}
				}
				break;
			case FUN_ABBR:
				{
				setState(627);
				funabb();
				setState(632);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SUB:
					{
					setState(628);
					match(SUB);
					setState(629);
					script();
					}
					break;
				case SUP:
					{
					setState(630);
					match(SUP);
					setState(631);
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
			setState(636);
			space();
			setState(637);
			expr(0);
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
		enterRule(_localctx, 68, RULE_lgrp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
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
		enterRule(_localctx, 70, RULE_rgrp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
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
		enterRule(_localctx, 72, RULE_binop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
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
		enterRule(_localctx, 74, RULE_binop1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			match(BINOP_PREC);
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
		enterRule(_localctx, 76, RULE_cmpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			match(CMPR);
			setState(648);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BaknemParser.ID, 0); }
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
		enterRule(_localctx, 78, RULE_var);
		try {
			setState(655);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(650);
				match(ID);
				}
				break;
			case LC_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(651);
				match(LC_ID);
				}
				break;
			case UC_ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(652);
				match(UC_ID);
				}
				break;
			case MIXID:
				enterOuterAlt(_localctx, 4);
				{
				setState(653);
				match(MIXID);
				}
				break;
			case GREEK_LETTER:
				enterOuterAlt(_localctx, 5);
				{
				setState(654);
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
		enterRule(_localctx, 80, RULE_greeks);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(658); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(657);
					match(GREEK_LETTER);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(660); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
		public TerminalNode MISCALPHD46() { return getToken(BaknemParser.MISCALPHD46, 0); }
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
		enterRule(_localctx, 82, RULE_specsym);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MISCALPHD46) | (1L << INFINITY) | (1L << INTEGRAL))) != 0)) ) {
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

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(BaknemParser.INT, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitInteger(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			match(INT);
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
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
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
		enterRule(_localctx, 86, RULE_numsub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LC_ID:
			case ID:
			case MIXID:
			case UC_ID:
			case GREEK_LETTER:
				{
				setState(666);
				var();
				}
				break;
			case FUN_ABBR:
				{
				setState(667);
				funabb();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(670);
			integer();
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
		enterRule(_localctx, 88, RULE_chelement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
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
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
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
		enterRule(_localctx, 90, RULE_chnumsub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			chelement();
			setState(675);
			integer();
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
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
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
		enterRule(_localctx, 92, RULE_chradical);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			match(LGRP);
			setState(680); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(680);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(678);
					chelement();
					}
					break;
				case 2:
					{
					setState(679);
					chnumsub();
					}
					break;
				}
				}
				setState(682); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CHEM_ELEMENT || _la==POSS_CH_ELEMENT );
			setState(684);
			match(RGRP);
			setState(685);
			match(SUB);
			setState(686);
			integer();
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
		enterRule(_localctx, 94, RULE_chformula);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(691); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(691);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						setState(688);
						chelement();
						}
						break;
					case 2:
						{
						setState(689);
						chnumsub();
						}
						break;
					case 3:
						{
						setState(690);
						chradical();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(693); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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
		enterRule(_localctx, 96, RULE_sup2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(695);
			match(SUPSUP);
			}
			setState(696);
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
		enterRule(_localctx, 98, RULE_sup2b);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(698);
			match(SUPSUB);
			}
			setState(699);
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
		enterRule(_localctx, 100, RULE_sup22);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(701);
			match(SUPSUB);
			}
			setState(702);
			script();
			{
			setState(703);
			match(SUPSUP);
			}
			setState(704);
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
		enterRule(_localctx, 102, RULE_sub2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(706);
			match(SUBSUB);
			}
			setState(707);
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
		enterRule(_localctx, 104, RULE_sub2p);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(709);
			match(SUBSUP);
			}
			setState(710);
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
		enterRule(_localctx, 106, RULE_sub22);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(712);
			match(SUBSUB);
			}
			setState(713);
			script();
			{
			setState(714);
			match(SUBSUP);
			}
			setState(715);
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
		enterRule(_localctx, 108, RULE_base);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
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
		enterRule(_localctx, 110, RULE_script);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
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
		enterRule(_localctx, 112, RULE_supscript);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			match(SUP);
			setState(722);
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
		enterRule(_localctx, 114, RULE_msub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			base();
			setState(725);
			match(SUB);
			setState(726);
			script();
			setState(730);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(727);
				sub2();
				}
				break;
			case 2:
				{
				setState(728);
				sub2p();
				}
				break;
			case 3:
				{
				setState(729);
				sub22();
				}
				break;
			}
			setState(733);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(732);
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
		enterRule(_localctx, 116, RULE_msup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			base();
			setState(736);
			match(SUP);
			setState(737);
			script();
			setState(741);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(738);
				sup2();
				}
				break;
			case 2:
				{
				setState(739);
				sup2b();
				}
				break;
			case 3:
				{
				setState(740);
				sup22();
				}
				break;
			}
			setState(744);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(743);
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
		public MsubContext msub() {
			return getRuleContext(MsubContext.class,0);
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
		enterRule(_localctx, 118, RULE_msubsup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			msub();
			setState(747);
			supscript();
			setState(749);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(748);
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
		enterRule(_localctx, 120, RULE_mscript);
		try {
			setState(754);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(751);
				msub();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(752);
				msup();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(753);
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
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 5:
			return layexpr_sempred((LayexprContext)_localctx, predIndex);
		case 6:
			return nor_sempred((NorContext)_localctx, predIndex);
		case 7:
			return nor1_sempred((Nor1Context)_localctx, predIndex);
		case 8:
			return nor2_sempred((Nor2Context)_localctx, predIndex);
		case 9:
			return nor3_sempred((Nor3Context)_localctx, predIndex);
		case 10:
			return nom_sempred((NomContext)_localctx, predIndex);
		case 11:
			return nof_sempred((NofContext)_localctx, predIndex);
		case 12:
			return nofc_sempred((NofcContext)_localctx, predIndex);
		case 13:
			return nofch_sempred((NofchContext)_localctx, predIndex);
		case 26:
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
			return precpred(_ctx, 12);
		case 37:
			return precpred(_ctx, 11);
		case 38:
			return precpred(_ctx, 10);
		case 39:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3F\u02f7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\3\2\6\2~\n\2\r\2\16\2\177\3\3\7\3\u0083\n\3\f\3\16\3\u0086\13\3"+
		"\3\3\3\3\6\3\u008a\n\3\r\3\16\3\u008b\3\3\3\3\7\3\u0090\n\3\f\3\16\3\u0093"+
		"\13\3\3\3\7\3\u0096\n\3\f\3\16\3\u0099\13\3\3\3\3\3\3\3\5\3\u009e\n\3"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00b0"+
		"\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00c0"+
		"\n\6\f\6\16\6\u00c3\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7\u00d5\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\7\7\u00e5\n\7\f\7\16\7\u00e8\13\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00fa\n\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0106\n\b\f\b\16\b\u0109\13\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u011b\n"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0127\n\t\f\t\16\t\u012a"+
		"\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\n\u013c\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0148\n\n\f"+
		"\n\16\n\u014b\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\5\13\u015b\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\7\13\u0167\n\13\f\13\16\13\u016a\13\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u017b\n\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u018b\n\f\f\f\16\f\u018e"+
		"\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u019d\n"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u01ad\n"+
		"\r\f\r\16\r\u01b0\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\5\16\u01c0\n\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u01d0\n\16\f\16\16\16\u01d3"+
		"\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u01e4\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\7\17\u01f4\n\17\f\17\16\17\u01f7\13\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\5\34\u0242\n\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\7\34\u0252\n\34\f\34\16\34\u0255\13\34\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3 \3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u027b"+
		"\n#\5#\u027d\n#\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3)\3"+
		")\3)\5)\u0292\n)\3*\6*\u0295\n*\r*\16*\u0296\3+\3+\3,\3,\3-\3-\5-\u029f"+
		"\n-\3-\3-\3.\3.\3/\3/\3/\3\60\3\60\3\60\6\60\u02ab\n\60\r\60\16\60\u02ac"+
		"\3\60\3\60\3\60\3\60\3\61\3\61\3\61\6\61\u02b6\n\61\r\61\16\61\u02b7\3"+
		"\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3"+
		"\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38\39\39\3:\3:\3:\3;\3;\3;\3"+
		";\3;\3;\5;\u02dd\n;\3;\5;\u02e0\n;\3<\3<\3<\3<\3<\3<\5<\u02e8\n<\3<\5"+
		"<\u02eb\n<\3=\3=\3=\5=\u02f0\n=\3>\3>\3>\5>\u02f5\n>\3>\2\r\n\f\16\20"+
		"\22\24\26\30\32\34\66?\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz\2\5\3\2\31\32\4\2\t\t"+
		"\63\64\3\2:;\2\u0369\2}\3\2\2\2\4\u009d\3\2\2\2\6\u009f\3\2\2\2\b\u00a1"+
		"\3\2\2\2\n\u00af\3\2\2\2\f\u00d4\3\2\2\2\16\u00f9\3\2\2\2\20\u011a\3\2"+
		"\2\2\22\u013b\3\2\2\2\24\u015a\3\2\2\2\26\u017a\3\2\2\2\30\u019c\3\2\2"+
		"\2\32\u01bf\3\2\2\2\34\u01e3\3\2\2\2\36\u01f8\3\2\2\2 \u01fe\3\2\2\2\""+
		"\u0204\3\2\2\2$\u020a\3\2\2\2&\u020c\3\2\2\2(\u0210\3\2\2\2*\u0216\3\2"+
		"\2\2,\u021a\3\2\2\2.\u0220\3\2\2\2\60\u0224\3\2\2\2\62\u022a\3\2\2\2\64"+
		"\u022e\3\2\2\2\66\u0241\3\2\2\28\u0256\3\2\2\2:\u0258\3\2\2\2<\u025e\3"+
		"\2\2\2>\u0264\3\2\2\2@\u026c\3\2\2\2B\u026e\3\2\2\2D\u027c\3\2\2\2F\u0281"+
		"\3\2\2\2H\u0283\3\2\2\2J\u0285\3\2\2\2L\u0287\3\2\2\2N\u0289\3\2\2\2P"+
		"\u0291\3\2\2\2R\u0294\3\2\2\2T\u0298\3\2\2\2V\u029a\3\2\2\2X\u029e\3\2"+
		"\2\2Z\u02a2\3\2\2\2\\\u02a4\3\2\2\2^\u02a7\3\2\2\2`\u02b5\3\2\2\2b\u02b9"+
		"\3\2\2\2d\u02bc\3\2\2\2f\u02bf\3\2\2\2h\u02c4\3\2\2\2j\u02c7\3\2\2\2l"+
		"\u02ca\3\2\2\2n\u02cf\3\2\2\2p\u02d1\3\2\2\2r\u02d3\3\2\2\2t\u02d6\3\2"+
		"\2\2v\u02e1\3\2\2\2x\u02ec\3\2\2\2z\u02f4\3\2\2\2|~\5\4\3\2}|\3\2\2\2"+
		"~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\3\3\2\2\2\u0081\u0083"+
		"\5\6\4\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0091\5\b"+
		"\5\2\u0088\u008a\5\6\4\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\5\b"+
		"\5\2\u008e\u0090\3\2\2\2\u008f\u0089\3\2\2\2\u0090\u0093\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0097\3\2\2\2\u0093\u0091\3\2"+
		"\2\2\u0094\u0096\5\6\4\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0097\3\2"+
		"\2\2\u009a\u009b\7\62\2\2\u009b\u009e\3\2\2\2\u009c\u009e\7\62\2\2\u009d"+
		"\u0084\3\2\2\2\u009d\u009c\3\2\2\2\u009e\5\3\2\2\2\u009f\u00a0\7\61\2"+
		"\2\u00a0\7\3\2\2\2\u00a1\u00a2\5\f\7\2\u00a2\t\3\2\2\2\u00a3\u00a4\b\6"+
		"\1\2\u00a4\u00a5\5F$\2\u00a5\u00a6\5\n\6\2\u00a6\u00a7\5H%\2\u00a7\u00b0"+
		"\3\2\2\2\u00a8\u00b0\5P)\2\u00a9\u00b0\5T+\2\u00aa\u00b0\5V,\2\u00ab\u00b0"+
		"\5X-\2\u00ac\u00b0\5\\/\2\u00ad\u00b0\5Z.\2\u00ae\u00b0\5`\61\2\u00af"+
		"\u00a3\3\2\2\2\u00af\u00a8\3\2\2\2\u00af\u00a9\3\2\2\2\u00af\u00aa\3\2"+
		"\2\2\u00af\u00ab\3\2\2\2\u00af\u00ac\3\2\2\2\u00af\u00ad\3\2\2\2\u00af"+
		"\u00ae\3\2\2\2\u00b0\u00c1\3\2\2\2\u00b1\u00b2\f\r\2\2\u00b2\u00c0\5\n"+
		"\6\16\u00b3\u00b4\f\f\2\2\u00b4\u00b5\5L\'\2\u00b5\u00b6\5\n\6\r\u00b6"+
		"\u00c0\3\2\2\2\u00b7\u00b8\f\13\2\2\u00b8\u00b9\5J&\2\u00b9\u00ba\5\n"+
		"\6\f\u00ba\u00c0\3\2\2\2\u00bb\u00bc\f\n\2\2\u00bc\u00bd\5N(\2\u00bd\u00be"+
		"\5\n\6\13\u00be\u00c0\3\2\2\2\u00bf\u00b1\3\2\2\2\u00bf\u00b3\3\2\2\2"+
		"\u00bf\u00b7\3\2\2\2\u00bf\u00bb\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf"+
		"\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\13\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4"+
		"\u00c5\b\7\1\2\u00c5\u00c6\5F$\2\u00c6\u00c7\5\f\7\2\u00c7\u00c8\5H%\2"+
		"\u00c8\u00d5\3\2\2\2\u00c9\u00d5\5\36\20\2\u00ca\u00d5\5 \21\2\u00cb\u00d5"+
		"\5\"\22\2\u00cc\u00d5\5:\36\2\u00cd\u00d5\5<\37\2\u00ce\u00d5\5> \2\u00cf"+
		"\u00d5\5z>\2\u00d0\u00d5\5&\24\2\u00d1\u00d5\5(\25\2\u00d2\u00d5\5\n\6"+
		"\2\u00d3\u00d5\5D#\2\u00d4\u00c4\3\2\2\2\u00d4\u00c9\3\2\2\2\u00d4\u00ca"+
		"\3\2\2\2\u00d4\u00cb\3\2\2\2\u00d4\u00cc\3\2\2\2\u00d4\u00cd\3\2\2\2\u00d4"+
		"\u00ce\3\2\2\2\u00d4\u00cf\3\2\2\2\u00d4\u00d0\3\2\2\2\u00d4\u00d1\3\2"+
		"\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00e6\3\2\2\2\u00d6"+
		"\u00d7\f\22\2\2\u00d7\u00e5\5\f\7\23\u00d8\u00d9\f\20\2\2\u00d9\u00da"+
		"\5L\'\2\u00da\u00db\5\f\7\21\u00db\u00e5\3\2\2\2\u00dc\u00dd\f\17\2\2"+
		"\u00dd\u00de\5J&\2\u00de\u00df\5\f\7\20\u00df\u00e5\3\2\2\2\u00e0\u00e1"+
		"\f\16\2\2\u00e1\u00e2\5N(\2\u00e2\u00e3\5\f\7\17\u00e3\u00e5\3\2\2\2\u00e4"+
		"\u00d6\3\2\2\2\u00e4\u00d8\3\2\2\2\u00e4\u00dc\3\2\2\2\u00e4\u00e0\3\2"+
		"\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\r\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\b\b\1\2\u00ea\u00eb\5F$\2\u00eb"+
		"\u00ec\5\16\b\2\u00ec\u00ed\5H%\2\u00ed\u00fa\3\2\2\2\u00ee\u00fa\5\36"+
		"\20\2\u00ef\u00fa\5 \21\2\u00f0\u00fa\5\"\22\2\u00f1\u00fa\5:\36\2\u00f2"+
		"\u00fa\5<\37\2\u00f3\u00fa\5> \2\u00f4\u00fa\5z>\2\u00f5\u00fa\5,\27\2"+
		"\u00f6\u00fa\5*\26\2\u00f7\u00fa\5\n\6\2\u00f8\u00fa\5D#\2\u00f9\u00e9"+
		"\3\2\2\2\u00f9\u00ee\3\2\2\2\u00f9\u00ef\3\2\2\2\u00f9\u00f0\3\2\2\2\u00f9"+
		"\u00f1\3\2\2\2\u00f9\u00f2\3\2\2\2\u00f9\u00f3\3\2\2\2\u00f9\u00f4\3\2"+
		"\2\2\u00f9\u00f5\3\2\2\2\u00f9\u00f6\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9"+
		"\u00f8\3\2\2\2\u00fa\u0107\3\2\2\2\u00fb\u00fc\f\20\2\2\u00fc\u0106\5"+
		"\16\b\21\u00fd\u00fe\f\17\2\2\u00fe\u00ff\5L\'\2\u00ff\u0100\5\16\b\20"+
		"\u0100\u0106\3\2\2\2\u0101\u0102\f\16\2\2\u0102\u0103\5J&\2\u0103\u0104"+
		"\5\16\b\17\u0104\u0106\3\2\2\2\u0105\u00fb\3\2\2\2\u0105\u00fd\3\2\2\2"+
		"\u0105\u0101\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108"+
		"\3\2\2\2\u0108\17\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010b\b\t\1\2\u010b"+
		"\u010c\5F$\2\u010c\u010d\5\20\t\2\u010d\u010e\5H%\2\u010e\u011b\3\2\2"+
		"\2\u010f\u011b\5\36\20\2\u0110\u011b\5 \21\2\u0111\u011b\5\"\22\2\u0112"+
		"\u011b\5:\36\2\u0113\u011b\5<\37\2\u0114\u011b\5> \2\u0115\u011b\5z>\2"+
		"\u0116\u011b\5\60\31\2\u0117\u011b\5.\30\2\u0118\u011b\5\n\6\2\u0119\u011b"+
		"\5D#\2\u011a\u010a\3\2\2\2\u011a\u010f\3\2\2\2\u011a\u0110\3\2\2\2\u011a"+
		"\u0111\3\2\2\2\u011a\u0112\3\2\2\2\u011a\u0113\3\2\2\2\u011a\u0114\3\2"+
		"\2\2\u011a\u0115\3\2\2\2\u011a\u0116\3\2\2\2\u011a\u0117\3\2\2\2\u011a"+
		"\u0118\3\2\2\2\u011a\u0119\3\2\2\2\u011b\u0128\3\2\2\2\u011c\u011d\f\20"+
		"\2\2\u011d\u0127\5\20\t\21\u011e\u011f\f\17\2\2\u011f\u0120\5L\'\2\u0120"+
		"\u0121\5\20\t\20\u0121\u0127\3\2\2\2\u0122\u0123\f\16\2\2\u0123\u0124"+
		"\5J&\2\u0124\u0125\5\20\t\17\u0125\u0127\3\2\2\2\u0126\u011c\3\2\2\2\u0126"+
		"\u011e\3\2\2\2\u0126\u0122\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2"+
		"\2\2\u0128\u0129\3\2\2\2\u0129\21\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012c"+
		"\b\n\1\2\u012c\u012d\5F$\2\u012d\u012e\5\22\n\2\u012e\u012f\5H%\2\u012f"+
		"\u013c\3\2\2\2\u0130\u013c\5\36\20\2\u0131\u013c\5 \21\2\u0132\u013c\5"+
		"\"\22\2\u0133\u013c\5:\36\2\u0134\u013c\5<\37\2\u0135\u013c\5> \2\u0136"+
		"\u013c\5z>\2\u0137\u013c\5\64\33\2\u0138\u013c\5\62\32\2\u0139\u013c\5"+
		"\n\6\2\u013a\u013c\5D#\2\u013b\u012b\3\2\2\2\u013b\u0130\3\2\2\2\u013b"+
		"\u0131\3\2\2\2\u013b\u0132\3\2\2\2\u013b\u0133\3\2\2\2\u013b\u0134\3\2"+
		"\2\2\u013b\u0135\3\2\2\2\u013b\u0136\3\2\2\2\u013b\u0137\3\2\2\2\u013b"+
		"\u0138\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013a\3\2\2\2\u013c\u0149\3\2"+
		"\2\2\u013d\u013e\f\20\2\2\u013e\u0148\5\22\n\21\u013f\u0140\f\17\2\2\u0140"+
		"\u0141\5L\'\2\u0141\u0142\5\22\n\20\u0142\u0148\3\2\2\2\u0143\u0144\f"+
		"\16\2\2\u0144\u0145\5J&\2\u0145\u0146\5\22\n\17\u0146\u0148\3\2\2\2\u0147"+
		"\u013d\3\2\2\2\u0147\u013f\3\2\2\2\u0147\u0143\3\2\2\2\u0148\u014b\3\2"+
		"\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\23\3\2\2\2\u014b\u0149"+
		"\3\2\2\2\u014c\u014d\b\13\1\2\u014d\u014e\5F$\2\u014e\u014f\5\24\13\2"+
		"\u014f\u0150\5H%\2\u0150\u015b\3\2\2\2\u0151\u015b\5\36\20\2\u0152\u015b"+
		"\5 \21\2\u0153\u015b\5\"\22\2\u0154\u015b\5:\36\2\u0155\u015b\5<\37\2"+
		"\u0156\u015b\5> \2\u0157\u015b\5z>\2\u0158\u015b\5\n\6\2\u0159\u015b\5"+
		"D#\2\u015a\u014c\3\2\2\2\u015a\u0151\3\2\2\2\u015a\u0152\3\2\2\2\u015a"+
		"\u0153\3\2\2\2\u015a\u0154\3\2\2\2\u015a\u0155\3\2\2\2\u015a\u0156\3\2"+
		"\2\2\u015a\u0157\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u0159\3\2\2\2\u015b"+
		"\u0168\3\2\2\2\u015c\u015d\f\16\2\2\u015d\u0167\5\24\13\17\u015e\u015f"+
		"\f\r\2\2\u015f\u0160\5L\'\2\u0160\u0161\5\24\13\16\u0161\u0167\3\2\2\2"+
		"\u0162\u0163\f\f\2\2\u0163\u0164\5J&\2\u0164\u0165\5\24\13\r\u0165\u0167"+
		"\3\2\2\2\u0166\u015c\3\2\2\2\u0166\u015e\3\2\2\2\u0166\u0162\3\2\2\2\u0167"+
		"\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\25\3\2\2"+
		"\2\u016a\u0168\3\2\2\2\u016b\u016c\b\f\1\2\u016c\u016d\5F$\2\u016d\u016e"+
		"\5\26\f\2\u016e\u016f\5H%\2\u016f\u017b\3\2\2\2\u0170\u017b\5\36\20\2"+
		"\u0171\u017b\5 \21\2\u0172\u017b\5\"\22\2\u0173\u017b\5:\36\2\u0174\u017b"+
		"\5<\37\2\u0175\u017b\5> \2\u0176\u017b\5\n\6\2\u0177\u017b\5D#\2\u0178"+
		"\u017b\5&\24\2\u0179\u017b\5(\25\2\u017a\u016b\3\2\2\2\u017a\u0170\3\2"+
		"\2\2\u017a\u0171\3\2\2\2\u017a\u0172\3\2\2\2\u017a\u0173\3\2\2\2\u017a"+
		"\u0174\3\2\2\2\u017a\u0175\3\2\2\2\u017a\u0176\3\2\2\2\u017a\u0177\3\2"+
		"\2\2\u017a\u0178\3\2\2\2\u017a\u0179\3\2\2\2\u017b\u018c\3\2\2\2\u017c"+
		"\u017d\f\20\2\2\u017d\u018b\5\26\f\21\u017e\u017f\f\17\2\2\u017f\u0180"+
		"\5L\'\2\u0180\u0181\5\26\f\20\u0181\u018b\3\2\2\2\u0182\u0183\f\16\2\2"+
		"\u0183\u0184\5J&\2\u0184\u0185\5\26\f\17\u0185\u018b\3\2\2\2\u0186\u0187"+
		"\f\r\2\2\u0187\u0188\5N(\2\u0188\u0189\5\26\f\16\u0189\u018b\3\2\2\2\u018a"+
		"\u017c\3\2\2\2\u018a\u017e\3\2\2\2\u018a\u0182\3\2\2\2\u018a\u0186\3\2"+
		"\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d"+
		"\27\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0190\b\r\1\2\u0190\u0191\5F$\2"+
		"\u0191\u0192\5\30\r\2\u0192\u0193\5H%\2\u0193\u019d\3\2\2\2\u0194\u019d"+
		"\5:\36\2\u0195\u019d\5<\37\2\u0196\u019d\5> \2\u0197\u019d\5z>\2\u0198"+
		"\u019d\5\n\6\2\u0199\u019d\5D#\2\u019a\u019d\5&\24\2\u019b\u019d\5(\25"+
		"\2\u019c\u018f\3\2\2\2\u019c\u0194\3\2\2\2\u019c\u0195\3\2\2\2\u019c\u0196"+
		"\3\2\2\2\u019c\u0197\3\2\2\2\u019c\u0198\3\2\2\2\u019c\u0199\3\2\2\2\u019c"+
		"\u019a\3\2\2\2\u019c\u019b\3\2\2\2\u019d\u01ae\3\2\2\2\u019e\u019f\f\16"+
		"\2\2\u019f\u01ad\5\30\r\17\u01a0\u01a1\f\r\2\2\u01a1\u01a2\5L\'\2\u01a2"+
		"\u01a3\5\30\r\16\u01a3\u01ad\3\2\2\2\u01a4\u01a5\f\f\2\2\u01a5\u01a6\5"+
		"J&\2\u01a6\u01a7\5\30\r\r\u01a7\u01ad\3\2\2\2\u01a8\u01a9\f\13\2\2\u01a9"+
		"\u01aa\5N(\2\u01aa\u01ab\5\30\r\f\u01ab\u01ad\3\2\2\2\u01ac\u019e\3\2"+
		"\2\2\u01ac\u01a0\3\2\2\2\u01ac\u01a4\3\2\2\2\u01ac\u01a8\3\2\2\2\u01ad"+
		"\u01b0\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\31\3\2\2"+
		"\2\u01b0\u01ae\3\2\2\2\u01b1\u01b2\b\16\1\2\u01b2\u01b3\5F$\2\u01b3\u01b4"+
		"\5\32\16\2\u01b4\u01b5\5H%\2\u01b5\u01c0\3\2\2\2\u01b6\u01c0\5:\36\2\u01b7"+
		"\u01c0\5<\37\2\u01b8\u01c0\5> \2\u01b9\u01c0\5z>\2\u01ba\u01c0\5\n\6\2"+
		"\u01bb\u01c0\5D#\2\u01bc\u01c0\5\36\20\2\u01bd\u01c0\5&\24\2\u01be\u01c0"+
		"\5(\25\2\u01bf\u01b1\3\2\2\2\u01bf\u01b6\3\2\2\2\u01bf\u01b7\3\2\2\2\u01bf"+
		"\u01b8\3\2\2\2\u01bf\u01b9\3\2\2\2\u01bf\u01ba\3\2\2\2\u01bf\u01bb\3\2"+
		"\2\2\u01bf\u01bc\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01be\3\2\2\2\u01c0"+
		"\u01d1\3\2\2\2\u01c1\u01c2\f\17\2\2\u01c2\u01d0\5\32\16\20\u01c3\u01c4"+
		"\f\r\2\2\u01c4\u01c5\5J&\2\u01c5\u01c6\5\32\16\16\u01c6\u01d0\3\2\2\2"+
		"\u01c7\u01c8\f\f\2\2\u01c8\u01c9\5N(\2\u01c9\u01ca\5\32\16\r\u01ca\u01d0"+
		"\3\2\2\2\u01cb\u01cc\f\16\2\2\u01cc\u01cd\5L\'\2\u01cd\u01ce\5\30\r\2"+
		"\u01ce\u01d0\3\2\2\2\u01cf\u01c1\3\2\2\2\u01cf\u01c3\3\2\2\2\u01cf\u01c7"+
		"\3\2\2\2\u01cf\u01cb\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1"+
		"\u01d2\3\2\2\2\u01d2\33\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4\u01d5\b\17\1"+
		"\2\u01d5\u01d6\5F$\2\u01d6\u01d7\5\34\17\2\u01d7\u01d8\5H%\2\u01d8\u01e4"+
		"\3\2\2\2\u01d9\u01e4\5:\36\2\u01da\u01e4\5<\37\2\u01db\u01e4\5> \2\u01dc"+
		"\u01e4\5z>\2\u01dd\u01e4\5\n\6\2\u01de\u01e4\5D#\2\u01df\u01e4\5\36\20"+
		"\2\u01e0\u01e4\5 \21\2\u01e1\u01e4\5&\24\2\u01e2\u01e4\5(\25\2\u01e3\u01d4"+
		"\3\2\2\2\u01e3\u01d9\3\2\2\2\u01e3\u01da\3\2\2\2\u01e3\u01db\3\2\2\2\u01e3"+
		"\u01dc\3\2\2\2\u01e3\u01dd\3\2\2\2\u01e3\u01de\3\2\2\2\u01e3\u01df\3\2"+
		"\2\2\u01e3\u01e0\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e2\3\2\2\2\u01e4"+
		"\u01f5\3\2\2\2\u01e5\u01e6\f\20\2\2\u01e6\u01f4\5\34\17\21\u01e7\u01e8"+
		"\f\17\2\2\u01e8\u01e9\5L\'\2\u01e9\u01ea\5\34\17\20\u01ea\u01f4\3\2\2"+
		"\2\u01eb\u01ec\f\16\2\2\u01ec\u01ed\5J&\2\u01ed\u01ee\5\34\17\17\u01ee"+
		"\u01f4\3\2\2\2\u01ef\u01f0\f\r\2\2\u01f0\u01f1\5N(\2\u01f1\u01f2\5\34"+
		"\17\16\u01f2\u01f4\3\2\2\2\u01f3\u01e5\3\2\2\2\u01f3\u01e7\3\2\2\2\u01f3"+
		"\u01eb\3\2\2\2\u01f3\u01ef\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5\u01f3\3\2"+
		"\2\2\u01f5\u01f6\3\2\2\2\u01f6\35\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f8\u01f9"+
		"\7\34\2\2\u01f9\u01fa\5\30\r\2\u01fa\u01fb\7\35\2\2\u01fb\u01fc\5\30\r"+
		"\2\u01fc\u01fd\7\36\2\2\u01fd\37\3\2\2\2\u01fe\u01ff\7\37\2\2\u01ff\u0200"+
		"\5\32\16\2\u0200\u0201\7 \2\2\u0201\u0202\5\32\16\2\u0202\u0203\7!\2\2"+
		"\u0203!\3\2\2\2\u0204\u0205\7\"\2\2\u0205\u0206\5\34\17\2\u0206\u0207"+
		"\7#\2\2\u0207\u0208\5\34\17\2\u0208\u0209\7$\2\2\u0209#\3\2\2\2\u020a"+
		"\u020b\5\24\13\2\u020b%\3\2\2\2\u020c\u020d\7\'\2\2\u020d\u020e\5\16\b"+
		"\2\u020e\u020f\7\33\2\2\u020f\'\3\2\2\2\u0210\u0211\7\31\2\2\u0211\u0212"+
		"\5$\23\2\u0212\u0213\7\'\2\2\u0213\u0214\5\16\b\2\u0214\u0215\7\33\2\2"+
		"\u0215)\3\2\2\2\u0216\u0217\7(\2\2\u0217\u0218\5\20\t\2\u0218\u0219\7"+
		".\2\2\u0219+\3\2\2\2\u021a\u021b\7+\2\2\u021b\u021c\5$\23\2\u021c\u021d"+
		"\7\'\2\2\u021d\u021e\5\20\t\2\u021e\u021f\7.\2\2\u021f-\3\2\2\2\u0220"+
		"\u0221\7)\2\2\u0221\u0222\5\22\n\2\u0222\u0223\7/\2\2\u0223/\3\2\2\2\u0224"+
		"\u0225\7,\2\2\u0225\u0226\5$\23\2\u0226\u0227\7\'\2\2\u0227\u0228\5\22"+
		"\n\2\u0228\u0229\7/\2\2\u0229\61\3\2\2\2\u022a\u022b\7*\2\2\u022b\u022c"+
		"\5\24\13\2\u022c\u022d\7\60\2\2\u022d\63\3\2\2\2\u022e\u022f\7-\2\2\u022f"+
		"\u0230\5$\23\2\u0230\u0231\7\'\2\2\u0231\u0232\5\24\13\2\u0232\u0233\7"+
		"\60\2\2\u0233\65\3\2\2\2\u0234\u0235\b\34\1\2\u0235\u0236\5F$\2\u0236"+
		"\u0237\5\66\34\2\u0237\u0238\5H%\2\u0238\u0242\3\2\2\2\u0239\u0242\5\36"+
		"\20\2\u023a\u0242\5 \21\2\u023b\u0242\5\"\22\2\u023c\u0242\5z>\2\u023d"+
		"\u0242\5(\25\2\u023e\u0242\5&\24\2\u023f\u0242\5\n\6\2\u0240\u0242\5D"+
		"#\2\u0241\u0234\3\2\2\2\u0241\u0239\3\2\2\2\u0241\u023a\3\2\2\2\u0241"+
		"\u023b\3\2\2\2\u0241\u023c\3\2\2\2\u0241\u023d\3\2\2\2\u0241\u023e\3\2"+
		"\2\2\u0241\u023f\3\2\2\2\u0241\u0240\3\2\2\2\u0242\u0253\3\2\2\2\u0243"+
		"\u0244\f\16\2\2\u0244\u0252\5\66\34\17\u0245\u0246\f\r\2\2\u0246\u0247"+
		"\5L\'\2\u0247\u0248\5\66\34\16\u0248\u0252\3\2\2\2\u0249\u024a\f\f\2\2"+
		"\u024a\u024b\5J&\2\u024b\u024c\5\66\34\r\u024c\u0252\3\2\2\2\u024d\u024e"+
		"\f\13\2\2\u024e\u024f\5N(\2\u024f\u0250\5\66\34\f\u0250\u0252\3\2\2\2"+
		"\u0251\u0243\3\2\2\2\u0251\u0245\3\2\2\2\u0251\u0249\3\2\2\2\u0251\u024d"+
		"\3\2\2\2\u0252\u0255\3\2\2\2\u0253\u0251\3\2\2\2\u0253\u0254\3\2\2\2\u0254"+
		"\67\3\2\2\2\u0255\u0253\3\2\2\2\u0256\u0257\5\66\34\2\u02579\3\2\2\2\u0258"+
		"\u0259\7\30\2\2\u0259\u025a\58\35\2\u025a\u025b\7\32\2\2\u025b\u025c\5"+
		"@!\2\u025c\u025d\7\33\2\2\u025d;\3\2\2\2\u025e\u025f\7\30\2\2\u025f\u0260"+
		"\58\35\2\u0260\u0261\7\31\2\2\u0261\u0262\5@!\2\u0262\u0263\7\33\2\2\u0263"+
		"=\3\2\2\2\u0264\u0265\7\30\2\2\u0265\u0266\58\35\2\u0266\u0267\7\32\2"+
		"\2\u0267\u0268\5@!\2\u0268\u0269\7\31\2\2\u0269\u026a\5@!\2\u026a\u026b"+
		"\7\33\2\2\u026b?\3\2\2\2\u026c\u026d\5\66\34\2\u026dA\3\2\2\2\u026e\u026f"+
		"\7\66\2\2\u026fC\3\2\2\2\u0270\u0271\7\30\2\2\u0271\u0272\5B\"\2\u0272"+
		"\u0273\t\2\2\2\u0273\u0274\5@!\2\u0274\u027d\3\2\2\2\u0275\u027a\5B\""+
		"\2\u0276\u0277\7\24\2\2\u0277\u027b\5p9\2\u0278\u0279\7\27\2\2\u0279\u027b"+
		"\5p9\2\u027a\u0276\3\2\2\2\u027a\u0278\3\2\2\2\u027a\u027b\3\2\2\2\u027b"+
		"\u027d\3\2\2\2\u027c\u0270\3\2\2\2\u027c\u0275\3\2\2\2\u027d\u027e\3\2"+
		"\2\2\u027e\u027f\5\6\4\2\u027f\u0280\5\n\6\2\u0280E\3\2\2\2\u0281\u0282"+
		"\7\f\2\2\u0282G\3\2\2\2\u0283\u0284\7\r\2\2\u0284I\3\2\2\2\u0285\u0286"+
		"\7\16\2\2\u0286K\3\2\2\2\u0287\u0288\7\17\2\2\u0288M\3\2\2\2\u0289\u028a"+
		"\7\21\2\2\u028a\u028b\7\61\2\2\u028bO\3\2\2\2\u028c\u0292\7\4\2\2\u028d"+
		"\u0292\7\3\2\2\u028e\u0292\7\7\2\2\u028f\u0292\7\5\2\2\u0290\u0292\5R"+
		"*\2\u0291\u028c\3\2\2\2\u0291\u028d\3\2\2\2\u0291\u028e\3\2\2\2\u0291"+
		"\u028f\3\2\2\2\u0291\u0290\3\2\2\2\u0292Q\3\2\2\2\u0293\u0295\7\b\2\2"+
		"\u0294\u0293\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0294\3\2\2\2\u0296\u0297"+
		"\3\2\2\2\u0297S\3\2\2\2\u0298\u0299\t\3\2\2\u0299U\3\2\2\2\u029a\u029b"+
		"\7\20\2\2\u029bW\3\2\2\2\u029c\u029f\5P)\2\u029d\u029f\5B\"\2\u029e\u029c"+
		"\3\2\2\2\u029e\u029d\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a1\5V,\2\u02a1"+
		"Y\3\2\2\2\u02a2\u02a3\t\4\2\2\u02a3[\3\2\2\2\u02a4\u02a5\5Z.\2\u02a5\u02a6"+
		"\5V,\2\u02a6]\3\2\2\2\u02a7\u02aa\7\f\2\2\u02a8\u02ab\5Z.\2\u02a9\u02ab"+
		"\5\\/\2\u02aa\u02a8\3\2\2\2\u02aa\u02a9\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac"+
		"\u02aa\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02af\7\r"+
		"\2\2\u02af\u02b0\7\24\2\2\u02b0\u02b1\5V,\2\u02b1_\3\2\2\2\u02b2\u02b6"+
		"\5Z.\2\u02b3\u02b6\5\\/\2\u02b4\u02b6\5^\60\2\u02b5\u02b2\3\2\2\2\u02b5"+
		"\u02b3\3\2\2\2\u02b5\u02b4\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b5\3\2"+
		"\2\2\u02b7\u02b8\3\2\2\2\u02b8a\3\2\2\2\u02b9\u02ba\7\26\2\2\u02ba\u02bb"+
		"\5p9\2\u02bbc\3\2\2\2\u02bc\u02bd\7\25\2\2\u02bd\u02be\5p9\2\u02bee\3"+
		"\2\2\2\u02bf\u02c0\7\25\2\2\u02c0\u02c1\5p9\2\u02c1\u02c2\7\26\2\2\u02c2"+
		"\u02c3\5p9\2\u02c3g\3\2\2\2\u02c4\u02c5\7\22\2\2\u02c5\u02c6\5p9\2\u02c6"+
		"i\3\2\2\2\u02c7\u02c8\7\23\2\2\u02c8\u02c9\5p9\2\u02c9k\3\2\2\2\u02ca"+
		"\u02cb\7\22\2\2\u02cb\u02cc\5p9\2\u02cc\u02cd\7\23\2\2\u02cd\u02ce\5p"+
		"9\2\u02cem\3\2\2\2\u02cf\u02d0\5\26\f\2\u02d0o\3\2\2\2\u02d1\u02d2\5\26"+
		"\f\2\u02d2q\3\2\2\2\u02d3\u02d4\7\27\2\2\u02d4\u02d5\5p9\2\u02d5s\3\2"+
		"\2\2\u02d6\u02d7\5n8\2\u02d7\u02d8\7\24\2\2\u02d8\u02dc\5p9\2\u02d9\u02dd"+
		"\5h\65\2\u02da\u02dd\5j\66\2\u02db\u02dd\5l\67\2\u02dc\u02d9\3\2\2\2\u02dc"+
		"\u02da\3\2\2\2\u02dc\u02db\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02df\3\2"+
		"\2\2\u02de\u02e0\7\30\2\2\u02df\u02de\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0"+
		"u\3\2\2\2\u02e1\u02e2\5n8\2\u02e2\u02e3\7\27\2\2\u02e3\u02e7\5p9\2\u02e4"+
		"\u02e8\5b\62\2\u02e5\u02e8\5d\63\2\u02e6\u02e8\5f\64\2\u02e7\u02e4\3\2"+
		"\2\2\u02e7\u02e5\3\2\2\2\u02e7\u02e6\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8"+
		"\u02ea\3\2\2\2\u02e9\u02eb\7\30\2\2\u02ea\u02e9\3\2\2\2\u02ea\u02eb\3"+
		"\2\2\2\u02ebw\3\2\2\2\u02ec\u02ed\5t;\2\u02ed\u02ef\5r:\2\u02ee\u02f0"+
		"\7\30\2\2\u02ef\u02ee\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0y\3\2\2\2\u02f1"+
		"\u02f5\5t;\2\u02f2\u02f5\5v<\2\u02f3\u02f5\5x=\2\u02f4\u02f1\3\2\2\2\u02f4"+
		"\u02f2\3\2\2\2\u02f4\u02f3\3\2\2\2\u02f5{\3\2\2\28\177\u0084\u008b\u0091"+
		"\u0097\u009d\u00af\u00bf\u00c1\u00d4\u00e4\u00e6\u00f9\u0105\u0107\u011a"+
		"\u0126\u0128\u013b\u0147\u0149\u015a\u0166\u0168\u017a\u018a\u018c\u019c"+
		"\u01ac\u01ae\u01bf\u01cf\u01d1\u01e3\u01f3\u01f5\u0241\u0251\u0253\u027a"+
		"\u027c\u0291\u0296\u029e\u02aa\u02ac\u02b5\u02b7\u02dc\u02df\u02e7\u02ea"+
		"\u02ef\u02f4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}