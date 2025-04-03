package com.bridgelabz.advancedJUnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureConverterTest {
    TemperatureConverter temperatureConverter;
    @BeforeEach
    void setUp() {
        temperatureConverter = new TemperatureConverter();
    }
    @Test
    public void testValidFahrenheitConversion() {
        assertEquals(98.60,temperatureConverter.celsiusToFahrenheit(37.0));
        assertEquals(32.0,temperatureConverter.celsiusToFahrenheit(0));
    }

    @Test
    public void testValidCelsiusConversion() {
        assertEquals(35.56, temperatureConverter.fahrenheitToCelsius(96.0));
    }
}
