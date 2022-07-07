package cui;

import domein.Gebakje;

public class GebakjeApplicatie1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] namen = {"aardbei","eclair","miserable","hoorntje"};
		double[] eenheidsprijzen= {2.75,1.5,2,1.75};
		
		Gebakje[] gebakjeArray = new Gebakje[4];
		
		for(int i = 0; i < gebakjeArray.length; i++) {
			gebakjeArray[i] = new Gebakje(namen[i],eenheidsprijzen[i]);
		}
		
		int [][] bestelling = new int [3][4];
		
		
		
		
		
	}

}
