package cl.uchile.dcc.scrabble.gui.ast;

import cl.uchile.dcc.scrabble.gui.ILogical;
import cl.uchile.dcc.scrabble.gui.INumbers;
import cl.uchile.dcc.scrabble.gui.ITypes;
import cl.uchile.dcc.scrabble.gui.TString;

import java.util.ArrayList;
import java.util.List;

public class Add extends ASTNumbersAbs {
    //si se puede hacer solo con 2 nodos hijos max entonces puedo reescibir las listas en variables y trabajar sobre ellas sin preocuparme del listas.
    public List<ASTNumbers> nodes = new ArrayList<ASTNumbers>();
    public Add(List<ASTNumbers> args){
        for(int i =0; i<args.size();i++){
            this.nodes.add(args.get(i));
        }
        for(int i =0; i<args.size();i=i+2){
            setResult(this.nodes.get(i).getResult().Add(this.nodes.get(i+1).getResult()));
        }
    }

}
