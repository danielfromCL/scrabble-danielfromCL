package cl.uchile.dcc.scrabble.gui;

public interface ILogical {

    /**
     * Operates the logical operator "and" between and ILogical object and a Binary object.
     */
    ILogical and(Binary b);
    /**
     * Operates the logical operator "and" between and ILogical object and a Bool object.
     */
    ILogical and(Bool b);

    /**
     * Operates the logical operator "or" between and ILogical object and a Binary object.
     */
    ILogical or(Binary b);
    /**
     * Operates the logical operator "and" between and ILogical object and a Bool object.
     */
    ILogical or(Bool b);

}
