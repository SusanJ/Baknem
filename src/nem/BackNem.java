package nem;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.Vocabulary;

import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

import nemdata.Tape6;
import nemdata.GreekLetter;
import nemdata.Grouping;
import nemdata.SpecialSymbol;
import nemdata.FunctionName;
import nemdata.Numeric;
import nemdata.BackTransHandler;
import nemdata.WellFormed;

import java.lang.Character;
import java.lang.Exception;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;

 

public class BackNem extends BaknemParserBaseListener {
 
 static boolean printParseTree = false;
 static boolean printMMLTree = false;
 static boolean trace = true;
 static boolean boilerplate = false;

 static boolean debug = false;
 static boolean debugassoc = true;
 static boolean debugexpr = false; 
 static boolean debugexprs = false;
 static boolean debugfracs = false;
 static boolean debugrads = false;
 static boolean debugmods = true;
 static boolean debugstat = false;
 static boolean debuglayout = true;
 static boolean debugsubsup = false;
 static boolean debugNum = false;
 
 static boolean visitTermNode = false;
 static boolean showTermNode = false;
 static boolean checkWellFormed = false;

 public static String invisX = "<mo>&#x2062;</mo>";
 public static String appleFun = "<mo>&#x2061;</mo>";

 static Tape6 myOutput = new Tape6( "mmlout.htm" );

 BufferedTokenStream allTokens;
 Vocabulary VOCABULARY;

 BackNem( BufferedTokenStream allTokens ){
   this.allTokens = allTokens;
   BackTransHandler.doTables();
   WellFormed.init();
   this.VOCABULARY= BaknemParser.VOCABULARY;
  }
//===================================================
  ParseTreeProperty<String> nem =
   new ParseTreeProperty<String>();

