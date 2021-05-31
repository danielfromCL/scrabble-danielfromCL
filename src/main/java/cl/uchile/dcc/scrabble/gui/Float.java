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
        return new Float(this.getFloat());
    }

    /**
     * Returns a new Float object with the sum between the Float object and another Float object.
     */
    @Override
    public INumbers sum(Int i){
        return new Float(this.getFloat()+ i.getInt());
    }

    /**
     * Returns a new Float object with the sum between the Float object and an Int object.
     */
    @Override
    public INumbers sum(Float f){
        return new Float(this.getFloat()+f.getFloat());
    }

    /**
     * Returns a new Binary object with the sum between the Float object and a Binary object.
     */
    @Override
    public INumbers sum(Binary bi){
        return new Binary("asdjkalsdjasd");
    }

    /**
     * Returns a new Float object with the subtraction between the Float object and an Int object.
     */
    @Override
    public INumbers sub(Int n){
        return new Float(this.getFloat()- n.getInt());
    }

    /**
     * Returns a new Float object with the subtraction between the Float object and a Float object.
     */
    @Override
    public INumbers sub(Float n){
        return new Float(this.getFloat()-n.getFloat());
    }

    /**
     * Returns a new Binary object with the subtraction between the Float object and a Binary object.
     */
    @Override
    public INumbers sub(Binary n){
        return null;
    }

    /**
     * Returns a new Float object with the division between the Float object and an Int object.
     */
    @Override
    public INumbers div(Int n){
        return new Float(this.getFloat()/n.getInt());
    }

    /**
     * Returns a new Float object with the division between the Float object and a Float object.
     */
    @Override
    public INumbers div(Float n){
        return new Float(this.getFloat()/n.getFloat());
    }

    /**
     * Returns a new Binary object with the division between the Float object and a Binary object.
     */
    @Override
    public INumbers div(Binary n){
        return null;
    }

    /**
     * Returns a new Float object with the multiplication between the Float object and an Int object.
     */
    @Override
    public INumbers mult(Int n){
        return new Float(this.getFloat()*n.getInt());
    }

    /**
     * Returns a new Float object with the multiplication between the Float object and another Float object.
     */
    @Override
    public INumbers mult(Float n){
        return new Float(this.getFloat()*n.getFloat());
    }

    /**
     * Returns a new Binary object with the multiplication between the Float object and a Binary object.
     */
    @Override
    public INumbers mult(Binary n){
        return null;
    }

    /**
     * The negation of a Float is itself multiplied by -1.
     */
    @Override
    public ITypes neg(){
        return new Float(this.getFloat()*(-1));
    }
}
