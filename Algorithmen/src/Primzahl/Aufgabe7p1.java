package Primzahl;
import java.util.Scanner;
public class Aufgabe7p1 {

	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		  long zahl = scan.nextLong(); 
		  boolean ergebnis = isPrim(zahl);
		  System.out.println("Primzahl |" + ergebnis);
		
		
	}
	        
		    public static boolean isPrim(long zahl) {
		    	
		    	if (zahl < 2) {
		            return false;
		        }
		        for (long i = 2; i < zahl ; i++) {
		            if (zahl % i == 0) {
		                return false;
		            }
		        }
		        return true;
		        
		    }
		    
		}

