package part20.task77;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class STAXWriter {
    public static void main(String[] args) {

        try {
            XMLOutputFactory output = XMLOutputFactory.newInstance();

            XMLStreamWriter writer = output.
                    createXMLStreamWriter(new FileWriter("c:\\homework\\jc1_homework\\src\\result.xml"));
            // открываем XML- документ и пишем корневой элемент BookCatalogue
            writer.writeStartDocument("1.0");
            writer.writeStartElement("BookCatalogue");
            //делаем цикл для books
            for(int i = 0; i < 5; i++){
                writer.writeStartElement("Book");
                //заполняем все тэги для книг

                //Title
                writer.writeStartElement("Title");
                writer.writeCharacters("Book #" + i);
                writer.writeEndElement();
                //Author
                writer.writeStartElement("Author");
                writer.writeCharacters("Author #" + i);
                writer.writeEndElement();
                //Date
                writer.writeStartElement("Date");
                writer.writeCharacters(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
                writer.writeEndElement();
                //ISBN
                writer.writeStartElement("ISBN");
                writer.writeCharacters("ISBN #" + i);
                writer.writeEndElement();
                //Publisher
                writer.writeStartElement("Publisher");
                writer.writeCharacters("Publisher #" + i);
                writer.writeEndElement();
                //Cost
                writer.writeStartElement("Cost");
                writer.writeAttribute("currency", "USD");
                writer.writeCharacters("" + (i+10));
                writer.writeEndElement();
                //закрываем тэг Book

                writer.writeEndElement();
            }
            //закрываем корневой элемент
            writer.writeEndElement();
            //закрываем XML-документ
            writer.writeEndDocument();
            writer.flush();
        }catch (XMLStreamException | IOException ex){
            ex.printStackTrace();
        }
    }
}
