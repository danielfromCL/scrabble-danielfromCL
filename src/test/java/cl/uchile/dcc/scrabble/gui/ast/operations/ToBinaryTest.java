package cl.uchile.dcc.scrabble.gui.ast.operations;

import cl.uchile.dcc.scrabble.gui.ast.operations.ToBinary;
import cl.uchile.dcc.scrabble.gui.types.*;
import cl.uchile.dcc.scrabble.gui.types.Float;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ToBinaryTest {

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
     * Tests the constructor of the ToBinary class.
     */
    @RepeatedTest(20)
    void constructorTest() {
        var expectedToBinary = bi;
        ToBinary BinaryToBinary = new ToBinary(bi);
        assertEquals(BinaryToBinary.getResult(),expectedToBinary);
        ToBinary IntToBinary = new ToBinary(new Int(1));
        assertEquals(IntToBinary.getResult(), bi);
        ToBinary BoolToBinary = new ToBinary(bo);
        ToBinary StringToBinary = new ToBinary(t);
        ToBinary FloatToBinary = new ToBinary(f1);
        assertEquals(StringToBinary.getResult(), Null);
        assertEquals(FloatToBinary.getResult(), Null);
        assertEquals(BoolToBinary.getResult(), Null);
    }
}