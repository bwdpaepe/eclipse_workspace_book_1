package cui;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class Oefening210 {
	
	private static SecureRandom sr = new SecureRandom();
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private static void kiesGetallen(int[] getallen) {
		
	}
	
	private int kiesGetal(boolean willekeurig) {
		int invoer;
		if(willekeurig) {
			invoer = sr.nextInt(45)+1;
		}
		else {
			do {
				System.out.print("geef getal tussen 1 en 45:");
				invoer = input.nextInt();
			}while(invoer<1 || invoer >45);
		}
		return invoer;
		
	}
	
	private boolean komtVoor(int element, int[] array) {
		if(Arrays.binarySearch(array, element) == -1) {
			return false;
		}
		return true;
	}
	
	private int controleer(int[]gekozen, int[]getrokken) {
		int aantal=0;
		
		for(int gekozenElement: gekozen) {
			if(Arrays.asList(getrokken).contains(gekozenElement)) {
				aantal++;
			}
		}
		
		return aantal;
	}
	
	

}
