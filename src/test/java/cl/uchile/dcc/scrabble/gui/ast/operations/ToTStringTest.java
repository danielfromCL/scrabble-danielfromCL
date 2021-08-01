package cl.uchile.dcc.scrabble.gui.ast.operations;

import cl.uchile.dcc.scrabble.gui.types.*;
import cl.uchile.dcc.scrabble.gui.types.Float;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ToTStringTest {

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
     * Tests the constructor of the ToTString class.
     */
    @RepeatedTest(20)
    void constructorTest() {
        var expectedToTString = t;
        ToTString BinaryToTString = new ToTString(bi);
        assertEquals(BinaryToTString.getResult(),new TString("01"));
        ToTString IntToTString = new ToTString(i1);
        assertEquals(IntToTString.getResult(), new TString(""+random1));
        ToTString BoolToTString = new ToTString(bo);
        ToTString StringToTString = new ToTString(t);
        ToTString FloatToTString = new ToTString(f1);
        assertEquals(StringToTString.getResult(), expectedToTString);
        assertEquals(FloatToTString.getResult(), new TString(""+decimal1));
        assertEquals(BoolToTString.getResult(), new TString("true"));
    }
}