package cl.uchile.dcc.scrabble.gui.memory;

import cl.uchile.dcc.scrabble.gui.types.TString;

import java.util.HashMap;


/**
 * Class that represents a Singleton Flyweight Factory for TString objects.
 * It's designed with the Singleton pattern, so there can only be one instance of an object of this class in the program.
 * It allows the reutilization of TString objects with the same parameter, so as not to create new unnecessary objects.
 */
public class FlyweightTString {

    private static FlyweightTString FTString;
    private HashMap<String, TString> Hmap;

    private FlyweightTString(){}

    /**
     * Returns this Singleton Flyweight Factory.
     * If the factory doesn't exists, it creates one before returning it.
     */
    public static FlyweightTString getFTString(){
        if(FTString == null){
            FTString = new FlyweightTString();
        }
        return FTString;
    }

    /**
     * Returns this factory's Hashhmap.
     */
    public HashMap<String, TString> getMap(){
        return Hmap;
    }

    /**
     * Returns a TString object with the String as it's parameter.
     * If a TString object with the same parameter has already been created, returns it instead of creating a new one.
     * If it hasn't been already created it creates it and adds it to this factory's Hashmap.
     */
    public TString createTString(String b){
        TString bi = Hmap.get(b);
        if(bi == null){
            bi = new TString(b);
            Hmap.put(b, bi);
        }
        return bi;
    }
}
