package Primzahl;

public class Timer {
	 public long startzeit;
	 public long endzeit;
	 public long dauer;
	 
		 public void starten() {
			this.startzeit = System.currentTimeMillis();
			
		}
		 public void stoppen() {
			 this.endzeit = System.currentTimeMillis();
			
		 }
		 
		 public void reset() {
			 this.startzeit = 0;
		     this.endzeit = 0;
		 }
			 
		 public void dauer() {
			 this.dauer = endzeit - startzeit;
	         System.out.println(dauer);
		 }
		 

	}
