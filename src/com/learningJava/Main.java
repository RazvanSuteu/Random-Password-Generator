package com.learningJava;


public class Main extends Password {

    public static void main(String[] args) {

        int length = 12;
        System.out.println("Generating a random password: ");
        System.out.println(getpassword(length));
    }
}
