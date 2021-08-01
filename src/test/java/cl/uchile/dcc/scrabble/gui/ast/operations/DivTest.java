package cl.uchile.dcc.scrabble.gui.ast.operations;

import cl.uchile.dcc.scrabble.gui.types.*;
import cl.uchile.dcc.scrabble.gui.types.Float;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class DivTest {

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
     * Tests the constructor of the Div class.
     */
    @RepeatedTest(20)
    void constructorTest() {
        while(random2== 0){
            random2 = new Random().nextInt();
        }
        var expectedDiv = new Int(random1/random2);
        Div IntInt = new Div(i1, i2);
        Div FloatInt = new Div(f2, i1);
        Div BinaryInt = new Div(bi, i1);
        assertEquals(IntInt.getResult(), expectedDiv);
        while(random1== 0){
            random1 = new Random().nextInt();
        }
        var expectedDiv2 = new Float(decimal2/random1);
        assertEquals(FloatInt.getResult(), expectedDiv2);
        var NotExpectedDiv = new Div(i1, bi);
        assertNotEquals(BinaryInt.getResult(), NotExpectedDiv.getResult());

        Div StringInt = new Div(t, i1);
        assertEquals(StringInt.getResult(), Null);
        Div BoolInt = new Div(bo, i1);
        assertEquals(BoolInt.getResult(), Null);
        Div IntString = new Div(i1, t);
        assertEquals(IntString.getResult(), Null);
        Div FloatString = new Div(f1, t);
        assertEquals(FloatString.getResult(), Null);
        Div BoolString = new Div(bo, t);
        assertEquals(BoolString.getResult(), Null);
        Div StringString = new Div(t, t);
        assertEquals(StringString.getResult(),Null);
        Div IntBool = new Div(i1,bo);
        assertEquals(IntBool.getResult(), Null);
        Div FloatBool = new Div(f1,bo);
        assertEquals(FloatBool.getResult(), Null);
        Div BinaryBool = new Div(bi,bo);
        assertEquals(BinaryBool.getResult(), Null);
        Div StringBool = new Div(t,bo);
        assertEquals(StringBool.getResult(), Null);

        Div DivTree1 = new Div(IntInt, i1);
        assertEquals(DivTree1.getResult(), new Int(random1/random2/random1));
        Div DivTree2 = new Div(IntInt, FloatInt);
        assertEquals(DivTree2.getResult(), new Float(random1/random2/(decimal2/random1)));
    }
}