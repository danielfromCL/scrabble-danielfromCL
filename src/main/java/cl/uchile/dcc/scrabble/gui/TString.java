package cl.uchile.dcc.scrabble.gui;

public class TString extends Types{
    private String string;
    public TString(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    @Override
    public String toString() {
        return this.getString();
    }



}
