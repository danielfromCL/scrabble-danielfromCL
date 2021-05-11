package cl.uchile.dcc.scrabble.gui;

import org.apache.commons.lang3.RandomStringUtils;
import java.util.Random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ITypesTest {
    private TString st;
    private Bool bo;
    private Binary bi;
    private Int i;
    private Float f;
    private String hello;
    private String binary;
    private double decimal;
    private int seed;
    private Random rng;
    private char[] ZeroOne =  {'0','1'};

    @BeforeEach
    void setUp() {
        seed = new Random().nextInt();
        rng = new Random(seed);
        int strSize = rng.nextInt(20);
        hello = RandomStringUtils.random(strSize, 0, Character.MAX_CODE_POINT, true, false, null, rng);
        binary = RandomStringUtils.random(strSize, ZeroOne);
        st = new TString(hello);
        bo = new Bool(true);
        bi = new Binary(binary);
        i = new Int(seed); //seed is a random number
        decimal = seed+0.1; //transformed to double
        f = new Float(decimal);

    }





}