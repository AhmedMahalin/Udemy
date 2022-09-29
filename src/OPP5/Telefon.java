package OPP5;

public interface Telefon {
    //Attribute -> nur Konstante, alle Attributen sind finals
    public static final String NETZANBIETER = "Telekom";

    // Methodensignaturen/ Methodenköpfe
    // methoden werden automatisch abstract beim interface
    public abstract void powerOn();
    public abstract boolean esKlingelt();
    public abstract void anrufen();


}
