package com.example.p205Answer_replace_conditional_with_polymorphism;

public class Employee {
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    private int monthlySalary = 3;
    private int commission = 2;
    private int bonus = 1;

    public static void main(String[] args) {
        Employee employee = new Employee();

        System.out.println("Salaries");
        System.out.println("Engineer: " + new Engineer().payAmount(employee));
        System.out.println("Salesman: " + new Salesman().payAmount(employee));
        System.out.println("Manager: " + new Manager().payAmount(employee));
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public int getCommission() {
        return commission;
    }

    public int getBonus() {
        return bonus;
    }

    
}
