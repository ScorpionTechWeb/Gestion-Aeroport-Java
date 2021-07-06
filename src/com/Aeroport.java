package com;

import java.util.ArrayList;

public class Aeroport {
    /** Atribut **/
    private String lieu;
    private int capacite;
    private ArrayList<Avion> avion;
    private ArrayList<Billet> billet;

    /** Constructeurs **/
    public Aeroport(String lieu, int capacite) {
        this.lieu = lieu;
        this.capacite = capacite;
        this.avion = new ArrayList<>();
        this.billet = new ArrayList<>();
    }

    /** méthodes **/
    public Avion addToAvions() {

    }
    public Avion showDispoAvion() {

    }
    public Billet editBillet() {

    }
    public void ShowNbPlaceByPlane() {

    }
    public ArrayList<Avion> getAvion() {
        return avion;
    }
    public ArrayList<Billet> getBillet() {
        return billet;
    }

    /** getters and setters **/
    public String getLieu() {
        return lieu;
    }
    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public int getCapacite() {
        return capacite;
    }
    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }
}
