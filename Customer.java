package com.example.demo;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;


// entity class
@Entity
public class Customer {
    @Id
    private int id;
    private String name;
    private int orderId;
    private String emailId;

    // Default constructor
    public Customer() {
    }

    // Parameterized constructor
    public Customer(String name, int orderId, String emailId) {
        this.name = name;
        this.orderId = orderId;
        this.emailId = emailId;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}

