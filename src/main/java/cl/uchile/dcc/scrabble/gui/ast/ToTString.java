package cl.uchile.dcc.scrabble.gui.ast;

import cl.uchile.dcc.scrabble.gui.types.ITypes;

/**
 * Class that represents the transformation to TString operation in the AST.
 */
public class ToTString extends oneChildNode{
    /**
     * Creates a Node in the AST that transforms its parameter's result to TString as its result.
     */
    public ToTString(IAST t1){
        super(t1);
    }

    /**
     * Returns the result of this node.
     * Transforms the result of it's child node to TString;
     */
    @Override
    public ITypes getResult() {
        return childNode.getResult().transformtoString();
    }
}
