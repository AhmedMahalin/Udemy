package OPP5;

public abstract class Tier {

    String name;
    int groeße;
    int gewicht;

    public Tier(String name, int groeße, int gewicht){
        this.name = name;
        this.groeße = groeße;
        this.gewicht = gewicht;

    }

    //Methoden
    public abstract void essen();

    public abstract void atmen();


}
