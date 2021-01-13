package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 4;
        String b = "5";
        int c = a + b; // gives an error, because cant add Strings as numbers
        int d = a + (int)b; // works because now b is cast as an int
    }
}
