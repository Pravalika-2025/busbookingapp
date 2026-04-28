package com.example.busbookingapp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tickets")
public class ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String passengerName;
    private String source;
    private String destination;
    private String status;

    // Default constructor
    public ticket() {}

    // Parameterized constructor
    public ticket(String passengerName, String source, String destination, String status) {
        this.passengerName = passengerName;
        this.source = source;
        this.destination = destination;
        this.status = status;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}