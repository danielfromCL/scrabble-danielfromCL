package cl.uchile.dcc.scrabble.gui.memory;

import cl.uchile.dcc.scrabble.gui.types.Int;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class FlyweightIntTest {

    private FlyweightInt FInt;

    @BeforeEach
    void setUp() {
        FInt = FlyweightInt.getFInt();
        FInt.getMap().clear();
    }

    @Test
    void getFIntTest() {
        assertEquals(FInt, FlyweightInt.getFInt());
    }

    @Test
    void getMapTest() {
        HashMap<Integer, Int> test = new HashMap<>();
        assertEquals(test, FInt.getMap());
        FInt.createInt(2);
        test.put(2, new Int(2));
        assertEquals(test, FInt.getMap());
        FInt.createInt(2);
        assertEquals(test, FInt.getMap());
        test.put(4, new Int(4));
        assertNotEquals(test, FInt.getMap());
        FInt.createInt(4);
        assertEquals(test, FInt.getMap());
    }

    /**
     * Tests that the Int objects are being created correctly and that the factory isn't creating new instances of it on it's Hashmap.
     */
    @Test
    void createIntTest() {
        Int bo1 = FInt.createInt(2);
        assertEquals(bo1.getInt(), 2);
        int size1 = FInt.getMap().size();
        Int bo2 = FInt.createInt(2);
        assertEquals(bo2.getInt(), 2);
        assertEquals(size1, FInt.getMap().size());
        Int bo3 = FInt.createInt(3);
        assertEquals(bo3.getInt(), 3);
        assertNotEquals(size1, FInt.getMap().size());
    }
}