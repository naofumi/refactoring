package com.example.p209Answer2_introduce_null_object;

public class Site {
    private Customer customer;

    public Site(Customer customer) {
        this.customer = customer;
    }

    Customer getCustomer() {
        return customer;
    }

    String getCustomerName() {
        if (customer == null) {
            return "no customer";
        } else {
            return customer.getName();
        }
    }

    String getCustomerPlan() {
        if (customer == null) {
            return "no customer";
        } else {
            return customer.getPlan();
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
        System.out.println("customer name: " + getCustomerName());
        System.out.println("customer plan: " + getCustomerPlan());    
    }
}
