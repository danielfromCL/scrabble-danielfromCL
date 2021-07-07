package cl.uchile.dcc.scrabble.gui.memory;

import cl.uchile.dcc.scrabble.gui.types.TString;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class FlyweightTStringTest {

    private FlyweightTString FTString;

    @BeforeEach
    void setUp() {
        FTString = FlyweightTString.getFTString();
        FTString.getMap().clear();
    }

    @Test
    void getFTStringTest() {
        assertEquals(FTString, FlyweightTString.getFTString());
    }

    @Test
    void getMapTest() {
        HashMap<String, TString> test = new HashMap<>();
        assertEquals(test, FTString.getMap());
        FTString.createTString("101");
        test.put("101", new TString("101"));
        assertEquals(test, FTString.getMap());
        test.put("010", new TString("010"));
        assertNotEquals(test, FTString.getMap());
        FTString.createTString("010");
        assertEquals(test, FTString.getMap());
    }

    /**
     * Tests that the TString objects are being created correctly and that the factory isn't creating new instances of it on it's Hashmap.
     */
    @Test
    void createTStringTest() {
        TString bo1 = FTString.createTString("101");
        assertEquals(bo1.getString(), "101");
        int size1 = FTString.getMap().size();
        TString bo2 = FTString.createTString("101");
        assertEquals(bo2.getString(), "101");
        assertEquals(size1, FTString.getMap().size());
        TString bo3 = FTString.createTString("010");
        assertEquals(bo3.getString(), "101");
        assertNotEquals(size1, FTString.getMap().size());
    }
}