package cl.uchile.dcc.scrabble.gui;

import org.apache.commons.lang3.RandomStringUtils;
import java.util.Random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ITypesTest {
    private TString t;
    private Bool bo;
    private Binary bi;
    private Int i;
    private Float f;
    private String hello;
    private String binary;
    private int integer;
    private double decimal;
    private int seed;
    private Random rng;


    @BeforeEach
    void setUp() {
        seed = new Random().nextInt();
        rng = new Random(seed);

        t = new TString(hello);
        bo = new Bool(true);
        bi = new Binary(binary);
        i = new Int(integer);
        f = new Float(decimal);



    }

    @Test
    void constructorTest(){
        var expectedTString = new TString(hello);
        assertEquals(expectedTString,t);
        assertEquals(expectedTString.hashCode(),t.hashCode());
        var differentTString = new TString("world");
        assertNotEquals(differentTString,t);

        var expectedBooltrue = new Bool(true);
        assertEquals(expectedBooltrue,bo);
        assertEquals(expectedTString.hashCode(),t.hashCode());
        var expectedBoolfalse = new Bool(false);
        assertNotEquals(expectedBoolfalse,bo);

        var expectedBinary = new Binary(binary);
        assertEquals(expectedBinary,bi);
        assertEquals(expectedBinary.hashCode(),bi.hashCode());

        var differentBinary = new Binary("1110");
        assertNotEquals(differentBinary,bi);

        var expectedInt = new Int(two);
        assertEquals(expectedInt,i);
        assertEquals(expectedInt.hashCode(),i.hashCode());
        var differentInt = new Int(4);
        assertNotEquals(differentInt,i);

        var expectedFloat = new Float(pi);
        assertEquals(expectedFloat,f);
        assertEquals(expectedFloat.hashCode(),f.hashCode());
        var differentFloat = new Float(5);
        assertNotEquals(differentFloat,f);
    }







}