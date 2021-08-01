package cl.uchile.dcc.scrabble.gui.ast;

import cl.uchile.dcc.scrabble.gui.types.ITypes;

/**
 * Class that represents the transformation to Binary operation in the AST.
 */
public class ToBinary extends oneChildNode{
    /**
     * Creates a Node in the AST that transforms its parameter's result to Binary as its result.
     */
    public ToBinary(IAST t1){
        super(t1);
    }

    /**
     * Returns the result of this node.
     * Transforms the result of it's child node to Binary;
     */
    @Override
    public ITypes getResult() {
        return childNode.getResult().transformtoBinary();
    }
}
