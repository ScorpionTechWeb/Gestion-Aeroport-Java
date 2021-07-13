package com;

public class Traveler {
    /** atributs **/
    private String nom;
    private String prenom;
    private int age;
    private Billet billet;
    private  boolean embarquement = false;
    private Avion avion;

    /** constructeurs **/
    public Traveler(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    /** méthodes **/
    public void buyBillet(float prix, String destination) {
        if (this.billet != null){
            System.out.println(this.prenom + " possède déjà un billet ");
        }else{
            this.billet = new Billet(prix, destination, this);
            System.out.println(this.prenom + " a acheté un billet pour " + destination);
        }
    }
    public void deleteTravel() {
        this.billet = null;
        System.out.println(this.prenom + " a demandé le remboursement de son billet !!");
    }
    public void goToPlane() {
        if(this.embarquement == true){
            System.out.println(this.prenom + " est deja dans " + this.avion.getModele());
        }else{
            avion.addTraveler(this);
            this.embarquement=true;
            this.avion=avion;
            System.out.println(this.prenom + " embarque " + this.avion.getModele());
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
