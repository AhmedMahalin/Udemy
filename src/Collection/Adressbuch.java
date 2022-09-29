package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Adressbuch {
    public static void main(String[] args) {


        Adresse peterAdresse = new Adresse("Peter", "hammerstr", "Münster");
        Adresse hameAdresse = new Adresse("hame", "hammerstreet", "münster");
        Adresse[] adressenArray = {peterAdresse,hameAdresse};



        ArrayList<Adresse> adressenListe = new ArrayList<Adresse>();
        adressenListe.add(peterAdresse);
        adressenListe.add(hameAdresse);

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String straße = scanner.nextLine();
        String stadt = scanner.nextLine();

        Adresse  adresse4 = new Adresse(name, straße, stadt);
        adressenListe.add(adresse4);

        System.out.println("AdressenArray");
        for (Adresse adressse : adressenArray){

            System.out.println("Name " + adresse4.getName()+ " Straße; " + adresse4.getStraße()+ " Stadt" + adresse4.getStadt());
        }


        System.out.println("AdressenListe");
        //Ausgabe der Liste
        for (Adresse adresse :adressenListe) {

            System.out.println("Name: "+ adresse.getName()+" Straße: " + adresse.getStraße() + "Stadt: " +adresse.getStadt() );
        }

    }
}
