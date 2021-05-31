package cl.uchile.dcc.scrabble.gui;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;

class INumbersTest {

    private Binary bi;
    private Int i;
    private Float f;
    private String binary;
    private double decimal;
    private int seed;
    private Random rng;
    private char[] ZeroOne =  {'0','1'};

    @BeforeEach
    void setUp() {
        seed = new Random().nextInt();
        rng = new Random(seed);
        int strSize = rng.nextInt(20);
        binary = RandomStringUtils.random(strSize, ZeroOne);
        bi = new Binary(binary);
        i = new Int(seed); //seed is a random number
        decimal = seed+0.1; //transformed to double
        f = new Float(decimal);
    }

    /**
     * Tests every sum method of the INumbers + INumbers type
     */
    @RepeatedTest(20)
    void sumTest(){
        assertEquals(f.sum(f), new Float(decimal+decimal));
        assertEquals(f.sum(i), new Float(decimal+seed));
        //assertEquals(f.sum(bi), new Binary());
        assertEquals(i.sum(f), new Float(seed+decimal));
        assertEquals(i.sum(i), new Int(seed+seed));
        //assertEquals(i.sum(bi), new Binary());
        //assertEquals(bi.sum(i), new Binary());
        //assertEquals(bi.sum(bi), new Binary());
    }
    /**
     * Tests every subtraction method of the INumbers - INumbers type
     */
    @RepeatedTest(20)
    void subTest(){
        assertEquals(f.sub(f), new Float(decimal-decimal));
        assertEquals(f.sub(i), new Float(decimal-seed));
        //assertEquals(f.sub(bi), new Binary());
        assertEquals(i.sub(f), new Float(seed-decimal));
        assertEquals(i.sub(i), new Int(seed-seed));
        //assertEquals(i.sub(bi), new Binary());
        //assertEquals(bi.sub(i), new Binary());
        //assertEquals(bi.sub(bi), new Binary());
    }
    /**
     * Tests every division method of the INumbers / INumbers type
     */
    @RepeatedTest(20)
    void divTest(){
        assertEquals(f.div(f), new Float(decimal/decimal));
        assertEquals(f.div(i), new Float(decimal/seed));
        //assertEquals(f.div(bi), new Float(bi.get));
        assertEquals(i.div(f), new Float(seed/decimal));
        assertEquals(i.div(i), new Int(seed/seed));
        //assertEquals(i.div(bi), new Binary());
        //assertEquals(bi.div(i), new Binary());
        //assertEquals(bi.div(bi), new Binary());
    }
    /**
     * Tests every multiplication method of the INumbers / INumbers type
     */
    @RepeatedTest(20)
    void multTest(){
        assertEquals(f.mult(f), new Float(decimal*decimal));
        assertEquals(f.mult(i), new Float(decimal*seed));
        //assertEquals(f.mult(bi), new Binary());
        assertEquals(i.mult(f), new Float(seed*decimal));
        assertEquals(i.mult(i), new Int(seed*seed));
        //assertEquals(i.mult(bi), new Binary());
        //assertEquals(bi.mult(i), new Binary());
        //assertEquals(bi.mult(bi), new Binary());
    }
}