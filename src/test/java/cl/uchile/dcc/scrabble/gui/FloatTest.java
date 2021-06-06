package cl.uchile.dcc.scrabble.gui;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class FloatTest {
    private int random;
    private double decimal;
    private Float f1;
    @BeforeEach
    void setUp() {
        random = new Random().nextInt();
        decimal = random+0.1;
        f1 = new Float(decimal);
    }
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