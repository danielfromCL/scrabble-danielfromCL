package cl.uchile.dcc.scrabble.gui;

import java.util.Objects;

public class TString extends Types{
    private String string;
    public TString(String string) {
        this.string = string;
    }

    @Override
    public int hashCode(){
        return Objects.hash(TString.class);
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof TString){
            var o = (TString) obj;
            return o.string.equals(this.string);
        }
        return false;
    }


    public String getString() {
        return string;
    }

    @Override
    public String toString() {
        return this.getString();
    }



}
