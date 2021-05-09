package cl.uchile.dcc.scrabble.gui;

public class Int extends Numbers {
    public int Int;
    public Int(int Int) {
        this.Int = Int;
    }

    public int getInt() {
        return Int;
    }

    @Override
    public String toString() {
        return "Int{" + this.getInt()+"}";
    }

}
