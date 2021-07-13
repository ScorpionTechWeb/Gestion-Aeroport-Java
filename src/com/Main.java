package com;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /** Création d'un aéroport **/
        Aeroport roissy = new Aeroport("PARIS", 40);
        Aeroport orly = new Aeroport("PARIS", 75);

        /** Création d'un avion **/
        roissy.addToAvions(new AvionGl("A380", 450, 15000));
        roissy.addToAvions(new AvionLi("A320", 186, 7200));
        roissy.addToAvions(new AvionGl("A340", 239, 13800));
        orly.addToAvions(new AvionGl("A350", 325, 10000));
        orly.addToAvions(new AvionGl("Concorde", 128, 7250));
        orly.addToAvions(new AvionLi("DC10", 250, 3200));

        /** Création de passager **/
        Traveler passager1 = new Traveler("EXPOSITO", "THIERRY", 48);
        Traveler passager2 = new Traveler("SOFFIATI", "Stephane", 39);
        Traveler passager3 = new Traveler("DIAS", "Vitor", 31);
        Traveler passager4 = new Traveler("CONTRERAS", "Mathias", 21);

        /** Création d'un billet **/
        passager1.buyBillet(12000, "Rio");
        passager2.buyBillet(10000, "Rome");
        passager3.buyBillet(13000, "New-York");
        passager4.buyBillet(8000, "Séville");

        passager1.deleteTravel();


        roissy.showDispoAvion();
    }
}
