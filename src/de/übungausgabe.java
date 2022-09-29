package de;

import Collection.Kontakt;
import Collection.handy;

public class übungausgabe {
    public static void main(String[] args) {

        handy iphone6  = new handy();

        iphone6.addKontakt(Kontakt.erstelleKontakt("Christian", "0157833"));
        iphone6.addKontakt(Kontakt.erstelleKontakt("Peter", " 01998"));
        iphone6.findKontakt("Peter");

        iphone6.ausgabe();

    }
}
