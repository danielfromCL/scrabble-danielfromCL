package cl.uchile.dcc.scrabble.gui;

import java.util.Objects;


/**
 * Class that represents the Int type for Scrabble.
 */
public class Int extends Numbers implements FloatInt, IntBinary {
    private int Int;
    /**
     * Creates an Int object.
     * Constructor that creates an object of the Int type, which receives a java int as parameter.
     */
    public Int(int Int) {
        this.Int = Int;
    }
    /**
     * Returns the hash of the Int class.
     */
    @Override
    public int hashCode(){
        return Objects.hash(Int.class);
    }
    /**
     * Returns whether an object is equal to the Int object that it's being compared to.
     */
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Int){
            var o = (Int) obj;
            return o.Int == this.Int;
        }
        return false;
    }
    /**
     * Returns the Int parameter.
     * Getter that returns the java type int parameter of the Int object.
     */
    public int getInt() {
        return Int;
    }
    /**
     * Returns the Int object representation as a java type String.
     */
    @Override
    public String toString() {
        return String.valueOf(this.getInt());
    }
    /**
     * Returns a copy of the Int object.
     */
    @Override
    public Int transformtoInt(){
        return new Int(this.getInt());
    }
    /**
     * Returns a new Float object with the Int object's parameter as its parameter.
     */
    @Override
    public Float transformtoFloat(){
        return new Float(this.getInt());
    }
    /**
     * Returns a new Binary object with the Int object's parameter as its parameter in binary representation.
     */
    @Override
    public Binary transformtoBinary(){
        String binary = intToBinary(this.getInt());
        return new Binary(binary);
    }
    /**
     * The negation of an Int is itself multiplied by -1.
     */
    @Override
    public FloatInt neg(){
        return new Int(this.getInt()*(-1));
    }
    /**
     * Adds an INumber object's parameter with this Int object's parameter.
     */
    @Override
    public INumbers sum(INumbers n){
        return n.addingAnInt(this);
    }

    /**
     * Returns a new Int object with the sum between both Int objects's parameters.
     */
    @Override
    public INumbers addingAnInt(Int i){
        return new Int(this.getInt()+i.getInt());
    }
    /**
     * Returns a new Binary object with the sum between this object's parameter and the Binary object's parameter.
     */
    @Override
    public IntBinary addingABinary(Binary b){
        int b1 = toInt(b.getBinary());
        int res = b1+this.getInt();
        return new Binary(intToBinary(res));
    }
    /**
     * Returns a new Float object with the sum between this object's parameter and the Float object's paramater.
     */
    @Override
    public INumbers addingAFloat(Float f) {
        return new Float(f.getFloat()+this.getInt());
    }
    /**
     * Subtracts an INumbers object's parameter from this Int object's parameter.
     */
    @Override
    public INumbers sub(INumbers n) {
        return n.subtractingAnInt(this);
    }
    /**
     * Returns a new Int object with the subtraction between both Int objects's parameters.
     */
    @Override
    public INumbers subtractingAnInt(Int i) {
        return new Int(i.getInt()-this.getInt());
    }
    /**
     * Returns a new Float object with the subtraction between the Float object's parameter and this object's parameter.
     */
    @Override
    public INumbers subtractingAFloat(Float f) {
        return new Float(f.getFloat()-this.getInt());
    }
    /**
     * Returns a new Binary object with the subtraction between the Binary object's parameter and this object's parameter.
     */
    @Override
    public IntBinary subtractingABinary(Binary b) {
        int b1= toInt(b.getBinary());
        int res = b1-this.getInt();
        return new Binary(intToBinary(res));
    }
    /**
     * Multiplies an INumbers object's parameter with this Int object's parameter.
     */
    @Override
    public INumbers mult(INumbers n) {
        return n.multiplyingAnInt(this);
    }
    /**
     * Returns a new Float object with the multiplication between the Float object's parameter and this object's parameter.
     */
    @Override
    public INumbers multiplyingAFloat(Float f) {
        return new Float(f.getFloat()*this.getInt());
    }
    /**
     * Returns a new Int object with the multiplication between both Int objects's parameters.
     */
    @Override
    public INumbers multiplyingAnInt(Int i) {
        return new Int(i.getInt()*this.getInt());
    }
    /**
     * Returns a new Binary object with the multiplication between the Binary object's parameter and this object's parameter.
     */
    @Override
    public IntBinary multiplyingABinary(Binary b) {
        int b1 = toInt(b.getBinary());
        int res = b1*this.getInt();
        return new Binary(intToBinary(res));
    }
    /**
     * Divides this Int object's parameter by an INumbers object's parameter.
     */
    @Override
    public INumbers div(INumbers n) {
        return n.dividingAnInt(this);
    }
    /**
     * Returns a new Float object with the division between the Float object's parameter and this object's parameter.
     */
    @Override
    public INumbers dividingAFloat(Float f) {
        return new Float(f.getFloat()/this.getInt());
    }
    /**
     * Returns a new Int object with the division between both Int objects's parameters.
     */
    @Override
    public INumbers dividingAnInt(Int i) {
        return new Int(i.getInt()/this.getInt());
    }
    /**
     * Returns a new Binary object with the division between the Binary object's parameter and this object's parameter.
     */
    @Override
    public IntBinary dividingABinary(Binary b) {
        int b1 = toInt(b.getBinary());
        int res = b1/this.getInt();
        return new Binary(intToBinary(res));
    }

    @Override
    public Int getResult(){
        return this;
    }
}
