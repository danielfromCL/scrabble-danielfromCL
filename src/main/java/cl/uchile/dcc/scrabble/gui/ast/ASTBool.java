package cl.uchile.dcc.scrabble.gui.ast;

import cl.uchile.dcc.scrabble.gui.types.Bool;

import java.util.ArrayList;
import java.util.List;

public abstract class ASTBool implements ASTIBool {
    public Bool result;
    public List<ASTIBool> nodes = new ArrayList<ASTIBool>();

    @Override
    public Bool getResult() {
        return this.result;
    }
    public void setResult(Bool b){
        this.result = b;
    }
    public void toBool(){
        setResult(this.result.transformtoBool());
    }
    public void Neg(){
        setResult(this.result.neg());
    }
}
