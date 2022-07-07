package cui;

import domein.DomeinController;


public class VoorwerpApplicatie {
	
	private DomeinController dc;
	
	public VoorwerpApplicatie(DomeinController dc) {
		this.dc = dc;
	}
	
	public void start() {
		System.out.print(this.dc.geefOverzicht());
		
		this.dc.voegWapenToe("colt", 1.500, 3, 6, false);
		this.dc.voegWapenToe("brown", 0.500, 1, 23, true);
		this.dc.voegSleutelToe("voordeur", 0.500, 3, 1);
		this.dc.voegSleutelToe("achterdeur", 0.500, 1, 2);
		
		System.out.print(this.dc.geefOverzicht());
		
		
				
	}

}
