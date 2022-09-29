package Exception;

public class Taschenrechner {

    int zahl1;
    int zahl2;


    public Taschenrechner(int zahl1, int zahl2) {
        this.zahl1 = zahl1;
        this.zahl2=zahl2;
            }

    public int dividieren(){
        int divident = zahl1 / zahl2;
        return divident;

    }

    public int subtrahieren(){
        int subtrahent= zahl1 - zahl2;
        return subtrahent;
    }

    public int addieren() {
         int summe = zahl1 + zahl2;
        return summe;
    }
}


