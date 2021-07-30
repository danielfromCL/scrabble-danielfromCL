package cl.uchile.dcc.scrabble.gui.ast.operations;

import cl.uchile.dcc.scrabble.gui.ast.operations.Or;
import cl.uchile.dcc.scrabble.gui.types.*;
import cl.uchile.dcc.scrabble.gui.types.Float;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class OrTest {

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
     * Tests the constructor of the Or class.
     */
    @RepeatedTest(20)
    void constructorTest() {
        var expectedOr = new Binary("1");
        Or BinaryBinary = new Or(bi, bi);
        Or BinaryBool = new Or(bi, bo);
        Or BoolBinary = new Or(bo, bi);
        Or BoolBool = new Or(bo,bo);
        assertEquals(BinaryBinary.getResult(), bi);
        assertEquals(BinaryBool.getResult(), expectedOr);
        assertEquals(BoolBinary.getResult(), BinaryBool.getResult());

        Or StringInt = new Or(t, i1);
        assertEquals(StringInt.getResult(), Null);
        Or BoolInt = new Or(bo, i1);
        assertEquals(BoolInt.getResult(), Null);
        Or IntString = new Or(i1, t);
        assertEquals(IntString.getResult(), Null);
        Or FloatString = new Or(f1, t);
        assertEquals(FloatString.getResult(), Null);
        Or BoolString = new Or(bo, t);
        assertEquals(BoolString.getResult(), Null);
        Or StringString = new Or(t, t);
        assertEquals(StringString.getResult(), Null);
        Or IntBool = new Or(i1,bo);
        assertEquals(IntBool.getResult(), Null);
        Or FloatBool = new Or(f1,bo);
        assertEquals(FloatBool.getResult(), Null);
        Or StringBool = new Or(t,bo);
        assertEquals(StringBool.getResult(), Null);
        Or BinaryInt = new Or(bi, i1);
        assertEquals(BinaryInt.getResult(), Null);
        Or BinaryFloat = new Or(bi, i1);
        assertEquals(BinaryFloat.getResult(), Null);
        Or IntBinary = new Or(i1, bi);
        assertEquals(IntBinary.getResult(), Null);
        Or FloatBinary = new Or(f1, bi);
        assertEquals(FloatBinary.getResult(), Null);

        Or OrTree1 = new Or(BoolBool, bo);
        assertEquals(OrTree1.getResult(),bo);
        Or OrTree2 = new Or(OrTree1, BinaryBinary);
        assertEquals(OrTree2.getResult(), expectedOr);
    }
}