package cl.uchile.dcc.scrabble.gui.ast;

import cl.uchile.dcc.scrabble.gui.types.Binary;
import cl.uchile.dcc.scrabble.gui.types.ILogical;

public class And extends ASTLogicalAbs implements ASTIBin{


    public And(ASTIBin b1, ASTIBool b2){
        super.nodes.add(b1);
        super.nodes.add(b2);
        setResult((Binary) b1.getResult().and(b2.getResult()));
    }
    public And(ASTIBin b1, ASTIBin b2){
        super.nodes.add(b1);
        super.nodes.add(b2);
        setResult((Binary) b1.getResult().and(b2.getResult()));
    }
    public And(ASTIBool b1, ASTIBin b2){
        super.nodes.add(b1);
        super.nodes.add(b2);
        setResult((Binary) b1.getResult().and(b2.getResult()));
    }
    @Override
    public Binary getResult() {
        return this.result;
    }

}