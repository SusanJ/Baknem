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

 

class BackNem extends BaknemParserBaseListener {
 
 static boolean trace = true;
 static boolean debug = true;
 static boolean debugrads = false;
 static boolean debugstat = false;
 static boolean debugexprs = false;
 static boolean debugexpr = false; 

 static Tape6 myOutput = new Tape6( "mmlout.htm" );

 BufferedTokenStream allTokens;

 BackNem( BufferedTokenStream allTokens ){
   this.allTokens = allTokens;
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
   if (nem.length() > 1){
    int len = nem.length()-1;
    myOutput.out( " <li><span class=\"sm\">"
       +nem.substring(0, len)+"</span></li>" );
   }
  }
  myOutput.out( "</ol></p>" );
  myOutput.out( "<p>BackNem inkprint math output.</p>" );
  
}
@Override 	
 public void exitProg(BaknemParser.ProgContext ctx) { 
  if (trace) System.out.println( "Exit prog." );
   ;
  StringBuilder buf = new StringBuilder();
  buf.append( getMML( ctx ) );
  for (int i=0; i<ctx.getChildCount(); i++ ){
   if (debugstat){
    System.out.println( " --exit prog child: "+i+" text: "+ 
           ctx.getChild(i).getText() );
   }
    myOutput.out
   ("<math xmlns=\"http://www.w3.org/1998/Math/MathML\" display=\"block\">");
   myOutput.out( getMML( ctx.getChild(i) ));
   buf.append( getMML( ctx.getChild(i) ) );
   myOutput.out( "</math>" );
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

//Indexed radicals -- MML reversed from Nemeth
//<mroot> base index </mroot>.
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
  for (int i=0; i<ctx.getChildCount(); i++ ){
    buf.append( getMML( ctx.getChild(i)) );
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
  StringBuilder buf = new StringBuilder();
  //if (ctx.var() == null ) buf.append( getMML( ctx ) );
   for (int i=0; i<ctx.getChildCount(); i++ ){
   buf.append( getMML( ctx.getChild(i)) );
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
@Override 
 public void enterMsup(BaknemParser.MsupContext ctx) {
  setMML( ctx, "<msup>" );
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
      System.out.println( "Exitmfrac -- null child: "+i+" "+
       ctx.getChild(i).getText() );
    } else {
      buf.append( getMML( ctx.getChild(i)) );
    }
  }
  buf.append( "</mfrac>" );
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
 public void exitFunabb(BaknemParser.FunabbContext ctx) {
  //TO-DO Use translation table 
  setMML( ctx, "<mi>"+ctx.getChild(0).getText()+"</mi>" );
 }
@Override 
 public void exitBinop(BaknemParser.BinopContext ctx) {
  //TO-DO Use translation table
  setMML( ctx, "<mo>"+ctx.getChild(0).getText()+"</mo>" );
}
@Override public void exitVar(BaknemParser.VarContext ctx) {
  //TO-DO Use translation table 
  setMML( ctx, "<mi>"+ctx.getChild(0).getText()+"</mi>" );
 }
@Override 
 public void exitInteger(BaknemParser.IntegerContext ctx) {
    //TO-DO Use translation table rather than ASCII braille!
  String brlNumber = ctx.getChild(0).getText();
  int jb = 0;
  if (brlNumber.startsWith( "#" )) jb=jb+1;
  setMML( ctx, "<mn>"+brlNumber.substring(jb)+"</mn>" ); 
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
    myOutput.mjHeader( "Susan" );
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