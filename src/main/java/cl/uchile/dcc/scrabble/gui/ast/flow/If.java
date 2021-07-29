package cl.uchile.dcc.scrabble.gui.ast.flow;

import cl.uchile.dcc.scrabble.gui.ast.IAST;
import cl.uchile.dcc.scrabble.gui.types.ITypes;
/**
 * Class that represents the If operator.
 * It's represented as a node on the AST.
 */
public class If implements IAST {

    private boolean cond;
    private IAST ifFalse, ifTrue;
    /**
     * Creates a node in the AST that checks a condition. If the given condition is False it evaluates it's left child Node (ifFalse parameter), and evaluates it's right child Node (ifTrue parameter) otherwise.
     */
    public If(boolean cond, IAST ifFalse, IAST ifTrue) {
        this.cond = cond;
        this.ifFalse = ifFalse;
        this.ifTrue = ifTrue;
    }

    /**
     * Returns the ITypes obejct that is the result of this If node.
     */
    @Override
    public ITypes getResult() {
        if(cond){
            return ifTrue.getResult();
        }
        else{
            return ifFalse.getResult();
        }
    }
}
