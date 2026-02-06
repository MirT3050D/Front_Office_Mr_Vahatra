package com.example.assignation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReservationController {
    
    @GetMapping("/reservations")
    public String listReservations() {
        return "Reservation/list";
    }
}
