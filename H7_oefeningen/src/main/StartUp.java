package main;

import cui.VoorwerpApplicatie;
import domein.DomeinController;

public class StartUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*VoorwerpApplicatie vwa = new VoorwerpApplicatie();
		vwa.start();*/
		
		DomeinController dc = new DomeinController();
		
		new VoorwerpApplicatie(dc).start();

	}

}
