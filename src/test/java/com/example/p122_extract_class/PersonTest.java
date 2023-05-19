package com.example.p122_extract_class;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    void testGetName() {
        Person person = new Person("Ponyo", "380", "1234");
        assertEquals("Ponyo", person.getName());
    }

    @Test
    void testGetTelephoneNumber() {
        Person person = new Person("Ponyo", "380", "1234");
        assertEquals("(380) 1234", person.getTelephoneNumber());
    }
}
