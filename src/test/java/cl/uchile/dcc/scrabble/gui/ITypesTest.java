package cl.uchile.dcc.scrabble.gui;

import org.apache.commons.lang3.RandomStringUtils;
import java.util.Random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import static org.junit.jupiter.api.Assertions.*;

class ITypesTest {
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
    void transformersTest(){
        assertEquals(st.transformtoString(),new TString(hello));
        assertEquals(bo.transformtoString(),new TString(bo.toString()));
        assertEquals(f.transformtoString(),new TString(f.toString()));
        assertEquals(i.transformtoString(),new TString(i.toString()));
        assertEquals(bi.transformtoString(),new TString(bi.toString()));

        assertNull(st.transformtoBool());
        assertEquals(bo.transformtoBool(),new Bool(true));
        assertNull(f.transformtoBool());
        assertNull(i.transformtoBool());
        assertNull(bi.transformtoBool());

        assertNull(st.transformtoFloat());
        assertNull(bo.transformtoFloat());
        assertEquals(f.transformtoFloat(),new Float(decimal));
        assertEquals(i.transformtoFloat(),new Float(seed));

        assertNull(st.transformtoInt());
        assertNull(bo.transformtoInt());
        assertNull(f.transformtoInt());
        assertEquals(i.transformtoInt(),new Int(seed));

        assertNull(st.transformtoBinary());
        assertNull(bo.transformtoBinary());
        assertNull(f.transformtoBinary());
        assertEquals(bi.transformtoBinary(),new Binary(binary));
    }




}