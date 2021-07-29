package cl.uchile.dcc.scrabble.gui.types;

import cl.uchile.dcc.scrabble.gui.memory.FlyweightFloat;

import java.util.Objects;

/**
 * Class that represents the Float type for Scrabble.
 */
public class Float extends Numbers implements ITypes {
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
        return FlyweightFloat.getFFloat().createFloat(this.getFloat());
    }
    /**
     * Returns a Float object with the sum between the Float object and an ITypes object.
     */
    @Override
    public ITypes sum(ITypes n){
        return n.addingAFloat(this);
    }
    /**
     * Returns a Float object with the sum between both Float objects's parameters.
     */
    @Override
    public Float addingAFloat(Float f){
        return FlyweightFloat.getFFloat().createFloat(f.getFloat()+this.getFloat());
    }
    /**
     * Returns a Float object with the sum between this object's parameter and the Int object's paramater.
     */
    @Override
    public ITypes addingAnInt(Int i){
        return FlyweightFloat.getFFloat().createFloat(i.getInt()+this.getFloat());
    }
    /**
     * Returns a Float object with the subtraction between this Float object's parameter and an ITypes object's paremeter.
     */
    @Override
    public ITypes sub(ITypes n) {
        return n.subtractingAFloat(this);
    }
    /**
     * Returns a Float object with the subtraction between both Float objects's parameters.
     */
    @Override
    public ITypes subtractingAFloat(Float f) {
        return FlyweightFloat.getFFloat().createFloat(f.getFloat()-this.getFloat());
    }
    /**
     * Returns a Float object with the subtraction between this object's parameter and the Int object's paramater.
     */
    @Override
    public ITypes subtractingAnInt(Int i) {
        return FlyweightFloat.getFFloat().createFloat(i.getInt()-this.getFloat());
    }
    /**
     * Returns a Float object with the multiplication between this Float object's parameter and an ITypes object's paremeter.
     */
    @Override
    public ITypes mult(ITypes n) {
        return n.multiplyingAFloat(this);
    }
    /**
     * Returns a Float object with the multiplication between both Float objects's parameters.
     */
    @Override
    public ITypes multiplyingAFloat(Float f) {
        return FlyweightFloat.getFFloat().createFloat(f.getFloat()*this.getFloat());
    }
    /**
     * Returns a Float object with the multiplication between this object's parameter and the Int object's paramater.
     */
    @Override
    public ITypes multiplyingAnInt(Int i) {
        return FlyweightFloat.getFFloat().createFloat(i.getInt()*this.getFloat());
    }
    /**
     * Returns a Float object with the division between this Float object's parameter and an ITypes object's paremeter.
     */
    @Override
    public ITypes div(ITypes n) {
        return n.dividingAFloat(this);
    }
    /**
     * Returns a Float object with the division between both Float objects's parameters.
     */
    @Override
    public ITypes dividingAFloat(Float f) {
        return FlyweightFloat.getFFloat().createFloat(f.getFloat()/this.getFloat());
    }
    /**
     * Returns a Float object with the division between this object's parameter and the Int object's paramater.
     */
    @Override
    public ITypes dividingAnInt(Int i) {
        return FlyweightFloat.getFFloat().createFloat(i.getInt()/this.getFloat());
    }


}
