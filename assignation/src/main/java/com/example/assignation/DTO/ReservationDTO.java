package com.example.assignation.DTO;

public class ReservationDTO {
    private Long id;
    private String client;
    private String hotel;
    private int nbPassager;
    private String dateHeureDepart;

    // Getters et setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getClient() { return client; }
    public void setClient(String client) { this.client = client; }

    public String getHotel() { return hotel; }
    public void setHotel(String hotel) { this.hotel = hotel; }

    public int getNbPassager() { return nbPassager; }
    public void setNbPassager(int nbPassager) { this.nbPassager = nbPassager; }

    public String getDateHeureDepart() { return dateHeureDepart; }
    public void setDateHeureDepart(String dateHeureDepart) { this.dateHeureDepart = dateHeureDepart; }
}
