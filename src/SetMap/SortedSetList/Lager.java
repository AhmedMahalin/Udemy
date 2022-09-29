package SetMap.SortedSetList;

import javax.management.InvalidApplicationException;
import javax.swing.text.Element;
import javax.swing.text.html.ImageView;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Lager  extends InvalidApplicationException {
    /**
     * Constructs an <CODE>InvalidApplicationException</CODE> with the specified <CODE>Object</CODE>.
     *
     * @param val the detail message of this exception.
     */
    public Lager(Object val) {
        super(val);

        Artikel schrank = new Artikel("Schrank","Download.jpeg");
        Artikel regal1 = new Artikel("regal","regal.jpeg" );

        Map<Integer, Artikel> lagerHalle = new HashMap<>();
        lagerHalle.put(1234,schrank);
        lagerHalle.put(2345, regal1);

        ImageView imgSchrank = new ImageView((Element) lagerHalle.get(1234).getArtikelBild());
        ImageView imgRegal = new ImageView((Element) lagerHalle.get(2345).getArtikelBild());

                Button button1 = new Button("Zeigee!");



            }
}
