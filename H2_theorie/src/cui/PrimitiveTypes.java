package cui;

public class PrimitiveTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float float_getal;
		double double_getal;
		float_getal = 10;
		double_getal = float_getal;
		float_getal *= 12.123456789;
		double_getal *= 12.123456789;
		System.out.printf("%s%.14f%n", "float", float_getal);
		System.out.printf("%s%.14f%n", "double", double_getal);
		
		float float_getal_2;
		double double_getal_2;
		double_getal_2 = 10;
		float_getal_2 = (float) double_getal_2;
		float_getal_2 *= 12.123456789;
		double_getal_2 *= 12.123456789;
		System.out.printf("%s%.14f%n", "float 2", float_getal_2);
		System.out.printf("%s%.14f%n", "double 2", double_getal_2);
		
		long getal6, getal7;
		getal6 = 2147483647;
		getal7 = getal6 * 10;
		System.out.printf("%d%n", getal7);

		long getal61, getal71;
		getal61 = 2147483647L;
		getal71 = getal61 * 10;
		System.out.printf("%d%n", getal71);
		
		long getal62, getal72;
		getal62 = Long.MAX_VALUE;
		getal72 = Long.MIN_VALUE;
		System.out.printf("%d%n", getal72);
		
		short getal4, getal5;
		getal4 = -32768;
		getal5 = 32767;
		System.out.printf("%d%n", --getal4);
		System.out.printf("%d%n", ++getal5);

		short getal41, getal51;
		getal41 = Short.MAX_VALUE;
		getal51 = Short.MIN_VALUE;
		System.out.printf("%d%n", getal41);
		System.out.printf("%d%n", getal51);
		
		byte getal1, getal2, getal3;
		getal1 = 50;
		getal2 = -128;
		getal3 = 127;
		System.out.printf("%d%n", --getal2);
		System.out.printf("%d%n", ++getal3);
		
		char letter1, letter2;
		letter1 = 'a';
		letter2 = '*';
		System.out.printf("%c%n", letter1);
		System.out.printf("%c%n", letter2);
		
		


	}

}
