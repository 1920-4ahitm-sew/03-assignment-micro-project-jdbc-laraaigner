package at.htl.reiterhofverwaltung.model;

public class Trainer extends Person {

    String ausbildung;

    public Trainer(String vorname, String nachname, int alter, String ausbildung) {
        super(vorname, nachname, alter);
        this.ausbildung = ausbildung;
    }

    public Trainer() {
    }

    public String getAusbildung() {
        return ausbildung;
    }

    public void setAusbildung(String ausbildung) {
        this.ausbildung = ausbildung;
    }
}
