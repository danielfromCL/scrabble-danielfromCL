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
 * Test class for every method common to all the FloatInt objects.
 */
class FloatIntTest {


    private Binary bi;
    private Int i, j;
    private Float f, g;
    private String binary;
    private double decimal;
    private int seed, random;
    private Random rng;
    private char[] ZeroOne =  {'0','1'};
    /**
     * Creates objects of each FloatInt type.
     */
    @BeforeEach
    void setUp() {
        seed = new Random().nextInt();
        random = new Random().nextInt();
        rng = new Random(seed);
        int strSize = rng.nextInt(20)+1;
        binary = RandomStringUtils.random(strSize, ZeroOne);
        bi = new Binary(binary+"1"); //just to be sure it's not divided by 0
        i = new Int(seed); //seed is a random number
        j = new Int(random);
        decimal = seed+0.1; //transformed to double
        f = new Float(decimal);
        g = new Float(random);
    }
    /**
     * Tests every sum method of the FloatInt + INumbers type
     */
    @RepeatedTest(20)
    void sumTest(){
        assertEquals(f.sum(f), new Float(decimal+decimal));
        assertEquals(f.sum(g), new Float(decimal+random));
        assertEquals(f.sum(g), g.sum(f));
        assertEquals(f.sum(i), new Float(decimal+seed));
        assertEquals(f.sum(bi), new Float(decimal+bi.toInt(bi.getBinary())));
        assertEquals(i.sum(f), new Float(seed+decimal));
        assertEquals(i.sum(i), new Int(seed+seed));
        assertEquals(i.sum(j), new Int(seed+random));
        assertEquals(i.sum(j), j.sum(i));
        assertEquals(i.sum(bi), new Int(seed+bi.toInt(bi.getBinary())));
    }
    /**
     * Tests every subtraction method of the FloatInt - INumbers type
     */
    @RepeatedTest(20)
    void subTest(){
        assertEquals(f.sub(f), new Float(decimal-decimal));
        assertEquals(f.sub(g), new Float(decimal-random));
        assertEquals(f.sub(i), new Float(decimal-seed));
        assertEquals(f.sub(bi), new Float(decimal-bi.toInt(bi.getBinary())));
        assertEquals(i.sub(f), new Float(seed-decimal));
        assertEquals(i.sub(i), new Int(seed-seed));
        assertEquals(i.sub(bi), new Int(seed-bi.toInt(bi.getBinary())));
    }
    /**
     * Tests every division method of the FloatInt / INumbers type
     */
    @RepeatedTest(20)
    void divTest(){
        assertEquals(f.div(f), new Float(decimal/decimal));
        if(random == 0){
            random+=1;
            g= new Float(random);
        }
        assertEquals(f.div(g), new Float(decimal/random));
        assertEquals(f.div(i), new Float(decimal/seed));
        assertEquals(f.div(bi), new Float(decimal/bi.toInt(bi.getBinary())));
        assertEquals(i.div(f), new Float(seed/decimal));
        assertEquals(i.div(i), new Int(seed/seed));
        assertEquals(i.div(j), new Int(seed/random));
        assertEquals(i.div(bi), new Int(seed/bi.toInt(bi.getBinary())));
    }
    /**
     * Tests every multiplication method of the FloatInt * INumbers type
     */
    @RepeatedTest(20)
    void multTest(){
        assertEquals(f.mult(f), new Float(decimal*decimal));
        assertEquals(f.mult(g), new Float(decimal*random));
        assertEquals(f.mult(g), g.mult(f));
        assertEquals(f.mult(i), new Float(decimal*seed));
        assertEquals(f.mult(bi), new Float(decimal*bi.toInt(bi.getBinary())));
        assertEquals(i.mult(f), new Float(seed*decimal));
        assertEquals(i.mult(i), new Int(seed*seed));
        assertEquals(i.mult(j), new Int(seed*random));
        assertEquals(i.mult(j), j.mult(i));
        assertEquals(i.mult(bi), new Int(seed*bi.toInt(bi.getBinary())));
    }

    /**
     * Tests every negation method for FloatInt objects.
     */
    @RepeatedTest(20)
    void negTest(){
        assertEquals(f.neg(), new Float(decimal*(-1)));
        assertEquals(g.neg(), new Float(random*(-1)));
        assertEquals(i.neg(), new Int(seed*(-1)));
        assertEquals(j.neg(), new Int(random*(-1)));
    }
}