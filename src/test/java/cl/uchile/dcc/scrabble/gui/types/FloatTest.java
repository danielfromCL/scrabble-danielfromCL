package cl.uchile.dcc.scrabble.gui.types;

import cl.uchile.dcc.scrabble.gui.types.Float;
import cl.uchile.dcc.scrabble.gui.types.Int;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Test class for every method exclusive to the Float class.
 */
class FloatTest {
    private int random;
    private double decimal;
    private Float f1;
    /**
     * Creates objects of the Float type.
     */
    @BeforeEach
    void setUp() {
        random = new Random().nextInt();
        decimal = random+0.1;
        f1 = new Float(decimal);
    }
    /**
     * Tests the constructor of the Float class.
     */
    @RepeatedTest(20)
    void constructorTest(){
        var expectedInt = new Float(decimal);
        assertEquals(expectedInt,f1);
        assertEquals(expectedInt.hashCode(),f1.hashCode());
        int differentrandom;
        do {
            differentrandom = new Random().nextInt();
        } while (random == differentrandom);
        var differentInt = new Float(differentrandom);
        assertNotEquals(differentInt,f1);
        var differentObject = new Int(random);
        assertNotEquals(f1, differentObject);
    }
    @RepeatedTest(20)
    void getterTest(){
        assertEquals(f1.getFloat(),decimal);
        int differentrandom;
        do {
            differentrandom = new Random().nextInt();
        } while (random == differentrandom);
        assertNotEquals(f1.getFloat(),(double)differentrandom);
    }
    @RepeatedTest(20)
    void toStringTest(){
        assertEquals(f1.toString(), ""+decimal);
    }
}