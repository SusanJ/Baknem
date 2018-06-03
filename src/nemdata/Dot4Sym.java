package nemdata;
import java.util.HashMap;

 /**Back-translates Nemeth symbols starting with dot-4  */
public class Dot4Sym{

  //static MyLogger log = new MyLogger();

 /**Flag indicates if table entries have leading dot-4.
 */

 static boolean hasLead = false;
 static final String DOT4 = "@";
  //The braille in the table does not have the leading 
  //DOT4 which is added by the constructore.
 static final Dot4Sym [] d4Table = {

   //Dot-6 miscellaneous symbols
  new Dot4Sym( ",a",    "&#x212B;"),   //Angstrom Unit
  new Dot4Sym( ",r",    "&#x211E;"),   //Crossed R
  new Dot4Sym( ",p",    "&#x00B6;"),   //Paragraph mark
  new Dot4Sym( ",s",    "&#x00A7;"),   //Section mark
  //new Dot4Sym( ",s@,s", "&#x00A7;&#x00A7;"),   //Double section mark

   //Dot-6 grouping
  new Dot4Sym( ",(", "["),     //Enlarged left bracket
  new Dot4Sym( ",)", "]"),     //Enlarged right bracket

  //Miscellaneous symbols
  new Dot4Sym( "a",  "@"),   // @
  new Dot4Sym( "e",  "&#x2208;"),    //element of 
  new Dot4Sym( "c",  "&#x00A2;"),    //cent 
  new Dot4Sym( ">",  "U+00A2"),      //Check Mark
  new Dot4Sym( "$",  "U+0111"),      //Crossed d
  new Dot4Sym( "h",  "U+0127"),      //Crossed h
  new Dot4Sym( ".l", "&#x00A2;"),    //Crossed lambda
  new Dot4Sym( ",r", "&#x211E;"),    //Crossed R
  new Dot4Sym( "s",  "$"),           //$
  new Dot4Sym( "0",  "%"),           //Percent sign
  new Dot4Sym( "=\\",  "exists"),    //Existential quantifier
  new Dot4Sym( "d",  "&#x2202;"),    //Partial derivative

   //Comparators
  new Dot4Sym( ":",   "&#x223C;"),        //Simple tilde
  new Dot4Sym( "::",  "&#x2243;"),        //bar under tilde
  new Dot4Sym( ":@:", "&#x2248;"),        //double tilde
  new Dot4Sym( ":@::", "bar under dbl tilde"),  //bar under double tilde
  new Dot4Sym( ":@:.k", "= under dbl tilde"),   //equals sign under double tilde
  new Dot4Sym( ":.k", "&#x2245;"),       //equals sign under single tilde
  new Dot4Sym( "<,<", "&#x0224E;"),      //Equivalence

   //Binary operators
  new Dot4Sym( "#", "*"),          //asterisk
  new Dot4Sym( "%", "U+2227"),     //logical product
  new Dot4Sym( "%:", "U+2227:"),   //logical product with bar under
  new Dot4Sym( "%.k", "U+2227="),  //logical product with equals under
  new Dot4Sym( "+", "U+2228"),     //logical sum
  new Dot4Sym( "+:", "U+2228:"),   //logical sum with bar under
  new Dot4Sym( "+.k", "U+2228="),  //logical sum with equals under
  new Dot4Sym( "*", "&#x00D7;"),   //multiplication cross

   //Grouping
  new Dot4Sym( "(", "["),     //left bracket
  new Dot4Sym( ")", "]"),     //right bracket

 };
   static HashMap<String, String> d4Brl2Ink = 
      new HashMap<String, String>();
   static HashMap<String, String> d4Ink2Brl = 
      new HashMap<String, String>();

   String brl;
   String ink;
//============================================= 
Dot4Sym( String brl, String ink ){
  this.brl = DOT4 + brl;
  this.ink = ink;
}
String getBrl(){return brl;}
String getInk(){return ink;}

public static void makeHashTables(){
 for (int i=0; i<d4Table.length;i++){
  Dot4Sym sym = d4Table[i];
  d4Brl2Ink.put( sym.getBrl(), sym.getInk() );
  d4Ink2Brl.put( sym.getInk(), sym.getBrl() );
 }
}
//---------------------------------------------
private static String trans2Ink( String brl ){
 String ink = d4Brl2Ink.get( brl.toLowerCase() );
 if (ink == null){
  System.out.println (
   "Dot4Table.brl input: " +
   brl + " not in translation table.");
  System.exit( 0 );
 }
 return ink;
}
}//End Class Dot4Sym.