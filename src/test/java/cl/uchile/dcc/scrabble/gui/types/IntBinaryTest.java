package cl.uchile.dcc.scrabble.gui.types;

import cl.uchile.dcc.scrabble.gui.types.Binary;
import cl.uchile.dcc.scrabble.gui.types.Int;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Test class for every method common to all the IntBinary objects.
 */
class IntBinaryTest {
    private Binary bi;
    private Int i;
    private String binary;
    private int seed;
    private Random rng;
    private char[] ZeroOne =  {'0','1'};
    /**
     * Creates objects of each IntBinary type.
     */
    @BeforeEach
    void setUp() {
        seed = new Random().nextInt();
        rng = new Random(seed);
        int strSize = rng.nextInt(20)+1;
        binary = RandomStringUtils.random(strSize, ZeroOne);
        bi = new Binary(binary);
        i = new Int(seed); //seed is a random number
    }
    /**
     * Tests the transformations between Int and Binary objects.
     */
    @RepeatedTest(20)
    void transformersTest() {
        assertEquals(bi.transformtoBinary(),bi);
        assertEquals(i.transformtoBinary(), new Binary(i.intToBinary(seed)));
        assertEquals(bi.transformtoInt(), new Int(bi.toInt(binary)));
        assertEquals(i.transformtoInt(),i);
    }
}