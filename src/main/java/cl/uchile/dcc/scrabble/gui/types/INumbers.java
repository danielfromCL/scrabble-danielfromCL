package cl.uchile.dcc.scrabble.gui.types;

import cl.uchile.dcc.scrabble.gui.ast.ASTNumbers;

/**
 * Interface that declares all the common methods between the subclasses of the Numbers class.
 */
public interface INumbers extends ITypes, ASTNumbers {
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

    //From this point down there are methods meant for the AST (since it is now permitted for Binary to operate with Float in that order).

    INumbers Add(INumbers n);

    INumbers AddingABinaryAST(Binary b);

    INumbers Sub(INumbers n);

    INumbers SubtractingABinaryAST(Binary b);

    INumbers Mult(INumbers n);

    INumbers MultiplyingABinaryAST(Binary b);

    INumbers Div(INumbers n);

    INumbers DividingABinaryAST(Binary b);

    INumbers Neg();
}
