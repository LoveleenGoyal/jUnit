package com.bridgelabz.advancedJUnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {
    UserRegistration userRegistration;
    @BeforeEach
    void setUp() {
        userRegistration = new UserRegistration();
    }

//    @ParameterizedTest
//    @CsvSource({
//            "Loveleen Goyal, loveleen@gmail.com, 123Loveleen!, true",
//            "Loveleen, loveleenGmail.com, 123Loveleen, false",
//            "love1, loveleen@gmail.com, 123Love, false"
//    })
    @Test
    public void testValidRegisterUser() {
        assertTrue(userRegistration.registerUser("Loveleen Goyal", "loveleen@gmail.com", "123Loveleen!"));
    }

    @Test
    public void testInvalidUsername() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> userRegistration.registerUser("love1", "loveleen@gmail.com", "123Love!"));
        assertEquals("Invalid username", e.getMessage());
    }

    @Test
    public void testInvalidEmail() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> userRegistration.registerUser("love", "loveleenGmail.com", "123Love!"));
        assertEquals("Invalid email", e.getMessage());
    }

    @Test
    public void testInvalidPassword() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> userRegistration.registerUser("love", "loveleen@gmail.com", "123Love"));
        assertEquals("Invalid password", e.getMessage());
    }

    @Test
    public void testEmptyFields() {
        assertThrows(IllegalArgumentException.class, () -> userRegistration.registerUser("", "love@example.com", "Password@123"));
        assertThrows(IllegalArgumentException.class, () -> userRegistration.registerUser("Love Goyal", "", "Password@123"));
        assertThrows(IllegalArgumentException.class, () -> userRegistration.registerUser("Love", "love@example.com", ""));
    }
}
