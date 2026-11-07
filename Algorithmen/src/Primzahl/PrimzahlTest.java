package Primzahl;
import java.util.Scanner;

public class PrimzahlTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Timer t1 = new Timer();
		System.out.print("Geben Sie eine Zahl ");
		t1.starten(); 
		  long zahl = scan.nextLong(); 
	
	boolean ergebnis = Aufgabe7p1.isPrim(zahl);
	t1.stoppen();
	System.out.println("Zahl |" + zahl);
	System.out.println("Primzahl |" + ergebnis);
	System.out.println("Dauerzeit |" + t1.dauer + " Millisekunden");
	t1.reset();
   }
}
