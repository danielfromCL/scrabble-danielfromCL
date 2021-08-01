package cl.uchile.dcc.scrabble.gui.ast.operations;

import cl.uchile.dcc.scrabble.gui.ast.IAST;
import cl.uchile.dcc.scrabble.gui.types.ITypes;

/**
 * Class that represents the negation operation in the AST.
 */
public class Neg extends oneChildNode{

    /**
     * Creates a Node in the AST that transforms its parameter's result to it's negation as its result.
     */
    public Neg(IAST t1){
        super(t1);
    }

    /**
     * Returns the result of this node.
     * Negates the result of it's child node;
     */
    @Override
    public ITypes getResult() {
        return childNode.getResult().neg();
    }
}
