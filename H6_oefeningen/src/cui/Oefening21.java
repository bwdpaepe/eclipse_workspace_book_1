package cui;

import java.util.Scanner;

public class Oefening21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		boolean isGeldig;
		do {
			System.out.print("Geef een btw-nummer van de vorm ABC.PQR.XYZ zonder de puntjes: ");
			int nr = input.nextInt();
			isGeldig = isGeldig(nr);
			System.out.printf("%d is een %s btw-nummer%n%n", nr, isGeldig?"geldig":"ongeldig");
			
			
		}while(!isGeldig);
		input.close();

	}
	
	public static boolean isGeldig(int nr) {
		
		boolean isGeldig = false;
		
		int deel1 = nr / 100;
		int deel2 = nr % 100;
		
		if((deel1 % 97) + deel2 == 97) {
			isGeldig = true;
		}
		
		return isGeldig;
		
	}

}
