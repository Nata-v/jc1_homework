package part20.task77;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class STAXParser {
    public static void main(String[] args) {
        final String fileName = "c:\\homework\\jc1_homework\\src\\salary.xml";

        try {
            XMLStreamReader xmlReader = XMLInputFactory.newInstance().
                    createXMLStreamReader(fileName, new FileInputStream(fileName));

            while (xmlReader.hasNext()){
                xmlReader.next();
                if (xmlReader.isStartElement()){
                    System.out.println(xmlReader.getLocalName());
                }else if (xmlReader.isEndElement()){
                    System.out.println("/" + xmlReader.getLocalName());
                } else if (xmlReader.hasText() && xmlReader.getText().trim().length() > 0) {
                    System.out.println("  " + xmlReader.getText());
                }
            }
        }catch (FileNotFoundException | XMLStreamException ex){
            ex.printStackTrace();
        }
    }
}
