package domein;

public class Kluis {
    private final String code;

    public Kluis(String code) {
        controleerCode(code);
        this.code = code;
    }

    private void controleerCode(String code) {
        if (code == null || code.length() != 4)
            throw new IllegalArgumentException("Code moet bestaan uit 4 karakters.");
        if (code.contains(" "))
            throw new IllegalArgumentException("Code mag geen spaties bevatten.");
    }

    public boolean valideerCode(String code) {
        return this.code.equals(code);
    }

    public String getCode() {
        return this.code;
    }
    
    
}
