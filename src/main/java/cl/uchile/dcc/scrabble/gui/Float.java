package cl.uchile.dcc.scrabble.gui;

import java.util.Objects;

/**
 * Class that represents the Float type for Scrabble.
 */
public class Float extends Numbers{
    private double Float;

    /**
     * Creates a Float object.
     * Constructor that creates an object of the Float type, which receives a java double as parameter.
     */
    public Float(double Float) {
        this.Float=Float;
    }

    /**
     * Returns the hash of the Float class.
     */
    @Override
    public int hashCode(){
        return Objects.hash(Float.class);
    }

    /**
     * Returns whether an object is equal to the Float object that it's being compared to.
     */
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Float){
            var o = (Float) obj;
            return Math.abs(o.Float - this.Float) < 0.000001;
        }
        return false;
    }

    /**
     * Returns the Float parameter.
     * Getter that returns the java type double parameter of the Float object.
     */
    public double getFloat() {
        return Float;
    }


    /**
     * Returns the Float object representation as a java type String.
     */
    @Override
    public String toString() {
        return String.valueOf(this.getFloat());
    }

    /**
     * Returns a copy of the Float object.
     */
    @Override
    public Float transformtoFloat(){
        return this;
    }



}
