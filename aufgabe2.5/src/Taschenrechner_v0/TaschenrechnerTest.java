package Taschenrechner_v0;
import java.util.Scanner;
public class TaschenrechnerTest {


		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner myScanner = new Scanner(System.in);
			taschenrechner ts = new taschenrechner();

			int swValue;

			// Display menu graphics
			System.out.println("============================");
			System.out.println("|   MENU SELECTION DEMO    |");
			System.out.println("============================");
			System.out.println("| Options:                 |");
			System.out.println("|        1. Addieren       |");
			System.out.println("|        2. Subtrahieren   |");
			System.out.println("|        3. Dividieren     |");
			System.out.println("|        4. Multiplizieren |");
			System.out.println("|        5. Exit           |");
			System.out.println("============================");
			System.out.print(" Select option: ");
			swValue = myScanner.next().charAt(0);

			// Switch construct
			switch (swValue) {
			case '1':
				System.out.println("4 + 5 = " + ts.add(4, 5));
				break;
				
			case '2':
				System.out.println("4 - 5 = " + ts.sub(4, 5));
				break;
				
			case '3':
				System.out.println("4 / 5 = " + ts.div(4, 5));
				break;
				
			case '4':
				System.out.println("4 * 5 = " + ts.mul(4, 5));
				break;
				
			case '5':
				System.out.println("Chao <3");
				break;
				
				
			  
			default:
				System.out.println("Invalid selection");
				break; // This break is not really necessary
			}
			
		}
	
}

