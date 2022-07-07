package domein;

public class Wapen extends Voorwerp {
	
	private int kracht;
	private boolean gebruikt;
	
	public Wapen(String naam, double gewicht, int niveau, int kracht, boolean gebruikt) {
		super(naam, gewicht, niveau);
		this.controleerNiveau(niveau);
		// TODO Auto-generated constructor stub
		this.setGebruikt(gebruikt);
		this.setKracht(kracht);
	}

	private int getKracht() {
		return kracht;
	}

	private void setKracht(int kracht) {
		if(kracht < 0) {
			throw new IllegalArgumentException("positief getal");
		}
		this.kracht = kracht;
	}

	private boolean isGebruikt() {
		return gebruikt;
	}

	private void setGebruikt(boolean gebruikt) {
		this.gebruikt = gebruikt;
	}
	
	private void controleerNiveau(int niveau) {
		if(niveau < 1 || niveau > 5) {
			throw new IllegalArgumentException("niveau wapen : 1 -> 5");
		}
	}
	
	@Override
	public String toString() {
		String output;
		output = String.format("Wapen %s en met kracht %d %s%n", super.toString(), this.getKracht(), this.isGebruikt()?"nog niet gebruikt":"al gebruikt");
		return output;
	}
	
	

}
