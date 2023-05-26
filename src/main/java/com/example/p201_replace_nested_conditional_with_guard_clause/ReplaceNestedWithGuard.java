package com.example.p201_replace_nested_conditional_with_guard_clause;

public class ReplaceNestedWithGuard {
    private boolean isDead;
    private boolean isSeparated;
    private boolean isRetired;

    public static void main(String[] args) {
        ReplaceNestedWithGuard instance = new ReplaceNestedWithGuard(true, false, true);
        System.out.println("payAmount: " + instance.getPayAmount());
    }

    public ReplaceNestedWithGuard(boolean isDead, boolean isSeparated, boolean isRetired) {
        this.isDead = isDead;
        this.isSeparated = isSeparated;
        this.isRetired = isRetired;
    }

    double getPayAmount() {
        double result;
        if (isDead) result = deadAmount();
        else {
            if (isSeparated) result = separatedAmount();
            else {
                if (isRetired) result = retiredAmount();
                else result = normalPayAmount();
            };
        }
        return result;
    };

    private double deadAmount() {
        return 10_000;
    }

    private double separatedAmount() {
        return 5_000;
    }

    private double retiredAmount() {
        return 3_000;
    }

    private double normalPayAmount() {
        return 1_000;
    }
}
