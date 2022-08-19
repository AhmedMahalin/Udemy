package OOP1;

public class Hund {
    //Eigenschaften
    String name;
    int alter;
    String rasse;

    public Hund(String name, int alter, String rasse) {
        this.name = name; // this.name geht nach obben in den namen und = name weißt ihm dann ein x beliebiges  varaible hinzu
        this.alter = alter;
        this.rasse = rasse;


    }

    public void bellen(){
        System.out.println("Der Hund: " + this.name + " bellt");
    }


}
