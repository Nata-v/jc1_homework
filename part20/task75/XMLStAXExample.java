package part20.task75;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;

public class XMLStAXExample {
    public static void main(String[] args) {
        try {
            XMLInputFactory factory = XMLInputFactory.newInstance();
            XMLStreamReader reader = factory.createXMLStreamReader(new FileInputStream("c:\\homework\\jc1_homework\\points.xml"));

            while (reader.hasNext()) {
                int event = reader.next();

                if (event == XMLStreamConstants.START_ELEMENT && reader.getLocalName().equals("point")) {
                    String x = "";
                    String y = "";

                    while (reader.hasNext()) {
                        event = reader.next();

                        if (event == XMLStreamConstants.START_ELEMENT && reader.getLocalName().equals("x")) {
                            x = reader.getElementText();
                        }

                        if (event == XMLStreamConstants.START_ELEMENT && reader.getLocalName().equals("y")) {
                            y = reader.getElementText();
                        }

                        if (event == XMLStreamConstants.END_ELEMENT && reader.getLocalName().equals("point")) {
                            System.out.println(x + "px, " + y + "px");
                            break;
                        }
                    }
                }
            }

            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
