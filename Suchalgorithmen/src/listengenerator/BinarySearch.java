package listengenerator;

public class BinarySearch {
	 public static int anzahlVergleiche = 0;

	    public static int search(long[] a, long gesucht) {

	    	anzahlVergleiche = 0;

	        int links = 0;
	        int rechts = a.length - 1;

	        while (links <= rechts) {

	            int mitte = links + (rechts - links) / 2;

	            anzahlVergleiche++;

	            if (a[mitte] == gesucht) {
	                return mitte;
	            }

	            anzahlVergleiche++;

	            if (a[mitte] < gesucht) {
	                links = mitte + 1;
	            } else {
	                rechts = mitte - 1;
	            }
	        }

	        return -1;
	    }
	}
