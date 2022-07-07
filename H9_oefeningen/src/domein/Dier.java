package domein;

import java.time.Year;

public class Dier {
	private final int geboortejaar;
	
	public Dier(int geboortejaar) {
		this.geboortejaar = geboortejaar;
	}

	public int getGeboortejaar() {
		return geboortejaar;
	}

	private void controleerGeboortejaar(int geboortejaar) {
		if(geboortejaar > this.geefHuidigJaar()) {
			throw new IllegalArgumentException("geboortejaar moet kleine of gelijk aan huidig jaar");		
		}
		
	}
	
	protected int geefHuidigJaar() {
		return Year.now().getValue();
	}
	
	public int berekenLeeftijd() {
		return(this.geefHuidigJaar() - this.getGeboortejaar());
		
	}
	
	public int berekenLeeftijdVolgensMens() {
		return 0;
	}
	
	@Override
	public String toString() {
		String output = String.format("%s: leeftijd is %d en volgens de mens %d%n", this.getClass().getSimpleName().toUpperCase(), this.berekenLeeftijd(), this.berekenLeeftijdVolgensMens());
		return output;
	}
	
	

}
