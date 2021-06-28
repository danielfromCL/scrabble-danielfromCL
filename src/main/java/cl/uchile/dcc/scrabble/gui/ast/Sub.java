package cl.uchile.dcc.scrabble.gui.ast;

import java.util.List;

public class Sub extends AST {

    public IAST n1;
    public IAST n2;
    public Sub(IAST n1, IAST n2){
        this.n1 = n1;
        this.n2 = n2;
        setResult(n1.getResult().sub(n2.getResult()));
    }
}
