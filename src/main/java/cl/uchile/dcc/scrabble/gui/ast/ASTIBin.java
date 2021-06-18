package cl.uchile.dcc.scrabble.gui.ast;

import cl.uchile.dcc.scrabble.gui.types.Binary;

public interface ASTIBin extends ASTLogical, ASTNumbers{

    @Override
    Binary getResult();
}
