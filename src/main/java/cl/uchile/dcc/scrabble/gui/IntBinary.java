package cl.uchile.dcc.scrabble.gui;
/**
 * Interface that declares all the common methods between the Int class and the Binary class.
 */
public interface IntBinary extends INumbers{
    /**
     *  Transforms an object to Binary.
     */
    Binary transformtoBinary();
    /**
     *  Transforms an object to Int.
     */
    Int transformtoInt();
    /**
     * Returns a new IntBinary object with the sum between an IntBinary object's parameter and a Binary object's parameter.
     */
    IntBinary addingABinary(Binary b);
    /**
     * Returns a new IntBinary object with the subtraction between an IntBinary object's parameter and a Binary object's parameter.
     */
    IntBinary subtractingABinary(Binary b);
    /**
     * Returns a new IntBinary object with the multiplication between an IntBinary object's parameter and a Binary object's parameter.
     */
    IntBinary multiplyingABinary(Binary b);
    /**
     * Returns a new IntBinary object with the division between an IntBinary object's parameter and a Binary object's parameter.
     */
    IntBinary dividingABinary(Binary b);

}