package cl.uchile.dcc.scrabble.gui.types;

import cl.uchile.dcc.scrabble.gui.types.*;
import cl.uchile.dcc.scrabble.gui.types.Float;
import org.apache.commons.lang3.RandomStringUtils;
import java.util.Random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for every method common to all the ITypes objects.
 */
class ITypesTest {
    private TString st;
    private Bool bot;
    private Bool bof;
    private Binary bi;
    private Int i,j ;
    private Float f,g;
    private String hello;
    private String binary;
    private double decimal;
    private int seed, random;
    private Random rng;
    private char[] ZeroOne =  {'0','1'};
    private NullType Null;

    /**
     * Creates an object for each subclass of the Types class.
     */
    @BeforeEach
    void setUp() {
        seed = new Random().nextInt();
        random = new Random().nextInt();
        rng = new Random(seed);
        int strSize = rng.nextInt(20);
        hello = RandomStringUtils.random(strSize, 0, Character.MAX_CODE_POINT, true, false, null, rng);
        int binarySize = rng.nextInt(20)+1;
        binary = RandomStringUtils.random(binarySize, ZeroOne);
        st = new TString(hello);
        bot = new Bool(true);
        bof = new Bool(false);
        bi = new Binary(binary);
        i = new Int(seed); //seed is a random number
        decimal = seed+0.1; //transformed to double
        f = new Float(decimal);
        g = new Float(random);
        j = new Int(random);
        Null = new NullType();
    }


