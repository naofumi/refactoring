package com.example.p181_replace_type_code_with_subclass;

public class Employee {
    private int type;
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    private int monthlySalary = 3;
    private int commission = 2;
    private int bonus = 1;

    Employee(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int payAmount() {
        switch (type) {
            case ENGINEER:
                return monthlySalary;
            case SALESMAN:
                return monthlySalary + commission;
            case MANAGER:
                return monthlySalary + bonus;
            default:
                throw new RuntimeException("Incorrect Employee");
        }
    }

    public static void main(String[] args) {
        System.out.println("Salaries");
        System.out.println("Engineer: " + new Employee(Employee.ENGINEER).payAmount());
        System.out.println("Salesman: " + new Employee(Employee.SALESMAN).payAmount());
        System.out.println("Manager: " + new Employee(Employee.MANAGER).payAmount());
    }
}
