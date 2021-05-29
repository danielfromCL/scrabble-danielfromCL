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
        return this;
    }


    /**
     * Returns a new Float object with the Int object's parameter as its parameter.
     */
    @Override
    public Float transformtoFloat(){
        return new Float(this.getInt());
    }


    /*

    This method doesn't have to be implemented for the first partial submission.
    @Override
    public Binary transformtoBinary(){

        }
     */

    public Float sum(Float n){
        return new Float(this.getInt()+ n.getFloat());
    }

    public Int sum(Int n){
        return new Int(this.getInt()+n.getInt());
    }

    /*
    public Binary sum(Binary n){
        return new Binary();
    }
     */

    public Float sub(Float n){
        return new Float(this.getInt()-n.getFloat());
    }

    public Int sub(Int n){
        return new Int(this.getInt()-n.getInt());
    }

    /*
    public Binary sub(Binary n){
        return new Binary();
    }
     */

    public Float div(Float n){
        return new Float(this.getInt()/n.getFloat());
    }

    public Int div(Int n){
        return new Int(this.getInt()/n.getInt());
    }

    /*
    public Binary div(Binary n){
        return new Binary();
    }
     */

    public Float mult(Float n){
        return new Float(this.getInt()*n.getFloat());
    }

    public Int mult(Int n){
        return new Int(this.getInt()*n.getInt());
    }

    /*
    public Binary mult(Binary n){
        return new Binary();
    }
     */

    /**
     * The negation of an Int is itself multiplied by -1.
     */
    @Override
    public ITypes neg(){
        return new Int(this.getInt()*(-1));
    }
}
