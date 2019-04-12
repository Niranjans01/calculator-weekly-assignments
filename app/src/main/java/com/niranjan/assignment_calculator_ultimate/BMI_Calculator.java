package com.niranjan.assignment_calculator_ultimate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BMI_Calculator extends AppCompatActivity implements View.OnClickListener {

    EditText weightText,heightText,resultValue;
    Button compute;
    Double computed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi__calculator);
        setTitle("BMI Calculator");

        weightText = findViewById(R.id.weight);
        heightText = findViewById(R.id.height);
        resultValue = findViewById(R.id.resultValue);
        compute = findViewById(R.id.compute);
        compute.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
         Double a = Double.parseDouble( weightText.getText().toString());
        Double b = Double.parseDouble( heightText.getText().toString());
        computed = a/(b*b);
        resultValue.setText(computed.toString());
        switch (v.getId()){
            case R.id.compute:
                if(computed<18.5){
                    Toast.makeText(this, "Category : Underweight ", Toast.LENGTH_SHORT).show();
                }
                else if(computed >= 18.5 && computed<=24.9){
                    Toast.makeText(this, "Category : Normal Weight ", Toast.LENGTH_SHORT).show();
                }
                else if(computed >= 25 && computed <=29.9){
                    Toast.makeText(this, "Category : OverWeight ", Toast.LENGTH_SHORT).show();
                }
                else if(computed>=30){
                    Toast.makeText(this, "Category : Obesity ", Toast.LENGTH_SHORT).show();
                }

                break;
        }
    }
}

