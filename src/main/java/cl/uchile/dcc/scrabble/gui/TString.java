package cl.uchile.dcc.scrabble.gui;

import java.util.Objects;

/**
 * Class that represents the String type for Scrabble.
 */
public class TString extends Types{
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
    public int hashCode(){
        return Objects.hash(TString.class);
    }

    /**
     * Returns whether an object is equal to the TString object that it's being compared to.
     */
    @Override
    public boolean equals(Object obj){
        if(obj instanceof TString){
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
     * Sums a TString object with another object from the TString Class.
     */
    @Override
    public ITypes sum(TString t) {
        return new TString(this.toString() + t.toString());
    }

    /**
     * Sums a TString object with another object from the Float Class.
     */
    @Override
    public ITypes sum(Float f) {
        return new TString(this.toString() + f.toString());
    }

    /**
     * Sums a TString object with another object from the Int Class.
     */
    @Override
    public ITypes sum(Int i) {
        return new TString(this.toString() + i.toString());
    }

    /**
     * Sums a TString object with another object from the Bool Class.
     */
    @Override
    public ITypes sum(Bool bo) {
        return new TString(this.toString() + bo.toString());
    }

    /**
     * Sums a TString object with another object from the Binary Class.
     */
    @Override
    public ITypes sum(Binary bi) {
        return new TString(this.toString() + bi.toString());
    }

    /**
     * It's not possible to negate a String.
     */
    @Override
    public ITypes neg(){
        return null;
    }
}
