package com.example.civicapay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class infolugar extends AppCompatActivity {

    Button reservar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infolugar);

        reservar = findViewById(R.id.btnreservar);

        reservar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reserva = new Intent(v.getContext(),reservar.class);
                startActivity(reserva);
            }
        });

    }
}