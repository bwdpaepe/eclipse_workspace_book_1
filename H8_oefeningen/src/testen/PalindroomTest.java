package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import domein.Palindroom;

class PalindroomTest {

	@Test
	void isPalindroom_tekstMeerDan1Karakter_returnPalindroom() {
		// Arrange
		String tekst = "lepel";
		
		// Act
		boolean resultaat = Palindroom.isPalindroom(tekst);
		
		// Assert
		Assertions.assertTrue(resultaat);
	}
	
	@Test
	void isPalindroom_grens1Karakter_exception() {
		// Arrange
		String tekst = "l";
						
		// Act &  Assert
		Assertions.assertThrows(IllegalArgumentException.class, () -> Palindroom.isPalindroom(tekst));
	}
	
	@Test
	void isPalindroom_blancoTekst_exception() {
		// Arrange
		String tekst = "";
		
		// Act & Assert
		Assertions.assertThrows(IllegalArgumentException.class, () -> Palindroom.isPalindroom(tekst));
	}
	
	@ParameterizedTest
	@ValueSource(strings = {
			"lepel",
			"raar",
			"*12 ab ?!? BA 21*"
	})
	public void isPalindroom_geldigePalindroom_returnTrue(String tekst) {
		Assertions.assertTrue(Palindroom.isPalindroom(tekst));
	}

}
