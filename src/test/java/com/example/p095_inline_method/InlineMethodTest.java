package com.example.p095_inline_method;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class InlineMethodTest {
    @Test
    void testGetRatingWith6LateDeliveries() {
        InlineMethod instance = new InlineMethod(6);
        assertEquals(2, instance.getRating());
    }

    @Test
    void testGetRatingWith4LateDeliveries() {
        InlineMethod instance = new InlineMethod(4);
        assertEquals(1, instance.getRating());
    }
}
