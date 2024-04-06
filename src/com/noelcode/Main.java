package com.noelcode;
public class Main {

    public static void main(String[] args) {
        try {
            System.out.println(divide(10, 0));
        } catch (MyCheckedException e) {
            throw new RuntimeException(e);
        }
    }

    public static int divide(int a, int b) throws MyCheckedException{
        if(b == 0){
            throw new MyCheckedException("Sorry int needs to be greater then 1");
        }
        return a / b;
    }

}