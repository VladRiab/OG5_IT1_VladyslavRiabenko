package de.oszimt.kickers;

public class Trainer extends Person {

    private char lizenzklasse;
    private double aufwandsentschaedigung;

    public Trainer(String name, String telefonnummer, boolean jahresbeitragBezahlt,
                   char lizenzklasse, double aufwandsentschaedigung) {

        super(name, telefonnummer, jahresbeitragBezahlt);

        this.lizenzklasse = lizenzklasse;
        this.aufwandsentschaedigung = aufwandsentschaedigung;
    }

    public char getLizenzklasse() {
        return lizenzklasse;
    }

    public void setLizenzklasse(char lizenzklasse) {
        this.lizenzklasse = lizenzklasse;
    }

    public double getAufwandsentschaedigung() {
        return aufwandsentschaedigung;
    }

    public void setAufwandsentschaedigung(double aufwandsentschaedigung) {
        this.aufwandsentschaedigung = aufwandsentschaedigung;
    }
}