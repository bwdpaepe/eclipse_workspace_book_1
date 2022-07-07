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
		boolean output = false;
		if(Math.pow(this.getA(), 2) + Math.pow(this.getB(), 2) == Math.pow(this.getC(), 2) || Math.pow(this.getA(), 2) + Math.pow(this.getC(), 2) == Math.pow(this.getB(), 2) || Math.pow(this.getC(), 2) + Math.pow(this.getB(), 2) == Math.pow(this.getA(), 2)) {
			output = true;
		}
		return output;
	}
	
	

}
