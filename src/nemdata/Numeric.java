package nemdata;
import java.util.HashMap;
import nem.BackNem;
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

  //public static String backTransNum( String seq, boolean lead ){
  
  public static String backTransNum( String seq, boolean lead ){
   if (seq.length() == 1) return getInk( seq );
   String proc = seq;
   String grk = "";
   if (lead ){
    int hash = seq.indexOf( "#");
    int dot = 0;
    if (hash < 0){
     dot = seq.indexOf( "." );
    } else {
     dot = seq.indexOf( ".", hash );
    }
    proc = seq.substring(0, dot ); 
    grk = seq.substring( dot );
   }
   StringBuilder buf = new StringBuilder();
   String ink;
   String brl;
   if (debug) System.out.println( "btn seq: "+seq+" proc: "+proc+
    " grk brl: "+grk );
   for (int i=0; i<proc.length(); i++){
    brl = proc.substring( i,i+1);
    if (debug) System.out.println( "btn brl: "+brl );
    ink = getInk( proc.substring( i,i+1) );
    if (ink != null){
     buf.append( ink );
    } else {
     if (lead){
      return buf.toString();
     }
     System.out.println( "Numeric BT--cannot BT: |"+
              proc.substring( i,i+1 )+"|" );
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
