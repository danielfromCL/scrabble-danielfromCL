package cl.uchile.dcc.scrabble.gui.ast.flow;

import cl.uchile.dcc.scrabble.gui.ast.IAST;
import cl.uchile.dcc.scrabble.gui.memory.FlyweightNull;
import cl.uchile.dcc.scrabble.gui.types.ITypes;
import cl.uchile.dcc.scrabble.gui.types.NullType;
import cl.uchile.dcc.scrabble.gui.visitor.IVisitor;
import cl.uchile.dcc.scrabble.gui.visitor.Visitor;

/**
 * Class that represents the While operator.
 * It's represented as a node on the AST.
 */
public class While implements IAST {

    private IAST whileTrue;
    private int cond;
    private int other;
    private int which = -1;
    private IVisitor visitor = new Visitor();
    /**
     * Creates a node in the AST that evaluates it's IAST parameter while it's condition parameter is met.
     */
    public While(int cond, IAST whileTrue) {
        this.cond = cond;
        this.whileTrue = whileTrue;
    }

    /**
     * Returns the ITypes object that is the result of this While node.
     * Accepts it's visitor and lets it handle the operation of the node.
     */
    @Override
    public ITypes getResult() {
        return accept(visitor);
    }

    /**
     * Sets this object with a greater than a number as it's condition and returns itself.
     * This indicates that while this object's condition number is greater than the number provided, it's cycle will go on.
     */
    public While greaterThan(int j){
        this.other = j;
        this.which = 0;
        return this;
    }

    /**
     * Sets this object with a lesser than a number as it's condition and returns itself.
     * This indicates that while this object's condition number is lesser than the number provided, it's cycle will go on.
     */
    public While lesserThan(int j){
        this.other = j;
        this.which = 1;
        return this;
    }

    public IAST getWhileTrue() {
        return whileTrue;
    }

    public int getCond() {
        return cond;
    }

    public int getOther() {
        return other;
    }

    public int getWhich() {
        return which;
    }

    /**
     * Accepts a Visitor object and let's it operate over this object.
     */
    public ITypes accept(IVisitor v){
        return v.visitWhile(this);
    }
}
