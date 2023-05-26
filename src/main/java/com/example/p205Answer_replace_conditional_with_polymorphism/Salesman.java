package com.example.p205Answer_replace_conditional_with_polymorphism;

public class Salesman extends EmployeeType {
    int getTypeCode() {
        return Employee.SALESMAN;
    }
    public int payAmount(Employee emp) {
        return emp.getMonthlySalary() + emp.getCommission();
    }
}
