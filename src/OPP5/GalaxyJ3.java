package OPP5;

public class GalaxyJ3 extends Samsung implements Telefon{


    GalaxyJ3(double preis, String produktTyp){
        super(preis, produktTyp);
        this.setPreis(preis);
        this.setProduktTyp(produktTyp);
    }

    @Override
    public void powerOn() {
        System.out.println("Das GalaxyJ3 geht an der rechten Seite an.");
    }

    @Override
    public boolean esKlingelt() {
        return false;
    }

    @Override
    public void anrufen() {

    }
}
