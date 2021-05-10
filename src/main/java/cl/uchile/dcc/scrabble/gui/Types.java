package cl.uchile.dcc.scrabble.gui;
import java.util.Objects;

public abstract class Types implements ITypes{

    public Types() {
    }

    @Override
    public Bool transformtoBool(){
        System.out.println("Transformation not permitted, returning null");
        return null;
    }
    @Override
    public TString transformtoString(){
        return new TString(this.toString());
    }
    @Override
    public Int transformtoInt(){
        System.out.println("Transformation not permitted, returning null");
        return null;
    }
    @Override
    public Binary transformtoBinary(){
        System.out.println("Transformation not permitted, returning null");
        return null;
    }
    @Override
    public Float transformtoFloat(){
        System.out.println("Transformation not permitted, returning null");
        return null;
    }


}
