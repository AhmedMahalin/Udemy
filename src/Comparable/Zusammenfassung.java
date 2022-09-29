package Comparable;

import java.util.*;

class Personen{
    private String vorName;

    
    public Personen(String vorName){
        this.vorName = vorName;
    }

    @Override
    public String toString() {
        return "Personen{" + "vorName='" + vorName + '\'' + '}';
    }
}





public class Zusammenfassung {


    public static void main(String[] args) {

        //List  Liste -> Einkaufsliste
        List<Personen> list = new ArrayList<>();

        //
       Zusammenfassung.addElements(4,list);
       Zusammenfassung.getElements(list);

        //for(Ty ,parameternameist egal: Struktur)



        System.out.println("___________");
        Set<String> set = new TreeSet<>();
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


