package cl.uchile.dcc.scrabble.gui.ast;

public class ToFloat extends AST{
    public IAST t1;
    public ToFloat(IAST t1){
        this.t1=t1;
        setResult(t1.getResult().transformtoFloat());
    }
}
