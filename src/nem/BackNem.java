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
import nemdata.SpecialSymbol;
import nemdata.FunctionName;
import nemdata.Numeric;
import nemdata.BackTransHandler;

import java.lang.Character;
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
 
 static boolean trace = true;
 static boolean debug = true;
 static boolean debugrads = false;
 static boolean debugmods = true;
 static boolean debugstat = false;
 static boolean debugexprs = false;
 static boolean debugexpr = true; 
 static boolean debugsubsup = true;
 static boolean debugfracs = true;
 static boolean debugNum = true;

 public static String invisX = "<mo>&InvisibleTimes;</mo>";
 public static String appleFun = "<mo>&ApplyFunction;</mo>";

 static Tape6 myOutput = new Tape6( "mmlout.htm" );

 BufferedTokenStream allTokens;

 BackNem( BufferedTokenStream allTokens ){
   this.allTokens = allTokens;
   BackTransHandler.doTables();
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
 public void enterProg(BaknemParser.ProgContext ctx) {
  if (trace) System.out.println( "Enter prog." );
  setMML( ctx, "<math>" );
  if (trace) {
   System.out.println( " Input has: "+ctx.getChildCount()+
                     " lines." ); 
  }
  myOutput.out( "<p>Nemeth Braille Math input: " );
  myOutput.out( "<ol>");
  String nem;
  
  for (int i=0; i<ctx.getChildCount(); i++ ){
   nem = ctx.getChild(i).getText();
   if (nem.length() > 1 && !nem.startsWith("<h3>")){
    int len = nem.length()-1;
    myOutput.out( " <li><span class=\"sm\">"
       +nem.substring(0, len)+"</span></li>" );
   }
  }
  myOutput.out( "</ol></p>" );
  myOutput.out( "<p>This webpage and the"+
  " MathML-based backtranslation"+
  " of the braille math"+
  " were produced automatically by "+
  " <a href=\"https://github.com/SusanJ/Baknem\">Backnem 2.0</a>.</p>"+
  " <p>Backnem is a new  Java application which "+
  " uses a  two-step process"+
  " to convert Nemeth braille math to MathML."+
  " The first step analyzes the braille input"+
  " using an ANTLR 4 parser generated from"+
  " a Nemeth grammar developed specifically for"+
  " Backnem 2.0.  The second step backtranslates "+
  " the parser output using a custom procedure "+  
  " implemented in Java. (This webpage utilizes"+
  " <a href=\"https://www.mathjax.org/\">MathJax<a> for"+
  " rendering since MathJax can display MathML mathematics"+
  " in any browser.)</p>"); 
  
}
@Override 	
 public void exitProg(BaknemParser.ProgContext ctx) { 
  if (trace) System.out.println( "Exit prog." );
  StringBuilder buf = new StringBuilder();
  buf.append( getMML( ctx ) );
  int num = 0;
  String ink;
  for (int i=0; i<ctx.getChildCount(); i++ ){
   if (debugstat){
    System.out.println( " --exit prog child: "+i+" text: "+ 
           ctx.getChild(i).getText() );
   }

   ink = getMML( ctx.getChild(i) );

   if (ink.startsWith( "<h3>" )){
    buf.append( ink );
    myOutput.out( ink );
   } else {
    num = num+1;
    myOutput.out( "<p>Line number "+num+":");
    myOutput.out
   ("<math xmlns=\"http://www.w3.org/1998/Math/MathML\" display=\"block\">");

   myOutput.out( getMML( ctx.getChild(i) ));
   buf.append( getMML( ctx.getChild(i) ) );
   myOutput.out( "</math>" );
   myOutput.out( "</p><hr/>" );
   }
  }
  buf.append( "</math>" );
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
  setMML( ctx, "<mi> </mi>" );
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
   System.out.println( "2 child nodes, Invis times? text: "+ text );
   invis = true;
  }
  StringBuilder buf = new StringBuilder();
  //if (ctx.var() == null ) buf.append( getMML( ctx ) );
  System.out.println("expr collate children cnt: "+cnt);
  for (int i=0; i<ctx.getChildCount(); i++ ){
   buf.append( getMML( ctx.getChild(i)) );
   if (invis && i==0) buf.append( invisX );
  }
  //if (ctx.var() == null ) buf.append( "</expr>" );
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
      System.out.println( "Exit mmfrac -- null child: "+i+" "+
       ctx.getChild(i).getText() );
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
@Override 
public void exitMfrac(BaknemParser.MfracContext ctx) { 

  if (trace) System.out.println( "\n   Exit mfrac." );
  StringBuilder buf = new StringBuilder( "<mfrac>" );
  for (int i=0; i<ctx.getChildCount(); i++ ){
    String doneBelow = getMML( ctx.getChild(i) );
    //Should just be the Nem. indicators to be ignored....
    if (doneBelow == null){
      System.out.println( "Exit Mfrac -- null child: "+i+" "+
       ctx.getChild(i).getText() );
    } else {
      buf.append( getMML( ctx.getChild(i)) );
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
  buf.append( getMML( ctx ) );
  for (int i=0; i<ctx.getChildCount(); i++ ){
   if (!ctx.getChild(i).getText().startsWith( "^") &&
       !ctx.getChild(i).getText().startsWith( ";") &&
       !ctx.getChild(i).getText().startsWith( "\"")
      ){
    String doneBelow = getMML( ctx.getChild(i));
    if (doneBelow == null){
     System.out.println( "Exit Msup -- null child: "+i+" "+
      ctx.getChild(i).getText() );
    }else{
      buf.append( getMML( ctx.getChild(i)) );
    }
   }
  }
  buf.append( "</msup>" );
  setMML( ctx, buf.toString() );
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
     System.out.println( "Exit Msubsup -- null child: "+i+" "+
      ctx.getChild(i).getText() );
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
    System.out.println( "Exit subscript -- child: "+i+" "+
          ctx.getChild(i).getText() );
    if (doneBelow == null){
      System.out.println( "Exit subscript -- null child: "+i+" "+
      ctx.getChild(i).getText() );
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
      System.out.println( "Exit supscript  -- null child: "+i+" "+
      ctx.getChild(i).getText() );
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
     System.out.println( "Exit Msub -- null child: "+i+" "+
      ctx.getChild(i).getText() );
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
  buf.append( "<mrow>" );
  for (int i=0; i<ctx.getChildCount(); i++ ){
   buf.append( getMML( ctx.getChild(i)) );
  }
  buf.append( "</mrow>" );
  setMML( ctx, buf.toString());
  if (debug) System.out.println( "base: "+buf.toString() );
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
  setMML( ctx, "<mo fence=\"true\">"+
               ctx.getChild(0).getText()+
               "</mo>" );
 }
               
@Override 
 public void exitRgrp(BaknemParser.RgrpContext ctx) { 
  setMML( ctx, "<mo fence=\"true\">"+
               ctx.getChild(0).getText()+
               "</mo>" );
 }
@Override
 public void exitFunWithArg(BaknemParser.FunWithArgContext ctx) { 
  if (trace) System.out.println( "exit functionWithArgument" );
  boolean prod = false;
  if (ctx.varXfunabb() != null ) prod = true;
  System.out.println( "No. of children "+ctx.getChildCount()+
  " child is product: "+prod );
  StringBuilder buf = new StringBuilder();
  buf.append( "<mrow>" );
  buf.append( getMML( ctx.getChild( 0 ) ) );
  buf.append( appleFun ); //Nem. has required space here
  buf.append( getMML( ctx.getChild( 2 ) ) );
  buf.append( "</mrow>" );
  System.out.print( "fun with arg: "+buf.toString() );
  setMML( ctx, buf.toString() );
}
@Override
 public void exitVarXfunabb(BaknemParser.VarXfunabbContext ctx) {
 String ink = BackTransHandler.backVarXFun( ctx.getText() );
 setMML( ctx, ink );
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
@Override public void exitCmpr(BaknemParser.CmprContext ctx) { 
 //TO-DO Use translation table
 String tmp = ctx.getText().toLowerCase();
 if (tmp.equals( " .k") || tmp.equals( " .k ")){
  setMML( ctx, "<mo>=</mo>" );
 } else {
  System.out.println( "Cannot backtrans comparison symbol: |"+
     tmp +"|");
 }
}
@Override
 public void exitVar(BaknemParser.VarContext ctx) {
  if (trace) System.out.println( "exit var" );
  if (ctx.greeks() != null ){
   setMML( ctx, getMML( ctx.getChild( 0 ) ) );
   return;
  }
  List<BaknemParser.SingleLetContext> sls = ctx.singleLet();
  if (sls != null){
   StringBuilder buf = new StringBuilder();
   String brl;
   String ink;
   for (BaknemParser.SingleLetContext sl : sls){
    brl = sl.getText();
    ink =  BackTransHandler.backLetter2Tok( brl );
    System.out.println( "brl: "+brl+" ink: "+ink );
    buf.append( BackTransHandler.backLetter2Tok( brl ));
   }
   setMML( ctx, buf.toString() );
   System.out.println( "sls: "+buf.toString() );
   return;
   }

  //TO-DO Use translation table 
  setMML( ctx, "<mi>"+ctx.getChild(0).getText()+"</mi>" );
 }

@Override public void exitGreeks(BaknemParser.GreeksContext ctx) { 
  if (trace) System.out.println( "exit Greek letters." );
  StringBuilder buf = new StringBuilder();
  String grkEntity;
  for (int i=0; i<ctx.getChildCount(); i++ ){
   grkEntity = GreekLetter.value( ctx.getChild(i).getText() );
   System.out.println( "ge: "+ grkEntity+" "+ctx.getChild(i).getText() );
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
    //TO-DO Use translation table rather than ASCII braille!
  String brlNumber = ctx.getChild(0).getText();
  //int jb = 0;
  //if (brlNumber.startsWith( "#" )) jb=jb+1;
  //setMML( ctx, "<mn>"+brlNumber.substring(jb)+"</mn>" );
  String ink =  Numeric.backTransNum2Tok( brlNumber );
  if (debugNum){
   System.out.println( "Num brl: "+brlNumber+" mml: "+ ink );
  }
  setMML( ctx, ink );
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
    myOutput.mjHeader( "Baknem 2.0 Test Page" );
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
         System.out.println( "     PARSE TREE: ");
         System.out.println( x );
        //myOutput.println( "     PARSE TREE: ");
        //wrap( tmpTree, 60, myOutput );

/**  III. Insert logic to walk and annotate tree. */
          
          //Custom class that extends BaseListener generated by ANTLR
          BackNem proc = new BackNem( tokens );
          ParseTreeWalker walker = new ParseTreeWalker();
          walker.walk( proc, tree );

/**  IV. Display annotation   */

     System.out.println( "MML ANNOTATION");
     System.out.println( proc.getMML( tree ) );

    //System.out.println();
     //System.out.println( "      ***Translation***" );
     //System.out.println(" Translated braille from annotated tree: ");
     //System.out.println( bt.getBrl( tree ) );

     myOutput.finishTape6( true );

 }//End Main.
}//End Class BackNem;