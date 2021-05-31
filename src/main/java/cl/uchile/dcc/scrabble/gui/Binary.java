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
        return new Binary(this.getBinary());
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

    /**
     * Returns a new Binary object with the sum between the Binary object and an Int object.
     */
    @Override
    public INumbers sum(Int i){
        return null;
    }
    /**
     * Returns a new Binary object with the sum between the Binary object and another Binary object.
     */
    @Override
    public INumbers sum(Binary bi){
        return null;
    }

    /**
     * Returns a new Binary object with the subtraction between the Binary object and an Int object.
     */
    @Override
    public INumbers sub(Int n) {
        return null;
    }

    /**
     * Returns a new Binary object with the subtraction between the Binary object and another Binary object.
     */
    @Override
    public INumbers sub(Binary n) {
        return null;
    }

    /**
     * Returns a new Binary object with the division between the Binary object and an Int object.
     */
    @Override
    public INumbers div(Int n) {
        return null;
    }
    /**
     * Returns a new Binary object with the division between the Binary object and another Binary object.
     */
    @Override
    public INumbers div(Binary n) {
        return null;
    }

    /**
     * Returns a new Binary object with the multiplication between the Binary object and an Int object.
     */
    @Override
    public INumbers mult(Int n) {
        return null;
    }
    /**
     * Returns a new Binary object with the multiplication between the Binary object and another Binary object.
     */
    @Override
    public INumbers mult(Binary n) {
        return null;
    }

    /**
     * The negation of a binary is made bit to bit.
     */
    @Override
    public ITypes neg(){
        return this;
    }

    @Override
    public ILogical and(Binary b) {
        return null;
    }

    @Override
    public ILogical and(Bool b) {
        return null;
    }

    @Override
    public ILogical or(Binary b) {
        return null;
    }

    @Override
    public ILogical or(Bool b) {
        return null;
    }
}
