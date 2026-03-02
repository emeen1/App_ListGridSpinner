package com.example.app_listgridspinner;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class GridActivity extends AppCompatActivity {

    GridView gridView;

    String pays[] = {
            "Maroc","France","Espagne","Italie","Allemagne",
            "USA","Canada","Brésil","Argentine","Japon",
            "Chine","Corée","Inde","Egypte","Tunisie",
            "Algérie","Portugal","Pays-Bas","Belgique","Turquie",
            "Suède","Norvège","Danemark","Suisse","Autriche",
            "Mexique","Chili","Colombie","Russie","Grèce",
            "Irlande","Pologne","Roumanie","Hongrie","Croatie",
            "Thaïlande","Vietnam","Indonésie","Malaisie","Qatar"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        gridView = findViewById(R.id.gridView);

        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(this,
                        android.R.layout.simple_list_item_1,
                        pays);

        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(this,
                    pays[position],
                    Toast.LENGTH_SHORT).show();
        });
    }
}