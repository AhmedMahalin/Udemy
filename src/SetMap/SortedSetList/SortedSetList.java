package SetMap.SortedSetList;

import Collection.Kontakt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedSetList {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();

        list1.add("Peter");
        list1.add("Michi");
        list1.add("Peter");
        list1.add("Benrt");

        for (String string: list1){
            System.out.println(string);
        }
        System.out.println("\n Sortierte Liste: " );
        Collections.sort(list1);

        for(String string : list1){
            System.out.println(string);
        }
        List<Kontakt> list2 = new ArrayList<Kontakt>();
        list2.add(new Kontakt("Peter", "123456789"));
        list2.add(new Kontakt("Sam", "1235"));

        System.out.println("\n\n\nListe unsprtiert: ");

        for (Kontakt kontakt : list2){
            System.out.println(kontakt.getName()+ "Tel-Nr: " + kontakt.getTelefonnummer());
        }

    }



}
