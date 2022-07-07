package testen;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import domein.ArrayBewerking;

public class ArrayBewerkingTest {

	private ArrayBewerking arrayBew;
	int[] rij1 = {2,4,6,8,10};
	int[] rij2 = {2,2,2,2,2};
	int[] rij3 = {1,2,3,16,40};

	@Before
	public void before()
	{
	}

	@Test
	public void delen()
	{
		double[] rij3 = ArrayBewerking.deel(rij1, rij2);
		Assert.assertEquals(1.0, rij3[0],0.01);
		Assert.assertEquals(2.0, rij3[1],0.01);
		Assert.assertEquals(3.0, rij3[2],0.01);
		Assert.assertEquals(4.0, rij3[3],0.01);
		Assert.assertEquals(5.0, rij3[4],0.01);
	}

	@Test
	public void delen2()
	{
		double[] rij4 = ArrayBewerking.deel(rij1, rij3);
		Assert.assertEquals(2.0, rij4[0],0.01);
		Assert.assertEquals(2.0, rij4[1],0.01);
		Assert.assertEquals(2.0, rij4[2],0.01);
		Assert.assertEquals(0.5, rij4[3],0.01);
		Assert.assertEquals(0.25, rij4[4],0.01);
	}

	@Test
	public void schuifOpPositie1(){
		double[] rij = {1.0,2.0,3.0,4.0,5.0};
		int aantalPlaatsen = 1;
		ArrayBewerking.schuifOp(rij, aantalPlaatsen);
		Assert.assertEquals(5.0, rij[0],0.01);
		Assert.assertEquals(1.0, rij[1],0.01);
		Assert.assertEquals(2.0, rij[2],0.01);
		Assert.assertEquals(3.0, rij[3],0.01);
		Assert.assertEquals(4.0, rij[4],0.01);
	}

	@Test
	public void schuifOpPositie4(){
		double[] rij = {1.0,2.0,3.0,4.0,5.0};
		int aantalPlaatsen = 4;
		ArrayBewerking.schuifOp(rij, aantalPlaatsen);
		Assert.assertEquals(2.0, rij[0],0.01);
		Assert.assertEquals(3.0, rij[1],0.01);
		Assert.assertEquals(4.0, rij[2],0.01);
		Assert.assertEquals(5.0, rij[3],0.01);
		Assert.assertEquals(1.0, rij[4],0.01);
	}

	@Test
	public void toonIntegers(){
		int rij[] = {2,7,1,9,4};
		String resultaat = ArrayBewerking.toon(rij);
		Assert.assertEquals("         2         7         1         9         4", resultaat);
	}

	@Test
	public void toonDoubles(){
		double rij[] = {1.0,2.0,3.0,4.0,5.0};
		String resultaat = ArrayBewerking.toon(rij);
		Assert.assertEquals("      1,00      2,00      3,00      4,00      5,00", resultaat);
	}

}
