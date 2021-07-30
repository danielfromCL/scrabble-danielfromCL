package cl.uchile.dcc.scrabble.gui.visitor;

import cl.uchile.dcc.scrabble.gui.ast.flow.If;
import cl.uchile.dcc.scrabble.gui.ast.flow.While;
import cl.uchile.dcc.scrabble.gui.memory.FlyweightNull;
import cl.uchile.dcc.scrabble.gui.types.ITypes;

/**
 * Visitor class that visits the If nodes and While nodes of an AST.
 */
public class Visitor implements IVisitor{


    /**
     * Returns the received While node's result.
     * This method receives a While node and operates it's while cycle.
     */
    public ITypes visitWhile(While a){
        if (a.getWhich() == -1) {
            return FlyweightNull.getFNull().createNull();
        } else {
            ITypes b = FlyweightNull.getFNull().createNull();
            int other = a.getOther();
            if(a.getWhich() == 0) {
                while (a.getCond() > other) {
                    other++;
                    b = a.getWhileTrue().getResult();
                }
            }
            else if(a.getWhich() == 1) {
                while (a.getCond() < other) {
                    other--;
                    b = a.getWhileTrue().getResult();
                }
            }
            return b.getResult();
        }
    }
    /**
     * Checks if the If node's condition is met and returns it's result accordingly.
     * This method receives an If node and if it's condition is met, returns it's true IAST's  result.
     * If it's not, returns it's false IAST's result.
     */
    public ITypes visitIf(If a){
        if(a.isCond()){
            return a.getIfTrue().getResult();
        }
        else{
            return a.getIfFalse().getResult();
        }
    }

}
