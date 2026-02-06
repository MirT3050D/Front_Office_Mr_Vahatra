package com.example.assignation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.assignation.service.ReservationService;

import org.springframework.ui.Model;

@Controller
public class ReservationController {

    private final ReservationService reservationService;
    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }
    
    @GetMapping("/reservations")
    public String listReservations(Model model) {
        model.addAttribute("reservations", reservationService.getReservations());
        return "Reservation/list";
    }
}
