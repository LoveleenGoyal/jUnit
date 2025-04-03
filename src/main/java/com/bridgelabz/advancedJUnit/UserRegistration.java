package com.bridgelabz.advancedJUnit;

import java.util.regex.Pattern;

public class UserRegistration {
    public boolean registerUser(String username, String email, String password) {
        String regexName = "^[a-zA-Z]+(\\s[a-zA-Z]+)?$";
        String regexEmail = "^[a-zA-Z\\d][\\w.]*@[a-z]+\\.[a-z]{2,}$";
        String regexPassword = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!@#$%^&*])[A-Za-z\\d!@#$%^&*]{8,}$";

        boolean checkName = Pattern.matches(regexName, username);
        boolean checkEmail = Pattern.matches(regexEmail, email);
        boolean checkPassword = Pattern.matches(regexPassword, password);

        if (!checkName) throw new IllegalArgumentException("Invalid username");
        if (!checkEmail) throw new IllegalArgumentException("Invalid email");
        if (!checkPassword) throw new IllegalArgumentException("Invalid password");

        return true;
    }
}
