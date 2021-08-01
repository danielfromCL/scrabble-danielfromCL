package cl.uchile.dcc.scrabble.gui.ast.operations;

import cl.uchile.dcc.scrabble.gui.ast.operations.ToInt;
import cl.uchile.dcc.scrabble.gui.types.*;
import cl.uchile.dcc.scrabble.gui.types.Float;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ToIntTest {

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
     * Tests the constructor of the ToInt class.
     */
    @RepeatedTest(20)
    void constructorTest() {
        var expectedToInt = new Int(1);
        ToInt BinaryToInt = new ToInt(bi);
        assertEquals(BinaryToInt.getResult(),expectedToInt);
        ToInt IntToInt = new ToInt(i1);
        assertEquals(IntToInt.getResult(), i1);
        ToInt BoolToInt = new ToInt(bo);
        ToInt StringToInt = new ToInt(t);
        ToInt FloatToInt = new ToInt(f1);
        assertEquals(StringToInt.getResult(), Null);
        assertEquals(FloatToInt.getResult(), Null);
        assertEquals(BoolToInt.getResult(), Null);
    }
}