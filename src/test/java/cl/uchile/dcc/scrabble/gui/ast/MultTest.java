package cl.uchile.dcc.scrabble.gui.ast;

import cl.uchile.dcc.scrabble.gui.types.*;
import cl.uchile.dcc.scrabble.gui.types.Float;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class MultTest {

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
     * Tests the constructor of the Mult class.
     */
    @RepeatedTest(20)
    void constructorTest() {
        var expectedMult = new Int(random1*random2);
        Mult IntInt = new Mult(i1, i2);
        Mult FloatInt = new Mult(f2, i1);
        Mult BinaryInt = new Mult(bi, i1);
        assertEquals(IntInt.getResult(), expectedMult);
        var expectedMult2 = new Float(decimal2*random1);
        assertEquals(FloatInt.getResult(), expectedMult2);
        var NotExpectedMult = new Mult(i1, bi);
        assertNotEquals(BinaryInt.getResult(), NotExpectedMult.getResult());

        Mult StringInt = new Mult(t, i1);
        assertEquals(StringInt.getResult(), Null);
        Mult BoolInt = new Mult(bo, i1);
        assertEquals(BoolInt.getResult(), Null);
        Mult IntString = new Mult(i1, t);
        assertEquals(IntString.getResult(), Null);
        Mult FloatString = new Mult(f1, t);
        assertEquals(FloatString.getResult(), Null);
        Mult BoolString = new Mult(bo, t);
        assertEquals(BoolString.getResult(), Null);
        Mult StringString = new Mult(t, t);
        assertEquals(StringString.getResult(),Null);
        Mult IntBool = new Mult(i1,bo);
        assertEquals(IntBool.getResult(), Null);
        Mult FloatBool = new Mult(f1,bo);
        assertEquals(FloatBool.getResult(), Null);
        Mult BinaryBool = new Mult(bi,bo);
        assertEquals(BinaryBool.getResult(), Null);
        Mult StringBool = new Mult(t,bo);
        assertEquals(StringBool.getResult(), Null);

        Mult MultTree1 = new Mult(IntInt, i1);
        assertEquals(MultTree1.getResult(), new Int(random1*random2*random1));
        Mult MultTree2 = new Mult(IntInt, FloatInt);
        assertEquals(MultTree2.getResult(), new Float(random1*random2*(decimal2*random1)));
    }
}