package com.example.p113_substitute_algorithm;

public class SubstituteAlgorithm {
    public static void main(String[] args) {
        SubstituteAlgorithm instance = new SubstituteAlgorithm();
        String[] people = {"Don", "Bob", "Bill", "Edward"};
        System.out.println(instance.foundPerson(people));
    }


    public String foundPerson(String[] people) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals("Don")) {
                return "Don";
            }
            if (people[i].equals("John")) {
                return "John";
            }
            if (people[i].equals("Kent")) {
                return "Kent";
            }
        }
        return "";
    }
}
