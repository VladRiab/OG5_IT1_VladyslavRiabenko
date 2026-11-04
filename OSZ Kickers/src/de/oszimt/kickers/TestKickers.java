package de.oszimt.kickers;

public class TestKickers {

    public static void main(String[] args) {

        Spieler spieler = new Spieler("Max Mustermann", "01761234567", true, 10, "Stuermer");

        Trainer trainer = new Trainer( "Thomas Mueller", "01769876543", true, 'A', 450.00);

        Schiedsrichter schiedsrichter = new Schiedsrichter("Peter Schmidt", "01765555555", false, 25);

        Mannschaftsleiter mannschaftsleiter = new Mannschaftsleiter("Leon Weber", "01764444444", true, 7, "Mittelfeld", "OSZ Kickers U18", 50.0 );

        System.out.println("===== SPIELER =====");
        System.out.println("Name: " + spieler.getName());
        System.out.println("Telefonnummer: " + spieler.getTelefonnummer());
        System.out.println("Beitrag bezahlt: " + spieler.isJahresbeitragBezahlt());
        System.out.println("Trikotnummer: " + spieler.getTrikotnummer());
        System.out.println("Spielposition: " + spieler.getSpielposition());

        System.out.println("===== TRAINER =====");
        System.out.println("Name: " + trainer.getName());
        System.out.println("Telefonnummer: " + trainer.getTelefonnummer());
        System.out.println("Beitrag bezahlt: " + trainer.isJahresbeitragBezahlt());
        System.out.println("Lizenzklasse: " + trainer.getLizenzklasse());
        System.out.println("Aufwandsentschaedigung: " + trainer.getAufwandsentschaedigung());

        System.out.println("===== SCHIEDSRICHTER =====");
        System.out.println("Name: " + schiedsrichter.getName());
        System.out.println("Telefonnummer: " + schiedsrichter.getTelefonnummer());
        System.out.println("Beitrag bezahlt: " + schiedsrichter.isJahresbeitragBezahlt());
        System.out.println("Gepfiffene Spiele: " + schiedsrichter.getGepfiffeneSpiele());

        System.out.println("===== MANNSCHAFTSLEITER =====");
        System.out.println("Name: " + mannschaftsleiter.getName());
        System.out.println("Telefonnummer: " + mannschaftsleiter.getTelefonnummer());
        System.out.println("Beitrag bezahlt: " + mannschaftsleiter.isJahresbeitragBezahlt());
        System.out.println("Trikotnummer: " + mannschaftsleiter.getTrikotnummer());
        System.out.println("Spielposition: " + mannschaftsleiter.getSpielposition());
        System.out.println("Mannschaft: " + mannschaftsleiter.getMannschaftsname());
        System.out.println("Rabatt: " + mannschaftsleiter.getRabatt() + " %");
    }
}