package de.oszimt.kickers;

public abstract class Person {

    private String name;
    private String telefonnummer;
    private boolean jahresbeitragBezahlt;

    public Person(String name, String telefonnummer, boolean jahresbeitragBezahlt) {
        this.name = name;
        this.telefonnummer = telefonnummer;
        this.jahresbeitragBezahlt = jahresbeitragBezahlt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    public boolean isJahresbeitragBezahlt() {
        return jahresbeitragBezahlt;
    }

    public void setJahresbeitragBezahlt(boolean jahresbeitragBezahlt) {
        this.jahresbeitragBezahlt = jahresbeitragBezahlt;
    }
}
