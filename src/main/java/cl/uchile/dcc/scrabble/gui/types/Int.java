package cl.uchile.dcc.scrabble.gui.types;

import java.util.Objects;


/**
 * Class that represents the Int type for Scrabble.
 */
public class Int extends Numbers implements ITypes {
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
     * Adds an INumber object's parameter with this Int object's parameter.
     */
    @Override
    public ITypes sum(ITypes n){
        return n.addingAnInt(this);
    }

    /**
     * Returns a new Int object with the sum between both Int objects's parameters.
     */
    @Override
    public ITypes addingAnInt(Int i){
        return new Int(this.getInt()+i.getInt());
    }
    /**
     * Returns a new Binary object with the sum between this object's parameter and the Binary object's parameter.
     */
    @Override
    public ITypes addingABinary(Binary b){
        int b1 = toInt(b.getBinary());
        int res = b1+this.getInt();
        return new Binary(intToBinary(res));
    }
    /**
     * Returns a new Float object with the sum between this object's parameter and the Float object's paramater.
     */
    @Override
    public ITypes addingAFloat(Float f) {
        return new Float(f.getFloat()+this.getInt());
    }
    /**
     * Subtracts an ITypes object's parameter from this Int object's parameter.
     */
    @Override
    public ITypes sub(ITypes n) {
        return n.subtractingAnInt(this);
    }
    /**
     * Returns a new Int object with the subtraction between both Int objects's parameters.
     */
    @Override
    public ITypes subtractingAnInt(Int i) {
        return new Int(i.getInt()-this.getInt());
    }
    /**
     * Returns a new Float object with the subtraction between the Float object's parameter and this object's parameter.
     */
    @Override
    public ITypes subtractingAFloat(Float f) {
        return new Float(f.getFloat()-this.getInt());
    }
    /**
     * Returns a new Binary object with the subtraction between the Binary object's parameter and this object's parameter.
     */
    @Override
    public ITypes subtractingABinary(Binary b) {
        int b1= toInt(b.getBinary());
        int res = b1-this.getInt();
        return new Binary(intToBinary(res));
    }
    /**
     * Multiplies an ITypes object's parameter with this Int object's parameter.
     */
    @Override
    public ITypes mult(ITypes n) {
        return n.multiplyingAnInt(this);
    }
    /**
     * Returns a new Float object with the multiplication between the Float object's parameter and this object's parameter.
     */
    @Override
    public ITypes multiplyingAFloat(Float f) {
        return new Float(f.getFloat()*this.getInt());
    }
    /**
     * Returns a new Int object with the multiplication between both Int objects's parameters.
     */
    @Override
    public ITypes multiplyingAnInt(Int i) {
        return new Int(i.getInt()*this.getInt());
    }
    /**
     * Returns a new Binary object with the multiplication between the Binary object's parameter and this object's parameter.
     */
    @Override
    public ITypes multiplyingABinary(Binary b) {
        int b1 = toInt(b.getBinary());
        int res = b1*this.getInt();
        return new Binary(intToBinary(res));
    }
    /**
     * Divides this Int object's parameter by an ITypes object's parameter.
     */
    @Override
    public ITypes div(ITypes n) {
        return n.dividingAnInt(this);
    }
    /**
     * Returns a new Float object with the division between the Float object's parameter and this object's parameter.
     */
    @Override
    public ITypes dividingAFloat(Float f) {
        return new Float(f.getFloat()/this.getInt());
    }
    /**
     * Returns a new Int object with the division between both Int objects's parameters.
     */
    @Override
    public ITypes dividingAnInt(Int i) {
        return new Int(i.getInt()/this.getInt());
    }
    /**
     * Returns a new Binary object with the division between the Binary object's parameter and this object's parameter.
     */
    @Override
    public ITypes dividingABinary(Binary b) {
        int b1 = toInt(b.getBinary());
        int res = b1/this.getInt();
        return new Binary(intToBinary(res));
    }


}
