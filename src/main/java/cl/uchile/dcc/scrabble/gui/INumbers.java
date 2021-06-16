package cl.uchile.dcc.scrabble.gui;

/**
 * Interface that declares all the common methods between the subclasses of the Numbers class.
 */
public interface INumbers extends ITypes {
    /**
     * Returns a Float object with the INumbers parameter as its parameter.
     */
    Float transformtoFloat();
    /**
     * Returns a new INumber object with the sum between an INumbers object and a Float object.
     */
    INumbers addingAFloat(Float f);
    /**
     * Returns a new INumber object with the sum between an INumbers object's parameter and an Int object's parameter.
     */
    INumbers addingAnInt(Int i);
    /**
     * Returns a new INumber object with the subtraction between a Float object's parameter and an INumbers object's parameter.
     */
    INumbers subtractingAFloat(Float f);
    /**
     * Returns a new INumber object with the subtraction between an Int object's parameter and an INumbers object's parameter.
     */
    INumbers subtractingAnInt(Int i);
    /**
     * Returns a new INumber object with the multiplication between an INumbers object's parameter and a Float object's parameter.
     */
    INumbers multiplyingAFloat(Float f);
    /**
     * Returns a new INumber object with the multiplication between an INumbers object's parameter and an Int object's parameter.
     */
    INumbers multiplyingAnInt(Int i);
    /**
     * Returns a new INumber object with the division between a Float object's parameter and an INumbers object's parameter.
     */
    INumbers dividingAFloat(Float f);
    /**
     * Returns a new INumber object with the division between an Int object's parameter and an INumbers object's parameter.
     */
    INumbers dividingAnInt(Int i);


}
