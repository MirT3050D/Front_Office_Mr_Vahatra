package com.example.assignation.service;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.assignation.DTO.ReservationApiResponse;
import com.example.assignation.DTO.ReservationDTO;

@Service
public class ReservationService {
    private final RestTemplate restTemplate = new RestTemplate();
    private final String apiUrl = "http://localhost:8082/reservation/reservation";

    public List<ReservationDTO> getReservations() {
        ReservationApiResponse response = restTemplate.getForObject(apiUrl + "/list", ReservationApiResponse.class);
        return (response != null && response.getData() != null) ? response.getData() : Collections.emptyList();
    }
}
