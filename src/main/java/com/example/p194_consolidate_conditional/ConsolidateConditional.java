package com.example.p194_consolidate_conditional;

public class ConsolidateConditional {
    private int seniority;
    private int monthsDisabled;
    private boolean isPartTime;

    public static void main(String[] args) {
        ConsolidateConditional instance = new ConsolidateConditional(3, 6,  false);
        System.out.println("disability amount: " + instance.disabilityAmount());
    }

    public ConsolidateConditional(int seniority, int monthsDisabled, boolean isPartTime) {
        this.seniority = seniority;
        this.monthsDisabled = monthsDisabled;
        this.isPartTime = isPartTime;
    }


    double disabilityAmount() {
        if (seniority < 2) return 0;
        if (monthsDisabled > 12) return 0;
        if (isPartTime) return 0;
        
        return 10_000;
    }
}
