package Primzahl;
import java.util.Scanner;

public class Aufgabe7punkt1 {
public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in); 
	  System.out.print("Geben Sie eine Zahl "); 
	  long zahl = scan.nextLong(); 
	  System.out.println(isPrim(zahl));
	  
	    }

	    public static boolean isPrim(long zahl) {
	        if (zahl < 2) {
	            return false;
	        }
	        for (long i = 2; i <= zahl / i; i++) {
	            if (zahl % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	}
