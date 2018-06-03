package nemdata;
import java.lang.Exception;
import java.io.Reader;
import java.io.StringReader;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

public class WellFormed {

 static DocumentBuilder builder;
 static String errMsg;

public WellFormed(){}

static void getMessage( String errmsg ){
 errMsg = errmsg;
}
public static boolean isWellFormedXML( String test ) throws Exception {
 boolean ok = true;
 try{
   InputSource is = makeInputSource( test );
   Document document = builder.parse( is );
 }catch (Exception e ) {
   //e.getMessage();
   ok = false;
   System.out.println( "Oops: "+e.getMessage() );
 }
 return ok;
}
public static void init()  {
 try{
  builder = getDB();
 }catch (Exception e ) {
  System.out.println( "WellFormed.init(): "+e.getMessage() );
 }
}
public static DocumentBuilder getDB() throws Exception {
 DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
 factory.setValidating(false);
 factory.setNamespaceAware(true);
 DocumentBuilder builder = factory.newDocumentBuilder();
 builder.setErrorHandler(new SimpleErrorHandler());
 return builder;
}
public static InputSource makeInputSource( String s ){
 Reader r = new StringReader( s );
 InputSource is = new InputSource( r );
 return is;
}
public static void main( String [] args ) throws Exception {
 String test = "<a><zzz>stuff</zzz></a>";
 WellFormed.init();
 boolean ok = WellFormed.isWellFormedXML( test );
 System.out.println( test+" ok: "+ok );
 String bad = "<a><zzz>stuff</z></a>";
 try{
  ok = WellFormed.isWellFormedXML( bad );
 }catch (Exception e ) {
  //e.getMessage();
  ok = false;
  System.out.println( "Oops: "+e.getMessage() );
 }
 System.out.println( bad+" ok: "+ok );
}
}//End Class WellFormed.