package com.noelcode.classesintro;

public class MainCat {
    public static void main(String[] args) {
        //Classes
        Cat cat = new Cat();
        cat.name = "Luna the yapper";
        cat.meow();

    }

    static class Cat{
        String name;
        void meow(){
            System.out.println(name + ": Meow.....");
        }
    }
}
