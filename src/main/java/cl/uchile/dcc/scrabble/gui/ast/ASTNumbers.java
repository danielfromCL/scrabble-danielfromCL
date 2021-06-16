package cl.uchile.dcc.scrabble.gui.ast;

public class ASTNumbers extends AST{

    protected ASTNumbers result;

    @Override
    public ASTNumbers getResult() {
        return this.result;
    }
    void setResult(ASTNumbers result){
        this.result= result;
    }
}
