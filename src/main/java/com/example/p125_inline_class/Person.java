package com.example.p125_inline_class;

public class Person {
    private String name;
    private TelephoneNumber officeTelephone;

    public static void main(String[] args) {
        Person person = new Person("Ponyo", "380", "1234");
        System.out.println("name:  " + person.name);
        System.out.println("phone: " + person.getTelephoneNumber());
    }

    public Person(String name, String officeAreaCode, String officeNumber) {
        this.name = name;
        this.officeTelephone = new TelephoneNumber(officeAreaCode, officeNumber);
    }

    public String getName() {
        return name;
    }

    public String getTelephoneNumber() {
        return officeTelephone.getTelephoneNumber();
    }

    public TelephoneNumber getOfficeTelephone() {
        return officeTelephone;
    }
}
