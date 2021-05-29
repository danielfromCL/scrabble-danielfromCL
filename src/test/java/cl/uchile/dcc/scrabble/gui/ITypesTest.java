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
     * Tests every transformation method solicited for the first partial submission
     */
    @RepeatedTest(20)
    void transformersTest(){
        assertEquals(st.transformtoString(),new TString(hello));
        assertEquals(bot.transformtoString(),new TString(bot.toString()));
        assertEquals(bof.transformtoString(),new TString(bof.toString()));
        assertEquals(f.transformtoString(),new TString(f.toString()));
        assertEquals(i.transformtoString(),new TString(i.toString()));
        assertEquals(bi.transformtoString(),new TString(bi.toString()));

        assertNull(st.transformtoBool());
        assertEquals(bot.transformtoBool(),new Bool(true));
        assertEquals(bof.transformtoBool(),new Bool(false));
        assertNull(f.transformtoBool());
        assertNull(i.transformtoBool());
        assertNull(bi.transformtoBool());

        assertNull(st.transformtoFloat());
        assertNull(bot.transformtoFloat());
        assertNull(bof.transformtoFloat());
        assertEquals(f.transformtoFloat(),new Float(decimal));
        assertEquals(i.transformtoFloat(),new Float(seed));

        assertNull(st.transformtoInt());
        assertNull(bot.transformtoInt());
        assertNull(bof.transformtoInt());
        assertNull(f.transformtoInt());
        assertEquals(i.transformtoInt(),new Int(seed));

        assertNull(st.transformtoBinary());
        assertNull(bot.transformtoBinary());
        assertNull(bof.transformtoBinary());
        assertNull(f.transformtoBinary());
        assertEquals(bi.transformtoBinary(),new Binary(binary));
    }

    /**
     * Tests every sum method of the TString + Type object
     */
    @RepeatedTest(20)
    void sumTest(){
        assertEquals(st.sum(new TString(hello)),new TString(hello+hello));
        assertEquals(st.sum(bot),new TString(hello+"true"));
        assertEquals(st.sum(bof),new TString(hello+"false"));
        assertEquals(st.sum(f),new TString(hello+decimal));
        assertEquals(st.sum(i),new TString(hello+seed));
        assertEquals(st.sum(bi),new TString(hello+binary));

    }

    /**
     * Tests every negation method for a Type object
     */
    @RepeatedTest(20)
    void negTest(){
        assertEquals(st.neg(),st);
        assertEquals(bot.neg(), bof);
        assertEquals(bof.neg(),bot);
        assertEquals(f.neg(), new Float(decimal*(-1)));
        assertEquals(i.neg(), new Int(seed*(-1)));
        //assertEquals(bi.neg(), new Binary());
    }


}