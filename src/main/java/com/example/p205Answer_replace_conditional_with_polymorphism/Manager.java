package com.example.p205Answer_replace_conditional_with_polymorphism;

public class Manager extends EmployeeType {
    int getTypeCode() {
        return Employee.MANAGER;
    }

    public int payAmount(Employee emp) {
        return emp.getMonthlySalary() + emp.getBonus();
    }
}
