package domein;

public class Sleutel extends Voorwerp {
	
	private int deur;
	private static int aantalInOmloop = 0;

	public Sleutel(String naam, double gewicht, int niveau, int deur) {
		super(naam, gewicht, niveau);
		// TODO Auto-generated constructor stub
		this.setDeur(deur);
		aantalInOmloop++;
	}

	private int getDeur() {
		return deur;
	}

	private void setDeur(int deur) {
		if(deur < 0) {
			throw new IllegalArgumentException("positief getal");
		}
		this.deur = deur;
	}
		
	
	public boolean pastOp(int deur) {
		return true;
	}
	
	@Override
	public String toString() {
		String output;
		output = String.format("Sleutel %s past op deur %d.%nEr zijn %d sleutel(s) in omloop.%n", super.toString(), this.getDeur(), this.aantalInOmloop);
		return output;
	}
	
	

}
