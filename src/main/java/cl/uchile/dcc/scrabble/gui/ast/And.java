package cl.uchile.dcc.scrabble.gui.ast;

import cl.uchile.dcc.scrabble.gui.types.Binary;

public class And extends AST{

    public IAST b1;
    public IAST b2;
    public And(IAST b1, IAST b2){
        this.b1 = b1;
        this.b2 = b2;
        setResult(b1.getResult().and(b2.getResult()));
    }

}