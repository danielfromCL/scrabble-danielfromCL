package cl.uchile.dcc.scrabble.gui.ast.flow;

import cl.uchile.dcc.scrabble.gui.ast.IAST;
import cl.uchile.dcc.scrabble.gui.types.ITypes;
import cl.uchile.dcc.scrabble.gui.visitor.IVisitor;
import cl.uchile.dcc.scrabble.gui.visitor.Visitor;

/**
 * Class that represents the If operator.
 * It's represented as a node on the AST.
 */
public class If implements IAST {

    private boolean cond;
    private IAST ifFalse, ifTrue;
    private IVisitor visitor = new Visitor();
    /**
     * Creates a node in the AST that checks a condition. If the given condition is False it evaluates it's left child Node (ifFalse parameter), and evaluates it's right child Node (ifTrue parameter) otherwise.
     */
    public If(boolean cond, IAST ifFalse, IAST ifTrue) {
        this.cond = cond;
        this.ifFalse = ifFalse;
        this.ifTrue = ifTrue;
    }

    /**
     * Returns the ITypes object that is the result of this If node.
     * Accepts it's visitor and lets it handle the operation of the node.
     */
    @Override
    public ITypes getResult() {
        return accept(visitor);
    }

    public boolean isCond() {
        return cond;
    }

    public IAST getIfFalse() {
        return ifFalse;
    }

    public IAST getIfTrue() {
        return ifTrue;
    }

    /**
     * Accepts a Visitor object and let's it operate over this object.
     */
    public ITypes accept(IVisitor v){
        return v.visitIf(this);
    }
}
