package domein;

import java.util.Arrays;

public class ArrayBewerking {
	
	public static double[] deel(int[] rij1, int[] rij2) {
		double[] quotient = new double[rij1.length];
		for(int i = 0; i < rij1.length; i++) {
			quotient[i] = (double) rij1[i] / (double) rij2[i];
		}
		return quotient;
		
	}
	
	public static void schuifOp(double[] rij, int aantalPlaatsen) {
		double[] temp = new double[rij.length];
		for(int i = 0; i < rij.length;i ++) {
			if(i+aantalPlaatsen < rij.length) {
			    temp[i+aantalPlaatsen] = rij[i];
			}
			else {
				temp[i+aantalPlaatsen-rij.length] = rij[i];
			}
		}
		rij = Arrays.copyOf(temp, temp.length);
	}
	
	public static String toon(double[] rij) {
		String output="";
		for(double element: rij) {
			output += String.format("%.3f,", element);
		}
		return output;
	}
	
	public static String toon(int[] rij) {
		String output="";
		for(int element: rij) {
			output += String.format("%10d,", element);
		}
		return output;
	}

}
