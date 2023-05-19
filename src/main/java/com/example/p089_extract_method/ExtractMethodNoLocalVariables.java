package com.example.p089_extract_method;

import java.util.ArrayList;

public class ExtractMethodNoLocalVariables {
    private ArrayList<Order> orders = new ArrayList<Order>();

    public static void main( String[] args )
    {
        new ExtractMethodNoLocalVariables().printOwning("Seedtech", 250);
    }    

    public ExtractMethodNoLocalVariables() {
        Order order1 = new Order(10);
        Order order2 = new Order(100);
        orders.add(order1);
        orders.add(order2);
    }

    void printOwning(String name, double amount) {
        Integer outstanding = 0;
        // print banner
        System.out.println ("**************************");
        System.out.println ("***** Customer Owes ******");
        System.out.println ("**************************");
        // calculate outstanding
        for (Order order: orders) {
            outstanding += order.getAmount();
        }

        //print details
        System.out.println ("name:" + name);
        System.out.println ("amount" + outstanding);    }
}
