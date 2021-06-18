package cl.uchile.dcc.scrabble.gui.types;

import cl.uchile.dcc.scrabble.gui.types.Binary;
import cl.uchile.dcc.scrabble.gui.types.Float;
import cl.uchile.dcc.scrabble.gui.types.Int;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;
/**
 * Test class for every method common to all INumbers objects.
 */
class INumbersTest {

    private Binary bi;
    private Int i;
    private Float f;
    private String binary;
    private double decimal;
    private int seed;
    private Random rng;
    private char[] ZeroOne =  {'0','1'};
    /**
     * Creates objects of each INumbers type.
     */
    @BeforeEach
    void setUp() {
        seed = new Random().nextInt();
        rng = new Random(seed);
        int strSize = rng.nextInt(20)+1;
        binary = RandomStringUtils.random(strSize, ZeroOne);
        bi = new Binary(binary);
        i = new Int(seed); //seed is a random number
        decimal = seed+0.1; //transformed to double
        f = new Float(decimal);
    }

    /**
     * Tests every transformation to Float.
     */
    @RepeatedTest(20)
    void transformtoFloatTest(){
        assertEquals(f.transformtoFloat(), f);
        assertEquals(i.transformtoFloat(),new Float(seed));
        assertEquals(bi.transformtoFloat(), new Float(bi.toInt(bi.getBinary())));
    }
}