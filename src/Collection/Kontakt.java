package Collection;

public class Kontakt {

    private String name;
    private String telefonnummer;

    public Kontakt(String name, String telefonnummer) {
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

    public static Kontakt erstelleKontakt(String name, String telefonnummer){
      return new Kontakt(name,telefonnummer);

    }


    }

