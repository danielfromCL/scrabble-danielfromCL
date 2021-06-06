package cl.uchile.dcc.scrabble.gui;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Test class for every method exclusive to the Bool class.
 */
class BoolTest {
    private Bool bot;
    private Bool bof;
    /**
     * Creates objects of the Bool type.
     */
    @BeforeEach
    void setUp() {
        bot = new Bool(true);
        bof = new Bool(false);
    }

    @Test
    void constructorTest() {
        var expectedBooltrue = new Bool(true);
        assertEquals(expectedBooltrue,bot);
        assertEquals(expectedBooltrue.hashCode(),bot.hashCode());
        var expectedBoolfalse = new Bool(false);
        assertEquals(expectedBoolfalse,bof);
        assertNotEquals(expectedBoolfalse, bot);
        assertEquals(expectedBoolfalse.hashCode(),bof.hashCode());
        assertNotEquals(bot, bof);
    }
    @Test
    void getterTest(){
        assertTrue(bot.isBool());
        assertNotEquals(bot.isBool(), false);
        assertFalse(bof.isBool());
        assertNotEquals(bof.isBool(),true);
    }
    @Test
    void toStringTest(){
        assertEquals(bot.toString(), "true");
        assertEquals(bof.toString(), "false");
    }
    @Test
    void transformerTest() {
        assertEquals(bot.transformtoBool(),bot);
        assertEquals(bof.transformtoBool(),bof);
        assertNotEquals(bot.transformtoBool(),bof);
        assertNotEquals(bof.transformtoBool(),bot);
    }
    @Test
    void negationTest(){
        assertEquals(bot.neg(),bof);
        assertEquals(bof.neg(),bot);
        assertNotEquals(bot.neg(),bot);
        assertNotEquals(bof.neg(),bof);
    }
}