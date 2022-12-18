package com.example.projet;

public class Fournisseur {
    int id ;
    String nom ;
    String Prenom ;
    int categorie ;


    public Fournisseur(int id, String nom, String prenom, int categorie) {
        this.id = id;
        this.nom = nom;
        Prenom = prenom;
        this.categorie = categorie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public int getCategorie() {
        return categorie;
    }

    public void setCategorie(int categorie) {
        this.categorie = categorie;
    }
}
