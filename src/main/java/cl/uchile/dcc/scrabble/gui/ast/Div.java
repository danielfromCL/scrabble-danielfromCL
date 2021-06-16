package cl.uchile.dcc.scrabble.gui.ast;

import java.util.List;

public class Div extends ASTNumbers {

    public Div(List<ASTLogical> args){
        for(int i =0; i<args.size();i++){
            super.nodes.add(args.get(i));
        }
        for(int i =0; i<args.size();i=i+2){
            setResult(super.nodes.get(i).getResult().Div(super.nodes.get(i+1).getResult()));
        }
    }
}
