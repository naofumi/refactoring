package com.example.p168_encapsulate_collection;

import java.util.HashSet;
import java.util.Set;

public class Person {
    private Set<Course> courses;

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = (Set<Course>)courses;
    }

    public static void main(String[] args) {
        Person kent = new Person();
        Set<Course> s = new HashSet<Course>();
        s.add(new Course("Smalltalk Programming", false));
        s.add(new Course("Appreciating Single Malts", true));
        kent.setCourses(s);
        System.out.println("Kent courses count: " + kent.getCourses().size()); // 2

        Course refact = new Course("Refactoring", true);
        kent.getCourses().add(refact);
        kent.getCourses().add(new Course ("Brutal Sarcasm", false));
        System.out.println("Kent courses count: " + kent.getCourses().size()); // 4

        kent.getCourses().remove(refact);
        System.out.println("Kent courses count: " + kent.getCourses().size()); // 3

        int count = 0;
        for (Course course : kent.getCourses()) {
            if (course.isAdvanced()) {
                count++;
            }
        }
        System.out.println("Kent advanced courses count: " + count); // 1
    }
}
