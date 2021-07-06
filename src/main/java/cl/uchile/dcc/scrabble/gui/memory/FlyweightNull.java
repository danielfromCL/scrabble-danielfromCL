package cl.uchile.dcc.scrabble.gui.memory;

import cl.uchile.dcc.scrabble.gui.types.NullType;


/**
 * Class that represents a Singleton Flyweight Factory for NullType objects.
 * It's designed with the Singleton pattern, so there can only be one instance of an object of this class in the program.
 * It allows the reutilization of a single NullType, so as not to create new unnecessary objects.
 */
public class FlyweightNull {

    private static FlyweightNull FNull;
    private NullType Null;
    private FlyweightNull(){}

    /**
     * Returns this Singleton Flyweight Factory.
     * If the factory doesn't exists, it creates one before returning it.
     */
    public static FlyweightNull getFNull(){
        if(FNull == null){
            FNull = new FlyweightNull();
        }
        return FNull;
    }

    /**
     * Returns a Nulltype object.
     * If a NullType object has already been created, returns it instead of creating a new one.
     * If it hasn't been already created it creates it.
     */
    public NullType createNull(){
        if(Null == null){
            Null = new NullType();
        }
        return Null;
    }
}
