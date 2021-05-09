package cl.uchile.dcc.scrabble.gui;

public class Int extends numero {
    public int Int;
    public Int(int Int) {
        this.Int = Int;
    }

    public int getInt() {
        return Int;
    }

    @Override
    public java.lang.String toString() {
        return "Int es: " + this.getInt();
    }

}
