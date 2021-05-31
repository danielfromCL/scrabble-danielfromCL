package cl.uchile.dcc.scrabble.gui;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ILogicalTest {
    private Bool bot;
    private Bool bof;
    private Binary bi;
    private String binary;
    private int seed;
    private Random rng;
    private char[] ZeroOne =  {'0','1'};

    /**
     * Creates an object for each subclass of the ILogical class.
     */
    @BeforeEach
    void setUp() {
        seed = new Random().nextInt();
        rng = new Random(seed);
        int strSize = rng.nextInt(20);
        binary = RandomStringUtils.random(strSize, ZeroOne);
        bot = new Bool(true);
        bof = new Bool(false);
        bi = new Binary(binary);
    }


    /**
     * Tests every logical operator method between ILogical objects.
     */
    @RepeatedTest(20)
    void logicalOperatorsTest() {
    }
}