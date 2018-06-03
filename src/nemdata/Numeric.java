package nemdata;
import java.util.HashMap;
import nem.BackNem;
public class Numeric{

 //  Backtranslate Nemeth Rule II Numeric Signs and Symbols
 // from a ASCII Braille
 static final Numeric [] numTable = {
  new Numeric( "#", "#", "en eye" ),  //Numeric Indicator (N.I.)
  new Numeric( ",", ",", "comma" ), new Numeric( ".", ".", "point" ),
  new Numeric( "0", "0", "zero" ),  new Numeric( "1", "1", "one" ),
  new Numeric( "2", "2", "two" ),   new Numeric( "3", "3", "three" ),
  new Numeric( "4", "4", "four" ),  new Numeric( "5", "5", "five" ),
  new Numeric( "6", "6", "six" ),   new Numeric( "7", "7", "seven" ),
  new Numeric( "8", "8", "eight" ), new Numeric( "9", "9", "nine" )
 };

  static final String nemBoldSymInd = "_#";
  static final String nemItalSymInd = ".#";
  static boolean debug = false;
  static String ginky;

 /** MathML token attributes
    fontweight  normal | bold 
    fontstyle  	normal | italic
 */

  //It's possible you can't have two tf's in Nemeth???
  static String smnTag     = "<mn>";
  static String sBOLDmnTag = "<mn fontweight=\"bold\">";
  static String sITALmnTag = "<mn fontstyle=\"italic\">";
  static String sBOLDITALmnTag = 
    "<mn fontweight=\"bold\" fontstyle=\"italic\">";
  static String emnTag = "</mn>";

  static HashMap<String,Numeric> numericItems =
      new HashMap<String,Numeric>();

  static boolean tableDone = makeTable( true );

  String brl;
  String boldBrl;
  String italBrl;
  String bolditalBrl;
  String italboldBrl;
  String ink;
  String say;
  Numeric( String brl, String ink, String say ){
   this.brl = brl;
   this.ink = ink;
   this.say = say;
  }
  String getBrl(){ return brl; };
  String getInk(){ return ink; };
//----------------------------------------------
  public static boolean makeTable( boolean display ){
   if (tableDone) {
     if (display) {
      System.out.println( " Numeric table size: "+
      numericItems.size() );
     }
     return true;
   }
   for (int i=0; i<numTable.length; i++){
    Numeric item = numTable[i];
    numericItems.put( item.getBrl(), item );
   }
   if (display) {
      System.out.println( " Numeric table size: "+
     numericItems.size() );
   }
   return true;
  }
  static String getInk( String key ){
   return numericItems.get( key ).getInk();
  }

  //public static String backTransNum( String seq, boolean lead ){
  
  /** If lead is true just backtranslate leading integer;
  could have trailing Greek letter(s)
  Assumes integer, not real since "dot" also Greek ind.
    This situation arises because the Lexer recognizes
  something like 2.p as a single token which is how Nemeth
  represents an integer applied to a Greek letter. When a
  real number is applied to a letter (or other non-numeric
  symbol) there a required DOT5 ('"') (multipurpose indicator) 
  is inserted between the number and the non-numeric symbol.
  See Rule XXIII Sec. 177 v.(2)
   Example: 0.alpha is #0.".a where the first
  DOTS46 (Ascii Braille '.') is a decimal point and the second
  one is the Greek Letter indicator for a small Greek letter.
  */

  public static String backTransNum( String seq, boolean lead ){
   if (seq.length() == 1) return getInk( seq );
   String before = seq;
   String grk = "";
   if (lead ){
    int hash = seq.indexOf( "#");
    int dot = 0;
    if (hash < 0){
     dot = seq.indexOf( "." );
    } else {
     dot = seq.indexOf( ".", hash );
    }
    before = seq.substring(0, dot ); 
    grk = seq.substring( dot );
   }
   StringBuilder buf = new StringBuilder();
   String ink;
   String brl;
   if (debug) System.out.println( "btn seq: "+seq+" before: "+before+
    " after brl: "+grk );
   for (int i=0; i<before.length(); i++){
    brl = before.substring( i,i+1);
    if (debug) System.out.println( "btn brl: "+brl );
    ink = getInk( brl  );
    if (ink != null){
     buf.append( ink );
    } else {
     if (lead){
      return buf.toString();
     }
     //Unexpected
     System.out.println( "Numeric BT--cannot BT: |"+
              brl+"|" );
    }
   }
   if (lead ){
    if (debug) System.out.println( "need to do: "+grk );
    String gink = GreekLetter.value( grk );
    //TO DO THIS needs to go after MN tags!
    ginky = "<mi>"+gink+"</mi>";
    //buf.append( "<mi>gink</mi>" );
   }
   return buf.toString();
  }
  public static String backTransNum2Tok( String seq, boolean lead ){
   if (seq.startsWith( nemBoldSymInd )){
    if (seq.length() < 3) return null;
    return btBoldNum2Tok( seq.substring(2), lead );
   }
   if (seq.startsWith( nemItalSymInd )){
    if (seq.length() < 3) return null;
    return btItalNum2Tok( seq.substring(2), lead );
   }
   String ink = backTransNum( seq, lead );
   if (ink == null) return null;
   String numtok = smnTag+ink+emnTag;
   if (!lead) return numtok;
   return numtok+BackNem.invisX+ginky;
  }
  public static String btBoldNum2Tok( String seq, boolean lead ){
   String ink = backTransNum( seq, lead );
   if (ink == null) return null;
   return sBOLDmnTag+ink+emnTag;
  }
  public static String btItalNum2Tok( String seq, boolean lead ){
   String ink = backTransNum( seq, lead );
   if (ink == null) return null;
   return sITALmnTag+ink+emnTag;
  }
public static void main( String [] args ){
 makeTable( true );
 String brl = "1";
 String ink = getInk( brl );
 System.out.println( "brl: "+brl+" ink: "+ink );
}
}//End Class Numeric.
