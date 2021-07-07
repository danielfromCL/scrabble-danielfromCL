package cl.uchile.dcc.scrabble.gui.memory;

import cl.uchile.dcc.scrabble.gui.types.NullType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class FlyweightNullTest {

    private FlyweightNull FNullType;

    @BeforeEach
    void setUp() {
        FNullType = FlyweightNull.getFNull();
    }

    @Test
    void getFNullTypeTest() {
        assertEquals(FNullType, FlyweightNull.getFNull());
    }

    /**
     * Tests that the NullType objects are being created correctly.
     */
    @Test
    void createNullTypeTest() {
        NullType bo1 = FNullType.createNull();
        NullType bo = FNullType.createNull();
        assertEquals(bo1, bo);
    }
}