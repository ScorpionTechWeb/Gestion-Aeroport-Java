package com;

import java.util.ArrayList;

public class Aeroport {
    /** Atribut **/
    private String lieu;
    private int capacite;
    private ArrayList<Avion> avions;
    private ArrayList<Billet> billets;

    /** Constructeurs **/
    public Aeroport(String lieu, int capacite) {
        this.lieu = lieu;
        this.capacite = capacite;
        this.avions = new ArrayList<>();
        this.billets = new ArrayList<>();
    }

    /** méthodes **/
    public void addToAvions(Avion avion) {
        this.avions.add(avion);
    }
    public void showDispoAvion() {
        for (Avion avion : avions){
            System.out.println(avion.getModele());
        }
    }
    //    public Billet editBillet() {
//
//    }
    public void ShowNbPlaceByPlane() {

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

    public ArrayList<Avion> getAvion() {
        return avions;
    }

    public void setAvions(ArrayList<Avion> avions) {
        this.avions = avions;
    }

    public ArrayList<Billet> getBillet() {
        return billets;
    }

    public void setBillet(ArrayList<Billet> billet) {
        this.billets = billet;
    }
}
