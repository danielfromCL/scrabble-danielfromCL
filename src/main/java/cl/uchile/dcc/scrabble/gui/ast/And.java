package cl.uchile.dcc.scrabble.gui.ast;

import cl.uchile.dcc.scrabble.gui.ILogical;

import java.util.ArrayList;
import java.util.List;

public class And extends ASTLogicalAbs{

    public And(List<ASTLogical> args){
        for(int i =0; i<args.size();i++){
            super.nodes.add(args.get(i));
        }
        for(int i =0; i<args.size();i=i+2){
            super.setResult(super.nodes.get(i).getResult().and(super.nodes.get(i+1).getResult()));
        }
    }

}
