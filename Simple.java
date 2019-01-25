import com.sun.org.apache.xerces.internal.parsers.DOMParser;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import java.io.IOException;

public class Simple {
    public static void main(String[] args) throws IOException, SAXException {
        DOMParser parser = new DOMParser();
        parser.parse("src/bouquins.xml");
        Document doc = parser.getDocument();

        System.out.println(doc.getNodeName());
        doc.getChildNodes().item(0);
        doc.getChildNodes().item(0).getNodeName();
        doc.getChildNodes().item(0).getChildNodes().item(1);
        doc.getChildNodes().item(0).getChildNodes().item(0);
        doc.getChildNodes().item(0).getChildNodes().item(0).getNodeName();
        doc.getChildNodes().item(0).getChildNodes().
                item(1).getChildNodes().item(1).getChildNodes().
                item(0).getNodeName();
        doc.getChildNodes().item(0).getChildNodes().
                item(1).getChildNodes().item(1).getChildNodes().
                item(0).getNodeValue();
        doc.getElementsByTagName("titre").item(0).
                getChildNodes().item(0).getNodeValue();
        doc.getElementsByTagName("livre").item(0).hasAttributes();
        System.out.println(doc.getElementsByTagName("livre").item(1).hasAttributes()); //hasAttributes() fonction booleéenne
    }
}
