package cl.uchile.dcc.scrabble.gui.types;


/**
 * Class that represents every type for Scrabble
 */
public abstract class Types implements ITypes{
    /**
     * Since any subclass can be transformed to TString, the default for every subclass is to use its toString method and create a new object of the TString class.
     */
    @Override
    public ITypes transformtoString(){
        return new TString(this.toString());
    }
    /**
     * Returns a new TString object with this object's paremeter appended to the TString object's parameter.
     */
    @Override
    public ITypes addedByString(TString t) {
        return new TString(t.toString()+this.toString());
    }

    /**
     * The object returns itself.
     */
    @Override
    public ITypes getResult(){
        return this;
    }
    /**
     * Transforms an object to Binary.
     * As default returns a NullType object;
     */
    @Override
    public ITypes transformtoBinary() {
        return new NullType();
    }

    /**
     * Transforms an object to Int.
     * As default returns a NullType object;
     */
    @Override
    public ITypes transformtoInt() {
        return new NullType();
    }

    /**
     * Transforms an object to Float.
     * As default returns a NullType object;
     */
    @Override
    public ITypes transformtoFloat() {
        return new NullType();
    }

    /**
     * Transforms an object to Bool;
     * As default returns a NullType object;
     */
    @Override
    public ITypes transformtoBool() {
        return new NullType();
    }

    /**
     * Returns a new ITypes object with the sum between both ITypes object's paremeters.
     * As default returns a NullType object;
     */
    @Override
    public ITypes sum(ITypes n) {
        return new NullType();
    }

    /**
     * Returns a new ITypes object with its negated value.
     * As default returns a NullType object;
     */
    @Override
    public ITypes neg() {
        return new NullType();
    }

    /**
     * Returns a new ITypes object with the subtraction between both ITypes object's paremeters.
     * As default returns a NullType object;
     */
    @Override
    public ITypes sub(ITypes n) {
        return new NullType();
    }

    /**
     * Returns a new ITypes object with the multiplication between both ITypes object's paremeters.
     * As default returns a NullType object;
     */
    @Override
    public ITypes mult(ITypes n) {
        return new NullType();
    }

    /**
     * Returns a new ITypes object with the division between both ITypes object's paremeters.
     * As default returns a NullType object;
     */
    @Override
    public ITypes div(ITypes n) {
        return new NullType();
    }

    /**
     * Returns a new ITypes object with the sum between an ITypes object's parameter and a Binary object's parameter.
     * As default returns a NullType object;
     */
    @Override
    public ITypes addingABinary(Binary b) {
        return new NullType();
    }

    /**
     * Returns a new ITypes object with the subtraction between an ITypes object's parameter and a Binary object's parameter.
     * As default returns a NullType object;
     */
    @Override
    public ITypes subtractingABinary(Binary b) {
        return new NullType();
    }

    /**
     * Returns a new ITypes object with the multiplication between an ITypes object's parameter and a Binary object's parameter.
     * As default returns a NullType object;
     */
    @Override
    public ITypes multiplyingABinary(Binary b) {
        return new NullType();
    }

    /**
     * Returns a new ITypes object with the division between an ITypes object's parameter and a Binary object's parameter.
     * As default returns a NullType object;
     */
    @Override
    public ITypes dividingABinary(Binary b) {
        return new NullType();
    }

    /**
     * Returns a new ITypes object with the sum between an ITypes object and a Float object.
     * As default returns a NullType object;
     */
    @Override
    public ITypes addingAFloat(Float f) {
        return new NullType();
    }

    /**
     * Returns a new ITypes object with the sum between an ITypes object's parameter and an Int object's parameter.
     * As default returns a NullType object;
     */
    @Override
    public ITypes addingAnInt(Int i) {
        return new NullType();
    }

    /**
     * Returns a new ITypes object with the subtraction between a Float object's parameter and an ITypes object's parameter.
     * As default returns a NullType object;
     */
    @Override
    public ITypes subtractingAFloat(Float f) {
        return new NullType();
    }

    /**
     * Returns a new ITypes object with the subtraction between an Int object's parameter and an ITypes object's parameter.
     * As default returns a NullType object;
     */
    @Override
    public ITypes subtractingAnInt(Int i) {
        return new NullType();
    }

    /**
     * Returns a new ITypes object with the multiplication between an ITypes object's parameter and a Float object's parameter.
     * As default returns a NullType object;
     */
    @Override
    public ITypes multiplyingAFloat(Float f) {
        return new NullType();
    }

    /**
     * Returns a new ITypes object with the multiplication between an ITypes object's parameter and an Int object's parameter.
     * As default returns a NullType object;
     */
    @Override
    public ITypes multiplyingAnInt(Int i) {
        return new NullType();
    }

    /**
     * Returns a new ITypes object with the division between a Float object's parameter and an ITypes object's parameter.
     * As default returns a NullType object;
     */
    @Override
    public ITypes dividingAFloat(Float f) {
        return new NullType();
    }

    /**
     * Returns a new ITypes object with the division between an Int object's parameter and an ITypes object's parameter.
     * As default returns a NullType object;
     */
    @Override
    public ITypes dividingAnInt(Int i) {
        return new NullType();
    }

    /**
     * Operates the logical "and" between an ITypes object's parameter and another ITypes object's parameter.
     * As default returns a NullType object;
     */
    @Override
    public ITypes and(ITypes b) {
        return new NullType();
    }

    /**
     * Operates the logical "or" between an ITypes object's parameter and another ITypes object's parameter.
     * As default returns a NullType object;
     */
    @Override
    public ITypes or(ITypes b) {
        return new NullType();
    }

    /**
     * Operates the logical operator "and" between and ITypes object and a Binary object.
     * As default returns a NullType object;
     */
    @Override
    public ITypes andwithBinary(Binary b) {
        return new NullType();
    }

    /**
     * Operates the logical operator "and" between and ITypes object and a Bool object.
     * As default returns a NullType object;
     */
    @Override
    public ITypes andwithBool(Bool b) {
        return new NullType();
    }

    /**
     * Operates the logical operator "or" between and ITypes object and a Binary object.
     * As default returns a NullType object;
     */
    @Override
    public ITypes orwithBinary(Binary b) {
        return new NullType();
    }

    /**
     * Operates the logical operator "and" between and ITypes object and a Bool object.
     * As default returns a NullType object;
     */
    @Override
    public ITypes orwithBool(Bool b) {
        return new NullType();
    }
}



