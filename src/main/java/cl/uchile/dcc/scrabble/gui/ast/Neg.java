package cl.uchile.dcc.scrabble.gui.ast;

public class Neg extends AST{

    public IAST t1;
    public Neg(IAST t1){
        this.t1=t1;
        setResult(t1.getResult().neg());
    }
}
