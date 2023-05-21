package com.example.p140_replace_data_value_with_object;

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

    private static int numberOfOrdersFor(Iterable<Order> orders, String customer) {
        int result = 0;

        for (Order order : orders) {
            if (order.getCustomer().equals(customer)) {
                result += 1;
            }
        }
        return result;
    }
}


