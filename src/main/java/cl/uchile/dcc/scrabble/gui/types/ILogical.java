package cl.uchile.dcc.scrabble.gui.types;
/**
 * Interface that declares all the common methods between the Bool class and the Binary class.
 */
public interface ILogical extends ITypes {
    /**
     * Returns a new ILogical object with its negated value.
     */
    ILogical neg();
    /**
     * Operates the logical "and" between an ILogical object's parameter and another ILogical object's parameter.
     */
    ILogical and(ILogical b);
    /**
     * Operates the logical "or" between an ILogical object's parameter and another ILogical object's parameter.
     */
    ILogical or(ILogical b);
    /**
     * Operates the logical operator "and" between and ILogical object and a Binary object.
     */
    ILogical andwithBinary(Binary b);
    /**
     * Operates the logical operator "and" between and ILogical object and a Bool object.
     */
    ILogical andwithBool(Bool b);
    /**
     * Operates the logical operator "or" between and ILogical object and a Binary object.
     */
    ILogical orwithBinary(Binary b);
    /**
     * Operates the logical operator "and" between and ILogical object and a Bool object.
     */
    ILogical orwithBool(Bool b);


}
