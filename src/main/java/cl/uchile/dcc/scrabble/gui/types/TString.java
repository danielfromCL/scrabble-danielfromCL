package cl.uchile.dcc.scrabble.gui.types;

import cl.uchile.dcc.scrabble.gui.ast.ASTString;

import java.util.Objects;

/**
 * Class that represents the String type for Scrabble.
 */
public class TString extends Types implements ASTString {
    private String string;
    /**
     * Creates a TString object.
     * Constructor that creates an object of the TString type, which receives a java String as parameter.
     */
    public TString(String string) {
        this.string = string;
    }
    /**
     * Returns the hash of the TString class.
     */
    @Override
    public int hashCode() {
        return Objects.hash(TString.class);
    }
    /**
     * Returns whether an object is equal to the TString object that it's being compared to.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TString) {
            var o = (TString) obj;
            return o.string.equals(this.string);
        }
        return false;
    }
    /**
     * Returns the string parameter.
     * Getter that returns the java type String parameter of the TString object.
     */
    public String getString() {
        return string;
    }
    /**
     * Returns the TString object representation as a java type String.
     */
    @Override
    public String toString() {
        return this.getString();
    }
    /**
     * Sums a TString object with another ITypes object.
     */
    public TString sum(ITypes t) {
        return t.addedByString(this);
    }


    @Override
    public TString getResult(){
        return this;
    }
}

