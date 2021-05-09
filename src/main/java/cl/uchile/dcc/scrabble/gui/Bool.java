package cl.uchile.dcc.scrabble.gui;

public class Bool extends Tipos{
    public boolean Bool;
    public Bool(boolean Bool) {
        this.Bool = Bool;
    }

    public boolean isBool() {
        return Bool;
    }

    @Override
    public String toString() {
        return "Bool{"+ this.isBool()+"}";
    }
}