   //Annotate a tree node with its translation
  void setMML( ParseTree ctx, String s ){
   nem.put( ctx, s );
  }
   //Get a previously-saved annotation for a tree node
  String getMML( ParseTree ctx ) {
   return nem.get( ctx );
  }
//====================================================
@Override
 public void visitTerminal(TerminalNode node) {
  if (!visitTermNode) return;
  Token tok = node.getSymbol();
  String name = 
   VOCABULARY.getSymbolicName( tok.getType() );
 if (showTermNode){
  System.out.println( "Terminal node: "+name );
 }
 }

@Override 
 public void enterProg(BaknemParser.ProgContext ctx) {
  if (trace) System.out.println( "Enter prog." );
  setMML( ctx, "<math>" );
  if (trace) {
   System.out.println( " Input has: "+ctx.getChildCount()+
                     " lines." ); 
  }
  myOutput.out( "<h3>Nemeth Backtranslation Examples</h3>" );
  if (boilerplate) explain();
  myOutput.out( "<p>Nemeth Braille Math input: " );
  myOutput.out( "<ol>");
  String nem;
  String disfont = "\"sm\"";
  //Last line is EOF, ignore here
  for (int i=0; i<ctx.getChildCount()-1; i++ ){
   nem = ctx.getChild(i).getText();
   if (nem.length() > 1 && !nem.startsWith("<h3>")){
    int len = nem.length()-1;
    myOutput.out( " <li><span class="+disfont+">"
       +nem.substring(0, len)+"</span></li>" );
   }
  }
  myOutput.out( "</ol></p>" );
 
}
@Override 	
 public void exitProg(BaknemParser.ProgContext ctx)  { 
  if (trace) System.out.println( "Exit prog." );
  StringBuilder buf = new StringBuilder();
  buf.append( getMML( ctx ) );
  int num = 0;
  String ink;
  boolean skip = false;
  
  //Last item is required EOF, ignore for output
  for (int i=0; i<ctx.getChildCount()-1; i++ ){
   skip = false;
   if (debugstat){
    System.out.println( " --exit prog child: "+i+" text: "+ 
           ctx.getChild(i).getText() );
   }

   ink = getMML( ctx.getChild(i) );
   if (ink != null){
     if (ink.startsWith( "<h3>" )){
      buf.append( ink );
      myOutput.out( ink );
     } else {
      num = num+1;
      myOutput.out( "<p>Line number "+num+":");
      myOutput.out
        ("<math xmlns=\"http://www.w3.org/1998"+
         "/Math/MathML\" display=\"block\">");
      myOutput.out( getMML( ctx.getChild(i) ));
      buf.append( getMML( ctx.getChild(i) ) );
      myOutput.out( "</math>" );
      myOutput.out( "</p><hr/>" );
     }
     skip = true;
    }
  }
  if (!skip) buf.append( "</math>" );
  if (checkWellFormed){
   try {
     System.out.println( "FINAL: " );
     System.out.println( buf.toString() );
     boolean b = WellFormed.isWellFormedXML( buf.toString() );
   } catch (Exception e){
     System.out.println();
     System.out.println( "Output: "+e.getMessage() );
   }
  }//End check on well-formed XML.

  setMML( ctx, buf.toString() );
  myOutput.out( "<p></br>That's all folks!</p>" );
 }
@Override 
 public void enterStat(BaknemParser.StatContext ctx) {
  if (trace) System.out.println( "Enter stat." );
  setMML( ctx, "<stat>" ); 
 }
@Override 
 public void exitStat(BaknemParser.StatContext ctx) { 
  if (trace) System.out.println( "\n Exit stat." );

  StringBuilder buf = new StringBuilder();
  //buf.append( getMML( ctx ) );
  if (debugstat) System.out.println( "Stat children cnt: "+ctx.getChildCount() );
   //Concatenate all child nodes except CR at end
  for (int i=0; i<ctx.getChildCount()-1; i++ ){
   buf.append( getMML( ctx.getChild(i) ) );
   if (debugstat){
    System.out.println( " --exit prog child: "+i+" text: "+ 
           ctx.getChild(i).getText()+" ctx: "+ctx.getChild(i) );
   }
  }
  //buf.append( "</stat>" );
  setMML( ctx, buf.toString() );
  //myOutput.out( buf.toString() );
  if (debugstat){
   System.out.println( "stat--setting "+buf.toString() );
  }
 }
@Override public void enterHeader3(BaknemParser.Header3Context ctx) {
 setMML( ctx, ctx.getText() );
 }
@ Override 
 public void exitSpace(BaknemParser.SpaceContext ctx) {
  setMML( ctx, "<mspace></mspace>" );
 }

@Override 
 public void enterExprs(BaknemParser.ExprsContext ctx) { 
  setMML( ctx, "<mrow>" );
 }
@Override
 public void exitExprs(BaknemParser.ExprsContext ctx) { 
  if (trace) System.out.println( "\n  Exit exprs." );
  StringBuilder buf = new StringBuilder();
  buf.append( getMML( ctx ) );
  for (int i=0; i<ctx.getChildCount(); i++ ){
   buf.append( getMML( ctx.getChild(i)) );
   if (debugexprs){
     System.out.println( "  --exit exprs child: "+i+" text: "+ 
           getMML( ctx.getChild(i)) );
   }
  }
  buf.append( "</mrow>\n\r" );
  setMML( ctx, buf.toString() );
  if (debugexprs){
   System.out.println( "   exprs--setting "+buf.toString()+
      " ctx: "+ctx );
   System.out.println( " checking: "+getMML( ctx ) );
  }
}
//General expressions that -- if enclosed in grouping symbols
//to create a single row -- can be the base of a script layout
@Override
 public void exitNlayexpr(BaknemParser.NlayexprContext ctx) {
  if (trace) System.out.println( "\n   Exit nlayexpr ." );
  StringBuilder buf = new StringBuilder();
  for (int i=0; i<ctx.getChildCount(); i++ ){
    buf.append( getMML( ctx.getChild(i)) );
  } 
  setMML( ctx, buf.toString() );
  if (debuglayout){
   System.out.println( "  nlayexpr--setting "+buf.toString() +
     " ctx: "+ctx );
   System.out.println( " checking: "+getMML( ctx ) );
  }
 }
@Override 
 public void exitLayexpr(BaknemParser.LayexprContext ctx) { 
  if (trace) System.out.println( "\n   Exit layexpr ." );
  StringBuilder buf = new StringBuilder();
  for (int i=0; i<ctx.getChildCount(); i++ ){
    buf.append( getMML( ctx.getChild(i)) );
  }
  setMML( ctx, buf.toString() );
  if (debug){
   System.out.println( "  layexpr--setting "+buf.toString() +
     " ctx: "+ctx );
   System.out.println( " checking: "+getMML( ctx ) );
  }
}
//This was an error in parser, leaving it for now
/**
@Override 
public void XexitSqrts(BaknemParser.SqrtsContext ctx) {
if (trace) System.out.println( "\n   Exit sqrts ." );
  StringBuilder buf = new StringBuilder();
  for (int i=0; i<ctx.getChildCount(); i++ ){
    buf.append( getMML( ctx.getChild(i)) );
  }
  setMML( ctx, buf.toString() );
  if (debug){
   System.out.println( "  sqrts--setting "+buf.toString() +
     " ctx: "+ctx );
   System.out.println( " checking: "+getMML( ctx ) );
  }
 }
*/

//Underscripts and overscripts
 //<munderover> base underscript  overscript </munderover>
@Override
 public void enterMundov(BaknemParser.MundovContext ctx) {
  setMML( ctx, "<munderover>" );
 }

@Override
 public void exitMundov(BaknemParser.MundovContext ctx) { 
  if (trace) System.out.println( "    Exit mundov" );
  StringBuilder buf = new StringBuilder( getMML( ctx ));
  String tmp;
   //Collect pieces; should have been backtranslated below
  for (int i=0; i<ctx.getChildCount(); i++ ){
    tmp = getMML( ctx.getChild(i));
    //Ignore braille modifier indicators
    if (tmp != null){
     buf.append( getMML( ctx.getChild(i)) );
   }
  }
  buf.append( "</munderover>" );
  setMML( ctx, buf.toString() );
}
@Override
 public void enterMunder(BaknemParser.MunderContext ctx) {
  setMML( ctx, "<munder>" );
 }

@Override
 public void exitMunder(BaknemParser.MunderContext ctx) {
  if (trace) System.out.println( "    exit munder" );
  StringBuilder buf = new StringBuilder( getMML( ctx ));
  String tmp;
  for (int i=0; i<ctx.getChildCount(); i++ ){
    tmp = getMML( ctx.getChild(i));
    //Ignore braille modifier indicators
    if (tmp != null){
     buf.append( getMML( ctx.getChild(i)) );
   }
  }
  buf.append( "</munder>" );
  setMML( ctx,buf.toString() );
  if (debugmods){
   System.out.println( " munder--setting "+buf.toString() +
     " ctx: "+ctx );
   System.out.println( " checking: "+getMML( ctx ) );
  }
 
 }
@Override
 public void enterMover(BaknemParser.MoverContext ctx) {
  setMML( ctx, "<mover>" );
 }
@Override
 public void exitMover(BaknemParser.MoverContext ctx) { 
  if (trace) System.out.println( "    exit mover" );
  StringBuilder buf = new StringBuilder( getMML( ctx ));
  String tmp;
  for (int i=0; i<ctx.getChildCount(); i++ ){
    tmp = getMML( ctx.getChild(i));
    //Ignore braille modifier indicators
    if (tmp != null){
     buf.append( getMML( ctx.getChild(i)) );
   }
  }
  buf.append( "</mover>" );
  setMML( ctx,buf.toString() );
  if (debugmods){
   System.out.println( "  mover--setting "+buf.toString() +
     " ctx: "+ctx );
   System.out.println( " checking: "+getMML( ctx ) );
  }
  ;
}
@Override
 public void exitBegmod(BaknemParser.BegmodContext ctx) {
 if (trace) System.out.println( "\n   Exit begmod " );
  StringBuilder buf = new StringBuilder( "<mrow>" );
  for (int i=0; i<ctx.getChildCount(); i++ ){
    buf.append( getMML( ctx.getChild(i)) );
  }
  buf.append( "</mrow>" );
  setMML( ctx, buf.toString() );
  if (debugmods){
   System.out.println( "  begmod--setting "+buf.toString() +
     " ctx: "+ctx );
   System.out.println( " checking: "+getMML( ctx ) );
  }
}
@Override
 public void exitEndmod(BaknemParser.EndmodContext ctx) {
 if (trace) System.out.println( "\n   Exit endmod " );
  StringBuilder buf = new StringBuilder( "<mrow>" );
  for (int i=0; i<ctx.getChildCount(); i++ ){
    buf.append( getMML( ctx.getChild(i)) );
  }
  buf.append( "</mrow>" );
  setMML( ctx, buf.toString() );
  if (debugmods){
   System.out.println( "  endmod--setting "+buf.toString() +
     " ctx: "+ctx );
   System.out.println( " checking: "+getMML( ctx ) );
  }

 }
 //All the non-modified items that be modified or be modifiers
@Override
 public void exitNomod(BaknemParser.NomodContext ctx) {
 if (trace) System.out.println( "\n   Exit nomod " );
  //StringBuilder buf = new StringBuilder( "<mrow>" );
  StringBuilder buf = new StringBuilder();
  for (int i=0; i<ctx.getChildCount(); i++ ){
    buf.append( getMML( ctx.getChild(i)) );
  }
  setMML( ctx, buf.toString() );
  if (debugmods){
   System.out.println( "  nomod--setting "+buf.toString() +
     " ctx: "+ctx );
   System.out.println( " checking: "+getMML( ctx ) );
  }
}
//Indexed radicals -- MML order reversed from Nemeth:
//    <mroot> base index </mroot>.
@Override 
 public void enterIrad(BaknemParser.IradContext ctx) {
  setMML( ctx, "<mroot>" );
 }
@Override 
 public void enterIrad1(BaknemParser.Irad1Context ctx) {
  setMML( ctx, "<mroot>" );
 }
@Override 
 public void enterIrad2(BaknemParser.Irad2Context ctx) {
  setMML( ctx, "<mroot>" );
 }
@Override 
 public void enterIrad3(BaknemParser.Irad3Context ctx) {
  setMML( ctx, "<mroot>" );
 }
@Override
 public void exitIrad(BaknemParser.IradContext ctx) {
  String label = "irad";
  doIrads( ctx, label );
 }
@Override
 public void exitIrad1(BaknemParser.Irad1Context ctx) {
  String label = "irad1";
  doIrads( ctx, label );
 }
@Override
 public void exitIrad2(BaknemParser.Irad2Context ctx) {
  String label = "irad2";
  doIrads( ctx, label );
 }
@Override
 public void exitIrad3(BaknemParser.Irad3Context ctx) {
  String label = "irad3";
  doIrads( ctx, label );
 }
 // Tag and concatenate translations for base and
 // index of indexed radical 
void doIrads( ParseTree ctx, String label ){
 if (trace) System.out.println( "\n   Exit "+label );
 String ink = getMML( ctx );
 if (ink == null){
  System.out.println( "Null getMML." );
  return;
 }
 StringBuilder buf = new StringBuilder( getMML( ctx ));

 int pos = buf.length();

  int cnt = ctx.getChildCount();
  if (debugrads) System.out.println( "irad children: "+cnt );
  //for (int i = cnt-1; i==0; i-- ){
    for (int i=0; i<cnt; i++ ){
    String tmp = getMML( ctx.getChild(i));
    if (debugrads){
     System.out.println( "irad child: "+i+" "+ctx.getChild(i).getText() );
    }
    //Assumes null entries are just braille indicators 
    //to be ignored since their functions are replaced with MML tags
    //NOTE-- Insert reverses order of base and index as does MML 'mroot'
    if (tmp != null){
     buf.insert( pos, "<mrow>"+getMML(ctx.getChild(i))+"</mrow>" );
    } else {
     if (debugrads)System.out.println( "irad null child ink: "+i );
    }
  }
  buf.append( "</mroot>" );
  setMML( ctx, buf.toString() );
  if (debugrads){
   System.out.println( label+"--setting "+buf.toString() +
     " ctx: "+ctx );
   //System.out.println( " checking: "+getMML( ctx ) );
  }
 }
@Override 
 public void exitRindex(BaknemParser.RindexContext ctx) {
  if (trace) System.out.println( "    exit Rindex" );
  StringBuilder buf = new StringBuilder();
  for (int i=0; i<ctx.getChildCount(); i++ ){
    String tmp = getMML( ctx.getChild(i));
    if (tmp != null){
     buf.append( getMML( ctx.getChild(i)) );
    }
  }
  setMML( ctx, buf.toString() );
  if (debugrads){
   System.out.println( "  rindex--setting "+buf.toString() +
     " ctx: "+ctx );
   System.out.println( " checking: "+getMML( ctx ) );
  }
 }
@Override 
 public void enterSqrt(BaknemParser.SqrtContext ctx) {
 sqrtStartTag( ctx );
}
 //1st level inner (nested) sqrt
public void enterSqrt1(BaknemParser.Sqrt1Context ctx) {
 sqrtStartTag( ctx );
}
 //2nd level inner (nested) sqrt
public void enterSqrt2(BaknemParser.Sqrt2Context ctx) {
 sqrtStartTag( ctx );
}
 //3rd level inner (nested) sqrt
public void enterSqrt3(BaknemParser.Sqrt3Context ctx) {
 sqrtStartTag( ctx );
}
public void sqrtStartTag( ParseTree ctx ){
 setMML( ctx, "<msqrt>" );
}
@Override 
 public void exitSqrt(BaknemParser.SqrtContext ctx) {

 sqrtExpr( ctx, "exitSqrt" );
/**
 if (trace) System.out.println( "\n   Exit sqrt." );
  StringBuilder buf = new StringBuilder( getMML( ctx ));
  for (int i=0; i<ctx.getChildCount(); i++ ){
    String tmp = getMML( ctx.getChild(i));
    if (tmp != null){
     buf.append( getMML( ctx.getChild(i)) );
    }
  }
  buf.append( "</msqrt>" );
  setMML( ctx, buf.toString() );
  if (debugrads){
   System.out.println( "  sqrt--setting "+buf.toString() +
     " ctx: "+ctx );
   System.out.println( " checking: "+getMML( ctx ) );
  }
 */
 }
@Override 
 public void exitSqrt1(BaknemParser.Sqrt1Context ctx) {
  sqrtExpr( ctx, "exitSqrt1" );
 }
@Override 
 public void exitSqrt2(BaknemParser.Sqrt2Context ctx) {
  sqrtExpr( ctx, "exitSqrt2" );
 }
@Override 
 public void exitSqrt3(BaknemParser.Sqrt3Context ctx) {
  sqrtExpr( ctx, "exitSqrt3" );
 }
 public void sqrtExpr( ParseTree ctx, String label ){
  if (trace) System.out.println( "\n   Exit "+label );
  StringBuilder buf = new StringBuilder( getMML( ctx ));
  for (int i=0; i<ctx.getChildCount(); i++ ){
    String tmp = getMML( ctx.getChild(i));
    //Assumes null entries are just braille indicators 
    //to be ignored since replaced by MML tagss
    if (tmp != null){
     buf.append( getMML( ctx.getChild(i)) );
    }
  }
  buf.append( "</msqrt>" );
  setMML( ctx, buf.toString() );
  if (debug){
   System.out.println( label+"--setting "+buf.toString() +
     " ctx: "+ctx );
   //System.out.println( " checking: "+getMML( ctx ) );
  }
 }

//Items allowed in simple sqrt
@Override
 public void exitNor(BaknemParser.NorContext ctx) { 

 doNorItems( ctx, "nor" );
 /**
 if (trace) System.out.println( "\n   Exit nor." );
  StringBuilder buf = new StringBuilder();
  for (int i=0; i<ctx.getChildCount(); i++ ){
    buf.append( getMML( ctx.getChild(i)) );
  }
  setMML( ctx, buf.toString() );
  if (debug){
   System.out.println( "   nor--setting "+buf.toString() +
     " ctx: "+ctx );
   System.out.println( " checking: "+getMML( ctx ) );
  }
 */
}
@Override
 public void exitNor1(BaknemParser.Nor1Context ctx) { 
  doNorItems( ctx, "nor1" );
 }
@Override
 public void exitNor2(BaknemParser.Nor2Context ctx) { 
  doNorItems( ctx, "nor2" );
 }
@Override
 public void exitNor3(BaknemParser.Nor3Context ctx) { 
  doNorItems( ctx, "nor3" );
 }
 //  Concatenate expressions allowed in outer radical
 // and in the inner radicals
public void doNorItems( ParseTree ctx, String label ){
 if (trace) System.out.println( "\n   Concat: "+label );
 StringBuilder buf = new StringBuilder();
 boolean invis = false;
 if (ctx.getChildCount()==2) invis = true;
  for (int i=0; i<ctx.getChildCount(); i++ ){
    buf.append( getMML( ctx.getChild(i)) );
    if (i == 0 && invis) buf.append( invisX );
  }
  setMML( ctx, buf.toString() );
  if (debugrads){
   System.out.println( label+"--setting "+buf.toString() +
     " ctx: "+ctx );
  }
}
 
@Override 
 public void enterExpr(BaknemParser.ExprContext ctx) { 
  setMML( ctx, "<expr>" );
 }
@Override
 public void exitExpr(BaknemParser.ExprContext ctx) { 
  if (trace) System.out.println( "\n   Exit expr." );
  int cnt = ctx.getChildCount();
  boolean invis = false;
  if (cnt == 2){
   String text = ctx.getText();
  if (debugexpr){
   System.out.println( "2 child nodes, Invis times? text: "+ text );
   System.out.println( "ink 0: "+getMML( ctx.getChild(0) ) );
   System.out.println( "ink 1: "+getMML( ctx.getChild(1) ) );
  }
   int imo = getMML(ctx.getChild(1)).indexOf( "<mo>" );
   if (imo == -1) invis = true;
  }
  StringBuilder buf = new StringBuilder( "<mrow>");
  //if (ctx.var() == null ) buf.append( getMML( ctx ) );
  if (debugexpr){
   System.out.println("expr collate children cnt: "+cnt);
  }
  for (int i=0; i<ctx.getChildCount(); i++ ){
   buf.append( getMML( ctx.getChild(i)) );
   if (invis && i==0) buf.append( invisX );
  }
  //if (ctx.var() == null ) buf.append( "</expr>" );
  buf.append( "</mrow>" );
  setMML( ctx, buf.toString() );
  if (debugexpr){
   System.out.println( "   expr--setting "+buf.toString() +
     " ctx: "+ctx );
   System.out.println( " checking: "+getMML( ctx ) );
  }
}
@Override 
 public void exitNom(BaknemParser.NomContext ctx) { 
  if (trace) System.out.println( "\n   Exit nom ." );
  StringBuilder buf = new StringBuilder();
  for (int i=0; i<ctx.getChildCount(); i++ ){
    buf.append( getMML( ctx.getChild(i)) );
  }
  setMML( ctx, buf.toString() );
  if (debug){
   System.out.println( "   nom--setting "+buf.toString() +
     " ctx: "+ctx );
   System.out.println( " checking: "+getMML( ctx ) );
  }
}
 //  Items in hypercomplex fraction include required
 // simple and complex fractions
@Override 
 public void exitNofch(BaknemParser.NofchContext ctx) { 
 if (trace) System.out.println( "\n   Exit nofch." );
  StringBuilder buf = new StringBuilder( "<mrow>" );
  for (int i=0; i<ctx.getChildCount(); i++ ){
    buf.append( getMML( ctx.getChild(i)) );
  }
  buf.append( "</mrow>" );
  setMML( ctx, buf.toString() );
  if (debugfracs){
   System.out.println( "   nofch--setting "+buf.toString() +
     " ctx: "+ctx );
   System.out.println( " checking: "+getMML( ctx ) );
  }
}
 //Items allowed in complex fraction include simple fractions
@Override 
 public void exitNofc(BaknemParser.NofcContext ctx) { 
 if (trace) System.out.println( "\n   Exit nofc." );
  StringBuilder buf = new StringBuilder( "<mrow>" );
  for (int i=0; i<ctx.getChildCount(); i++ ){
    buf.append( getMML( ctx.getChild(i)) );
  }
  buf.append( "</mrow>" );
  setMML( ctx, buf.toString() );
  if (debug){
   System.out.println( "   nofc--setting "+buf.toString() +
     " ctx: "+ctx );
   System.out.println( " checking: "+getMML( ctx ) );
  }
}
 //Items allowed in simple fraction
@Override
 public void exitNof(BaknemParser.NofContext ctx) { 
 if (trace) System.out.println( "\n   Exit nof." );
  StringBuilder buf = new StringBuilder();
  for (int i=0; i<ctx.getChildCount(); i++ ){
    buf.append( getMML( ctx.getChild(i)) );
  }
  setMML( ctx, buf.toString() );
  if (debug){
   System.out.println( "   nof--setting "+buf.toString() +
     " ctx: "+ctx );
   System.out.println( " checking: "+getMML( ctx ) );
  }
}
@Override 
 public void exitMscript(BaknemParser.MscriptContext ctx) { 
  if (trace) System.out.println( "\n   Exit mscript." );
  StringBuilder buf = new StringBuilder();
  for (int i=0; i<ctx.getChildCount(); i++ ){
   buf.append( getMML( ctx.getChild(i)) );
  }
  setMML( ctx, buf.toString() );
  if (debug) System.out.print( "base: "+buf.toString() );
}
/** <msubsup>base  subscript    superscript</msubsup> */
@Override
 public void enterMsubsup(BaknemParser.MsubsupContext ctx) {
  setMML( ctx, "<msubsup>" );
 }
@Override 
 public void enterMsup(BaknemParser.MsupContext ctx) {
  setMML( ctx, "<msup>" );
 }
@Override 
 public void enterMsub(BaknemParser.MsubContext ctx) {
  setMML( ctx, "<msub>" );
 }
@Override
 public void enterMmmfrac(BaknemParser.MmmfracContext ctx) { 
  setMML( ctx, "<mfrac>" );
}

