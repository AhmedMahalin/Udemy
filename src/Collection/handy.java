package Collection;

import java.util.ArrayList;
import java.util.List;

public class handy {

    // Eigenschaften / Atribute
    private List<Kontakt> meineKontakte;


    // Konstruktor
    public handy() {
        meineKontakte = new ArrayList<Kontakt>();
    }

    // Methoden
    public boolean addKontakt(Kontakt neuerKontakt) {
        for (Kontakt kontaktInListe : meineKontakte) {
            if (neuerKontakt.getName().equals(kontaktInListe.getName())) {
                System.out.println("Kotankt bereits vorhanden");
                return false;
            }
        }
        meineKontakte.add(neuerKontakt);
        System.out.println("Kontakt wurde hinzugefügt!");
        return true;

    }

    public boolean findKontakt(String name) {
        for (Kontakt kontaktInListe : meineKontakte) {
            if (name.equals(kontaktInListe.getName())) {
                System.out.println("Gefunden.. " + "Name: " + kontaktInListe.getName() + " Tel: "
                        + kontaktInListe.getTelefonnummer());
                return true;
            }
        }
        System.out.println("Nicht gefunden");
        return false;

    }

    public void ausgabe() {
        for (Kontakt kontaktInListe : meineKontakte) {
            System.out.println("Name: " + kontaktInListe.getName() + " Tel: " + kontaktInListe.getTelefonnummer());
        }
    }


            }

  