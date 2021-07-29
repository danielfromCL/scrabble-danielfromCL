package cl.uchile.dcc.scrabble.gui.ast;

import cl.uchile.dcc.scrabble.gui.ast.operations.Add;
import cl.uchile.dcc.scrabble.gui.types.*;
import cl.uchile.dcc.scrabble.gui.types.Float;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class AddTest {

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
     * Tests the constructor of the Add class.
     */
    @RepeatedTest(20)
    void constructorTest() {
        var expectedAdd = new Int(random1+random2);
        Add IntInt = new Add(i1, i2);
        Add FloatInt = new Add(f2, i1);
        Add BinaryInt = new Add(bi, i1);
        assertEquals(IntInt.getResult(), expectedAdd);
        var expectedAdd2 = new Float(decimal2+random1);
        assertEquals(FloatInt.getResult(), expectedAdd2);
        var NotExpectedAdd = new Add(i1, bi);
        assertNotEquals(BinaryInt.getResult(), NotExpectedAdd.getResult());

        Add StringInt = new Add(t, i1);
        assertEquals(StringInt.getResult(), new TString("hola"+random1));
        Add BoolInt = new Add(bo, i1);
        assertEquals(BoolInt.getResult(), Null);
        Add IntString = new Add(i1, t);
        assertEquals(IntString.getResult(), Null);
        Add FloatString = new Add(f1, t);
        assertEquals(FloatString.getResult(), Null);
        Add BoolString = new Add(bo, t);
        assertEquals(BoolString.getResult(), Null);
        Add StringString = new Add(t, t);
        assertEquals(StringString.getResult(), new TString("holahola"));
        Add IntBool = new Add(i1,bo);
        assertEquals(IntBool.getResult(), Null);
        Add FloatBool = new Add(f1,bo);
        assertEquals(FloatBool.getResult(), Null);
        Add BinaryBool = new Add(bi,bo);
        assertEquals(BinaryBool.getResult(), Null);
        Add StringBool = new Add(t,bo);
        assertEquals(StringBool.getResult(), new TString("holatrue"));

        Add AddedTree1 = new Add(IntInt, i1);
        assertEquals(AddedTree1.getResult(), new Int(random1+random2+random1));
        Add AddedTree2 = new Add(IntInt, FloatInt);
        assertEquals(AddedTree2.getResult(), new Float(random1+random2+decimal2+random1));
    }
}
