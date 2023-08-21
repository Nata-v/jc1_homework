package part20.task77;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class SaxParser {
    public static void main(String[] args) {

        final String fileName = "c:\\homework\\jc1_homework\\src\\salary.xml";

        SAXParserFactory factory = SAXParserFactory.newDefaultInstance();

        try {
            SAXParser saxParser = factory.newSAXParser();
            DefaultHandler handler = new DefaultHandler() {

                boolean name = false;

                @Override
                public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                    if (qName.equalsIgnoreCase("name")) {
                        name = true;

                        System.out.println(qName);
                        System.out.println(attributes.getQName(0) + ": " + attributes.getValue(0));
                    }
                }

                @Override
                public void characters(char[] ch, int start, int length) throws SAXException {
                    if (name) {
                        System.out.println(String.valueOf(ch, start, length));
                        //  System.out.println("characters " +  new String(ch, start, length));
                    }
                }
            };
            saxParser.parse(fileName, handler);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
