package com.example.projet;

public class produit {

    private String reference ;
    private String name ;
    private int image_produit ;
    private float prix_unitaire ;
    private int Quantite ;

    public produit(String reference, String name, float prix_unitaire, int quantite) {
        this.reference = reference;
        this.name = name;
        this.prix_unitaire = prix_unitaire;
        Quantite = quantite;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrix_unitaire(float prix_unitaire) {
        this.prix_unitaire = prix_unitaire;
    }

    public void setQuantite(int quantite) {
        Quantite = quantite;
    }

    public produit() {
    }

    public int getImage_produit() {
        return image_produit;
    }

    public void setImage_produit(int image_produit) {
        this.image_produit = image_produit;
    }

    public String getReference() {
        return reference;
    }

    public String getName() {
        return name;
    }

    public float getPrix_unitaire() {
        return prix_unitaire;
    }

    public int getQuantite() {
        return Quantite;
    }
}

