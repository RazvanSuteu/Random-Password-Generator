package com.learningJava;

import java.util.Random;

public class Password {

    static char[] getpassword(int len) {

        String capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String small_chars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*()_+<>?";
        String values = capital_chars + small_chars + numbers + symbols;
        Random random_method = new Random();
        char[] password = new char[len];
        for (int i = 0; i < len; i++) {
            password[i] = values.charAt(random_method.nextInt(values.length()));
        }
        return password;
    }
}

