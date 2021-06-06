package cl.uchile.dcc.scrabble.gui;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;
/**
 * Test class for every method common to all the ILogical objects.
 */
import static org.junit.jupiter.api.Assertions.*;

class ILogicalTest {
    private Bool bot;
    private Bool bof;
    private Binary bi;
    private String binary;
    private int seed;
    private Random rng;
    private char[] ZeroOne =  {'0','1'};

    /**
     * Creates objects of each ILogical type.
     */
    @BeforeEach
    void setUp() {
        seed = new Random().nextInt();
        rng = new Random(seed);
        int strSize = rng.nextInt(20)+1;
        binary = RandomStringUtils.random(strSize, ZeroOne);
        bot = new Bool(true);
        bof = new Bool(false);
        bi = new Binary(binary);
    }


    /**
     * Tests every logical operator method between ILogical objects.
     */
    @RepeatedTest(20)
    void logicalOperatorsTest() {
        assertEquals(bi.or(bot), new Binary("1"));
        assertEquals(bi.or(bof), bi);
        assertEquals(bi.and(bot), bi);
        assertEquals(bi.and(bof), new Binary("0"));
        assertEquals(bot.or(bi), new Binary("1"));
        assertEquals(bof.or(bi), bi);
        assertEquals(bot.and(bi), bi);
        assertEquals(bof.and(bi), new Binary("0"));
        assertEquals(bot.and(bot), bot);
        assertEquals(bot.and(bof),bof);
        assertEquals(bof.and(bot),bof);
        assertEquals(bof.and(bof),bof);
        assertEquals(bot.or(bot), bot);
        assertEquals(bot.or(bof),bot);
        assertEquals(bof.or(bot),bot);
        assertEquals(bof.or(bof),bof);
        Binary b1 = new Binary("10001");
        Binary b2 = new Binary("1001011");
        assertEquals(b1.or(b2), new Binary("1111011"));
        assertEquals(b1.and(b2), new Binary("1000001"));
        assertEquals(b1.or(b2), b2.or(b1));
        assertEquals(b1.and(b2),b2.and(b1));
        assertEquals(bi.or(bi), bi);
        assertEquals(bi.and(bi),bi);
        Binary notbi = (Binary) bi.neg();
        assertEquals(bi.or(notbi), new Binary("1"));
        assertEquals(bi.and(notbi), new Binary("0"));
    }
    /**
     * Tests every negation method for ILogical objects.
     */
    @RepeatedTest(20)
    void negationTest(){
        assertEquals(bot.neg(),bof);
        assertEquals(bof.neg(),bot);
        Binary b1 = new Binary("10101");
        Binary notb1 = new Binary("01010");
        Binary b2 = new Binary("0100110");
        Binary notb2 = new Binary("1011001");
        assertEquals(b1.neg(),notb1);
        assertEquals(notb1.neg(),b1);
        assertEquals(b2.neg(),notb2);
        assertEquals(notb2.neg(),b2);
        Binary b3 = new Binary("00000000000");
        Binary notb3 = new Binary("1");
        Binary b4 = new Binary("00000000001");
        Binary notb4 = new Binary("10");
        assertEquals(b3.neg(),notb3);
        assertEquals(notb3.neg(),b3);
        assertEquals(b4.neg(),notb4);
        assertEquals(notb4.neg(),b4);
        Binary b5 = new Binary("11111111");
        Binary notb5 = new Binary("0");
        Binary b6 = new Binary("11111110");
        Binary notb6 = new Binary("01");
        assertEquals(b5.neg(),notb5);
        assertEquals(notb5.neg(),b5);
        assertEquals(b6.neg(),notb6);
        assertEquals(notb6.neg(),b6);

    }
}