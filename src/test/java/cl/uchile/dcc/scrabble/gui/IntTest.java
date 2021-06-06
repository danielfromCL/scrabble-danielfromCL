package cl.uchile.dcc.scrabble.gui;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class IntTest {
    private int random;
    private Int i1;
    @BeforeEach
    void setUp() {
        random = new Random().nextInt();
        i1 = new Int(random);
    }
    @RepeatedTest(20)
    void constructorTest(){
        var expectedInt = new Int(random);
        assertEquals(expectedInt,i1);
        assertEquals(expectedInt.hashCode(),i1.hashCode());
        int differentrandom;
        do {
            differentrandom = new Random().nextInt();
        } while (random == differentrandom);
        var differentInt = new Int(differentrandom);
        assertNotEquals(differentInt,i1);
        var differentObject = new Float(random);
        assertNotEquals(i1, differentObject);
    }
    @RepeatedTest(20)
    void getterTest(){
        assertEquals(i1.getInt(),random);
        int differentrandom;
        do {
            differentrandom = new Random().nextInt();
        } while (random == differentrandom);
        assertNotEquals(i1.getInt(),differentrandom);
    }
    @RepeatedTest(20)
    void toStringTest(){
        assertEquals(i1.toString(), ""+random);
    }
}