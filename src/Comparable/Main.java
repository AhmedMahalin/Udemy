package Comparable;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

class Person { //Objekt als Klasse
    private int id;
    private String name;

    public Person(int id, String name){
        this.id = id;
        this.name  = name;
    }
    public void Daten(){
        Scanner scanner = new Scanner(System.in);
        scanner.next();
        System.out.println("Danke für die eingabe");
    }
    public String toString(){
        return " ID: " + this.id + " Name: " + this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}





public class Main {



    public static void main(String[] args) {

        Set<Person> set2 = new HashSet<Person>();

        // neue Personen hinzufügen

        Person p1 = new Person(1, "Chris");
        Person p2 = new Person(2, "Peter");
        Person p3 = new Person(3, "Hans");
        Person p4 = new Person(4, "Randy");
        Person p5 = new Person(1, "Chris");

        set2.add(p1);
        set2.add(p2);
        set2.add(p3);
        set2.add(p5);

        //Person = typ , person= ist das element wo die einzlenen typen gespeichert werden. , set = kollektion
        for (Person person : set2){
           System.out.println(person);


        }
    }
}