    /**
     * Tests every sum method for ITypes objects except for Binary objects that do not return Null (those are in the BinaryTest Class).
     */
    @RepeatedTest(20)
    void sumTest(){
        assertEquals(st.sum(i),new TString(hello+seed));
        assertEquals(st.sum(f), new TString(hello+decimal));
        assertEquals(st.sum(bot),new TString(hello+"true"));
        assertEquals(st.sum(bof), new TString(hello+"false"));
        assertEquals(st.sum(bi),new TString(hello+binary));
        String world = "hello world";
        TString wo = new TString(world);
        assertEquals(st.sum(wo), new TString(hello+"hello world"));
        assertEquals(f.sum(f), new Float(2*decimal));
        assertEquals(f.sum(g), new Float(decimal+random));
        assertEquals(f.sum(g), g.sum(f));
        assertEquals(f.sum(i), new Float(decimal+seed));
        assertEquals(f.sum(bi), new Float(decimal+bi.toInt(bi.getBinary())));
        assertEquals(i.sum(f), new Float(seed+decimal));
        assertEquals(i.sum(i), new Int(seed+seed));
        assertEquals(i.sum(j), new Int(seed+random));
        assertEquals(i.sum(j), j.sum(i));
        assertEquals(i.sum(bi), new Int(seed+bi.toInt(bi.getBinary())));

        //nulls
        //Bool + ITypes
        assertEquals(bot.sum(st),Null);
        assertEquals(bof.sum(st),Null);
        assertEquals(bot.sum(bot),Null);
        assertEquals(bof.sum(bot), Null);
        assertEquals(bot.sum(f), Null);
        assertEquals(bof.sum(i), Null);
        assertEquals(bot.sum(bi), Null);
        //Float + ITypes \ {Numbers}
        assertEquals(f.sum(st), Null);
        assertEquals(f.sum(bot), Null);
        assertEquals(f.sum(bof), Null);
        //Int + ITypes \ {Numbers}
        assertEquals(i.sum(st), Null);
        assertEquals(i.sum(bot),Null);
        assertEquals(i.sum(bof), Null);
        //Binary + ITypes \ {Int, Binary}
        assertEquals(bi.sum(st), Null);
        assertEquals(bi.sum(bot), Null);
        assertEquals(bi.sum(f), Null);
        //NullType sums
        assertEquals(Null.sum(st), Null);
        assertEquals(Null.sum(bof), Null);
        assertEquals(Null.sum(f), Null);
        assertEquals(Null.sum(i), Null);
        assertEquals(Null.sum(bi), Null);
        assertEquals(Null.sum(Null), Null);
        assertEquals(st.sum(Null), Null);
        assertEquals(bot.sum(Null), Null);
        assertEquals(f.sum(Null), Null);
        assertEquals(i.sum(Null), Null);
        assertEquals(bi.sum(Null), Null);
    }
    /**
     * Tests every subtraction method for ITypes objects except for Binary objects that do not return Null (those are in the BinaryTest Class).
     */
    @RepeatedTest(20)
    void subTest(){
        assertEquals(f.sub(f), new Float(decimal-decimal));
        assertEquals(f.sub(g), new Float(decimal-random));
        assertEquals(f.sub(i), new Float(decimal-seed));
        assertEquals(f.sub(bi), new Float(decimal-bi.toInt(bi.getBinary())));
        assertEquals(i.sub(f), new Float(seed-decimal));
        assertEquals(i.sub(i), new Int(seed-seed));
        assertEquals(i.sub(bi), new Int(seed-bi.toInt(bi.getBinary())));

        //nulls
        //Bool - ITypes
        assertEquals(bot.sub(st),Null);
        assertEquals(bof.sub(st),Null);
        assertEquals(bot.sub(bot),Null);
        assertEquals(bof.sub(bot), Null);
        assertEquals(bot.sub(f), Null);
        assertEquals(bof.sub(i), Null);
        assertEquals(bot.sub(bi), Null);
        //Float - ITypes \ {Numbers}
        assertEquals(f.sub(st), Null);
        assertEquals(f.sub(bot), Null);
        assertEquals(f.sub(bof), Null);
        //Int - ITypes \ {Numbers}
        assertEquals(i.sub(st), Null);
        assertEquals(i.sub(bot),Null);
        assertEquals(i.sub(bof), Null);
        //Binary - ITypes \ {Int, Binary}
        assertEquals(bi.sub(st), Null);
        assertEquals(bi.sub(bot), Null);
        assertEquals(bi.sub(f), Null);
        //NullType subtractions
        assertEquals(Null.sub(st), Null);
        assertEquals(Null.sub(bof), Null);
        assertEquals(Null.sub(f), Null);
        assertEquals(Null.sub(i), Null);
        assertEquals(Null.sub(bi), Null);
        assertEquals(Null.sub(Null), Null);
        assertEquals(st.sub(Null), Null);
        assertEquals(bot.sub(Null), Null);
        assertEquals(f.sub(Null), Null);
        assertEquals(i.sub(Null), Null);
        assertEquals(bi.sub(Null), Null);
    }
    /**
     * Tests every division method for ITypes objects except for Binary objects that do not return Null (those are in the BinaryTest Class).
     */
    @RepeatedTest(20)
    void divTest(){
        assertEquals(f.div(f), new Float(decimal/decimal));
        if(random == 0){
            random+=1;
            g= new Float(random);
        }
        assertEquals(f.div(g), new Float(decimal/random));
        assertEquals(f.div(i), new Float(decimal/seed));
        String binary2 = binary+"1"; //just to be sure we're not dividing by zero
        Binary bin = new Binary(binary2);
        assertEquals(f.div(bin), new Float(decimal/bin.toInt(bin.getBinary())));
        assertEquals(i.div(f), new Float(seed/decimal));
        assertEquals(i.div(i), new Int(seed/seed));
        assertEquals(i.div(j), new Int(seed/random));
        assertEquals(i.div(bin), new Int(seed/bi.toInt(bin.getBinary())));

        //nulls
        //Bool / ITypes
        assertEquals(bot.div(st),Null);
        assertEquals(bof.div(st),Null);
        assertEquals(bot.div(bot),Null);
        assertEquals(bof.div(bot), Null);
        assertEquals(bot.div(f), Null);
        assertEquals(bof.div(i), Null);
        assertEquals(bot.div(bi), Null);
        //Float / ITypes \ {Numbers}
        assertEquals(f.div(st), Null);
        assertEquals(f.div(bot), Null);
        assertEquals(f.div(bof), Null);
        //Int / ITypes \ {Numbers}
        assertEquals(i.div(st), Null);
        assertEquals(i.div(bot),Null);
        assertEquals(i.div(bof), Null);
        //Binary / ITypes \ {Int, Binary}
        assertEquals(bi.div(st), Null);
        assertEquals(bi.div(bot), Null);
        assertEquals(bi.div(f), Null);
        //NullType divisions
        assertEquals(Null.div(st), Null);
        assertEquals(Null.div(bof), Null);
        assertEquals(Null.div(f), Null);
        assertEquals(Null.div(i), Null);
        assertEquals(Null.div(bi), Null);
        assertEquals(Null.div(Null), Null);
        assertEquals(st.div(Null), Null);
        assertEquals(bot.div(Null), Null);
        assertEquals(f.div(Null), Null);
        assertEquals(i.div(Null), Null);
        assertEquals(bi.div(Null), Null);
    }
    /**
     * Tests every multiplication method for ITypes objects except for Binary objects that do not return Null (those are in the BinaryTest Class).
     */
    @RepeatedTest(20)
    void multTest(){
        assertEquals(f.mult(f), new Float(decimal*decimal));
        assertEquals(f.mult(g), new Float(decimal*random));
        assertEquals(f.mult(g), g.mult(f));
        assertEquals(f.mult(i), new Float(decimal*seed));
        assertEquals(f.mult(bi), new Float(decimal*bi.toInt(bi.getBinary())));
        assertEquals(i.mult(f), new Float(seed*decimal));
        assertEquals(i.mult(i), new Int(seed*seed));
        assertEquals(i.mult(j), new Int(seed*random));
        assertEquals(i.mult(j), j.mult(i));
        assertEquals(i.mult(bi), new Int(seed*bi.toInt(bi.getBinary())));

        //nulls
        //Bool * ITypes
        assertEquals(bot.mult(st),Null);
        assertEquals(bof.mult(st),Null);
        assertEquals(bot.mult(bot),Null);
        assertEquals(bof.mult(bot), Null);
        assertEquals(bot.mult(f), Null);
        assertEquals(bof.mult(i), Null);
        assertEquals(bot.mult(bi), Null);
        //Float * ITypes \ {Numbers}
        assertEquals(f.mult(st), Null);
        assertEquals(f.mult(bot), Null);
        assertEquals(f.mult(bof), Null);
        //Int * ITypes \ {Numbers}
        assertEquals(i.mult(st), Null);
        assertEquals(i.mult(bot),Null);
        assertEquals(i.mult(bof), Null);
        //Binary * ITypes \ {Int, Binary}
        assertEquals(bi.mult(st), Null);
        assertEquals(bi.mult(bot), Null);
        assertEquals(bi.mult(f), Null);
        //NullType multiplications
        assertEquals(Null.mult(st), Null);
        assertEquals(Null.mult(bof), Null);
        assertEquals(Null.mult(f), Null);
        assertEquals(Null.mult(i), Null);
        assertEquals(Null.mult(bi), Null);
        assertEquals(Null.mult(Null), Null);
        assertEquals(st.mult(Null), Null);
        assertEquals(bot.mult(Null), Null);
        assertEquals(f.mult(Null), Null);
        assertEquals(i.mult(Null), Null);
        assertEquals(bi.mult(Null), Null);
    }

