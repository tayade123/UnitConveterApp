package com.example.unitconveterapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    EditText edit;
    Button btn;
    TextView text;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        edit=findViewById(R.id.edit);
        btn=findViewById(R.id.btn);
        text=findViewById(R.id.text);


        btn.setOnClickListener(v -> {

            String inputText = edit.getText().toString();


            double kg = Double.parseDouble(inputText);

            double gram = makeConversion(kg);

            text.setText(" "+gram);
        });
    }

    public double makeConversion( double kg){

        return kg * 1000;
    }
}