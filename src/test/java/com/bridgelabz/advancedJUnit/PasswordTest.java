package com.bridgelabz.advancedJUnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordTest {
    PasswordValidator passwordValidator;
    @BeforeEach
    void setUp() {
        passwordValidator = new PasswordValidator();
    }
    @ParameterizedTest
    @CsvSource({"loveLeen123,true","loveleen,false"})
    public void testValidPassword(String password,boolean expected) {
        assertEquals(expected,passwordValidator.validPassword(password));
    }
}
