package nemdata;
import java.lang.Integer;
class MMLTokenElement<T>{

 private T obj;
 private String startTag;
 private String endTag;
 private static String startMrow = "<mrow>"; 
 private static String endMrow = "</mrow>"; 

public MMLTokenElement( T t ){
 this.obj = t;
}
public void setObject( T t ){
 this.obj = t;
}
public T getObject(){
  return obj;
}
public void setTags( 
 String startTag, String endTag ){
 this.startTag = startTag;
 this.endTag = endTag;
}
public String makeElement( String s ){
  StringBuilder buf = new StringBuilder( startTag );
  buf.append( s );
  buf.append( endTag );
  return buf.toString();
}
public String makeElAsRow( String s ){
 StringBuilder buf = new StringBuilder( startMrow );
 buf.append( makeElement( s ));
 buf.append( endMrow );
 return buf.toString();
}
public String makeElAsRow( int i ){
 StringBuilder buf = new StringBuilder( startMrow );
 buf.append( makeElement( i ));
 buf.append( endMrow );
 return buf.toString();
}
public String makeElement( int i ){
  StringBuilder buf = new StringBuilder( startTag );
  buf.append( i );
  buf.append( endTag );
  return buf.toString();
}
public static void main( String [] args ){

//This works but I don't see yet how using a generic
//function has made it easier
   
   MMLTokenElement<Integer> mn  = 
    new MMLTokenElement<Integer>( new Integer(0) );
   mn.setTags( "<mn>", "</mn>" );
   Integer mnObj = mn.getObject();
   int test = 10;
   String mnEl = mn.makeElement( test );
   String mnEl1 = mn.makeElAsRow( test );
   System.out.println( mnEl+" "+mnEl1 );

   MMLTokenElement<String> mi =
     new MMLTokenElement<String>( "id" );
   mi.setTags( "<mi>", "</mi>" );
   String miObj = mi.getObject();
   String miEl = mi.makeElement( "x" );
   System.out.println( miEl );

   MMLTokenElement<String> mo  = 
    new MMLTokenElement<String>( "op" );
   mo.setTags( "<mo>", "</mo>" );
   String moEl = mo.makeElement( "=" );
   System.out.println( moEl );

  
 }//End main().
}//End Class MMLTokenElement.