    /**
     * Tests every logical operator method between ITypes objects.
     */
    @RepeatedTest(20)
    void logicalOperatorsTest() {
        assertEquals(bi.or(bot), new Binary("1"));
        assertEquals(bi.or(bof), bi);
        assertEquals(bi.and(bot), bi);
        assertEquals(bi.and(bof), new Binary("0"));
        assertEquals(bot.or(bi), new Binary("1"));
        assertEquals(bof.or(bi), bi);
        assertEquals(bot.and(bi), bi);
        assertEquals(bof.and(bi), new Binary("0"));
        assertEquals(bot.and(bot), bot);
        assertEquals(bot.and(bof),bof);
        assertEquals(bof.and(bot),bof);
        assertEquals(bof.and(bof),bof);
        assertEquals(bot.or(bot), bot);
        assertEquals(bot.or(bof),bot);
        assertEquals(bof.or(bot),bot);
        assertEquals(bof.or(bof),bof);
        Binary b1 = new Binary("10001");
        Binary b2 = new Binary("1001011");
        assertEquals(b1.or(b2), new Binary("1111011"));
        assertEquals(b1.and(b2), new Binary("1000001"));
        assertEquals(b1.or(b2), b2.or(b1));
        assertEquals(b1.and(b2),b2.and(b1));
        assertEquals(bi.or(bi), bi);
        assertEquals(bi.and(bi),bi);
        Binary notbi = bi.neg();
        assertEquals(bi.or(notbi), new Binary("1"));
        assertEquals(bi.and(notbi), new Binary("0"));

        //nulls
        //Bool or ITypes \ {Logicals}
        assertEquals(bot.or(st),Null);
        assertEquals(bof.or(st),Null);
        assertEquals(bot.or(f), Null);
        assertEquals(bof.or(i), Null);
        //Float or ITypes
        assertEquals(f.or(st), Null);
        assertEquals(f.or(bot), Null);
        assertEquals(f.or(bof), Null);
        assertEquals(f.or(i), Null);
        assertEquals(f.or(g), Null);
        assertEquals(f.or(bi), Null);
        //Int or ITypes
        assertEquals(i.or(st), Null);
        assertEquals(i.or(bot),Null);
        assertEquals(i.or(bof), Null);
        assertEquals(i.or(j), Null);
        assertEquals(i.or(f), Null);
        assertEquals(i.or(bi), Null);
        //Binary or ITypes \ {Logicals}
        assertEquals(bi.or(st), Null);
        assertEquals(bi.or(f), Null);
        assertEquals(bi.or(i), Null);
        //NullType or ITypes
        assertEquals(Null.or(st), Null);
        assertEquals(Null.or(bof), Null);
        assertEquals(Null.or(f), Null);
        assertEquals(Null.or(i), Null);
        assertEquals(Null.or(bi), Null);
        assertEquals(Null.or(Null), Null);
        assertEquals(st.or(Null), Null);
        assertEquals(bot.or(Null), Null);
        assertEquals(f.or(Null), Null);
        assertEquals(i.or(Null), Null);
        assertEquals(bi.or(Null), Null);

        //Bool and ITypes \ {Logicals}
        assertEquals(bot.and(st),Null);
        assertEquals(bof.and(st),Null);
        assertEquals(bot.and(f), Null);
        assertEquals(bof.and(i), Null);
        //Float and ITypes
        assertEquals(f.and(st), Null);
        assertEquals(f.and(bot), Null);
        assertEquals(f.and(bof), Null);
        assertEquals(f.and(i), Null);
        assertEquals(f.and(g), Null);
        assertEquals(f.and(bi), Null);
        //Int and ITypes
        assertEquals(i.and(st), Null);
        assertEquals(i.and(bot),Null);
        assertEquals(i.and(bof), Null);
        assertEquals(i.and(j), Null);
        assertEquals(i.and(f), Null);
        assertEquals(i.and(bi), Null);
        //Binary and ITypes \ {Logicals}
        assertEquals(bi.and(st), Null);
        assertEquals(bi.and(f), Null);
        assertEquals(bi.and(i), Null);
        //NullType and ITypes
        assertEquals(Null.and(st), Null);
        assertEquals(Null.and(bof), Null);
        assertEquals(Null.and(f), Null);
        assertEquals(Null.and(i), Null);
        assertEquals(Null.and(bi), Null);
        assertEquals(Null.and(Null), Null);
        assertEquals(st.and(Null), Null);
        assertEquals(bot.and(Null), Null);
        assertEquals(f.and(Null), Null);
        assertEquals(i.and(Null), Null);
        assertEquals(bi.and(Null), Null);

    }
    /**
     * Tests the negation method for every ITypes object.
     */
    @RepeatedTest(20)
    void negTest(){
        assertEquals(bot.neg(),bof);
        assertEquals(bof.neg(),bot);
        assertNotEquals(bot.neg(),bot);
        assertNotEquals(bof.neg(),bof);
        Binary b1 = new Binary("10101");
        Binary notb1 = new Binary("01010");
        Binary b2 = new Binary("0100110");
        Binary notb2 = new Binary("1011001");
        assertEquals(b1.neg(),notb1);
        assertEquals(notb1.neg(),b1);
        assertEquals(b2.neg(),notb2);
        assertEquals(notb2.neg(),b2);
        Binary b3 = new Binary("00000000000");
        Binary notb3 = new Binary("1");
        Binary b4 = new Binary("00000000001");
        Binary notb4 = new Binary("10");
        assertEquals(b3.neg(),notb3);
        assertEquals(notb3.neg(),b3);
        assertEquals(b4.neg(),notb4);
        assertEquals(notb4.neg(),b4);
        Binary b5 = new Binary("11111111");
        Binary notb5 = new Binary("0");
        Binary b6 = new Binary("11111110");
        Binary notb6 = new Binary("01");
        assertEquals(b5.neg(),notb5);
        assertEquals(notb5.neg(),b5);
        assertEquals(b6.neg(),notb6);
        assertEquals(notb6.neg(),b6);

        //Nulls
        assertEquals(f.neg(), Null);
        assertEquals(i.neg(), Null);
        assertEquals(st.neg(), Null);
        assertEquals(Null.neg(), Null);

    }

