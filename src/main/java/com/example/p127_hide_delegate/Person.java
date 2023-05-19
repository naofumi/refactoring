package com.example.p127_hide_delegate;

public class Person {
    Department department;
    String name;

    public static void main(String[] args) {
        Person manager = new Person("Harry");
        Department department = new Department(manager, "123");
        Person john = new Person("John");
        john.setDepartment(department);

        System.out.println("John's manager is: " + john.getDepartment().getManager().getName());
    }

    public Person(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department arg) {
        this.department = arg;
    }

    public String getName() {
        return name;
    }
}
