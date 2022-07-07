package domein;

import java.util.Arrays;

public class Patroon {
	
	private char type;
	private char opvulteken;
	
	public Patroon(char type) {
		this(type,'*');
	}
	
	public Patroon(char type, char opvulteken) {
		this.setType(type);
		this.setOpvulteken(opvulteken);
	}

	public char getType() {
		return type;
	}

	private void setType(char type) {
		char[] validCharArray = {'A','B','C','D'};
		if(Arrays.asList(validCharArray).contains(type)) {
			this.type = type;
		}
		else {
			this.type = 'A';
		}
	}

	public char getOpvulteken() {
		return opvulteken;
	}

	private void setOpvulteken(char opvulteken) {
		char[] validOpvultekenArray = {'*','+','-','!','?'};
		if(Arrays.asList(validOpvultekenArray).contains(opvulteken)) {
			this.opvulteken = opvulteken;
		}
		else {
			this.opvulteken = '*';
		}
	}
	
	public String teken() {
		String output;
		switch(this.getType()) {
		case 'A': output = this.tekenPatroonA();
				  break;
		case 'B': output = this.tekenPatroonB();
		  		  break;
		case 'C': output = this.tekenPatroonC();
		  		  break;
		case 'D': output = this.tekenPatroonD();
		          break;
		default: output = "";          
		}
		return output;
		
	}
	
	private String tekenPatroonA() {
		String output = "";
		for(int i = 1; i <= 10; i++) {
			for(int j = i; j <= i; j++) {
				output += this.getOpvulteken();
			}
			output += "\n";
		}
		return output;
	}
	
	
	
	

}
