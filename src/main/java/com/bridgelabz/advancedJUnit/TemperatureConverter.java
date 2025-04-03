package com.bridgelabz.advancedJUnit;

public class TemperatureConverter {
    public double celsiusToFahrenheit(double celsius) {
        return Math.round(((celsius * (9.0 / 5)) + 32) * 100.0) / 100.0;
    }
    public double fahrenheitToCelsius(double fahrenheit) {
        return Math.round(((fahrenheit - 32) * 5 / 9) * 100.0) / 100.0;
    }
}
