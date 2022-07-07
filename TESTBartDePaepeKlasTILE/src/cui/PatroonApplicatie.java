package cui;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

import domein.Patroon;

public class PatroonApplicatie {
	
	private static SecureRandom sr = new SecureRandom();
	private static final char[] willekeurigTekenArray = {'*','-','?','+','!'};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Patroon> patronen = new ArrayList<>();
		PatroonApplicatie.maakPatronenAan(patronen);
		System.out.printf("Aantal patronen met teken '?': %d%n", PatroonApplicatie.telPatronenMetTeken(patronen, '?'));
		PatroonApplicatie.drukOverzichtAf(patronen);
		

	}
	
	private static void drukOverzichtAf(List<Patroon> patronen) {
		System.out.printf("%10s%10s%n","Patroon","Teken");
		for(Patroon enkelPatroon: patronen) {
			System.out.printf("%10c%10c%n", enkelPatroon.getType(), enkelPatroon.getOpvulteken());
		}
	}
	
	private static int telPatronenMetTeken(List<Patroon> patronen, char teken) {
		int counter = 0;
		for(Patroon enkelPatroon: patronen) {
			if(enkelPatroon.getOpvulteken() == teken) {
				counter++;
			}
		}
		return counter;
	}
	
	private static void maakPatronenAan(List<Patroon> patronen) {
		char[] patronenArray = {'A','B','D','A','C','A','B','D','A','A','C','D','B','B','D','A'};
		for(char patroon: patronenArray) {
			patronen.add(new Patroon(patroon,PatroonApplicatie.kiesWillekeurigTeken()));
		}
		
	}
	
	private static char kiesWillekeurigTeken() {
		
		int willekeurInt = PatroonApplicatie.sr.nextInt(5);
		char willekeurChar = PatroonApplicatie.willekeurigTekenArray[willekeurInt];
		return willekeurChar;
		
		
	}
}
