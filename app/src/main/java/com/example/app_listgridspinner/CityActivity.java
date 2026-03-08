package com.example.app_listgridspinner;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CityActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    CityAdapter adapter;
    List<City> cityList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);

        recyclerView = findViewById(R.id.rv_cities);

        // 1. Remplir la liste
        cityList = new ArrayList<>();
        cityList.add(new City("Tanger", R.drawable.tanger));
        cityList.add(new City("Casablanca", R.drawable.casa));
        cityList.add(new City("Marrakech", R.drawable.marrakech));

        adapter = new CityAdapter(cityList, this);
        recyclerView.setAdapter(adapter);


        // Pour le mode LISTE SIMPLE
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
