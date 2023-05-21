package com.example.p131_introduce_foreign_method;

import java.time.LocalDate;

public class IntroduceForeignMethod {
    public static void main(String[] args) {
        LocalDate previousEnd = LocalDate.of(2023, 5, 19);
        LocalDate newStart = LocalDate.of(previousEnd.getYear(), 
                                          previousEnd.getMonth(), 
                                          previousEnd.getDayOfMonth() + 1);
        
        System.out.println("newStart: " + newStart.toString());
    }
}
