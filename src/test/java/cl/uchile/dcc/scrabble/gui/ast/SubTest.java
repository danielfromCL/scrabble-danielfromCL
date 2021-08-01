package cl.uchile.dcc.scrabble.gui.ast;

import cl.uchile.dcc.scrabble.gui.types.*;
import cl.uchile.dcc.scrabble.gui.types.Float;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class SubTest {

    private Float f1,f2;
    private Int i1,i2;
    private Bool bo;
    private Binary bi;
    private TString t;
    private NullType Null;
    private int random1, random2;
    private double decimal1, decimal2;
    @BeforeEach
    void setUp() {
        random1 = new Random().nextInt();
        decimal1 = new Random().nextInt() +0.1;
        random2 = new Random().nextInt();
        decimal2 = new Random().nextInt() +0.1;
        i1 = new Int(random1);
        f1 = new Float(decimal1);
        i2 = new Int(random2);
        f2 = new Float(decimal2);
        bo = new Bool(true);
        bi = new Binary("01");
        t = new TString("hola");
        Null = new NullType();
    }

    /**
     * Tests the constructor of the Sub class.
     */
    @RepeatedTest(20)
    void constructorTest() {
        var expectedSub = new Int(random1-random2);
        Sub IntInt = new Sub(i1, i2);
        Sub FloatInt = new Sub(f2, i1);
        Sub BinaryInt = new Sub(bi, i1);
        assertEquals(IntInt.getResult(), expectedSub);
        var expectedSub2 = new Float(decimal2-random1);
        assertEquals(FloatInt.getResult(), expectedSub2);
        var NotExpectedSub = new Sub(i1, bi);
        assertNotEquals(BinaryInt.getResult(), NotExpectedSub.getResult());

        Sub StringInt = new Sub(t, i1);
        assertEquals(StringInt.getResult(), Null);
        Sub BoolInt = new Sub(bo, i1);
        assertEquals(BoolInt.getResult(), Null);
        Sub IntString = new Sub(i1, t);
        assertEquals(IntString.getResult(), Null);
        Sub FloatString = new Sub(f1, t);
        assertEquals(FloatString.getResult(), Null);
        Sub BoolString = new Sub(bo, t);
        assertEquals(BoolString.getResult(), Null);
        Sub StringString = new Sub(t, t);
        assertEquals(StringString.getResult(),Null);
        Sub IntBool = new Sub(i1,bo);
        assertEquals(IntBool.getResult(), Null);
        Sub FloatBool = new Sub(f1,bo);
        assertEquals(FloatBool.getResult(), Null);
        Sub BinaryBool = new Sub(bi,bo);
        assertEquals(BinaryBool.getResult(), Null);
        Sub StringBool = new Sub(t,bo);
        assertEquals(StringBool.getResult(), Null);

        Sub SubTree1 = new Sub(IntInt, i1);
        assertEquals(SubTree1.getResult(), new Int(random1-random2-random1));
        Sub SubTree2 = new Sub(IntInt, FloatInt);
        assertEquals(SubTree2.getResult(), new Float(random1-random2-(decimal2-random1)));
    }
}