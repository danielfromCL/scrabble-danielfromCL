package cl.uchile.dcc.scrabble.gui.visitor;

import cl.uchile.dcc.scrabble.gui.ast.flow.If;
import cl.uchile.dcc.scrabble.gui.ast.flow.While;
import cl.uchile.dcc.scrabble.gui.types.ITypes;

/**
 * Interface that represents all visitors of this program.
 */
public interface IVisitor {

    /**
     * Operates the Visitor object on the If node.
     */
    ITypes visitIf(If a);

    /**
     * Operates the Visitor object on the While node.
     */
    ITypes visitWhile(While a);
}
