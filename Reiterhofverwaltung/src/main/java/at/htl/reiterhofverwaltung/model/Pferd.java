package at.htl.reiterhofverwaltung.model;

public class Pferd {

    String name;
    String rasse;

    public Pferd(String name, String rasse) {
        this.name = name;
        this.rasse = rasse;
    }

    public Pferd(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRasse() {
        return rasse;
    }

    public void setRasse(String rasse) {
        this.rasse = rasse;
    }
}
