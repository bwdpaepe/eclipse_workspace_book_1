package domein;

import java.util.ArrayList;
import java.util.List;

public class PerfectGetal {
	
	public boolean isPerfect(int getal) {
		if(getal<0) {
			throw new IllegalArgumentException("Getal mag niet negatief zijn");
		}
		if(getal==0 || getal==1) {
			return false;
		}
		return getal == somVanDelers(getal);
	}
	
	private int somVanDelers(int x) {
		List<Integer> delers = new ArrayList<>();
		
		for(int i = 1; i <= x/2; i++) {
			if(x % i == 0) {
				delers.add(i);
			}
		}
		int som = 0;
		for(int deler: delers) {
			som += deler;
		}
		
		return som;
	}

}
