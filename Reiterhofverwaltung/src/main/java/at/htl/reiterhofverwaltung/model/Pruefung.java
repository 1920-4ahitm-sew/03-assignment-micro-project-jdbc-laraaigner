package at.htl.reiterhofverwaltung.model;

import java.sql.Time;
import java.util.Date;

public class Pruefung {

    Date pruefungsdatum;
    Time pruefungsUhrzeit;
    String reitweise;

    public Pruefung(Date pruefungsdatum, Time pruefungsUhrzeit, String reitweise) {
        this.pruefungsdatum = pruefungsdatum;
        this.pruefungsUhrzeit = pruefungsUhrzeit;
        this.reitweise = reitweise;
    }

    public Pruefung() {

    }

    public Date getPruefungsdatum() {
        return pruefungsdatum;
    }

    public void setPruefungsdatum(Date pruefungsdatum) {
        this.pruefungsdatum = pruefungsdatum;
    }

    public Time getPruefungsUhrzeit() {
        return pruefungsUhrzeit;
    }

    public void setPruefungsUhrzeit(Time pruefungsUhrzeit) {
        this.pruefungsUhrzeit = pruefungsUhrzeit;
    }

    public String getReitweise() {
        return reitweise;
    }

    public void setReitweise(String reitweise) {
        this.reitweise = reitweise;
    }
}
