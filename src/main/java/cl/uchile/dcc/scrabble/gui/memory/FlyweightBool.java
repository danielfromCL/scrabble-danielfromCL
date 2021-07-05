package cl.uchile.dcc.scrabble.gui.memory;

import cl.uchile.dcc.scrabble.gui.types.Bool;

import java.util.HashMap;

public class FlyweightBool {

    private static FlyweightBool FBool;
    private HashMap<Boolean, Bool> Hmap;

    private FlyweightBool(){}

    public static FlyweightBool getFBool(){
        if(FBool == null){
            FBool = new FlyweightBool();
        }
        return FBool;
    }

    public HashMap<Boolean, Bool> getMap(){
        return Hmap;
    }

    public Bool createBool(Boolean b){
        Bool bo = Hmap.get(b);
        if(bo == null){
            bo = new Bool(b);
            Hmap.put(b, bo);
        }
        return bo;
    }
}
