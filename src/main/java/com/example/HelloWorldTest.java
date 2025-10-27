package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HelloWorldTest {

    @Test
    void testAdd() {
        assertEquals(5, HelloWorld.add(2, 3));
    }
}
