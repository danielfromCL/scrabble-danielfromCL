package cl.uchile.dcc.scrabble.gui;

import org.apache.commons.lang3.RandomStringUtils;
import java.util.Random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Class for testing every method in ITypes.
 */
class ITypesTest {
    private TString st;
    private Bool bot;
    private Bool bof;
    private Binary bi;
    private Int i;
    private Float f;
    private String hello;
    private String binary;
    private double decimal;
    private int seed;
    private Random rng;
    private char[] ZeroOne =  {'0','1'};

    /**
     * Creates an object for each subclass of the Types class.
     */
    @BeforeEach
    void setUp() {
        seed = new Random().nextInt();
        rng = new Random(seed);
        int strSize = rng.nextInt(20);
        hello = RandomStringUtils.random(strSize, 0, Character.MAX_CODE_POINT, true, false, null, rng);
        binary = RandomStringUtils.random(strSize, ZeroOne);
        st = new TString(hello);
        bot = new Bool(true);
        bof = new Bool(false);
        bi = new Binary(binary);
        i = new Int(seed); //seed is a random number
        decimal = seed+0.1; //transformed to double
        f = new Float(decimal);

    }


    /**
     * Tests every transformation method to TString.
     */
    @RepeatedTest(20)
    void transformersTest(){
        assertEquals(st.transformtoString(),new TString(hello));
        assertEquals(bot.transformtoString(),new TString(bot.toString()));
        assertEquals(bof.transformtoString(),new TString(bof.toString()));
        assertEquals(f.transformtoString(),new TString(f.toString()));
        assertEquals(i.transformtoString(),new TString(i.toString()));
        assertEquals(bi.transformtoString(),new TString(bi.toString()));
    }


}