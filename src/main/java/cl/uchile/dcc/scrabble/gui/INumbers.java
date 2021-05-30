package cl.uchile.dcc.scrabble.gui;

/**
 * Interface that implements all the interactions between the subclasses of the Numbers class.
 */
public interface INumbers extends ITypes{


    /**
     * Sums a INumbers object with another object from the Float class.
     */
    INumbers sum(Float f);

    /**
     * Sums a INumbers object with another object from the Int class.
     */
    INumbers sum(Int i);

    /**
     * Sums a INumbers object with another object from the Binary class.
     */
    INumbers sum(Binary bi);


    /**
     * Subtraction between an INumbers object and a Float object
     */
    INumbers sub(Float n);

    /**
     * Subtraction between an INumbers object and an Int object
     */
    INumbers sub(Int n);

    /**
     * Subtraction between an INumbers object and a Binary object
     */
    INumbers sub(Binary n);

    /**
     * Division between an INumbers object and a Float object
     */
    INumbers div(Float n);

    /**
     * Division between an INumbers object and an Int object
     */
    INumbers div(Int n);

    /**
     * Division between an INumbers object and a Binary object
     */
    INumbers div(Binary n);

    /**
     * Multiplication between an INumbers object and a Float object
     */
    INumbers mult(Float n);

    /**
     * Multiplication between an INumbers object and an Int object
     */
    INumbers mult(Int n);

    /**
     * Multiplication between an INumbers object and a Binary object
     */
    INumbers mult(Binary n);

}
