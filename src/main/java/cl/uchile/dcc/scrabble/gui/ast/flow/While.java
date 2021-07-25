package cl.uchile.dcc.scrabble.gui.ast.flow;

import cl.uchile.dcc.scrabble.gui.ast.IAST;
import cl.uchile.dcc.scrabble.gui.types.ITypes;

/**
 * Class that represents the While operator.
 * It's represented as a node on the AST.
 */
public class While implements IAST {

    private IAST whileTrue;
    private boolean cond;

    /**
     * Creates a node in the AST that evaluates it's IAST parameter while it's condition parameter is true.
     */
    public While(boolean cond, IAST whileTrue) {
        this.cond = cond;
        this.whileTrue = whileTrue;
    }

    /**
     * Returns the ITypes object that is the result of this While node.
     */
    @Override
    public ITypes getResult() {
        while(cond){
            return whileTrue.getResult();
        }
        return whileTrue.getResult();
    }
}
