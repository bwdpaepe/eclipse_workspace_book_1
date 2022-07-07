package domein;

public class Stappenteller {
	
	private String activiteit;	// tekst
	private int hoeveelheid;	// aantal stappen
	private int soort;	// 1 vlak // 2 bergop // 3 bergaf
	
	public Stappenteller(String activiteit, int hoeveelheid, int soort) {
		this.setActiviteit(activiteit);
		this.setHoeveelheid(hoeveelheid);
		this.setSoort(soort);
	}

	public String getActiviteit() {
		return activiteit;
	}

	public void setActiviteit(String activiteit) {
		this.activiteit = activiteit;
	}

	public int getHoeveelheid() {
		return hoeveelheid;
	}

	private void setHoeveelheid(int hoeveelheid) {
		if(hoeveelheid > 0) {
			this.hoeveelheid = hoeveelheid;
		}
		else {
			throw new IllegalArgumentException("De hoeveelheid stappen moet minimaal 1 en mag maximaal 1000 zijn");
		}
		
	}

	public int getSoort() {
		return soort;
	}

	private void setSoort(int soort) {
		if(soort == 1 || soort == 2 || soort == 3) {
			this.soort = soort;
		}
		else {
			throw new IllegalArgumentException("De soort moet 1, 2 of 3 zijn");
		}
	}
	
	public int geefAantalStappen() {
		int aantalStappen;
		switch(this.getSoort()) {
		case 1: aantalStappen = this.getHoeveelheid();
		        break;
		case 2: aantalStappen = this.getHoeveelheid() * 2;
		        break;
		case 3: aantalStappen = this.getHoeveelheid() / 2;
		        break;
		default: aantalStappen = 0;
		}
		return aantalStappen;
	}
	
	@Override
	public String toString() {
		String output;
		output = String.format("%40s%10d%n", this.getActiviteit(), this.geefAantalStappen());
		return output;
	}
	
	

}
