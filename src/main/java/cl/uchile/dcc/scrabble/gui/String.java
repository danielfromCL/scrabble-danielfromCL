package cl.uchile.dcc.scrabble.gui;

public class String extends Tipos{
    public java.lang.String string;
    public String(java.lang.String string) {
        this.string = string;
    }



    public java.lang.String getString() {
        return string;
    }
    @Override
    public java.lang.String toString() {
        return "String es: "+ this.getString();
    }
}
