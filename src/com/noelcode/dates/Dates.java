package com.noelcode.dates;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Dates {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        Month month =  LocalDateTime.now().getMonth();
        LocalTime localTime = LocalTime.now();

        LocalDateTime someDate = LocalDateTime.of(
                2000,
                Month.JULY,
                21,
                14,
                55
        );

        System.out.println(someDate);
    }
}
