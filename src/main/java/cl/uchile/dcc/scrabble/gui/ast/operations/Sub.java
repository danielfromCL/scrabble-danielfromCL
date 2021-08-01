package cl.uchile.dcc.scrabble.gui.ast.operations;

import cl.uchile.dcc.scrabble.gui.ast.IAST;
import cl.uchile.dcc.scrabble.gui.types.ITypes;

/**
 * Class that represents the subtraction operation in the AST.
 */
public class Sub extends twoChildNode {

    /**
     * Creates a Node in the AST that subtracts its second Node's result from its first Node's result as its result .
     */
    public Sub(IAST n1, IAST n2){
        super(n1,n2);
    }

    /**
     * Returns the result of this node.
     * Subtracts the result of the second child Node from the first child Node's result;
     */
    @Override
    public ITypes getResult() {
        return leftchild.getResult().sub(rightchild.getResult());
    }
}
