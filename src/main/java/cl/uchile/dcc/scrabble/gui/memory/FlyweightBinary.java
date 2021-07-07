package cl.uchile.dcc.scrabble.gui.memory;

import cl.uchile.dcc.scrabble.gui.types.Binary;
import cl.uchile.dcc.scrabble.gui.types.Binary;

import java.util.HashMap;

/**
 * Class that represents a Singleton Flyweight Factory for Binary objects.
 * It's designed with the Singleton pattern, so there can only be one instance of an object of this class in the program.
 * It allows the reutilization of Binary objects with the same parameter, so as not to create new unnecessary objects.
 */
public class FlyweightBinary {

    private static FlyweightBinary FBinary;
    private HashMap<String, Binary> Hmap = new HashMap<String, Binary>();

    private FlyweightBinary(){}

    /**
     * Returns this Singleton Flyweight Factory.
     * If the factory doesn't exists, it creates one before returning it.
     */
    public static FlyweightBinary getFBinary(){
        if(FBinary == null){
            FBinary = new FlyweightBinary();
        }
        return FBinary;
    }

    /**
     * Returns this factory's Hashhmap.
     */
    public HashMap<String, Binary> getMap(){
        return Hmap;
    }

    /**
     * Returns a Binary object with the String as it's parameter.
     * If a Binary object with the same parameter has already been created, returns it instead of creating a new one.
     * If it hasn't been already created it creates it and adds it to this factory's Hashmap.
     */
    public Binary createBinary(String b){
        Binary bi = Hmap.get(b);
        if(bi == null){
            bi = new Binary(b);
            Hmap.put(b, bi);
        }
        return bi;
    }
}
