package cl.uchile.dcc.scrabble.gui.ast;

import java.util.List;

public class Sub extends ASTNumbersAbs {


    public Sub(List<ASTLogical> args){
        for(int i =0; i<args.size();i++){
            super.nodes.add(args.get(i));
        }
        for(int i =0; i<args.size();i=i+2){
            setResult(super.nodes.get(i).getResult().Sub(super.nodes.get(i+1).getResult()));
        }
    }

}
