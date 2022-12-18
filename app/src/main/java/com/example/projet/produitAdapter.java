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

public class produitAdapter extends ArrayAdapter<produit> {

    public produitAdapter(@NonNull Context context, int resource, @NonNull List<produit> objects) {
        super(context, resource, objects);
    }
}
