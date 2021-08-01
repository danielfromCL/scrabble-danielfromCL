package cl.uchile.dcc.scrabble.gui.ast.flow;

import cl.uchile.dcc.scrabble.gui.types.*;
import cl.uchile.dcc.scrabble.gui.types.Float;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Class that tests all the methods of the If class.
 */
class IfTest {
    private If a;
    private If b;
    @BeforeEach
    void setUp() {
       a = new If(true, new TString("helloworld"), new Bool(false));
       b = new If(false, new Bool(true), new TString("byeworld"));
    }

    /**
     * Tests the constructor for If objects.
     */
    @Test
    void constructorTest(){
        var expectedIf = new Bool(true);
        If p =  new If(true, new Bool(true), new Bool(false));
        assertEquals(p.getResult(), expectedIf);
        var expectedIf2 = new Bool(false);
        assertNotEquals(p.getResult(), expectedIf2);
        If q = new If(false, new Bool(true), new Bool(false));
        assertNotEquals(q.getResult(), p.getResult());
        assertEquals(q.getResult(), expectedIf2);
        assertNotEquals(q.getResult(), expectedIf);

    }

    /**
     * Tests the getResult method for If objects.
     */
    @Test
    void getResultTest() {
        assertEquals(a.getResult(), new TString("helloworld"));
        assertNotEquals(a.getResult(), new Bool(false));
        assertEquals(b.getResult(), new TString("byeworld"));
        assertNotEquals(b.getResult(), new Bool(true));
        If c = new If(false, new TString("helloworld"), new Bool(false));
        assertEquals(c.getResult(), new Bool(false));
        assertNotEquals(c.getResult(), new TString("helloworld"));
        assertNotEquals(c.getResult(), new Bool(true));
        If d = new If(true, new Bool(true), new TString("byeworld"));
        assertEquals(d.getResult(), new Bool(true));
        assertNotEquals(d.getResult(), new TString("byeworld"));
        If e = new If(false, new Int(20), new Float(20));
        assertEquals(e.getResult(), new Float(20));
        If f = new If(true, new Int(20), new Float(20));
        assertEquals(f.getResult(), new Int(20));
        If g = new If(false, new Binary("1"), new Binary("0"));
        assertEquals(g.getResult(), new Binary("0"));
    }


}