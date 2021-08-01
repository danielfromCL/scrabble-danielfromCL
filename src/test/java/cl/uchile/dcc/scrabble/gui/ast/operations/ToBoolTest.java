package cl.uchile.dcc.scrabble.gui.ast.operations;

import cl.uchile.dcc.scrabble.gui.types.*;
import cl.uchile.dcc.scrabble.gui.types.Float;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ToBoolTest {

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
     * Tests the constructor of the ToBool class.
     */
    @RepeatedTest(20)
    void constructorTest() {
        var expectedToBool = bo;
        ToBool BoolToBool = new ToBool(bo);
        assertEquals(BoolToBool.getResult(), expectedToBool);
        ToBool BinaryToBool = new ToBool(bi);
        assertEquals(BinaryToBool.getResult(),Null);
        ToBool IntToBool = new ToBool(i1);
        assertEquals(IntToBool.getResult(), Null);
        ToBool StringToBool = new ToBool(t);
        ToBool FloatToBool = new ToBool(f1);
        assertEquals(StringToBool.getResult(), Null);
        assertEquals(FloatToBool.getResult(), Null);

    }
}