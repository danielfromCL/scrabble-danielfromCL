package cl.uchile.dcc.scrabble.gui.memory;

import cl.uchile.dcc.scrabble.gui.types.Float;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class FlyweightFloatTest {

    private FlyweightFloat FFloat;

    @BeforeEach
    void setUp() {
        FFloat = FlyweightFloat.getFFloat();
        FFloat.getMap().clear();
    }

    @Test
    void getFFloatTest() {
        assertEquals(FFloat, FlyweightFloat.getFFloat());
    }

    @Test
    void getMapTest() {
        HashMap<Double, Float> test = new HashMap<>();
        assertEquals(test, FFloat.getMap());
        FFloat.createFloat(2.0);
        test.put(2.0, new Float(2.0));
        assertEquals(test, FFloat.getMap());
        FFloat.createFloat(2.0);
        assertEquals(test, FFloat.getMap());
        test.put(3.0, new Float(3.0));
        assertNotEquals(test, FFloat.getMap());
        FFloat.createFloat(3.0);
        assertEquals(test, FFloat.getMap());
    }

    /**
     * Tests that the Float objects are being created correctly and that the factory isn't creating new instances of it on it's Hashmap.
     */
    @Test
    void createFloatTest() {
        Float bo1 = FFloat.createFloat(2.0);
        assertEquals(bo1.getFloat(), 2.0);
        int size1 = FFloat.getMap().size();
        Float bo2 = FFloat.createFloat(2.0);
        assertEquals(bo2.getFloat(), 2.0);
        assertEquals(size1, FFloat.getMap().size());
        Float bo3 = FFloat.createFloat(3.0);
        assertEquals(bo3.getFloat(), 3.0);
        assertNotEquals(size1, FFloat.getMap().size());
    }
}