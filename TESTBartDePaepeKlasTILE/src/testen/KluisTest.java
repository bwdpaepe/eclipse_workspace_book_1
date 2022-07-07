package testen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import domein.Kluis;

class KluisTest {
	
	@Test
	public void maakKluis_juist4Karakter_kluisGemaakt() {
		// Arrange
		String code = "1234";

		// Act
		Kluis k = new Kluis(code);

		// Assert
		Assertions.assertEquals(code, k.getCode());
	}
	
	@Test
	public void maakKluis_teWeinig1Karakter_kluisNietGemaakt() {
		// assign
		String code = "2";
		
		// act & assert
		Assertions.assertThrows(IllegalArgumentException.class, () -> new Kluis(code));
	}
	
	@Test
	public void maakKluis_teVeel6Karakters_kluisNietGemaakt() {
		// assign
		String code = "234567";
				
		// act & assert
		Assertions.assertThrows(IllegalArgumentException.class, () -> new Kluis(code));
	}
	
	@Test
	public void maakKluis_spaties_kluisNietGemaakt() {
		// assign
		String code = "2  3";
				
		// act & assert
		Assertions.assertThrows(IllegalArgumentException.class, () -> new Kluis(code));
	}
	
	@ParameterizedTest
	@NullAndEmptySource
	@ValueSource(strings = {"2","234567"})
	public void maakKluis_ongeldigeWaarden_kluisNietGemaakt(String code) {
		
		
		// act & assert
		Assertions.assertThrows(IllegalArgumentException.class, () -> new Kluis(code)
				, "een code moet bestaan uit 4 karakters");
	}
	
	@Test
	public void valideerCode_juisteCode_retunrTrue() {
		// assign
		String code = "1234";
		
		// act
		Kluis k = new Kluis(code);
		boolean valideer = k.valideerCode("1234");
		
		//assert
		Assertions.assertTrue(valideer);
		
	}

	@Test
	public void valideerCode_fouteCode_retunrFalse() {
		// assign
				String code = "1234";
				
				// act
				Kluis k = new Kluis(code);
				boolean valideer = k.valideerCode("2345");
				
				//assert
				Assertions.assertFalse(valideer);
	}

	
}
