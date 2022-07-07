package testen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import domein.PerfectGetal;

class PerfectGetalTest {
	
	PerfectGetal pg;
	
	@BeforeEach
	public void setup() {
		pg = new PerfectGetal();
	}

	@Test
	public void isPerfect_OK_returnTrue() {
		// Assign
		int getal = 6;
		
		// Act
		boolean resultaat = pg.isPerfect(getal);
		
		// Assert
		Assertions.assertTrue(resultaat);
	}
	
	@Test
	public void isPerfect_NOK_returnFalse() {
		// Assign
		int getal = 7;
		
		// Act
		boolean resultaat = pg.isPerfect(getal);
		
		// Assert
		Assertions.assertFalse(resultaat);
	}
	
	@ParameterizedTest
	@ValueSource(ints = {0,1})
	public void isPerfect_nietPerfect_returnFalse(int x) {
		// Act
		boolean resultaat = pg.isPerfect(x);
				
		// Assert
		Assertions.assertFalse(resultaat);
	}
	
	@Test
	public void isPerfect_negatiefGetal_exception() {
		
		// Assign
		int getal = -6;
		
		// Act & Assert
		Assertions.assertThrows(IllegalArgumentException.class, () -> pg.isPerfect(getal));
	}

}
