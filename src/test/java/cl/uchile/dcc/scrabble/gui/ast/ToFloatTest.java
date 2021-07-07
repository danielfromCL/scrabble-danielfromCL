package cl.uchile.dcc.scrabble.gui.ast;

import cl.uchile.dcc.scrabble.gui.types.*;
import cl.uchile.dcc.scrabble.gui.types.Float;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ToFloatTest {

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
     * Tests the constructor of the ToFloat class.
     */
    @RepeatedTest(20)
    void constructorTest() {
        var expectedToFloat = f1;
        ToFloat FloatToFloat = new ToFloat(f1);
        assertEquals(FloatToFloat.getResult(), expectedToFloat);
        ToFloat BinaryToFloat = new ToFloat(bi);
        assertEquals(BinaryToFloat.getResult(),new Float(1));
        ToFloat IntToFloat = new ToFloat(i1);
        assertEquals(IntToFloat.getResult(), new Float(random1));
        ToFloat StringToFloat = new ToFloat(t);
        ToFloat BoolToFloat = new ToFloat(bo);
        assertEquals(BoolToFloat.getResult(), Null);
        assertEquals(StringToFloat.getResult(), Null);
    }
}