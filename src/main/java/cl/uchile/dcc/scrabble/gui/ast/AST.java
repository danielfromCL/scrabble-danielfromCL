package cl.uchile.dcc.scrabble.gui.ast;

import cl.uchile.dcc.scrabble.gui.types.ITypes;
/**
 * Class that represents all nodes of the abstract syntax tree.
 */
public abstract class AST implements IAST{

    protected ITypes result;

    /**
     * Sets the result of this node to be the ITypes object received.
     */
    void setResult(ITypes result){
        this.result= result;
    }

    /**
     * Gets the result stored in this node.
     */
    @Override
    public ITypes getResult() {
        return this.result;
    }

}

