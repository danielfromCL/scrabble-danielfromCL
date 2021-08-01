package cl.uchile.dcc.scrabble.gui.ast;

import cl.uchile.dcc.scrabble.gui.types.*;
import cl.uchile.dcc.scrabble.gui.types.Float;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class AndTest {

    private Float f1;
    private Int i1;
    private Bool bo;
    private Binary bi;
    private TString t;
    private NullType Null;
    private int random1;
    private double decimal1;
    @BeforeEach
    void setUp() {
        random1 = new Random().nextInt();
        decimal1 = new Random().nextInt() +0.1;

        i1 = new Int(random1);
        f1 = new Float(decimal1);

        bo = new Bool(true);
        bi = new Binary("01");
        t = new TString("hola");
        Null = new NullType();
    }

    /**
     * Tests the constructor of the And class.
     */
    @RepeatedTest(20)
    void constructorTest() {
        var expectedAnd = bi;
        And BinaryBinary = new And(bi, bi);
        And BinaryBool = new And(bi, bo);
        And BoolBinary = new And(bo, bi);
        And BoolBool = new And(bo,bo);
        assertEquals(BinaryBinary.getResult(), expectedAnd);
        var expectedAnd2 = bi;
        assertEquals(BinaryBool.getResult(), expectedAnd2);
        assertEquals(BoolBinary.getResult(), BinaryBool.getResult());

        And StringInt = new And(t, i1);
        assertEquals(StringInt.getResult(), Null);
        And BoolInt = new And(bo, i1);
        assertEquals(BoolInt.getResult(), Null);
        And IntString = new And(i1, t);
        assertEquals(IntString.getResult(), Null);
        And FloatString = new And(f1, t);
        assertEquals(FloatString.getResult(), Null);
        And BoolString = new And(bo, t);
        assertEquals(BoolString.getResult(), Null);
        And StringString = new And(t, t);
        assertEquals(StringString.getResult(), Null);
        And IntBool = new And(i1,bo);
        assertEquals(IntBool.getResult(), Null);
        And FloatBool = new And(f1,bo);
        assertEquals(FloatBool.getResult(), Null);
        And StringBool = new And(t,bo);
        assertEquals(StringBool.getResult(), Null);
        And BinaryInt = new And(bi, i1);
        assertEquals(BinaryInt.getResult(), Null);
        And BinaryFloat = new And(bi, i1);
        assertEquals(BinaryFloat.getResult(), Null);
        And IntBinary = new And(i1, bi);
        assertEquals(IntBinary.getResult(), Null);
        And FloatBinary = new And(f1, bi);
        assertEquals(FloatBinary.getResult(), Null);

        And AndTree1 = new And(BoolBool, bo);
        assertEquals(AndTree1.getResult(),bo);
        And AndTree2 = new And(AndTree1, BinaryBinary);
        assertEquals(AndTree2.getResult(), bi);
    }
}
