package com.example.p107_remove_assignments_to_parameters;

public class RemoveAssignmentsToParameters {
    public static void main(String[] args) {
        RemoveAssignmentsToParameters instance = new RemoveAssignmentsToParameters();
        System.out.println(instance.discount(60, 5, 2023));
    }

    public int discount(int inputVal, int quantity, int yearToDate) {
        if (inputVal > 50) inputVal -= 2;
        if (quantity > 100) inputVal -= 1;
        if (yearToDate > 10000) inputVal -= 4;
        return inputVal;
    }
}
