package cl.uchile.dcc.scrabble.gui.types;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NullTypeTest {

    private NullType Null;
    @BeforeEach
    void setUp() {
        Null = new NullType();
    }

    @Test
    void constructorTest() {
        var expectedNull = new NullType();
        assertEquals(expectedNull, Null);
        assertEquals(expectedNull.hashCode(),Null.hashCode());
        assertNotEquals(Null, new TString("hi"));
    }
}