package cl.uchile.dcc.scrabble.gui.ast;

public class Mult extends AST {

    public IAST n1;
    public IAST n2;
    public Mult(IAST n1, IAST n2){
        this.n1 = n1;
        this.n2 = n2;
        setResult(n1.getResult().mult(n2.getResult()));
    }

}
