package com;

public class Billet {
    /** Atributs **/
    private float prix;
    private String destination;
    private Traveler travel;

    /** Constructeurs **/
    public Billet(float prix, String destination, Traveler travel) {
        this.prix = prix;
        this.destination = destination;
        this.travel = travel;
    }

    /** méthodes **/
    public void addDestination() {

    }
    public void addPassager() {

    }
    public void addPrix() {

    }

    /** getters and setters **/
    public float getPrix() {
        return prix;
    }
    public void setPrix(float prix) {
        this.prix = prix;
    }

    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Traveler getTravel() {
        return travel;
    }
    public void setTravel(Traveler travel) {
        this.travel = travel;
    }
}
