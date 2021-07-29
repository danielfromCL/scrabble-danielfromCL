package cl.uchile.dcc.scrabble.gui.ast.operations;

import cl.uchile.dcc.scrabble.gui.ast.IAST;

public abstract class oneChildNode implements IAST {

    public IAST childNode;
    /**
     * Creates a Node in the AST that has one child Node.
     */
    public oneChildNode(IAST child){
        this.childNode = child;
    }
}
