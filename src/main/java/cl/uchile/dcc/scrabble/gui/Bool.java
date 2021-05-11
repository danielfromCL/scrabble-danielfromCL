package cl.uchile.dcc.scrabble.gui;

import java.util.Objects;

public class Bool extends Types{
    private boolean Bool;
    public Bool(boolean Bool) {
        this.Bool = Bool;
    }

    @Override
    public int hashCode(){
        return Objects.hash(Bool.class);
    }
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Bool){
            var o = (Bool) obj;
            return o.Bool == this.Bool;
        }
        return false;
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
