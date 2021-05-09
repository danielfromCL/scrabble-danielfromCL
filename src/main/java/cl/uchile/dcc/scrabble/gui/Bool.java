package cl.uchile.dcc.scrabble.gui;

public class Bool extends Tipos{
    public boolean booleano;
    public Bool(boolean booleano) {
        this.booleano = booleano;
    }

    public boolean isBooleano() {
        return booleano;
    }

    @Override
    public java.lang.String toString() {
        return "Booleano es: "+ this.isBooleano();
    }
}
