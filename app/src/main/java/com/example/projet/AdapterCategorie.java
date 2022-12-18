package com.example.projet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class AdapterCategorie extends ArrayAdapter {

    ArrayList<Categorie> catt ;
    LayoutInflater inf ;
    public AdapterCategorie(@NonNull Context context, int resource, @NonNull ArrayList<Categorie> c) {
        super(context, resource, c);
        this.catt= c ;
        this.inf=LayoutInflater.from(context) ;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = inf.inflate(R.layout.categorie_projet,null) ;
        TextView t_id = convertView.findViewById(R.id.cat_id);
        TextView t_cat = convertView.findViewById(R.id.cat_name) ;

        t_id.setText(catt.get(position).getId());
        t_cat.setText(catt.get(position).getName());
        return convertView ;
    }
}
