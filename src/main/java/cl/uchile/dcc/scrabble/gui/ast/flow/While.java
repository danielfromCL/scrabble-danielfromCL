package cl.uchile.dcc.scrabble.gui.ast.flow;

import cl.uchile.dcc.scrabble.gui.ast.IAST;
import cl.uchile.dcc.scrabble.gui.memory.FlyweightNull;
import cl.uchile.dcc.scrabble.gui.types.ITypes;
import cl.uchile.dcc.scrabble.gui.types.NullType;

/**
 * Class that represents the While operator.
 * It's represented as a node on the AST.
 */
public class While implements IAST {

    private IAST whileTrue;
    private int cond;
    private int other;
    private int which = -1;
    /**
     * Creates a node in the AST that evaluates it's IAST parameter while it's condition parameter is true.
     */
    public While(int cond, IAST whileTrue) {
        this.cond = cond;
        this.whileTrue = whileTrue;
    }

    /**
     * Returns the ITypes object that is the result of this While node.
     */
    @Override
    public ITypes getResult() {
        if (which == -1) {
            return FlyweightNull.getFNull().createNull();
        } else {
            ITypes a = FlyweightNull.getFNull().createNull();
            while (cond != other) {
                if(which == 0){
                    other--;
                }
                else if(which == 1){
                    other++;
                }
                a = whileTrue.getResult();
            }
            return a.getResult();
        }
    }

    public void greaterThan(int j){
        this.other = j;
        this.which = 0;
    }

    public void lesserThan(int j){
        this.other = j;
        this.which = 1;
    }

}
