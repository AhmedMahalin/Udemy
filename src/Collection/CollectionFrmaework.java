package Collection;

import java.util.ArrayList;

public class CollectionFrmaework {
    public static void main(String[] args) {

        ArrayList einkaufsListe = new ArrayList();
        ArrayList <String> namenListe = new ArrayList<String>();
        einkaufsListe.add("Wasser"); // index: 0
        einkaufsListe.add("Brot");  //index: 1
        //
        // einkaufsListe.add(new Integer(4));

        namenListe.add("Peter");
        namenListe.add("Sandra");
        boolean empty = namenListe.isEmpty();
        if (empty == true){
            System.out.println("Die liste leer");
        }else{
            System.out.println(namenListe.get(0) + namenListe.get(1));
        }
    }
}
