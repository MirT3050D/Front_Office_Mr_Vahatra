package com.example.assignation.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;

import com.example.assignation.DTO.PlanningApiResponse;
import com.example.assignation.DTO.PlanningDTO;

@Service
public class PlanningService {
    private final RestTemplate restTemplate = new RestTemplate();
    private final String apiUrl = "http://localhost:8082/planning/planning";

    
    public List<PlanningDTO> getVehiculePlanningInfo() {
        try {
            PlanningApiResponse response = restTemplate.getForObject(apiUrl + "/list", PlanningApiResponse.class);
            if (response != null && response.getData() != null) {
                return response.getData();
            }
        } catch (ResourceAccessException e) {
            // Le service externe est indisponible, on retourne une liste vide
        }
        return List.of();
    }
}
