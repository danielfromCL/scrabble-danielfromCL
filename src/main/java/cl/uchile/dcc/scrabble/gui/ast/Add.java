package cl.uchile.dcc.scrabble.gui.ast;

/**
 * Class that represents the sum method in the AST.
 */
public class Add extends AST {

    public IAST n1;
    public IAST n2;
    public Add(IAST n1, IAST n2) {
        this.n1 = n1;
        this.n2 = n2;
        setResult(n1.getResult().sum(n2.getResult()));
    }
}
