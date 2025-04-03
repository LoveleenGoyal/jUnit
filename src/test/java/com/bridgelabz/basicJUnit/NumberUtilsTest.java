package com.bridgelabz.basicJUnit;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class NumberUtilsTest {
    NumberUtils numberUtils;
    @BeforeEach
    void setUp() {
        numberUtils = new NumberUtils();
    }
    @ParameterizedTest
    @ValueSource(ints = {2,4,9,10})
    public void isEvenTest(int number) {
        assertTrue(numberUtils.isEven(number));
    }
}
