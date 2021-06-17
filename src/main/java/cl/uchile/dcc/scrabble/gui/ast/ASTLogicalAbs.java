package cl.uchile.dcc.scrabble.gui.ast;

import cl.uchile.dcc.scrabble.gui.ILogical;

import java.util.ArrayList;
import java.util.List;

public abstract class ASTLogicalAbs implements ASTLogical {

    public ILogical result;
    public List<ASTLogical> nodes = new ArrayList<ASTLogical>();
    @Override
    public ILogical getResult() {
        return this.result;
    }
    void setResult(ILogical result){
        this.result= result;
    }

    public void Neg(){
        setResult(result.neg());
    }
}
