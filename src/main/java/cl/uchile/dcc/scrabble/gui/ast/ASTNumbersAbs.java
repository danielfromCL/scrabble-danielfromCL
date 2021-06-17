package cl.uchile.dcc.scrabble.gui.ast;

import cl.uchile.dcc.scrabble.gui.INumbers;

import java.util.ArrayList;
import java.util.List;

public abstract class ASTNumbersAbs implements ASTNumbers {

    public INumbers result;
    public List<ASTNumbers> nodes = new ArrayList<ASTNumbers>();
    @Override
    public INumbers getResult() {
        return this.result;
    }
    void setResult(INumbers result){
        this.result= result;
    }
}
