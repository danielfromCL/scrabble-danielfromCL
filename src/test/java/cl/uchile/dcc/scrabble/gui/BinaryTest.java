package cl.uchile.dcc.scrabble.gui;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTest {
    String b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    private Binary bi1,bi2,bi3,bi4,bi5,bi6,bi7,bi8,bi9,bi10;
    @BeforeEach
    void setUp() {
        b1 = "01";
        b2 = "11";
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
    @Test
    void sumTest(){
        assertEquals(bi1.sum(bi2),new Binary("00"));
    }
}