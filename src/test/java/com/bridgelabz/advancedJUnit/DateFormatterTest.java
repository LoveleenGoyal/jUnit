package com.bridgelabz.advancedJUnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DateFormatterTest {
    DateFormatter dateFormatter;
    @BeforeEach
    void setUp() {
        dateFormatter = new DateFormatter();
    }
    @Test
    public void testValidFormatDate() {
        assertEquals("01-04-2025", dateFormatter.formatDate("2025-04-01"));
        assertEquals("26-06-2003", dateFormatter.formatDate("2003-06-26"));
    }

    @Test
    public void testInvalidDate() {
        assertThrows(IllegalArgumentException.class, () -> dateFormatter.formatDate("12-14-2023"), "Invalid Date");
    }

    @Test
    public void testInvalidDateFormat() {
        assertThrows(IllegalArgumentException.class, () -> dateFormatter.formatDate("12/02/2002"),"Invalid date format");
    }
}
