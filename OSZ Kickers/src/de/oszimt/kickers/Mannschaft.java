package de.oszimt.kickers;

public class Mannschaft extends Person{

	private String spielklassen;
	
	public Mannschaft(String name, String telefonnummer, boolean jahresbeitragBezahlt, String spielklasse) {
		super(name, telefonnummer, jahresbeitragBezahlt);
		
	}
	
	
	
	public String getSpielklassen() {
		return spielklassen;
	}
	public void setSpielklassen(String spielklassen) {
		this.spielklassen = spielklassen;
	}
	
	
	
}
