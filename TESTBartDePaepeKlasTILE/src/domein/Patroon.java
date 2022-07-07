package domein;

public class Patroon {
    private char type; // A, B, C of D
    private char opvulteken; // +,-,*,?,!

    public Patroon(char type) {
        setType(type);
        setOpvulteken('*');
    }

    public Patroon(char type, char opvulteken) {
        setType(type);
        setOpvulteken(opvulteken);
    }

    public char getOpvulteken() {
        return opvulteken;
    }

    public char getType() {
        return type;
    }

    private void setOpvulteken(char opvulteken) {
        if (opvulteken != '*' && opvulteken != '+' && opvulteken != '-' && opvulteken != '!' && opvulteken != '?')
            this.opvulteken = '*';
        else
            this.opvulteken = opvulteken;
    }

    private void setType(char type) {
        if (type < 'A' || type > 'D')
            this.type = 'A';
        else
            this.type = type;
    }

}
