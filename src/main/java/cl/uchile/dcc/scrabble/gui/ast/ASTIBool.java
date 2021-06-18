package cl.uchile.dcc.scrabble.gui.ast;

import cl.uchile.dcc.scrabble.gui.types.Bool;

public interface ASTIBool extends ASTLogical{

    void toBool();
    @Override
    Bool getResult();
}
