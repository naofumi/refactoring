package com.example.p287_replace_inheritance_with_delegation;

public class Employee extends FamilyMember {
    private String company;
    private int salary;

    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
}
