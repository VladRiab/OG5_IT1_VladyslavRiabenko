package de.oszimt.kickers;

public class Schiedsrichter extends Person {

    private int gepfiffeneSpiele;

    public Schiedsrichter(String name, String telefonnummer, boolean jahresbeitragBezahlt,int gepfiffeneSpiele) {
       super(name, telefonnummer, jahresbeitragBezahlt);

        this.gepfiffeneSpiele = gepfiffeneSpiele;
    }

    public int getGepfiffeneSpiele() {
        return gepfiffeneSpiele;
    }

    public void setGepfiffeneSpiele(int gepfiffeneSpiele) {
        this.gepfiffeneSpiele = gepfiffeneSpiele;
    }
}
