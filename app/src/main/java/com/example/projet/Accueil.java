package com.example.projet;

public class Accueil {
    private  int img ;
    private String Description ;


    public Accueil(int img, String description) {
        this.img = img;
        this.Description = description;

    }

    public Accueil() {

    }

    public String getDescription() {
        return Description;
    }

    public int getImg() {
        return img;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setImg(int img) {
        this.img = img;
    }


}
