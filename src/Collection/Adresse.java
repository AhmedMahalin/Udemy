package Collection;

public class Adresse {

    //Eigenschaften


    public Adresse(String name, String straße, String stadt) {
        this.name = name;
        this.straße = straße;
        this.stadt = stadt;
    }
    private String name;

    private String straße;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStraße() {
        return straße;
    }

    public void setStraße(String straße) {
        this.straße = straße;
    }

    private String stadt;
    public String getStadt(){
        return stadt;
    }
    public void setStadt(){
       this.stadt = stadt;
    }
}