 //Hypercomplex fraction
@Override
 public void exitMmmfrac(BaknemParser.MmmfracContext ctx) {
  if (trace) System.out.println( "\n   Exit mmmfrac." );
  StringBuilder buf = new StringBuilder( );
  buf.append( getMML( ctx ) );
  for (int i=0; i<ctx.getChildCount(); i++ ){
    String doneBelow = getMML( ctx.getChild(i) );
    //Should just be the Nem. indicators to be ignored....
    if (doneBelow == null){
      System.out.println( "Exit mmmfrac -- null child: "+i+" "+
       ctx.getChild(i).getText() );
    } else {
      buf.append( getMML( ctx.getChild(i)) );
    }
  }
  buf.append( "</mfrac>" );
  if (debugfracs){
   System.out.println( "mmmfrac: "+buf.toString() );
  }
  setMML( ctx, buf.toString() ); 
}
@Override 
 public void enterMmfrac(BaknemParser.MmfracContext ctx) { 
  setMML( ctx, "<mfrac>" );
 }
@Override 
 public void exitMmfrac(BaknemParser.MmfracContext ctx) { 
 if (trace) System.out.println( "\n   Exit mmfrac." );
  StringBuilder buf = new StringBuilder( );
  buf.append( getMML( ctx ) );
  for (int i=0; i<ctx.getChildCount(); i++ ){
    String doneBelow = getMML( ctx.getChild(i) );
    //Should just be the Nem. indicators to be ignored....
    if (doneBelow == null){
      if (debugfracs){
      System.out.println( "Exit mmfrac -- null child: "+i+" "+
       ctx.getChild(i).getText() );
      }
    } else {
      buf.append( getMML( ctx.getChild(i)) );
    }
  }
  buf.append( "</mfrac>" );
  if (debugfracs){
   System.out.println( "mmfrac: "+buf.toString() );
  }
  setMML( ctx, buf.toString() );
}
 //Find best place to put msup start tag
public static String insertMsup( String seq1, String seq2, String stag, String etag ){
 String working = seq1;
 int i1 = working.length();

 boolean done = false;
 boolean b;
 while (!done){
   b = working.endsWith( "</mrow>" );
   if (b){
    working = working.substring(0,i1-7 );
    i1 = working.length();
   } else {
    done = true;
   }
  } //End while
 
 //Finding base so msup goes just before base
 int pos = seq1.lastIndexOf( "<mr" ); // last mrow to insert msub after

 //We need to be searching in seq2 for script
 int pos1 = seq1.indexOf( "</mr", pos ); // next /mrow to insert /msub before
 String part1 = seq1.substring(0, pos);
 String part2 = "</mrow>" + stag.toUpperCase()+"<mrow>";
 String part3 = seq1.substring( pos );// + "</mrow><mrow>";
 String part4 = seq2 + etag.toUpperCase();
 System.out.println( "part1: "+part1) ;
 System.out.println( "part2: "+part2) ;
 System.out.println( "part3: "+part3) ;
 System.out.println( "part4: "+part4) ;

 String result = seq1.substring(0, pos) +
                "</mrow>" + stag+"<mrow>" +
                seq1.substring( pos ) + 

                seq2 + etag ;
 System.out.println( "IMSUB -- INPUT and RESUlt" );
 //System.out.println( seq1+seq2 );
 System.out.println( seq1);
 System.out.println();
 System.out.println( seq2 );
 System.out.println();
 System.out.println( result );
 return result;
}
                 
@Override 
public void exitMfrac(BaknemParser.MfracContext ctx) { 

  if (trace) System.out.println( "\n   Exit mfrac." );
  StringBuilder buf = new StringBuilder( "<mfrac>" );
  for (int i=0; i<ctx.getChildCount(); i++ ){
    String doneBelow = getMML( ctx.getChild(i) );
    //Should just be the Nem. indicators to be ignored....
    if (doneBelow == null){
     if (debugfracs){
      System.out.println( "Exit Mfrac -- null child: "+i+" "+
       ctx.getChild(i).getText() );
     }
    } else {
      buf.append( "<mrow>"+getMML( ctx.getChild(i))+"</mrow>" );
    }
  }
  buf.append( "</mfrac>" );
  if (debugfracs){
   System.out.println( "mfrac: "+buf.toString() );
  }
  setMML( ctx, buf.toString() );
}

@Override 
 public void exitMsup(BaknemParser.MsupContext ctx) { 
  if (trace) System.out.println( "\n   Exit msup." );
  StringBuilder buf = new StringBuilder();
 //buf.append( getMML( ctx ) );
  if (debugassoc){
   System.out.println( "msup chilren cnt: "+ctx.getChildCount());
  }
  
  //Since Nemeth doesn't use an indicator *before* the base of a
  //subscript the parser doesn't know where it starts.  
 
  buf.append( "<msup>" );
  String seq1 = null;
  String seq2 = null;
  for (int i=0; i<ctx.getChildCount(); i++ ){
   if (!ctx.getChild(i).getText().startsWith( "^") &&
       !ctx.getChild(i).getText().startsWith( ";") &&
       !ctx.getChild(i).getText().startsWith( "\"")
      ){
    String doneBelow = getMML( ctx.getChild(i));
    if (doneBelow == null){
     if (debugassoc){
      System.out.println( "Exit Msup -- null ink for brl child: "+i+" "+
      ctx.getChild(i).getText() );
     }
    }else {
     if (debugassoc){
      System.out.println( "Exit Msup -- ink expr child: "+i+" "+
       doneBelow );
      }
      if (i==0) seq1 =  doneBelow;
      if (i>0) seq2 =  doneBelow;
//THIS IS THE ONE THAT NEEDS THE MSUP NEAR ITS END
      //if (i > 0) buf.append( "<msup>" );
      buf.append( doneBelow );
    }
   }
  }
/**
  System.out.println( "in exit msup Checking if seq1 valid." );
   try {
  System.out.println( seq1 );
  boolean b = WellFormed.isWellFormedXML( seq1);
  } catch (Exception e){
   System.out.println();
   System.out.println( "SEQ1 Output: "+e.getMessage() );
  }
  System.out.println( "in exit msup Checking if seq2 valid." );
   try {
  System.out.println( seq2 );
  boolean b = WellFormed.isWellFormedXML( seq2 );
  } catch (Exception e){
   System.out.println();
   System.out.println( "SEQ2 Output: "+e.getMessage() );
  }
  String better = insertMsup( seq1, seq2, "<msup>", "</msup>" );
  String mobetter = better;
  System.out.println( "in exit msup Checking if mobetter valid." );
   try {
  System.out.println( mobetter );
  boolean b = WellFormed.isWellFormedXML( mobetter );
  } catch (Exception e){
   System.out.println();
   System.out.println( "MOBETTER Output: "+e.getMessage() );
  }
*/
  buf.append( "</msup>" );
  //if (debugassoc) System.out.println( "msup: "+buf.toString() );
  setMML( ctx, buf.toString());
 }
@Override 
 public void exitMsubsup(BaknemParser.MsubsupContext ctx) { 
  if (trace) System.out.println( "\n   Exit msubsup." );
  StringBuilder buf = new StringBuilder();
  buf.append( getMML( ctx ) );
  if (debugsubsup){
   System.out.println( "msupsup children: "+ ctx.getChildCount() );
  }
  for (int i=0; i<ctx.getChildCount(); i++ ){
    String doneBelow = getMML( ctx.getChild(i));
    if (doneBelow == null){
     if (debugsubsup){
      System.out.println( "Exit Msubsup -- null child: "+i+" "+
         ctx.getChild(i).getText() );
     }
    } else {
      buf.append( getMML( ctx.getChild(i)) );
    }
  }
  buf.append( "</msubsup>" );
  if (debugsubsup){
   System.out.println( "msubsup: "+ buf.toString() );
  }
  setMML( ctx, buf.toString() );
 }
@Override
 public void exitSubscript(BaknemParser.SubscriptContext ctx) {
  if (trace) System.out.println( "\n   Exit subscript (for msubsup)." );
  StringBuilder buf = new StringBuilder( "<mrow>" );
  if (debugsubsup){
   System.out.println( "No. of children: "+ ctx.getChildCount());
  }
  for (int i=0; i<ctx.getChildCount(); i++ ){
    String doneBelow = getMML( ctx.getChild(i));
    if (debugsubsup){
     System.out.println( "Exit subscript -- child: "+i+" "+
          ctx.getChild(i).getText() );
    }
    if (doneBelow == null){
     if (debugsubsup){
      System.out.println( "Exit subscript -- null child: "+i+" "+
      ctx.getChild(i).getText() );
     }
    } else {
      buf.append( getMML( ctx.getChild(i)) );
    }
  }
  buf.append( "</mrow>" );
  if (debugsubsup){
   System.out.println( "subscript: "+ buf.toString() );
  }
  setMML( ctx, buf.toString() );
}

@Override
 public void exitSupscript(BaknemParser.SupscriptContext ctx) {
 if (trace) System.out.println( "\n   Exit supscript (for msubsup)." );
  StringBuilder buf = new StringBuilder( "<mrow>" );
  for (int i=0; i<ctx.getChildCount(); i++ ){
    String doneBelow = getMML( ctx.getChild(i));
    if (doneBelow == null){
     if (debugsubsup){
      System.out.println( "Exit supscript  -- null child: "+i+" "+
      ctx.getChild(i).getText() );
     }
    } else {
      buf.append( getMML( ctx.getChild(i)) );
    }
  }
  buf.append( "</mrow>" );
  if (debugsubsup){
   System.out.println( "supscript: "+ buf.toString() );
  }
  setMML( ctx, buf.toString() );
 }
	
@Override 
 public void exitMsub(BaknemParser.MsubContext ctx) { 
  if (trace) System.out.println( "\n   Exit msub." );
  StringBuilder buf = new StringBuilder();
  buf.append( getMML( ctx ) );
  for (int i=0; i<ctx.getChildCount(); i++ ){
   if (!ctx.getChild(i).getText().startsWith( "^") &&
       !ctx.getChild(i).getText().startsWith( ";") &&
       !ctx.getChild(i).getText().startsWith( "\"")
      ){
    String doneBelow = getMML( ctx.getChild(i));
    if (doneBelow == null){
    if (debugsubsup){
     System.out.println( "Exit Msub -- null child: "+i+" "+
      ctx.getChild(i).getText() );
    }
    }else{
      buf.append( getMML( ctx.getChild(i)) );
    }
   }
  }
  buf.append( "</msub>" );
  setMML( ctx, buf.toString() );
 }
@Override 
 public void exitBase(BaknemParser.BaseContext ctx) {
  if (trace) System.out.println( "\n   Exit base." ); 
  StringBuilder buf = new StringBuilder();

  System.out.println( "base child cnt: "+ctx.getChildCount() );
  buf.append( "<mrow>" );
  for (int i=0; i<ctx.getChildCount(); i++ ){
   buf.append( getMML( ctx.getChild(i)) );
   System.out.println( "Exit base child: "+i+" ink: "+
      getMML( ctx.getChild(i)) );
  }
  buf.append( "</mrow>" );
  setMML( ctx, buf.toString());
  if (debugsubsup) System.out.println( "base: "+buf.toString() );
 }
@Override 
 public void exitScript(BaknemParser.ScriptContext ctx) {
  if (trace) System.out.println( "\n   Exit script." ); 
  StringBuilder buf = new StringBuilder();
  buf.append( "<mrow>" );
  for (int i=0; i<ctx.getChildCount(); i++ ){
   buf.append( getMML( ctx.getChild(i)) );
  }
  buf.append( "</mrow>" );
  if (debugsubsup){
   System.out.println( "script: "+ buf.toString() );
  }
  setMML( ctx, buf.toString());
 }

