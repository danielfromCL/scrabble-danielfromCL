package cl.uchile.dcc.scrabble.gui.types;


import cl.uchile.dcc.scrabble.gui.ast.IAST;

/**
 * Interface that implements all the interactions between the subclasses of the Type class.
 */
public interface ITypes extends IAST {
    /**
     *  Transforms an object to TString.
     *  Method that transforms any subclass of the Types class to the TString class.
     */
    ITypes transformtoString();
    /**
     * Sums a TString object with another IType object.
     */
    ITypes addedByString(TString t);

    //HAY QUE ARREGLAR DE AQUI HACIA ABAJO

    /**
     *  Transforms an object to Binary.
     */
    ITypes transformtoBinary();
    /**
     *  Transforms an object to Int.
     */
    ITypes transformtoInt();
    /**
     * Transforms an object to Float.
     */
    ITypes transformtoFloat();
    /**
     * Transforms an object to Bool;
     */
    ITypes transformtoBool();

    /**
     * Returns a new ITypes object with the sum between both ITypes object's paremeters.
     */
    ITypes sum(ITypes n);

    /**
     * Returns a new ITypes object with its negated value.
     */
    ITypes neg();
    /**
     * Returns a new ITypes object with the subtraction between both ITypes object's paremeters.
     */
    ITypes sub(ITypes n);
    /**
     * Returns a new ITypes object with the multiplication between both ITypes object's paremeters.
     */
    ITypes mult(ITypes n);
    /**
     * Returns a new ITypes object with the division between both ITypes object's paremeters.
     */
    ITypes div(ITypes n);

    /**
     * Returns a new ITypes object with the sum between an ITypes object's parameter and a Binary object's parameter.
     */
    ITypes addingABinary(Binary b);
    /**
     * Returns a new ITypes object with the subtraction between an ITypes object's parameter and a Binary object's parameter.
     */
    ITypes subtractingABinary(Binary b);
    /**
     * Returns a new ITypes object with the multiplication between an ITypes object's parameter and a Binary object's parameter.
     */
    ITypes multiplyingABinary(Binary b);
    /**
     * Returns a new ITypes object with the division between an ITypes object's parameter and a Binary object's parameter.
     */
    ITypes dividingABinary(Binary b);


    /**
     * Returns a new ITypes object with the sum between an ITypes object and a Float object.
     */
    ITypes addingAFloat(Float f);
    /**
     * Returns a new ITypes object with the sum between an ITypes object's parameter and an Int object's parameter.
     */
    ITypes addingAnInt(Int i);
    /**
     * Returns a new ITypes object with the subtraction between a Float object's parameter and an ITypes object's parameter.
     */
    ITypes subtractingAFloat(Float f);
    /**
     * Returns a new ITypes object with the subtraction between an Int object's parameter and an ITypes object's parameter.
     */
    ITypes subtractingAnInt(Int i);
    /**
     * Returns a new ITypes object with the multiplication between an ITypes object's parameter and a Float object's parameter.
     */
    ITypes multiplyingAFloat(Float f);
    /**
     * Returns a new ITypes object with the multiplication between an ITypes object's parameter and an Int object's parameter.
     */
    ITypes multiplyingAnInt(Int i);
    /**
     * Returns a new ITypes object with the division between a Float object's parameter and an ITypes object's parameter.
     */
    ITypes dividingAFloat(Float f);
    /**
     * Returns a new ITypes object with the division between an Int object's parameter and an ITypes object's parameter.
     */
    ITypes dividingAnInt(Int i);

    /**
     * Operates the logical "and" between an ITypes object's parameter and another ITypes object's parameter.
     */
    ITypes and(ITypes b);
    /**
     * Operates the logical "or" between an ITypes object's parameter and another ITypes object's parameter.
     */
    ITypes or(ITypes b);
    /**
     * Operates the logical operator "and" between and ITypes object and a Binary object.
     */
    ITypes andwithBinary(Binary b);
    /**
     * Operates the logical operator "and" between and ITypes object and a Bool object.
     */
    ITypes andwithBool(Bool b);
    /**
     * Operates the logical operator "or" between and ITypes object and a Binary object.
     */
    ITypes orwithBinary(Binary b);
    /**
     * Operates the logical operator "and" between and ITypes object and a Bool object.
     */
    ITypes orwithBool(Bool b);

    /**
     * Returns the same ITypes object.
     */
    ITypes getResult();

}
