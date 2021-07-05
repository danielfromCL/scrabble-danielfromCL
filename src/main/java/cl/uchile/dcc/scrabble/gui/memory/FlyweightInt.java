package cl.uchile.dcc.scrabble.gui.memory;

import cl.uchile.dcc.scrabble.gui.types.Int;

import java.util.HashMap;

public class FlyweightInt {

    private static FlyweightInt FInt;
    private HashMap<Integer, Int> Hmap;

    private FlyweightInt(){}

    public static FlyweightInt getFInt(){
        if(FInt == null){
            FInt = new FlyweightInt();
        }
        return FInt;
    }

    public HashMap<Integer, Int> getMap(){
        return Hmap;
    }

    public Int createInt(Integer b){
        Int bi = Hmap.get(b);
        if(bi == null){
            bi = new Int(b);
            Hmap.put(b, bi);
        }
        return bi;
    }
}
