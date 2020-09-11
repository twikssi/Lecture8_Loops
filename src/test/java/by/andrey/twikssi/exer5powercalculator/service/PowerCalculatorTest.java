package by.andrey.twikssi.exer5powercalculator.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class PowerCalculatorTest {

    @Test
    public void getNumberIntDegree() {
        String expected = "1";
        String actual = PowerCalculator.getNumberIntDegree(10,0);

        assertEquals(expected,actual);
    }

    @Test
    public void getNumberIntDegreePositive() {
        String expected = "256";
        String actual = PowerCalculator.getNumberIntDegree(2,8);

        assertEquals(expected,actual);
    }

    @Test
    public void getNumberIntDegreeNegative() {
        String expected = "1/256";
        String actual = PowerCalculator.getNumberIntDegree(2,-8);

        assertEquals(expected,actual);
    }
}