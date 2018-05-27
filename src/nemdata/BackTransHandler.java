package nemdata;
import org.dotlessbraille.transtables.Letter;
import nem.BackNem;
//import FunctionName;
public class BackTransHandler{
 static boolean debug = true;

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
public static void doTables(){
 FunctionName.makeTables();
 Letter.makeNAAbrlToPrint( true, false );
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