package cl.uchile.dcc.scrabble.gui.ast;

import cl.uchile.dcc.scrabble.gui.types.Bool;
import cl.uchile.dcc.scrabble.gui.types.ILogical;

import java.util.ArrayList;
import java.util.List;

public class AndBool extends ASTBool{


    public AndBool(ASTIBool b1, ASTIBool b2){
        super.nodes.add(b1);
        super.nodes.add(b2);
        setResult((Bool) b1.getResult().and(b2.getResult()));
    }



}
