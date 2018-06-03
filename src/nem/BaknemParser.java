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
		FACTORIAL=14, GENERAL_OMISSION=15, LGRP=16, ENLGRP=17, RGRP=18, ENRGRP=19, 
		BINOP=20, BINOP_PREC=21, INT=22, REAL=23, CMPR=24, SUBSUB=25, SUBSUP=26, 
		SUB=27, SUPSUB=28, SUPSUP=29, SUP=30, MODIF=31, MODOVER=32, MODUNDER=33, 
		TERM=34, SFRAC=35, FRAC_SLASH=36, ESFRAC=37, CFRAC=38, CSLASH=39, ECFRAC=40, 
		HCFRAC=41, HCSLASH=42, EHCFRAC=43, SMIXFR=44, EMIXFR=45, SQRT=46, SQRT1=47, 
		SQRT2=48, SQRT3=49, IRAD1=50, IRAD2=51, IRAD3=52, RTRM1=53, RTRM2=54, 
		RTRM3=55, ARROW=56, SPACE=57, NEWLINE=58, INFINITY=59, INTEGRAL=60, CHEM_ELEMENT=61, 
		POSS_CH_ELEMENT=62, CHM_ARROW=63, LATIN_LETTER=64, FUN_ABBR=65, FUNCTION_NAME=66, 
		TRAIL_FUN_ABBR=67, LC_ROMAN_NUM_SEQ=68, SUPER_SUP=69, SUPER_SUB=70, INTxGREEK=71, 
		SUPER_SUP_SUB=72, SUPER_SUB_SUB=73, SUPER_SUP_SUP=74, SUPER_SUB_SUP=75, 
		HOLLOW_DOT=76, BFPLUS=77, PLUS_MINUS=78, BFMINUS=79, MINUS_PLUS=80;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_header3 = 2, RULE_funWithArg = 3, RULE_row = 4, 
		RULE_matrix = 5, RULE_space = 6, RULE_postpunc = 7, RULE_exprs = 8, RULE_nexpr = 9, 
		RULE_expr = 10, RULE_nlayexpr = 11, RULE_layexpr = 12, RULE_nor = 13, 
		RULE_nor1 = 14, RULE_nor2 = 15, RULE_nor3 = 16, RULE_nom = 17, RULE_nof = 18, 
		RULE_nofc = 19, RULE_nofch = 20, RULE_mfrac = 21, RULE_mmfrac = 22, RULE_mmmfrac = 23, 
		RULE_rindex = 24, RULE_sqrt = 25, RULE_irad = 26, RULE_sqrt1 = 27, RULE_irad1 = 28, 
		RULE_sqrt2 = 29, RULE_irad2 = 30, RULE_sqrt3 = 31, RULE_irad3 = 32, RULE_nomod = 33, 
		RULE_begmod = 34, RULE_munder = 35, RULE_mover = 36, RULE_mundov = 37, 
		RULE_endmod = 38, RULE_varXfunabb = 39, RULE_funabb = 40, RULE_func = 41, 
		RULE_lgrp = 42, RULE_rgrp = 43, RULE_binop = 44, RULE_binop1 = 45, RULE_cmpr = 46, 
		RULE_singleLet = 47, RULE_var = 48, RULE_greeks = 49, RULE_specsym = 50, 
		RULE_number = 51, RULE_numsub = 52, RULE_chelement = 53, RULE_chnumsub = 54, 
		RULE_chradical = 55, RULE_chformula = 56, RULE_sup2 = 57, RULE_sup2b = 58, 
		RULE_sup22 = 59, RULE_sub2 = 60, RULE_sub2p = 61, RULE_sub22 = 62, RULE_base = 63, 
		RULE_script = 64, RULE_subscript = 65, RULE_supscript = 66, RULE_msub = 67, 
		RULE_msup = 68, RULE_msubsup = 69, RULE_mscript = 70;
	public static final String[] ruleNames = {
		"prog", "stat", "header3", "funWithArg", "row", "matrix", "space", "postpunc", 
		"exprs", "nexpr", "expr", "nlayexpr", "layexpr", "nor", "nor1", "nor2", 
		"nor3", "nom", "nof", "nofc", "nofch", "mfrac", "mmfrac", "mmmfrac", "rindex", 
		"sqrt", "irad", "sqrt1", "irad1", "sqrt2", "irad2", "sqrt3", "irad3", 
		"nomod", "begmod", "munder", "mover", "mundov", "endmod", "varXfunabb", 
		"funabb", "func", "lgrp", "rgrp", "binop", "binop1", "cmpr", "singleLet", 
		"var", "greeks", "specsym", "number", "numsub", "chelement", "chnumsub", 
		"chradical", "chformula", "sup2", "sup2b", "sup22", "sub2", "sub2p", "sub22", 
		"base", "script", "subscript", "supscript", "msub", "msup", "msubsup", 
		"mscript"
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
		"INTEGRAL", "CHEM_ELEMENT", "POSS_CH_ELEMENT", "CHM_ARROW", "LATIN_LETTER", 
		"FUN_ABBR", "FUNCTION_NAME", "TRAIL_FUN_ABBR", "LC_ROMAN_NUM_SEQ", "SUPER_SUP", 
		"SUPER_SUB", "INTxGREEK", "SUPER_SUP_SUB", "SUPER_SUB_SUB", "SUPER_SUP_SUP", 
		"SUPER_SUB_SUP", "HOLLOW_DOT", "BFPLUS", "PLUS_MINUS", "BFMINUS", "MINUS_PLUS"
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
		public TerminalNode EOF() { return getToken(BaknemParser.EOF, 0); }
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
			setState(143); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(142);
				stat();
				}
				}
				setState(145); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LC_ID) | (1L << ID) | (1L << MIXID) | (1L << UC_ID) | (1L << GREEK_LETTER) | (1L << MISCALPHD4) | (1L << LGRP) | (1L << ENLGRP) | (1L << INT) | (1L << REAL) | (1L << CMPR) | (1L << MODIF) | (1L << MODOVER) | (1L << SFRAC) | (1L << CFRAC) | (1L << HCFRAC) | (1L << SQRT) | (1L << SPACE) | (1L << NEWLINE) | (1L << INFINITY) | (1L << INTEGRAL) | (1L << CHEM_ELEMENT) | (1L << POSS_CH_ELEMENT))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (FUN_ABBR - 65)) | (1L << (TRAIL_FUN_ABBR - 65)) | (1L << (INTxGREEK - 65)))) != 0) );
			setState(147);
			match(EOF);
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
		public MatrixContext matrix() {
			return getRuleContext(MatrixContext.class,0);
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
			setState(178);
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
			case CMPR:
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
			case INTxGREEK:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(149);
						space();
						}
						} 
					}
					setState(154);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				setState(155);
				exprs();
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(157); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(156);
								space();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(159); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(161);
						exprs();
						}
						} 
					}
					setState(167);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(168);
					space();
					}
					}
					setState(173);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(174);
				match(NEWLINE);
				}
				break;
			case ENLGRP:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				matrix();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
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
			setState(180);
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
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODIF:
				{
				setState(182);
				match(MODIF);
				setState(183);
				funabb();
				{
				setState(184);
				_la = _input.LA(1);
				if ( !(_la==MODOVER || _la==MODUNDER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(185);
				endmod();
				}
				}
				break;
			case FUN_ABBR:
			case TRAIL_FUN_ABBR:
				{
				setState(189);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FUN_ABBR:
					{
					setState(187);
					funabb();
					}
					break;
				case TRAIL_FUN_ABBR:
					{
					setState(188);
					varXfunabb();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(195);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SUB:
					{
					setState(191);
					match(SUB);
					setState(192);
					script();
					}
					break;
				case SUP:
					{
					setState(193);
					match(SUP);
					setState(194);
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
			setState(199);
			space();
			setState(200);
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

	public static class RowContext extends ParserRuleContext {
		public TerminalNode ENLGRP() { return getToken(BaknemParser.ENLGRP, 0); }
		public List<LayexprContext> layexpr() {
			return getRuleContexts(LayexprContext.class);
		}
		public LayexprContext layexpr(int i) {
			return getRuleContext(LayexprContext.class,i);
		}
		public TerminalNode ENRGRP() { return getToken(BaknemParser.ENRGRP, 0); }
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitRow(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_row);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(ENLGRP);
			setState(203);
			layexpr(0);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(205); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(204);
						space();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(207); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(209);
				layexpr(0);
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
			match(ENRGRP);
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

	public static class MatrixContext extends ParserRuleContext {
		public List<RowContext> row() {
			return getRuleContexts(RowContext.class);
		}
		public RowContext row(int i) {
			return getRuleContext(RowContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(BaknemParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(BaknemParser.NEWLINE, i);
		}
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public MatrixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterMatrix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitMatrix(this);
		}
	}

	public final MatrixContext matrix() throws RecognitionException {
		MatrixContext _localctx = new MatrixContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_matrix);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(227); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(218);
					row();
					{
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SPACE) {
						{
						{
						setState(219);
						space();
						}
						}
						setState(224);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(225);
					match(NEWLINE);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(229); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		enterRule(_localctx, 12, RULE_space);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
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
		enterRule(_localctx, 14, RULE_postpunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
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
		enterRule(_localctx, 16, RULE_exprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(235);
			layexpr(0);
			}
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PI_PUNC) {
				{
				setState(236);
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

	public static class NexprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Binop1Context binop1() {
			return getRuleContext(Binop1Context.class,0);
		}
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
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
		public NexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterNexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitNexpr(this);
		}
	}

	public final NexprContext nexpr() throws RecognitionException {
		NexprContext _localctx = new NexprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_nexpr);
		try {
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				expr(0);
				setState(240);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				expr(0);
				setState(243);
				binop1();
				setState(244);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(246);
				expr(0);
				setState(247);
				binop();
				setState(248);
				expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(250);
				numsub();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(251);
				chnumsub();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(252);
				var();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(253);
				specsym();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(254);
				number();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(255);
				chelement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(256);
				chformula();
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
		public CmprContext cmpr() {
			return getRuleContext(CmprContext.class,0);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(260);
				lgrp();
				setState(261);
				expr(0);
				setState(262);
				rgrp();
				}
				break;
			case 2:
				{
				setState(264);
				cmpr();
				}
				break;
			case 3:
				{
				setState(265);
				numsub();
				}
				break;
			case 4:
				{
				setState(266);
				chnumsub();
				}
				break;
			case 5:
				{
				setState(267);
				var();
				}
				break;
			case 6:
				{
				setState(268);
				specsym();
				}
				break;
			case 7:
				{
				setState(269);
				number();
				}
				break;
			case 8:
				{
				setState(270);
				chelement();
				}
				break;
			case 9:
				{
				setState(271);
				chformula();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(291);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(289);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(274);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(275);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(276);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(277);
						binop1();
						setState(278);
						expr(12);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(280);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(281);
						binop();
						setState(282);
						expr(11);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(284);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(285);
						cmpr();
						setState(287);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
						case 1:
							{
							setState(286);
							expr(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(293);
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

	public static class NlayexprContext extends ParserRuleContext {
		public List<LayexprContext> layexpr() {
			return getRuleContexts(LayexprContext.class);
		}
		public LayexprContext layexpr(int i) {
			return getRuleContext(LayexprContext.class,i);
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
		public NexprContext nexpr() {
			return getRuleContext(NexprContext.class,0);
		}
		public FunWithArgContext funWithArg() {
			return getRuleContext(FunWithArgContext.class,0);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public NlayexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nlayexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).enterNlayexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaknemParserListener ) ((BaknemParserListener)listener).exitNlayexpr(this);
		}
	}

	public final NlayexprContext nlayexpr() throws RecognitionException {
		NlayexprContext _localctx = new NlayexprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_nlayexpr);
		int _la;
		try {
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				layexpr(0);
				setState(295);
				layexpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				layexpr(0);
				setState(298);
				binop1();
				setState(299);
				layexpr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(301);
				layexpr(0);
				setState(302);
				binop();
				setState(303);
				layexpr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(305);
				layexpr(0);
				setState(306);
				cmpr();
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LC_ID) | (1L << ID) | (1L << MIXID) | (1L << UC_ID) | (1L << GREEK_LETTER) | (1L << MISCALPHD4) | (1L << LGRP) | (1L << INT) | (1L << REAL) | (1L << CMPR) | (1L << MODIF) | (1L << MODOVER) | (1L << SFRAC) | (1L << CFRAC) | (1L << HCFRAC) | (1L << SQRT) | (1L << SPACE) | (1L << INFINITY) | (1L << INTEGRAL) | (1L << CHEM_ELEMENT) | (1L << POSS_CH_ELEMENT))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (FUN_ABBR - 65)) | (1L << (TRAIL_FUN_ABBR - 65)) | (1L << (INTxGREEK - 65)))) != 0)) {
					{
					setState(307);
					layexpr(0);
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(310);
				mfrac();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(311);
				mmfrac();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(312);
				mmmfrac();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(313);
				munder();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(314);
				mover();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(315);
				mundov();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(316);
				mscript();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(317);
				sqrt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(318);
				irad();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(319);
				nexpr();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(320);
				funWithArg();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(321);
				func();
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
		public FunWithArgContext funWithArg() {
			return getRuleContext(FunWithArgContext.class,0);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_layexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(325);
				lgrp();
				setState(326);
				layexpr(0);
				setState(327);
				rgrp();
				}
				break;
			case 2:
				{
				setState(329);
				mfrac();
				}
				break;
			case 3:
				{
				setState(330);
				mmfrac();
				}
				break;
			case 4:
				{
				setState(331);
				mmmfrac();
				}
				break;
			case 5:
				{
				setState(332);
				munder();
				}
				break;
			case 6:
				{
				setState(333);
				mover();
				}
				break;
			case 7:
				{
				setState(334);
				mundov();
				}
				break;
			case 8:
				{
				setState(335);
				mscript();
				}
				break;
			case 9:
				{
				setState(336);
				sqrt();
				}
				break;
			case 10:
				{
				setState(337);
				irad();
				}
				break;
			case 11:
				{
				setState(338);
				expr(0);
				}
				break;
			case 12:
				{
				setState(339);
				funWithArg();
				}
				break;
			case 13:
				{
				setState(340);
				func();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(360);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(358);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new LayexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_layexpr);
						setState(343);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(344);
						layexpr(18);
						}
						break;
					case 2:
						{
						_localctx = new LayexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_layexpr);
						setState(345);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(346);
						binop1();
						setState(347);
						layexpr(16);
						}
						break;
					case 3:
						{
						_localctx = new LayexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_layexpr);
						setState(349);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(350);
						binop();
						setState(351);
						layexpr(15);
						}
						break;
					case 4:
						{
						_localctx = new LayexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_layexpr);
						setState(353);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(354);
						cmpr();
						setState(356);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
						case 1:
							{
							setState(355);
							layexpr(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(362);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_nor, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(364);
				lgrp();
				setState(365);
				nor(0);
				setState(366);
				rgrp();
				}
				break;
			case 2:
				{
				setState(368);
				mfrac();
				}
				break;
			case 3:
				{
				setState(369);
				mmfrac();
				}
				break;
			case 4:
				{
				setState(370);
				mmmfrac();
				}
				break;
			case 5:
				{
				setState(371);
				munder();
				}
				break;
			case 6:
				{
				setState(372);
				mover();
				}
				break;
			case 7:
				{
				setState(373);
				mundov();
				}
				break;
			case 8:
				{
				setState(374);
				mscript();
				}
				break;
			case 9:
				{
				setState(375);
				irad1();
				}
				break;
			case 10:
				{
				setState(376);
				sqrt1();
				}
				break;
			case 11:
				{
				setState(377);
				expr(0);
				}
				break;
			case 12:
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
						_localctx = new NorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor);
						setState(381);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(382);
						nor(15);
						}
						break;
					case 2:
						{
						_localctx = new NorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor);
						setState(383);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(384);
						binop1();
						setState(385);
						nor(14);
						}
						break;
					case 3:
						{
						_localctx = new NorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor);
						setState(387);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(388);
						binop();
						setState(389);
						nor(13);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_nor1, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(397);
				lgrp();
				setState(398);
				nor1(0);
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
				mscript();
				}
				break;
			case 9:
				{
				setState(408);
				irad2();
				}
				break;
			case 10:
				{
				setState(409);
				sqrt2();
				}
				break;
			case 11:
				{
				setState(410);
				expr(0);
				}
				break;
			case 12:
				{
				setState(411);
				func();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(426);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(424);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new Nor1Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor1);
						setState(414);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(415);
						nor1(15);
						}
						break;
					case 2:
						{
						_localctx = new Nor1Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor1);
						setState(416);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(417);
						binop1();
						setState(418);
						nor1(14);
						}
						break;
					case 3:
						{
						_localctx = new Nor1Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor1);
						setState(420);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(421);
						binop();
						setState(422);
						nor1(13);
						}
						break;
					}
					} 
				}
				setState(428);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_nor2, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(430);
				lgrp();
				setState(431);
				nor2(0);
				setState(432);
				rgrp();
				}
				break;
			case 2:
				{
				setState(434);
				mfrac();
				}
				break;
			case 3:
				{
				setState(435);
				mmfrac();
				}
				break;
			case 4:
				{
				setState(436);
				mmmfrac();
				}
				break;
			case 5:
				{
				setState(437);
				munder();
				}
				break;
			case 6:
				{
				setState(438);
				mover();
				}
				break;
			case 7:
				{
				setState(439);
				mundov();
				}
				break;
			case 8:
				{
				setState(440);
				mscript();
				}
				break;
			case 9:
				{
				setState(441);
				irad3();
				}
				break;
			case 10:
				{
				setState(442);
				sqrt3();
				}
				break;
			case 11:
				{
				setState(443);
				expr(0);
				}
				break;
			case 12:
				{
				setState(444);
				func();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(459);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(457);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new Nor2Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor2);
						setState(447);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(448);
						nor2(15);
						}
						break;
					case 2:
						{
						_localctx = new Nor2Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor2);
						setState(449);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(450);
						binop1();
						setState(451);
						nor2(14);
						}
						break;
					case 3:
						{
						_localctx = new Nor2Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor2);
						setState(453);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(454);
						binop();
						setState(455);
						nor2(13);
						}
						break;
					}
					} 
				}
				setState(461);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_nor3, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(463);
				lgrp();
				setState(464);
				nor3(0);
				setState(465);
				rgrp();
				}
				break;
			case 2:
				{
				setState(467);
				mfrac();
				}
				break;
			case 3:
				{
				setState(468);
				mmfrac();
				}
				break;
			case 4:
				{
				setState(469);
				mmmfrac();
				}
				break;
			case 5:
				{
				setState(470);
				munder();
				}
				break;
			case 6:
				{
				setState(471);
				mover();
				}
				break;
			case 7:
				{
				setState(472);
				mundov();
				}
				break;
			case 8:
				{
				setState(473);
				mscript();
				}
				break;
			case 9:
				{
				setState(474);
				expr(0);
				}
				break;
			case 10:
				{
				setState(475);
				func();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(490);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(488);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						_localctx = new Nor3Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor3);
						setState(478);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(479);
						nor3(13);
						}
						break;
					case 2:
						{
						_localctx = new Nor3Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor3);
						setState(480);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(481);
						binop1();
						setState(482);
						nor3(12);
						}
						break;
					case 3:
						{
						_localctx = new Nor3Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nor3);
						setState(484);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(485);
						binop();
						setState(486);
						nor3(11);
						}
						break;
					}
					} 
				}
				setState(492);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_nom, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(494);
				lgrp();
				setState(495);
				nom(0);
				setState(496);
				rgrp();
				}
				break;
			case 2:
				{
				setState(498);
				mfrac();
				}
				break;
			case 3:
				{
				setState(499);
				mmfrac();
				}
				break;
			case 4:
				{
				setState(500);
				mmmfrac();
				}
				break;
			case 5:
				{
				setState(501);
				munder();
				}
				break;
			case 6:
				{
				setState(502);
				mover();
				}
				break;
			case 7:
				{
				setState(503);
				mundov();
				}
				break;
			case 8:
				{
				setState(504);
				expr(0);
				}
				break;
			case 9:
				{
				setState(505);
				funWithArg();
				}
				break;
			case 10:
				{
				setState(506);
				sqrt();
				}
				break;
			case 11:
				{
				setState(507);
				irad();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(522);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(520);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						_localctx = new NomContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nom);
						setState(510);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(511);
						nom(14);
						}
						break;
					case 2:
						{
						_localctx = new NomContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nom);
						setState(512);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(513);
						binop1();
						setState(514);
						nom(13);
						}
						break;
					case 3:
						{
						_localctx = new NomContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nom);
						setState(516);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(517);
						binop();
						setState(518);
						nom(12);
						}
						break;
					}
					} 
				}
				setState(524);
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
		public FunWithArgContext funWithArg() {
			return getRuleContext(FunWithArgContext.class,0);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_nof, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(526);
				lgrp();
				setState(527);
				nof(0);
				setState(528);
				rgrp();
				}
				break;
			case 2:
				{
				setState(530);
				munder();
				}
				break;
			case 3:
				{
				setState(531);
				mover();
				}
				break;
			case 4:
				{
				setState(532);
				mundov();
				}
				break;
			case 5:
				{
				setState(533);
				mscript();
				}
				break;
			case 6:
				{
				setState(534);
				expr(0);
				}
				break;
			case 7:
				{
				setState(535);
				funWithArg();
				}
				break;
			case 8:
				{
				setState(536);
				func();
				}
				break;
			case 9:
				{
				setState(537);
				sqrt();
				}
				break;
			case 10:
				{
				setState(538);
				irad();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(557);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(555);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						_localctx = new NofContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nof);
						setState(541);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(542);
						nof(14);
						}
						break;
					case 2:
						{
						_localctx = new NofContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nof);
						setState(543);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(544);
						binop1();
						setState(545);
						nof(13);
						}
						break;
					case 3:
						{
						_localctx = new NofContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nof);
						setState(547);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(548);
						binop();
						setState(549);
						nof(12);
						}
						break;
					case 4:
						{
						_localctx = new NofContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nof);
						setState(551);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(552);
						cmpr();
						setState(553);
						nof(11);
						}
						break;
					}
					} 
				}
				setState(559);
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_nofc, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(561);
				lgrp();
				setState(562);
				nofc(0);
				setState(563);
				rgrp();
				}
				break;
			case 2:
				{
				setState(565);
				munder();
				}
				break;
			case 3:
				{
				setState(566);
				mover();
				}
				break;
			case 4:
				{
				setState(567);
				mundov();
				}
				break;
			case 5:
				{
				setState(568);
				mscript();
				}
				break;
			case 6:
				{
				setState(569);
				expr(0);
				}
				break;
			case 7:
				{
				setState(570);
				func();
				}
				break;
			case 8:
				{
				setState(571);
				mfrac();
				}
				break;
			case 9:
				{
				setState(572);
				sqrt();
				}
				break;
			case 10:
				{
				setState(573);
				irad();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(592);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(590);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
					case 1:
						{
						_localctx = new NofcContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nofc);
						setState(576);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(577);
						nofc(14);
						}
						break;
					case 2:
						{
						_localctx = new NofcContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nofc);
						setState(578);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(579);
						binop();
						setState(580);
						nofc(12);
						}
						break;
					case 3:
						{
						_localctx = new NofcContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nofc);
						setState(582);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(583);
						cmpr();
						setState(584);
						nofc(11);
						}
						break;
					case 4:
						{
						_localctx = new NofcContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nofc);
						setState(586);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(587);
						binop1();
						setState(588);
						nof(0);
						}
						break;
					}
					} 
				}
				setState(594);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_nofch, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(596);
				lgrp();
				setState(597);
				nofch(0);
				setState(598);
				rgrp();
				}
				break;
			case 2:
				{
				setState(600);
				munder();
				}
				break;
			case 3:
				{
				setState(601);
				mover();
				}
				break;
			case 4:
				{
				setState(602);
				mundov();
				}
				break;
			case 5:
				{
				setState(603);
				mscript();
				}
				break;
			case 6:
				{
				setState(604);
				expr(0);
				}
				break;
			case 7:
				{
				setState(605);
				func();
				}
				break;
			case 8:
				{
				setState(606);
				mfrac();
				}
				break;
			case 9:
				{
				setState(607);
				mmfrac();
				}
				break;
			case 10:
				{
				setState(608);
				sqrt();
				}
				break;
			case 11:
				{
				setState(609);
				irad();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(628);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(626);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						_localctx = new NofchContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nofch);
						setState(612);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(613);
						nofch(15);
						}
						break;
					case 2:
						{
						_localctx = new NofchContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nofch);
						setState(614);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(615);
						binop1();
						setState(616);
						nofch(14);
						}
						break;
					case 3:
						{
						_localctx = new NofchContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nofch);
						setState(618);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(619);
						binop();
						setState(620);
						nofch(13);
						}
						break;
					case 4:
						{
						_localctx = new NofchContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nofch);
						setState(622);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(623);
						cmpr();
						setState(624);
						nofch(12);
						}
						break;
					}
					} 
				}
				setState(630);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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
		enterRule(_localctx, 42, RULE_mfrac);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			match(SFRAC);
			setState(632);
			nof(0);
			setState(633);
			match(FRAC_SLASH);
			setState(634);
			nof(0);
			setState(635);
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
		enterRule(_localctx, 44, RULE_mmfrac);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			match(CFRAC);
			setState(638);
			nofc(0);
			setState(639);
			match(CSLASH);
			setState(640);
			nofc(0);
			setState(641);
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
		enterRule(_localctx, 46, RULE_mmmfrac);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			match(HCFRAC);
			setState(644);
			nofch(0);
			setState(645);
			match(HCSLASH);
			setState(646);
			nofch(0);
			setState(647);
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
		enterRule(_localctx, 48, RULE_rindex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
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
		enterRule(_localctx, 50, RULE_sqrt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			match(SQRT);
			setState(652);
			nor(0);
			setState(653);
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
		enterRule(_localctx, 52, RULE_irad);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			match(MODOVER);
			setState(656);
			rindex();
			setState(657);
			match(SQRT);
			setState(658);
			nor(0);
			setState(659);
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
		enterRule(_localctx, 54, RULE_sqrt1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			match(SQRT1);
			setState(662);
			nor1(0);
			setState(663);
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
		enterRule(_localctx, 56, RULE_irad1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			match(IRAD1);
			setState(666);
			rindex();
			setState(667);
			match(SQRT);
			setState(668);
			nor1(0);
			setState(669);
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
		enterRule(_localctx, 58, RULE_sqrt2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			match(SQRT2);
			setState(672);
			nor2(0);
			setState(673);
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
		enterRule(_localctx, 60, RULE_irad2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			match(IRAD2);
			setState(676);
			rindex();
			setState(677);
			match(SQRT);
			setState(678);
			nor2(0);
			setState(679);
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
		enterRule(_localctx, 62, RULE_sqrt3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			match(SQRT3);
			setState(682);
			nor3(0);
			setState(683);
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
		enterRule(_localctx, 64, RULE_irad3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			match(IRAD3);
			setState(686);
			rindex();
			setState(687);
			match(SQRT);
			setState(688);
			nor3(0);
			setState(689);
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
		public CmprContext cmpr() {
			return getRuleContext(CmprContext.class,0);
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
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_nomod, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(692);
				lgrp();
				setState(693);
				nomod(0);
				setState(694);
				rgrp();
				}
				break;
			case 2:
				{
				setState(696);
				cmpr();
				}
				break;
			case 3:
				{
				setState(697);
				mfrac();
				}
				break;
			case 4:
				{
				setState(698);
				mmfrac();
				}
				break;
			case 5:
				{
				setState(699);
				mmmfrac();
				}
				break;
			case 6:
				{
				setState(700);
				mscript();
				}
				break;
			case 7:
				{
				setState(701);
				irad();
				}
				break;
			case 8:
				{
				setState(702);
				sqrt();
				}
				break;
			case 9:
				{
				setState(703);
				expr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(722);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(720);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
					case 1:
						{
						_localctx = new NomodContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nomod);
						setState(706);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(707);
						nomod(13);
						}
						break;
					case 2:
						{
						_localctx = new NomodContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nomod);
						setState(708);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(709);
						binop1();
						setState(710);
						nomod(12);
						}
						break;
					case 3:
						{
						_localctx = new NomodContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nomod);
						setState(712);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(713);
						binop();
						setState(714);
						nomod(11);
						}
						break;
					case 4:
						{
						_localctx = new NomodContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nomod);
						setState(716);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(717);
						cmpr();
						setState(718);
						nomod(9);
						}
						break;
					}
					} 
				}
				setState(724);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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
		enterRule(_localctx, 68, RULE_begmod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
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
		enterRule(_localctx, 70, RULE_munder);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
			match(MODIF);
			setState(728);
			begmod();
			setState(729);
			match(MODUNDER);
			setState(730);
			endmod();
			setState(731);
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
		enterRule(_localctx, 72, RULE_mover);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
			match(MODIF);
			setState(734);
			begmod();
			setState(735);
			match(MODOVER);
			setState(736);
			endmod();
			setState(737);
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
		enterRule(_localctx, 74, RULE_mundov);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
			match(MODIF);
			setState(740);
			begmod();
			setState(741);
			match(MODUNDER);
			setState(742);
			endmod();
			setState(743);
			match(MODOVER);
			setState(744);
			endmod();
			setState(745);
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
		enterRule(_localctx, 76, RULE_endmod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
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
		enterRule(_localctx, 78, RULE_varXfunabb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
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
		enterRule(_localctx, 80, RULE_funabb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
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
		public TerminalNode TERM() { return getToken(BaknemParser.TERM, 0); }
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
		enterRule(_localctx, 82, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODIF:
				{
				setState(753);
				match(MODIF);
				setState(754);
				funabb();
				{
				setState(755);
				_la = _input.LA(1);
				if ( !(_la==MODOVER || _la==MODUNDER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(756);
				endmod();
				setState(757);
				match(TERM);
				}
				}
				break;
			case FUN_ABBR:
			case TRAIL_FUN_ABBR:
				{
				setState(761);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FUN_ABBR:
					{
					setState(759);
					funabb();
					}
					break;
				case TRAIL_FUN_ABBR:
					{
					setState(760);
					varXfunabb();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(767);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(763);
					match(SUB);
					setState(764);
					script();
					}
					break;
				case 2:
					{
					setState(765);
					match(SUP);
					setState(766);
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
		enterRule(_localctx, 84, RULE_lgrp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
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
		enterRule(_localctx, 86, RULE_rgrp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
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
		enterRule(_localctx, 88, RULE_binop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
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
		enterRule(_localctx, 90, RULE_binop1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
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
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public TerminalNode ARROW() { return getToken(BaknemParser.ARROW, 0); }
		public MsubContext msub() {
			return getRuleContext(MsubContext.class,0);
		}
		public LayexprContext layexpr() {
			return getRuleContext(LayexprContext.class,0);
		}
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
		enterRule(_localctx, 92, RULE_cmpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CMPR:
				{
				setState(779);
				match(CMPR);
				}
				break;
			case SPACE:
				{
				setState(780);
				space();
				setState(781);
				match(ARROW);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(790);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(785);
				space();
				setState(788);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(786);
					msub();
					}
					break;
				case 2:
					{
					setState(787);
					layexpr(0);
					}
					break;
				}
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
		enterRule(_localctx, 94, RULE_singleLet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(792);
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
		enterRule(_localctx, 96, RULE_var);
		try {
			int _alt;
			setState(803);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case POSS_CH_ELEMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(795); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(794);
						singleLet();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(797); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case LC_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(799);
				match(LC_ID);
				}
				break;
			case UC_ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(800);
				match(UC_ID);
				}
				break;
			case MIXID:
				enterOuterAlt(_localctx, 4);
				{
				setState(801);
				match(MIXID);
				}
				break;
			case GREEK_LETTER:
				enterOuterAlt(_localctx, 5);
				{
				setState(802);
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
		enterRule(_localctx, 98, RULE_greeks);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(806); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(805);
					match(GREEK_LETTER);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(808); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
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
		enterRule(_localctx, 100, RULE_specsym);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
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
		public TerminalNode INTxGREEK() { return getToken(BaknemParser.INTxGREEK, 0); }
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
		enterRule(_localctx, 102, RULE_number);
		int _la;
		try {
			int _alt;
			setState(833);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(812);
				match(INT);
				setState(816);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(813);
						match(INT);
						}
						} 
					}
					setState(818);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(822);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==INT) {
					{
					{
					setState(819);
					match(INT);
					}
					}
					setState(824);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(825);
				match(REAL);
				setState(829);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(826);
						match(INT);
						}
						} 
					}
					setState(831);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(832);
				match(INTxGREEK);
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
		public TerminalNode MODIF() { return getToken(BaknemParser.MODIF, 0); }
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
		enterRule(_localctx, 104, RULE_numsub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LC_ID:
			case ID:
			case MIXID:
			case UC_ID:
			case GREEK_LETTER:
			case POSS_CH_ELEMENT:
				{
				setState(835);
				var();
				}
				break;
			case FUN_ABBR:
				{
				setState(836);
				funabb();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(839);
			number();
			setState(841);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(840);
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
		enterRule(_localctx, 106, RULE_chelement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(843);
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
		public TerminalNode MODIF() { return getToken(BaknemParser.MODIF, 0); }
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
		enterRule(_localctx, 108, RULE_chnumsub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
			chelement();
			setState(846);
			number();
			setState(848);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(847);
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
		enterRule(_localctx, 110, RULE_chradical);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
			match(LGRP);
			setState(853); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(853);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(851);
					chelement();
					}
					break;
				case 2:
					{
					setState(852);
					chnumsub();
					}
					break;
				}
				}
				setState(855); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CHEM_ELEMENT || _la==POSS_CH_ELEMENT );
			setState(857);
			match(RGRP);
			setState(858);
			match(SUB);
			setState(859);
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
		enterRule(_localctx, 112, RULE_chformula);
		try {
			int _alt;
			setState(874);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(861);
				chnumsub();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(865);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(862);
					chelement();
					}
					break;
				case 2:
					{
					setState(863);
					chnumsub();
					}
					break;
				case 3:
					{
					setState(864);
					chradical();
					}
					break;
				}
				setState(870); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(870);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
						case 1:
							{
							setState(867);
							chelement();
							}
							break;
						case 2:
							{
							setState(868);
							chnumsub();
							}
							break;
						case 3:
							{
							setState(869);
							chradical();
							}
							break;
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(872); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
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
		enterRule(_localctx, 114, RULE_sup2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(876);
			match(SUPSUP);
			}
			setState(877);
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
		enterRule(_localctx, 116, RULE_sup2b);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(879);
			match(SUPSUB);
			}
			setState(880);
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
		enterRule(_localctx, 118, RULE_sup22);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(882);
			match(SUPSUB);
			}
			setState(883);
			script();
			{
			setState(884);
			match(SUPSUP);
			}
			setState(885);
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
		enterRule(_localctx, 120, RULE_sub2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(887);
			match(SUBSUB);
			}
			setState(888);
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
		enterRule(_localctx, 122, RULE_sub2p);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(890);
			match(SUBSUP);
			}
			setState(891);
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
		enterRule(_localctx, 124, RULE_sub22);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(893);
			match(SUBSUB);
			}
			setState(894);
			script();
			{
			setState(895);
			match(SUBSUP);
			}
			setState(896);
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
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public SpecsymContext specsym() {
			return getRuleContext(SpecsymContext.class,0);
		}
		public MfracContext mfrac() {
			return getRuleContext(MfracContext.class,0);
		}
		public NexprContext nexpr() {
			return getRuleContext(NexprContext.class,0);
		}
		public NlayexprContext nlayexpr() {
			return getRuleContext(NlayexprContext.class,0);
		}
		public List<LgrpContext> lgrp() {
			return getRuleContexts(LgrpContext.class);
		}
		public LgrpContext lgrp(int i) {
			return getRuleContext(LgrpContext.class,i);
		}
		public List<RgrpContext> rgrp() {
			return getRuleContexts(RgrpContext.class);
		}
		public RgrpContext rgrp(int i) {
			return getRuleContext(RgrpContext.class,i);
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
		enterRule(_localctx, 126, RULE_base);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(924);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(898);
				var();
				}
				break;
			case 2:
				{
				setState(899);
				number();
				}
				break;
			case 3:
				{
				setState(900);
				specsym();
				}
				break;
			case 4:
				{
				setState(901);
				mfrac();
				}
				break;
			case 5:
				{
				setState(903); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(902);
						lgrp();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(905); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(907);
				nexpr();
				setState(909); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(908);
					rgrp();
					}
					}
					setState(911); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RGRP );
				}
				break;
			case 6:
				{
				setState(914); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(913);
						lgrp();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(916); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(918);
				nlayexpr();
				setState(920); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(919);
					rgrp();
					}
					}
					setState(922); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RGRP );
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
		enterRule(_localctx, 128, RULE_script);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(926);
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
		enterRule(_localctx, 130, RULE_subscript);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(928);
			match(SUB);
			setState(929);
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
		enterRule(_localctx, 132, RULE_supscript);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(931);
			match(SUP);
			setState(932);
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
		enterRule(_localctx, 134, RULE_msub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(934);
			base();
			setState(935);
			match(SUB);
			setState(936);
			script();
			setState(940);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(937);
				sub2();
				}
				break;
			case 2:
				{
				setState(938);
				sub2p();
				}
				break;
			case 3:
				{
				setState(939);
				sub22();
				}
				break;
			}
			setState(943);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(942);
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
		enterRule(_localctx, 136, RULE_msup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(945);
			base();
			setState(946);
			match(SUP);
			setState(947);
			script();
			setState(951);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(948);
				sup2();
				}
				break;
			case 2:
				{
				setState(949);
				sup2b();
				}
				break;
			case 3:
				{
				setState(950);
				sup22();
				}
				break;
			}
			setState(954);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(953);
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
		enterRule(_localctx, 138, RULE_msubsup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(956);
			base();
			setState(957);
			subscript();
			setState(958);
			supscript();
			setState(960);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(959);
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
		enterRule(_localctx, 140, RULE_mscript);
		try {
			setState(965);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(962);
				msub();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(963);
				msup();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(964);
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
		case 10:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 12:
			return layexpr_sempred((LayexprContext)_localctx, predIndex);
		case 13:
			return nor_sempred((NorContext)_localctx, predIndex);
		case 14:
			return nor1_sempred((Nor1Context)_localctx, predIndex);
		case 15:
			return nor2_sempred((Nor2Context)_localctx, predIndex);
		case 16:
			return nor3_sempred((Nor3Context)_localctx, predIndex);
		case 17:
			return nom_sempred((NomContext)_localctx, predIndex);
		case 18:
			return nof_sempred((NofContext)_localctx, predIndex);
		case 19:
			return nofc_sempred((NofcContext)_localctx, predIndex);
		case 20:
			return nofch_sempred((NofchContext)_localctx, predIndex);
		case 33:
			return nomod_sempred((NomodContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		}
		return true;
	}
	private boolean layexpr_sempred(LayexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 17);
		case 5:
			return precpred(_ctx, 15);
		case 6:
			return precpred(_ctx, 14);
		case 7:
			return precpred(_ctx, 13);
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
			return precpred(_ctx, 13);
		case 21:
			return precpred(_ctx, 12);
		case 22:
			return precpred(_ctx, 11);
		}
		return true;
	}
	private boolean nof_sempred(NofContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return precpred(_ctx, 13);
		case 24:
			return precpred(_ctx, 12);
		case 25:
			return precpred(_ctx, 11);
		case 26:
			return precpred(_ctx, 10);
		}
		return true;
	}
	private boolean nofc_sempred(NofcContext _localctx, int predIndex) {
		switch (predIndex) {
		case 27:
			return precpred(_ctx, 13);
		case 28:
			return precpred(_ctx, 11);
		case 29:
			return precpred(_ctx, 10);
		case 30:
			return precpred(_ctx, 12);
		}
		return true;
	}
	private boolean nofch_sempred(NofchContext _localctx, int predIndex) {
		switch (predIndex) {
		case 31:
			return precpred(_ctx, 14);
		case 32:
			return precpred(_ctx, 13);
		case 33:
			return precpred(_ctx, 12);
		case 34:
			return precpred(_ctx, 11);
		}
		return true;
	}
	private boolean nomod_sempred(NomodContext _localctx, int predIndex) {
		switch (predIndex) {
		case 35:
			return precpred(_ctx, 12);
		case 36:
			return precpred(_ctx, 11);
		case 37:
			return precpred(_ctx, 10);
		case 38:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3R\u03ca\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\3\2"+
		"\6\2\u0092\n\2\r\2\16\2\u0093\3\2\3\2\3\3\7\3\u0099\n\3\f\3\16\3\u009c"+
		"\13\3\3\3\3\3\6\3\u00a0\n\3\r\3\16\3\u00a1\3\3\3\3\7\3\u00a6\n\3\f\3\16"+
		"\3\u00a9\13\3\3\3\7\3\u00ac\n\3\f\3\16\3\u00af\13\3\3\3\3\3\3\3\3\3\5"+
		"\3\u00b5\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00c0\n\5\3\5\3\5"+
		"\3\5\3\5\5\5\u00c6\n\5\5\5\u00c8\n\5\3\5\3\5\3\5\3\6\3\6\3\6\6\6\u00d0"+
		"\n\6\r\6\16\6\u00d1\3\6\3\6\7\6\u00d6\n\6\f\6\16\6\u00d9\13\6\3\6\3\6"+
		"\3\7\3\7\7\7\u00df\n\7\f\7\16\7\u00e2\13\7\3\7\3\7\6\7\u00e6\n\7\r\7\16"+
		"\7\u00e7\3\b\3\b\3\t\3\t\3\n\3\n\5\n\u00f0\n\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u0104\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0113"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0122\n\f"+
		"\7\f\u0124\n\f\f\f\16\f\u0127\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\5\r\u0137\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\5\r\u0145\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0158\n\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0167\n\16\7\16"+
		"\u0169\n\16\f\16\16\16\u016c\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u017e\n\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u018a\n\17\f\17\16\17\u018d"+
		"\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u019f\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\7\20\u01ab\n\20\f\20\16\20\u01ae\13\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u01c0"+
		"\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u01cc\n\21"+
		"\f\21\16\21\u01cf\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\5\22\u01df\n\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\7\22\u01eb\n\22\f\22\16\22\u01ee\13\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u01ff\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u020b"+
		"\n\23\f\23\16\23\u020e\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\5\24\u021e\n\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u022e\n\24\f\24\16"+
		"\24\u0231\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\5\25\u0241\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0251\n\25\f\25\16\25\u0254\13\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u0265\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\7\26\u0275\n\26\f\26\16\26\u0278\13\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\5#\u02c3\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\7#\u02d3\n#\f#\16#\u02d6\13#\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3"+
		"&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\5+\u02fc\n+\3+\3+\3+\3+\5+\u0302\n+\5+\u0304\n+\3,\3,"+
		"\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\3\60\5\60\u0312\n\60\3\60\3\60\3\60"+
		"\5\60\u0317\n\60\5\60\u0319\n\60\3\61\3\61\3\62\6\62\u031e\n\62\r\62\16"+
		"\62\u031f\3\62\3\62\3\62\3\62\5\62\u0326\n\62\3\63\6\63\u0329\n\63\r\63"+
		"\16\63\u032a\3\64\3\64\3\65\3\65\7\65\u0331\n\65\f\65\16\65\u0334\13\65"+
		"\3\65\7\65\u0337\n\65\f\65\16\65\u033a\13\65\3\65\3\65\7\65\u033e\n\65"+
		"\f\65\16\65\u0341\13\65\3\65\5\65\u0344\n\65\3\66\3\66\5\66\u0348\n\66"+
		"\3\66\3\66\5\66\u034c\n\66\3\67\3\67\38\38\38\58\u0353\n8\39\39\39\69"+
		"\u0358\n9\r9\169\u0359\39\39\39\39\3:\3:\3:\3:\5:\u0364\n:\3:\3:\3:\6"+
		":\u0369\n:\r:\16:\u036a\5:\u036d\n:\3;\3;\3;\3<\3<\3<\3=\3=\3=\3=\3=\3"+
		">\3>\3>\3?\3?\3?\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\6A\u038a\nA\rA\16A\u038b"+
		"\3A\3A\6A\u0390\nA\rA\16A\u0391\3A\6A\u0395\nA\rA\16A\u0396\3A\3A\6A\u039b"+
		"\nA\rA\16A\u039c\5A\u039f\nA\3B\3B\3C\3C\3C\3D\3D\3D\3E\3E\3E\3E\3E\3"+
		"E\5E\u03af\nE\3E\5E\u03b2\nE\3F\3F\3F\3F\3F\3F\5F\u03ba\nF\3F\5F\u03bd"+
		"\nF\3G\3G\3G\3G\5G\u03c3\nG\3H\3H\3H\5H\u03c8\nH\3H\2\r\26\32\34\36 \""+
		"$&(*DI\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<"+
		">@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\2\7\3\2\"#\4\2\27\27&&\4\2\7\7@@\4\2\f\f=>\3\2?@\2\u0471"+
		"\2\u0091\3\2\2\2\4\u00b4\3\2\2\2\6\u00b6\3\2\2\2\b\u00c7\3\2\2\2\n\u00cc"+
		"\3\2\2\2\f\u00e5\3\2\2\2\16\u00e9\3\2\2\2\20\u00eb\3\2\2\2\22\u00ed\3"+
		"\2\2\2\24\u0103\3\2\2\2\26\u0112\3\2\2\2\30\u0144\3\2\2\2\32\u0157\3\2"+
		"\2\2\34\u017d\3\2\2\2\36\u019e\3\2\2\2 \u01bf\3\2\2\2\"\u01de\3\2\2\2"+
		"$\u01fe\3\2\2\2&\u021d\3\2\2\2(\u0240\3\2\2\2*\u0264\3\2\2\2,\u0279\3"+
		"\2\2\2.\u027f\3\2\2\2\60\u0285\3\2\2\2\62\u028b\3\2\2\2\64\u028d\3\2\2"+
		"\2\66\u0291\3\2\2\28\u0297\3\2\2\2:\u029b\3\2\2\2<\u02a1\3\2\2\2>\u02a5"+
		"\3\2\2\2@\u02ab\3\2\2\2B\u02af\3\2\2\2D\u02c2\3\2\2\2F\u02d7\3\2\2\2H"+
		"\u02d9\3\2\2\2J\u02df\3\2\2\2L\u02e5\3\2\2\2N\u02ed\3\2\2\2P\u02ef\3\2"+
		"\2\2R\u02f1\3\2\2\2T\u0303\3\2\2\2V\u0305\3\2\2\2X\u0307\3\2\2\2Z\u0309"+
		"\3\2\2\2\\\u030b\3\2\2\2^\u0311\3\2\2\2`\u031a\3\2\2\2b\u0325\3\2\2\2"+
		"d\u0328\3\2\2\2f\u032c\3\2\2\2h\u0343\3\2\2\2j\u0347\3\2\2\2l\u034d\3"+
		"\2\2\2n\u034f\3\2\2\2p\u0354\3\2\2\2r\u036c\3\2\2\2t\u036e\3\2\2\2v\u0371"+
		"\3\2\2\2x\u0374\3\2\2\2z\u0379\3\2\2\2|\u037c\3\2\2\2~\u037f\3\2\2\2\u0080"+
		"\u039e\3\2\2\2\u0082\u03a0\3\2\2\2\u0084\u03a2\3\2\2\2\u0086\u03a5\3\2"+
		"\2\2\u0088\u03a8\3\2\2\2\u008a\u03b3\3\2\2\2\u008c\u03be\3\2\2\2\u008e"+
		"\u03c7\3\2\2\2\u0090\u0092\5\4\3\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2"+
		"\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u0096\7\2\2\3\u0096\3\3\2\2\2\u0097\u0099\5\16\b\2\u0098\u0097\3\2\2"+
		"\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d"+
		"\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u00a7\5\22\n\2\u009e\u00a0\5\16\b\2"+
		"\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2"+
		"\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\5\22\n\2\u00a4\u00a6\3\2\2\2"+
		"\u00a5\u009f\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8"+
		"\3\2\2\2\u00a8\u00ad\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ac\5\16\b\2"+
		"\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae"+
		"\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\7<\2\2\u00b1"+
		"\u00b5\3\2\2\2\u00b2\u00b5\5\f\7\2\u00b3\u00b5\7<\2\2\u00b4\u009a\3\2"+
		"\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\5\3\2\2\2\u00b6\u00b7"+
		"\7\4\2\2\u00b7\7\3\2\2\2\u00b8\u00b9\7!\2\2\u00b9\u00ba\5R*\2\u00ba\u00bb"+
		"\t\2\2\2\u00bb\u00bc\5N(\2\u00bc\u00c8\3\2\2\2\u00bd\u00c0\5R*\2\u00be"+
		"\u00c0\5P)\2\u00bf\u00bd\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c5\3\2\2"+
		"\2\u00c1\u00c2\7\35\2\2\u00c2\u00c6\5\u0082B\2\u00c3\u00c4\7 \2\2\u00c4"+
		"\u00c6\5\u0082B\2\u00c5\u00c1\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6"+
		"\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00b8\3\2\2\2\u00c7\u00bf\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00ca\5\16\b\2\u00ca\u00cb\5\32\16\2\u00cb\t\3\2"+
		"\2\2\u00cc\u00cd\7\23\2\2\u00cd\u00d7\5\32\16\2\u00ce\u00d0\5\16\b\2\u00cf"+
		"\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2"+
		"\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\5\32\16\2\u00d4\u00d6\3\2\2\2\u00d5"+
		"\u00cf\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2"+
		"\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\7\25\2\2\u00db"+
		"\13\3\2\2\2\u00dc\u00e0\5\n\6\2\u00dd\u00df\5\16\b\2\u00de\u00dd\3\2\2"+
		"\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3"+
		"\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e4\7<\2\2\u00e4\u00e6\3\2\2\2\u00e5"+
		"\u00dc\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2"+
		"\2\2\u00e8\r\3\2\2\2\u00e9\u00ea\7;\2\2\u00ea\17\3\2\2\2\u00eb\u00ec\7"+
		"\r\2\2\u00ec\21\3\2\2\2\u00ed\u00ef\5\32\16\2\u00ee\u00f0\5\20\t\2\u00ef"+
		"\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\23\3\2\2\2\u00f1\u00f2\5\26\f"+
		"\2\u00f2\u00f3\5\26\f\2\u00f3\u0104\3\2\2\2\u00f4\u00f5\5\26\f\2\u00f5"+
		"\u00f6\5\\/\2\u00f6\u00f7\5\26\f\2\u00f7\u0104\3\2\2\2\u00f8\u00f9\5\26"+
		"\f\2\u00f9\u00fa\5Z.\2\u00fa\u00fb\5\26\f\2\u00fb\u0104\3\2\2\2\u00fc"+
		"\u0104\5j\66\2\u00fd\u0104\5n8\2\u00fe\u0104\5b\62\2\u00ff\u0104\5f\64"+
		"\2\u0100\u0104\5h\65\2\u0101\u0104\5l\67\2\u0102\u0104\5r:\2\u0103\u00f1"+
		"\3\2\2\2\u0103\u00f4\3\2\2\2\u0103\u00f8\3\2\2\2\u0103\u00fc\3\2\2\2\u0103"+
		"\u00fd\3\2\2\2\u0103\u00fe\3\2\2\2\u0103\u00ff\3\2\2\2\u0103\u0100\3\2"+
		"\2\2\u0103\u0101\3\2\2\2\u0103\u0102\3\2\2\2\u0104\25\3\2\2\2\u0105\u0106"+
		"\b\f\1\2\u0106\u0107\5V,\2\u0107\u0108\5\26\f\2\u0108\u0109\5X-\2\u0109"+
		"\u0113\3\2\2\2\u010a\u0113\5^\60\2\u010b\u0113\5j\66\2\u010c\u0113\5n"+
		"8\2\u010d\u0113\5b\62\2\u010e\u0113\5f\64\2\u010f\u0113\5h\65\2\u0110"+
		"\u0113\5l\67\2\u0111\u0113\5r:\2\u0112\u0105\3\2\2\2\u0112\u010a\3\2\2"+
		"\2\u0112\u010b\3\2\2\2\u0112\u010c\3\2\2\2\u0112\u010d\3\2\2\2\u0112\u010e"+
		"\3\2\2\2\u0112\u010f\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0111\3\2\2\2\u0113"+
		"\u0125\3\2\2\2\u0114\u0115\f\16\2\2\u0115\u0124\5\26\f\17\u0116\u0117"+
		"\f\r\2\2\u0117\u0118\5\\/\2\u0118\u0119\5\26\f\16\u0119\u0124\3\2\2\2"+
		"\u011a\u011b\f\f\2\2\u011b\u011c\5Z.\2\u011c\u011d\5\26\f\r\u011d\u0124"+
		"\3\2\2\2\u011e\u011f\f\13\2\2\u011f\u0121\5^\60\2\u0120\u0122\5\26\f\2"+
		"\u0121\u0120\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0124\3\2\2\2\u0123\u0114"+
		"\3\2\2\2\u0123\u0116\3\2\2\2\u0123\u011a\3\2\2\2\u0123\u011e\3\2\2\2\u0124"+
		"\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\27\3\2\2"+
		"\2\u0127\u0125\3\2\2\2\u0128\u0129\5\32\16\2\u0129\u012a\5\32\16\2\u012a"+
		"\u0145\3\2\2\2\u012b\u012c\5\32\16\2\u012c\u012d\5\\/\2\u012d\u012e\5"+
		"\32\16\2\u012e\u0145\3\2\2\2\u012f\u0130\5\32\16\2\u0130\u0131\5Z.\2\u0131"+
		"\u0132\5\32\16\2\u0132\u0145\3\2\2\2\u0133\u0134\5\32\16\2\u0134\u0136"+
		"\5^\60\2\u0135\u0137\5\32\16\2\u0136\u0135\3\2\2\2\u0136\u0137\3\2\2\2"+
		"\u0137\u0145\3\2\2\2\u0138\u0145\5,\27\2\u0139\u0145\5.\30\2\u013a\u0145"+
		"\5\60\31\2\u013b\u0145\5H%\2\u013c\u0145\5J&\2\u013d\u0145\5L\'\2\u013e"+
		"\u0145\5\u008eH\2\u013f\u0145\5\64\33\2\u0140\u0145\5\66\34\2\u0141\u0145"+
		"\5\24\13\2\u0142\u0145\5\b\5\2\u0143\u0145\5T+\2\u0144\u0128\3\2\2\2\u0144"+
		"\u012b\3\2\2\2\u0144\u012f\3\2\2\2\u0144\u0133\3\2\2\2\u0144\u0138\3\2"+
		"\2\2\u0144\u0139\3\2\2\2\u0144\u013a\3\2\2\2\u0144\u013b\3\2\2\2\u0144"+
		"\u013c\3\2\2\2\u0144\u013d\3\2\2\2\u0144\u013e\3\2\2\2\u0144\u013f\3\2"+
		"\2\2\u0144\u0140\3\2\2\2\u0144\u0141\3\2\2\2\u0144\u0142\3\2\2\2\u0144"+
		"\u0143\3\2\2\2\u0145\31\3\2\2\2\u0146\u0147\b\16\1\2\u0147\u0148\5V,\2"+
		"\u0148\u0149\5\32\16\2\u0149\u014a\5X-\2\u014a\u0158\3\2\2\2\u014b\u0158"+
		"\5,\27\2\u014c\u0158\5.\30\2\u014d\u0158\5\60\31\2\u014e\u0158\5H%\2\u014f"+
		"\u0158\5J&\2\u0150\u0158\5L\'\2\u0151\u0158\5\u008eH\2\u0152\u0158\5\64"+
		"\33\2\u0153\u0158\5\66\34\2\u0154\u0158\5\26\f\2\u0155\u0158\5\b\5\2\u0156"+
		"\u0158\5T+\2\u0157\u0146\3\2\2\2\u0157\u014b\3\2\2\2\u0157\u014c\3\2\2"+
		"\2\u0157\u014d\3\2\2\2\u0157\u014e\3\2\2\2\u0157\u014f\3\2\2\2\u0157\u0150"+
		"\3\2\2\2\u0157\u0151\3\2\2\2\u0157\u0152\3\2\2\2\u0157\u0153\3\2\2\2\u0157"+
		"\u0154\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0156\3\2\2\2\u0158\u016a\3\2"+
		"\2\2\u0159\u015a\f\23\2\2\u015a\u0169\5\32\16\24\u015b\u015c\f\21\2\2"+
		"\u015c\u015d\5\\/\2\u015d\u015e\5\32\16\22\u015e\u0169\3\2\2\2\u015f\u0160"+
		"\f\20\2\2\u0160\u0161\5Z.\2\u0161\u0162\5\32\16\21\u0162\u0169\3\2\2\2"+
		"\u0163\u0164\f\17\2\2\u0164\u0166\5^\60\2\u0165\u0167\5\32\16\2\u0166"+
		"\u0165\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0169\3\2\2\2\u0168\u0159\3\2"+
		"\2\2\u0168\u015b\3\2\2\2\u0168\u015f\3\2\2\2\u0168\u0163\3\2\2\2\u0169"+
		"\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\33\3\2\2"+
		"\2\u016c\u016a\3\2\2\2\u016d\u016e\b\17\1\2\u016e\u016f\5V,\2\u016f\u0170"+
		"\5\34\17\2\u0170\u0171\5X-\2\u0171\u017e\3\2\2\2\u0172\u017e\5,\27\2\u0173"+
		"\u017e\5.\30\2\u0174\u017e\5\60\31\2\u0175\u017e\5H%\2\u0176\u017e\5J"+
		"&\2\u0177\u017e\5L\'\2\u0178\u017e\5\u008eH\2\u0179\u017e\5:\36\2\u017a"+
		"\u017e\58\35\2\u017b\u017e\5\26\f\2\u017c\u017e\5T+\2\u017d\u016d\3\2"+
		"\2\2\u017d\u0172\3\2\2\2\u017d\u0173\3\2\2\2\u017d\u0174\3\2\2\2\u017d"+
		"\u0175\3\2\2\2\u017d\u0176\3\2\2\2\u017d\u0177\3\2\2\2\u017d\u0178\3\2"+
		"\2\2\u017d\u0179\3\2\2\2\u017d\u017a\3\2\2\2\u017d\u017b\3\2\2\2\u017d"+
		"\u017c\3\2\2\2\u017e\u018b\3\2\2\2\u017f\u0180\f\20\2\2\u0180\u018a\5"+
		"\34\17\21\u0181\u0182\f\17\2\2\u0182\u0183\5\\/\2\u0183\u0184\5\34\17"+
		"\20\u0184\u018a\3\2\2\2\u0185\u0186\f\16\2\2\u0186\u0187\5Z.\2\u0187\u0188"+
		"\5\34\17\17\u0188\u018a\3\2\2\2\u0189\u017f\3\2\2\2\u0189\u0181\3\2\2"+
		"\2\u0189\u0185\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c"+
		"\3\2\2\2\u018c\35\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u018f\b\20\1\2\u018f"+
		"\u0190\5V,\2\u0190\u0191\5\36\20\2\u0191\u0192\5X-\2\u0192\u019f\3\2\2"+
		"\2\u0193\u019f\5,\27\2\u0194\u019f\5.\30\2\u0195\u019f\5\60\31\2\u0196"+
		"\u019f\5H%\2\u0197\u019f\5J&\2\u0198\u019f\5L\'\2\u0199\u019f\5\u008e"+
		"H\2\u019a\u019f\5> \2\u019b\u019f\5<\37\2\u019c\u019f\5\26\f\2\u019d\u019f"+
		"\5T+\2\u019e\u018e\3\2\2\2\u019e\u0193\3\2\2\2\u019e\u0194\3\2\2\2\u019e"+
		"\u0195\3\2\2\2\u019e\u0196\3\2\2\2\u019e\u0197\3\2\2\2\u019e\u0198\3\2"+
		"\2\2\u019e\u0199\3\2\2\2\u019e\u019a\3\2\2\2\u019e\u019b\3\2\2\2\u019e"+
		"\u019c\3\2\2\2\u019e\u019d\3\2\2\2\u019f\u01ac\3\2\2\2\u01a0\u01a1\f\20"+
		"\2\2\u01a1\u01ab\5\36\20\21\u01a2\u01a3\f\17\2\2\u01a3\u01a4\5\\/\2\u01a4"+
		"\u01a5\5\36\20\20\u01a5\u01ab\3\2\2\2\u01a6\u01a7\f\16\2\2\u01a7\u01a8"+
		"\5Z.\2\u01a8\u01a9\5\36\20\17\u01a9\u01ab\3\2\2\2\u01aa\u01a0\3\2\2\2"+
		"\u01aa\u01a2\3\2\2\2\u01aa\u01a6\3\2\2\2\u01ab\u01ae\3\2\2\2\u01ac\u01aa"+
		"\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\37\3\2\2\2\u01ae\u01ac\3\2\2\2\u01af"+
		"\u01b0\b\21\1\2\u01b0\u01b1\5V,\2\u01b1\u01b2\5 \21\2\u01b2\u01b3\5X-"+
		"\2\u01b3\u01c0\3\2\2\2\u01b4\u01c0\5,\27\2\u01b5\u01c0\5.\30\2\u01b6\u01c0"+
		"\5\60\31\2\u01b7\u01c0\5H%\2\u01b8\u01c0\5J&\2\u01b9\u01c0\5L\'\2\u01ba"+
		"\u01c0\5\u008eH\2\u01bb\u01c0\5B\"\2\u01bc\u01c0\5@!\2\u01bd\u01c0\5\26"+
		"\f\2\u01be\u01c0\5T+\2\u01bf\u01af\3\2\2\2\u01bf\u01b4\3\2\2\2\u01bf\u01b5"+
		"\3\2\2\2\u01bf\u01b6\3\2\2\2\u01bf\u01b7\3\2\2\2\u01bf\u01b8\3\2\2\2\u01bf"+
		"\u01b9\3\2\2\2\u01bf\u01ba\3\2\2\2\u01bf\u01bb\3\2\2\2\u01bf\u01bc\3\2"+
		"\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01be\3\2\2\2\u01c0\u01cd\3\2\2\2\u01c1"+
		"\u01c2\f\20\2\2\u01c2\u01cc\5 \21\21\u01c3\u01c4\f\17\2\2\u01c4\u01c5"+
		"\5\\/\2\u01c5\u01c6\5 \21\20\u01c6\u01cc\3\2\2\2\u01c7\u01c8\f\16\2\2"+
		"\u01c8\u01c9\5Z.\2\u01c9\u01ca\5 \21\17\u01ca\u01cc\3\2\2\2\u01cb\u01c1"+
		"\3\2\2\2\u01cb\u01c3\3\2\2\2\u01cb\u01c7\3\2\2\2\u01cc\u01cf\3\2\2\2\u01cd"+
		"\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce!\3\2\2\2\u01cf\u01cd\3\2\2\2"+
		"\u01d0\u01d1\b\22\1\2\u01d1\u01d2\5V,\2\u01d2\u01d3\5\"\22\2\u01d3\u01d4"+
		"\5X-\2\u01d4\u01df\3\2\2\2\u01d5\u01df\5,\27\2\u01d6\u01df\5.\30\2\u01d7"+
		"\u01df\5\60\31\2\u01d8\u01df\5H%\2\u01d9\u01df\5J&\2\u01da\u01df\5L\'"+
		"\2\u01db\u01df\5\u008eH\2\u01dc\u01df\5\26\f\2\u01dd\u01df\5T+\2\u01de"+
		"\u01d0\3\2\2\2\u01de\u01d5\3\2\2\2\u01de\u01d6\3\2\2\2\u01de\u01d7\3\2"+
		"\2\2\u01de\u01d8\3\2\2\2\u01de\u01d9\3\2\2\2\u01de\u01da\3\2\2\2\u01de"+
		"\u01db\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01dd\3\2\2\2\u01df\u01ec\3\2"+
		"\2\2\u01e0\u01e1\f\16\2\2\u01e1\u01eb\5\"\22\17\u01e2\u01e3\f\r\2\2\u01e3"+
		"\u01e4\5\\/\2\u01e4\u01e5\5\"\22\16\u01e5\u01eb\3\2\2\2\u01e6\u01e7\f"+
		"\f\2\2\u01e7\u01e8\5Z.\2\u01e8\u01e9\5\"\22\r\u01e9\u01eb\3\2\2\2\u01ea"+
		"\u01e0\3\2\2\2\u01ea\u01e2\3\2\2\2\u01ea\u01e6\3\2\2\2\u01eb\u01ee\3\2"+
		"\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed#\3\2\2\2\u01ee\u01ec"+
		"\3\2\2\2\u01ef\u01f0\b\23\1\2\u01f0\u01f1\5V,\2\u01f1\u01f2\5$\23\2\u01f2"+
		"\u01f3\5X-\2\u01f3\u01ff\3\2\2\2\u01f4\u01ff\5,\27\2\u01f5\u01ff\5.\30"+
		"\2\u01f6\u01ff\5\60\31\2\u01f7\u01ff\5H%\2\u01f8\u01ff\5J&\2\u01f9\u01ff"+
		"\5L\'\2\u01fa\u01ff\5\26\f\2\u01fb\u01ff\5\b\5\2\u01fc\u01ff\5\64\33\2"+
		"\u01fd\u01ff\5\66\34\2\u01fe\u01ef\3\2\2\2\u01fe\u01f4\3\2\2\2\u01fe\u01f5"+
		"\3\2\2\2\u01fe\u01f6\3\2\2\2\u01fe\u01f7\3\2\2\2\u01fe\u01f8\3\2\2\2\u01fe"+
		"\u01f9\3\2\2\2\u01fe\u01fa\3\2\2\2\u01fe\u01fb\3\2\2\2\u01fe\u01fc\3\2"+
		"\2\2\u01fe\u01fd\3\2\2\2\u01ff\u020c\3\2\2\2\u0200\u0201\f\17\2\2\u0201"+
		"\u020b\5$\23\20\u0202\u0203\f\16\2\2\u0203\u0204\5\\/\2\u0204\u0205\5"+
		"$\23\17\u0205\u020b\3\2\2\2\u0206\u0207\f\r\2\2\u0207\u0208\5Z.\2\u0208"+
		"\u0209\5$\23\16\u0209\u020b\3\2\2\2\u020a\u0200\3\2\2\2\u020a\u0202\3"+
		"\2\2\2\u020a\u0206\3\2\2\2\u020b\u020e\3\2\2\2\u020c\u020a\3\2\2\2\u020c"+
		"\u020d\3\2\2\2\u020d%\3\2\2\2\u020e\u020c\3\2\2\2\u020f\u0210\b\24\1\2"+
		"\u0210\u0211\5V,\2\u0211\u0212\5&\24\2\u0212\u0213\5X-\2\u0213\u021e\3"+
		"\2\2\2\u0214\u021e\5H%\2\u0215\u021e\5J&\2\u0216\u021e\5L\'\2\u0217\u021e"+
		"\5\u008eH\2\u0218\u021e\5\26\f\2\u0219\u021e\5\b\5\2\u021a\u021e\5T+\2"+
		"\u021b\u021e\5\64\33\2\u021c\u021e\5\66\34\2\u021d\u020f\3\2\2\2\u021d"+
		"\u0214\3\2\2\2\u021d\u0215\3\2\2\2\u021d\u0216\3\2\2\2\u021d\u0217\3\2"+
		"\2\2\u021d\u0218\3\2\2\2\u021d\u0219\3\2\2\2\u021d\u021a\3\2\2\2\u021d"+
		"\u021b\3\2\2\2\u021d\u021c\3\2\2\2\u021e\u022f\3\2\2\2\u021f\u0220\f\17"+
		"\2\2\u0220\u022e\5&\24\20\u0221\u0222\f\16\2\2\u0222\u0223\5\\/\2\u0223"+
		"\u0224\5&\24\17\u0224\u022e\3\2\2\2\u0225\u0226\f\r\2\2\u0226\u0227\5"+
		"Z.\2\u0227\u0228\5&\24\16\u0228\u022e\3\2\2\2\u0229\u022a\f\f\2\2\u022a"+
		"\u022b\5^\60\2\u022b\u022c\5&\24\r\u022c\u022e\3\2\2\2\u022d\u021f\3\2"+
		"\2\2\u022d\u0221\3\2\2\2\u022d\u0225\3\2\2\2\u022d\u0229\3\2\2\2\u022e"+
		"\u0231\3\2\2\2\u022f\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230\'\3\2\2\2"+
		"\u0231\u022f\3\2\2\2\u0232\u0233\b\25\1\2\u0233\u0234\5V,\2\u0234\u0235"+
		"\5(\25\2\u0235\u0236\5X-\2\u0236\u0241\3\2\2\2\u0237\u0241\5H%\2\u0238"+
		"\u0241\5J&\2\u0239\u0241\5L\'\2\u023a\u0241\5\u008eH\2\u023b\u0241\5\26"+
		"\f\2\u023c\u0241\5T+\2\u023d\u0241\5,\27\2\u023e\u0241\5\64\33\2\u023f"+
		"\u0241\5\66\34\2\u0240\u0232\3\2\2\2\u0240\u0237\3\2\2\2\u0240\u0238\3"+
		"\2\2\2\u0240\u0239\3\2\2\2\u0240\u023a\3\2\2\2\u0240\u023b\3\2\2\2\u0240"+
		"\u023c\3\2\2\2\u0240\u023d\3\2\2\2\u0240\u023e\3\2\2\2\u0240\u023f\3\2"+
		"\2\2\u0241\u0252\3\2\2\2\u0242\u0243\f\17\2\2\u0243\u0251\5(\25\20\u0244"+
		"\u0245\f\r\2\2\u0245\u0246\5Z.\2\u0246\u0247\5(\25\16\u0247\u0251\3\2"+
		"\2\2\u0248\u0249\f\f\2\2\u0249\u024a\5^\60\2\u024a\u024b\5(\25\r\u024b"+
		"\u0251\3\2\2\2\u024c\u024d\f\16\2\2\u024d\u024e\5\\/\2\u024e\u024f\5&"+
		"\24\2\u024f\u0251\3\2\2\2\u0250\u0242\3\2\2\2\u0250\u0244\3\2\2\2\u0250"+
		"\u0248\3\2\2\2\u0250\u024c\3\2\2\2\u0251\u0254\3\2\2\2\u0252\u0250\3\2"+
		"\2\2\u0252\u0253\3\2\2\2\u0253)\3\2\2\2\u0254\u0252\3\2\2\2\u0255\u0256"+
		"\b\26\1\2\u0256\u0257\5V,\2\u0257\u0258\5*\26\2\u0258\u0259\5X-\2\u0259"+
		"\u0265\3\2\2\2\u025a\u0265\5H%\2\u025b\u0265\5J&\2\u025c\u0265\5L\'\2"+
		"\u025d\u0265\5\u008eH\2\u025e\u0265\5\26\f\2\u025f\u0265\5T+\2\u0260\u0265"+
		"\5,\27\2\u0261\u0265\5.\30\2\u0262\u0265\5\64\33\2\u0263\u0265\5\66\34"+
		"\2\u0264\u0255\3\2\2\2\u0264\u025a\3\2\2\2\u0264\u025b\3\2\2\2\u0264\u025c"+
		"\3\2\2\2\u0264\u025d\3\2\2\2\u0264\u025e\3\2\2\2\u0264\u025f\3\2\2\2\u0264"+
		"\u0260\3\2\2\2\u0264\u0261\3\2\2\2\u0264\u0262\3\2\2\2\u0264\u0263\3\2"+
		"\2\2\u0265\u0276\3\2\2\2\u0266\u0267\f\20\2\2\u0267\u0275\5*\26\21\u0268"+
		"\u0269\f\17\2\2\u0269\u026a\5\\/\2\u026a\u026b\5*\26\20\u026b\u0275\3"+
		"\2\2\2\u026c\u026d\f\16\2\2\u026d\u026e\5Z.\2\u026e\u026f\5*\26\17\u026f"+
		"\u0275\3\2\2\2\u0270\u0271\f\r\2\2\u0271\u0272\5^\60\2\u0272\u0273\5*"+
		"\26\16\u0273\u0275\3\2\2\2\u0274\u0266\3\2\2\2\u0274\u0268\3\2\2\2\u0274"+
		"\u026c\3\2\2\2\u0274\u0270\3\2\2\2\u0275\u0278\3\2\2\2\u0276\u0274\3\2"+
		"\2\2\u0276\u0277\3\2\2\2\u0277+\3\2\2\2\u0278\u0276\3\2\2\2\u0279\u027a"+
		"\7%\2\2\u027a\u027b\5&\24\2\u027b\u027c\7&\2\2\u027c\u027d\5&\24\2\u027d"+
		"\u027e\7\'\2\2\u027e-\3\2\2\2\u027f\u0280\7(\2\2\u0280\u0281\5(\25\2\u0281"+
		"\u0282\7)\2\2\u0282\u0283\5(\25\2\u0283\u0284\7*\2\2\u0284/\3\2\2\2\u0285"+
		"\u0286\7+\2\2\u0286\u0287\5*\26\2\u0287\u0288\7,\2\2\u0288\u0289\5*\26"+
		"\2\u0289\u028a\7-\2\2\u028a\61\3\2\2\2\u028b\u028c\5\"\22\2\u028c\63\3"+
		"\2\2\2\u028d\u028e\7\60\2\2\u028e\u028f\5\34\17\2\u028f\u0290\7$\2\2\u0290"+
		"\65\3\2\2\2\u0291\u0292\7\"\2\2\u0292\u0293\5\62\32\2\u0293\u0294\7\60"+
		"\2\2\u0294\u0295\5\34\17\2\u0295\u0296\7$\2\2\u0296\67\3\2\2\2\u0297\u0298"+
		"\7\61\2\2\u0298\u0299\5\36\20\2\u0299\u029a\7\67\2\2\u029a9\3\2\2\2\u029b"+
		"\u029c\7\64\2\2\u029c\u029d\5\62\32\2\u029d\u029e\7\60\2\2\u029e\u029f"+
		"\5\36\20\2\u029f\u02a0\7\67\2\2\u02a0;\3\2\2\2\u02a1\u02a2\7\62\2\2\u02a2"+
		"\u02a3\5 \21\2\u02a3\u02a4\78\2\2\u02a4=\3\2\2\2\u02a5\u02a6\7\65\2\2"+
		"\u02a6\u02a7\5\62\32\2\u02a7\u02a8\7\60\2\2\u02a8\u02a9\5 \21\2\u02a9"+
		"\u02aa\78\2\2\u02aa?\3\2\2\2\u02ab\u02ac\7\63\2\2\u02ac\u02ad\5\"\22\2"+
		"\u02ad\u02ae\79\2\2\u02aeA\3\2\2\2\u02af\u02b0\7\66\2\2\u02b0\u02b1\5"+
		"\62\32\2\u02b1\u02b2\7\60\2\2\u02b2\u02b3\5\"\22\2\u02b3\u02b4\79\2\2"+
		"\u02b4C\3\2\2\2\u02b5\u02b6\b#\1\2\u02b6\u02b7\5V,\2\u02b7\u02b8\5D#\2"+
		"\u02b8\u02b9\5X-\2\u02b9\u02c3\3\2\2\2\u02ba\u02c3\5^\60\2\u02bb\u02c3"+
		"\5,\27\2\u02bc\u02c3\5.\30\2\u02bd\u02c3\5\60\31\2\u02be\u02c3\5\u008e"+
		"H\2\u02bf\u02c3\5\66\34\2\u02c0\u02c3\5\64\33\2\u02c1\u02c3\5\26\f\2\u02c2"+
		"\u02b5\3\2\2\2\u02c2\u02ba\3\2\2\2\u02c2\u02bb\3\2\2\2\u02c2\u02bc\3\2"+
		"\2\2\u02c2\u02bd\3\2\2\2\u02c2\u02be\3\2\2\2\u02c2\u02bf\3\2\2\2\u02c2"+
		"\u02c0\3\2\2\2\u02c2\u02c1\3\2\2\2\u02c3\u02d4\3\2\2\2\u02c4\u02c5\f\16"+
		"\2\2\u02c5\u02d3\5D#\17\u02c6\u02c7\f\r\2\2\u02c7\u02c8\5\\/\2\u02c8\u02c9"+
		"\5D#\16\u02c9\u02d3\3\2\2\2\u02ca\u02cb\f\f\2\2\u02cb\u02cc\5Z.\2\u02cc"+
		"\u02cd\5D#\r\u02cd\u02d3\3\2\2\2\u02ce\u02cf\f\n\2\2\u02cf\u02d0\5^\60"+
		"\2\u02d0\u02d1\5D#\13\u02d1\u02d3\3\2\2\2\u02d2\u02c4\3\2\2\2\u02d2\u02c6"+
		"\3\2\2\2\u02d2\u02ca\3\2\2\2\u02d2\u02ce\3\2\2\2\u02d3\u02d6\3\2\2\2\u02d4"+
		"\u02d2\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5E\3\2\2\2\u02d6\u02d4\3\2\2\2"+
		"\u02d7\u02d8\5D#\2\u02d8G\3\2\2\2\u02d9\u02da\7!\2\2\u02da\u02db\5F$\2"+
		"\u02db\u02dc\7#\2\2\u02dc\u02dd\5N(\2\u02dd\u02de\7$\2\2\u02deI\3\2\2"+
		"\2\u02df\u02e0\7!\2\2\u02e0\u02e1\5F$\2\u02e1\u02e2\7\"\2\2\u02e2\u02e3"+
		"\5N(\2\u02e3\u02e4\7$\2\2\u02e4K\3\2\2\2\u02e5\u02e6\7!\2\2\u02e6\u02e7"+
		"\5F$\2\u02e7\u02e8\7#\2\2\u02e8\u02e9\5N(\2\u02e9\u02ea\7\"\2\2\u02ea"+
		"\u02eb\5N(\2\u02eb\u02ec\7$\2\2\u02ecM\3\2\2\2\u02ed\u02ee\5D#\2\u02ee"+
		"O\3\2\2\2\u02ef\u02f0\7E\2\2\u02f0Q\3\2\2\2\u02f1\u02f2\7C\2\2\u02f2S"+
		"\3\2\2\2\u02f3\u02f4\7!\2\2\u02f4\u02f5\5R*\2\u02f5\u02f6\t\2\2\2\u02f6"+
		"\u02f7\5N(\2\u02f7\u02f8\7$\2\2\u02f8\u0304\3\2\2\2\u02f9\u02fc\5R*\2"+
		"\u02fa\u02fc\5P)\2\u02fb\u02f9\3\2\2\2\u02fb\u02fa\3\2\2\2\u02fc\u0301"+
		"\3\2\2\2\u02fd\u02fe\7\35\2\2\u02fe\u0302\5\u0082B\2\u02ff\u0300\7 \2"+
		"\2\u0300\u0302\5\u0082B\2\u0301\u02fd\3\2\2\2\u0301\u02ff\3\2\2\2\u0301"+
		"\u0302\3\2\2\2\u0302\u0304\3\2\2\2\u0303\u02f3\3\2\2\2\u0303\u02fb\3\2"+
		"\2\2\u0304U\3\2\2\2\u0305\u0306\7\22\2\2\u0306W\3\2\2\2\u0307\u0308\7"+
		"\24\2\2\u0308Y\3\2\2\2\u0309\u030a\7\26\2\2\u030a[\3\2\2\2\u030b\u030c"+
		"\t\3\2\2\u030c]\3\2\2\2\u030d\u0312\7\32\2\2\u030e\u030f\5\16\b\2\u030f"+
		"\u0310\7:\2\2\u0310\u0312\3\2\2\2\u0311\u030d\3\2\2\2\u0311\u030e\3\2"+
		"\2\2\u0312\u0318\3\2\2\2\u0313\u0316\5\16\b\2\u0314\u0317\5\u0088E\2\u0315"+
		"\u0317\5\32\16\2\u0316\u0314\3\2\2\2\u0316\u0315\3\2\2\2\u0317\u0319\3"+
		"\2\2\2\u0318\u0313\3\2\2\2\u0318\u0319\3\2\2\2\u0319_\3\2\2\2\u031a\u031b"+
		"\t\4\2\2\u031ba\3\2\2\2\u031c\u031e\5`\61\2\u031d\u031c\3\2\2\2\u031e"+
		"\u031f\3\2\2\2\u031f\u031d\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u0326\3\2"+
		"\2\2\u0321\u0326\7\5\2\2\u0322\u0326\7\n\2\2\u0323\u0326\7\b\2\2\u0324"+
		"\u0326\5d\63\2\u0325\u031d\3\2\2\2\u0325\u0321\3\2\2\2\u0325\u0322\3\2"+
		"\2\2\u0325\u0323\3\2\2\2\u0325\u0324\3\2\2\2\u0326c\3\2\2\2\u0327\u0329"+
		"\7\13\2\2\u0328\u0327\3\2\2\2\u0329\u032a\3\2\2\2\u032a\u0328\3\2\2\2"+
		"\u032a\u032b\3\2\2\2\u032be\3\2\2\2\u032c\u032d\t\5\2\2\u032dg\3\2\2\2"+
		"\u032e\u0332\7\30\2\2\u032f\u0331\7\30\2\2\u0330\u032f\3\2\2\2\u0331\u0334"+
		"\3\2\2\2\u0332\u0330\3\2\2\2\u0332\u0333\3\2\2\2\u0333\u0344\3\2\2\2\u0334"+
		"\u0332\3\2\2\2\u0335\u0337\7\30\2\2\u0336\u0335\3\2\2\2\u0337\u033a\3"+
		"\2\2\2\u0338\u0336\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u033b\3\2\2\2\u033a"+
		"\u0338\3\2\2\2\u033b\u033f\7\31\2\2\u033c\u033e\7\30\2\2\u033d\u033c\3"+
		"\2\2\2\u033e\u0341\3\2\2\2\u033f\u033d\3\2\2\2\u033f\u0340\3\2\2\2\u0340"+
		"\u0344\3\2\2\2\u0341\u033f\3\2\2\2\u0342\u0344\7I\2\2\u0343\u032e\3\2"+
		"\2\2\u0343\u0338\3\2\2\2\u0343\u0342\3\2\2\2\u0344i\3\2\2\2\u0345\u0348"+
		"\5b\62\2\u0346\u0348\5R*\2\u0347\u0345\3\2\2\2\u0347\u0346\3\2\2\2\u0348"+
		"\u0349\3\2\2\2\u0349\u034b\5h\65\2\u034a\u034c\7!\2\2\u034b\u034a\3\2"+
		"\2\2\u034b\u034c\3\2\2\2\u034ck\3\2\2\2\u034d\u034e\t\6\2\2\u034em\3\2"+
		"\2\2\u034f\u0350\5l\67\2\u0350\u0352\5h\65\2\u0351\u0353\7!\2\2\u0352"+
		"\u0351\3\2\2\2\u0352\u0353\3\2\2\2\u0353o\3\2\2\2\u0354\u0357\7\22\2\2"+
		"\u0355\u0358\5l\67\2\u0356\u0358\5n8\2\u0357\u0355\3\2\2\2\u0357\u0356"+
		"\3\2\2\2\u0358\u0359\3\2\2\2\u0359\u0357\3\2\2\2\u0359\u035a\3\2\2\2\u035a"+
		"\u035b\3\2\2\2\u035b\u035c\7\24\2\2\u035c\u035d\7\35\2\2\u035d\u035e\5"+
		"h\65\2\u035eq\3\2\2\2\u035f\u036d\5n8\2\u0360\u0364\5l\67\2\u0361\u0364"+
		"\5n8\2\u0362\u0364\5p9\2\u0363\u0360\3\2\2\2\u0363\u0361\3\2\2\2\u0363"+
		"\u0362\3\2\2\2\u0364\u0368\3\2\2\2\u0365\u0369\5l\67\2\u0366\u0369\5n"+
		"8\2\u0367\u0369\5p9\2\u0368\u0365\3\2\2\2\u0368\u0366\3\2\2\2\u0368\u0367"+
		"\3\2\2\2\u0369\u036a\3\2\2\2\u036a\u0368\3\2\2\2\u036a\u036b\3\2\2\2\u036b"+
		"\u036d\3\2\2\2\u036c\u035f\3\2\2\2\u036c\u0363\3\2\2\2\u036ds\3\2\2\2"+
		"\u036e\u036f\7\37\2\2\u036f\u0370\5\u0082B\2\u0370u\3\2\2\2\u0371\u0372"+
		"\7\36\2\2\u0372\u0373\5\u0082B\2\u0373w\3\2\2\2\u0374\u0375\7\36\2\2\u0375"+
		"\u0376\5\u0082B\2\u0376\u0377\7\37\2\2\u0377\u0378\5\u0082B\2\u0378y\3"+
		"\2\2\2\u0379\u037a\7\33\2\2\u037a\u037b\5\u0082B\2\u037b{\3\2\2\2\u037c"+
		"\u037d\7\34\2\2\u037d\u037e\5\u0082B\2\u037e}\3\2\2\2\u037f\u0380\7\33"+
		"\2\2\u0380\u0381\5\u0082B\2\u0381\u0382\7\34\2\2\u0382\u0383\5\u0082B"+
		"\2\u0383\177\3\2\2\2\u0384\u039f\5b\62\2\u0385\u039f\5h\65\2\u0386\u039f"+
		"\5f\64\2\u0387\u039f\5,\27\2\u0388\u038a\5V,\2\u0389\u0388\3\2\2\2\u038a"+
		"\u038b\3\2\2\2\u038b\u0389\3\2\2\2\u038b\u038c\3\2\2\2\u038c\u038d\3\2"+
		"\2\2\u038d\u038f\5\24\13\2\u038e\u0390\5X-\2\u038f\u038e\3\2\2\2\u0390"+
		"\u0391\3\2\2\2\u0391\u038f\3\2\2\2\u0391\u0392\3\2\2\2\u0392\u039f\3\2"+
		"\2\2\u0393\u0395\5V,\2\u0394\u0393\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u0394"+
		"\3\2\2\2\u0396\u0397\3\2\2\2\u0397\u0398\3\2\2\2\u0398\u039a\5\30\r\2"+
		"\u0399\u039b\5X-\2\u039a\u0399\3\2\2\2\u039b\u039c\3\2\2\2\u039c\u039a"+
		"\3\2\2\2\u039c\u039d\3\2\2\2\u039d\u039f\3\2\2\2\u039e\u0384\3\2\2\2\u039e"+
		"\u0385\3\2\2\2\u039e\u0386\3\2\2\2\u039e\u0387\3\2\2\2\u039e\u0389\3\2"+
		"\2\2\u039e\u0394\3\2\2\2\u039f\u0081\3\2\2\2\u03a0\u03a1\5$\23\2\u03a1"+
		"\u0083\3\2\2\2\u03a2\u03a3\7\35\2\2\u03a3\u03a4\5\u0082B\2\u03a4\u0085"+
		"\3\2\2\2\u03a5\u03a6\7 \2\2\u03a6\u03a7\5\u0082B\2\u03a7\u0087\3\2\2\2"+
		"\u03a8\u03a9\5\u0080A\2\u03a9\u03aa\7\35\2\2\u03aa\u03ae\5\u0082B\2\u03ab"+
		"\u03af\5z>\2\u03ac\u03af\5|?\2\u03ad\u03af\5~@\2\u03ae\u03ab\3\2\2\2\u03ae"+
		"\u03ac\3\2\2\2\u03ae\u03ad\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b1\3\2"+
		"\2\2\u03b0\u03b2\7!\2\2\u03b1\u03b0\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2"+
		"\u0089\3\2\2\2\u03b3\u03b4\5\u0080A\2\u03b4\u03b5\7 \2\2\u03b5\u03b9\5"+
		"\u0082B\2\u03b6\u03ba\5t;\2\u03b7\u03ba\5v<\2\u03b8\u03ba\5x=\2\u03b9"+
		"\u03b6\3\2\2\2\u03b9\u03b7\3\2\2\2\u03b9\u03b8\3\2\2\2\u03b9\u03ba\3\2"+
		"\2\2\u03ba\u03bc\3\2\2\2\u03bb\u03bd\7!\2\2\u03bc\u03bb\3\2\2\2\u03bc"+
		"\u03bd\3\2\2\2\u03bd\u008b\3\2\2\2\u03be\u03bf\5\u0080A\2\u03bf\u03c0"+
		"\5\u0084C\2\u03c0\u03c2\5\u0086D\2\u03c1\u03c3\7!\2\2\u03c2\u03c1\3\2"+
		"\2\2\u03c2\u03c3\3\2\2\2\u03c3\u008d\3\2\2\2\u03c4\u03c8\5\u0088E\2\u03c5"+
		"\u03c8\5\u008aF\2\u03c6\u03c8\5\u008cG\2\u03c7\u03c4\3\2\2\2\u03c7\u03c5"+
		"\3\2\2\2\u03c7\u03c6\3\2\2\2\u03c8\u008f\3\2\2\2W\u0093\u009a\u00a1\u00a7"+
		"\u00ad\u00b4\u00bf\u00c5\u00c7\u00d1\u00d7\u00e0\u00e7\u00ef\u0103\u0112"+
		"\u0121\u0123\u0125\u0136\u0144\u0157\u0166\u0168\u016a\u017d\u0189\u018b"+
		"\u019e\u01aa\u01ac\u01bf\u01cb\u01cd\u01de\u01ea\u01ec\u01fe\u020a\u020c"+
		"\u021d\u022d\u022f\u0240\u0250\u0252\u0264\u0274\u0276\u02c2\u02d2\u02d4"+
		"\u02fb\u0301\u0303\u0311\u0316\u0318\u031f\u0325\u032a\u0332\u0338\u033f"+
		"\u0343\u0347\u034b\u0352\u0357\u0359\u0363\u0368\u036a\u036c\u038b\u0391"+
		"\u0396\u039c\u039e\u03ae\u03b1\u03b9\u03bc\u03c2\u03c7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}