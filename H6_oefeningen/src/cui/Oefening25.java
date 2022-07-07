package cui;

import java.util.Scanner;

import domein.Stappenteller;

public class Oefening25 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Oefening25 oefening25 = new Oefening25();
		// begin van de dag
		int startVanDeDag = oefening25.voerUurIn("Geef het uur waarop je bent opgestaan", 0, 23);
		// einde van de dag
		int eindeVanDeDag = oefening25.voerUurIn("Geef het uur waarop je bent gaan slapen", startVanDeDag, 23);
		
		// maak stappenteller voor elk uur tussen begin en einde
		Stappenteller[] stappentellerArray = new Stappenteller[eindeVanDeDag-startVanDeDag];
		for(int i = 0; i < stappentellerArray.length; i++) {
			stappentellerArray[i]= oefening25.maakStappenteller(startVanDeDag + i);
		}
		
		System.out.printf("%20s%40s%10s%n%n", "UUR","ACTIVITEIT","#STAPPEN");
		int counter = 0;
		for(Stappenteller enkeleStap: stappentellerArray) {
			System.out.printf("%20d%s%n",startVanDeDag+counter,enkeleStap);
			counter++;
		}

	}
	
	private Stappenteller maakStappenteller(int hetUur) {
		System.out.printf("Wat heb je om %du gedaan? ", hetUur);
		String activiteit = input.nextLine();
		input.nextLine();
		System.out.print("Hoeveel stappen heb je gezet (max. 1000)?");
		int aantalStappen = input.nextInt();
		System.out.print("Geeft 1 voor een activiteit op vlakke grond, 2 voor een activiteit bergop en 3 voor een activiteit bergaf.\nWelke soort activiteit was dit?");
		int soort = input.nextInt();
		return new Stappenteller(activiteit, aantalStappen, soort); // activiteit // hoeveelheid // soort
	}
	
	private int voerUurIn(String prompt, int van, int tot) {
		int invoerUur;
		do {
			System.out.printf("%s (tussen %d en %d): ", prompt, van, tot);
			invoerUur = input.nextInt();
		}while(invoerUur < van || invoerUur > tot);
		return invoerUur;
		
	}

}
