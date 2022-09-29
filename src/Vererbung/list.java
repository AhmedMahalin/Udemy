package Vererbung;

import java.util.ArrayList;

public class list {

    public static void main(String[] args) {

        ArrayList<String> studenten = new ArrayList<String>();

        studenten.add("Peter");
        studenten.add("franz");

        System.out.println(studenten.size());

        System.out.println(studenten.get(0));

        System.out.println(studenten.set(0, "rolf"));

        System.out.println(studenten.get(0));


        System.out.println(studenten.remove("franz"));

        System.out.println(studenten.indexOf("rolf"));


    }

}
