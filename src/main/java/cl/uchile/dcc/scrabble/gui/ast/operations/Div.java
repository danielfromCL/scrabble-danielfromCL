package cl.uchile.dcc.scrabble.gui.ast.operations;

import cl.uchile.dcc.scrabble.gui.ast.IAST;
import cl.uchile.dcc.scrabble.gui.types.ITypes;

/**
 * Class that represents the division operation in the AST.
 */
public class Div extends twoChildNode {

    /**
     * Creates a Node in the AST that divides its first Node's result with its second Node's result as its result .
     */
    public Div(IAST n1, IAST n2){
        super(n1,n2);
    }

    /**
     * Returns the result of this node.
     * Divides the result of the first child Node by the second child Node's result;
     */
    @Override
    public ITypes getResult() {
        return leftchild.getResult().div(rightchild.getResult());
    }
}
