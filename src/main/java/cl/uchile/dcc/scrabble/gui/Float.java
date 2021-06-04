package cl.uchile.dcc.scrabble.gui;

import java.util.Objects;

/**
 * Class that represents the Float type for Scrabble.
 */
public class Float extends Numbers implements FloatInt {
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
     * The negation of a Float is itself multiplied by -1.
     */
    @Override
    public FloatInt neg(){
        return new Float(this.getFloat()*(-1));
    }
    /**
     * Returns a new Float object with the sum between the Float object and an INumbers object.
     */
    @Override
    public INumbers sum(INumbers n){
        return n.addingAFloat(this);
    }
    @Override
    public Float addingAFloat(Float f){
        return new Float(f.getFloat()+this.getFloat());
    }
    @Override
    public INumbers addingAnInt(Int i){
        return new Float(i.getInt()+this.getFloat());
    }
    /**
     * Returns a new Float object with the subtraction between this Float object's parameter and an INumbers object's paremeter.
     */
    @Override
    public INumbers sub(INumbers n) {
        return n.subtractingAFloat(this);
    }

    @Override
    public INumbers subtractingAFloat(Float f) {
        return new Float(f.getFloat()-this.getFloat());
    }

    @Override
    public INumbers subtractingAnInt(Int i) {
        return new Float(i.getInt()-this.getFloat());
    }
    /**
     * Returns a new Float object with the multiplication between this Float object's parameter and an INumbers object's paremeter.
     */
    @Override
    public INumbers mult(INumbers n) {
        return n.multiplyingAFloat(this);
    }

    @Override
    public INumbers multiplyingAFloat(Float f) {
        return new Float(f.getFloat()*this.getFloat());
    }

    @Override
    public INumbers multiplyingAnInt(Int i) {
        return new Float(i.getInt()*this.getFloat());
    }
    /**
     * Returns a new Float object with the division between this Float object's parameter and an INumbers object's paremeter.
     */
    @Override
    public INumbers div(INumbers n) {
        return n.dividingAFloat(this);
    }

    @Override
    public INumbers dividingAFloat(Float f) {
        return new Float(f.getFloat()/this.getFloat());
    }

    @Override
    public INumbers dividingAnInt(Int i) {
        return new Float(i.getInt()/this.getFloat());
    }


}
