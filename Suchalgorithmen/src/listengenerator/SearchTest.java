package listengenerator;
import java.util.Scanner;
public class SearchTest {
	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);

	    int n = 20000000;

	    long[] a = SortedListGenerator.getSortedList(n);

	    System.out.println("Bitte geben Sie die gesuchte Zahl ein:");
	    long gesucht = sc.nextLong();

	    // Lineare Suche
	    long start = System.nanoTime();

	    int resultLinear = LinearSearch.search(a, gesucht);

	    long end = System.nanoTime();

	    System.out.println("LINEARE SUCHE");
	    System.out.println("Index: " + resultLinear);
	    System.out.println("Vergleiche: " + LinearSearch.anzahlVergleiche);
	    System.out.println("Zeit: " + (end - start) / 1000000.0 + " ms");


	    // Binaere Suche
	    start = System.nanoTime();

	    int resultBinary = BinarySearch.search(a, gesucht);

	    end = System.nanoTime();

	    System.out.println("BINAERE SUCHE");
	    System.out.println("Index: " + resultBinary);
	    System.out.println("Vergleiche: " + BinarySearch.anzahlVergleiche);
	    System.out.println("Zeit: " +
	        (end - start) / 1000000.0 + " ms");

	}
	}
	
