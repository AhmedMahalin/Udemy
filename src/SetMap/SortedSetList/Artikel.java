package SetMap.SortedSetList;

import javax.swing.*;

public class Artikel {

    private String artikelName;
    private ImageIcon artikelBild;


    public Artikel(String artikelName, String artikelBild) {
        this.artikelName = artikelName;
        this.artikelBild = new ImageIcon(artikelName) {

        };
        }


    public String getArtikelName() {
        return artikelName;
    }

    public void setArtikelName(String artikelName) {
        this.artikelName = artikelName;
    }

    public ImageIcon getArtikelBild() {
        return artikelBild;
    }

    public void setArtikelBild(ImageIcon artikelBild) {
        this.artikelBild = artikelBild;
    }
}
