package com.example.busbookingapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class BusbookingappApplication {

    public static void main(String[] args) {
        var context = SpringApplication.run(BusbookingappApplication.class, args);

        // Print useful startup info (good for CI/CD logs)
        Environment env = context.getEnvironment();

        String appName = env.getProperty("spring.application.name", "Bus Booking App");
        String port = env.getProperty("server.port", "8080");
        String profile = String.join(",", env.getActiveProfiles());

        System.out.println("\n=================================");
        System.out.println(" " + appName + " is running!");
        System.out.println(" URL: http://localhost:" + port);
        System.out.println(" Active Profile(s): " + (profile.isEmpty() ? "default" : profile));
        System.out.println("=================================\n");
    }
}