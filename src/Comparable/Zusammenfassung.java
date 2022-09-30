package Comparable;

import java.util.*;

class Personen implements Comparable<Personen> {
    private String vorName;


    public Personen(String vorName) {
        this.vorName = vorName;
    }

    @Override
    public String toString() {
        return "Personen{" + "vorName='" + vorName + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personen personen = (Personen) o;
        return Objects.equals(vorName, personen.vorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vorName);
    }

    @Override
    public int compareTo(Personen o) {
        return vorName.compareTo(o.vorName);
        //     vorName vergleichemit das objekt was hinzugefügt wurde
    }
}
    /*wie funktioniert compare to : 
    @Oversized
    public int compareTo(Person o){

        int laenge1 = vorName.length();
        int laenge2 = o.vorName.length();

        if(laenge1 > laenge2){
            return 1;
        }else if(laenge1< laenge2){
            return -1;
        }else{
            return 0;
         }


*/


    // hier wird immer ein int wert gebrauch so sortiert die Methode
    // 0 = Beide gleich
    // 1 = Objekt ist größer
    // -1 = Objekt ist kleiner






public class Zusammenfassung {


    public static void main(String[] args) {

        //List  Liste -> Einkaufsliste
        List<Personen> list = new ArrayList<>();
        Set<Personen> set = new TreeSet<>();
        //
       Zusammenfassung.addElements(4,list);
       Zusammenfassung.getElements(list);
        //for(Ty ,parameternameist egal: Struktur)

        Zusammenfassung.addElements(2,set);
        Zusammenfassung.getElements(set);

        System.out.println("___________");

    }
        //Collection ist entweder ein set oder list
        public static void addElements(int anzahlPerson, Collection<Personen> col){
        for(int i = 1; i <= anzahlPerson; i++){
            Scanner scanName = new Scanner(System.in);
            System.out.println("Name eingeben: ");
            String eingabeName = scanName.next();
            Personen personen = new Personen(eingabeName); //Referenzvariable wo die varibale gespeichert wird
            col.add(personen);



        }

        }
            public static void getElements(Collection<Personen> col){
                for (Personen personen : col){
                    System.out.print("Name der Person");
                    System.out.println(personen);
                }
            }
        }


