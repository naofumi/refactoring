package com.example.p148_change_reference_to_value;

public class Company {
    private Currency currency;

    public static void main(String[] args) {
        Currency.loadCurrencies();
        Company company1 = new Company(Currency.get("PHP"));
        Company company2 = new Company(Currency.get("JPY"));
        Company company3 = new Company(Currency.get("PHP"));

        System.out.println("--- Compare currencies ---");
        System.out.println("company 1 vs company 2: " + 
                            company1.getCurrency().equals(company2.getCurrency()));
        System.out.println("company 1 vs company 3: " + 
                            company1.getCurrency().equals(company3.getCurrency()));
    }

    public Company(Currency currency) {
        this.currency = currency;
    }
    public Currency getCurrency() {
        return currency;
    }
}
