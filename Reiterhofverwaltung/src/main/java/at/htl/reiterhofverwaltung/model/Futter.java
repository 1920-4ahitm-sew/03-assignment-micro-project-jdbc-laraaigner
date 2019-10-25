package at.htl.reiterhofverwaltung.model;

public class Futter {

    String menge;
    String art;

    public Futter(String menge, String art) {
        this.menge = menge;
        this.art = art;
    }

    public Futter() {
    }

    public String getMenge() {
        return menge;
    }

    public void setMenge(String menge) {
        this.menge = menge;
    }

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }
}
