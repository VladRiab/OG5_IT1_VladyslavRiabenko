package de.oszimt.kickers;

public class Spieler extends Person {

    private int trikotnummer;
    private String spielposition;

    public Spieler(String name, String telefonnummer, boolean jahresbeitragBezahlt,
                   int trikotnummer, String spielposition) {

        super(name, telefonnummer, jahresbeitragBezahlt);

        this.trikotnummer = trikotnummer;
        this.spielposition = spielposition;
    }

    public int getTrikotnummer() {
        return trikotnummer;
    }

    public void setTrikotnummer(int trikotnummer) {
        this.trikotnummer = trikotnummer;
    }

    public String getSpielposition() {
        return spielposition;
    }

    public void setSpielposition(String spielposition) {
        this.spielposition = spielposition;
    }
}