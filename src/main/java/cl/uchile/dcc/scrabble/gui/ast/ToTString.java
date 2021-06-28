package cl.uchile.dcc.scrabble.gui.ast;

public class ToTString extends AST{
    public IAST t1;
    public ToTString(IAST t1){
        this.t1=t1;
        setResult(t1.getResult().transformtoString());
    }
}
