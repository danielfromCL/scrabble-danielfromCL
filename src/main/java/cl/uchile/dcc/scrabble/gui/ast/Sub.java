package cl.uchile.dcc.scrabble.gui.ast;

import java.util.List;

public class Sub extends ASTNumbersAbs {


    public Sub(ASTNumbers n1, ASTNumbers n2){
        super.nodes.add(n1);
        super.nodes.add(n2);
        setResult(n1.getResult().Sub(n2.getResult()));
    }
}
