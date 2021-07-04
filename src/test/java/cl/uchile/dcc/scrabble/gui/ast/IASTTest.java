package cl.uchile.dcc.scrabble.gui.ast;

import cl.uchile.dcc.scrabble.gui.types.*;
import cl.uchile.dcc.scrabble.gui.types.Float;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class IASTTest {

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
    @Test
    void getResultTest(){

    }
}
