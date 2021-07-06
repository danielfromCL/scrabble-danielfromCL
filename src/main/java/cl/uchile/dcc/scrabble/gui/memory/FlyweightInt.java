package cl.uchile.dcc.scrabble.gui.memory;

import cl.uchile.dcc.scrabble.gui.types.Int;

import java.util.HashMap;

/**
 * Class that represents a Singleton Flyweight Factory for Int objects.
 * It's designed with the Singleton pattern, so there can only be one instance of an object of this class in the program.
 * It allows the reutilization of Int objects with the same parameter, so as not to create new unnecessary objects.
 */
public class FlyweightInt {

    private static FlyweightInt FInt;
    private HashMap<Integer, Int> Hmap;

    private FlyweightInt(){}

    /**
     * Returns this Singleton Flyweight Factory.
     * If the factory doesn't exists, it creates one before returning it.
     */
    public static FlyweightInt getFInt(){
        if(FInt == null){
            FInt = new FlyweightInt();
        }
        return FInt;
    }

    /**
     * Returns this factory's Hashhmap.
     */
    public HashMap<Integer, Int> getMap(){
        return Hmap;
    }

    /**
     * Returns an Int object with the Integer's value as it's parameter.
     * If an Int object with the same parameter has already been created, returns it instead of creating a new one.
     * If it hasn't been already created it creates it and adds it to this factory's Hashmap.
     */
    public Int createInt(Integer b){
        Int bi = Hmap.get(b);
        if(bi == null){
            bi = new Int(b);
            Hmap.put(b, bi);
        }
        return bi;
    }
}
