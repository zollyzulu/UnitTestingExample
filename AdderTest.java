package edu.wctc.demotest;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * Created by zolly on 2/15/2018.
 */

public class AdderTest {

    //public static int addTheNumbers(int a, int b)
    @Test
    public void addTheNumbersTest() {
        // use if you had an greater(lessor) than or equal to
        assertTrue("Adder produced incorrect return value: ", Adder.addTheNumbers(4, 5) == 9);
        // or you can use this if you don't
        assertEquals("Adder produced the wrong number: ", 9, Adder.addTheNumbers(4,5));

    }
}
