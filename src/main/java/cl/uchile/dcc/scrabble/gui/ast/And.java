package cl.uchile.dcc.scrabble.gui.ast;

import cl.uchile.dcc.scrabble.gui.ILogical;

import java.util.ArrayList;
import java.util.List;

public class And extends ASTLogical{

    private ASTLogical result;
    public And(List<ASTLogical> args){
        for(int i =0; i<args.size();i++){
            super.nodes.add(args.get(i));
        }
        for(int i =0; i<args.size();i=i+2){
            setResult(super.nodes.get(i).getResult().And(super.nodes.get(i+1).getResult());
        }
    }
}
