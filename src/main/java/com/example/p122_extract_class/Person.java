package com.example.p122_extract_class;

public class Person {
    private String name;
    private String officeAreaCode;
    private String officeNumber;

    public static void main(String[] args) {
        Person person = new Person("Ponyo", "380", "1234");
        System.out.println("name:  " + person.name);
        System.out.println("phone: " + person.getTelephoneNumber());
    }

    public Person(String name, String officeAreaCode, String officeNumber) {
        this.name = name;
        this.officeAreaCode = officeAreaCode;
        this.officeNumber = officeNumber;
    }

    public String getName() {
        return name;
    }

    public String getTelephoneNumber() {
        return ("(" + officeAreaCode + ") " + officeNumber);
    }

    public String getOfficeAreaCode() {
        return officeAreaCode;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String arg) {
        this.officeNumber = arg;
    }
}
