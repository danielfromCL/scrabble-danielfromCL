package cl.uchile.dcc.scrabble.gui;

import java.util.Objects;

public class Float extends Numbers{
    private double Float;
    public Float(double Float) {
        this.Float=Float;
    }

    @Override
    public int hashCode(){
        return Objects.hash(Float.class);
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Float){
            var o = (Float) obj;
            return Math.abs(o.Float - this.Float) < 0.000001;
        }
        return false;
    }


    public double getFloat() {
        return Float;
    }


    @Override
    public String toString() {
        return String.valueOf(this.getFloat());
    }

    @Override
    public Float transformtoFloat(){
        return this;
    }

    /*@Override
    public TString transformtoString(){
        return
    }
     */


}
