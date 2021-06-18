package cl.uchile.dcc.scrabble.gui.ast;

public class Add extends ASTNumbersAbs {

    public Add(ASTNumbers n1, ASTNumbers n2){
        super.nodes.add(n1);
        super.nodes.add(n2);
        setResult(n1.getResult().Add(n2.getResult()));
    }
//podria poner esto como varios constructores dependiendo si IntFloat o Binary :c
    //problema: no puedo diferenciar fuera de la recursion
}
