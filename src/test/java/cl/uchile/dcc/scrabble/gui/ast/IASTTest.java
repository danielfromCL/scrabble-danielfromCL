package cl.uchile.dcc.scrabble.gui.ast;

import cl.uchile.dcc.scrabble.gui.ast.operations.*;
import cl.uchile.dcc.scrabble.gui.types.*;
import cl.uchile.dcc.scrabble.gui.types.Float;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class IASTTest {

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
        random1 = new Random().nextInt(10000000);
        decimal1 = new Random().nextInt() +0.1;
        i1 = new Int(random1);
        f1 = new Float(decimal1);
        bo = new Bool(true);
        bi = new Binary("01");
        t = new TString("hola");
        Null = new NullType();
    }
    /**
     * Tests getResult for every ITypes object.
     * The getResult method for other types of nodes is already tested in the constructorTest of each Class.
     */
    @RepeatedTest(20)
    void getResultTest(){
        assertEquals(i1.getResult(),i1);
        assertEquals(f1.getResult(),f1);
        assertEquals(bi.getResult(),bi);
        assertEquals(bo.getResult(),bo);
        assertEquals(t.getResult(),t);
        assertEquals(Null.getResult(),Null);
    }
    /**
     * Tests some more complex trees with different nodes.
     */
    @RepeatedTest(20)
    void TreeTest(){
        Add add = new Add(bi,i1);
        Mult mult = new Mult(i1,f1);
        Div div = new Div(i1,f1);

        IAST tree = new Add(new Sub(div, add),mult);
        assertEquals(new Float(((random1/decimal1)-(random1+1))+(random1*decimal1)), tree.getResult());
        IAST negtree = new Neg(tree);
        assertEquals(negtree.getResult(), Null);
        IAST tree2 = new ToInt(add);
        assertEquals(tree2.getResult(), new Int(random1+1));
        IAST tree3 = new Neg(new ToBinary(new ToInt(new Add(bi,new Int(1)))));
        assertEquals(tree3.getResult(), new Binary("101"));
        IAST tree4 = new ToFloat(tree3);
        assertEquals(tree4.getResult(), new Float(-3));
    }
}
