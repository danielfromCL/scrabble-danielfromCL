package cl.uchile.dcc.scrabble.gui.ast;

import cl.uchile.dcc.scrabble.gui.*;

import java.util.*;

public class AST implements IAST{

    protected List<IAST> nodes = new ArrayList<IAST>();
    protected IAST result;
    public IAST getResult() {
        return this.result;
    }

    void add(AST a){
        nodes.add(a);
    }
    void remove(AST a){
        nodes.remove(a);
    }


    @Override
    public IAST toTString() {
        return this.getResult().transformtoString();
    }


}

