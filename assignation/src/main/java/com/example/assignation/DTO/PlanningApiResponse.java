package com.example.assignation.DTO;

import java.util.List;

public class PlanningApiResponse {
    private int code;
    private List<PlanningDTO> data;
    private String status;

    // Getters et setters
    public int getCode() { return code; }
    public void setCode(int code) { this.code = code; }

    public List<PlanningDTO> getData() { return data; }
    public void setData(List<PlanningDTO> data) { this.data = data; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
