package com.bridgelabz.basicJUnit;

import org.junit.Test;
import static org.junit.Assert.*;

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
