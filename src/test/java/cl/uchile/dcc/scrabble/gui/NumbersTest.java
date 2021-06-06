package cl.uchile.dcc.scrabble.gui;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Test class for every method common to all the Numbers objects.
 */
class NumbersTest {
    int n,j,k,l,m,r,p;
    String bin1,bin2,bin3,bin4,bin5,bin6,bin7,bin8,bin9,bin10;
    Binary b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    Int i1, i2,i3,i4,i5,i6,i7;
    /**
     * Creates Int and Binary objects.
     */
    @BeforeEach
    void setUp() {
        n = 2;
        j = -2;
        k = -12;
        l = 431;
        m = 0;
        r= -1;
        p= 1;
        bin1 = "010";
        bin2 = "110";
        bin3 = "10100";
        bin4 = "0110101111";
        bin5 = "0000000001";
        bin6 = "01";
        bin7 = "11111111111111110";
        bin8 = "10";
        bin9 = "0";
        bin10 = "11";
        b1 = new Binary(bin1);
        b2 = new Binary(bin2);
        b3 = new Binary(bin3);
        b4 = new Binary(bin4);
        b5 = new Binary(bin5);
        b6 = new Binary(bin6);
        b7 = new Binary(bin7);
        b8 = new Binary(bin8);
        b9 = new Binary(bin9);
        b10 = new Binary(bin10);
        i1 = new Int(n);
        i2 = new Int(j);
        i3 = new Int(k);
        i4 = new Int(l);
        i5 = new Int(m);
        i6 = new Int(r);
        i7 = new Int(p);
    }

    /**
     * Tests the transformation from binary to integer.
     */
    @Test
    void binaryToIntTest() {
        assertEquals(b1.toInt(b1.getBinary()),n);
        assertEquals(b2.toInt(b2.getBinary()),j);
        assertEquals(b3.toInt(b3.getBinary()),k);
        assertEquals(b4.toInt(b4.getBinary()),l);
        assertEquals(b5.toInt(b5.getBinary()),p);
        assertEquals(b7.toInt(b7.getBinary()),b8.toInt(b8.getBinary()));
        assertNotEquals(b6.toInt(b6.getBinary()),b10.toInt(b10.getBinary()));
        assertEquals(b9.toInt(b9.getBinary()), m);
        assertEquals(b10.toInt(b10.getBinary()),r);
        assertNotEquals(b5.toInt(b5.getBinary()),b7.toInt(b7.getBinary()));
    }
    /**
     * Tests the transformation from integer to binary.
     */
    @Test
    void intToBinaryTest() {
        assertEquals(i1.intToBinary(i1.getInt()), bin1);
        assertEquals(i2.intToBinary(i2.getInt()), bin2);
        assertEquals(i3.intToBinary(i3.getInt()), bin3);
        assertEquals(i4.intToBinary(i4.getInt()), bin4);
        assertEquals(i7.intToBinary(i7.getInt()), bin6);
        assertEquals(i5.intToBinary(i5.getInt()), bin9);
        assertEquals(i6.intToBinary(i6.getInt()), bin10);
        assertNotEquals(i6.intToBinary(i6.getInt()), i7.intToBinary(i7.getInt()));
        assertNotEquals(i5.intToBinary(i5.getInt()), i6.intToBinary(i6.getInt()));
    }
}