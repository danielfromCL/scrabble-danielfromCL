package cl.uchile.dcc.scrabble.gui.ast;

import cl.uchile.dcc.scrabble.gui.INumbers;
import cl.uchile.dcc.scrabble.gui.TString;

import java.util.ArrayList;
import java.util.List;

public class AddS implements ASTString {
    public TString result;
    public List<IAST> nodes = new ArrayList<IAST>();
    public AddS(ASTString s, IAST a){
        this.nodes.add(s);
        this.nodes.add(a);
        setResult(s.AddS(a));
    }
    public AddS(IAST a, ASTString s){
        this.nodes.add(a);
        this.nodes.add(s);
        setResult(s.AddS(a));
    }

    @Override
    public TString getResult() {
        return this.result;
    }
    void setResult(TString result){
        this.result= result;
    }
}
