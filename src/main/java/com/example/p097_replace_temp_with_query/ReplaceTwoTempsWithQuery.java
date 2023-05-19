package com.example.p097_replace_temp_with_query;

public class ReplaceTwoTempsWithQuery {
    private double itemPrice = 100.0;
    private int quantity;

    public static void main (String[] args) {
        ReplaceTwoTempsWithQuery with900 = new ReplaceTwoTempsWithQuery(900);
        System.out.println("--- quantity: 900 ---");
        System.out.println(with900.getPrice());
        ReplaceTwoTempsWithQuery with1100 = new ReplaceTwoTempsWithQuery(1100);
        System.out.println("--- quantity: 1100 ---");
        System.out.println(with1100.getPrice());
    }

    public ReplaceTwoTempsWithQuery(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        double basePrice = quantity * itemPrice;
        double discountFactor;

        if (basePrice > 1000) {
            discountFactor = 0.95;
        } else {
            discountFactor = 0.98;
        }
        return basePrice * discountFactor;
    }
}
