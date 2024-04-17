package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
    public boolean checkEmail(String userEmail ) {
        String email = "(?!\\d)[a-zA-Z0-9]+@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,}){2,}";
        Pattern pattern = Pattern.compile(email);
        Matcher matcher = pattern.matcher(userEmail);

        return matcher.matches();
    }
}
