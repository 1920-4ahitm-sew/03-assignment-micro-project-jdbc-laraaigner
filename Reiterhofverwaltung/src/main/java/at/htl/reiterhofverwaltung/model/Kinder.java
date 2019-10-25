package at.htl.reiterhofverwaltung.model;

public class Kinder extends Person {

    String ausbildungsart;

    public Kinder(String vorname, String nachname, int alter, String ausbildungsart) {
        super(vorname, nachname, alter);
        this.ausbildungsart = ausbildungsart;
    }

    public Kinder() {
    }

    public String getAusbildungsart() {
        return ausbildungsart;
    }

    public void setAusbildungsart(String ausbildungsart) {
        this.ausbildungsart = ausbildungsart;
    }
}
