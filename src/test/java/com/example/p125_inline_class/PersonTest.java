package com.example.p125_inline_class;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    void testGetName() {
        Person person = new Person("john doe", "380", "1234");
        assertEquals("john doe", person.getName());
    }

    @Test
    void testGetTelephoneNumber() {
        Person person = new Person("john doe", "380", "1234");
        assertEquals("(380) 1234", person.getTelephoneNumber());
    }
}
