package cui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Oefening21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> positieveEigenschappen = new ArrayList<>();
		List<String> negatieveEigenschappen = new ArrayList<>();
		
		Scanner input = new Scanner(System.in);
		
		final int AANTAL_VRAGEN = 3;
		int counter = 0;
		int type_vraag;
		String omschrijving;
		
		// input
			
		do {
			System.out.print("Is het een positieve (=1) of negatieve (=2) eigenschap?");
			type_vraag = input.nextInt();
			if(type_vraag == 1 || type_vraag == 2) {
				System.out.print("Omschrijf deze eigenschap:");
				input.nextLine();
				omschrijving = input.nextLine();
				switch(type_vraag) {
				case 1: positieveEigenschappen.add(omschrijving);
				        break;
				case 2: negatieveEigenschappen.add(omschrijving);
				        break;
				}
				counter++;
			}
			
		}while((type_vraag != 1 && type_vraag != 2) || counter < AANTAL_VRAGEN);
		
		// output
		System.out.print("Positieve eigenschappen: ");
		if(positieveEigenschappen.size()==0) {
			System.out.print("geen\n");
		}
		else {
			for(String pe: positieveEigenschappen) {
				System.out.printf("%s, ", pe);
			}
		}
		System.out.println();
		System.out.print("Negatieve eigenschappen: ");
		if(negatieveEigenschappen.size()==0) {
			System.out.print("geen\n");
		}
		else {
			for(String ne: negatieveEigenschappen) {
				System.out.printf("%s, ", ne);
			}
		}
		input.close();
	}

}
