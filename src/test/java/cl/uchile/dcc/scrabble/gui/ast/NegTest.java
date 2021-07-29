package cl.uchile.dcc.scrabble.gui.ast;

import cl.uchile.dcc.scrabble.gui.ast.operations.Neg;
import cl.uchile.dcc.scrabble.gui.types.*;
import cl.uchile.dcc.scrabble.gui.types.Float;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class NegTest {

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
     * Tests the constructor of the Neg class.
     */
    @RepeatedTest(20)
    void constructorTest() {
        var expectedNeg = new Binary("10");
        Neg Binaryneg = new Neg(bi);
        Neg Boolneg = new Neg(bo);
        assertEquals(Binaryneg.getResult(),expectedNeg);
        assertEquals(Boolneg.getResult(), new Bool(false));
        Neg Stringneg = new Neg(t);
        Neg Floatneg = new Neg(f1);
        Neg Intneg = new Neg(i1);
        assertEquals(Stringneg.getResult(), Null);
        assertEquals(Floatneg.getResult(), Null);
        assertEquals(Intneg.getResult(), Null);
    }
}