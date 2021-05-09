package cl.uchile.dcc.scrabble.gui;

public class Float extends numero{
    public double Float;
    public Float(double Float) {
        this.Float=Float;
    }

    public double getFloat() {
        return Float;
    }

    @Override
    public String toString() {
        return "Float{"+this.getFloat()+"}";
    }

}
