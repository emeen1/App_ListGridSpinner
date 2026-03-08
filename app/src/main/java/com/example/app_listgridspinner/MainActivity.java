package com.example.app_listgridspinner;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnList, btnGrid, btnSpinner, btnCity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnList = findViewById(R.id.btnList);
        btnGrid = findViewById(R.id.btnGrid);
        btnSpinner = findViewById(R.id.btnSpinner);
        btnCity = findViewById(R.id.btnCity);

        btnList.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, ListActivity.class));
        });

        btnGrid.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, GridActivity.class));
        });

        btnSpinner.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, SpinnerActivity.class));
        });

        // LE RECYCLERVIEW (Actvt 5-2)
        btnCity.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, CityActivity.class));
        });
    }
}