package cl.uchile.dcc.scrabble.gui.ast;

import cl.uchile.dcc.scrabble.gui.types.ITypes;

/**
 * Class that represents the sum operation in the AST.
 */
public class Add extends twoChildNode {

    /**
     * Creates a Node in the AST that adds its first Node's result with its second Node's result as its result .
     */
    public Add(IAST n1, IAST n2) {
        super(n1,n2);
    }

    /**
     * Returns the result of this node.
     * Sums the result of both child nodes;
     */
    @Override
    public ITypes getResult() {
        return leftchild.getResult().sum(rightchild.getResult());
    }

}
