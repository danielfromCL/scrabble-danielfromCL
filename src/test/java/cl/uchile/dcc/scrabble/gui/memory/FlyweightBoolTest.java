package cl.uchile.dcc.scrabble.gui.memory;

import cl.uchile.dcc.scrabble.gui.types.Bool;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class FlyweightBoolTest {

    private FlyweightBool FBool;

    @BeforeEach
    void setUp() {
        FBool = FlyweightBool.getFBool();
        FBool.getMap().clear();
    }

    @Test
    void getFBoolTest() {
        assertEquals(FBool, FlyweightBool.getFBool());
    }

    @Test
    void getMapTest() {
        HashMap<Boolean, Bool> test = new HashMap<>();
        assertEquals(test, FBool.getMap());
        FBool.createBool(true);
        test.put(true, new Bool(true));
        assertEquals(test, FBool.getMap());
        FBool.createBool(true);
        assertEquals(test, FBool.getMap());
        test.put(false, new Bool(false));
        assertNotEquals(test, FBool.getMap());
        FBool.createBool(false);
        assertEquals(test, FBool.getMap());
    }

    /**
     * Tests that the Bool objects are being created correctly and that the factory isn't creating new instances of it on it's Hashmap.
     */
    @Test
    void createBoolTest() {
        Bool bo1 = FBool.createBool(true);
        assertTrue(bo1.isBool());
        int size1 = FBool.getMap().size();
        Bool bo2 = FBool.createBool(true);
        assertTrue(bo2.isBool());
        assertEquals(size1, FBool.getMap().size());
        Bool bo3 = FBool.createBool(false);
        assertFalse(bo3.isBool());
        assertNotEquals(size1, FBool.getMap().size());
    }
}