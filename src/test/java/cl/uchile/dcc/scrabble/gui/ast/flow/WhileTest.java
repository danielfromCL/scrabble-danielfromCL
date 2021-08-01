package cl.uchile.dcc.scrabble.gui.ast.flow;

import cl.uchile.dcc.scrabble.gui.types.Bool;
import cl.uchile.dcc.scrabble.gui.types.NullType;
import cl.uchile.dcc.scrabble.gui.types.TString;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Class that tests all the methods of the While class.
 */
class WhileTest {

    private While a;
    private While b;
    private While c;
    @BeforeEach
    void setUp() {
        a = new While(1, new TString("this is a bad test"));
        b = new While(5, new TString("this is a good test")).greaterThan(1);
        c = new While(1, new TString("this is another good test")).lesserThan(5);
    }

    /**
     * Tests both the constructors amd getResult methods for While objects.
     */
    @Test
    void constructorAndgetResultTest(){
        NullType expectedWhileNull = new NullType();
        assertEquals(a.getResult(), expectedWhileNull);
        TString expectedWhileGT = new TString("this is a good test");
        TString expectedWhileLT = new TString("this is another good test");
        assertNotEquals(a.getResult(), expectedWhileGT);
        assertNotEquals(a.getResult(), new TString("this is a bad test"));
        assertEquals(b.getResult(), expectedWhileGT);
        assertNotEquals(b.getResult(), expectedWhileLT);
        assertEquals(c.getResult(), expectedWhileLT);
        assertNotEquals(c.getResult(), expectedWhileGT);
    }

    /**
     * Tests that While objects are being set correctly with a greater than as condition.
     */
    @Test
    void greaterThanTest() {
        While d = new While(1, new Bool(false));
        assertEquals(d.getResult(), new NullType());
        d.greaterThan(-4);
        assertNotEquals(d.getResult(), new NullType());
        assertEquals(d.getResult(), new Bool(false));
        d.greaterThan(1);
        assertEquals(d.getResult(), new NullType());
        d.greaterThan(20);
        assertEquals(d.getResult(), new NullType());
    }
    /**
     * Tests that While objects are being set correctly with a lesser than as condition.
     */
    @Test
    void lesserThanTest() {
        While e = new While(1, new Bool(false));
        assertEquals(e.getResult(), new NullType());
        e.lesserThan(5);
        assertNotEquals(e.getResult(), new NullType());
        assertEquals(e.getResult(), new Bool(false));
        e.lesserThan(1);
        assertEquals(e.getResult(), new NullType());
        e.lesserThan(-20);
        assertEquals(e.getResult(), new NullType());
    }
}