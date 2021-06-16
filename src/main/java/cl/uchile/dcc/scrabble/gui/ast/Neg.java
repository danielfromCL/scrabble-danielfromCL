package cl.uchile.dcc.scrabble.gui.ast;

import cl.uchile.dcc.scrabble.gui.ILogical;

import java.util.ArrayList;
import java.util.List;

public class Neg extends ASTLogical{

    private ASTLogical result;
    public Neg(List<ASTLogical> args){
        for(int i =0; i<args.size();i++){
            super.nodes.add(args.get(i));
        }
        setResult(super.nodes.get(0).getResult().Neg());
        }
    }

}
