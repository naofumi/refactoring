package com.example.p133_introduce_local_extension;

import java.time.LocalDate;

/*
 * The Date class constructor that was used in the Book is
 * now deprecated and so we use LocalDate.
 * 
 * Unfortunately, LocalDate is defined as final and so we cannot
 * use the subclassing approach. Just try the Wrapping approach.
 */
public class IntroduceLocalExtension {
    public static void main(String[] args) {
        LocalDate previousEnd = LocalDate.of(2023, 5, 19);
        LocalDate newStart = LocalDate.of(previousEnd.getYear(), 
                                          previousEnd.getMonthValue(), 
                                          previousEnd.getDayOfMonth() + 1);
        
        System.out.println("newStart: " + newStart.toString());
    }
}
