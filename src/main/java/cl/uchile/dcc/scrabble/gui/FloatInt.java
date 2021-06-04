package cl.uchile.dcc.scrabble.gui;

public interface FloatInt extends INumbers{
    /**
     * Returns a new INumbers object with the sum between both INumbers object's paremeters.
     */
    INumbers sum(INumbers n);

    /**
     * Returns a new FloatInt object with its number multiplied by -1.
     */
    FloatInt neg();
    /**
     * Returns a new INumbers object with the subtraction between both INumbers object's paremeters.
     */
    INumbers sub(INumbers n);
    /**
     * Returns a new INumbers object with the multiplication between both INumbers object's paremeters.
     */
    INumbers mult(INumbers n);
    /**
     * Returns a new INumbers object with the division between both INumbers object's paremeters.
     */
    INumbers div(INumbers n);
}
