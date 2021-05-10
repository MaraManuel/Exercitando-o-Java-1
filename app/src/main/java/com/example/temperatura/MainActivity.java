package com.example.temperatura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btnCalcular);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edt_Celsius = findViewById(R.id.edt_Celcius);
                TextView txt = findViewById(R.id.txt);


                double tempCelsius = Double.parseDouble(edt_Celsius.getText().toString());

                DecimalFormat arredondar = new DecimalFormat("#.##");

                double tempFahrenheit = Double.parseDouble(arredondar.format(tempCelsius * 1.8 + 32));

                txt.setText(String.valueOf(tempFahrenheit) + "Fahrenheit");
            }
        });










    }
}