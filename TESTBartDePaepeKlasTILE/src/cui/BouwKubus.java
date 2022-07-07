package cui;

import java.util.Scanner;

public class BouwKubus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int aantalKubus = 0;
		do {
			System.out.print("Geef het aantal gewenste kubussen [1-20]: ");
			aantalKubus = input.nextInt();
			
		}while(aantalKubus < 1 || aantalKubus > 20);
		
		int[] aantalBlokjesArray = new int[aantalKubus];
		int som = 0;
		
		for(int i = 0; i < aantalBlokjesArray.length; i++) {
			aantalBlokjesArray[i] = BouwKubus.aantalBlokjes(i+1);
			som+=BouwKubus.aantalBlokjes(i+1);
		}
		
		System.out.printf("Om %d kubussen van opeenvolgende groottes te maken, zijn %d blokjes nodig.", aantalKubus, som);
		
		int counter = 1;
		for(int blokje: aantalBlokjesArray) {
			System.out.printf("We berekenden dit met de volgende som: %d", blokje);
			if(counter<aantalBlokjesArray.length) {
				System.out.print("+");
			}
			else {
				System.out.printf("=%d",som);
			}
				
			counter++;
		}

	}
	
	private static int aantalBlokjes(int dimensie) {
		int aantal = 1;
		for(int i = 1; i<=dimensie;i++) {
			aantal *= dimensie;
		}
		return aantal;
	}

}
