package cl.uchile.dcc.scrabble.gui.ast;

public class ToBinary extends AST {
    public IAST t1;
    public ToBinary(IAST t1){
        this.t1=t1;
        setResult(t1.getResult().transformtoBinary());
    }
}
