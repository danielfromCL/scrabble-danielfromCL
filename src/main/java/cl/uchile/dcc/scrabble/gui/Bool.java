package cl.uchile.dcc.scrabble.gui;

public class Bool extends Types{
    private boolean Bool;
    public Bool(boolean Bool) {
        this.Bool = Bool;
    }

    public boolean isBool() {
        return Bool;
    }

    @Override
    public String toString() {
        return String.valueOf(this.isBool());
    }

    @Override
    public Bool transformtoBool(){
        return this;
    }

}
