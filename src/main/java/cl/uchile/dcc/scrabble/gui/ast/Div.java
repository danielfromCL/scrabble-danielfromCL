package cl.uchile.dcc.scrabble.gui.ast;

public class Div extends ASTNumbersAbs {

    public Div(ASTNumbers n1, ASTNumbers n2){
        super.nodes.add(n1);
        super.nodes.add(n2);
        setResult(n1.getResult().Div(n2.getResult()));
    }
}
