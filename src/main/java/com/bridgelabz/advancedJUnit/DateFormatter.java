package com.bridgelabz.advancedJUnit;

import java.time.LocalDate;
import java.time.format.*;

public class DateFormatter {
    public String formatDate(String inputDate) {
        try {
            DateTimeFormatter input = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            DateTimeFormatter output = DateTimeFormatter.ofPattern("dd-MM-yyyy");

            LocalDate date = LocalDate.parse(inputDate,input);
            return date.format(output);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid date format.");
        }
    }
}
