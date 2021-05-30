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
     * Sums a ITypes object with another object from the TString class.
     */
    ITypes sum(TString t);

    /**
     * Sums a ITypes object with another object from the Float class.
     */
    ITypes sum(Float f);

    /**
     * Sums a ITypes object with another object from the Int class.
     */
    ITypes sum(Int i);

    /**
     * Sums a ITypes object with another object from the Bool class.
     */
    ITypes sum(Bool bo);

    /**
     * Sums a ITypes object with another object from the Binary class.
     */
    ITypes sum(Binary bi);

    /**
     * Negates an ITypes object.
     */
    ITypes neg();

}
