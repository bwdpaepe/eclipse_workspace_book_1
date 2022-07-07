package domein;

public class Kat extends Dier {

	public Kat(int geboortejaar) {
		super(geboortejaar);
		this.controleerGeboortejaar(geboortejaar);
		// TODO Auto-generated constructor stub
	}
	
	private void controleerGeboortejaar(int geboortejaar) {
		if(geboortejaar > this.geefHuidigJaar()) {
			throw new IllegalArgumentException("geboortejaar moet kleine of gelijk aan huidig jaar");		
		}
		if(this.geefHuidigJaar() - geboortejaar > 27) {
			throw new IllegalArgumentException("kan max 27 jaar");		
		}
	}
	
	@Override
	public int berekenLeeftijdVolgensMens() {
		int leeftijd = super.berekenLeeftijd();
		return leeftijd * 7;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}
