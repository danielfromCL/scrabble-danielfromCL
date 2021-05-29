package cl.uchile.dcc.scrabble.gui;

import java.util.Objects;

/**
 * Class that represents the Bool type for Scrabble.
 */
public class Bool extends Types implements ILogical{
    private boolean Bool;

    /**
     * Creates a Bool object.
     * Constructor that creates an object of the Bool type, which receives a java boolean as parameter.
     */
    public Bool(boolean Bool) {
        this.Bool = Bool;
    }

    /**
     * Returns the hash of the Bool class.
     */
    @Override
    public int hashCode(){
        return Objects.hash(Bool.class);
    }


    /**
     * Returns whether an object is equal to the Bool object that it's being compared to.
     */
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Bool){
            var o = (Bool) obj;
            return o.Bool == this.Bool;
        }
        return false;
    }

    /**
     * Returns the Bool parameter.
     * Getter that returns the java type boolean parameter of the Bool object.
     */
    public boolean isBool() {
        return Bool;
    }


    /**
     * Returns the Bool object representation as a java type String.
     */
    @Override
    public String toString() {
        return String.valueOf(this.isBool());
    }

    /**
     * Returns a copy of the Bool object.
     */
    @Override
    public Bool transformtoBool(){
        return this;
    }

    /**
     * Returns its negated value.
     */
    @Override
    public ITypes neg(){
        return new Bool(!(this.isBool()));
    }
}
