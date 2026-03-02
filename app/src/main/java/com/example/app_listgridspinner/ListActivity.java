package com.example.app_listgridspinner;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ListActivity extends AppCompatActivity {

    ListView listView;

    String pays[] = {
            "Maroc","France","Espagne","Italie","Allemagne",
            "USA","Canada","Brésil","Argentine","Japon",
            "Chine","Corée","Inde","Egypte","Tunisie",
            "Algérie","Portugal","Pays-Bas","Belgique","Turquie"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listView = findViewById(R.id.listView);

        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(this,
                        android.R.layout.simple_list_item_1,
                        pays);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(this,
                    pays[position],
                    Toast.LENGTH_SHORT).show();
        });
    }
}