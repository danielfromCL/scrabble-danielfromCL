package cl.uchile.dcc.scrabble.gui.ast;

public class ASTLogical extends AST{

    protected ASTLogical result;
    @Override
    public ASTLogical getResult() {
        return this.result;
    }
    void setResult(ASTLogical result){
        this.result= result;
    }
}
