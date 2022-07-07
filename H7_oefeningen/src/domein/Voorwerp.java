package domein;

public class Voorwerp {
	private final String naam;
	private double gewicht;
	private int niveau;
	
	public Voorwerp(String naam, double gewicht, int niveau) {
		controleerNaam(naam);
		this.naam = naam;
		this.setGewicht(gewicht);
		this.setNiveau(niveau);
	}
	
	public Voorwerp(String naam, double gewicht) {
		this(naam, gewicht, 1);
	}

	private double getGewicht() {
		return gewicht;
	}

	private void setGewicht(double gewicht) {
		if(gewicht < 0 || gewicht > 1000) {
			throw new IllegalArgumentException("positief getal, kleiner dan 1000");
		}
		this.gewicht = gewicht;
	}

	private int getNiveau() {
		return niveau;
	}

	private void setNiveau(int niveau) {
		if(niveau < 1 || niveau > 10) {
			throw new IllegalArgumentException("niveau : 1 -> 10");
		}
		this.niveau = niveau;
	}

	private String getNaam() {
		return naam;
	}
	
	private void controleerNaam(String naam) {
		if(naam == null || naam.trim().isEmpty()) {
			throw new IllegalArgumentException("Elk voorwerp moet verplicht een naam hebben.");
		}
	}
	
	@Override
	public String toString() {
		String output;
		output = String.format("Voorwerp %s met gewicht %.3f kg uit niveau %d.%n", this.getNaam(), this.getGewicht(), this.getNiveau());
		return output;
	}
	
	
	
	
	

}
