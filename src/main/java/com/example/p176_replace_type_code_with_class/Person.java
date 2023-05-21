package com.example.p176_replace_type_code_with_class;

public class Person {
    public static final int O = 0;
    public static final int A = 1;
    public static final int B = 2;
    public static final int AB = 3;

    private int bloodGroup;

    public Person(int bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public void setBloodGroup(int arg) {
        this.bloodGroup = arg;
    }

    public int getBloodGroup() {
        return bloodGroup;
    }

    public static void main(String[] args) {
        Person person = new Person(Person.O);
        System.out.println("Bloodgroup: " + person.bloodGroup);
    }
}
