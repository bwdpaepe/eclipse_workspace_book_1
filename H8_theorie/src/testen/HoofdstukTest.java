package testen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import domein.Hoofdstuk;

class HoofdstukTest {
	
	private Hoofdstuk hoofdstuk;
	
	@BeforeEach
	public void before() {
		hoofdstuk = new Hoofdstuk();
	}

	@ParameterizedTest
	@NullAndEmptySource
	@ValueSource(strings = {"    ","a","A"})
	void setTitel_ongeldigeWaarden_gooitException(String titel) {
		Assertions.assertThrows(IllegalArgumentException.class, () -> { hoofdstuk.setTitel(titel);});
	}

}
