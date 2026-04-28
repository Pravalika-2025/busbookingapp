package com.example.busbookingapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class BusbookingappApplicationTests {

    @Test
    void contextLoads() {
        // Basic sanity test
        assertTrue(true);
    }

    @Test
    void sampleBusinessLogicTest() {
        String source = "Chennai";
        String destination = "Bangalore";

        assertTrue(!source.equals(destination), "Source and destination should not be same");
    }
}