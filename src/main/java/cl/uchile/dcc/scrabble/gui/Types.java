package cl.uchile.dcc.scrabble.gui;


/**
 * Class that represents every type for Scrabble
 */
public abstract class Types implements ITypes{

    public Types() {
    }

    /**
     * As default, every transformation to Bool is not permitted and returns null.
     */
    @Override
    public Bool transformtoBool(){
        System.out.println("Transformation not permitted, returning null");
        return null;
    }

    /**
     * Since any subclass can be transformed to TString, the default for every subclass is to use its toString method and create a new object of the TString class.
     */
    @Override
    public TString transformtoString(){
        return new TString(this.toString());
    }

    /**
     * As default, every transformation to Int is not permitted and returns null.
     */
    @Override
    public Int transformtoInt(){
        System.out.println("Transformation not permitted, returning null");
        return null;
    }

    /**
     * As default, every transformation to Binary is not permitted and returns null.
     */
    @Override
    public Binary transformtoBinary(){
        System.out.println("Transformation not permitted, returning null");
        return null;
    }

    /**
     * As default, every transformation to Float is not permitted and returns null.
     */
    @Override
    public Float transformtoFloat(){
        System.out.println("Transformation not permitted, returning null");
        return null;
    }


}
