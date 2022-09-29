package SetMap.SortedSetList;

import java.util.HashMap;
import java.util.Map;

public class MAp {

    public static void main(String[] args) {

        // V = value
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(123, "Tisch Linnom");
        map1.put(300, "Stuhl bekant");

        //System.out.println("Wert: " + map1.get(123));


        for (Integer key: map1.keySet()) {
            System.out.println("Artikelnummer: " + key);
            String value = map1.get(key);  //get gibt mit den inhalt der mit dem jeweiligen Key verbunden ist
            System.out.println("Wert: " + value);


        }
    }
}
