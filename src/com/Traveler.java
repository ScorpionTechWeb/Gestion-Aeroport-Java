package com;

public class Traveler {
    /** atributs **/
    private String nom;
    private String prenom;
    private int age;
    private Billet billet;

    /** constructeurs **/
    public Traveler(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    /** méthodes **/
    public Billet buyBillet() {
        return billet;
    }
    public void deleteTravel() {

    }
    public void goToPlane() {

    }

    /** getters and setters **/
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public Billet getbillet() {
        return billet;
    }
    public void setBillet(Billet billet) {
        this.billet = billet;
    }
}
