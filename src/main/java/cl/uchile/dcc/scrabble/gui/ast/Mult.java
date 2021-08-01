package cl.uchile.dcc.scrabble.gui.ast;

import cl.uchile.dcc.scrabble.gui.types.ITypes;

/**
 * Class that represents the multiplication operation in the AST.
 */
public class Mult extends twoChildNode {

    /**
     * Creates a Node in the AST that multiplies its first Node's result with its second Node's result as its result .
     */
    public Mult(IAST n1, IAST n2){
        super(n1,n2);
    }

    /**
     * Returns the result of this node.
     * Multiplies the result of both child nodes;
     */
    @Override
    public ITypes getResult() {
        return leftchild.getResult().mult(rightchild.getResult());
    }
}
