package cl.uchile.dcc.scrabble.gui.memory;

import cl.uchile.dcc.scrabble.gui.types.Binary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class FlyweightBinaryTest {
    
    private FlyweightBinary FBinary;

    @BeforeEach
    void setUp() {
        FBinary = FlyweightBinary.getFBinary();
        FBinary.getMap().clear();
    }

    @Test
    void getFBinaryTest() {
        assertEquals(FBinary, FlyweightBinary.getFBinary());
    }

    @Test
    void getMapTest() {
        HashMap<String, Binary> test = new HashMap<>();
        assertEquals(test, FBinary.getMap());
        FBinary.createBinary("101");
        test.put("101", new Binary("101"));
        assertEquals(test, FBinary.getMap());
        test.put("010", new Binary("010"));
        assertNotEquals(test, FBinary.getMap());
        FBinary.createBinary("010");
        assertEquals(test, FBinary.getMap());
    }

    /**
     * Tests that the Binary objects are being created correctly and that the factory isn't creating new instances of it on it's Hashmap.
     */
    @Test
    void createBinaryTest() {
        Binary bo1 = FBinary.createBinary("101");
        assertEquals(bo1.getBinary(), "101");
        int size1 = FBinary.getMap().size();
        Binary bo2 = FBinary.createBinary("101");
        assertEquals(bo2.getBinary(), "101");
        assertEquals(size1, FBinary.getMap().size());
        Binary bo3 = FBinary.createBinary("010");
        assertEquals(bo3.getBinary(), "010");
        assertNotEquals(size1, FBinary.getMap().size());
    }
}