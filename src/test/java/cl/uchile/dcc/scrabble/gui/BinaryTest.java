package cl.uchile.dcc.scrabble.gui;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for every method exclusive to the Binary class.
 */
class BinaryTest {
    String b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    private Binary bi1,bi2,bi3,bi4,bi5,bi6,bi7,bi8,bi9,bi10;
    /**
     * Creates objects of the Binary type.
     */
    @BeforeEach
    void setUp() {
        b1 = "01";
        b2 = "1";
        b3 = "00000000000001";
        b4 = "11";
        b5 = "1111111110";
        b6 = "10";
        b7 = "1010";
        b8 = "11010";
        b9 = "0000001010";
        b10 = "01010";
        bi1 = new Binary(b1);
        bi2 = new Binary(b2);
        bi3 = new Binary(b3);
        bi4 = new Binary(b4);
        bi5 = new Binary(b5);
        bi6 = new Binary(b6);
        bi7 = new Binary(b7);
        bi8 = new Binary(b8);
        bi9 = new Binary(b9);
        bi10 = new Binary(b10);

    }

    /**
     * Tests the constructor of the Binary class.
     */
    @Test
    void constructorTest() {
        var expectedBinary = new Binary(b1);
        assertEquals(expectedBinary,bi1);
        assertEquals(expectedBinary.hashCode(),bi1.hashCode());
        var differentBinary = new Binary(b2);
        assertNotEquals(differentBinary,bi1);
        assertEquals(bi1,bi3);
        assertEquals(bi2,bi4);
        assertEquals(bi5,bi6);
        assertEquals(bi7,bi8);
        assertEquals(bi9,bi10);
        assertNotEquals(bi1,bi10);
        assertNotEquals(b8,b10);
        var differentObject = new TString("differentObject");
        assertNotEquals(bi1,differentObject);
    }
    @Test
    void getterTest(){
        assertEquals(bi1.getBinary(),b1);
        assertEquals(bi2.getBinary(),b2);
        assertEquals(bi3.getBinary(),b3);
        assertEquals(bi4.getBinary(),b4);
        assertEquals(bi5.getBinary(),b5);
        assertEquals(bi6.getBinary(),b6);
        assertEquals(bi7.getBinary(),b7);
        assertEquals(bi8.getBinary(),b8);
        assertEquals(bi9.getBinary(),b9);
        assertEquals(bi10.getBinary(),b10);
    }

    /**
     * Tests the sum between Binary and Binary and between Binary and Int.
     */
    @Test
    void sumTest(){
        assertEquals(bi1.sum(bi2),new Binary("0"));
        assertEquals(bi3.sum(bi1),new Binary("010"));
        assertEquals(bi5.sum(bi4),new Binary("101"));
        assertEquals(bi9.sum(bi10), new Binary("010100"));
        assertEquals(bi6.sum(bi7),bi7.sum(bi6));
        Int i1 = new Int(-1);
        assertEquals(bi1.sum(i1),new Binary("0"));
        Int i2 = new Int(1);
        assertEquals(bi3.sum(i2),new Binary("010"));
        assertEquals(bi4.sum(i1),new Binary("110"));
        assertEquals(bi5.sum(i2),new Binary("11"));
    }
    /**
     * Tests the subtraction between Binary and Binary and between Binary and Int.
     */
    @Test
    void subTest(){
        assertEquals(bi1.sub(bi2),new Binary("010"));
        assertEquals(bi3.sub(bi1),new Binary("0"));
        assertEquals(bi5.sub(bi4),new Binary("11"));
        assertEquals(bi9.sub(bi10), new Binary("0"));
        Int i1 = new Int(-1);
        assertEquals(bi1.sub(i1),new Binary("010"));
        Int i2 = new Int(1);
        assertEquals(bi3.sub(i2),new Binary("0"));
        assertEquals(bi4.sub(i1),bi3.sub(i2));
        assertEquals(bi5.sub(i2),new Binary("101"));
    }
    /**
     * Tests the multiplication between Binary and Binary and between Binary and Int.
     */
    @Test
    void multTest(){
        assertEquals(bi1.mult(bi2),new Binary("11"));
        assertEquals(bi3.mult(bi1),new Binary("01"));
        assertEquals(bi5.mult(bi4),new Binary("010"));
        assertEquals(bi9.mult(bi10), new Binary("01100100"));
        assertEquals(bi8.mult(bi9), bi9.mult(bi8));
        Int i1 = new Int(-1);
        assertEquals(bi1.mult(i1),new Binary("11"));
        Int i2 = new Int(1);
        assertEquals(bi3.mult(i2),new Binary(b3));
        assertEquals(bi4.mult(i1),new Binary("01"));
        assertEquals(bi5.mult(i2),new Binary("110"));
        Int i3= new Int(2);
        assertEquals(bi1.mult(i3), new Binary("010"));
        assertEquals(bi2.mult(i3), new Binary("110"));
    }
    /**
     * Tests the division between Binary and Binary and between Binary and Int.
     */
    @Test
    void divTest(){
        assertEquals(bi1.div(bi2),new Binary("11"));
        assertEquals(bi3.div(bi1),new Binary("01"));
        assertEquals(bi5.div(bi4),new Binary("010"));
        assertEquals(bi9.div(bi10), new Binary("01"));
        Int i1 = new Int(-1);
        assertEquals(bi1.div(i1),new Binary("11"));
        Int i2 = new Int(1);
        assertEquals(bi3.div(i2),new Binary(b3));
        assertEquals(bi4.div(i1),new Binary("01"));
        assertEquals(bi5.div(i2),new Binary(b5));
        Int i3= new Int(2);
        assertEquals(bi9.div(i3), new Binary("0101"));
        assertEquals(bi8.div(i3), new Binary("1101"));
    }
}