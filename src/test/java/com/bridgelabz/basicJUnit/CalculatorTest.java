package com.bridgelabz.basicJUnit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    public void addTest() {
        assertEquals(60, Calculator.add(15, 45));
        assertEquals(0, Calculator.add(-5,5));
    }

    @Test
    public void subtractTest() {
        assertEquals(2, Calculator.subtract(6, 4));
        assertEquals(-10, Calculator.subtract(-5, 5));
    }

    @Test
    public void multiplyTest() {
        assertEquals(675, Calculator.multiply(15, 45));
        assertEquals(-25, Calculator.multiply(-5, 5));
    }

    @Test
    public void divideTest() {
        assertEquals(2, Calculator.divide(10, 5));
    }

    @Test
    public void divideByZeroTest() {
        assertThrows(ArithmeticException.class, () -> Calculator.divide(10, 0));
    }
}
