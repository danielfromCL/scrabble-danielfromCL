package cl.uchile.dcc.scrabble.gui;

/**
 * Interface that implements all the interactions between the subclasses of the Numbers class.
 */
public interface INumbers extends ITypes{



    @Override
    ITypes sum(Float f);

    @Override
    ITypes sum(Int i);

    @Override
    ITypes sum(Binary bi);


    /**
     * Subtraction between an INumbers object and a Float object
     */
    INumbers sub(Float f);

    /**
     * Subtraction between an INumbers object and an Int object
     */
    INumbers sub(Int f);

    /**
     * Subtraction between an INumbers object and a Binary object
     */
    INumbers sub(Binary bi);

    /**
     * Division between two numbers
     */
    INumbers div(INumbers n);

    /**
     * Multiplication between two numbers
     */
    INumbers mult(INumbers n);

}
