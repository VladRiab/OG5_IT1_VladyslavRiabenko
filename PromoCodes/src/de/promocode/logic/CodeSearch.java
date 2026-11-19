package de.promocode.logic;

public class CodeSearch {

	public static int NOT_FOUND = -1;

	/**
	 * Sucht einen Code in der Liste.
	 * 
	 * @param list
	 *            Liste der Codes im Long-Format
	 * @param searchValue
	 *            Gesuchter Code
	 * @return Index des Codes, wenn er vorhanden ist, NOT_FOUND wenn er nicht
	 *         gefunden werden konnte
	 */
	
	
	/**public static int findPromoCode(long[] list, long searchValue) {
	  for (int i = 0; i < list.length; i++) {
			if (list[i] == searchValue)
				return i;
		}

		return NOT_FOUND;
	}
      */
	
	 public static int findPromoCode(long[] codes, long gesucht) {
	        int links = 0;
	        int rechts = codes.length - 1;
	        
	        while (links <= rechts) {
	        	
	            int mitte = links + (rechts - links) / 2;
	            if (codes[mitte] == gesucht) {
	             
	            	return mitte; 
	            } 
	            
	            if (codes[mitte] < gesucht) {
	                 links = mitte + 1;
	            } 
	               else {
	                 rechts = mitte - 1;
	            }
	        }
	        return NOT_FOUND;
	    }
	}
	    
