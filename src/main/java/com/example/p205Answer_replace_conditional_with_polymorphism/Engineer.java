package com.example.p205Answer_replace_conditional_with_polymorphism;

// package com.example.p205_replace_conditional_with_polymorphism;

public class Engineer extends EmployeeType {
    int getTypeCode() {
        return Employee.ENGINEER;
    }
    public int payAmount(Employee emp) {
        return emp.getMonthlySalary();
    }
}
