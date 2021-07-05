package cl.uchile.dcc.scrabble.gui.memory;

import cl.uchile.dcc.scrabble.gui.types.Binary;
import cl.uchile.dcc.scrabble.gui.types.Binary;

import java.util.HashMap;

public class FlyweightBinary {

    private static FlyweightBinary FBinary;
    private HashMap<String, Binary> Hmap;

    private FlyweightBinary(){}

    public static FlyweightBinary getFBinary(){
        if(FBinary == null){
            FBinary = new FlyweightBinary();
        }
        return FBinary;
    }

    public HashMap<String, Binary> getMap(){
        return Hmap;
    }

    public Binary createBinary(String b){
        Binary bi = Hmap.get(b);
        if(bi == null){
            bi = new Binary(b);
            Hmap.put(b, bi);
        }
        return bi;
    }
}
