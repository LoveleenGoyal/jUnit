package com.bridgelabz.basicJUnit;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class NumberUtilsTest {
    NumberUtils numberUtils;
    @BeforeEach
    void setUp() {
        numberUtils = new NumberUtils();
    }

    @ParameterizedTest
    @CsvSource({
            "2,True",
            "4,True",
            "9,False",
            "10,True"})
    public void isEvenTest(int number, String expected) {
        assertEquals(expected,numberUtils.isEven(number));
    }
}
