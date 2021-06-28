package cl.uchile.dcc.scrabble.gui.types;

public class NullType extends Types{

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
