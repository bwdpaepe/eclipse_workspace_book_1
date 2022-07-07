package domein;

public class Vorm {
	private String kleur;
	public Vorm(String kleur) {
		throw new UnsupportedOperationException();
	}
	
	public String getKleur() {
		return kleur;
	}

	private void setKleur(String kleur) {
		this.kleur = kleur;
	}

	@Override
	public String toString() {
		throw new UnsupportedOperationException();
	}
	public void voegPuntToe(Punt punt) {
		throw new UnsupportedOperationException();
	}

}
