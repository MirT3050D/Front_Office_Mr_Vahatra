package com.example.assignation.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.assignation.DTO.ReservationDTO;

@Service
public class ReservationService {
    private final RestTemplate restTemplate = new RestTemplate();
    private final String apiUrl = "http://localhost:8080/API/reservations";

    public List<ReservationDTO> getReservations() {
        ReservationDTO[] resArray = restTemplate.getForObject(apiUrl + "/list", ReservationDTO[].class);
        return Arrays.asList(resArray);
    }
}
