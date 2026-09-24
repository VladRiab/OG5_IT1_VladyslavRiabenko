package de.oszimt.starsim2099;

public class Mond extends Himmelskoerper {
	// Attribute
	
	private boolean erzart;

	public Mond(double posX, double posY, String name, boolean erzart) {
		super(posX, posY, name);
		this.erzart = erzart;
	}
 public Mond() {
	 super() ;
 }
	// Methoden


	public boolean isErzart() {
		return erzart;
	}

	public void setErzart(boolean erzart) {
		this.erzart = erzart;
	}

	// Darstellung
	public static char[][] getDarstellung() {
		char[][] planetShape = { { '\0', '/', '*', '*', '\\', '\0' }, { '|', 'M', 'O', 'N', 'D', '|' },
				{ '\0', '\\', '*', '*', '/', '\0' } };
		return planetShape;
	}
}
