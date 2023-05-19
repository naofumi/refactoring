package com.example.p096_inline_temp;

public class InlineTemp {
    int basePrice = 1_040;
    public static void main (String[] args) {
        System.out.println(new InlineTemp().basePriceAboveThreshold());
    }

    public boolean basePriceAboveThreshold() {
        int basePrice = getBasePrice();
        return (basePrice > 1000);
    }

    public int getBasePrice() {
        return basePrice;
    }
}
