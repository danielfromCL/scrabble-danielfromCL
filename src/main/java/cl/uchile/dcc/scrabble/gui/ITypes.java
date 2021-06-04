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
     * Sums a TString object with another IType object.
     */
    TString addedByString(TString t);
}
