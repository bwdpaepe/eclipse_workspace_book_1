package domein;

public class DomeinController {
	private VoorwerpRepository vwr;
	
	public DomeinController() {
		this.vwr = new VoorwerpRepository();
		
	}
	
	public void voegWapenToe(String naam, double gewicht, int niveau, int kracht, boolean gebruikt) {
		this.vwr.voegVoorwerpToe(new Wapen(naam, gewicht, niveau, kracht, gebruikt));
	}
	
	public void voegSleutelToe(String naam, double gewicht, int niveau, int deur) {
		this.vwr.voegVoorwerpToe(new Sleutel(naam, gewicht, niveau, deur));
	}
	
	public String geefOverzicht() {
		return this.vwr.geefOverzicht();
	}

}
