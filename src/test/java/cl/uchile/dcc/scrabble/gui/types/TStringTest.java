package cl.uchile.dcc.scrabble.gui.types;

import cl.uchile.dcc.scrabble.gui.types.*;
import cl.uchile.dcc.scrabble.gui.types.Float;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Test class for every method exclusive to the TString class.
 */
class TStringTest {
    private TString st,wo;
    private int seed;
    private Random rng;
    private String hello, world;
    /**
     * Creates objects of the TString type.
     */
    @BeforeEach
    void setUp() {
        seed = new Random().nextInt();
        rng = new Random(seed);
        int strSize = rng.nextInt(20);
        hello = RandomStringUtils.random(strSize, 0, Character.MAX_CODE_POINT, true, false, null, rng);
        st = new TString(hello);
        world = "hello world";
        wo = new TString(world);
    }
    /**
     * Tests the constructor of the TString class.
     */
    @RepeatedTest(20)
    void constructorTest(){
        var expectedTString = new TString(hello);
        assertEquals(expectedTString,st);
        assertEquals(expectedTString.hashCode(),st.hashCode());
        String differentString;
        do {
            differentString = RandomStringUtils.random(rng.nextInt(20), 0, Character.MAX_CODE_POINT, true, false, null, rng);
        } while (differentString.equals(hello));
        var differentTString = new TString(differentString);
        assertNotEquals(differentTString,st);
        var differentObject = new Int(seed);
        assertNotEquals(st, differentObject);
    }

    @RepeatedTest(20)
    void getterTest(){
        assertEquals(st.getString(),hello);
        assertEquals(wo.getString(),world);
    }
    @RepeatedTest(20)
    void toStringTest(){
        assertEquals(st.toString(),hello);
        assertEquals(wo.toString(),world);
    }

}