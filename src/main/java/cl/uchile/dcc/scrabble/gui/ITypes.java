package cl.uchile.dcc.scrabble.gui;


/**
 * Interface that implements all the interactions between the subclasses of the Type class.
 */
public interface ITypes {


    /**
     *  Transforms an object to TString.
     *  Method that transforms any subclass of the Types class to the TString class.
     */
    TString transformtoString();

    /**
     * Transforms an object to Bool.
     *  Method that transforms any subclass of the Types class to the Bool class, if the transformation is permitted.
     */
    Bool transformtoBool();

    /**
     * Transforms an object to Int.
     *  Method that transforms any subclass of the Types class to the Int class, if the transformation is permitted.
     */
    Int transformtoInt();

    /**
     * Transforms an object to Float.
     *  Method that transforms any subclass of the Types class to the Float class, if the transformation is permitted.
     */
    Float transformtoFloat();

    /**
     *  Transforms an object to Binary.
     *  Method that transforms any subclass of the Types class to the Binary class, if the transformation is permitted.
     */
    Binary transformtoBinary();

    /**
     * Returns an ITypes object with the sum of an ITypes object and a TString object.
     */
    ITypes sum(TString t);

    /**
     * Returns an ITypes object with the sum of an ITypes object and a Float object.
     */
    ITypes sum(Float f);

    /**
     * Returns an ITypes object with the sum of an ITypes object and an Int object.
     */
    ITypes sum(Int i);

    /**
     * Returns an ITypes object with the sum of an ITypes object and a Bool object.
     */
    ITypes sum(Bool bo);

    /**
     * Returns an ITypes object with the sum of an ITypes object and a Binary object.
     */
    ITypes sum(Binary bi);

    /**
     * Returns the negation of an ITypes object.
     */
    ITypes neg();

}
