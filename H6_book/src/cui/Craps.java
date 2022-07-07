package cui;

import java.security.SecureRandom;

public class Craps {
	
	private static final SecureRandom randomNumbers = new SecureRandom();
	
	private enum Status {CONTINUE, WON, LOST};
	
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myPoint = 0;
		Status gameStatus;
		
		int sumOfDice = rollDice();
		
		switch(sumOfDice) {
		case SEVEN:
		case YO_LEVEN:
			gameStatus = Status.WON;
		}
		
		

	}
	
	public static int rollDice() {
		int die1 = 1 + randomNumbers.nextInt(6);
		int die2 = 1 + randomNumbers.nextInt(6);
		int sum = die1 + die2;
		return sum;
	}

}
