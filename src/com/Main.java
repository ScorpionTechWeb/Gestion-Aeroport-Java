package com;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /** Création d'un aéroport **/
        Aeroport roissy = new Aeroport("PARIS", 40);
        Aeroport orly = new Aeroport("PARIS", 75);

        /** Création d'un avion **/
        roissy.getAvion().add(new AvionGl("A380", 450, 15000));
        roissy.getAvion().add(new AvionLi("A320", 186, 7200));
        roissy.getAvion().add(new AvionGl("A340", 239, 13800));
        orly.getAvion().add(new AvionGl("A350", 325, 10000));
        orly.getAvion().add(new AvionGl("Concorde", 128, 7250));
        orly.getAvion().add(new AvionLi("DC10", 250, 3200));

        /** Création de passager **/
        Traveler passager1 = new Traveler("EXPOSITO", "THIERRY", 48);
        Traveler passager2 = new Traveler("SOFFIATI", "Stephane", 48);
        Traveler passager3 = new Traveler("CAMINO", "Antoine", 48);
        Traveler passager4 = new Traveler("CONTRERAS", "Antoine", 48);
    }
}
