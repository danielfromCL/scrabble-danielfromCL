package cl.uchile.dcc.scrabble.gui.ast;

import cl.uchile.dcc.scrabble.gui.types.ITypes;

/**
 * Class that represents the transformation to Int operation in the AST.
 */
public class ToInt extends oneChildNode{
    /**
     * Creates a Node in the AST that transforms its parameter's result to Int as its result.
     */
    public ToInt(IAST t1){
        super(t1);
    }

    /**
     * Returns the result of this node.
     * Transforms the result of it's child node to Int;
     */
    @Override
    public ITypes getResult() {
        return childNode.getResult().transformtoInt();
    }
}
