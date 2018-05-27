// Generated from BaknemParser.g4 by ANTLR 4.7.1
   
 package nem;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BaknemParser}.
 */
public interface BaknemParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BaknemParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(BaknemParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(BaknemParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(BaknemParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(BaknemParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#header3}.
	 * @param ctx the parse tree
	 */
	void enterHeader3(BaknemParser.Header3Context ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#header3}.
	 * @param ctx the parse tree
	 */
	void exitHeader3(BaknemParser.Header3Context ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#funWithArg}.
	 * @param ctx the parse tree
	 */
	void enterFunWithArg(BaknemParser.FunWithArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#funWithArg}.
	 * @param ctx the parse tree
	 */
	void exitFunWithArg(BaknemParser.FunWithArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#space}.
	 * @param ctx the parse tree
	 */
	void enterSpace(BaknemParser.SpaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#space}.
	 * @param ctx the parse tree
	 */
	void exitSpace(BaknemParser.SpaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#exprs}.
	 * @param ctx the parse tree
	 */
	void enterExprs(BaknemParser.ExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#exprs}.
	 * @param ctx the parse tree
	 */
	void exitExprs(BaknemParser.ExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(BaknemParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(BaknemParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#layexpr}.
	 * @param ctx the parse tree
	 */
	void enterLayexpr(BaknemParser.LayexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#layexpr}.
	 * @param ctx the parse tree
	 */
	void exitLayexpr(BaknemParser.LayexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#nor}.
	 * @param ctx the parse tree
	 */
	void enterNor(BaknemParser.NorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#nor}.
	 * @param ctx the parse tree
	 */
	void exitNor(BaknemParser.NorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#nor1}.
	 * @param ctx the parse tree
	 */
	void enterNor1(BaknemParser.Nor1Context ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#nor1}.
	 * @param ctx the parse tree
	 */
	void exitNor1(BaknemParser.Nor1Context ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#nor2}.
	 * @param ctx the parse tree
	 */
	void enterNor2(BaknemParser.Nor2Context ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#nor2}.
	 * @param ctx the parse tree
	 */
	void exitNor2(BaknemParser.Nor2Context ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#nor3}.
	 * @param ctx the parse tree
	 */
	void enterNor3(BaknemParser.Nor3Context ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#nor3}.
	 * @param ctx the parse tree
	 */
	void exitNor3(BaknemParser.Nor3Context ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#nom}.
	 * @param ctx the parse tree
	 */
	void enterNom(BaknemParser.NomContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#nom}.
	 * @param ctx the parse tree
	 */
	void exitNom(BaknemParser.NomContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#nof}.
	 * @param ctx the parse tree
	 */
	void enterNof(BaknemParser.NofContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#nof}.
	 * @param ctx the parse tree
	 */
	void exitNof(BaknemParser.NofContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#nofc}.
	 * @param ctx the parse tree
	 */
	void enterNofc(BaknemParser.NofcContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#nofc}.
	 * @param ctx the parse tree
	 */
	void exitNofc(BaknemParser.NofcContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#nofch}.
	 * @param ctx the parse tree
	 */
	void enterNofch(BaknemParser.NofchContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#nofch}.
	 * @param ctx the parse tree
	 */
	void exitNofch(BaknemParser.NofchContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#mfrac}.
	 * @param ctx the parse tree
	 */
	void enterMfrac(BaknemParser.MfracContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#mfrac}.
	 * @param ctx the parse tree
	 */
	void exitMfrac(BaknemParser.MfracContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#mmfrac}.
	 * @param ctx the parse tree
	 */
	void enterMmfrac(BaknemParser.MmfracContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#mmfrac}.
	 * @param ctx the parse tree
	 */
	void exitMmfrac(BaknemParser.MmfracContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#mmmfrac}.
	 * @param ctx the parse tree
	 */
	void enterMmmfrac(BaknemParser.MmmfracContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#mmmfrac}.
	 * @param ctx the parse tree
	 */
	void exitMmmfrac(BaknemParser.MmmfracContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#rindex}.
	 * @param ctx the parse tree
	 */
	void enterRindex(BaknemParser.RindexContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#rindex}.
	 * @param ctx the parse tree
	 */
	void exitRindex(BaknemParser.RindexContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#sqrt}.
	 * @param ctx the parse tree
	 */
	void enterSqrt(BaknemParser.SqrtContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#sqrt}.
	 * @param ctx the parse tree
	 */
	void exitSqrt(BaknemParser.SqrtContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#irad}.
	 * @param ctx the parse tree
	 */
	void enterIrad(BaknemParser.IradContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#irad}.
	 * @param ctx the parse tree
	 */
	void exitIrad(BaknemParser.IradContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#sqrt1}.
	 * @param ctx the parse tree
	 */
	void enterSqrt1(BaknemParser.Sqrt1Context ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#sqrt1}.
	 * @param ctx the parse tree
	 */
	void exitSqrt1(BaknemParser.Sqrt1Context ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#irad1}.
	 * @param ctx the parse tree
	 */
	void enterIrad1(BaknemParser.Irad1Context ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#irad1}.
	 * @param ctx the parse tree
	 */
	void exitIrad1(BaknemParser.Irad1Context ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#sqrt2}.
	 * @param ctx the parse tree
	 */
	void enterSqrt2(BaknemParser.Sqrt2Context ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#sqrt2}.
	 * @param ctx the parse tree
	 */
	void exitSqrt2(BaknemParser.Sqrt2Context ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#irad2}.
	 * @param ctx the parse tree
	 */
	void enterIrad2(BaknemParser.Irad2Context ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#irad2}.
	 * @param ctx the parse tree
	 */
	void exitIrad2(BaknemParser.Irad2Context ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#sqrt3}.
	 * @param ctx the parse tree
	 */
	void enterSqrt3(BaknemParser.Sqrt3Context ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#sqrt3}.
	 * @param ctx the parse tree
	 */
	void exitSqrt3(BaknemParser.Sqrt3Context ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#irad3}.
	 * @param ctx the parse tree
	 */
	void enterIrad3(BaknemParser.Irad3Context ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#irad3}.
	 * @param ctx the parse tree
	 */
	void exitIrad3(BaknemParser.Irad3Context ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#nomod}.
	 * @param ctx the parse tree
	 */
	void enterNomod(BaknemParser.NomodContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#nomod}.
	 * @param ctx the parse tree
	 */
	void exitNomod(BaknemParser.NomodContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#begmod}.
	 * @param ctx the parse tree
	 */
	void enterBegmod(BaknemParser.BegmodContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#begmod}.
	 * @param ctx the parse tree
	 */
	void exitBegmod(BaknemParser.BegmodContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#munder}.
	 * @param ctx the parse tree
	 */
	void enterMunder(BaknemParser.MunderContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#munder}.
	 * @param ctx the parse tree
	 */
	void exitMunder(BaknemParser.MunderContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#mover}.
	 * @param ctx the parse tree
	 */
	void enterMover(BaknemParser.MoverContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#mover}.
	 * @param ctx the parse tree
	 */
	void exitMover(BaknemParser.MoverContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#mundov}.
	 * @param ctx the parse tree
	 */
	void enterMundov(BaknemParser.MundovContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#mundov}.
	 * @param ctx the parse tree
	 */
	void exitMundov(BaknemParser.MundovContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#endmod}.
	 * @param ctx the parse tree
	 */
	void enterEndmod(BaknemParser.EndmodContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#endmod}.
	 * @param ctx the parse tree
	 */
	void exitEndmod(BaknemParser.EndmodContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#varXfunabb}.
	 * @param ctx the parse tree
	 */
	void enterVarXfunabb(BaknemParser.VarXfunabbContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#varXfunabb}.
	 * @param ctx the parse tree
	 */
	void exitVarXfunabb(BaknemParser.VarXfunabbContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#funabb}.
	 * @param ctx the parse tree
	 */
	void enterFunabb(BaknemParser.FunabbContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#funabb}.
	 * @param ctx the parse tree
	 */
	void exitFunabb(BaknemParser.FunabbContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(BaknemParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(BaknemParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#lgrp}.
	 * @param ctx the parse tree
	 */
	void enterLgrp(BaknemParser.LgrpContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#lgrp}.
	 * @param ctx the parse tree
	 */
	void exitLgrp(BaknemParser.LgrpContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#rgrp}.
	 * @param ctx the parse tree
	 */
	void enterRgrp(BaknemParser.RgrpContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#rgrp}.
	 * @param ctx the parse tree
	 */
	void exitRgrp(BaknemParser.RgrpContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#binop}.
	 * @param ctx the parse tree
	 */
	void enterBinop(BaknemParser.BinopContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#binop}.
	 * @param ctx the parse tree
	 */
	void exitBinop(BaknemParser.BinopContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#binop1}.
	 * @param ctx the parse tree
	 */
	void enterBinop1(BaknemParser.Binop1Context ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#binop1}.
	 * @param ctx the parse tree
	 */
	void exitBinop1(BaknemParser.Binop1Context ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#cmpr}.
	 * @param ctx the parse tree
	 */
	void enterCmpr(BaknemParser.CmprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#cmpr}.
	 * @param ctx the parse tree
	 */
	void exitCmpr(BaknemParser.CmprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(BaknemParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(BaknemParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#greeks}.
	 * @param ctx the parse tree
	 */
	void enterGreeks(BaknemParser.GreeksContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#greeks}.
	 * @param ctx the parse tree
	 */
	void exitGreeks(BaknemParser.GreeksContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#specsym}.
	 * @param ctx the parse tree
	 */
	void enterSpecsym(BaknemParser.SpecsymContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#specsym}.
	 * @param ctx the parse tree
	 */
	void exitSpecsym(BaknemParser.SpecsymContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(BaknemParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(BaknemParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#numsub}.
	 * @param ctx the parse tree
	 */
	void enterNumsub(BaknemParser.NumsubContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#numsub}.
	 * @param ctx the parse tree
	 */
	void exitNumsub(BaknemParser.NumsubContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#chelement}.
	 * @param ctx the parse tree
	 */
	void enterChelement(BaknemParser.ChelementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#chelement}.
	 * @param ctx the parse tree
	 */
	void exitChelement(BaknemParser.ChelementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#chnumsub}.
	 * @param ctx the parse tree
	 */
	void enterChnumsub(BaknemParser.ChnumsubContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#chnumsub}.
	 * @param ctx the parse tree
	 */
	void exitChnumsub(BaknemParser.ChnumsubContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#chradical}.
	 * @param ctx the parse tree
	 */
	void enterChradical(BaknemParser.ChradicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#chradical}.
	 * @param ctx the parse tree
	 */
	void exitChradical(BaknemParser.ChradicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#chformula}.
	 * @param ctx the parse tree
	 */
	void enterChformula(BaknemParser.ChformulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#chformula}.
	 * @param ctx the parse tree
	 */
	void exitChformula(BaknemParser.ChformulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#sup2}.
	 * @param ctx the parse tree
	 */
	void enterSup2(BaknemParser.Sup2Context ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#sup2}.
	 * @param ctx the parse tree
	 */
	void exitSup2(BaknemParser.Sup2Context ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#sup2b}.
	 * @param ctx the parse tree
	 */
	void enterSup2b(BaknemParser.Sup2bContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#sup2b}.
	 * @param ctx the parse tree
	 */
	void exitSup2b(BaknemParser.Sup2bContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#sup22}.
	 * @param ctx the parse tree
	 */
	void enterSup22(BaknemParser.Sup22Context ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#sup22}.
	 * @param ctx the parse tree
	 */
	void exitSup22(BaknemParser.Sup22Context ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#sub2}.
	 * @param ctx the parse tree
	 */
	void enterSub2(BaknemParser.Sub2Context ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#sub2}.
	 * @param ctx the parse tree
	 */
	void exitSub2(BaknemParser.Sub2Context ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#sub2p}.
	 * @param ctx the parse tree
	 */
	void enterSub2p(BaknemParser.Sub2pContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#sub2p}.
	 * @param ctx the parse tree
	 */
	void exitSub2p(BaknemParser.Sub2pContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#sub22}.
	 * @param ctx the parse tree
	 */
	void enterSub22(BaknemParser.Sub22Context ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#sub22}.
	 * @param ctx the parse tree
	 */
	void exitSub22(BaknemParser.Sub22Context ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#base}.
	 * @param ctx the parse tree
	 */
	void enterBase(BaknemParser.BaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#base}.
	 * @param ctx the parse tree
	 */
	void exitBase(BaknemParser.BaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(BaknemParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(BaknemParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#subscript}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(BaknemParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#subscript}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(BaknemParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#supscript}.
	 * @param ctx the parse tree
	 */
	void enterSupscript(BaknemParser.SupscriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#supscript}.
	 * @param ctx the parse tree
	 */
	void exitSupscript(BaknemParser.SupscriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#msub}.
	 * @param ctx the parse tree
	 */
	void enterMsub(BaknemParser.MsubContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#msub}.
	 * @param ctx the parse tree
	 */
	void exitMsub(BaknemParser.MsubContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#msup}.
	 * @param ctx the parse tree
	 */
	void enterMsup(BaknemParser.MsupContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#msup}.
	 * @param ctx the parse tree
	 */
	void exitMsup(BaknemParser.MsupContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#msubsup}.
	 * @param ctx the parse tree
	 */
	void enterMsubsup(BaknemParser.MsubsupContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#msubsup}.
	 * @param ctx the parse tree
	 */
	void exitMsubsup(BaknemParser.MsubsupContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaknemParser#mscript}.
	 * @param ctx the parse tree
	 */
	void enterMscript(BaknemParser.MscriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaknemParser#mscript}.
	 * @param ctx the parse tree
	 */
	void exitMscript(BaknemParser.MscriptContext ctx);
}