package at.htl.reiterhofverwaltung.model;

public class Gehege {

    String art;
    int groesse;

    public Gehege(String art, int groesse) {
        this.art = art;
        this.groesse = groesse;
    }

    public Gehege() {
    }

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }

    public int getGroesse() {
        return groesse;
    }

    public void setGroesse(int groesse) {
        this.groesse = groesse;
    }
}
