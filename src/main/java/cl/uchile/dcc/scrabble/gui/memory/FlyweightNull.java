package cl.uchile.dcc.scrabble.gui.memory;

import cl.uchile.dcc.scrabble.gui.types.NullType;


public class FlyweightNull {

    private static FlyweightNull FNull;
    private NullType Null;
    private FlyweightNull(){}

    public static FlyweightNull getFNull(){
        if(FNull == null){
            FNull = new FlyweightNull();
        }
        return FNull;
    }

    public NullType createNull(){
        if(Null == null){
            Null = new NullType();
        }
        return Null;
    }
}
