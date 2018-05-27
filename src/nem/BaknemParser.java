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
		UC_ID=8, GREEK_LETTER=9, MISCALPHD46=10, FACTORIAL=11, GENERAL_OMISSION=12, 
		LGRP=13, RGRP=14, BINOP=15, BINOP_PREC=16, INT=17, CMPR=18, SUBSUB=19, 
		SUBSUP=20, SUB=21, SUPSUB=22, SUPSUP=23, SUP=24, MODIF=25, MODOVER=26, 
		MODUNDER=27, TERM=28, SFRAC=29, FRAC_SLASH=30, ESFRAC=31, CFRAC=32, CSLASH=33, 
		ECFRAC=34, HCFRAC=35, HCSLASH=36, EHCFRAC=37, SMIXFR=38, EMIXFR=39, SQRT=40, 
		SQRT1=41, SQRT2=42, SQRT3=43, IRAD1=44, IRAD2=45, IRAD3=46, RTRM1=47, 
		RTRM2=48, RTRM3=49, SPACE=50, NEWLINE=51, INFINITY=52, INTEGRAL=53, LATIN_LETTER=54, 
		FUN_ABBR=55, FUNCTION_NAME=56, TRAIL_FUN_ABBR=57, LC_ROMAN_NUM_SEQ=58, 
		CHEM_ELEMENT=59, POSS_CH_ELEMENT=60, SUPER_SUP=61, SUPER_SUB=62, SUPER_SUP_SUB=63, 
		SUPER_SUB_SUB=64, SUPER_SUP_SUP=65, SUPER_SUB_SUP=66, HOLLOW_DOT=67, BFPLUS=68, 
		PLUS_MINUS=69, BFMINUS=70, MINUS_PLUS=71;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_header3 = 2, RULE_funWithArg = 3, RULE_space = 4, 
		RULE_exprs = 5, RULE_expr = 6, RULE_layexpr = 7, RULE_nor = 8, RULE_nor1 = 9, 
		RULE_nor2 = 10, RULE_nor3 = 11, RULE_nom = 12, RULE_nof = 13, RULE_nofc = 14, 
		RULE_nofch = 15, RULE_mfrac = 16, RULE_mmfrac = 17, RULE_mmmfrac = 18, 
		RULE_rindex = 19, RULE_sqrt = 20, RULE_irad = 21, RULE_sqrt1 = 22, RULE_irad1 = 23, 
		RULE_sqrt2 = 24, RULE_irad2 = 25, RULE_sqrt3 = 26, RULE_irad3 = 27, RULE_nomod = 28, 
		RULE_begmod = 29, RULE_munder = 30, RULE_mover = 31, RULE_mundov = 32, 
		RULE_endmod = 33, RULE_varXfunabb = 34, RULE_funabb = 35, RULE_func = 36, 
		RULE_lgrp = 37, RULE_rgrp = 38, RULE_binop = 39, RULE_binop1 = 40, RULE_cmpr = 41, 
		RULE_var = 42, RULE_greeks = 43, RULE_specsym = 44, RULE_integer = 45, 
		RULE_numsub = 46, RULE_chelement = 47, RULE_chnumsub = 48, RULE_chradical = 49, 
		RULE_chformula = 50, RULE_sup2 = 51, RULE_sup2b = 52, RULE_sup22 = 53, 
		RULE_sub2 = 54, RULE_sub2p = 55, RULE_sub22 = 56, RULE_base = 57, RULE_script = 58, 
		RULE_subscript = 59, RULE_supscript = 60, RULE_msub = 61, RULE_msup = 62, 
		RULE_msubsup = 63, RULE_mscript = 64;
	public static final String[] ruleNames = {
		"prog", "stat", "header3", "funWithArg", "space", "exprs", "expr", "layexpr", 
		"nor", "nor1", "nor2", "nor3", "nom", "nof", "nofc", "nofch", "mfrac", 
		"mmfrac", "mmmfrac", "rindex", "sqrt", "irad", "sqrt1", "irad1", "sqrt2", 
		"irad2", "sqrt3", "irad3", "nomod", "begmod", "munder", "mover", "mundov", 
		"endmod", "varXfunabb", "funabb", "func", "lgrp", "rgrp", "binop", "binop1", 
		"cmpr", "var", "greeks", "specsym", "integer", "numsub", "chelement", 
		"chnumsub", "chradical", "chformula", "sup2", "sup2b", "sup22", "sub2", 
		"sub2p", "sub22", "base", "script", "subscript", "supscript", "msub", 
		"msup", "msubsup", "mscript"
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
		"INFINITY", "INTEGRAL", "LATIN_LETTER", "FUN_ABBR", "FUNCTION_NAME", "TRAIL_FUN_ABBR", 
		"LC_ROMAN_NUM_SEQ", "CHEM_ELEMENT", "POSS_CH_ELEMENT", "SUPER_SUP", "SUPER_SUB", 
		"SUPER_SUP_SUB", "SUPER_SUB_SUB", "SUPER_SUP_SUP", "SUPER_SUB_SUP", "HOLLOW_DOT", 
		"BFPLUS", "PLUS_MINUS", "BFMINUS", "MINUS_PLUS"
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
			setState(131); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(130);
				stat();
				}
				}
				setState(133); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BLURB) | (1L << LC_ID) | (1L << ID) | (1L << MIXID) | (1L << UC_ID) | (1L << GREEK_LETTER) | (1L << MISCALPHD46) | (1L << LGRP) | (1L << INT) | (1L << MODIF) | (1L << MODOVER) | (1L << SFRAC) | (1L << CFRAC) | (1L << HCFRAC) | (1L << SQRT) | (1L << SPACE) | (1L << NEWLINE) | (1L << INFINITY) | (1L << INTEGRAL) | (1L << FUN_ABBR) | (1L << TRAIL_FUN_ABBR) | (1L << CHEM_ELEMENT) | (1L << POSS_CH_ELEMENT))) != 0) );
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
		public Header3Context header3() {
			return getRuleContext(Header3Context.class,0);
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
			setState(166);
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
			case TRAIL_FUN_ABBR:
			case CHEM_ELEMENT:
			case POSS_CH_ELEMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(135);
					space();
					}
					}
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(141);
				exprs();
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(143); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(142);
							space();
							}
							}
							setState(145); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==SPACE );
						setState(147);
						exprs();
						}
						} 
					}
					setState(153);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(154);
					space();
					}
					}
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(160);
				match(NEWLINE);
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				match(NEWLINE);
				}
				break;
			case BLURB:
				enterOuterAlt(_localctx, 3);
				{
				setState(163);
				header3();
				setState(164);
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
			setState(168);
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
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODIF:
				{
				setState(170);
				match(MODIF);
				setState(171);
				funabb();
				{
				setState(172);
				_la = _input.LA(1);
				if ( !(_la==MODOVER || _la==MODUNDER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(173);
				endmod();
				}
				}
				break;
			case FUN_ABBR:
			case TRAIL_FUN_ABBR:
				{
				setState(177);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FUN_ABBR:
					{
					setState(175);
					funabb();
					}
					break;
				case TRAIL_FUN_ABBR:
					{
					setState(176);
					varXfunabb();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(183);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SUB:
					{
					setState(179);
					match(SUB);
					setState(180);
					script();
					}
					break;
				case SUP:
					{
					setState(181);
					match(SUP);
					setState(182);
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
			setState(187);
			space();
			setState(188);
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
			setState(190);
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
		public FunWithArgContext funWithArg() {
			return getRuleContext(FunWithArgContext.class,0);
		}
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
		enterRule(_localctx, 10, RULE_exprs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(192);
				funWithArg();
				}
				break;
			case 2:
				{
				setState(193);
				layexpr(0);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(197);
				lgrp();
				setState(198);
				expr(0);
				setState(199);
				rgrp();
				}
				break;
			case 2:
				{
				setState(201);
				var();
				}
				break;
			case 3:
				{
				setState(202);
				specsym();
				}
				break;
			case 4:
				{
				setState(203);
				integer();
				}
				break;
			case 5:
				{
				setState(204);
				numsub();
				}
				break;
			case 6:
				{
				setState(205);
				chnumsub();
				}
				break;
			case 7:
				{
				setState(206);
				chelement();
				}
				break;
			case 8:
				{
				setState(207);
				chformula();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(226);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(224);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(210);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(211);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(212);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(213);
						binop1();
						setState(214);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(216);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(217);
						binop();
						setState(218);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(220);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(221);
						cmpr();
						setState(222);
						expr(9);
						}
						break;
					}
					} 
				}
				setState(228);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_layexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(230);
				lgrp();
				setState(231);
				layexpr(0);
				setState(232);
				rgrp();
				}
				break;
			case 2:
				{
				setState(234);
				mfrac();
				}
				break;
			case 3:
				{
				setState(235);
				mmfrac();
				}
				break;
			case 4:
				{
				setState(236);
				mmmfrac();
				}
				break;
			case 5:
				{
				setState(237);
				munder();
				}
				break;
			case 6:
				{
				setState(238);
				mover();
				}
				break;
			case 7:
				{
				setState(239);
				mundov();
				}
				break;
			case 8:
				{
				setState(240);
				mscript();
				}
				break;
			case 9:
				{
				setState(241);
				sqrt();
				}
				break;
			case 10:
				{
				setState(242);
				irad();
				}
				break;
			case 11:
				{
				setState(243);
				expr(0);
				}
				break;
			case 12:
				{
				setState(244);
				func();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(263);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(261);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new LayexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_layexpr);
						setState(247);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(248);
						layexpr(17);
						}
						break;
					case 2:
						{
						_localctx = new LayexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_layexpr);
						setState(249);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(250);
						binop1();
						setState(251);
						layexpr(15);
						}
						break;
					case 3:
						{
						_localctx = new LayexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_layexpr);
						setState(253);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(254);
						binop();
						setState(255);
						layexpr(14);
						}
						break;
					case 4:
						{
						_localctx = new LayexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_layexpr);
						setState(257);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(258);
						cmpr();
						setState(259);
						layexpr(13);
						}
						break;
					}
					} 
				}
				setState(265);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_nor, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(267);
				lgrp();
				setState(268);
				nor(0);
				setState(269);
				rgrp();
				}
				break;
			case 2:
				{
				setState(271);
				mfrac();
				}
				break;
			case 3:
				{
				setState(272);
				mmfrac();
				}
				break;
			case 4:
				{
				setState(273);
				mmmfrac();
				}
				break;
			case 5:
				{
				setState(274);
				munder();
				}
				break;
			case 6:
				{
				setState(275);
				mover();
				}
				break;
			case 7:
				{
				setState(276);
				mundov();
				}
				break;
			case 8:
				{
				setState(277);
				mscript();
				}
				break;
			case 9:
				{
				setState(278);
				irad1();
				}
				break;
			case 10:
				{
				setState(279);
				sqrt1();
				}
				break;
			case 11:
				{
				setState(280);
				expr(0);
				}
				break;
			case 12:
				{
				setState(281);
				func();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(296);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(294);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new NorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor);
						setState(284);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(285);
						nor(15);
						}
						break;
					case 2:
						{
						_localctx = new NorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor);
						setState(286);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(287);
						binop1();
						setState(288);
						nor(14);
						}
						break;
					case 3:
						{
						_localctx = new NorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor);
						setState(290);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(291);
						binop();
						setState(292);
						nor(13);
						}
						break;
					}
					} 
				}
				setState(298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_nor1, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(300);
				lgrp();
				setState(301);
				nor1(0);
				setState(302);
				rgrp();
				}
				break;
			case 2:
				{
				setState(304);
				mfrac();
				}
				break;
			case 3:
				{
				setState(305);
				mmfrac();
				}
				break;
			case 4:
				{
				setState(306);
				mmmfrac();
				}
				break;
			case 5:
				{
				setState(307);
				munder();
				}
				break;
			case 6:
				{
				setState(308);
				mover();
				}
				break;
			case 7:
				{
				setState(309);
				mundov();
				}
				break;
			case 8:
				{
				setState(310);
				mscript();
				}
				break;
			case 9:
				{
				setState(311);
				irad2();
				}
				break;
			case 10:
				{
				setState(312);
				sqrt2();
				}
				break;
			case 11:
				{
				setState(313);
				expr(0);
				}
				break;
			case 12:
				{
				setState(314);
				func();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(329);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(327);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new Nor1Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor1);
						setState(317);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(318);
						nor1(15);
						}
						break;
					case 2:
						{
						_localctx = new Nor1Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor1);
						setState(319);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(320);
						binop1();
						setState(321);
						nor1(14);
						}
						break;
					case 3:
						{
						_localctx = new Nor1Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor1);
						setState(323);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(324);
						binop();
						setState(325);
						nor1(13);
						}
						break;
					}
					} 
				}
				setState(331);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_nor2, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(333);
				lgrp();
				setState(334);
				nor2(0);
				setState(335);
				rgrp();
				}
				break;
			case 2:
				{
				setState(337);
				mfrac();
				}
				break;
			case 3:
				{
				setState(338);
				mmfrac();
				}
				break;
			case 4:
				{
				setState(339);
				mmmfrac();
				}
				break;
			case 5:
				{
				setState(340);
				munder();
				}
				break;
			case 6:
				{
				setState(341);
				mover();
				}
				break;
			case 7:
				{
				setState(342);
				mundov();
				}
				break;
			case 8:
				{
				setState(343);
				mscript();
				}
				break;
			case 9:
				{
				setState(344);
				irad3();
				}
				break;
			case 10:
				{
				setState(345);
				sqrt3();
				}
				break;
			case 11:
				{
				setState(346);
				expr(0);
				}
				break;
			case 12:
				{
				setState(347);
				func();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(362);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(360);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new Nor2Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor2);
						setState(350);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(351);
						nor2(15);
						}
						break;
					case 2:
						{
						_localctx = new Nor2Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor2);
						setState(352);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(353);
						binop1();
						setState(354);
						nor2(14);
						}
						break;
					case 3:
						{
						_localctx = new Nor2Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor2);
						setState(356);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(357);
						binop();
						setState(358);
						nor2(13);
						}
						break;
					}
					} 
				}
				setState(364);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_nor3, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(366);
				lgrp();
				setState(367);
				nor3(0);
				setState(368);
				rgrp();
				}
				break;
			case 2:
				{
				setState(370);
				mfrac();
				}
				break;
			case 3:
				{
				setState(371);
				mmfrac();
				}
				break;
			case 4:
				{
				setState(372);
				mmmfrac();
				}
				break;
			case 5:
				{
				setState(373);
				munder();
				}
				break;
			case 6:
				{
				setState(374);
				mover();
				}
				break;
			case 7:
				{
				setState(375);
				mundov();
				}
				break;
			case 8:
				{
				setState(376);
				mscript();
				}
				break;
			case 9:
				{
				setState(377);
				expr(0);
				}
				break;
			case 10:
				{
				setState(378);
				func();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(393);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(391);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new Nor3Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor3);
						setState(381);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(382);
						nor3(13);
						}
						break;
					case 2:
						{
						_localctx = new Nor3Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor3);
						setState(383);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(384);
						binop1();
						setState(385);
						nor3(12);
						}
						break;
					case 3:
						{
						_localctx = new Nor3Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor3);
						setState(387);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(388);
						binop();
						setState(389);
						nor3(11);
						}
						break;
					}
					} 
				}
				setState(395);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_nom, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(397);
				lgrp();
				setState(398);
				nom(0);
				setState(399);
				rgrp();
				}
				break;
			case 2:
				{
				setState(401);
				mfrac();
				}
				break;
			case 3:
				{
				setState(402);
				mmfrac();
				}
				break;
			case 4:
				{
				setState(403);
				mmmfrac();
				}
				break;
			case 5:
				{
				setState(404);
				munder();
				}
				break;
			case 6:
				{
				setState(405);
				mover();
				}
				break;
			case 7:
				{
				setState(406);
				mundov();
				}
				break;
			case 8:
				{
				setState(407);
				expr(0);
				}
				break;
			case 9:
				{
				setState(408);
				funWithArg();
				}
				break;
			case 10:
				{
				setState(409);
				sqrt();
				}
				break;
			case 11:
				{
				setState(410);
				irad();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(429);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(427);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new NomContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nom);
						setState(413);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(414);
						nom(15);
						}
						break;
					case 2:
						{
						_localctx = new NomContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nom);
						setState(415);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(416);
						binop1();
						setState(417);
						nom(14);
						}
						break;
					case 3:
						{
						_localctx = new NomContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nom);
						setState(419);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(420);
						binop();
						setState(421);
						nom(13);
						}
						break;
					case 4:
						{
						_localctx = new NomContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nom);
						setState(423);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(424);
						cmpr();
						setState(425);
						nom(12);
						}
						break;
					}
					} 
				}
				setState(431);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_nof, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(433);
				lgrp();
				setState(434);
				nof(0);
				setState(435);
				rgrp();
				}
				break;
			case 2:
				{
				setState(437);
				munder();
				}
				break;
			case 3:
				{
				setState(438);
				mover();
				}
				break;
			case 4:
				{
				setState(439);
				mundov();
				}
				break;
			case 5:
				{
				setState(440);
				mscript();
				}
				break;
			case 6:
				{
				setState(441);
				expr(0);
				}
				break;
			case 7:
				{
				setState(442);
				func();
				}
				break;
			case 8:
				{
				setState(443);
				sqrt();
				}
				break;
			case 9:
				{
				setState(444);
				irad();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(463);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(461);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new NofContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nof);
						setState(447);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(448);
						nof(13);
						}
						break;
					case 2:
						{
						_localctx = new NofContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nof);
						setState(449);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(450);
						binop1();
						setState(451);
						nof(12);
						}
						break;
					case 3:
						{
						_localctx = new NofContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nof);
						setState(453);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(454);
						binop();
						setState(455);
						nof(11);
						}
						break;
					case 4:
						{
						_localctx = new NofContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nof);
						setState(457);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(458);
						cmpr();
						setState(459);
						nof(10);
						}
						break;
					}
					} 
				}
				setState(465);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_nofc, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(467);
				lgrp();
				setState(468);
				nofc(0);
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
				sqrt();
				}
				break;
			case 10:
				{
				setState(479);
				irad();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(498);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(496);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						_localctx = new NofcContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nofc);
						setState(482);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(483);
						nofc(14);
						}
						break;
					case 2:
						{
						_localctx = new NofcContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nofc);
						setState(484);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(485);
						binop();
						setState(486);
						nofc(12);
						}
						break;
					case 3:
						{
						_localctx = new NofcContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nofc);
						setState(488);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(489);
						cmpr();
						setState(490);
						nofc(11);
						}
						break;
					case 4:
						{
						_localctx = new NofcContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nofc);
						setState(492);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(493);
						binop1();
						setState(494);
						nof(0);
						}
						break;
					}
					} 
				}
				setState(500);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_nofch, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(502);
				lgrp();
				setState(503);
				nofch(0);
				setState(504);
				rgrp();
				}
				break;
			case 2:
				{
				setState(506);
				munder();
				}
				break;
			case 3:
				{
				setState(507);
				mover();
				}
				break;
			case 4:
				{
				setState(508);
				mundov();
				}
				break;
			case 5:
				{
				setState(509);
				mscript();
				}
				break;
			case 6:
				{
				setState(510);
				expr(0);
				}
				break;
			case 7:
				{
				setState(511);
				func();
				}
				break;
			case 8:
				{
				setState(512);
				mfrac();
				}
				break;
			case 9:
				{
				setState(513);
				mmfrac();
				}
				break;
			case 10:
				{
				setState(514);
				sqrt();
				}
				break;
			case 11:
				{
				setState(515);
				irad();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(534);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(532);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						_localctx = new NofchContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nofch);
						setState(518);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(519);
						nofch(15);
						}
						break;
					case 2:
						{
						_localctx = new NofchContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nofch);
						setState(520);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(521);
						binop1();
						setState(522);
						nofch(14);
						}
						break;
					case 3:
						{
						_localctx = new NofchContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nofch);
						setState(524);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(525);
						binop();
						setState(526);
						nofch(13);
						}
						break;
					case 4:
						{
						_localctx = new NofchContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nofch);
						setState(528);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(529);
						cmpr();
						setState(530);
						nofch(12);
						}
						break;
					}
					} 
				}
				setState(536);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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
		enterRule(_localctx, 32, RULE_mfrac);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			match(SFRAC);
			setState(538);
			nof(0);
			setState(539);
			match(FRAC_SLASH);
			setState(540);
			nof(0);
			setState(541);
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
		enterRule(_localctx, 34, RULE_mmfrac);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			match(CFRAC);
			setState(544);
			nofc(0);
			setState(545);
			match(CSLASH);
			setState(546);
			nofc(0);
			setState(547);
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
		enterRule(_localctx, 36, RULE_mmmfrac);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			match(HCFRAC);
			setState(550);
			nofch(0);
			setState(551);
			match(HCSLASH);
			setState(552);
			nofch(0);
			setState(553);
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
		enterRule(_localctx, 38, RULE_rindex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
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
		enterRule(_localctx, 40, RULE_sqrt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			match(SQRT);
			setState(558);
			nor(0);
			setState(559);
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
		enterRule(_localctx, 42, RULE_irad);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(MODOVER);
			setState(562);
			rindex();
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
		enterRule(_localctx, 44, RULE_sqrt1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			match(SQRT1);
			setState(568);
			nor1(0);
			setState(569);
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
		enterRule(_localctx, 46, RULE_irad1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			match(IRAD1);
			setState(572);
			rindex();
			setState(573);
			match(SQRT);
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
		enterRule(_localctx, 48, RULE_sqrt2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			match(SQRT2);
			setState(578);
			nor2(0);
			setState(579);
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
		enterRule(_localctx, 50, RULE_irad2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			match(IRAD2);
			setState(582);
			rindex();
			setState(583);
			match(SQRT);
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
		enterRule(_localctx, 52, RULE_sqrt3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			match(SQRT3);
			setState(588);
			nor3(0);
			setState(589);
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
		enterRule(_localctx, 54, RULE_irad3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			match(IRAD3);
			setState(592);
			rindex();
			setState(593);
			match(SQRT);
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
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_nomod, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(598);
				lgrp();
				setState(599);
				nomod(0);
				setState(600);
				rgrp();
				}
				break;
			case 2:
				{
				setState(602);
				mfrac();
				}
				break;
			case 3:
				{
				setState(603);
				mmfrac();
				}
				break;
			case 4:
				{
				setState(604);
				mmmfrac();
				}
				break;
			case 5:
				{
				setState(605);
				mscript();
				}
				break;
			case 6:
				{
				setState(606);
				irad();
				}
				break;
			case 7:
				{
				setState(607);
				sqrt();
				}
				break;
			case 8:
				{
				setState(608);
				expr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(627);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(625);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						_localctx = new NomodContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nomod);
						setState(611);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(612);
						nomod(12);
						}
						break;
					case 2:
						{
						_localctx = new NomodContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nomod);
						setState(613);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(614);
						binop1();
						setState(615);
						nomod(11);
						}
						break;
					case 3:
						{
						_localctx = new NomodContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nomod);
						setState(617);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(618);
						binop();
						setState(619);
						nomod(10);
						}
						break;
					case 4:
						{
						_localctx = new NomodContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nomod);
						setState(621);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(622);
						cmpr();
						setState(623);
						nomod(9);
						}
						break;
					}
					} 
				}
				setState(629);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
		enterRule(_localctx, 58, RULE_begmod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
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
		enterRule(_localctx, 60, RULE_munder);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			match(MODIF);
			setState(633);
			begmod();
			setState(634);
			match(MODUNDER);
			setState(635);
			endmod();
			setState(636);
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
		enterRule(_localctx, 62, RULE_mover);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			match(MODIF);
			setState(639);
			begmod();
			setState(640);
			match(MODOVER);
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
		enterRule(_localctx, 64, RULE_mundov);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			match(MODIF);
			setState(645);
			begmod();
			setState(646);
			match(MODUNDER);
			setState(647);
			endmod();
			setState(648);
			match(MODOVER);
			setState(649);
			endmod();
			setState(650);
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
		enterRule(_localctx, 66, RULE_endmod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
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
		enterRule(_localctx, 68, RULE_varXfunabb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
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
		enterRule(_localctx, 70, RULE_funabb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
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
		enterRule(_localctx, 72, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODIF:
				{
				setState(658);
				match(MODIF);
				setState(659);
				funabb();
				{
				setState(660);
				_la = _input.LA(1);
				if ( !(_la==MODOVER || _la==MODUNDER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(661);
				endmod();
				}
				}
				break;
			case FUN_ABBR:
			case TRAIL_FUN_ABBR:
				{
				setState(665);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FUN_ABBR:
					{
					setState(663);
					funabb();
					}
					break;
				case TRAIL_FUN_ABBR:
					{
					setState(664);
					varXfunabb();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(671);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(667);
					match(SUB);
					setState(668);
					script();
					}
					break;
				case 2:
					{
					setState(669);
					match(SUP);
					setState(670);
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
		enterRule(_localctx, 74, RULE_lgrp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
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
		enterRule(_localctx, 76, RULE_rgrp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
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
		enterRule(_localctx, 78, RULE_binop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
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
		enterRule(_localctx, 80, RULE_binop1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
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
		enterRule(_localctx, 82, RULE_cmpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			match(CMPR);
			setState(684);
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
		enterRule(_localctx, 84, RULE_var);
		try {
			setState(691);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(686);
				match(ID);
				}
				break;
			case LC_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(687);
				match(LC_ID);
				}
				break;
			case UC_ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(688);
				match(UC_ID);
				}
				break;
			case MIXID:
				enterOuterAlt(_localctx, 4);
				{
				setState(689);
				match(MIXID);
				}
				break;
			case GREEK_LETTER:
				enterOuterAlt(_localctx, 5);
				{
				setState(690);
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
		enterRule(_localctx, 86, RULE_greeks);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(694); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(693);
					match(GREEK_LETTER);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(696); 
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
		enterRule(_localctx, 88, RULE_specsym);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
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
		enterRule(_localctx, 90, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
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
		enterRule(_localctx, 92, RULE_numsub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LC_ID:
			case ID:
			case MIXID:
			case UC_ID:
			case GREEK_LETTER:
				{
				setState(702);
				var();
				}
				break;
			case FUN_ABBR:
				{
				setState(703);
				funabb();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(706);
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
		enterRule(_localctx, 94, RULE_chelement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
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
		enterRule(_localctx, 96, RULE_chnumsub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			chelement();
			setState(711);
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
		enterRule(_localctx, 98, RULE_chradical);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			match(LGRP);
			setState(716); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(716);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(714);
					chelement();
					}
					break;
				case 2:
					{
					setState(715);
					chnumsub();
					}
					break;
				}
				}
				setState(718); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CHEM_ELEMENT || _la==POSS_CH_ELEMENT );
			setState(720);
			match(RGRP);
			setState(721);
			match(SUB);
			setState(722);
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
		enterRule(_localctx, 100, RULE_chformula);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(727); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(727);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						setState(724);
						chelement();
						}
						break;
					case 2:
						{
						setState(725);
						chnumsub();
						}
						break;
					case 3:
						{
						setState(726);
						chradical();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(729); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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
		enterRule(_localctx, 102, RULE_sup2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(731);
			match(SUPSUP);
			}
			setState(732);
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
		enterRule(_localctx, 104, RULE_sup2b);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(734);
			match(SUPSUB);
			}
			setState(735);
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
		enterRule(_localctx, 106, RULE_sup22);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(737);
			match(SUPSUB);
			}
			setState(738);
			script();
			{
			setState(739);
			match(SUPSUP);
			}
			setState(740);
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
		enterRule(_localctx, 108, RULE_sub2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(742);
			match(SUBSUB);
			}
			setState(743);
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
		enterRule(_localctx, 110, RULE_sub2p);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(745);
			match(SUBSUP);
			}
			setState(746);
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
		enterRule(_localctx, 112, RULE_sub22);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(748);
			match(SUBSUB);
			}
			setState(749);
			script();
			{
			setState(750);
			match(SUBSUP);
			}
			setState(751);
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
		enterRule(_localctx, 114, RULE_base);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
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
		enterRule(_localctx, 116, RULE_script);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
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
		enterRule(_localctx, 118, RULE_subscript);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			match(SUB);
			setState(758);
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
		enterRule(_localctx, 120, RULE_supscript);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(760);
			match(SUP);
			setState(761);
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
		enterRule(_localctx, 122, RULE_msub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			base();
			setState(764);
			match(SUB);
			setState(765);
			script();
			setState(769);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(766);
				sub2();
				}
				break;
			case 2:
				{
				setState(767);
				sub2p();
				}
				break;
			case 3:
				{
				setState(768);
				sub22();
				}
				break;
			}
			setState(772);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(771);
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
		enterRule(_localctx, 124, RULE_msup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			base();
			setState(775);
			match(SUP);
			setState(776);
			script();
			setState(780);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(777);
				sup2();
				}
				break;
			case 2:
				{
				setState(778);
				sup2b();
				}
				break;
			case 3:
				{
				setState(779);
				sup22();
				}
				break;
			}
			setState(783);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(782);
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
		enterRule(_localctx, 126, RULE_msubsup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			base();
			setState(786);
			subscript();
			setState(787);
			supscript();
			setState(789);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(788);
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
		enterRule(_localctx, 128, RULE_mscript);
		try {
			setState(794);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(791);
				msub();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(792);
				msup();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(793);
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
		case 6:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 7:
			return layexpr_sempred((LayexprContext)_localctx, predIndex);
		case 8:
			return nor_sempred((NorContext)_localctx, predIndex);
		case 9:
			return nor1_sempred((Nor1Context)_localctx, predIndex);
		case 10:
			return nor2_sempred((Nor2Context)_localctx, predIndex);
		case 11:
			return nor3_sempred((Nor3Context)_localctx, predIndex);
		case 12:
			return nom_sempred((NomContext)_localctx, predIndex);
		case 13:
			return nof_sempred((NofContext)_localctx, predIndex);
		case 14:
			return nofc_sempred((NofcContext)_localctx, predIndex);
		case 15:
			return nofch_sempred((NofchContext)_localctx, predIndex);
		case 28:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3I\u031f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\3\2\6\2\u0086\n\2\r\2\16\2\u0087\3\3\7"+
		"\3\u008b\n\3\f\3\16\3\u008e\13\3\3\3\3\3\6\3\u0092\n\3\r\3\16\3\u0093"+
		"\3\3\3\3\7\3\u0098\n\3\f\3\16\3\u009b\13\3\3\3\7\3\u009e\n\3\f\3\16\3"+
		"\u00a1\13\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00a9\n\3\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5\u00b4\n\5\3\5\3\5\3\5\3\5\5\5\u00ba\n\5\5\5\u00bc"+
		"\n\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\5\7\u00c5\n\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00d3\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00e3\n\b\f\b\16\b\u00e6\13\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00f8\n\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0108\n\t\f\t"+
		"\16\t\u010b\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\n\u011d\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0129"+
		"\n\n\f\n\16\n\u012c\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u013e\n\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u014a\n\13\f\13\16\13\u014d\13\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u015f"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u016b\n\f\f\f\16\f\u016e"+
		"\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u017e"+
		"\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u018a\n\r\f\r\16\r\u018d"+
		"\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u019e\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\7\16\u01ae\n\16\f\16\16\16\u01b1\13\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u01c0"+
		"\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\7\17\u01d0\n\17\f\17\16\17\u01d3\13\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u01e3\n\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u01f3"+
		"\n\20\f\20\16\20\u01f6\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0207\n\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0217\n\21\f\21"+
		"\16\21\u021a\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3"+
		"\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\5\36\u0264\n\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u0274\n\36\f\36\16"+
		"\36\u0277\13\36\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3&\3&\3&\3&\5&\u029c"+
		"\n&\3&\3&\3&\3&\5&\u02a2\n&\5&\u02a4\n&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3"+
		"+\3+\3,\3,\3,\3,\3,\5,\u02b6\n,\3-\6-\u02b9\n-\r-\16-\u02ba\3.\3.\3/\3"+
		"/\3\60\3\60\5\60\u02c3\n\60\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\63\3"+
		"\63\3\63\6\63\u02cf\n\63\r\63\16\63\u02d0\3\63\3\63\3\63\3\63\3\64\3\64"+
		"\3\64\6\64\u02da\n\64\r\64\16\64\u02db\3\65\3\65\3\65\3\66\3\66\3\66\3"+
		"\67\3\67\3\67\3\67\3\67\38\38\38\39\39\39\3:\3:\3:\3:\3:\3;\3;\3<\3<\3"+
		"=\3=\3=\3>\3>\3>\3?\3?\3?\3?\3?\3?\5?\u0304\n?\3?\5?\u0307\n?\3@\3@\3"+
		"@\3@\3@\3@\5@\u030f\n@\3@\5@\u0312\n@\3A\3A\3A\3A\5A\u0318\nA\3B\3B\3"+
		"B\5B\u031d\nB\3B\2\r\16\20\22\24\26\30\32\34\36 :C\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"rtvxz|~\u0080\u0082\2\6\3\2\34\35\4\2\22\22  \4\2\f\f\66\67\3\2=>\2\u0393"+
		"\2\u0085\3\2\2\2\4\u00a8\3\2\2\2\6\u00aa\3\2\2\2\b\u00bb\3\2\2\2\n\u00c0"+
		"\3\2\2\2\f\u00c4\3\2\2\2\16\u00d2\3\2\2\2\20\u00f7\3\2\2\2\22\u011c\3"+
		"\2\2\2\24\u013d\3\2\2\2\26\u015e\3\2\2\2\30\u017d\3\2\2\2\32\u019d\3\2"+
		"\2\2\34\u01bf\3\2\2\2\36\u01e2\3\2\2\2 \u0206\3\2\2\2\"\u021b\3\2\2\2"+
		"$\u0221\3\2\2\2&\u0227\3\2\2\2(\u022d\3\2\2\2*\u022f\3\2\2\2,\u0233\3"+
		"\2\2\2.\u0239\3\2\2\2\60\u023d\3\2\2\2\62\u0243\3\2\2\2\64\u0247\3\2\2"+
		"\2\66\u024d\3\2\2\28\u0251\3\2\2\2:\u0263\3\2\2\2<\u0278\3\2\2\2>\u027a"+
		"\3\2\2\2@\u0280\3\2\2\2B\u0286\3\2\2\2D\u028e\3\2\2\2F\u0290\3\2\2\2H"+
		"\u0292\3\2\2\2J\u02a3\3\2\2\2L\u02a5\3\2\2\2N\u02a7\3\2\2\2P\u02a9\3\2"+
		"\2\2R\u02ab\3\2\2\2T\u02ad\3\2\2\2V\u02b5\3\2\2\2X\u02b8\3\2\2\2Z\u02bc"+
		"\3\2\2\2\\\u02be\3\2\2\2^\u02c2\3\2\2\2`\u02c6\3\2\2\2b\u02c8\3\2\2\2"+
		"d\u02cb\3\2\2\2f\u02d9\3\2\2\2h\u02dd\3\2\2\2j\u02e0\3\2\2\2l\u02e3\3"+
		"\2\2\2n\u02e8\3\2\2\2p\u02eb\3\2\2\2r\u02ee\3\2\2\2t\u02f3\3\2\2\2v\u02f5"+
		"\3\2\2\2x\u02f7\3\2\2\2z\u02fa\3\2\2\2|\u02fd\3\2\2\2~\u0308\3\2\2\2\u0080"+
		"\u0313\3\2\2\2\u0082\u031c\3\2\2\2\u0084\u0086\5\4\3\2\u0085\u0084\3\2"+
		"\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\3\3\2\2\2\u0089\u008b\5\n\6\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2"+
		"\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u008c"+
		"\3\2\2\2\u008f\u0099\5\f\7\2\u0090\u0092\5\n\6\2\u0091\u0090\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2"+
		"\2\2\u0095\u0096\5\f\7\2\u0096\u0098\3\2\2\2\u0097\u0091\3\2\2\2\u0098"+
		"\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009f\3\2"+
		"\2\2\u009b\u0099\3\2\2\2\u009c\u009e\5\n\6\2\u009d\u009c\3\2\2\2\u009e"+
		"\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2"+
		"\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7\65\2\2\u00a3\u00a9\3\2\2\2\u00a4"+
		"\u00a9\7\65\2\2\u00a5\u00a6\5\6\4\2\u00a6\u00a7\7\65\2\2\u00a7\u00a9\3"+
		"\2\2\2\u00a8\u008c\3\2\2\2\u00a8\u00a4\3\2\2\2\u00a8\u00a5\3\2\2\2\u00a9"+
		"\5\3\2\2\2\u00aa\u00ab\7\4\2\2\u00ab\7\3\2\2\2\u00ac\u00ad\7\33\2\2\u00ad"+
		"\u00ae\5H%\2\u00ae\u00af\t\2\2\2\u00af\u00b0\5D#\2\u00b0\u00bc\3\2\2\2"+
		"\u00b1\u00b4\5H%\2\u00b2\u00b4\5F$\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3"+
		"\2\2\2\u00b4\u00b9\3\2\2\2\u00b5\u00b6\7\27\2\2\u00b6\u00ba\5v<\2\u00b7"+
		"\u00b8\7\32\2\2\u00b8\u00ba\5v<\2\u00b9\u00b5\3\2\2\2\u00b9\u00b7\3\2"+
		"\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00ac\3\2\2\2\u00bb"+
		"\u00b3\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\5\n\6\2\u00be\u00bf\5\20"+
		"\t\2\u00bf\t\3\2\2\2\u00c0\u00c1\7\64\2\2\u00c1\13\3\2\2\2\u00c2\u00c5"+
		"\5\b\5\2\u00c3\u00c5\5\20\t\2\u00c4\u00c2\3\2\2\2\u00c4\u00c3\3\2\2\2"+
		"\u00c5\r\3\2\2\2\u00c6\u00c7\b\b\1\2\u00c7\u00c8\5L\'\2\u00c8\u00c9\5"+
		"\16\b\2\u00c9\u00ca\5N(\2\u00ca\u00d3\3\2\2\2\u00cb\u00d3\5V,\2\u00cc"+
		"\u00d3\5Z.\2\u00cd\u00d3\5\\/\2\u00ce\u00d3\5^\60\2\u00cf\u00d3\5b\62"+
		"\2\u00d0\u00d3\5`\61\2\u00d1\u00d3\5f\64\2\u00d2\u00c6\3\2\2\2\u00d2\u00cb"+
		"\3\2\2\2\u00d2\u00cc\3\2\2\2\u00d2\u00cd\3\2\2\2\u00d2\u00ce\3\2\2\2\u00d2"+
		"\u00cf\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00e4\3\2"+
		"\2\2\u00d4\u00d5\f\r\2\2\u00d5\u00e3\5\16\b\16\u00d6\u00d7\f\f\2\2\u00d7"+
		"\u00d8\5R*\2\u00d8\u00d9\5\16\b\r\u00d9\u00e3\3\2\2\2\u00da\u00db\f\13"+
		"\2\2\u00db\u00dc\5P)\2\u00dc\u00dd\5\16\b\f\u00dd\u00e3\3\2\2\2\u00de"+
		"\u00df\f\n\2\2\u00df\u00e0\5T+\2\u00e0\u00e1\5\16\b\13\u00e1\u00e3\3\2"+
		"\2\2\u00e2\u00d4\3\2\2\2\u00e2\u00d6\3\2\2\2\u00e2\u00da\3\2\2\2\u00e2"+
		"\u00de\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2"+
		"\2\2\u00e5\17\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\b\t\1\2\u00e8\u00e9"+
		"\5L\'\2\u00e9\u00ea\5\20\t\2\u00ea\u00eb\5N(\2\u00eb\u00f8\3\2\2\2\u00ec"+
		"\u00f8\5\"\22\2\u00ed\u00f8\5$\23\2\u00ee\u00f8\5&\24\2\u00ef\u00f8\5"+
		"> \2\u00f0\u00f8\5@!\2\u00f1\u00f8\5B\"\2\u00f2\u00f8\5\u0082B\2\u00f3"+
		"\u00f8\5*\26\2\u00f4\u00f8\5,\27\2\u00f5\u00f8\5\16\b\2\u00f6\u00f8\5"+
		"J&\2\u00f7\u00e7\3\2\2\2\u00f7\u00ec\3\2\2\2\u00f7\u00ed\3\2\2\2\u00f7"+
		"\u00ee\3\2\2\2\u00f7\u00ef\3\2\2\2\u00f7\u00f0\3\2\2\2\u00f7\u00f1\3\2"+
		"\2\2\u00f7\u00f2\3\2\2\2\u00f7\u00f3\3\2\2\2\u00f7\u00f4\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8\u0109\3\2\2\2\u00f9\u00fa\f\22"+
		"\2\2\u00fa\u0108\5\20\t\23\u00fb\u00fc\f\20\2\2\u00fc\u00fd\5R*\2\u00fd"+
		"\u00fe\5\20\t\21\u00fe\u0108\3\2\2\2\u00ff\u0100\f\17\2\2\u0100\u0101"+
		"\5P)\2\u0101\u0102\5\20\t\20\u0102\u0108\3\2\2\2\u0103\u0104\f\16\2\2"+
		"\u0104\u0105\5T+\2\u0105\u0106\5\20\t\17\u0106\u0108\3\2\2\2\u0107\u00f9"+
		"\3\2\2\2\u0107\u00fb\3\2\2\2\u0107\u00ff\3\2\2\2\u0107\u0103\3\2\2\2\u0108"+
		"\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\21\3\2\2"+
		"\2\u010b\u0109\3\2\2\2\u010c\u010d\b\n\1\2\u010d\u010e\5L\'\2\u010e\u010f"+
		"\5\22\n\2\u010f\u0110\5N(\2\u0110\u011d\3\2\2\2\u0111\u011d\5\"\22\2\u0112"+
		"\u011d\5$\23\2\u0113\u011d\5&\24\2\u0114\u011d\5> \2\u0115\u011d\5@!\2"+
		"\u0116\u011d\5B\"\2\u0117\u011d\5\u0082B\2\u0118\u011d\5\60\31\2\u0119"+
		"\u011d\5.\30\2\u011a\u011d\5\16\b\2\u011b\u011d\5J&\2\u011c\u010c\3\2"+
		"\2\2\u011c\u0111\3\2\2\2\u011c\u0112\3\2\2\2\u011c\u0113\3\2\2\2\u011c"+
		"\u0114\3\2\2\2\u011c\u0115\3\2\2\2\u011c\u0116\3\2\2\2\u011c\u0117\3\2"+
		"\2\2\u011c\u0118\3\2\2\2\u011c\u0119\3\2\2\2\u011c\u011a\3\2\2\2\u011c"+
		"\u011b\3\2\2\2\u011d\u012a\3\2\2\2\u011e\u011f\f\20\2\2\u011f\u0129\5"+
		"\22\n\21\u0120\u0121\f\17\2\2\u0121\u0122\5R*\2\u0122\u0123\5\22\n\20"+
		"\u0123\u0129\3\2\2\2\u0124\u0125\f\16\2\2\u0125\u0126\5P)\2\u0126\u0127"+
		"\5\22\n\17\u0127\u0129\3\2\2\2\u0128\u011e\3\2\2\2\u0128\u0120\3\2\2\2"+
		"\u0128\u0124\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b"+
		"\3\2\2\2\u012b\23\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e\b\13\1\2\u012e"+
		"\u012f\5L\'\2\u012f\u0130\5\24\13\2\u0130\u0131\5N(\2\u0131\u013e\3\2"+
		"\2\2\u0132\u013e\5\"\22\2\u0133\u013e\5$\23\2\u0134\u013e\5&\24\2\u0135"+
		"\u013e\5> \2\u0136\u013e\5@!\2\u0137\u013e\5B\"\2\u0138\u013e\5\u0082"+
		"B\2\u0139\u013e\5\64\33\2\u013a\u013e\5\62\32\2\u013b\u013e\5\16\b\2\u013c"+
		"\u013e\5J&\2\u013d\u012d\3\2\2\2\u013d\u0132\3\2\2\2\u013d\u0133\3\2\2"+
		"\2\u013d\u0134\3\2\2\2\u013d\u0135\3\2\2\2\u013d\u0136\3\2\2\2\u013d\u0137"+
		"\3\2\2\2\u013d\u0138\3\2\2\2\u013d\u0139\3\2\2\2\u013d\u013a\3\2\2\2\u013d"+
		"\u013b\3\2\2\2\u013d\u013c\3\2\2\2\u013e\u014b\3\2\2\2\u013f\u0140\f\20"+
		"\2\2\u0140\u014a\5\24\13\21\u0141\u0142\f\17\2\2\u0142\u0143\5R*\2\u0143"+
		"\u0144\5\24\13\20\u0144\u014a\3\2\2\2\u0145\u0146\f\16\2\2\u0146\u0147"+
		"\5P)\2\u0147\u0148\5\24\13\17\u0148\u014a\3\2\2\2\u0149\u013f\3\2\2\2"+
		"\u0149\u0141\3\2\2\2\u0149\u0145\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149"+
		"\3\2\2\2\u014b\u014c\3\2\2\2\u014c\25\3\2\2\2\u014d\u014b\3\2\2\2\u014e"+
		"\u014f\b\f\1\2\u014f\u0150\5L\'\2\u0150\u0151\5\26\f\2\u0151\u0152\5N"+
		"(\2\u0152\u015f\3\2\2\2\u0153\u015f\5\"\22\2\u0154\u015f\5$\23\2\u0155"+
		"\u015f\5&\24\2\u0156\u015f\5> \2\u0157\u015f\5@!\2\u0158\u015f\5B\"\2"+
		"\u0159\u015f\5\u0082B\2\u015a\u015f\58\35\2\u015b\u015f\5\66\34\2\u015c"+
		"\u015f\5\16\b\2\u015d\u015f\5J&\2\u015e\u014e\3\2\2\2\u015e\u0153\3\2"+
		"\2\2\u015e\u0154\3\2\2\2\u015e\u0155\3\2\2\2\u015e\u0156\3\2\2\2\u015e"+
		"\u0157\3\2\2\2\u015e\u0158\3\2\2\2\u015e\u0159\3\2\2\2\u015e\u015a\3\2"+
		"\2\2\u015e\u015b\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015d\3\2\2\2\u015f"+
		"\u016c\3\2\2\2\u0160\u0161\f\20\2\2\u0161\u016b\5\26\f\21\u0162\u0163"+
		"\f\17\2\2\u0163\u0164\5R*\2\u0164\u0165\5\26\f\20\u0165\u016b\3\2\2\2"+
		"\u0166\u0167\f\16\2\2\u0167\u0168\5P)\2\u0168\u0169\5\26\f\17\u0169\u016b"+
		"\3\2\2\2\u016a\u0160\3\2\2\2\u016a\u0162\3\2\2\2\u016a\u0166\3\2\2\2\u016b"+
		"\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\27\3\2\2"+
		"\2\u016e\u016c\3\2\2\2\u016f\u0170\b\r\1\2\u0170\u0171\5L\'\2\u0171\u0172"+
		"\5\30\r\2\u0172\u0173\5N(\2\u0173\u017e\3\2\2\2\u0174\u017e\5\"\22\2\u0175"+
		"\u017e\5$\23\2\u0176\u017e\5&\24\2\u0177\u017e\5> \2\u0178\u017e\5@!\2"+
		"\u0179\u017e\5B\"\2\u017a\u017e\5\u0082B\2\u017b\u017e\5\16\b\2\u017c"+
		"\u017e\5J&\2\u017d\u016f\3\2\2\2\u017d\u0174\3\2\2\2\u017d\u0175\3\2\2"+
		"\2\u017d\u0176\3\2\2\2\u017d\u0177\3\2\2\2\u017d\u0178\3\2\2\2\u017d\u0179"+
		"\3\2\2\2\u017d\u017a\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017c\3\2\2\2\u017e"+
		"\u018b\3\2\2\2\u017f\u0180\f\16\2\2\u0180\u018a\5\30\r\17\u0181\u0182"+
		"\f\r\2\2\u0182\u0183\5R*\2\u0183\u0184\5\30\r\16\u0184\u018a\3\2\2\2\u0185"+
		"\u0186\f\f\2\2\u0186\u0187\5P)\2\u0187\u0188\5\30\r\r\u0188\u018a\3\2"+
		"\2\2\u0189\u017f\3\2\2\2\u0189\u0181\3\2\2\2\u0189\u0185\3\2\2\2\u018a"+
		"\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\31\3\2\2"+
		"\2\u018d\u018b\3\2\2\2\u018e\u018f\b\16\1\2\u018f\u0190\5L\'\2\u0190\u0191"+
		"\5\32\16\2\u0191\u0192\5N(\2\u0192\u019e\3\2\2\2\u0193\u019e\5\"\22\2"+
		"\u0194\u019e\5$\23\2\u0195\u019e\5&\24\2\u0196\u019e\5> \2\u0197\u019e"+
		"\5@!\2\u0198\u019e\5B\"\2\u0199\u019e\5\16\b\2\u019a\u019e\5\b\5\2\u019b"+
		"\u019e\5*\26\2\u019c\u019e\5,\27\2\u019d\u018e\3\2\2\2\u019d\u0193\3\2"+
		"\2\2\u019d\u0194\3\2\2\2\u019d\u0195\3\2\2\2\u019d\u0196\3\2\2\2\u019d"+
		"\u0197\3\2\2\2\u019d\u0198\3\2\2\2\u019d\u0199\3\2\2\2\u019d\u019a\3\2"+
		"\2\2\u019d\u019b\3\2\2\2\u019d\u019c\3\2\2\2\u019e\u01af\3\2\2\2\u019f"+
		"\u01a0\f\20\2\2\u01a0\u01ae\5\32\16\21\u01a1\u01a2\f\17\2\2\u01a2\u01a3"+
		"\5R*\2\u01a3\u01a4\5\32\16\20\u01a4\u01ae\3\2\2\2\u01a5\u01a6\f\16\2\2"+
		"\u01a6\u01a7\5P)\2\u01a7\u01a8\5\32\16\17\u01a8\u01ae\3\2\2\2\u01a9\u01aa"+
		"\f\r\2\2\u01aa\u01ab\5T+\2\u01ab\u01ac\5\32\16\16\u01ac\u01ae\3\2\2\2"+
		"\u01ad\u019f\3\2\2\2\u01ad\u01a1\3\2\2\2\u01ad\u01a5\3\2\2\2\u01ad\u01a9"+
		"\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0"+
		"\33\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b3\b\17\1\2\u01b3\u01b4\5L\'"+
		"\2\u01b4\u01b5\5\34\17\2\u01b5\u01b6\5N(\2\u01b6\u01c0\3\2\2\2\u01b7\u01c0"+
		"\5> \2\u01b8\u01c0\5@!\2\u01b9\u01c0\5B\"\2\u01ba\u01c0\5\u0082B\2\u01bb"+
		"\u01c0\5\16\b\2\u01bc\u01c0\5J&\2\u01bd\u01c0\5*\26\2\u01be\u01c0\5,\27"+
		"\2\u01bf\u01b2\3\2\2\2\u01bf\u01b7\3\2\2\2\u01bf\u01b8\3\2\2\2\u01bf\u01b9"+
		"\3\2\2\2\u01bf\u01ba\3\2\2\2\u01bf\u01bb\3\2\2\2\u01bf\u01bc\3\2\2\2\u01bf"+
		"\u01bd\3\2\2\2\u01bf\u01be\3\2\2\2\u01c0\u01d1\3\2\2\2\u01c1\u01c2\f\16"+
		"\2\2\u01c2\u01d0\5\34\17\17\u01c3\u01c4\f\r\2\2\u01c4\u01c5\5R*\2\u01c5"+
		"\u01c6\5\34\17\16\u01c6\u01d0\3\2\2\2\u01c7\u01c8\f\f\2\2\u01c8\u01c9"+
		"\5P)\2\u01c9\u01ca\5\34\17\r\u01ca\u01d0\3\2\2\2\u01cb\u01cc\f\13\2\2"+
		"\u01cc\u01cd\5T+\2\u01cd\u01ce\5\34\17\f\u01ce\u01d0\3\2\2\2\u01cf\u01c1"+
		"\3\2\2\2\u01cf\u01c3\3\2\2\2\u01cf\u01c7\3\2\2\2\u01cf\u01cb\3\2\2\2\u01d0"+
		"\u01d3\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\35\3\2\2"+
		"\2\u01d3\u01d1\3\2\2\2\u01d4\u01d5\b\20\1\2\u01d5\u01d6\5L\'\2\u01d6\u01d7"+
		"\5\36\20\2\u01d7\u01d8\5N(\2\u01d8\u01e3\3\2\2\2\u01d9\u01e3\5> \2\u01da"+
		"\u01e3\5@!\2\u01db\u01e3\5B\"\2\u01dc\u01e3\5\u0082B\2\u01dd\u01e3\5\16"+
		"\b\2\u01de\u01e3\5J&\2\u01df\u01e3\5\"\22\2\u01e0\u01e3\5*\26\2\u01e1"+
		"\u01e3\5,\27\2\u01e2\u01d4\3\2\2\2\u01e2\u01d9\3\2\2\2\u01e2\u01da\3\2"+
		"\2\2\u01e2\u01db\3\2\2\2\u01e2\u01dc\3\2\2\2\u01e2\u01dd\3\2\2\2\u01e2"+
		"\u01de\3\2\2\2\u01e2\u01df\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e1\3\2"+
		"\2\2\u01e3\u01f4\3\2\2\2\u01e4\u01e5\f\17\2\2\u01e5\u01f3\5\36\20\20\u01e6"+
		"\u01e7\f\r\2\2\u01e7\u01e8\5P)\2\u01e8\u01e9\5\36\20\16\u01e9\u01f3\3"+
		"\2\2\2\u01ea\u01eb\f\f\2\2\u01eb\u01ec\5T+\2\u01ec\u01ed\5\36\20\r\u01ed"+
		"\u01f3\3\2\2\2\u01ee\u01ef\f\16\2\2\u01ef\u01f0\5R*\2\u01f0\u01f1\5\34"+
		"\17\2\u01f1\u01f3\3\2\2\2\u01f2\u01e4\3\2\2\2\u01f2\u01e6\3\2\2\2\u01f2"+
		"\u01ea\3\2\2\2\u01f2\u01ee\3\2\2\2\u01f3\u01f6\3\2\2\2\u01f4\u01f2\3\2"+
		"\2\2\u01f4\u01f5\3\2\2\2\u01f5\37\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f7\u01f8"+
		"\b\21\1\2\u01f8\u01f9\5L\'\2\u01f9\u01fa\5 \21\2\u01fa\u01fb\5N(\2\u01fb"+
		"\u0207\3\2\2\2\u01fc\u0207\5> \2\u01fd\u0207\5@!\2\u01fe\u0207\5B\"\2"+
		"\u01ff\u0207\5\u0082B\2\u0200\u0207\5\16\b\2\u0201\u0207\5J&\2\u0202\u0207"+
		"\5\"\22\2\u0203\u0207\5$\23\2\u0204\u0207\5*\26\2\u0205\u0207\5,\27\2"+
		"\u0206\u01f7\3\2\2\2\u0206\u01fc\3\2\2\2\u0206\u01fd\3\2\2\2\u0206\u01fe"+
		"\3\2\2\2\u0206\u01ff\3\2\2\2\u0206\u0200\3\2\2\2\u0206\u0201\3\2\2\2\u0206"+
		"\u0202\3\2\2\2\u0206\u0203\3\2\2\2\u0206\u0204\3\2\2\2\u0206\u0205\3\2"+
		"\2\2\u0207\u0218\3\2\2\2\u0208\u0209\f\20\2\2\u0209\u0217\5 \21\21\u020a"+
		"\u020b\f\17\2\2\u020b\u020c\5R*\2\u020c\u020d\5 \21\20\u020d\u0217\3\2"+
		"\2\2\u020e\u020f\f\16\2\2\u020f\u0210\5P)\2\u0210\u0211\5 \21\17\u0211"+
		"\u0217\3\2\2\2\u0212\u0213\f\r\2\2\u0213\u0214\5T+\2\u0214\u0215\5 \21"+
		"\16\u0215\u0217\3\2\2\2\u0216\u0208\3\2\2\2\u0216\u020a\3\2\2\2\u0216"+
		"\u020e\3\2\2\2\u0216\u0212\3\2\2\2\u0217\u021a\3\2\2\2\u0218\u0216\3\2"+
		"\2\2\u0218\u0219\3\2\2\2\u0219!\3\2\2\2\u021a\u0218\3\2\2\2\u021b\u021c"+
		"\7\37\2\2\u021c\u021d\5\34\17\2\u021d\u021e\7 \2\2\u021e\u021f\5\34\17"+
		"\2\u021f\u0220\7!\2\2\u0220#\3\2\2\2\u0221\u0222\7\"\2\2\u0222\u0223\5"+
		"\36\20\2\u0223\u0224\7#\2\2\u0224\u0225\5\36\20\2\u0225\u0226\7$\2\2\u0226"+
		"%\3\2\2\2\u0227\u0228\7%\2\2\u0228\u0229\5 \21\2\u0229\u022a\7&\2\2\u022a"+
		"\u022b\5 \21\2\u022b\u022c\7\'\2\2\u022c\'\3\2\2\2\u022d\u022e\5\30\r"+
		"\2\u022e)\3\2\2\2\u022f\u0230\7*\2\2\u0230\u0231\5\22\n\2\u0231\u0232"+
		"\7\36\2\2\u0232+\3\2\2\2\u0233\u0234\7\34\2\2\u0234\u0235\5(\25\2\u0235"+
		"\u0236\7*\2\2\u0236\u0237\5\22\n\2\u0237\u0238\7\36\2\2\u0238-\3\2\2\2"+
		"\u0239\u023a\7+\2\2\u023a\u023b\5\24\13\2\u023b\u023c\7\61\2\2\u023c/"+
		"\3\2\2\2\u023d\u023e\7.\2\2\u023e\u023f\5(\25\2\u023f\u0240\7*\2\2\u0240"+
		"\u0241\5\24\13\2\u0241\u0242\7\61\2\2\u0242\61\3\2\2\2\u0243\u0244\7,"+
		"\2\2\u0244\u0245\5\26\f\2\u0245\u0246\7\62\2\2\u0246\63\3\2\2\2\u0247"+
		"\u0248\7/\2\2\u0248\u0249\5(\25\2\u0249\u024a\7*\2\2\u024a\u024b\5\26"+
		"\f\2\u024b\u024c\7\62\2\2\u024c\65\3\2\2\2\u024d\u024e\7-\2\2\u024e\u024f"+
		"\5\30\r\2\u024f\u0250\7\63\2\2\u0250\67\3\2\2\2\u0251\u0252\7\60\2\2\u0252"+
		"\u0253\5(\25\2\u0253\u0254\7*\2\2\u0254\u0255\5\30\r\2\u0255\u0256\7\63"+
		"\2\2\u02569\3\2\2\2\u0257\u0258\b\36\1\2\u0258\u0259\5L\'\2\u0259\u025a"+
		"\5:\36\2\u025a\u025b\5N(\2\u025b\u0264\3\2\2\2\u025c\u0264\5\"\22\2\u025d"+
		"\u0264\5$\23\2\u025e\u0264\5&\24\2\u025f\u0264\5\u0082B\2\u0260\u0264"+
		"\5,\27\2\u0261\u0264\5*\26\2\u0262\u0264\5\16\b\2\u0263\u0257\3\2\2\2"+
		"\u0263\u025c\3\2\2\2\u0263\u025d\3\2\2\2\u0263\u025e\3\2\2\2\u0263\u025f"+
		"\3\2\2\2\u0263\u0260\3\2\2\2\u0263\u0261\3\2\2\2\u0263\u0262\3\2\2\2\u0264"+
		"\u0275\3\2\2\2\u0265\u0266\f\r\2\2\u0266\u0274\5:\36\16\u0267\u0268\f"+
		"\f\2\2\u0268\u0269\5R*\2\u0269\u026a\5:\36\r\u026a\u0274\3\2\2\2\u026b"+
		"\u026c\f\13\2\2\u026c\u026d\5P)\2\u026d\u026e\5:\36\f\u026e\u0274\3\2"+
		"\2\2\u026f\u0270\f\n\2\2\u0270\u0271\5T+\2\u0271\u0272\5:\36\13\u0272"+
		"\u0274\3\2\2\2\u0273\u0265\3\2\2\2\u0273\u0267\3\2\2\2\u0273\u026b\3\2"+
		"\2\2\u0273\u026f\3\2\2\2\u0274\u0277\3\2\2\2\u0275\u0273\3\2\2\2\u0275"+
		"\u0276\3\2\2\2\u0276;\3\2\2\2\u0277\u0275\3\2\2\2\u0278\u0279\5:\36\2"+
		"\u0279=\3\2\2\2\u027a\u027b\7\33\2\2\u027b\u027c\5<\37\2\u027c\u027d\7"+
		"\35\2\2\u027d\u027e\5D#\2\u027e\u027f\7\36\2\2\u027f?\3\2\2\2\u0280\u0281"+
		"\7\33\2\2\u0281\u0282\5<\37\2\u0282\u0283\7\34\2\2\u0283\u0284\5D#\2\u0284"+
		"\u0285\7\36\2\2\u0285A\3\2\2\2\u0286\u0287\7\33\2\2\u0287\u0288\5<\37"+
		"\2\u0288\u0289\7\35\2\2\u0289\u028a\5D#\2\u028a\u028b\7\34\2\2\u028b\u028c"+
		"\5D#\2\u028c\u028d\7\36\2\2\u028dC\3\2\2\2\u028e\u028f\5:\36\2\u028fE"+
		"\3\2\2\2\u0290\u0291\7;\2\2\u0291G\3\2\2\2\u0292\u0293\79\2\2\u0293I\3"+
		"\2\2\2\u0294\u0295\7\33\2\2\u0295\u0296\5H%\2\u0296\u0297\t\2\2\2\u0297"+
		"\u0298\5D#\2\u0298\u02a4\3\2\2\2\u0299\u029c\5H%\2\u029a\u029c\5F$\2\u029b"+
		"\u0299\3\2\2\2\u029b\u029a\3\2\2\2\u029c\u02a1\3\2\2\2\u029d\u029e\7\27"+
		"\2\2\u029e\u02a2\5v<\2\u029f\u02a0\7\32\2\2\u02a0\u02a2\5v<\2\u02a1\u029d"+
		"\3\2\2\2\u02a1\u029f\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a4\3\2\2\2\u02a3"+
		"\u0294\3\2\2\2\u02a3\u029b\3\2\2\2\u02a4K\3\2\2\2\u02a5\u02a6\7\17\2\2"+
		"\u02a6M\3\2\2\2\u02a7\u02a8\7\20\2\2\u02a8O\3\2\2\2\u02a9\u02aa\7\21\2"+
		"\2\u02aaQ\3\2\2\2\u02ab\u02ac\t\3\2\2\u02acS\3\2\2\2\u02ad\u02ae\7\24"+
		"\2\2\u02ae\u02af\7\64\2\2\u02afU\3\2\2\2\u02b0\u02b6\7\7\2\2\u02b1\u02b6"+
		"\7\5\2\2\u02b2\u02b6\7\n\2\2\u02b3\u02b6\7\b\2\2\u02b4\u02b6\5X-\2\u02b5"+
		"\u02b0\3\2\2\2\u02b5\u02b1\3\2\2\2\u02b5\u02b2\3\2\2\2\u02b5\u02b3\3\2"+
		"\2\2\u02b5\u02b4\3\2\2\2\u02b6W\3\2\2\2\u02b7\u02b9\7\13\2\2\u02b8\u02b7"+
		"\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02b8\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb"+
		"Y\3\2\2\2\u02bc\u02bd\t\4\2\2\u02bd[\3\2\2\2\u02be\u02bf\7\23\2\2\u02bf"+
		"]\3\2\2\2\u02c0\u02c3\5V,\2\u02c1\u02c3\5H%\2\u02c2\u02c0\3\2\2\2\u02c2"+
		"\u02c1\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02c5\5\\/\2\u02c5_\3\2\2\2\u02c6"+
		"\u02c7\t\5\2\2\u02c7a\3\2\2\2\u02c8\u02c9\5`\61\2\u02c9\u02ca\5\\/\2\u02ca"+
		"c\3\2\2\2\u02cb\u02ce\7\17\2\2\u02cc\u02cf\5`\61\2\u02cd\u02cf\5b\62\2"+
		"\u02ce\u02cc\3\2\2\2\u02ce\u02cd\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02ce"+
		"\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d3\7\20\2\2"+
		"\u02d3\u02d4\7\27\2\2\u02d4\u02d5\5\\/\2\u02d5e\3\2\2\2\u02d6\u02da\5"+
		"`\61\2\u02d7\u02da\5b\62\2\u02d8\u02da\5d\63\2\u02d9\u02d6\3\2\2\2\u02d9"+
		"\u02d7\3\2\2\2\u02d9\u02d8\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02d9\3\2"+
		"\2\2\u02db\u02dc\3\2\2\2\u02dcg\3\2\2\2\u02dd\u02de\7\31\2\2\u02de\u02df"+
		"\5v<\2\u02dfi\3\2\2\2\u02e0\u02e1\7\30\2\2\u02e1\u02e2\5v<\2\u02e2k\3"+
		"\2\2\2\u02e3\u02e4\7\30\2\2\u02e4\u02e5\5v<\2\u02e5\u02e6\7\31\2\2\u02e6"+
		"\u02e7\5v<\2\u02e7m\3\2\2\2\u02e8\u02e9\7\25\2\2\u02e9\u02ea\5v<\2\u02ea"+
		"o\3\2\2\2\u02eb\u02ec\7\26\2\2\u02ec\u02ed\5v<\2\u02edq\3\2\2\2\u02ee"+
		"\u02ef\7\25\2\2\u02ef\u02f0\5v<\2\u02f0\u02f1\7\26\2\2\u02f1\u02f2\5v"+
		"<\2\u02f2s\3\2\2\2\u02f3\u02f4\5\32\16\2\u02f4u\3\2\2\2\u02f5\u02f6\5"+
		"\32\16\2\u02f6w\3\2\2\2\u02f7\u02f8\7\27\2\2\u02f8\u02f9\5v<\2\u02f9y"+
		"\3\2\2\2\u02fa\u02fb\7\32\2\2\u02fb\u02fc\5v<\2\u02fc{\3\2\2\2\u02fd\u02fe"+
		"\5t;\2\u02fe\u02ff\7\27\2\2\u02ff\u0303\5v<\2\u0300\u0304\5n8\2\u0301"+
		"\u0304\5p9\2\u0302\u0304\5r:\2\u0303\u0300\3\2\2\2\u0303\u0301\3\2\2\2"+
		"\u0303\u0302\3\2\2\2\u0303\u0304\3\2\2\2\u0304\u0306\3\2\2\2\u0305\u0307"+
		"\7\33\2\2\u0306\u0305\3\2\2\2\u0306\u0307\3\2\2\2\u0307}\3\2\2\2\u0308"+
		"\u0309\5t;\2\u0309\u030a\7\32\2\2\u030a\u030e\5v<\2\u030b\u030f\5h\65"+
		"\2\u030c\u030f\5j\66\2\u030d\u030f\5l\67\2\u030e\u030b\3\2\2\2\u030e\u030c"+
		"\3\2\2\2\u030e\u030d\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0311\3\2\2\2\u0310"+
		"\u0312\7\33\2\2\u0311\u0310\3\2\2\2\u0311\u0312\3\2\2\2\u0312\177\3\2"+
		"\2\2\u0313\u0314\5t;\2\u0314\u0315\5x=\2\u0315\u0317\5z>\2\u0316\u0318"+
		"\7\33\2\2\u0317\u0316\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u0081\3\2\2\2"+
		"\u0319\u031d\5|?\2\u031a\u031d\5~@\2\u031b\u031d\5\u0080A\2\u031c\u0319"+
		"\3\2\2\2\u031c\u031a\3\2\2\2\u031c\u031b\3\2\2\2\u031d\u0083\3\2\2\2="+
		"\u0087\u008c\u0093\u0099\u009f\u00a8\u00b3\u00b9\u00bb\u00c4\u00d2\u00e2"+
		"\u00e4\u00f7\u0107\u0109\u011c\u0128\u012a\u013d\u0149\u014b\u015e\u016a"+
		"\u016c\u017d\u0189\u018b\u019d\u01ad\u01af\u01bf\u01cf\u01d1\u01e2\u01f2"+
		"\u01f4\u0206\u0216\u0218\u0263\u0273\u0275\u029b\u02a1\u02a3\u02b5\u02ba"+
		"\u02c2\u02ce\u02d0\u02d9\u02db\u0303\u0306\u030e\u0311\u0317\u031c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}