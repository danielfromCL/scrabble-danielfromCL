package cl.uchile.dcc.scrabble.gui.ast.operations;

import cl.uchile.dcc.scrabble.gui.ast.IAST;
import cl.uchile.dcc.scrabble.gui.types.ITypes;
/**
 * Class that represents all nodes of the abstract syntax tree.
 */
public abstract class twoChildNode implements IAST {

    protected IAST leftchild;
    protected IAST rightchild;
    /**
     * Creates a Node in the AST that has two child Nodes.
     */
    public twoChildNode(IAST left, IAST right) {
        this.leftchild = left;
        this.rightchild = right;
    }

}

