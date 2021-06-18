package cl.uchile.dcc.scrabble.gui.ast;

import cl.uchile.dcc.scrabble.gui.types.Binary;

public class Or extends ASTLogicalAbs implements ASTIBin{


    public Or(ASTIBin b1, ASTIBool b2){
        super.nodes.add(b1);
        super.nodes.add(b2);
        setResult((Binary) b1.getResult().or(b2.getResult()));
    }
    public Or(ASTIBin b1, ASTIBin b2){
        super.nodes.add(b1);
        super.nodes.add(b2);
        setResult((Binary) b1.getResult().or(b2.getResult()));
    }
    public Or(ASTIBool b1, ASTIBin b2){
        super.nodes.add(b1);
        super.nodes.add(b2);
        setResult((Binary) b1.getResult().or(b2.getResult()));
    }


}
