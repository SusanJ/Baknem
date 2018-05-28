package nemdata;
import java.util.HashMap;
public class Numeric{

 //  Backtranslate Nemeth Rule II Numeric Signs and Symbols
 // from a ASCII Braille
 static final Numeric [] numTable = {
  new Numeric( "#", "" ),  //Numeric Indicator (N.I.)
  new Numeric( ",", ","),  new Numeric( ".", "."),
  new Numeric( "0", "0" ), new Numeric( "1", "1" ),
  new Numeric( "2", "2" ), new Numeric( "3", "3" ),
  new Numeric( "4", "4" ), new Numeric( "5", "5" ),
  new Numeric( "6", "6" ), new Numeric( "7", "7" ),
  new Numeric( "8", "8" ), new Numeric( "9", "9" )
 };

  static final String nemBoldSymInd = "_#";
  static final String nemItalSymInd = ".#";

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
  Numeric( String brl, String ink ){
   this.brl = brl;
   this.ink = ink;
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
  public static String backTransNum( String seq ){
   if (seq.length() == 1) return getInk( seq );
   StringBuilder buf = new StringBuilder();
   String ink;
   for (int i=0; i<seq.length(); i++){
    ink = getInk( seq.substring( i,i+1) );
    if (ink != null){
     buf.append( ink );
    } else {
     System.out.println( "Numeric BT--cannot BT: |"+
              seq.substring( i,i+1 )+"|" );
    }
   }
   return buf.toString();
  }
  public static String backTransNum2Tok( String seq ){
   if (seq.startsWith( nemBoldSymInd )){
    if (seq.length() < 3) return null;
    return btBoldNum2Tok( seq.substring(2) );
   }
   if (seq.startsWith( nemItalSymInd )){
    if (seq.length() < 3) return null;
    return btItalNum2Tok( seq.substring(2) );
   }
   String ink = backTransNum( seq );
   if (ink == null) return null;
   return smnTag+ink+emnTag;
  }
  public static String btBoldNum2Tok( String seq ){
   String ink = backTransNum( seq );
   if (ink == null) return null;
   return sBOLDmnTag+ink+emnTag;
  }
  public static String btItalNum2Tok( String seq ){
   String ink = backTransNum( seq );
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
