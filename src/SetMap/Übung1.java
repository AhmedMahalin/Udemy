package SetMap;

import java.util.*;

public class Übung1 {
    public static void main(String[] args) {
        //Datenstruktur erzeugen
        List<String> list1 = new ArrayList<>();

        Set<String> set1 = new TreeSet<>();
        Set<String> set2 = new HashSet<String>();
        Set<String> set3 = new LinkedHashSet<String>();

                //Arraylist
        list1.add("Peter");
        list1.add("Michi");
        list1.add("Peter");
        list1.add("Benrt");



        //TreeSet
        set1.add("Peter");
        set1.add("Adrian");
        set1.add("Michi");
        set1.add("Peter");
        set1.add("Benrt");

        //HashSet
        set2.add("Peter");
        set2.add("Adrian");
        set2.add("Michi");
        set2.add("Peter");
        set2.add("Benrt");

        //LinkedHashSet
        set3.add("Peter");
        set3.add("Adrian");
        set3.add("Michi");
        set3.add("Peter");
        set3.add("Benrt");


        //Datenausgabe
        System.out.println("Ausgabe Arraylist: ");
        Übung1.getElement(list1);
        System.out.println("\nAusgabe TreeSet:");
        Übung1.getElement(set1);
        System.out.println("\nAusgabe HashSet");
        Übung1.getElement(set2);
        System.out.println("\nAusgabe Linkedlist");
        Übung1.getElement(set3);




    }

    public static void getElement(Collection<String> collection){
        for(String string: collection){
            System.out.println(string);
        }
    }

}