    /**
     * Tests the transformation to Float for every ITypes object.
     */
    @RepeatedTest(20)
    void transformtoFloatTest(){
        assertEquals(f.transformtoFloat(), f);
        assertEquals(i.transformtoFloat(),new Float(seed));
        assertEquals(bi.transformtoFloat(), new Float(bi.toInt(bi.getBinary())));

        //Nulls
        assertEquals(st.transformtoFloat(),Null);
        assertEquals(bot.transformtoFloat(),Null);
        assertEquals(bof.transformtoFloat(),Null);
        assertEquals(Null.transformtoFloat(),Null);
    }
    /**
     * Tests the transformation to Int for every ITypes object.
     */
    @RepeatedTest(20)
    void transformtoIntTest() {
        assertEquals(bi.transformtoInt(), new Int(bi.toInt(binary)));
        assertEquals(i.transformtoInt(),i);

        //Nulls
        assertEquals(f.transformtoInt(),Null);
        assertEquals(st.transformtoInt(),Null);
        assertEquals(bot.transformtoInt(),Null);
        assertEquals(bof.transformtoInt(),Null);
        assertEquals(Null.transformtoInt(),Null);
    }
    /**
     * Tests the transformation to Binary for every ITypes object.
     */
    @RepeatedTest(20)
    void transformtoBinaryTest() {
        assertEquals(bi.transformtoBinary(),bi);
        assertEquals(i.transformtoBinary(), new Binary(i.intToBinary(seed)));

        //Nulls
        assertEquals(f.transformtoBinary(),Null);
        assertEquals(st.transformtoBinary(),Null);
        assertEquals(bot.transformtoBinary(),Null);
        assertEquals(bof.transformtoBinary(),Null);
        assertEquals(Null.transformtoBinary(),Null);

    }
    /**
     * Tests the transformation to Bool for every ITypes object.
     */
    @Test
    void transformtoBoolTest() {
        assertEquals(bot.transformtoBool(),bot);
        assertEquals(bof.transformtoBool(),bof);
        assertNotEquals(bot.transformtoBool(),bof);
        assertNotEquals(bof.transformtoBool(),bot);

        //Nulls
        assertEquals(f.transformtoBool(),Null);
        assertEquals(st.transformtoBool(),Null);
        assertEquals(i.transformtoBool(),Null);
        assertEquals(bi.transformtoBool(),Null);
        assertEquals(Null.transformtoBool(),Null);
    }
    /**
     * Tests every transformation method to TString.
     */
    @RepeatedTest(20)
    void transformtoTStringTest(){
        assertEquals(st.transformtoString(),new TString(hello));
        assertEquals(bot.transformtoString(),new TString(bot.toString()));
        assertEquals(bof.transformtoString(),new TString(bof.toString()));
        assertEquals(f.transformtoString(),new TString(f.toString()));
        assertEquals(i.transformtoString(),new TString(i.toString()));
        assertEquals(bi.transformtoString(),new TString(bi.toString()));
        assertEquals(Null.transformtoString(), Null);
    }

}