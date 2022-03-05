package com.example.civicapay;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import java.util.Calendar;

public class reservar extends AppCompatActivity implements View.OnClickListener {
    Button regresar;
    Button hora,fecha;
    EditText edfecha,edhora;
    private int dia,mes,ano,horas,minutos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservar);

        regresar = findViewById(R.id.btnregresar);
        hora = findViewById(R.id.btnhora);
        fecha = findViewById(R.id.btnfecha);
        edfecha = findViewById(R.id.etfechaR);
        edhora = findViewById(R.id.ethoraR);

        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        fecha.setOnClickListener(this);
        hora.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v==fecha){
            final Calendar c= Calendar.getInstance();
            dia = c.get(Calendar.DAY_OF_MONTH);
            mes = c.get(Calendar.MONTH);
            ano= c.get(Calendar.YEAR);

            DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                    edfecha.setText(dayOfMonth+"/"+(month+1)+"/"+year);
                }
            }
            ,dia,mes,ano);
            datePickerDialog.show();

        }



        if(v==hora){
            final Calendar c= Calendar.getInstance();
            horas = c.get(Calendar.HOUR);
            minutos = c.get(Calendar.MINUTE);

            TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                    edhora.setText(hourOfDay+":"+minute);
                }
            },horas,minutos,false);
            timePickerDialog.show();
        }

    }
}