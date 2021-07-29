package cl.uchile.dcc.scrabble.gui.ast;
import cl.uchile.dcc.scrabble.gui.types.ITypes;

/**
 * Interface that all nodes of the abstract syntax tree must implement.
 */
public interface IAST {

    /**
     * Returns the ITypes object stored in a node.
     */
    ITypes getResult();

}
