package domein;

public class Palindroom {
	
	public static boolean isPalindroom(String tekst) {
		
			if(tekst == null || tekst.trim().isEmpty()) {
				throw new IllegalArgumentException("tekst mag niet leeg zijn");
			}
			
			if(tekst.length() == 1) {
				throw new IllegalArgumentException("tekst mmoet meer dan 1 karakter bevatten");
			}
			
			String omgekeerd = new StringBuilder(tekst).reverse().toString();

			return (tekst.equalsIgnoreCase(omgekeerd));
	}

}
