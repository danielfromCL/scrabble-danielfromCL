package cl.uchile.dcc.scrabble.gui.ast;

public class ToInt extends AST{
    public IAST t1;
    public ToInt(IAST t1){
        this.t1=t1;
        setResult(t1.getResult().transformtoInt());
    }
}
