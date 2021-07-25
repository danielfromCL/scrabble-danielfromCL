package cl.uchile.dcc.scrabble.gui.ast.operations;


import cl.uchile.dcc.scrabble.gui.ast.IAST;
import cl.uchile.dcc.scrabble.gui.types.ITypes;

/**
 * Class that represents the and logical operation in the AST.
 */
public class And extends twoChildNode{

    /**
     * Creates a Node in the AST that operates the logical "and" between its first Node's result and its second Node's result as its result .
     */
    public And(IAST b1, IAST b2){
        super(b1,b2);
    }

    /**
     * Returns the result of this node.
     * Operates the and logical operator between the result of both child nodes;
     */
    @Override
    public ITypes getResult() {
        return leftchild.getResult().and(rightchild.getResult());
    }
}