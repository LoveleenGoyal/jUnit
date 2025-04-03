package com.bridgelabz.advancedJUnit;

import java.util.regex.Pattern;

public class PasswordValidator {
    public boolean validPassword(String password) {
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)[A-Za-z\\d]{8,}$";

        return Pattern.matches(regex, password);
    }

}
