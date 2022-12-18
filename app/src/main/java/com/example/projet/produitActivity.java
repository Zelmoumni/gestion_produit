package com.example.projet;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class produitActivity extends AppCompatActivity {

    Inflater inf ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produit);



        ListView listView ;

        listView = (ListView) findViewById(R.id.list_prod) ;
        ArrayList<produit> list_produit = new ArrayList<produit>() ;

        produit p = new produit() ;
        p.setImage_produit(R.drawable.chaussure);
        p.setName("Chaussuer");
        p.setReference("Ref001");
        p.setPrix_unitaire(200);
        p.setQuantite(10);

        list_produit.add(p) ;

        produit p1 = new produit() ;
        p.setImage_produit(R.drawable.chaussure);
        p.setName("vetemenet");
        p.setReference("Ref002");
        p.setPrix_unitaire(150);
        p.setQuantite(20);

        list_produit.add(p1) ;




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_pro,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id==R.id.menu_pro)
        {
            Intent intent = new Intent(getApplicationContext(),Ajouter_produit.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}