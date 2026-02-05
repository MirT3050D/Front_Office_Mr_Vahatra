package com.example.assignation.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    public String getWelcomeMessage() {
        return "Welcome to the Assignation Application!";
    }

    public String processData(String input) {
        if (input == null || input.isEmpty()) {
            return "Input cannot be empty";
        }
        return "Processed: " + input.toUpperCase();
    }
}
