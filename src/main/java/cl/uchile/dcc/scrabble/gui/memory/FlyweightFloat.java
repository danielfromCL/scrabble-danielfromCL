package cl.uchile.dcc.scrabble.gui.memory;

import cl.uchile.dcc.scrabble.gui.types.Float;

import java.util.HashMap;

/**
 * Class that represents a Singleton Flyweight Factory for Float objects.
 * It's designed with the Singleton pattern, so there can only be one instance of an object of this class in the program.
 * It allows the reutilization of Float objects with the same parameter, so as not to create new unnecessary objects.
 */
public class FlyweightFloat {
    private static FlyweightFloat FFloat;
    private HashMap<Double, Float> Hmap;

    private FlyweightFloat(){}

    /**
     * Returns this Singleton Flyweight Factory.
     * If the factory doesn't exists, it creates one before returning it.
     */
    public static FlyweightFloat getFFloat(){
        if(FFloat == null){
            FFloat = new FlyweightFloat();
        }
        return FFloat;
    }

    /**
     * Returns this factory's Hashhmap.
     */
    public HashMap<Double, Float> getMap(){
        return Hmap;
    }

    /**
     * Returns a Float object with the Double's value as it's parameter.
     * If a Float object with the same parameter has already been created, returns it instead of creating a new one.
     * If it hasn't been already created it creates it and adds it to this factory's Hashmap.
     */
    public Float createFloat(Double b){
        Float bi = Hmap.get(b);
        if(bi == null){
            bi = new Float(b);
            Hmap.put(b, bi);
        }
        return bi;
    }
}