 //
@Override 
 public void enterNumsub(BaknemParser.NumsubContext ctx) {
  setMML( ctx, "<msub>" ); 
 }
 //Nemeth Numeric Subscript, Sec. 77 
@Override 
 public void exitNumsub(BaknemParser.NumsubContext ctx) {
  if (trace) System.out.println( "\n    exit numsub" );
  StringBuilder buf = new StringBuilder();
  buf.append( getMML( ctx ) );
  for (int i=0; i<ctx.getChildCount(); i++ ){
   buf.append( getMML( ctx.getChild(i)) );
  }
  buf.append( "</msub>" );
  setMML( ctx, buf.toString() );
 }
 
@Override 
 public void exitLgrp(BaknemParser.LgrpContext ctx) {
  //Could consider using mfenced for more options
  String brl = ctx.getChild(0).getText();
  String ink = Grouping.backTransLgrp( brl );
  setMML( ctx, "<mo fence=\"true\">"+
               ink+
               "</mo>" );
 }
               
@Override 
 public void exitRgrp(BaknemParser.RgrpContext ctx) { 
  String brl = ctx.getChild(0).getText();
  String ink = Grouping.backTransRgrp( brl );
  setMML( ctx, "<mo fence=\"true\">"+
               ink+
               "</mo>" );
 }
@Override
 public void exitFunWithArg(BaknemParser.FunWithArgContext ctx) { 
  if (trace) System.out.println( "exit functionWithArgument" );
  boolean prod = false;
  if (ctx.varXfunabb() != null ) prod = true;
  if (debug){
  System.out.println( "No. of children "+ctx.getChildCount()+
  " child is product: "+prod );
  }
  StringBuilder buf = new StringBuilder();
  buf.append( "<mrow>" );
  buf.append( getMML( ctx.getChild( 0 ) ) );
  buf.append( appleFun ); //Nem. has required space here
  buf.append( getMML( ctx.getChild( 2 ) ) );
  buf.append( "</mrow>" );
  if (debug) System.out.print( "fun with arg: "+buf.toString() );
  setMML( ctx, buf.toString() );
}
@Override
 public void exitVarXfunabb(BaknemParser.VarXfunabbContext ctx) {
 String ink = BackTransHandler.backVarXFun( ctx.getText() );
 setMML( ctx, "<mrow>"+ink+"</mrow>");
 }
@Override 
 public void exitFunabb(BaknemParser.FunabbContext ctx) {
  //TO-DO Use translation table 
  String ink = FunctionName.transBrlFunAbbr( ctx.getChild(0).getText() );
  setMML( ctx, "<mi>"+ink+"</mi>" );
 }
@Override 
 public void exitBinop(BaknemParser.BinopContext ctx) {
  //TO-DO Use translation table
  setMML( ctx, "<mo>"+ctx.getChild(0).getText()+"</mo>" );
}
//Miscellaneous special symbols
@Override
 public void exitSpecsym(BaknemParser.SpecsymContext ctx) {
  String entity = SpecialSymbol.getEntity( ctx.getText() );
  setMML( ctx, "<mo>"+entity+"</mo>" );
 }

//Comparison with possible right argument
@Override public void exitCmpr(BaknemParser.CmprContext ctx) { 
 //TO-DO Use translation table

  if (debug) System.out.println( "exit cmpr" );
 String tmp = ctx.getChild(0).getText().toLowerCase();
 if (debug) System.out.println( "exit cmpr input: "+ tmp );
 int cnt = ctx.getChildCount();
 if (debug){
 System.out.println( "Child count: "+ctx.getChildCount() );
 }
 StringBuilder buf = new StringBuilder();
 
 String ink = SpecialSymbol.getEntity( tmp );
 if (ink != null){
  buf.append( "<mo>"+ink+"</mo>" );
 } else {
  System.out.println( "Cannot backtrans comparison symbol: |"+
     tmp +"|");
 }
 /**
 if (tmp.equals( " .k") || tmp.equals( " .k ")){
  buf.append( "<mo>=</mo>" );
 } else {
  System.out.println( "Cannot backtrans comparison symbol: |"+
     tmp +"|");
 }
*/
 if (cnt == 1){
  setMML( ctx, buf.toString() );
  return;
 }
  //TO-DO What about space?
 String spac = getMML(ctx.getChild( 1 ));
 if (debug) System.out.println( "spac: |"+spac+"|" );
 String arg = getMML(ctx.getChild( 2 ));
 if (debug) System.out.println( "arg: "+arg );
 if (arg != null) buf.append( arg );
 setMML( ctx, buf.toString() );
}
@Override
 public void exitVar(BaknemParser.VarContext ctx) {

  if (trace) System.out.println( "exit var" );
  if (ctx.greeks() != null ){
   setMML( ctx, getMML( ctx.getChild( 0 ) ) );
   return;
  }

  List<BaknemParser.SingleLetContext> sls = ctx.singleLet();
  if (sls != null && sls.size() > 0){
   System.out.println( "in var doing sls logic list size: "+
      sls.size() );
   StringBuilder buf = new StringBuilder();
   String brl;
   String ink;
   for (BaknemParser.SingleLetContext sl : sls){
    brl = sl.getText();
    ink =  BackTransHandler.backLetter2Tok( brl );
    if (debugassoc) System.out.println( "brl: "+brl+" ink: "+ink );
    buf.append( BackTransHandler.backLetter2Tok( brl ));
   } 
   if (debugassoc){
    System.out.println( "var sls: "+buf.toString() );
   }
   setMML( ctx, buf.toString() );
   if (debug) System.out.println( "sls: "+buf.toString() );
   return;
   }

  //TO-DO Use translation table 

  String ink = 
     BackTransHandler.backLetter2Tok( ctx.getChild(0).getText());
  System.out.println( "var 1 child: "+ink );
  setMML( ctx, ink );
 }

@Override
 public void exitGreeks(BaknemParser.GreeksContext ctx) { 
  if (trace) System.out.println( "exit Greek letters." );
  StringBuilder buf = new StringBuilder();
  String grkEntity;
  for (int i=0; i<ctx.getChildCount(); i++ ){
   grkEntity = GreekLetter.value( ctx.getChild(i).getText() );
   if (debug){
    System.out.println( "ge: "+ grkEntity+" "+ctx.getChild(i).getText() );
   }
   if (grkEntity != null){
    buf.append(  "<mo>"+grkEntity+"</mo>" );
   } else {
    System.out.println( "Cannot backtrans as Greek: |"+
                        ctx.getChild(i).getText()+"|" );
    System.exit( 0 );
   }    
  }
  setMML( ctx, buf.toString() );
 }
@Override 
 public void exitNumber(BaknemParser.NumberContext ctx) {
  if (trace) System.out.println( "exit Number" );
  String brlNumber = ctx.getChild(0).getText();
  TerminalNode ixg = ctx.INTxGREEK();
  if (ixg != null){
   String gink =  Numeric.backTransNum2Tok( brlNumber, true );
   if (debugNum){
    System.out.println( "INTxGREEK: "+brlNumber+" bt: "+gink );
   }
   setMML( ctx, gink );
   return;
  }
  String ink =  Numeric.backTransNum2Tok( brlNumber, false );
  if (debugNum){
   System.out.println( "Num brl: "+brlNumber+" mml: "+ ink );
  }
  setMML( ctx, ink );
}
public static void explain(){
 myOutput.out( "<p>This webpage and the"+
  " MathML-based backtranslation"+
  " of the braille math"+
  " were produced automatically by "+
  " <a href=\"https://github.com/SusanJ/Baknem\">BackNem 3.0</a>.</p>"+
  " <p>BackNem is a new  Java application which "+
  " uses a  two-step process"+
  " to convert Nemeth braille math to MathML."+
  " The first step analyzes the braille input"+
  " using an ANTLR 4 parser generated from"+
  " a Nemeth grammar developed specifically for"+
  " BackNem 3.0.  The second step backtranslates "+
  " the parser output using a custom procedure "+  
  " implemented in Java. (This webpage utilizes"+
  " <a href=\"https://www.mathjax.org/\">MathJax<a> for"+
  " rendering since MathJax can display MathML mathematics"+
  " in any browser.)</p>"); 
}
//===========================================================
  public static void main( String[] args ) throws Exception {
//===========================================================

 System.out.println( "\n    Welcome to BackNem! " );
 
 String inputFile = null;
 CharStream input = null;
 if ( args.length > 0 ) inputFile = args[0];
 if (inputFile == null){
    Reader myReader = new InputStreamReader( System.in, "UTF-8");
    CodePointCharStream cpcs = CharStreams.fromReader( myReader );
    input = cpcs;
 } else {
    File f = new File( inputFile );
    if (f.exists() && !f.isDirectory() )  {
       input = CharStreams.fromFileName( inputFile );
    } else {
       System.out.println( "\n OOPS! Cannot find input file: "
                           +inputFile );
       System.exit( 0 );
    }
  }

    //Tape6 myOutput = new Tape6( "mmlout.txt" );
    myOutput.mjHeader( "BakNem 3.0 Test Page" );
    myOutput.setAddFooter( true );

/**  I. Connect input to lexer, have it create a token stream,
        provided token stream to parser and instruct parser to
        build a parse tree.  
*/
        // The names and location of the/lexer and parser
        // depends on how they were created from their
        //respective grammars
        BaknemLexer lexer = new BaknemLexer( input );
        CommonTokenStream tokens = new CommonTokenStream( lexer );
       BaknemParser parser = new BaknemParser( tokens ); 
        parser.setBuildParseTree( true );
		
/**  II. Start tree with the topmost rule in the Parser 
         grammar.  (Rule #0 if grammar starts with that one.)
*/
         ParseTree tree = parser.prog();
         String x = tree.toStringTree( parser );
         if (printParseTree){
          System.out.println( "     PARSE TREE: ");
          System.out.println( x );
         }
        //myOutput.println( "     PARSE TREE: ");
        //wrap( tmpTree, 60, myOutput );

/**  III. Insert logic to walk and annotate tree. */
          
          //Custom class that extends BaseListener generated by ANTLR
          BackNem proc = new BackNem( tokens );
          ParseTreeWalker walker = new ParseTreeWalker();
          walker.walk( proc, tree );

/**  IV. Display annotation   */

     if (printMMLTree){
      System.out.println( "MML ANNOTATION");
      System.out.println( proc.getMML( tree ) );
     }

    //System.out.println();
     //System.out.println( "      ***Translation***" );
     //System.out.println(" Translated braille from annotated tree: ");
     //System.out.println( bt.getBrl( tree ) );

     myOutput.finishTape6( true );

 }//End Main.
}//End Class BackNem;