package testen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import domein.Rechthoek;

class RechthoekTest {
	
	private double lengte;
	private double breedte;

	@Test
	public void maakRechthoek_lengteOK_breedteOK_maaktRechthoek() {
		// Arrange
		lengte = 7.0;
		breedte = 3.6;
		
		// Act
		Rechthoek rechthoek = new Rechthoek(lengte, breedte);
		
		//Assert
		Assertions.assertEquals(lengte, rechthoek.getLengte());
		Assertions.assertEquals(breedte, rechthoek.getBreedte());
	}
	
	@Test
	public void maakRechthoek_lengteOK_breedteNOK_exception() {
		// Arrange
		lengte = 7.0;
		breedte = -3.6;
		
		// Act & Assert
		Assertions.assertThrows(IllegalArgumentException.class, () -> new Rechthoek(lengte, breedte));
	}

	@Test
	public void geefOmtrek_returnOmtrek() {
		// Arrange
		lengte = 6.0;
		breedte = 4.0;
		Rechthoek rechthoek = new Rechthoek(lengte, breedte);
		
		// Act
		double omtrek = rechthoek.geefOmtrek();
		
		// Assert
		Assertions.assertEquals((lengte + breedte) * 2.0, omtrek);
	}

	@Test
	public void geefOppervlakte() {
		fail("Not yet implemented");
	}

	@Test
	public void schaal() {
		fail("Not yet implemented");
	}

	

}
