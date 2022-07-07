package domein;

public class SpaarRekening extends Rekening {
	
	private static double aangroeiIntrest;

	public SpaarRekening(long rekeningNr, String houder) {
		super(rekeningNr, houder);
		// TODO Auto-generated constructor stub
		SpaarRekening.setAangroeiIntrest(1.50);
	}

	public static double getAangroeiIntrest() {
		return aangroeiIntrest;
	}

	public static void setAangroeiIntrest(double aangroeiIntrest) {
		if(aangroeiIntrest < 0.0) {
			throw new IllegalArgumentException("positieve waarde!!!");
		}
		SpaarRekening.aangroeiIntrest = aangroeiIntrest;
	}
	
	@Override
	public boolean haalAf(double bedrag) {
		//return super.haalAf(bedrag);
		
		boolean succes = false;
		if(super.getSaldo() - bedrag >=0) {
			return super.haalAf(bedrag);
		}
        

        return succes;
	}
	
	
	@Override
	public String toString() {
		String output = String.format("%s. Aangroeiintrest = %s%", super.toString(), SpaarRekening.getAangroeiIntrest());
		return output;
	}
	
	

}
