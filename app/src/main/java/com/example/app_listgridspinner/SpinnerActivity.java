package com.example.app_listgridspinner;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

    public class SpinnerActivity extends AppCompatActivity {

        Spinner spinner;

        String pays[] = {
                "Maroc","France","Espagne","Italie","Allemagne",
                "USA","Canada","Brésil","Argentine","Japon",
                "Chine","Corée","Inde","Egypte","Tunisie",
                "Algérie","Portugal","Pays-Bas","Belgique","Turquie"
        };

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_spinner);

            spinner = findViewById(R.id.spinner);

            ArrayAdapter<String> adapter =
                    new ArrayAdapter<>(this,
                            android.R.layout.simple_spinner_item,
                            pays);

            adapter.setDropDownViewResource(
                    android.R.layout.simple_spinner_dropdown_item);

            spinner.setAdapter(adapter);
        }
    }