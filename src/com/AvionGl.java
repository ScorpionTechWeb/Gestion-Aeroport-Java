package com;

public class AvionGl extends Avion {
    /**
     * constructeurs
     *
     * @param modele
     * @param nbPlaces
     * @param distanceMax
     **/
    protected AvionGl(String modele, int nbPlaces, int distanceMax) {
        super(modele, nbPlaces, distanceMax);
    }

    @Override
    void addTraveler() {

    }

    @Override
    void showTravelerList() {

    }

    @Override
    String getModele() {
        return modele;
    }

    @Override
    void setModele(String modele) {

    }

    @Override
    int getNbPlaces() {
        return 0;
    }

    @Override
    void setNbPlaces(int nbPlaces) {

    }

    @Override
    int getDistanceMax() {
        return 0;
    }

    @Override
    void setDistanceMax(int distanceMax) {

    }

    @Override
    Boolean getVolSol() {
        return null;
    }

    @Override
    void setVolSol(Boolean volSol) {

    }
    /** Constructeurs **/

}
