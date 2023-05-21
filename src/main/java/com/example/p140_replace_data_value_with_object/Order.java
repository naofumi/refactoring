package com.example.p140_replace_data_value_with_object;

public class Order {
    private String customer;

    public Order(String customer) {
        this.customer = customer;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String arg) {
        this.customer = arg;
    }
}
