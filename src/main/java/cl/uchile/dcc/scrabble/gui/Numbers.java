package cl.uchile.dcc.scrabble.gui;


/**
 * Abstract class that represents every possible number type in Types.
 */
public abstract class Numbers extends Types implements INumbers{

    public Numbers() {
    }

    /**
     * As default returns null
     */
    @Override
    public INumbers sum(INumbers n){
        return null;
    }

    /**
     * As default returns null
     */
    @Override
    public INumbers sub(INumbers n){
        return null;
    }

    /**
     * As default returns null
     */
    @Override
    public INumbers div(INumbers n){
        return null;
    }

    /**
     * As default returns null
     */
    @Override
    public INumbers mult(INumbers n){
        return null;
    }
}
