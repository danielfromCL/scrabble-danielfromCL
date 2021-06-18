package cl.uchile.dcc.scrabble.gui.ast;

import cl.uchile.dcc.scrabble.gui.types.TString;

import java.util.ArrayList;
import java.util.List;

public class AddS implements ASTString {
    public TString result;
    public List<IAST> nodes = new ArrayList<IAST>();
    public AddS(ASTString s, IAST a){
        this.nodes.add(s);
        this.nodes.add(a);
        setResult(s.getResult().sum(a.getResult()));
    }

    @Override
    public TString getResult() {
        return this.result;
    }
    void setResult(TString result){
        this.result= result;
    }
}
