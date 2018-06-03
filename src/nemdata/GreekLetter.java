package nemdata;
import java.lang.Character;
import java.lang.Integer;
import java.util.HashMap;
/**Back-translates Nemeth Greek letters to either
   Unicode character references/
   (Incomplete.)
*/
public class GreekLetter {

 //static boolean trace = true;
 //static MyLogger log = new MyLogger (trace, "GreekTable--");

 static final String GREEK_IND = ".";
 static final String VAR_GREEK = "@";
 static final String CAP_IND = ",";
 static final String GREEK_CAP = ".,";

 //Uppercase letters determined automatically by
 //Java via Unicode information

 static final GreekLetter [] letters = {
  new GreekLetter ("a", '\u03B1' ), //new GreekLetter (",a", '\u0391' ),
  new GreekLetter ("b", '\u03B2' ), //new GreekLetter (",b", '\u0392' ),
  new GreekLetter ("&", '\u03C7' ), //new GreekLetter (",&", "Chi"),
  new GreekLetter ("d", '\u03B4' ), //new GreekLetter (",d", "Delta"),
  new GreekLetter ("e", '\u03B5' ),
  new GreekLetter (":", '\u03B7' ),
  new GreekLetter ("g", '\u03B3', "gamma" ), 
  new GreekLetter ("i", '\u03B9' ),
  new GreekLetter ("k", '\u03BA' ),
  new GreekLetter ("l", '\u03BB' ), //new GreekLetter (",l", "Lambda"),
  new GreekLetter ("m", '\u03BC' ),
  new GreekLetter ("n", '\u03BD' ), //nu
  new GreekLetter ("w", '\u03BF' ), //new GreekLetter (",w", "Omega"),
  new GreekLetter ("f", '\u03C6' ), //new GreekLetter (",f", "Phi"),
  new GreekLetter ("p", '\u03C0', "pi" ), 
  new GreekLetter ("y", '\u03C8' ),
  new GreekLetter ("r", '\u03C1' ),
  new GreekLetter ("s", '\u03C3' ), //new GreekLetter (",s", "&Sigma' ),
  new GreekLetter ("t", '\u03C4' ),
  new GreekLetter ("?", '\u03B8', "theta"),  
  new GreekLetter ("u", '\u03C5' ),
  new GreekLetter ("x", '\u03C7' ), //new GreekLetter (",x", "Xi"),
  new GreekLetter ("z", '\u03B6' ),
  new GreekLetter ("@s",'\u03C2' ), //Final sigma
  new GreekLetter ("@e", "varepsilon"),
  new GreekLetter ("@f", "varphi"),
  new GreekLetter ("@?", "varetheta"),
  new GreekLetter ("o", '\u03C9' ) 
 };

 static HashMap <String,GreekLetter> GreekTable = 
    new HashMap <String,GreekLetter>();

 String brl;
 String htmlCode;
 String entityLC;
 String entityUC;
 char uni;
 char uniUC;
 String word;
 static boolean tableMade = makeTable();
 
//============================================= 
private GreekLetter( String brl, String htmlCode ){
 this.brl = brl;
 this.htmlCode = htmlCode;
}
private GreekLetter( String brl, char uni ){
 this.brl = brl;
 this.uni = uni;
 this.entityLC = char2Entity( uni );
 this.entityUC = lcChar2UCEntity( uni );  
}
private GreekLetter( String brl, char uni, String word ){
 this( brl, uni );
 this.word = word;
}
String getBrl(){return brl;}
String getCode(){return htmlCode;}
String getCodeUC(){return entityUC;}
String getCodeLC(){return entityLC;}  
 
//This is going around in a circle for the lc one
//(but gets the uc one for free)
//but I think using the char as input may be
//the right thing to do; anyway it works :) 
static String char2Entity( char uni ){
 String l = Character.toString( uni );
 return str2Entity( l );
}
static String lcChar2UCEntity( char uni ){
 String lc = Character.toString( uni );
 String uc = lc.toUpperCase();
 return str2Entity( uc );
}
static String str2Entity( String letter ){
 int cp = letter.codePointAt( 0 );
 String s = Integer.toHexString( cp ).toUpperCase();
 if (s.length() == 3){
  return "&#x0"+s+";";
 }
  return "$#x" +s+";";
}
public static boolean makeTable(){
 for (int i = 0; i<letters.length; i++){
  GreekLetter g = letters[i];
  GreekTable.put( g.getBrl(), g );
 }
return true;
}
//---------------------------------------------
//Try to locate a brl symbol for a Greek
//letter  in this input
static String key (String brl ){

 //Input is just one lc or uc braille letter
 System.out.println ("key(); brl.length(): "+brl.length());
 if (brl.length() == 1) return brl.toLowerCase();
 if (brl.length() == 2) return brl.toLowerCase();

  //Check end of input
 String tmp = 
  brl.substring (brl.length()-1, brl.length());
  if (tmp.length() == 1) return tmp.toLowerCase();

  int ic;
 //Check for cap
 if ( brl.substring (
          brl.length()-2, brl.length()-1 
                   ).equals (CAP_IND) ){
    if ( brl.substring (
          brl.length()-3, brl.length()-2 
                   ).equals (VAR_GREEK) ){  //VAR UC
      ic = 3;
    } else {
      ic = 2;
    }
 } else if ( brl.substring (             //VAR LC
             brl.length()-2, brl.length()-1 
                   ).equals (VAR_GREEK) ){
  ic = 2;
 } else {   //Regular LC
  ic = 1;
 }
 return brl.substring (brl.length()-ic, brl.length()).toLowerCase();
}
//---------------------------------------------
public static String value( String brl ){
 String key = brl;
 if (brl.length() < 2 ) return null;
 if (brl.startsWith( GREEK_CAP ) && brl.length() > 2){
   key = brl.toLowerCase().substring(2);
   return GreekTable.get(key).getCodeUC();
 } else if (brl.startsWith( GREEK_IND )){
   key = brl.toLowerCase().substring(1);
 } else {
   return null;
 }
 return GreekTable.get(key).getCodeLC();
}
public static void main( String [] args ){
 char pilc = '\u03C0';
 String entLC = char2Entity( pilc );
 System.out.println( "  Testing conversion method: " );
 System.out.println( "Entity for lc pi: "+entLC );
 String entUC = lcChar2UCEntity( pilc );
 System.out.println( "Entity for uc pi: "+entUC );
 String lcBrl = ".p";
 String ucBrl = ".,p";
 System.out.println( "\n  Testing use of hash table." );
 System.out.println( "Entity for lc brl pi: "+value( lcBrl ));
 System.out.println( "Entity for uc brl pi: "+value( ucBrl ));
}
}//End Class GreekTable.