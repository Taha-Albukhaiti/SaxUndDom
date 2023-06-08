package saxpackage;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

public class MainDemo {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Dateiname eingeben! < *.xml > ");
        }
        AdresseXML2 addresse = new AdresseXML2();
        SAXParserFactory parserFactory = SAXParserFactory.newInstance();
        parserFactory.setNamespaceAware(true);

        try {
            SAXParser saxParser = parserFactory.newSAXParser();
            saxParser.parse(new FileInputStream(args[0]), addresse);


            // Zum Testen
            System.out.println("\n____________");
            List<Adresse> adresses = addresse.gerAdresse();
            adresses.stream().forEach(System.out::println);

        } catch (SAXException | ParserConfigurationException | IOException e) {
            System.out.println(e.getMessage());
            e.getStackTrace();
        }



    }
}
