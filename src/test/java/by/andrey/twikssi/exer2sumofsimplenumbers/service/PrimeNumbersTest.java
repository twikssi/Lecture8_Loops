package by.andrey.twikssi.exer2sumofsimplenumbers.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeNumbersTest {

    @Test
    public void getSumPrimeNumbers() {
      int[] arrayResult = PrimeNumbers.getSumPrimeNumbers();

      int expected = 5501;
      int actual = arrayResult[0];

      assertEquals(expected, actual);

      expected = 50;
      actual = arrayResult[1];

      assertEquals(expected,actual);

    }
}