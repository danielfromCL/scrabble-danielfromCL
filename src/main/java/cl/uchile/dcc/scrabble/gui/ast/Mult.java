package cl.uchile.dcc.scrabble.gui.ast;

import java.util.List;

public class Mult extends ASTNumbers {

    public Mult(List<ASTLogical> args){
        for(int i =0; i<args.size();i++){
            super.nodes.add(args.get(i));
        }
        for(int i =0; i<args.size();i=i+2){
            setResult(super.nodes.get(i).getResult().Mult(super.nodes.get(i+1).getResult()));
        }
    }
}
