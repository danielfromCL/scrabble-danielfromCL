package cl.uchile.dcc.scrabble.gui.ast;

import cl.uchile.dcc.scrabble.gui.types.ITypes;

public abstract class AST implements IAST{

    protected ITypes result;

    void setResult(ITypes result){
        this.result= result;
    }

    @Override
    public ITypes getResult() {
        return this.result;
    }

}

