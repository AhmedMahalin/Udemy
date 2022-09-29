package Collection;

import java.util.LinkedList;

public class DSLinkedList {

    public static void main(String[] args) {

        // Datenstruktur erstellen

        LinkedList<Integer> liste = new LinkedList<Integer>();

        //Dateneingabe

        for (int i = 0; i< 1000000; i++){
            liste.add(i);
        }

        //Zeit messen

        final long timeStart = System.currentTimeMillis();
        DSLinkedList.getZahlen(199999,liste);
        final long timeEnd = System.currentTimeMillis();
        System.out.println("Das Suchen hat gedauert:  " + (timeEnd - timeStart) + " Millisek.");

    }
    public static void getZahlen(int index, LinkedList<Integer> liste){
        System.out.println(liste.get(index));
    }
}
