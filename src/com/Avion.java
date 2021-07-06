package com;

import java.util.ArrayList;
abstract class Avion {
    /** atributs **/
    protected String modele;
    protected int nbPlaces;
    protected int distanceMax;
    protected Boolean volSol = false;
    protected ArrayList<Traveler> traveler;

    /** constructeurs **/
    protected Avion(String modele, int nbPlaces, int distanceMax) {
        this.modele = modele;
        this.nbPlaces = nbPlaces;
        this.distanceMax = distanceMax;
        this.traveler = new ArrayList<>();
    }

    /** méthodes **/
    abstract void addTraveler();
    abstract void showTravelerList();

    /** getters and setters **/
    abstract String getModele();
    abstract void setModele(String modele);
    abstract int getNbPlaces();
    abstract void setNbPlaces(int nbPlaces);
    abstract int getDistanceMax();
    abstract void setDistanceMax(int distanceMax);
    abstract Boolean getVolSol();
    abstract void setVolSol(Boolean volSol);
}
