package de.oszimt.kickers;

public class Mannschaftsleiter extends Spieler {

    private String mannschaftsname;
    private double rabatt;

    public Mannschaftsleiter(String name, String telefonnummer, boolean jahresbeitragBezahlt, int trikotnummer, String spielposition, String mannschaftsname, double rabatt) {
        super(name, telefonnummer, jahresbeitragBezahlt, trikotnummer, spielposition);
        this.mannschaftsname = mannschaftsname;
        this.rabatt = rabatt;
    }

    public String getMannschaftsname() {
        return mannschaftsname;
    }

    public void setMannschaftsname(String mannschaftsname) {
        this.mannschaftsname = mannschaftsname;
    }

    public double getRabatt() {
        return rabatt;
    }

    public void setRabatt(double rabatt) {
        this.rabatt = rabatt;
    }
}
