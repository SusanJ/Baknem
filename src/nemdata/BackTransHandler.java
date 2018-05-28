package nemdata;
import org.dotlessbraille.transtables.Letter;
import org.dotlessbraille.transtables.Punctuation;
import nem.BackNem;
//import FunctionName;
public class BackTransHandler{

 static final String boldSymEng = "_;";
 static final String italSymEng = ".";
 static String smiTag     = "<mi>";
 static String sBOLDmiTag = "<mi fontweight=\"bold\">";
 static String sITALmiTag = "<mi fontstyle=\"italic\">";
 static String emiTag = "</mi>";

 static boolean debug = true;
 static boolean warn = true;

public static String backTransPIPunc( String piPunc ){
 String brl = piPunc;
 if (piPunc.length() > 1 ){
  if (piPunc.startsWith( "_" )) brl = piPunc.substring( 1 );
 }
 String ink = Punctuation.getPostPunc( brl );
 if (ink == null && warn){
  System.out.println( "BTHandler.BTPIPunc--no BT for: "+piPunc );
 }
 return ink;
}
/**Backtranslates a sequence of lc letters.*/
public static String backVar( String seq ){
  StringBuilder buf = new StringBuilder();
  String brl;
  String ink;
  for (int i=0; i<seq.length(); i++){
   brl =  seq.substring(i,i+1);
   ink = Letter.backTrans2lc( seq.substring(i,i+1) );
   buf.append( ink );
  }
  return buf.toString();
}
/**Backtranslate individual cap or small English letter with
   optional leading bold or italics typeform indicator 
   per Nemeth Rule V,Sec 32.
*/
public static String backLetter2Tok( String brl ){
 if (brl.length() < 2){
  return smiTag+Letter.backTrans( brl )+emiTag;
 }
 if (brl.startsWith( boldSymEng )){
  return btBoldLet2Tok( brl.substring(2) );
 }
 if (brl.startsWith( italSymEng )){
  return btItalLet2Tok( brl.substring(2) );
 }
 return null; 
}
  private static String btBoldLet2Tok( String brl ){
   String ink = Letter.backTrans( brl );
   if (ink == null) return null;
   return sBOLDmiTag+ink+emiTag;
  }
  private static String btItalLet2Tok( String brl){
   String ink = Letter.backTrans( brl );
   if (ink == null) return null;
   return sITALmiTag+ink+emiTag;
  }

/** Handles "product" of a lower case alphabetic 
   variable with a subseqent function name abbreviation
   Lexer identifies syntax only
*/
public static String backVarXFun( String seq ){
 int len = FunctionName.endsWithFunAbbr( seq );
 if (len == 0) return null;
 int varLen = seq.length()-len;
 String brlVar = seq.substring( 0,varLen );
 String funAbbr = seq.substring( varLen );
 if (debug){
  System.out.println( "brlVar: "+brlVar+" funAbbr: "+funAbbr );
 }
 StringBuilder buf = new StringBuilder();
 buf.append( "<mi>"+backVar( brlVar) +"</mi>" );
 buf.append( BackNem.invisX );
 buf.append( "<mi>"+FunctionName.transBrlFunAbbr( funAbbr )+"</mi>" );
 return buf.toString();
}
public String backTransNum( String brlSeq ){
  return Numeric.backTransNum( brlSeq );
}
public static void doTables(){
 FunctionName.makeTables();
 Letter.makeNAAbrlToPrint( true, false );
 Punctuation.makePostPuncBTTable( true, false );
 Numeric.makeTable( true );
}
public static void main( String [] args ){
 doTables();
 String input = "xsin";
 boolean b = FunctionName.trailingFunAbbr( input );
 System.out.println( "trailing: "+b );
 String result = backVarXFun( input );
 System.out.println( "Input: "+input+" result: "+result );
}
}//End Class  BackTransHandler.