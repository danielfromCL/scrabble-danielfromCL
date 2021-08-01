package cl.uchile.dcc.scrabble.gui.ast.operations;

import cl.uchile.dcc.scrabble.gui.ast.IAST;
import cl.uchile.dcc.scrabble.gui.types.ITypes;

/**
 * Class that represents the transformation to Float operation in the AST.
 */
public class ToFloat extends oneChildNode{
    /**
     * Creates a Node in the AST that transforms its parameter's result to Float as its result.
     */
    public ToFloat(IAST t1){
        super(t1);
    }

    /**
     * Returns the result of this node.
     * Transforms the result of it's child node to Float;
     */
    @Override
    public ITypes getResult() {
        return childNode.getResult().transformtoFloat();
    }
}
