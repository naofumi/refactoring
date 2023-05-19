package com.example.p119_move_field;

public class Account {
    private AccountType type;
    private double interestRate;

    public static void main(String[] args) {
        AccountType accountType = new AccountType();
        Account account = new Account(accountType, 0.05);
        System.out.println("Interest: " + account.interestForAmount_days(1000, 10));
    }

    public Account(AccountType type, double interestRate) {
        this.type = type;
        this.interestRate = interestRate;
    }

    double interestForAmount_days(double amount, int days) {
        return interestRate * amount * days / 365;
    }
}
