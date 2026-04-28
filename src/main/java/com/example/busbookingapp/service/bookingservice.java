package com.example.busbookingapp.service;

import org.springframework.stereotype.Service;

@Service
public class bookingservice {

    public String bookTicket(String passengerName, String source, String destination) {

        if (source == null || destination == null || passengerName == null) {
            return "Invalid input: fields cannot be null";
        }

        if (source.equalsIgnoreCase(destination)) {
            return "Invalid route: Source and destination cannot be same";
        }

        return "Ticket booked successfully for " + passengerName +
                " from " + source + " to " + destination;
    }
}