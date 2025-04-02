package com.bridgelabz.basicJUnit;

public class StringUtility {
    // Reverse the given string
    public static String reverse(String str) {
        if (str == null) return null;
        return new StringBuilder(str).reverse().toString();
    }

    // Check if the string is a palindrome
    public static boolean isPalindrome(String str) {
        if (str == null) return false;
        String reversed = reverse(str);
        return str.equalsIgnoreCase(reversed);
    }

    // Convert a string to uppercase
    public static String toUpperCase(String str) {
        if (str == null) return null;
        return str.toUpperCase();
    }
}
