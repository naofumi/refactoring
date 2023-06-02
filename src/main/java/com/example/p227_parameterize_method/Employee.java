package com.example.p227_parameterize_method;




public class Employee {
    private double salary;

    public static void main(String[] args) {
        Employee employee = new Employee(100);
        System.out.println("Initial: " + employee.salary);
        employee.tenPercentRaise();
        System.out.println("first raise: " + employee.salary);
        employee.fivePercentRaise();
        System.out.println("second raise: " + employee.salary);
    }

    void tenPercentRaise () {
        salary *= 1.1; 
    }
    void fivePercentRaise () { 
        salary *= 1.05;
    }

    public double getSalary() {
        return salary;
    }

    public Employee(double salary) {
        this.salary = salary;
    }
}
