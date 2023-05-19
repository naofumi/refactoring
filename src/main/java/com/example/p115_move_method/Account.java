package com.example.p115_move_method;

public class Account {
    private AccountType type;

    private int daysOverdrawn;

    public static void main(String[] args) {
        AccountType type = new AccountType(true);
        Account account = new Account(type, 10);

        System.out.println(account.bankCharge());
    }

    public Account(AccountType type, int daysOverdrawn) {
        this.type = type;
        this.daysOverdrawn = daysOverdrawn;
    }

    public double overdraftCharge() {
        if (type.isPremium()) {
            double result = 10;
            if (daysOverdrawn > 7) {
                result += (daysOverdrawn - 7) * 0.85;
            }
            return result;
        } else {
            return daysOverdrawn * 1.75;
        }
    }

    public double bankCharge() {
        double result = 4.5;
        if (daysOverdrawn > 0) {
            result += overdraftCharge();
        }
        return result;
    }
}
