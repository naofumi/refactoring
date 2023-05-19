package com.example.p101_introduce_explaining_variable;

public class IntroduceExplainingVariable2 {
    private double itemPrice;
    private int quantity;

    public static void main(String[] args) {
        IntroduceExplainingVariable2 instance1 = new IntroduceExplainingVariable2(50.0, 400);
        System.out.println("--- itemPrice 50.0 quantity 400 ---");
        System.out.println(instance1.price());
        IntroduceExplainingVariable2 instance2 = new IntroduceExplainingVariable2(500.0, 4000);
        System.out.println("--- itemPrice 500.0 quantity 4000 ---");
        System.out.println(instance2.price());
    }

    public IntroduceExplainingVariable2(double itemPrice, int quantity) {
        this.itemPrice = itemPrice;
        this.quantity = quantity;
    }

    public double price() {
        return quantity * itemPrice - 
            Math.max(0, quantity - 500) * itemPrice * 0.05 + 
            Math.min(quantity * itemPrice * 0.1, 100.0);
    }
}
