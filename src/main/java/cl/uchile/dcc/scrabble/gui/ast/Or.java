package cl.uchile.dcc.scrabble.gui.ast;

import cl.uchile.dcc.scrabble.gui.types.ITypes;

/**
 * Class that represents the or logical operation in the AST.
 */
public class Or extends twoChildNode{

    /**
     * Creates a Node in the AST that operates the logical "or" between its first Node's result and its second Node's result as its result .
     */
    public Or(IAST b1, IAST b2){
        super(b1,b2);
    }


    /**
     * Returns the result of this node.
     * Operates the or logical operator between the result of both child nodes;
     */
    @Override
    public ITypes getResult() {
        return leftchild.getResult().or(rightchild.getResult());
    }
}
