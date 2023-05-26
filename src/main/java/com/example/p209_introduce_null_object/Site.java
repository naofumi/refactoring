package com.example.p209_introduce_null_object;

public class Site {
    private Customer customer;

    public Site(Customer customer) {
        this.customer = customer;
    }

    Customer getCustomer() {
        return customer;
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
        if (getCustomer() != null) {
            System.out.println("customer name: " + getCustomer().getName());
            System.out.println("customer plan: " + getCustomer().getPlan());    
        } else {
            System.out.println("customer name: " + "no customer");
            System.out.println("customer plan: " + "no customer");    
        }
    }
}
