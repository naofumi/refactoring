package com.example.p209Answer1_introduce_null_object;

public class Site {
    private Customer customer;

    public Site(Customer customer) {
        this.customer = customer;
    }

    Customer getCustomer() {
        if (customer == null) {
            return new Customer("no customer", "no customer");
        } else {
            return customer;
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Site with customer ---");
        Customer customer = new Customer("Harry", "basic");
        Site siteWithCustomer = new Site(customer);
        siteWithCustomer.print();
        System.out.println("--- Site without customer ---");
        Site siteWithOutCustomer = new Site(null);
        siteWithOutCustomer.print();
    }

    private void print() {
        System.out.println("customer name: " + getCustomer().getName());
        System.out.println("customer plan: " + getCustomer().getPlan());    
    }
}
