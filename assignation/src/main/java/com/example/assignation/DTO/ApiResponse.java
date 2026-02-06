package com.example.assignation.DTO;

import java.util.List;

public class ApiResponse {
    private int code;
    private List<ReservationDTO> data;
    private String status;

    // Getters et setters
    public int getCode() { return code; }
    public void setCode(int code) { this.code = code; }

    public List<ReservationDTO> getData() { return data; }
    public void setData(List<ReservationDTO> data) { this.data = data; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
