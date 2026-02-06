package com.example.assignation.DTO;

// @SuppressWarnings("unused")
public class ReservationDTO {
    // id, id_client, nombre de passager, date heure arrivée, Hotel
    private Long id;
    private Long idClient;
    private int nombrePassager;
    private String dateHeureArrivee;
    private String hotel;

    // Getters et setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getIdClient() { return idClient; }
    public void setIdClient(Long idClient) { this.idClient = idClient; }

    public int getNombrePassager() { return nombrePassager; }
    public void setNombrePassager(int nombrePassager) { this.nombrePassager = nombrePassager; }

    public String getDateHeureArrivee() { return dateHeureArrivee; }
    public void setDateHeureArrivee(String dateHeureArrivee) { this.dateHeureArrivee = dateHeureArrivee; }

    public String getHotel() { return hotel; }
    public void setHotel(String hotel) { this.hotel = hotel; }
}
