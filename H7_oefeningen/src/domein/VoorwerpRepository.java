package domein;

import java.util.ArrayList;
import java.util.List;

public class VoorwerpRepository {
	
	public List<Voorwerp> collectie;
	
	public VoorwerpRepository() {
		this.collectie = new ArrayList<>();
	}
	
	public void voegVoorwerpToe(Voorwerp voorwerp) {
		this.collectie.add(voorwerp);
	}
	
	public String geefOverzicht() {
		String output = "";
		if(this.collectie.size() == 0) {
			output = "collectie is leeg";
		}
		else {
			for(Voorwerp vw: collectie) {
				output += vw.toString();
			}
		}
		
		return output;
	}

}
