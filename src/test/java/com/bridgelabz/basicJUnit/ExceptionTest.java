package com.bridgelabz.basicJUnit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class ExceptionTest {
    @Test
    public void divideTest() {
        assertEquals(2, ExceptionHandling.divide(10, 5));
    }

    @Test
    public void divideByZeroTest() {
        assertThrows(ArithmeticException.class, () -> ExceptionHandling.divide(10, 0));
    }

}
