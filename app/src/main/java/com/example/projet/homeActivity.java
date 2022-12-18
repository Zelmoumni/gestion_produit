package com.example.projet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.nio.channels.ClosedByInterruptException;
import java.util.ArrayList;

public class homeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ListView lview;

        lview = findViewById(R.id.listView);

        ArrayList<Accueil> Liste = new ArrayList<Accueil>();


        Accueil pro = new Accueil() ;
        pro.setDescription("Produits");
        pro.setImg(R.drawable.nos_produit);
        Liste.add(pro);


        Accueil cat = new Accueil() ;
        cat.setDescription("Categories");
        cat.setImg(R.drawable.nos_categorie);
        Liste.add(cat);

        Accueil fou = new Accueil() ;
        fou.setDescription("Fournisseurs");
        fou.setImg(R.drawable.nos_fournisseur);
        Liste.add(fou);



        MonAdapter adapter = new MonAdapter(this, 0, Liste);
        lview.setAdapter(adapter);

        lview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if(adapterView.getItemAtPosition(i).equals(pro))
                {
                    Intent intent  = new Intent(getApplicationContext(),produitActivity.class) ;
                    startActivity(intent);
                }

                if(adapterView.getItemAtPosition(i).equals(cat))
                {
                    Intent intent  = new Intent(getApplicationContext(),categorieActivity.class) ;
                    startActivity(intent);
                }

                if(adapterView.getItemAtPosition(i).equals(fou))
                {
                    Intent intent  = new Intent(getApplicationContext(),FournisseurActivity.class) ;
                    startActivity(intent);
                }


            }
        });


    }
}