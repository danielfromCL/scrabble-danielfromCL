package cl.uchile.dcc.scrabble.gui;

public class Float extends Numbers{
    private double Float;
    public Float(double Float) {
        this.Float=Float;
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
