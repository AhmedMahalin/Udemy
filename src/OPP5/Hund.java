package OPP5;

public class Hund extends Tier{
    //Eigenschaften
        int zaehne;

    public Hund(String name, int groeße, int gewicht) {
        super(name,groeße ,gewicht);
        this.zaehne = zaehne;


    }

    public void bellen(){
        System.out.println("Der Hund: " + this.name + " bellt");
    }


    @Override
    public void essen() {
        System.out.println("Der Hund: " + this.name + " isst. ");
    }

    @Override
    public void atmen() {
        System.out.println("Der Hund: " + this.name+ "atmet");
    }
}
