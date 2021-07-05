package cl.uchile.dcc.scrabble.gui.memory;

import cl.uchile.dcc.scrabble.gui.types.Float;

import java.util.HashMap;

public class FlyweightFloat {
    private static FlyweightFloat FFloat;
    private HashMap<Double, Float> Hmap;

    private FlyweightFloat(){}

    public static FlyweightFloat getFFloat(){
        if(FFloat == null){
            FFloat = new FlyweightFloat();
        }
        return FFloat;
    }

    public HashMap<Double, Float> getMap(){
        return Hmap;
    }

    public Float createFloat(Double b){
        Float bi = Hmap.get(b);
        if(bi == null){
            bi = new Float(b);
            Hmap.put(b, bi);
        }
        return bi;
    }
}
