package saxpackage;

import java.util.ArrayList;
import java.util.List;

public class MainEx {
    public static void main(String[] args) {
        AdresseXML adresseXML = new AdresseXML();
        ArrayList<Adresse> adresseXMLS = (ArrayList<Adresse>) adresseXML.gerAdresse();
        for (Adresse adresse : adresseXMLS){
            System.out.println(adresse.toString());
        }
        System.out.println(adresseXMLS.size());
        System.out.println();
        adresseXMLS.forEach(System.out::println);
    }
}
