package cl.uchile.dcc.scrabble.gui.ast;

import cl.uchile.dcc.scrabble.gui.*;

import java.util.*;

public abstract class AST implements IAST{

    protected List<IAST> nodes = new ArrayList<IAST>();
    protected ITypes result;

    void add(AST a){
        nodes.add(a);
    }
    void remove(AST a){
        nodes.remove(a);
    }


    void setResult(ITypes result){
        this.result= result;
    }


    public void toTString() {
        setResult(this.getResult().transformtoString());
    }
}

