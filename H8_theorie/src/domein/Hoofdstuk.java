package domein;

public class Hoofdstuk {
	
	private String titel;
	
	public void setTitel(String titel) {
		if(titel == null || titel.trim().isEmpty()) {
			throw new IllegalArgumentException("titel mag niet leeg zijn");
		}
		if(titel.length() < 2) {
			throw new IllegalArgumentException("woord is te klein");
		}
		this.titel = titel;
	}

}
