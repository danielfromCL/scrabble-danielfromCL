package cl.uchile.dcc.scrabble.gui.types;

import java.util.Objects;

public class NullType extends Types{

    /**
     * Returns the hash of the NullType class.
     */
    @Override
    public int hashCode(){
        return Objects.hash(NullType.class);
    }
    /**
     * Returns whether an object is equal to a NullType object.
     */
    @Override
    public boolean equals(Object obj){
        return obj instanceof NullType;
    }

    @Override
    public ITypes transformtoString(){
        return this;
    }
    /**
     * Returns a new TString object with this object's paremeter appended to the TString object's parameter.
     */
    @Override
    public ITypes addedByString(TString t) {
        return this;
    }

}
