package cui;

import java.math.BigInteger;

public class Fibonacci {
	
	public static BigInteger fibonacci(BigInteger number) {
		if(number.equals(BigInteger.ZERO) || number.equals(BigInteger.ONE)) {
			return number;
		}
		else {
			return(fibonacci(number.subtract(BigInteger.ONE)).add(fibonacci(number.subtract(BigInteger.TWO))));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int counter = 0; counter <= 40; counter++) {
			System.out.printf("Fibonacci of %d is: %d%n", counter, fibonacci(BigInteger.valueOf(counter)));
		}
	}

}
