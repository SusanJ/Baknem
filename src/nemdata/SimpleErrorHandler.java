package nemdata;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
public class SimpleErrorHandler implements ErrorHandler {
 //static WellFormed wf; 
 public SimpleErrorHandler(){
 //wf = newWellFormed()
 }
    public void warning(SAXParseException e) throws SAXException {
        //System.out.println(e.getMessage());
    }

    public void error(SAXParseException e) throws SAXException {
        //System.out.println(e.getMessage());
    }

    public void fatalError(SAXParseException e) throws SAXException {
        //System.out.println(e.getMessage());
    }
}//End Class SimpleErrorHandler.