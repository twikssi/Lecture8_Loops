package by.andrey.twikssi.exer3numberservice.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberServiceTest {

    @Test
    public void sum() {
        int expected = 4+5+6+7+8+9+10;
        int actual = NumberService.sum(4,10);

        assertEquals(expected,actual);
    }

    @Test
    public void sumOneValue() {
        int expected = 4;
        int actual = NumberService.sum(4,4);

        assertEquals(expected,actual);
    }

    @Test
    public void sumZero() {
        int expected = 0;
        int actual = NumberService.sum(0,0);

        assertEquals(expected,actual);
    }

    @Test
    public void rangeSumStartMoreThanFinish() {
        int expected = 9;
        int actual = NumberService.rangeSum(5,4);

        assertEquals(expected,actual);
    }

    @Test
    public void rangeSumNumber() {
        int expected = 3+4+5+6+7+8;
        int actual = NumberService.rangeSum(3,8);

        assertEquals(expected,actual);
    }

    @Test
    public void rangeSumZero() {
        int expected = 0;
        int actual = NumberService.rangeSum(0,0);

        assertEquals(expected,actual);
    }
}