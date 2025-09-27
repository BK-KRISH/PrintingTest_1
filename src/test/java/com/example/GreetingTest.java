package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingTest {

    @Test
    void testMessage() {
        Greeting g = new Greeting();
        assertEquals("Hey Barani, you will become a DevOps Engineer", g.getMessage());
    }
}
