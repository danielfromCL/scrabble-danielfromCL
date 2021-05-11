package cl.uchile.dcc.scrabble.gui;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import org.apache.commons.lang3.RandomStringUtils;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class TypesTest {
    private TString st;
    private Bool bo;
    private Binary bi;
    private Int i;
    private Float f;
    private String hello;
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
        hello = RandomStringUtils.random(strSize, 0, Character.MAX_CODE_POINT, true, false, null, rng);
        binary = RandomStringUtils.random(strSize, ZeroOne);
        st = new TString(hello);
        bo = new Bool(true);
        bi = new Binary(binary);
        i = new Int(seed); //seed is a random number
        decimal = seed+0.1; //transformed to double
        f = new Float(decimal);

    }

    @RepeatedTest(20)
    void constructorTest(){

        var expectedTString = new TString(hello);
        assertEquals(expectedTString,st);
        assertEquals(expectedTString.hashCode(),st.hashCode());
        String world;
        do {
            world = RandomStringUtils.random(rng.nextInt(20), 0, Character.MAX_CODE_POINT, true, false, null, rng);
        } while (world.equals(hello));
        var differentTString = new TString(world);
        assertNotEquals(differentTString,st);

        var expectedBooltrue = new Bool(true);
        assertEquals(expectedBooltrue,bo);
        assertEquals(expectedBooltrue.hashCode(),bo.hashCode());
        var expectedBoolfalse = new Bool(false);
        assertNotEquals(expectedBoolfalse,bo);

        var expectedBinary = new Binary(binary);
        assertEquals(expectedBinary,bi);
        assertEquals(expectedBinary.hashCode(),bi.hashCode());
        String differentbinary;
        do {
            differentbinary = RandomStringUtils.random(rng.nextInt(20), ZeroOne);
        } while (differentbinary.equals(binary));
        var differentBinary = new Binary(differentbinary);
        assertNotEquals(differentBinary,bi);

        var expectedInt = new Int(seed);
        assertEquals(expectedInt,i);
        assertEquals(expectedInt.hashCode(),i.hashCode());
        int differentseed;
        do {
            differentseed = new Random().nextInt();
        } while (seed == differentseed);
        var differentInt = new Int(differentseed);
        assertNotEquals(differentInt,i);

        var expectedFloat = new Float(decimal);
        assertEquals(expectedFloat,f);
        assertEquals(expectedFloat.hashCode(),f.hashCode());
        double differentdecimal;
        do {
            differentdecimal = new Random().nextInt() +0.1;
        } while (decimal == differentdecimal);
        var differentFloat = new Float(differentdecimal);
        assertNotEquals(differentFloat,f);

    }

    @RepeatedTest(20)
    void gettersTest(){
        assertEquals(st.getString(),hello);
        assertEquals(bo.isBool(),true);
        assertNotEquals(bo.isBool(),false);
        assertEquals(bi.getBinary(),binary);
        assertEquals(i.getInt(),seed);
        assertEquals(f.getFloat(),decimal);
    }
    @RepeatedTest(20)
    void toStringTest(){
        assertEquals(st.toString(),hello);
        assertEquals(bo.toString(),"true");
        assertEquals(bi.toString(),binary);
        assertEquals(i.toString(),""+seed);
        assertEquals(f.toString(),""+decimal);
    }


}