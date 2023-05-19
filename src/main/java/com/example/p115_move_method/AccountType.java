package com.example.p115_move_method;

public class AccountType {
    private boolean premium = false;

    public boolean isPremium() {
        return premium;
    }

    public AccountType(boolean premium) {
        this.premium = premium;
    }
}
