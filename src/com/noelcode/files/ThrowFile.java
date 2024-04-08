package com.noelcode.files;

public class ThrowFile {
    public static void main(String[] args) {
        System.out.println(divide(0, 2));
    }

    public static double divide(int a, int b) throws IllegalArgumentException{
        if (b == 0){
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}
