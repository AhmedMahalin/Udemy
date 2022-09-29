package Collection;

import java.util.ArrayList;

public class DSArrayList {

    public static void main(String[] args) {

        ArrayList einkaufsliste = new ArrayList();
        ArrayList<String> namensListe = new ArrayList<String>();

         //Dateneingabe
        einkaufsliste.add("Wasser");
        einkaufsliste.add("Brot");


        namensListe.add("Hans");
        namensListe.add("Peter");

        for(int i = 0; i< namensListe.size(); i++){
            System.out.println("Name: "+ namensListe.get(i));
        }

        for (String string : namensListe) { // ofr each schlefie do this fpr each element
            System.out.println("Die länge des Namens ist:" + string.length());

        }
    
    }

}
