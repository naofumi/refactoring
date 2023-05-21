package com.example.p205_replace_conditional_with_polymorphism;

public class Manager extends EmployeeType {
    int getTypeCode() {
        return Employee.MANAGER;
    }
}
