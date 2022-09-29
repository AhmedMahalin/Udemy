package Comparable;

import java.util.*;

class Personen{
    private String vorName; 
    
    public Personen(String varName){
        this.vorName = vorName;
    }
}





public class Zusammenfassung {
    private static Object Collection;

    public static void main(String[] args) {

        //List  Liste -> Einkaufsliste
        List<Personen> list = new ArrayList<>();

        //
        Zusammenfassung.addElements(3, list);
        Zusammenfassung.getElements(list);
        //for(Ty ,parameternameist egal: Struktur)


      Set<String> set = new TreeSet<>();
        System.out.println("___________");
      // <lets get it>
    }
                //Collection ist entweder ein set oder list
        public static void addElements(int anzahlPerson, Collection<Personen> col){
        for(int i = 1; i <= anzahlPerson; i++){
            Scanner scanName = new Scanner(System.in);
            System.out.println("Name eingeben");
            String eingabeName = scanName.next();
            Personen personen = new Personen(eingabeName); //Referenzvariable wo die varibale gespeichert wird
            col.add(personen);



        }

        }
            public static void getElements(Collection<Personen> col){
                for (Personen i : col){
                    System.out.println("Name der Person");
                    System.out.println(i);
                }
            }
        }


