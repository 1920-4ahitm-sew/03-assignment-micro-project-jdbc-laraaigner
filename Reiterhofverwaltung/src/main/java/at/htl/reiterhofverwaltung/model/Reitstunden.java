package at.htl.reiterhofverwaltung.model;

import java.util.Date;

public class Reitstunden {

    int dauer;
    Date datum;

    public Reitstunden(int dauer, Date datum) {
        this.dauer = dauer;
        this.datum = datum;
    }

    public Reitstunden() {
    }

    public int getDauer() {
        return dauer;
    }

    public void setDauer(int dauer) {
        this.dauer = dauer;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }
}
