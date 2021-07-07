package cl.uchile.dcc.scrabble.gui.memory;

import cl.uchile.dcc.scrabble.gui.types.Bool;

import java.util.HashMap;

/**
 * Class that represents a Singleton Flyweight Factory for Bool objects.
 * It's designed with the Singleton pattern, so there can only be one instance of an object of this class in the program.
 * It allows the reutilization of Bool objects with the same parameter, so as not to create new unnecessary objects.
 */
public class FlyweightBool {

    private static FlyweightBool FBool;
    private HashMap<Boolean, Bool> Hmap = new HashMap<Boolean, Bool>();

    private FlyweightBool(){}

    /**
     * Returns this Singleton Flyweight Factory.
     * If the factory doesn't exists, it creates one before returning it.
     */
    public static FlyweightBool getFBool(){
        if(FBool == null){
            FBool = new FlyweightBool();
        }
        return FBool;
    }

    /**
     * Returns this factory's Hashhmap.
     */
    public HashMap<Boolean, Bool> getMap(){
        return Hmap;
    }

    /**
     * Returns a Bool object with the Boolean value as it's parameter.
     * If a Bool object with the same parameter has already been created, returns it instead of creating a new one.
     * If it hasn't been already created it creates it and adds it to this factory's Hashmap.
     */
    public Bool createBool(Boolean b){
        Bool bo = Hmap.get(b);
        if(bo == null){
            bo = new Bool(b);
            Hmap.put(b, bo);
        }
        return bo;
    }
}
