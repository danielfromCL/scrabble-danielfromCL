package cl.uchile.dcc.scrabble.gui;

/**
 * Interface that implements all the interactions between the subclasses of the Numbers class.
 */
public interface INumbers {


    /**
     * Sums between two numbers
     */
    INumbers sum(INumbers n);

    /**
     * Subtraction between two numbers
     */
    INumbers sub(INumbers n);

    /**
     * Division between two numbers
     */
    INumbers div(INumbers n);

    /**
     * Multiplication between two numbers
     */
    INumbers mult(INumbers n);

}
