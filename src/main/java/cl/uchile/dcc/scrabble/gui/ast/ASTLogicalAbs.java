package cl.uchile.dcc.scrabble.gui.ast;

import cl.uchile.dcc.scrabble.gui.types.Binary;
import cl.uchile.dcc.scrabble.gui.types.ILogical;

import java.util.ArrayList;
import java.util.List;

public abstract class ASTLogicalAbs implements ASTLogical {

    public Binary result;
    public List<ASTLogical> nodes = new ArrayList<ASTLogical>();
    @Override
    public Binary getResult() {
        return this.result;
    }
    void setResult(Binary result){
        this.result= result;
    }

    public void Neg(){
        setResult(result.neg());
    }
}
