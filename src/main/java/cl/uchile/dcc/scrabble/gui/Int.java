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


}
