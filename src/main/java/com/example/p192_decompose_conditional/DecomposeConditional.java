package com.example.p192_decompose_conditional;

import java.time.LocalDate;

public class DecomposeConditional {
    private LocalDate SUMMER_START = LocalDate.of(2023, 4, 1);
    private LocalDate SUMMER_END = LocalDate.of(2023, 9, 30);
    private double summerRate = 5_000;
    private double winterRate = 7_000;
    private double winterServiceCharge = 1_000;

    public static void main(String[] args) {
        int quantity = 10;

        System.out.println("------- Summer price ---------");
        LocalDate summerDate = LocalDate.of(2023, 4, 30);
        System.out.println(new DecomposeConditional().price(quantity, summerDate));

        System.out.println("------- Winter price -----------");
        LocalDate winterDate = LocalDate.of(2023, 12, 30);
        System.out.println(new DecomposeConditional().price(quantity, winterDate));
    }

    public double price(int quantity, LocalDate date) {
        if (date.isBefore (SUMMER_START) || date.isAfter(SUMMER_END)) {
            return quantity * winterRate + winterServiceCharge;
        } else {
            return quantity * summerRate;
        }
    }
}

