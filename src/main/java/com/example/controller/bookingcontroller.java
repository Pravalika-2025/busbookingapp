package com.example.controller;

import com.example.busbookingapp.model.ticket;
import com.example.busbookingapp.service.bookingservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@SuppressWarnings("unused")
@RestController
@RequestMapping("/api/bookings")
public class bookingcontroller {

    @Autowired
    private bookingservice bookingService;

    @PostMapping
    public String bookTicket(
            @RequestParam String name,
            @RequestParam String source,
            @RequestParam String destination) {

        return bookingService.bookTicket(name, source, destination);
    }
}