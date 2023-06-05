package com.example.p287_replace_inheritance_with_delegation;

public class ReplaceInheritanceWithDelegation {
    public static void main(String[] args) {
        System.out.println("------- Employee ------");
        Employee employee = new Employee();
        employee.setName("John");
        employee.setAge(40);
        employee.setCompany("SuperTech");
        employee.setSalary(10);
        System.out.println("Employee name: " + employee.getName());
        System.out.println("Employee age: " + employee.getAge());
        System.out.println("Employee company: " + employee.getCompany());
        System.out.println("Employee salary: " + employee.getSalary());

        System.out.println("------- Student ------");
        Student student = new Student();
        student.setName("Mary");
        student.setAge(15);
        student.setSchool("SuperSchool");
        System.out.println("Student name: " + student.getName());
        System.out.println("Student age: " + student.getAge());
        System.out.println("Student school: " + student.getSchool());

    }
}
