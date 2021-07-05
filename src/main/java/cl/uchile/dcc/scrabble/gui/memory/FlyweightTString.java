package cl.uchile.dcc.scrabble.gui.memory;

import cl.uchile.dcc.scrabble.gui.types.TString;

import java.util.HashMap;

public class FlyweightTString {

    private static FlyweightTString FTString;
    private HashMap<String, TString> Hmap;

    private FlyweightTString(){}

    public static FlyweightTString getFTString(){
        if(FTString == null){
            FTString = new FlyweightTString();
        }
        return FTString;
    }

    public HashMap<String, TString> getMap(){
        return Hmap;
    }

    public TString createTString(String b){
        TString bi = Hmap.get(b);
        if(bi == null){
            bi = new TString(b);
            Hmap.put(b, bi);
        }
        return bi;
    }
}
