package com.example.p144_change_value_to_reference;

import java.util.ArrayList;

public class Report {
    public static void main(String[] args) {
        ArrayList<Order> orders = new ArrayList<Order>();
        orders.add(new Order("Doraemon"));
        orders.add(new Order("Nobita"));
        orders.add(new Order("Doraemon"));

        int number = Report.numberOfOrdersFor(orders, "Doraemon");

        System.out.println("Number of orders for Doraemon");
        System.out.println("number: " + number);
    }

    private static int numberOfOrdersFor(Iterable<Order> orders, String customerName) {
        int result = 0;

        for (Order order : orders) {
            if (order.getCustomerName().equals(customerName)) {
                result += 1;
            }
        }
        return result;
    }
}


