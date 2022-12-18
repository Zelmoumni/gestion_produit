package com.example.projet;

import android.widget.BaseAdapter;

public class Categorie  {
    int id ;
    String name ;

    public Categorie() {

    }

    public Categorie(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
