package ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import domein.Hond;
import domein.Kat;

public class DierApplicatie {
	
	List<Hond> hondLijst;
	List<Kat> katLijst;
	Scanner input = new Scanner(System.in);
	
	public void start() {
		hondLijst = new ArrayList<>();
		katLijst = new ArrayList<>();
		// aantal honden
		int aantal = this.voerAantalIn("honden");
		for(int i = 0; i< aantal; i++) {
			this.voegToeAanHondLijst(hondLijst);
		}
		
		
		// aantal katten
		aantal = this.voerAantalIn("katten");
		for(int i = 0; i< aantal; i++) {
			this.voegToeAanKatLijst(katLijst);
		}
		
		
		// print honden
		System.out.print(this.geefHondLijst(hondLijst));
		
		
		// print katten
		System.out.print(this.geefKatLijst(katLijst));
		
	}
	
	private int voerAantalIn(String dieren) {
		
		int aantal;
		
		do {
			System.out.printf("geef aantal %s%n", dieren);
			aantal = input.nextInt();
		}while(aantal > 10);
		
		return aantal;
		
	}
	
	private void voegToeAanHondLijst(List<Hond> hondLijst) {
		System.out.print("geef naam van hond");
		String naam = input.next();
		System.out.print("geef geboortejaar van hond");
		int geboortejaar = input.nextInt();
		hondLijst.add(new Hond(geboortejaar,naam));
		
	}
	
	private void voegToeAanKatLijst(List<Kat> katLijst) {
		System.out.print("geef geboortejaar van kat");
		int geboortejaar = input.nextInt();
		katLijst.add(new Kat(geboortejaar));
	}
	
	private String geefHondLijst(List<Hond> hondLijst) {
		String output="";
		for(Hond enkeleHond: hondLijst) {
			output += enkeleHond.toString();
		}
		return output;
	}
	
	private String geefKatLijst(List<Kat> katLijst) {
		String output="";
		for(Kat enkeleKat: katLijst) {
			output += enkeleKat.toString();
		}
		return output;
	}

}
