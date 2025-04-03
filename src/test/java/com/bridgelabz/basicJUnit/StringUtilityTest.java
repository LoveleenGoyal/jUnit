package com.bridgelabz.basicJUnit;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilityTest {
    @Test
    public void reverseTest() {
        assertEquals("cba", StringUtility.reverse("abc"));
        assertEquals("neelevoL", StringUtility.reverse("Loveleen"));
    }

    @Test
    public void isPalindromeTest() {
        assertTrue(StringUtility.isPalindrome("Wow"));
        assertFalse(StringUtility.isPalindrome("loveleen"));
    }

    @Test
    public void toUpperCase() {
        assertEquals("LOVELEEN",StringUtility.toUpperCase("loveleen"));
        assertEquals("YAGYATA", StringUtility.toUpperCase("yaGyatA"));
    }
}
