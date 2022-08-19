package Collection;

public class Kontakte {

    private String name;
    private String telefonnummer;

    public Kontakte(String name, String telefonnummer) {
        this.name = name;
        this.telefonnummer = telefonnummer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    public static Kontakte erstelleKontakt(String name, String telefonnummer){
      return new Kontakte(name,telefonnummer);

    }


    }

