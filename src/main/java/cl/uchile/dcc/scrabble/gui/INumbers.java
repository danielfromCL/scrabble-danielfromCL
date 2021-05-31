package cl.uchile.dcc.scrabble.gui;

/**
 * Interface that implements all the interactions between the subclasses of the Numbers class.
 */
public interface INumbers extends ITypes{


    /**
     *  Returns a new INumber object with the sum of an INumbers object and a Float object.
     */
    INumbers sum(Float f);

    /**
     * Returns a new INumber object with the sum of an INumbers object and an Int object.
     */
    INumbers sum(Int i);

    /**
     * Returns a new INumber object with the sum of an INumbers object and a Binary object.
     */
    INumbers sum(Binary bi);


    /**
     * Returns a new INumber object with the subtraction of an INumbers object and a Float object.
     */
    INumbers sub(Float n);

    /**
     * Returns a new INumber object with the subtraction of an INumbers object and an Int object.
     */
    INumbers sub(Int n);

    /**
     * Returns a new INumber object with the subtraction of an INumbers object and a Binary object.
     */
    INumbers sub(Binary n);

    /**
     * Returns a new INumber object with the division between an INumbers object and a Float object.
     */
    INumbers div(Float n);

    /**
     * Returns a new INumber object with the division between an INumbers object and an Int object.
     */
    INumbers div(Int n);

    /**
     * Returns a new INumber object with the division between an INumbers object and a Binary object.
     */
    INumbers div(Binary n);

    /**
     * Returns a new INumber object with the multiplication between an INumbers object and a Float object
     */
    INumbers mult(Float n);

    /**
     * Returns a new INumber object with the multiplication between an INumbers object and an Int object
     */
    INumbers mult(Int n);

    /**
     * Returns a new INumber object with the multiplication between an INumbers object and a Binary object
     */
    INumbers mult(Binary n);

}
