package com.example.p097_replace_temp_with_query;

public class ReplaceTempWithQuery {
    private double itemPrice = 100.0;
    private int quantity;

    public static void main (String[] args) {
        ReplaceTempWithQuery with900 = new ReplaceTempWithQuery(900);
        System.out.println("--- quantity: 900 ---");
        System.out.println(with900.getPrice());
        ReplaceTempWithQuery with1100 = new ReplaceTempWithQuery(1100);
        System.out.println("--- quantity: 1100 ---");
        System.out.println(with1100.getPrice());
    }

    public ReplaceTempWithQuery(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        double basePrice = quantity * itemPrice;
        if (basePrice > 1000) {
            return basePrice * 0.95;
        } else {
            return basePrice * 0.98;
        }
    }
}
