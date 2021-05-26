package cl.uchile.dcc.scrabble.gui;

import java.util.Objects;


/**
 * Class that represents the Binary type for Scrabble.
 */
public class Binary extends Numbers implements ILogical{
    private String Binary;

    /**
     * Creates a Binary object.
     * Constructor that creates an object of the Binary type, which receives a java String as parameter.
     */
    public Binary(String Binary) {
        this.Binary = Binary;
    }

    /**
     * Returns the hash of the Binary class.
     */
    @Override
    public int hashCode(){
        return Objects.hash(Binary.class);
    }

    /**
     * Returns whether an object is equal to the Binary object that it's being compared to.
     */
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Binary){
            var o = (Binary) obj;
            return o.Binary.equals(this.Binary);
        }
        return false;
    }

    /**
     * Returns the Binary parameter.
     * Getter that returns the java type String parameter of the Binary object.
     */
    public String getBinary() {
        return Binary;
    }


    /**
     * Returns the Binary object representation as a java type String.
     */
    @Override
    public String toString() {
        return this.getBinary();
    }

    /**
     * Returns a copy of the Binary object.
     */
    @Override
    public Binary transformtoBinary(){
        return this;
    }



    /*
    These methods don't have to be implemented for the first partial submission.
    @Override
    public Float transformtoFloat(){

    }
    @Override
    public Int transformtoInt(){

    }
     */

}
