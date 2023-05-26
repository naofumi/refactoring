package com.example.p194_consolidate_conditional;

public class ConsolidateConditional2 {
    private boolean onVacation;
    private int lengthOfSerivce;

    public static void main(String[] args) {
        ConsolidateConditional2 instance = new ConsolidateConditional2(true,  6);
        System.out.println("payment rate: " + instance.paymentRate());
    }

    public ConsolidateConditional2(boolean onVacation, int lengthOfSerivce) {
        this.onVacation = onVacation;
        this.lengthOfSerivce = lengthOfSerivce;
    }

    double paymentRate() {
        if (onVacation()) {
            if (lengthOfService() > 10) {
                return 1;
            }
        }
        return 0.5;    
    }

    private boolean onVacation() {
        return onVacation;
    }

    private int lengthOfService() {
        return lengthOfSerivce;
    }
}
