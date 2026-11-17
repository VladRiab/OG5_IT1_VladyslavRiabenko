package listengenerator;

public class LinearSearch {
	
public static int anzahlVergleiche = 0;

public static int search(long[] a, long gesucht) {

	anzahlVergleiche = 0;

    for (int i = 0; i < a.length; i++) {

    	anzahlVergleiche++;

        if (a[i] == gesucht) {
            return i;
        }
    }

    return -1;
}
}
