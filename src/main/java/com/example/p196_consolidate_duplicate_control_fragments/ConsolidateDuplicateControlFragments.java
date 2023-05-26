package com.example.p196_consolidate_duplicate_control_fragments;

public class ConsolidateDuplicateControlFragments {
    private double total;
    private double price;
    private boolean isSpecialDeal;

    public static void main(String[] args) {
        ConsolidateDuplicateControlFragments instance = 
            new ConsolidateDuplicateControlFragments(100, true);
        instance.process();
    }

    public ConsolidateDuplicateControlFragments(double price, boolean isSpecialDeal) {
        this.price = price;
        this.isSpecialDeal = isSpecialDeal;
    }

    public void process() {
        if (isSpecialDeal()) {
            total = price * 0.95;
            send();
        } else {
            total = price * 0.98;
            send();
        }
    }

    private void send() {
        System.out.println("---- Sent invoice " + total + " to customer --------");
    }

    private boolean isSpecialDeal() {
        return isSpecialDeal;
    }
}
