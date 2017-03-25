package com.example.abhishek.busservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton tripPlannerButton;
    ImageButton allRoutesButton;
    ImageButton airportBusButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tripPlannerButton = (ImageButton)findViewById(R.id.tripPlanner);
        tripPlannerButton.setOnClickListener(this);

        allRoutesButton = (ImageButton)findViewById(R.id.allRoutes);
        allRoutesButton.setOnClickListener(this);

        airportBusButton = (ImageButton)findViewById(R.id.airportBus);
        airportBusButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.tripPlanner:
                Intent tripPlannerIntent = new Intent(this, TripPlanner.class);
                startActivity(tripPlannerIntent);
                break;

            case R.id.allRoutes:
                Intent allRoutesIntent = new Intent(this, AllRoutes.class);
                startActivity(allRoutesIntent);
                break;

            case R.id.airportBus:
                Intent airportBusIntent = new Intent(this, AirportBus.class);
                startActivity(airportBusIntent);
                break;
        }

    }
}
