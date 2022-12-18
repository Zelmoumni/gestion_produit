package com.example.projet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class MonAdapter extends ArrayAdapter<Accueil> {
    ArrayList<Accueil> acc ;
    LayoutInflater inf ;
    public MonAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Accueil> a) {
        super(context, resource, a);
        this.acc=a ;
        this.inf=LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = inf.inflate(R.layout.accueil_projet,null);

        ImageView img = convertView.findViewById(R.id.img);
        TextView des = convertView.findViewById(R.id.text);
        img.setImageResource(acc.get(position).getImg());
        des.setText(acc.get(position).getDescription());

        return convertView ;
    }
}
