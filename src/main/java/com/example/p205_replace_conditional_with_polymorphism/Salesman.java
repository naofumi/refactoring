package com.example.p205_replace_conditional_with_polymorphism;

public class Salesman extends EmployeeType {
    int getTypeCode() {
        return Employee.SALESMAN;
    }
}
