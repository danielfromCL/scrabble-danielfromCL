package cl.uchile.dcc.scrabble.gui.types;


import cl.uchile.dcc.scrabble.gui.memory.FlyweightNull;
import cl.uchile.dcc.scrabble.gui.memory.FlyweightTString;

/**
 * Class that represents every type for Scrabble
 */
public abstract class Types implements ITypes{
    /**
     * Since any subclass can be transformed to TString, the default for every subclass is to use its toString method and create an object of the TString class.
     */
    @Override
    public ITypes transformtoString(){
        return FlyweightTString.getFTString().createTString(this.toString());
    }
    /**
     * Returns an TString object with this object's paremeter appended to the TString object's parameter.
     */
    @Override
    public ITypes addedByString(TString t) {
        return FlyweightTString.getFTString().createTString(t.toString()+this.toString());
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
        return FlyweightNull.getFNull().createNull();
    }

    /**
     * Transforms an object to Int.
     * As default returns a NullType object;
     */
    @Override
    public ITypes transformtoInt() {
        return FlyweightNull.getFNull().createNull();
    }

    /**
     * Transforms an object to Float.
     * As default returns a NullType object;
     */
    @Override
    public ITypes transformtoFloat() {
        return FlyweightNull.getFNull().createNull();
    }

    /**
     * Transforms an object to Bool;
     * As default returns a NullType object;
     */
    @Override
    public ITypes transformtoBool() {
        return FlyweightNull.getFNull().createNull();
    }

    /**
     * Returns an ITypes object with the sum between both ITypes object's paremeters.
     * As default returns a NullType object;
     */
    @Override
    public ITypes sum(ITypes n) {
        return FlyweightNull.getFNull().createNull();
    }

    /**
     * Returns an ITypes object with its negated value.
     * As default returns a NullType object;
     */
    @Override
    public ITypes neg() {
        return FlyweightNull.getFNull().createNull();
    }

    /**
     * Returns an ITypes object with the subtraction between both ITypes object's paremeters.
     * As default returns a NullType object;
     */
    @Override
    public ITypes sub(ITypes n) {
        return FlyweightNull.getFNull().createNull();
    }

    /**
     * Returns an ITypes object with the multiplication between both ITypes object's paremeters.
     * As default returns a NullType object;
     */
    @Override
    public ITypes mult(ITypes n) {
        return FlyweightNull.getFNull().createNull();
    }

    /**
     * Returns an ITypes object with the division between both ITypes object's paremeters.
     * As default returns a NullType object;
     */
    @Override
    public ITypes div(ITypes n) {
        return FlyweightNull.getFNull().createNull();
    }

    /**
     * Returns an ITypes object with the sum between an ITypes object's parameter and a Binary object's parameter.
     * As default returns a NullType object;
     */
    @Override
    public ITypes addingABinary(Binary b) {
        return FlyweightNull.getFNull().createNull();
    }

    /**
     * Returns an ITypes object with the subtraction between an ITypes object's parameter and a Binary object's parameter.
     * As default returns a NullType object;
     */
    @Override
    public ITypes subtractingABinary(Binary b) {
        return FlyweightNull.getFNull().createNull();
    }

    /**
     * Returns an ITypes object with the multiplication between an ITypes object's parameter and a Binary object's parameter.
     * As default returns a NullType object;
     */
    @Override
    public ITypes multiplyingABinary(Binary b) {
        return FlyweightNull.getFNull().createNull();
    }

    /**
     * Returns an ITypes object with the division between an ITypes object's parameter and a Binary object's parameter.
     * As default returns a NullType object;
     */
    @Override
    public ITypes dividingABinary(Binary b) {
        return FlyweightNull.getFNull().createNull();
    }

    /**
     * Returns an ITypes object with the sum between an ITypes object and a Float object.
     * As default returns a NullType object;
     */
    @Override
    public ITypes addingAFloat(Float f) {
        return FlyweightNull.getFNull().createNull();
    }

    /**
     * Returns an ITypes object with the sum between an ITypes object's parameter and an Int object's parameter.
     * As default returns a NullType object;
     */
    @Override
    public ITypes addingAnInt(Int i) {
        return FlyweightNull.getFNull().createNull();
    }

    /**
     * Returns an ITypes object with the subtraction between a Float object's parameter and an ITypes object's parameter.
     * As default returns a NullType object;
     */
    @Override
    public ITypes subtractingAFloat(Float f) {
        return FlyweightNull.getFNull().createNull();
    }

    /**
     * Returns an ITypes object with the subtraction between an Int object's parameter and an ITypes object's parameter.
     * As default returns a NullType object;
     */
    @Override
    public ITypes subtractingAnInt(Int i) {
        return FlyweightNull.getFNull().createNull();
    }

    /**
     * Returns an ITypes object with the multiplication between an ITypes object's parameter and a Float object's parameter.
     * As default returns a NullType object;
     */
    @Override
    public ITypes multiplyingAFloat(Float f) {
        return FlyweightNull.getFNull().createNull();
    }

    /**
     * Returns an ITypes object with the multiplication between an ITypes object's parameter and an Int object's parameter.
     * As default returns a NullType object;
     */
    @Override
    public ITypes multiplyingAnInt(Int i) {
        return FlyweightNull.getFNull().createNull();
    }

    /**
     * Returns an ITypes object with the division between a Float object's parameter and an ITypes object's parameter.
     * As default returns a NullType object;
     */
    @Override
    public ITypes dividingAFloat(Float f) {
        return FlyweightNull.getFNull().createNull();
    }

    /**
     * Returns an ITypes object with the division between an Int object's parameter and an ITypes object's parameter.
     * As default returns a NullType object;
     */
    @Override
    public ITypes dividingAnInt(Int i) {
        return FlyweightNull.getFNull().createNull();
    }

    /**
     * Operates the logical "and" between an ITypes object's parameter and another ITypes object's parameter.
     * As default returns a NullType object;
     */
    @Override
    public ITypes and(ITypes b) {
        return FlyweightNull.getFNull().createNull();
    }

    /**
     * Operates the logical "or" between an ITypes object's parameter and another ITypes object's parameter.
     * As default returns a NullType object;
     */
    @Override
    public ITypes or(ITypes b) {
        return FlyweightNull.getFNull().createNull();
    }

    /**
     * Operates the logical operator "and" between and ITypes object and a Binary object.
     * As default returns a NullType object;
     */
    @Override
    public ITypes andwithBinary(Binary b) {
        return FlyweightNull.getFNull().createNull();
    }

    /**
     * Operates the logical operator "and" between and ITypes object and a Bool object.
     * As default returns a NullType object;
     */
    @Override
    public ITypes andwithBool(Bool b) {
        return FlyweightNull.getFNull().createNull();
    }

    /**
     * Operates the logical operator "or" between and ITypes object and a Binary object.
     * As default returns a NullType object;
     */
    @Override
    public ITypes orwithBinary(Binary b) {
        return FlyweightNull.getFNull().createNull();
    }

    /**
     * Operates the logical operator "and" between and ITypes object and a Bool object.
     * As default returns a NullType object;
     */
    @Override
    public ITypes orwithBool(Bool b) {
        return FlyweightNull.getFNull().createNull();
    }
}



