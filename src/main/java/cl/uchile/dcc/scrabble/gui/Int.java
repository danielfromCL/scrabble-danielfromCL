package cl.uchile.dcc.scrabble.gui;

import java.util.Objects;


/**
 * Class that represents the Int type for Scrabble.
 */
public class Int extends Numbers {
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
     * Returns a new Float object with the sum between the Int object and a Float object.
     */
    @Override
    public INumbers sum(Float f){
        return new Float(this.getInt()+ f.getFloat());
    }
    /**
     * Returns a new Int object with the sum between the Int object and another Int object.
     */
    @Override
    public INumbers sum(Int i){
        return new Int(this.getInt()+i.getInt());
    }
    /**
     * Returns a new Binary object with the sum between the Int object and a Binary object.
     */
    @Override
    public INumbers sum(Binary bi){
        int b = toInt(bi.getBinary());
        int res = this.getInt() + b;
        String binary = intToBinary(res);
        return new Binary(binary);
    }

    /**
     * Returns a new Float object with the subtraction between the Int object and a Float object.
     */
    @Override
    public INumbers sub(Float n){
        return new Float(this.getInt()-n.getFloat());
    }
    /**
     * Returns a new Int object with the subtraction between the Int object and another Int object.
     */
    @Override
    public INumbers sub(Int n){
        return new Int(this.getInt()-n.getInt());
    }
    /**
     * Returns a new Binary object with the subtraction between the Int object and a Binary object.
     */
    @Override
    public INumbers sub(Binary n){
        int bi = toInt(n.getBinary());
        int res = this.getInt() - bi;
        String binary = intToBinary(res);
        return new Binary(binary);
    }

    /**
     * Returns a new Float object with the division between the Int object and a Float object.
     */
    @Override 
    public INumbers div(Float n){
        return new Float(this.getInt()/n.getFloat());
    }
    /**
     * Returns a new Int object with the division between the Int object and another Int object.
     */
    @Override
    public INumbers div(Int n){
        return new Int(this.getInt()/n.getInt());
    }
    /**
     * Returns a new Binary object with the division between the Int object and a Binary object.
     */
    @Override
    public INumbers div(Binary n){
        int bi = toInt(n.getBinary());
        int res = this.getInt() / bi;
        String binary = intToBinary(res);
        return new Binary(binary);
    }

    /**
     * Returns a new Float object with the multiplication between the Int object and a Float object.
     */
    @Override
    public INumbers mult(Float n){
        return new Float(this.getInt()*n.getFloat());
    }
    /**
     * Returns a new Int object with the multiplication between the Int object and another Int object.
     */
    @Override
    public INumbers mult(Int n){
        return new Int(this.getInt()*n.getInt());
    }
    /**
     * Returns a new Binary object with the multiplication between the Int object and a Binary object.
     */
    @Override
    public INumbers mult(Binary n){
        int bi = toInt(n.getBinary());
        int res = this.getInt() * bi;
        String binary = intToBinary(res);
        return new Binary(binary);
    }

    /**
     * The negation of an Int is itself multiplied by -1.
     */
    @Override
    public ITypes neg(){
        return new Int(this.getInt()*(-1));
    }
}
