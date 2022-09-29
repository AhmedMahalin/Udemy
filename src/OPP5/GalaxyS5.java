package OPP5;

public class GalaxyS5 extends Samsung implements Telefon {
    private String farbe;

    public GalaxyS5(double preis, String produktTyp, String farbe) {
        super(preis, produktTyp);
        this.farbe = farbe;
    }



    @Override // überschreiben
    public void powerOn() {

    }

    @Override
    public boolean esKlingelt() {
        return false;
    }

    @Override
    public void anrufen() {

    }
}
