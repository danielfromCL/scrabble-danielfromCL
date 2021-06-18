package cl.uchile.dcc.scrabble.gui.ast;

public class Mult extends ASTNumbersAbs {

    public Mult(ASTNumbers n1, ASTNumbers n2){
        super.nodes.add(n1);
        super.nodes.add(n2);
        setResult(n1.getResult().Mult(n2.getResult()));
    }

}
