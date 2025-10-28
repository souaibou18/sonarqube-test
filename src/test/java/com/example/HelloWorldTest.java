package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {

    @Test
    void testAdd() {
        HelloWorld hw = new HelloWorld();
        assertEquals(4, hw.add(2, 2));
    }
}
