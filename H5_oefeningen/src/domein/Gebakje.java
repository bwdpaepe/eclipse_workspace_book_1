package domein;

public class Gebakje {
	
	private String naam;
	private double prijs;
	
	public Gebakje(String naam, double prijs) {
		this.setNaam(naam);
		this.setPrijs(prijs);
	}
	
	



	private String getNaam() {
		return naam;
	}

	private void setNaam(String naam) {
		this.naam = naam;
	}

	private double getPrijs() {
		return prijs;
	}

	private void setPrijs(double prijs) {
		this.prijs = prijs;
	}
	
	@Override
	public String toString() {
		
	}
}