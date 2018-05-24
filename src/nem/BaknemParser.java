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
		LC_ID=1, ID=2, MIXID=3, CAP_ROMAN_NUM_SEQ=4, FACTORIAL=5, GENERAL_OMISSION=6, 
		LGRP=7, RGRP=8, BINOP=9, INT=10, CMPR=11, SUBSUB=12, SUBSUP=13, SUB=14, 
		SUPSUB=15, SUPSUP=16, SUP=17, MODIF=18, MODOVER=19, MODUNDER=20, TERM=21, 
		SFRAC=22, FRAC_SLASH=23, ESFRAC=24, CFRAC=25, CSLASH=26, ECFRAC=27, HCFRAC=28, 
		HCSLASH=29, EHCFRAC=30, SMIXFR=31, EMIXFR=32, SQRT=33, SQRT1=34, SQRT2=35, 
		SQRT3=36, IRAD1=37, IRAD2=38, IRAD3=39, RTRM1=40, RTRM2=41, RTRM3=42, 
		SPACE=43, NEWLINE=44, INTEGRAL=45, LATIN_LETTER=46, FUN_ABBR=47, FUNCTION_NAME=48, 
		LC_ROMAN_NUM_SEQ=49, UC_ID=50, CHEM_ELEMENT=51, POSS_CH_ELEMENT=52, SUPER_SUP=53, 
		SUPER_SUB=54, SUPER_SUP_SUB=55, SUPER_SUB_SUB=56, SUPER_SUP_SUP=57, SUPER_SUB_SUP=58, 
		HOLLOW_DOT=59, BFPLUS=60, PLUS_MINUS=61, BFMINUS=62, MINUS_PLUS=63;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_space = 2, RULE_exprs = 3, RULE_expr = 4, 
		RULE_layexpr = 5, RULE_nor = 6, RULE_nor1 = 7, RULE_nor2 = 8, RULE_nor3 = 9, 
		RULE_nom = 10, RULE_nof = 11, RULE_nofc = 12, RULE_nofch = 13, RULE_mfrac = 14, 
		RULE_mmfrac = 15, RULE_mmmfrac = 16, RULE_rindex = 17, RULE_sqrt = 18, 
		RULE_irad = 19, RULE_sqrt1 = 20, RULE_irad1 = 21, RULE_sqrt2 = 22, RULE_irad2 = 23, 
		RULE_sqrt3 = 24, RULE_irad3 = 25, RULE_nomod = 26, RULE_begmod = 27, RULE_munder = 28, 
		RULE_mover = 29, RULE_endmod = 30, RULE_funabb = 31, RULE_func = 32, RULE_lgrp = 33, 
		RULE_rgrp = 34, RULE_binop = 35, RULE_cmpr = 36, RULE_var = 37, RULE_integer = 38, 
		RULE_numsub = 39, RULE_chelement = 40, RULE_chnumsub = 41, RULE_chradical = 42, 
		RULE_chformula = 43, RULE_sup2 = 44, RULE_sup2b = 45, RULE_sup22 = 46, 
		RULE_sub2 = 47, RULE_sub2p = 48, RULE_sub22 = 49, RULE_base = 50, RULE_script = 51, 
		RULE_supscript = 52, RULE_msub = 53, RULE_msup = 54, RULE_msubsup = 55, 
		RULE_mscript = 56;
	public static final String[] ruleNames = {
		"prog", "stat", "space", "exprs", "expr", "layexpr", "nor", "nor1", "nor2", 
		"nor3", "nom", "nof", "nofc", "nofch", "mfrac", "mmfrac", "mmmfrac", "rindex", 
		"sqrt", "irad", "sqrt1", "irad1", "sqrt2", "irad2", "sqrt3", "irad3", 
		"nomod", "begmod", "munder", "mover", "endmod", "funabb", "func", "lgrp", 
		"rgrp", "binop", "cmpr", "var", "integer", "numsub", "chelement", "chnumsub", 
		"chradical", "chformula", "sup2", "sup2b", "sup22", "sub2", "sub2p", "sub22", 
		"base", "script", "supscript", "msub", "msup", "msubsup", "mscript"
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
		"IRAD3", "RTRM1", "RTRM2", "RTRM3", "SPACE", "NEWLINE", "INTEGRAL", "LATIN_LETTER", 
		"FUN_ABBR", "FUNCTION_NAME", "LC_ROMAN_NUM_SEQ", "UC_ID", "CHEM_ELEMENT", 
		"POSS_CH_ELEMENT", "SUPER_SUP", "SUPER_SUB", "SUPER_SUP_SUB", "SUPER_SUB_SUB", 
		"SUPER_SUP_SUP", "SUPER_SUB_SUP", "HOLLOW_DOT", "BFPLUS", "PLUS_MINUS", 
		"BFMINUS", "MINUS_PLUS"
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
			setState(115); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(114);
				stat();
				}
				}
				setState(117); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LC_ID) | (1L << ID) | (1L << MIXID) | (1L << LGRP) | (1L << INT) | (1L << MODIF) | (1L << MODOVER) | (1L << SFRAC) | (1L << CFRAC) | (1L << HCFRAC) | (1L << SQRT) | (1L << SPACE) | (1L << NEWLINE) | (1L << FUN_ABBR) | (1L << CHEM_ELEMENT) | (1L << POSS_CH_ELEMENT))) != 0) );
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
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LC_ID:
			case ID:
			case MIXID:
			case LGRP:
			case INT:
			case MODIF:
			case MODOVER:
			case SFRAC:
			case CFRAC:
			case HCFRAC:
			case SQRT:
			case SPACE:
			case FUN_ABBR:
			case CHEM_ELEMENT:
			case POSS_CH_ELEMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(119);
					space();
					}
					}
					setState(124);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(125);
				exprs();
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(127); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(126);
							space();
							}
							}
							setState(129); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==SPACE );
						setState(131);
						exprs();
						}
						} 
					}
					setState(137);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(138);
					space();
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(144);
				match(NEWLINE);
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
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
			setState(149);
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
			setState(151);
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
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(154);
				lgrp();
				setState(155);
				expr(0);
				setState(156);
				rgrp();
				}
				break;
			case 2:
				{
				setState(158);
				var();
				}
				break;
			case 3:
				{
				setState(159);
				integer();
				}
				break;
			case 4:
				{
				setState(160);
				numsub();
				}
				break;
			case 5:
				{
				setState(161);
				chnumsub();
				}
				break;
			case 6:
				{
				setState(162);
				chelement();
				}
				break;
			case 7:
				{
				setState(163);
				chformula();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(174);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(166);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(167);
						binop();
						setState(168);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(170);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(171);
						cmpr();
						setState(172);
						expr(8);
						}
						break;
					}
					} 
				}
				setState(178);
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
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(180);
				lgrp();
				setState(181);
				layexpr(0);
				setState(182);
				rgrp();
				}
				break;
			case 2:
				{
				setState(184);
				mfrac();
				}
				break;
			case 3:
				{
				setState(185);
				mmfrac();
				}
				break;
			case 4:
				{
				setState(186);
				mmmfrac();
				}
				break;
			case 5:
				{
				setState(187);
				munder();
				}
				break;
			case 6:
				{
				setState(188);
				mover();
				}
				break;
			case 7:
				{
				setState(189);
				mscript();
				}
				break;
			case 8:
				{
				setState(190);
				sqrt();
				}
				break;
			case 9:
				{
				setState(191);
				irad();
				}
				break;
			case 10:
				{
				setState(192);
				expr(0);
				}
				break;
			case 11:
				{
				setState(193);
				func();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(206);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new LayexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_layexpr);
						setState(196);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(197);
						binop();
						setState(198);
						layexpr(14);
						}
						break;
					case 2:
						{
						_localctx = new LayexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_layexpr);
						setState(200);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(201);
						cmpr();
						setState(202);
						layexpr(13);
						}
						break;
					case 3:
						{
						_localctx = new LayexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_layexpr);
						setState(204);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(205);
						layexpr(12);
						}
						break;
					}
					} 
				}
				setState(210);
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
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(212);
				lgrp();
				setState(213);
				nor(0);
				setState(214);
				rgrp();
				}
				break;
			case 2:
				{
				setState(216);
				mfrac();
				}
				break;
			case 3:
				{
				setState(217);
				mmfrac();
				}
				break;
			case 4:
				{
				setState(218);
				mmmfrac();
				}
				break;
			case 5:
				{
				setState(219);
				munder();
				}
				break;
			case 6:
				{
				setState(220);
				mover();
				}
				break;
			case 7:
				{
				setState(221);
				mscript();
				}
				break;
			case 8:
				{
				setState(222);
				irad1();
				}
				break;
			case 9:
				{
				setState(223);
				sqrt1();
				}
				break;
			case 10:
				{
				setState(224);
				expr(0);
				}
				break;
			case 11:
				{
				setState(225);
				func();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(236);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(234);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new NorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor);
						setState(228);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(229);
						binop();
						setState(230);
						nor(13);
						}
						break;
					case 2:
						{
						_localctx = new NorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor);
						setState(232);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(233);
						nor(12);
						}
						break;
					}
					} 
				}
				setState(238);
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
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(240);
				lgrp();
				setState(241);
				nor1(0);
				setState(242);
				rgrp();
				}
				break;
			case 2:
				{
				setState(244);
				mfrac();
				}
				break;
			case 3:
				{
				setState(245);
				mmfrac();
				}
				break;
			case 4:
				{
				setState(246);
				mmmfrac();
				}
				break;
			case 5:
				{
				setState(247);
				munder();
				}
				break;
			case 6:
				{
				setState(248);
				mover();
				}
				break;
			case 7:
				{
				setState(249);
				mscript();
				}
				break;
			case 8:
				{
				setState(250);
				irad2();
				}
				break;
			case 9:
				{
				setState(251);
				sqrt2();
				}
				break;
			case 10:
				{
				setState(252);
				expr(0);
				}
				break;
			case 11:
				{
				setState(253);
				func();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(264);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(262);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new Nor1Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor1);
						setState(256);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(257);
						binop();
						setState(258);
						nor1(13);
						}
						break;
					case 2:
						{
						_localctx = new Nor1Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor1);
						setState(260);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(261);
						nor1(12);
						}
						break;
					}
					} 
				}
				setState(266);
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
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(268);
				lgrp();
				setState(269);
				nor2(0);
				setState(270);
				rgrp();
				}
				break;
			case 2:
				{
				setState(272);
				mfrac();
				}
				break;
			case 3:
				{
				setState(273);
				mmfrac();
				}
				break;
			case 4:
				{
				setState(274);
				mmmfrac();
				}
				break;
			case 5:
				{
				setState(275);
				munder();
				}
				break;
			case 6:
				{
				setState(276);
				mover();
				}
				break;
			case 7:
				{
				setState(277);
				mscript();
				}
				break;
			case 8:
				{
				setState(278);
				irad3();
				}
				break;
			case 9:
				{
				setState(279);
				sqrt3();
				}
				break;
			case 10:
				{
				setState(280);
				expr(0);
				}
				break;
			case 11:
				{
				setState(281);
				func();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(292);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(290);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new Nor2Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor2);
						setState(284);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(285);
						binop();
						setState(286);
						nor2(13);
						}
						break;
					case 2:
						{
						_localctx = new Nor2Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor2);
						setState(288);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(289);
						nor2(12);
						}
						break;
					}
					} 
				}
				setState(294);
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
		public MscriptContext mscript() {
			return getRuleContext(MscriptContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
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
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(296);
				lgrp();
				setState(297);
				nor3(0);
				setState(298);
				rgrp();
				}
				break;
			case 2:
				{
				setState(300);
				mfrac();
				}
				break;
			case 3:
				{
				setState(301);
				mmfrac();
				}
				break;
			case 4:
				{
				setState(302);
				mmmfrac();
				}
				break;
			case 5:
				{
				setState(303);
				munder();
				}
				break;
			case 6:
				{
				setState(304);
				mover();
				}
				break;
			case 7:
				{
				setState(305);
				mscript();
				}
				break;
			case 8:
				{
				setState(306);
				expr(0);
				}
				break;
			case 9:
				{
				setState(307);
				func();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(318);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(316);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new Nor3Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor3);
						setState(310);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(311);
						binop();
						setState(312);
						nor3(11);
						}
						break;
					case 2:
						{
						_localctx = new Nor3Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor3);
						setState(314);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(315);
						nor3(10);
						}
						break;
					}
					} 
				}
				setState(320);
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
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(322);
				lgrp();
				setState(323);
				nom(0);
				setState(324);
				rgrp();
				}
				break;
			case 2:
				{
				setState(326);
				mfrac();
				}
				break;
			case 3:
				{
				setState(327);
				mmfrac();
				}
				break;
			case 4:
				{
				setState(328);
				mmmfrac();
				}
				break;
			case 5:
				{
				setState(329);
				munder();
				}
				break;
			case 6:
				{
				setState(330);
				mover();
				}
				break;
			case 7:
				{
				setState(331);
				expr(0);
				}
				break;
			case 8:
				{
				setState(332);
				func();
				}
				break;
			case 9:
				{
				setState(333);
				sqrt();
				}
				break;
			case 10:
				{
				setState(334);
				irad();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(347);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(345);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new NomContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nom);
						setState(337);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(338);
						binop();
						setState(339);
						nom(12);
						}
						break;
					case 2:
						{
						_localctx = new NomContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nom);
						setState(341);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(342);
						cmpr();
						setState(343);
						nom(11);
						}
						break;
					}
					} 
				}
				setState(349);
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
			setState(362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(351);
				lgrp();
				setState(352);
				nof(0);
				setState(353);
				rgrp();
				}
				break;
			case 2:
				{
				setState(355);
				munder();
				}
				break;
			case 3:
				{
				setState(356);
				mover();
				}
				break;
			case 4:
				{
				setState(357);
				mscript();
				}
				break;
			case 5:
				{
				setState(358);
				expr(0);
				}
				break;
			case 6:
				{
				setState(359);
				func();
				}
				break;
			case 7:
				{
				setState(360);
				sqrt();
				}
				break;
			case 8:
				{
				setState(361);
				irad();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(374);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(372);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new NofContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nof);
						setState(364);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(365);
						binop();
						setState(366);
						nof(10);
						}
						break;
					case 2:
						{
						_localctx = new NofContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nof);
						setState(368);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(369);
						cmpr();
						setState(370);
						nof(9);
						}
						break;
					}
					} 
				}
				setState(376);
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
			setState(390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(378);
				lgrp();
				setState(379);
				nofc(0);
				setState(380);
				rgrp();
				}
				break;
			case 2:
				{
				setState(382);
				munder();
				}
				break;
			case 3:
				{
				setState(383);
				mover();
				}
				break;
			case 4:
				{
				setState(384);
				mscript();
				}
				break;
			case 5:
				{
				setState(385);
				expr(0);
				}
				break;
			case 6:
				{
				setState(386);
				func();
				}
				break;
			case 7:
				{
				setState(387);
				mfrac();
				}
				break;
			case 8:
				{
				setState(388);
				sqrt();
				}
				break;
			case 9:
				{
				setState(389);
				irad();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(402);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(400);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new NofcContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nofc);
						setState(392);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(393);
						binop();
						setState(394);
						nofc(11);
						}
						break;
					case 2:
						{
						_localctx = new NofcContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nofc);
						setState(396);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(397);
						cmpr();
						setState(398);
						nofc(10);
						}
						break;
					}
					} 
				}
				setState(404);
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
			setState(419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(406);
				lgrp();
				setState(407);
				nofch(0);
				setState(408);
				rgrp();
				}
				break;
			case 2:
				{
				setState(410);
				munder();
				}
				break;
			case 3:
				{
				setState(411);
				mover();
				}
				break;
			case 4:
				{
				setState(412);
				mscript();
				}
				break;
			case 5:
				{
				setState(413);
				expr(0);
				}
				break;
			case 6:
				{
				setState(414);
				func();
				}
				break;
			case 7:
				{
				setState(415);
				mfrac();
				}
				break;
			case 8:
				{
				setState(416);
				mmfrac();
				}
				break;
			case 9:
				{
				setState(417);
				sqrt();
				}
				break;
			case 10:
				{
				setState(418);
				irad();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(431);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(429);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						_localctx = new NofchContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nofch);
						setState(421);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(422);
						binop();
						setState(423);
						nofch(12);
						}
						break;
					case 2:
						{
						_localctx = new NofchContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nofch);
						setState(425);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(426);
						cmpr();
						setState(427);
						nofch(11);
						}
						break;
					}
					} 
				}
				setState(433);
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
			setState(434);
			match(SFRAC);
			setState(435);
			nof(0);
			setState(436);
			match(FRAC_SLASH);
			setState(437);
			nof(0);
			setState(438);
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
			setState(440);
			match(CFRAC);
			setState(441);
			nofc(0);
			setState(442);
			match(CSLASH);
			setState(443);
			nofc(0);
			setState(444);
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
			setState(446);
			match(HCFRAC);
			setState(447);
			nofch(0);
			setState(448);
			match(HCSLASH);
			setState(449);
			nofch(0);
			setState(450);
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
		public NorContext nor() {
			return getRuleContext(NorContext.class,0);
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
			setState(452);
			nor(0);
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
			setState(454);
			match(SQRT);
			setState(455);
			nor(0);
			setState(456);
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
			setState(458);
			match(MODOVER);
			setState(459);
			rindex();
			setState(460);
			match(SQRT);
			setState(461);
			nor(0);
			setState(462);
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
			setState(464);
			match(SQRT1);
			setState(465);
			nor1(0);
			setState(466);
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
			setState(468);
			match(IRAD1);
			setState(469);
			rindex();
			setState(470);
			match(SQRT);
			setState(471);
			nor1(0);
			setState(472);
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
			setState(474);
			match(SQRT2);
			setState(475);
			nor2(0);
			setState(476);
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
			setState(478);
			match(IRAD2);
			setState(479);
			rindex();
			setState(480);
			match(SQRT);
			setState(481);
			nor2(0);
			setState(482);
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
			setState(484);
			match(SQRT3);
			setState(485);
			nor3(0);
			setState(486);
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
			setState(488);
			match(IRAD3);
			setState(489);
			rindex();
			setState(490);
			match(SQRT);
			setState(491);
			nor3(0);
			setState(492);
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
			setState(507);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(495);
				lgrp();
				setState(496);
				nomod(0);
				setState(497);
				rgrp();
				}
				break;
			case 2:
				{
				setState(499);
				mfrac();
				}
				break;
			case 3:
				{
				setState(500);
				mmfrac();
				}
				break;
			case 4:
				{
				setState(501);
				mmmfrac();
				}
				break;
			case 5:
				{
				setState(502);
				mscript();
				}
				break;
			case 6:
				{
				setState(503);
				irad();
				}
				break;
			case 7:
				{
				setState(504);
				sqrt();
				}
				break;
			case 8:
				{
				setState(505);
				expr(0);
				}
				break;
			case 9:
				{
				setState(506);
				func();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(521);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(519);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						_localctx = new NomodContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nomod);
						setState(509);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(510);
						binop();
						setState(511);
						nomod(12);
						}
						break;
					case 2:
						{
						_localctx = new NomodContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nomod);
						setState(513);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(514);
						nomod(11);
						}
						break;
					case 3:
						{
						_localctx = new NomodContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nomod);
						setState(515);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(516);
						cmpr();
						setState(517);
						nomod(10);
						}
						break;
					}
					} 
				}
				setState(523);
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
		public TerminalNode MODIF() { return getToken(BaknemParser.MODIF, 0); }
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
			setState(524);
			match(MODIF);
			setState(525);
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
			setState(527);
			begmod();
			setState(528);
			match(MODUNDER);
			setState(529);
			endmod();
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

	public static class MoverContext extends ParserRuleContext {
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
			setState(532);
			begmod();
			setState(533);
			match(MODOVER);
			setState(534);
			endmod();
			setState(535);
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
		enterRule(_localctx, 60, RULE_endmod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
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
		enterRule(_localctx, 62, RULE_funabb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
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
		enterRule(_localctx, 64, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODIF:
				{
				setState(541);
				match(MODIF);
				setState(542);
				funabb();
				{
				setState(543);
				_la = _input.LA(1);
				if ( !(_la==MODOVER || _la==MODUNDER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(544);
				endmod();
				}
				}
				break;
			case FUN_ABBR:
				{
				setState(546);
				funabb();
				setState(551);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SUB:
					{
					setState(547);
					match(SUB);
					setState(548);
					script();
					}
					break;
				case SUP:
					{
					setState(549);
					match(SUP);
					setState(550);
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
			setState(555);
			space();
			setState(556);
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
		enterRule(_localctx, 66, RULE_lgrp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
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
		enterRule(_localctx, 68, RULE_rgrp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
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
		enterRule(_localctx, 70, RULE_binop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
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
		enterRule(_localctx, 72, RULE_cmpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			match(CMPR);
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
		public TerminalNode MIXID() { return getToken(BaknemParser.MIXID, 0); }
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
		enterRule(_localctx, 74, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LC_ID) | (1L << ID) | (1L << MIXID))) != 0)) ) {
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
		enterRule(_localctx, 76, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
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
		enterRule(_localctx, 78, RULE_numsub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LC_ID:
			case ID:
			case MIXID:
				{
				setState(570);
				var();
				}
				break;
			case FUN_ABBR:
				{
				setState(571);
				funabb();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(574);
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
		enterRule(_localctx, 80, RULE_chelement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
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
		enterRule(_localctx, 82, RULE_chnumsub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			chelement();
			setState(579);
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
		enterRule(_localctx, 84, RULE_chradical);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			match(LGRP);
			setState(584); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(584);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(582);
					chelement();
					}
					break;
				case 2:
					{
					setState(583);
					chnumsub();
					}
					break;
				}
				}
				setState(586); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CHEM_ELEMENT || _la==POSS_CH_ELEMENT );
			setState(588);
			match(RGRP);
			setState(589);
			match(SUB);
			setState(590);
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
		enterRule(_localctx, 86, RULE_chformula);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(595); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(595);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
					case 1:
						{
						setState(592);
						chelement();
						}
						break;
					case 2:
						{
						setState(593);
						chnumsub();
						}
						break;
					case 3:
						{
						setState(594);
						chradical();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(597); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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
		enterRule(_localctx, 88, RULE_sup2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(599);
			match(SUPSUP);
			}
			setState(600);
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
		enterRule(_localctx, 90, RULE_sup2b);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(602);
			match(SUPSUB);
			}
			setState(603);
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
		enterRule(_localctx, 92, RULE_sup22);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(605);
			match(SUPSUB);
			}
			setState(606);
			script();
			{
			setState(607);
			match(SUPSUP);
			}
			setState(608);
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
		enterRule(_localctx, 94, RULE_sub2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(610);
			match(SUBSUB);
			}
			setState(611);
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
		enterRule(_localctx, 96, RULE_sub2p);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(613);
			match(SUBSUP);
			}
			setState(614);
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
		enterRule(_localctx, 98, RULE_sub22);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(616);
			match(SUBSUB);
			}
			setState(617);
			script();
			{
			setState(618);
			match(SUBSUP);
			}
			setState(619);
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
		enterRule(_localctx, 100, RULE_base);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
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
		enterRule(_localctx, 102, RULE_script);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
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
		enterRule(_localctx, 104, RULE_supscript);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			match(SUP);
			setState(626);
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
		enterRule(_localctx, 106, RULE_msub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			base();
			setState(629);
			match(SUB);
			setState(630);
			script();
			setState(634);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(631);
				sub2();
				}
				break;
			case 2:
				{
				setState(632);
				sub2p();
				}
				break;
			case 3:
				{
				setState(633);
				sub22();
				}
				break;
			}
			setState(637);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(636);
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
		enterRule(_localctx, 108, RULE_msup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			base();
			setState(640);
			match(SUP);
			setState(641);
			script();
			setState(645);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(642);
				sup2();
				}
				break;
			case 2:
				{
				setState(643);
				sup2b();
				}
				break;
			case 3:
				{
				setState(644);
				sup22();
				}
				break;
			}
			setState(648);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(647);
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
		enterRule(_localctx, 110, RULE_msubsup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			msub();
			setState(651);
			supscript();
			setState(653);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(652);
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
		enterRule(_localctx, 112, RULE_mscript);
		try {
			setState(658);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(655);
				msub();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(656);
				msup();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(657);
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
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean layexpr_sempred(LayexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		}
		return true;
	}
	private boolean nor_sempred(NorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 11);
		}
		return true;
	}
	private boolean nor1_sempred(Nor1Context _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 12);
		case 8:
			return precpred(_ctx, 11);
		}
		return true;
	}
	private boolean nor2_sempred(Nor2Context _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 12);
		case 10:
			return precpred(_ctx, 11);
		}
		return true;
	}
	private boolean nor3_sempred(Nor3Context _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 10);
		case 12:
			return precpred(_ctx, 9);
		}
		return true;
	}
	private boolean nom_sempred(NomContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 11);
		case 14:
			return precpred(_ctx, 10);
		}
		return true;
	}
	private boolean nof_sempred(NofContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 9);
		case 16:
			return precpred(_ctx, 8);
		}
		return true;
	}
	private boolean nofc_sempred(NofcContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 10);
		case 18:
			return precpred(_ctx, 9);
		}
		return true;
	}
	private boolean nofch_sempred(NofchContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return precpred(_ctx, 11);
		case 20:
			return precpred(_ctx, 10);
		}
		return true;
	}
	private boolean nomod_sempred(NomodContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21:
			return precpred(_ctx, 11);
		case 22:
			return precpred(_ctx, 10);
		case 23:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3A\u0297\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\6\2v\n\2\r\2\16"+
		"\2w\3\3\7\3{\n\3\f\3\16\3~\13\3\3\3\3\3\6\3\u0082\n\3\r\3\16\3\u0083\3"+
		"\3\3\3\7\3\u0088\n\3\f\3\16\3\u008b\13\3\3\3\7\3\u008e\n\3\f\3\16\3\u0091"+
		"\13\3\3\3\3\3\3\3\5\3\u0096\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\5\6\u00a7\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7"+
		"\6\u00b1\n\6\f\6\16\6\u00b4\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7\u00c5\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\7\7\u00d1\n\7\f\7\16\7\u00d4\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00e5\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7"+
		"\b\u00ed\n\b\f\b\16\b\u00f0\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t\u0101\n\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0109"+
		"\n\t\f\t\16\t\u010c\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\u011d\n\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0125\n\n\f\n"+
		"\16\n\u0128\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u0137\n\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u013f\n"+
		"\13\f\13\16\13\u0142\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\5\f\u0152\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u015c\n"+
		"\f\f\f\16\f\u015f\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u016d\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0177\n\r\f\r\16\r"+
		"\u017a\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u0189\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0193"+
		"\n\16\f\16\16\16\u0196\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\5\17\u01a6\n\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\7\17\u01b0\n\17\f\17\16\17\u01b3\13\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u01fe\n\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34"+
		"\u020a\n\34\f\34\16\34\u020d\13\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\5\"\u022a\n\"\5\"\u022c\n\"\3\"\3\"\3\"\3#\3#\3$\3$\3%\3"+
		"%\3&\3&\3\'\3\'\3(\3(\3)\3)\5)\u023f\n)\3)\3)\3*\3*\3+\3+\3+\3,\3,\3,"+
		"\6,\u024b\n,\r,\16,\u024c\3,\3,\3,\3,\3-\3-\3-\6-\u0256\n-\r-\16-\u0257"+
		"\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3"+
		"\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\67\3"+
		"\67\3\67\3\67\3\67\3\67\5\67\u027d\n\67\3\67\5\67\u0280\n\67\38\38\38"+
		"\38\38\38\58\u0288\n8\38\58\u028b\n8\39\39\39\59\u0290\n9\3:\3:\3:\5:"+
		"\u0295\n:\3:\2\r\n\f\16\20\22\24\26\30\32\34\66;\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"r\2\5\3\2\25\26\3\2\3\5\3\2\65\66\2\u02ee\2u\3\2\2\2\4\u0095\3\2\2\2\6"+
		"\u0097\3\2\2\2\b\u0099\3\2\2\2\n\u00a6\3\2\2\2\f\u00c4\3\2\2\2\16\u00e4"+
		"\3\2\2\2\20\u0100\3\2\2\2\22\u011c\3\2\2\2\24\u0136\3\2\2\2\26\u0151\3"+
		"\2\2\2\30\u016c\3\2\2\2\32\u0188\3\2\2\2\34\u01a5\3\2\2\2\36\u01b4\3\2"+
		"\2\2 \u01ba\3\2\2\2\"\u01c0\3\2\2\2$\u01c6\3\2\2\2&\u01c8\3\2\2\2(\u01cc"+
		"\3\2\2\2*\u01d2\3\2\2\2,\u01d6\3\2\2\2.\u01dc\3\2\2\2\60\u01e0\3\2\2\2"+
		"\62\u01e6\3\2\2\2\64\u01ea\3\2\2\2\66\u01fd\3\2\2\28\u020e\3\2\2\2:\u0211"+
		"\3\2\2\2<\u0216\3\2\2\2>\u021b\3\2\2\2@\u021d\3\2\2\2B\u022b\3\2\2\2D"+
		"\u0230\3\2\2\2F\u0232\3\2\2\2H\u0234\3\2\2\2J\u0236\3\2\2\2L\u0238\3\2"+
		"\2\2N\u023a\3\2\2\2P\u023e\3\2\2\2R\u0242\3\2\2\2T\u0244\3\2\2\2V\u0247"+
		"\3\2\2\2X\u0255\3\2\2\2Z\u0259\3\2\2\2\\\u025c\3\2\2\2^\u025f\3\2\2\2"+
		"`\u0264\3\2\2\2b\u0267\3\2\2\2d\u026a\3\2\2\2f\u026f\3\2\2\2h\u0271\3"+
		"\2\2\2j\u0273\3\2\2\2l\u0276\3\2\2\2n\u0281\3\2\2\2p\u028c\3\2\2\2r\u0294"+
		"\3\2\2\2tv\5\4\3\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\3\3\2\2\2"+
		"y{\5\6\4\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2"+
		"\2\2\177\u0089\5\b\5\2\u0080\u0082\5\6\4\2\u0081\u0080\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0086\5\b\5\2\u0086\u0088\3\2\2\2\u0087\u0081\3\2\2\2\u0088\u008b\3\2"+
		"\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008f\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008c\u008e\5\6\4\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2"+
		"\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0092\u0093\7.\2\2\u0093\u0096\3\2\2\2\u0094\u0096\7.\2"+
		"\2\u0095|\3\2\2\2\u0095\u0094\3\2\2\2\u0096\5\3\2\2\2\u0097\u0098\7-\2"+
		"\2\u0098\7\3\2\2\2\u0099\u009a\5\f\7\2\u009a\t\3\2\2\2\u009b\u009c\b\6"+
		"\1\2\u009c\u009d\5D#\2\u009d\u009e\5\n\6\2\u009e\u009f\5F$\2\u009f\u00a7"+
		"\3\2\2\2\u00a0\u00a7\5L\'\2\u00a1\u00a7\5N(\2\u00a2\u00a7\5P)\2\u00a3"+
		"\u00a7\5T+\2\u00a4\u00a7\5R*\2\u00a5\u00a7\5X-\2\u00a6\u009b\3\2\2\2\u00a6"+
		"\u00a0\3\2\2\2\u00a6\u00a1\3\2\2\2\u00a6\u00a2\3\2\2\2\u00a6\u00a3\3\2"+
		"\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00b2\3\2\2\2\u00a8"+
		"\u00a9\f\n\2\2\u00a9\u00aa\5H%\2\u00aa\u00ab\5\n\6\13\u00ab\u00b1\3\2"+
		"\2\2\u00ac\u00ad\f\t\2\2\u00ad\u00ae\5J&\2\u00ae\u00af\5\n\6\n\u00af\u00b1"+
		"\3\2\2\2\u00b0\u00a8\3\2\2\2\u00b0\u00ac\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\13\3\2\2\2\u00b4\u00b2\3\2\2"+
		"\2\u00b5\u00b6\b\7\1\2\u00b6\u00b7\5D#\2\u00b7\u00b8\5\f\7\2\u00b8\u00b9"+
		"\5F$\2\u00b9\u00c5\3\2\2\2\u00ba\u00c5\5\36\20\2\u00bb\u00c5\5 \21\2\u00bc"+
		"\u00c5\5\"\22\2\u00bd\u00c5\5:\36\2\u00be\u00c5\5<\37\2\u00bf\u00c5\5"+
		"r:\2\u00c0\u00c5\5&\24\2\u00c1\u00c5\5(\25\2\u00c2\u00c5\5\n\6\2\u00c3"+
		"\u00c5\5B\"\2\u00c4\u00b5\3\2\2\2\u00c4\u00ba\3\2\2\2\u00c4\u00bb\3\2"+
		"\2\2\u00c4\u00bc\3\2\2\2\u00c4\u00bd\3\2\2\2\u00c4\u00be\3\2\2\2\u00c4"+
		"\u00bf\3\2\2\2\u00c4\u00c0\3\2\2\2\u00c4\u00c1\3\2\2\2\u00c4\u00c2\3\2"+
		"\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00d2\3\2\2\2\u00c6\u00c7\f\17\2\2\u00c7"+
		"\u00c8\5H%\2\u00c8\u00c9\5\f\7\20\u00c9\u00d1\3\2\2\2\u00ca\u00cb\f\16"+
		"\2\2\u00cb\u00cc\5J&\2\u00cc\u00cd\5\f\7\17\u00cd\u00d1\3\2\2\2\u00ce"+
		"\u00cf\f\r\2\2\u00cf\u00d1\5\f\7\16\u00d0\u00c6\3\2\2\2\u00d0\u00ca\3"+
		"\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\r\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\b\b\1\2"+
		"\u00d6\u00d7\5D#\2\u00d7\u00d8\5\16\b\2\u00d8\u00d9\5F$\2\u00d9\u00e5"+
		"\3\2\2\2\u00da\u00e5\5\36\20\2\u00db\u00e5\5 \21\2\u00dc\u00e5\5\"\22"+
		"\2\u00dd\u00e5\5:\36\2\u00de\u00e5\5<\37\2\u00df\u00e5\5r:\2\u00e0\u00e5"+
		"\5,\27\2\u00e1\u00e5\5*\26\2\u00e2\u00e5\5\n\6\2\u00e3\u00e5\5B\"\2\u00e4"+
		"\u00d5\3\2\2\2\u00e4\u00da\3\2\2\2\u00e4\u00db\3\2\2\2\u00e4\u00dc\3\2"+
		"\2\2\u00e4\u00dd\3\2\2\2\u00e4\u00de\3\2\2\2\u00e4\u00df\3\2\2\2\u00e4"+
		"\u00e0\3\2\2\2\u00e4\u00e1\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e3\3\2"+
		"\2\2\u00e5\u00ee\3\2\2\2\u00e6\u00e7\f\16\2\2\u00e7\u00e8\5H%\2\u00e8"+
		"\u00e9\5\16\b\17\u00e9\u00ed\3\2\2\2\u00ea\u00eb\f\r\2\2\u00eb\u00ed\5"+
		"\16\b\16\u00ec\u00e6\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\17\3\2\2\2\u00f0\u00ee\3\2\2"+
		"\2\u00f1\u00f2\b\t\1\2\u00f2\u00f3\5D#\2\u00f3\u00f4\5\20\t\2\u00f4\u00f5"+
		"\5F$\2\u00f5\u0101\3\2\2\2\u00f6\u0101\5\36\20\2\u00f7\u0101\5 \21\2\u00f8"+
		"\u0101\5\"\22\2\u00f9\u0101\5:\36\2\u00fa\u0101\5<\37\2\u00fb\u0101\5"+
		"r:\2\u00fc\u0101\5\60\31\2\u00fd\u0101\5.\30\2\u00fe\u0101\5\n\6\2\u00ff"+
		"\u0101\5B\"\2\u0100\u00f1\3\2\2\2\u0100\u00f6\3\2\2\2\u0100\u00f7\3\2"+
		"\2\2\u0100\u00f8\3\2\2\2\u0100\u00f9\3\2\2\2\u0100\u00fa\3\2\2\2\u0100"+
		"\u00fb\3\2\2\2\u0100\u00fc\3\2\2\2\u0100\u00fd\3\2\2\2\u0100\u00fe\3\2"+
		"\2\2\u0100\u00ff\3\2\2\2\u0101\u010a\3\2\2\2\u0102\u0103\f\16\2\2\u0103"+
		"\u0104\5H%\2\u0104\u0105\5\20\t\17\u0105\u0109\3\2\2\2\u0106\u0107\f\r"+
		"\2\2\u0107\u0109\5\20\t\16\u0108\u0102\3\2\2\2\u0108\u0106\3\2\2\2\u0109"+
		"\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\21\3\2\2"+
		"\2\u010c\u010a\3\2\2\2\u010d\u010e\b\n\1\2\u010e\u010f\5D#\2\u010f\u0110"+
		"\5\22\n\2\u0110\u0111\5F$\2\u0111\u011d\3\2\2\2\u0112\u011d\5\36\20\2"+
		"\u0113\u011d\5 \21\2\u0114\u011d\5\"\22\2\u0115\u011d\5:\36\2\u0116\u011d"+
		"\5<\37\2\u0117\u011d\5r:\2\u0118\u011d\5\64\33\2\u0119\u011d\5\62\32\2"+
		"\u011a\u011d\5\n\6\2\u011b\u011d\5B\"\2\u011c\u010d\3\2\2\2\u011c\u0112"+
		"\3\2\2\2\u011c\u0113\3\2\2\2\u011c\u0114\3\2\2\2\u011c\u0115\3\2\2\2\u011c"+
		"\u0116\3\2\2\2\u011c\u0117\3\2\2\2\u011c\u0118\3\2\2\2\u011c\u0119\3\2"+
		"\2\2\u011c\u011a\3\2\2\2\u011c\u011b\3\2\2\2\u011d\u0126\3\2\2\2\u011e"+
		"\u011f\f\16\2\2\u011f\u0120\5H%\2\u0120\u0121\5\22\n\17\u0121\u0125\3"+
		"\2\2\2\u0122\u0123\f\r\2\2\u0123\u0125\5\22\n\16\u0124\u011e\3\2\2\2\u0124"+
		"\u0122\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2"+
		"\2\2\u0127\23\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012a\b\13\1\2\u012a\u012b"+
		"\5D#\2\u012b\u012c\5\24\13\2\u012c\u012d\5F$\2\u012d\u0137\3\2\2\2\u012e"+
		"\u0137\5\36\20\2\u012f\u0137\5 \21\2\u0130\u0137\5\"\22\2\u0131\u0137"+
		"\5:\36\2\u0132\u0137\5<\37\2\u0133\u0137\5r:\2\u0134\u0137\5\n\6\2\u0135"+
		"\u0137\5B\"\2\u0136\u0129\3\2\2\2\u0136\u012e\3\2\2\2\u0136\u012f\3\2"+
		"\2\2\u0136\u0130\3\2\2\2\u0136\u0131\3\2\2\2\u0136\u0132\3\2\2\2\u0136"+
		"\u0133\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0135\3\2\2\2\u0137\u0140\3\2"+
		"\2\2\u0138\u0139\f\f\2\2\u0139\u013a\5H%\2\u013a\u013b\5\24\13\r\u013b"+
		"\u013f\3\2\2\2\u013c\u013d\f\13\2\2\u013d\u013f\5\24\13\f\u013e\u0138"+
		"\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\25\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0144\b\f\1"+
		"\2\u0144\u0145\5D#\2\u0145\u0146\5\26\f\2\u0146\u0147\5F$\2\u0147\u0152"+
		"\3\2\2\2\u0148\u0152\5\36\20\2\u0149\u0152\5 \21\2\u014a\u0152\5\"\22"+
		"\2\u014b\u0152\5:\36\2\u014c\u0152\5<\37\2\u014d\u0152\5\n\6\2\u014e\u0152"+
		"\5B\"\2\u014f\u0152\5&\24\2\u0150\u0152\5(\25\2\u0151\u0143\3\2\2\2\u0151"+
		"\u0148\3\2\2\2\u0151\u0149\3\2\2\2\u0151\u014a\3\2\2\2\u0151\u014b\3\2"+
		"\2\2\u0151\u014c\3\2\2\2\u0151\u014d\3\2\2\2\u0151\u014e\3\2\2\2\u0151"+
		"\u014f\3\2\2\2\u0151\u0150\3\2\2\2\u0152\u015d\3\2\2\2\u0153\u0154\f\r"+
		"\2\2\u0154\u0155\5H%\2\u0155\u0156\5\26\f\16\u0156\u015c\3\2\2\2\u0157"+
		"\u0158\f\f\2\2\u0158\u0159\5J&\2\u0159\u015a\5\26\f\r\u015a\u015c\3\2"+
		"\2\2\u015b\u0153\3\2\2\2\u015b\u0157\3\2\2\2\u015c\u015f\3\2\2\2\u015d"+
		"\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\27\3\2\2\2\u015f\u015d\3\2\2"+
		"\2\u0160\u0161\b\r\1\2\u0161\u0162\5D#\2\u0162\u0163\5\30\r\2\u0163\u0164"+
		"\5F$\2\u0164\u016d\3\2\2\2\u0165\u016d\5:\36\2\u0166\u016d\5<\37\2\u0167"+
		"\u016d\5r:\2\u0168\u016d\5\n\6\2\u0169\u016d\5B\"\2\u016a\u016d\5&\24"+
		"\2\u016b\u016d\5(\25\2\u016c\u0160\3\2\2\2\u016c\u0165\3\2\2\2\u016c\u0166"+
		"\3\2\2\2\u016c\u0167\3\2\2\2\u016c\u0168\3\2\2\2\u016c\u0169\3\2\2\2\u016c"+
		"\u016a\3\2\2\2\u016c\u016b\3\2\2\2\u016d\u0178\3\2\2\2\u016e\u016f\f\13"+
		"\2\2\u016f\u0170\5H%\2\u0170\u0171\5\30\r\f\u0171\u0177\3\2\2\2\u0172"+
		"\u0173\f\n\2\2\u0173\u0174\5J&\2\u0174\u0175\5\30\r\13\u0175\u0177\3\2"+
		"\2\2\u0176\u016e\3\2\2\2\u0176\u0172\3\2\2\2\u0177\u017a\3\2\2\2\u0178"+
		"\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\31\3\2\2\2\u017a\u0178\3\2\2"+
		"\2\u017b\u017c\b\16\1\2\u017c\u017d\5D#\2\u017d\u017e\5\32\16\2\u017e"+
		"\u017f\5F$\2\u017f\u0189\3\2\2\2\u0180\u0189\5:\36\2\u0181\u0189\5<\37"+
		"\2\u0182\u0189\5r:\2\u0183\u0189\5\n\6\2\u0184\u0189\5B\"\2\u0185\u0189"+
		"\5\36\20\2\u0186\u0189\5&\24\2\u0187\u0189\5(\25\2\u0188\u017b\3\2\2\2"+
		"\u0188\u0180\3\2\2\2\u0188\u0181\3\2\2\2\u0188\u0182\3\2\2\2\u0188\u0183"+
		"\3\2\2\2\u0188\u0184\3\2\2\2\u0188\u0185\3\2\2\2\u0188\u0186\3\2\2\2\u0188"+
		"\u0187\3\2\2\2\u0189\u0194\3\2\2\2\u018a\u018b\f\f\2\2\u018b\u018c\5H"+
		"%\2\u018c\u018d\5\32\16\r\u018d\u0193\3\2\2\2\u018e\u018f\f\13\2\2\u018f"+
		"\u0190\5J&\2\u0190\u0191\5\32\16\f\u0191\u0193\3\2\2\2\u0192\u018a\3\2"+
		"\2\2\u0192\u018e\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194"+
		"\u0195\3\2\2\2\u0195\33\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u0198\b\17\1"+
		"\2\u0198\u0199\5D#\2\u0199\u019a\5\34\17\2\u019a\u019b\5F$\2\u019b\u01a6"+
		"\3\2\2\2\u019c\u01a6\5:\36\2\u019d\u01a6\5<\37\2\u019e\u01a6\5r:\2\u019f"+
		"\u01a6\5\n\6\2\u01a0\u01a6\5B\"\2\u01a1\u01a6\5\36\20\2\u01a2\u01a6\5"+
		" \21\2\u01a3\u01a6\5&\24\2\u01a4\u01a6\5(\25\2\u01a5\u0197\3\2\2\2\u01a5"+
		"\u019c\3\2\2\2\u01a5\u019d\3\2\2\2\u01a5\u019e\3\2\2\2\u01a5\u019f\3\2"+
		"\2\2\u01a5\u01a0\3\2\2\2\u01a5\u01a1\3\2\2\2\u01a5\u01a2\3\2\2\2\u01a5"+
		"\u01a3\3\2\2\2\u01a5\u01a4\3\2\2\2\u01a6\u01b1\3\2\2\2\u01a7\u01a8\f\r"+
		"\2\2\u01a8\u01a9\5H%\2\u01a9\u01aa\5\34\17\16\u01aa\u01b0\3\2\2\2\u01ab"+
		"\u01ac\f\f\2\2\u01ac\u01ad\5J&\2\u01ad\u01ae\5\34\17\r\u01ae\u01b0\3\2"+
		"\2\2\u01af\u01a7\3\2\2\2\u01af\u01ab\3\2\2\2\u01b0\u01b3\3\2\2\2\u01b1"+
		"\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\35\3\2\2\2\u01b3\u01b1\3\2\2"+
		"\2\u01b4\u01b5\7\30\2\2\u01b5\u01b6\5\30\r\2\u01b6\u01b7\7\31\2\2\u01b7"+
		"\u01b8\5\30\r\2\u01b8\u01b9\7\32\2\2\u01b9\37\3\2\2\2\u01ba\u01bb\7\33"+
		"\2\2\u01bb\u01bc\5\32\16\2\u01bc\u01bd\7\34\2\2\u01bd\u01be\5\32\16\2"+
		"\u01be\u01bf\7\35\2\2\u01bf!\3\2\2\2\u01c0\u01c1\7\36\2\2\u01c1\u01c2"+
		"\5\34\17\2\u01c2\u01c3\7\37\2\2\u01c3\u01c4\5\34\17\2\u01c4\u01c5\7 \2"+
		"\2\u01c5#\3\2\2\2\u01c6\u01c7\5\16\b\2\u01c7%\3\2\2\2\u01c8\u01c9\7#\2"+
		"\2\u01c9\u01ca\5\16\b\2\u01ca\u01cb\7\27\2\2\u01cb\'\3\2\2\2\u01cc\u01cd"+
		"\7\25\2\2\u01cd\u01ce\5$\23\2\u01ce\u01cf\7#\2\2\u01cf\u01d0\5\16\b\2"+
		"\u01d0\u01d1\7\27\2\2\u01d1)\3\2\2\2\u01d2\u01d3\7$\2\2\u01d3\u01d4\5"+
		"\20\t\2\u01d4\u01d5\7*\2\2\u01d5+\3\2\2\2\u01d6\u01d7\7\'\2\2\u01d7\u01d8"+
		"\5$\23\2\u01d8\u01d9\7#\2\2\u01d9\u01da\5\20\t\2\u01da\u01db\7*\2\2\u01db"+
		"-\3\2\2\2\u01dc\u01dd\7%\2\2\u01dd\u01de\5\22\n\2\u01de\u01df\7+\2\2\u01df"+
		"/\3\2\2\2\u01e0\u01e1\7(\2\2\u01e1\u01e2\5$\23\2\u01e2\u01e3\7#\2\2\u01e3"+
		"\u01e4\5\22\n\2\u01e4\u01e5\7+\2\2\u01e5\61\3\2\2\2\u01e6\u01e7\7&\2\2"+
		"\u01e7\u01e8\5\24\13\2\u01e8\u01e9\7,\2\2\u01e9\63\3\2\2\2\u01ea\u01eb"+
		"\7)\2\2\u01eb\u01ec\5$\23\2\u01ec\u01ed\7#\2\2\u01ed\u01ee\5\24\13\2\u01ee"+
		"\u01ef\7,\2\2\u01ef\65\3\2\2\2\u01f0\u01f1\b\34\1\2\u01f1\u01f2\5D#\2"+
		"\u01f2\u01f3\5\66\34\2\u01f3\u01f4\5F$\2\u01f4\u01fe\3\2\2\2\u01f5\u01fe"+
		"\5\36\20\2\u01f6\u01fe\5 \21\2\u01f7\u01fe\5\"\22\2\u01f8\u01fe\5r:\2"+
		"\u01f9\u01fe\5(\25\2\u01fa\u01fe\5&\24\2\u01fb\u01fe\5\n\6\2\u01fc\u01fe"+
		"\5B\"\2\u01fd\u01f0\3\2\2\2\u01fd\u01f5\3\2\2\2\u01fd\u01f6\3\2\2\2\u01fd"+
		"\u01f7\3\2\2\2\u01fd\u01f8\3\2\2\2\u01fd\u01f9\3\2\2\2\u01fd\u01fa\3\2"+
		"\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fc\3\2\2\2\u01fe\u020b\3\2\2\2\u01ff"+
		"\u0200\f\r\2\2\u0200\u0201\5H%\2\u0201\u0202\5\66\34\16\u0202\u020a\3"+
		"\2\2\2\u0203\u0204\f\f\2\2\u0204\u020a\5\66\34\r\u0205\u0206\f\13\2\2"+
		"\u0206\u0207\5J&\2\u0207\u0208\5\66\34\f\u0208\u020a\3\2\2\2\u0209\u01ff"+
		"\3\2\2\2\u0209\u0203\3\2\2\2\u0209\u0205\3\2\2\2\u020a\u020d\3\2\2\2\u020b"+
		"\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c\67\3\2\2\2\u020d\u020b\3\2\2"+
		"\2\u020e\u020f\7\24\2\2\u020f\u0210\5\66\34\2\u02109\3\2\2\2\u0211\u0212"+
		"\58\35\2\u0212\u0213\7\26\2\2\u0213\u0214\5> \2\u0214\u0215\7\27\2\2\u0215"+
		";\3\2\2\2\u0216\u0217\58\35\2\u0217\u0218\7\25\2\2\u0218\u0219\5> \2\u0219"+
		"\u021a\7\27\2\2\u021a=\3\2\2\2\u021b\u021c\5\66\34\2\u021c?\3\2\2\2\u021d"+
		"\u021e\7\61\2\2\u021eA\3\2\2\2\u021f\u0220\7\24\2\2\u0220\u0221\5@!\2"+
		"\u0221\u0222\t\2\2\2\u0222\u0223\5> \2\u0223\u022c\3\2\2\2\u0224\u0229"+
		"\5@!\2\u0225\u0226\7\20\2\2\u0226\u022a\5h\65\2\u0227\u0228\7\23\2\2\u0228"+
		"\u022a\5h\65\2\u0229\u0225\3\2\2\2\u0229\u0227\3\2\2\2\u0229\u022a\3\2"+
		"\2\2\u022a\u022c\3\2\2\2\u022b\u021f\3\2\2\2\u022b\u0224\3\2\2\2\u022c"+
		"\u022d\3\2\2\2\u022d\u022e\5\6\4\2\u022e\u022f\5\n\6\2\u022fC\3\2\2\2"+
		"\u0230\u0231\7\t\2\2\u0231E\3\2\2\2\u0232\u0233\7\n\2\2\u0233G\3\2\2\2"+
		"\u0234\u0235\7\13\2\2\u0235I\3\2\2\2\u0236\u0237\7\r\2\2\u0237K\3\2\2"+
		"\2\u0238\u0239\t\3\2\2\u0239M\3\2\2\2\u023a\u023b\7\f\2\2\u023bO\3\2\2"+
		"\2\u023c\u023f\5L\'\2\u023d\u023f\5@!\2\u023e\u023c\3\2\2\2\u023e\u023d"+
		"\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0241\5N(\2\u0241Q\3\2\2\2\u0242\u0243"+
		"\t\4\2\2\u0243S\3\2\2\2\u0244\u0245\5R*\2\u0245\u0246\5N(\2\u0246U\3\2"+
		"\2\2\u0247\u024a\7\t\2\2\u0248\u024b\5R*\2\u0249\u024b\5T+\2\u024a\u0248"+
		"\3\2\2\2\u024a\u0249\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024a\3\2\2\2\u024c"+
		"\u024d\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u024f\7\n\2\2\u024f\u0250\7\20"+
		"\2\2\u0250\u0251\5N(\2\u0251W\3\2\2\2\u0252\u0256\5R*\2\u0253\u0256\5"+
		"T+\2\u0254\u0256\5V,\2\u0255\u0252\3\2\2\2\u0255\u0253\3\2\2\2\u0255\u0254"+
		"\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0255\3\2\2\2\u0257\u0258\3\2\2\2\u0258"+
		"Y\3\2\2\2\u0259\u025a\7\22\2\2\u025a\u025b\5h\65\2\u025b[\3\2\2\2\u025c"+
		"\u025d\7\21\2\2\u025d\u025e\5h\65\2\u025e]\3\2\2\2\u025f\u0260\7\21\2"+
		"\2\u0260\u0261\5h\65\2\u0261\u0262\7\22\2\2\u0262\u0263\5h\65\2\u0263"+
		"_\3\2\2\2\u0264\u0265\7\16\2\2\u0265\u0266\5h\65\2\u0266a\3\2\2\2\u0267"+
		"\u0268\7\17\2\2\u0268\u0269\5h\65\2\u0269c\3\2\2\2\u026a\u026b\7\16\2"+
		"\2\u026b\u026c\5h\65\2\u026c\u026d\7\17\2\2\u026d\u026e\5h\65\2\u026e"+
		"e\3\2\2\2\u026f\u0270\5\26\f\2\u0270g\3\2\2\2\u0271\u0272\5\26\f\2\u0272"+
		"i\3\2\2\2\u0273\u0274\7\23\2\2\u0274\u0275\5h\65\2\u0275k\3\2\2\2\u0276"+
		"\u0277\5f\64\2\u0277\u0278\7\20\2\2\u0278\u027c\5h\65\2\u0279\u027d\5"+
		"`\61\2\u027a\u027d\5b\62\2\u027b\u027d\5d\63\2\u027c\u0279\3\2\2\2\u027c"+
		"\u027a\3\2\2\2\u027c\u027b\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027f\3\2"+
		"\2\2\u027e\u0280\7\24\2\2\u027f\u027e\3\2\2\2\u027f\u0280\3\2\2\2\u0280"+
		"m\3\2\2\2\u0281\u0282\5f\64\2\u0282\u0283\7\23\2\2\u0283\u0287\5h\65\2"+
		"\u0284\u0288\5Z.\2\u0285\u0288\5\\/\2\u0286\u0288\5^\60\2\u0287\u0284"+
		"\3\2\2\2\u0287\u0285\3\2\2\2\u0287\u0286\3\2\2\2\u0287\u0288\3\2\2\2\u0288"+
		"\u028a\3\2\2\2\u0289\u028b\7\24\2\2\u028a\u0289\3\2\2\2\u028a\u028b\3"+
		"\2\2\2\u028bo\3\2\2\2\u028c\u028d\5l\67\2\u028d\u028f\5j\66\2\u028e\u0290"+
		"\7\24\2\2\u028f\u028e\3\2\2\2\u028f\u0290\3\2\2\2\u0290q\3\2\2\2\u0291"+
		"\u0295\5l\67\2\u0292\u0295\5n8\2\u0293\u0295\5p9\2\u0294\u0291\3\2\2\2"+
		"\u0294\u0292\3\2\2\2\u0294\u0293\3\2\2\2\u0295s\3\2\2\2\66w|\u0083\u0089"+
		"\u008f\u0095\u00a6\u00b0\u00b2\u00c4\u00d0\u00d2\u00e4\u00ec\u00ee\u0100"+
		"\u0108\u010a\u011c\u0124\u0126\u0136\u013e\u0140\u0151\u015b\u015d\u016c"+
		"\u0176\u0178\u0188\u0192\u0194\u01a5\u01af\u01b1\u01fd\u0209\u020b\u0229"+
		"\u022b\u023e\u024a\u024c\u0255\u0257\u027c\u027f\u0287\u028a\u028f\u0294";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}