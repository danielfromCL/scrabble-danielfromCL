package cl.uchile.dcc.scrabble.gui.types;


/**
 * Class that represents every type for Scrabble
 */
public abstract class Types implements ITypes{
    /**
     * Since any subclass can be transformed to TString, the default for every subclass is to use its toString method and create a new object of the TString class.
     */
    @Override
    public TString transformtoString(){
        return new TString(this.toString());
    }
    /**
     * Returns a new TString object with this object's paremeter appended to the TString object's parameter.
     */
    @Override
    public TString addedByString(TString t) {
        return new TString(t.toString()+this.toString());
    }


}



