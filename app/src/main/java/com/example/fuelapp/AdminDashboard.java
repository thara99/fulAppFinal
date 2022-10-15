package com.example.fuelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminDashboard extends AppCompatActivity {

    private Button times;
    private Button fuelTypes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_dashboard);

        times = (Button) findViewById(R.id.timesBtn);
        fuelTypes = (Button) findViewById(R.id.fuelTypeBtn);


        times.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTimesPage();
            }
        });

        fuelTypes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFuelTypesPage();
            }
        });
    }
    public void openTimesPage(){
        Intent intent = new Intent(this, Times.class);
        startActivity(intent);
    }

    public void openFuelTypesPage(){
        Intent intent = new Intent(this, FuelType.class);
        startActivity(intent);
    }
}