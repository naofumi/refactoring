package com.example.p130_remove_middle_man;

public class Person {
    Department department;
    String name;

    public static void main(String[] args) {
        Person manager = new Person("Harry");
        Department department = new Department(manager, "123");
        Person john = new Person("John");
        john.setDepartment(department);

        System.out.println("John's manager is: " + john.getManager().getName());
    }

    public Person(String name) {
        this.name = name;
    }

    public void setDepartment(Department arg) {
        this.department = arg;
    }

    public String getName() {
        return name;
    }

    public Person getManager() {
        return department.getManager();
    }
}
