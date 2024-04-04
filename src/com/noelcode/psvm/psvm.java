package com.noelcode.psvm;

import java.util.Arrays;

public class psvm {
    //Public means it can be accessed anywhere in the code
    //Static means it can be Invoked. No need to make a Instant of it
    //Void means it returns nothing (only values of print ot executes)
    //Main means it is the method name
    //String args is program Arguments
    public static void main(String[] args){
        System.out.println("Program was given");
        if(args.length > 0){
            System.out.println("The following arguments");
            System.out.println(Arrays.toString(args));
        }else{
            System.out.println("0 arguments");
        }

    }
}
