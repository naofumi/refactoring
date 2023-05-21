package com.example.p130_remove_middle_man;

public class Department {
    private String chargeCode;
    private Person manager;

    public Department(Person manager, String chargeCode) {
        this.manager = manager;
        this.chargeCode = chargeCode;
    }

    public Person getManager() {
        return manager;
    }

    public String getChargeCode() {
        return chargeCode;
    }
}
