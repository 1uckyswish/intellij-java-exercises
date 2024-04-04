package com.noelcode.typeinerence;
public class Type {
    public static void main(String[] args) {
        String name = "Noel";
        String[] names = {"Noel", "Santa", "Elf"};
        int age = 22;
        boolean isAdult = false;
        double balance = 1_000_000.33d;


        //var reference
        var name2 = "Noel";
        var names2 = new String[]{"Noel", "Santa", "Elf"};
        var age2 = 22;
        var isAdult2 = false;
        var balance2 = 1_000_000.33d;
    }

}
