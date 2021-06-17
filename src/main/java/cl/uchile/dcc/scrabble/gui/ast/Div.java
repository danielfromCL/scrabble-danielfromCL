package cl.uchile.dcc.scrabble.gui.ast;

import cl.uchile.dcc.scrabble.gui.INumbers;

import java.util.ArrayList;
import java.util.List;

public class Div extends ASTNumbersAbs {

    public Div(List<ASTNumbers> args){
        for(int i =0; i<args.size();i++){
            super.nodes.add(args.get(i));
        }
        for(int i =0; i<args.size();i=i+2){
            setResult(super.nodes.get(i).getResult().div(super.nodes.get(i+1).getResult()));
        }
    }
}
