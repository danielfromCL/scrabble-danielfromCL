package cl.uchile.dcc.scrabble.gui;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ITypesTest {
    private TString t;
    private Bool bo;
    private Binary bi;
    private Int i;
    private Float f;
    private String hello = "hello";
    private String binary = "1010";
    private int two = 2;
    private int three = 3;
    @BeforeEach
    void setUp() {
        t = new TString(hello);
        bo = new Bool(true);
        bi = new Binary(binary);
        i = new Int(two);
        f = new Float(three);
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

        var expectedFloat = new Float(three);
        assertEquals(expectedFloat,f);
        assertEquals(expectedFloat.hashCode(),f.hashCode());
        var differentFloat = new Float(5);
        assertNotEquals(differentFloat,f);
    }
}