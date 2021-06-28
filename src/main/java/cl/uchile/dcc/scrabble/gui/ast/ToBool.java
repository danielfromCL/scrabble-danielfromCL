package cl.uchile.dcc.scrabble.gui.ast;

public class ToBool extends AST{
    public IAST t1;
    public ToBool(IAST t1){
        this.t1=t1;
        setResult(t1.getResult().transformtoBool());
    }
}
