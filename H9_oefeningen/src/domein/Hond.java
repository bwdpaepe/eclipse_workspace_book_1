package domein;

public class Hond extends Dier {
	
	private final String naam;

	public Hond(int geboortejaar) {
		this(geboortejaar, "onbekend");
		// TODO Auto-generated constructor stub
	}
	
	public Hond(int geboortejaar, String naam) {
		super(geboortejaar);
		this.controleerGeboortejaar(geboortejaar);
		this.controleerNaam(naam);
		this.naam = naam;
		// TODO Auto-generated constructor stub
	}
	
	private void controleerNaam(String naam) {
		if(naam==null || naam.trim().isEmpty()) {
			throw new IllegalArgumentException("naam moet ingevuld");		
		}
	}
	
	private void controleerGeboortejaar(int geboortejaar) {
		//super.controleerGeboortejaar(geboortejaar);
		if(geboortejaar > this.geefHuidigJaar()) {
			throw new IllegalArgumentException("geboortejaar moet kleine of gelijk aan huidig jaar");		
		}
		if(this.geefHuidigJaar() - geboortejaar > 29) {
			throw new IllegalArgumentException("kan max 29 jaar");		
		}
		
	}
	
	@Override
	public int berekenLeeftijdVolgensMens() {
		int leeftijd = super.berekenLeeftijd();
		int mleeftijd = 0;
		for(int i = 1; i <= leeftijd; i++ ) {
			if(i==1) {
				mleeftijd += 10;
			}
			else if(i==2) {
				mleeftijd += 9;
			}
			else if(i==3) {
				mleeftijd += 8;
				
			}
			else if(i==4) {
				mleeftijd += 7;
			}
			else if(i==5) {
				mleeftijd += 6;
			}
			else {
				mleeftijd += 5;
			}
		}
		return mleeftijd;
	}
	
	@Override
	public String toString() {
		String output;
		output = String.format("%s,  naam is %s%n", super.toString(), this.naam);
		return output;
		
	}

}
