package domein;

public class Driehoek {
	
	private int a;
	private int b;
	private int c;
	
	public Driehoek(int a, int b, int c) {
		this.setA(a);
		this.setB(b);
		this.setC(c);
	}

	public int getA() {
		return a;
	}

	private void setA(int a) {
		if(a>0) {
			this.a = a;
		}
		else {
			this.a = 1;
		}
	}

	public int getB() {
		return b;
	}

	private void setB(int b) {
		if(b>0) {
			this.b = b;	
		}
		else {
			this.b = 1;
		}
		
	}

	public int getC() {
		return c;
	}

	private void setC(int c) {
		if(c>0) {
			this.c = c;
		}
		else {
			this.c = 1;
		}
	}
	
	public boolean isRechthoekigeDriehoek() {
		int zijdeA = this.getA();
		int zijdeB = this.getB();
		int zijdeC = this.getC();
		
		if(Math.pow(zijdeA, 2) + Math.pow(zijdeB, 2) == Math.pow(zijdeC, 2)) {
			return true;
		}
		else if(Math.pow(zijdeB, 2) + Math.pow(zijdeC, 2) == Math.pow(zijdeA, 2)) {
			return true;
		}
		else if(Math.pow(zijdeC, 2) + Math.pow(zijdeA, 2) == Math.pow(zijdeB, 2)) {
			return true;
		}
		return false;
	}
	
	

}
