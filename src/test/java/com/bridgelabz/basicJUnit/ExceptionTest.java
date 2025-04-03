package com.bridgelabz.basicJUnit;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
