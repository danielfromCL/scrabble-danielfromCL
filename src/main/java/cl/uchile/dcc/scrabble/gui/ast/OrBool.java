package cl.uchile.dcc.scrabble.gui.ast;

import cl.uchile.dcc.scrabble.gui.types.Bool;

import java.util.ArrayList;
import java.util.List;

public class OrBool extends ASTBool{

    public OrBool(ASTIBool b1, ASTIBool b2){
        super.nodes.add(b1);
        super.nodes.add(b2);
        setResult((Bool) b1.getResult().or(b2.getResult()));
    }

}
