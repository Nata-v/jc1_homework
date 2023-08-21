package part20.task74;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class XMLParseExample { // Dom Parser
    public static void main(String[] args) {

        try{
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse("c:\\homework\\jc1_homework\\points.xml");

            NodeList pointList = document.getElementsByTagName("point");
            for (int i = 0; i < pointList.getLength(); i++){
                Node pointNode = pointList.item(i);
                if (pointNode.getNodeType() == Node.ELEMENT_NODE){
                    Element pointElement = (Element) pointNode;

                    String x = pointElement.getElementsByTagName("x").item(0).getTextContent();
                    String y = pointElement.getElementsByTagName("y").item(0).getTextContent();

                    System.out.println(x + "px, " + y + "px");
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
