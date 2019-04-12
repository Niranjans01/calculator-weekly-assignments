package com.niranjan.assignment_calculator_ultimate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2,btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("ULTIMATE Calculators");

        btn1 = findViewById(R.id.bmi_calculator);
        btn2 = findViewById(R.id.digit_to_word);
        btn3 = findViewById(R.id.tax_calculator);
        btn4 = findViewById(R.id.car_infoadd);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bmi_calculator:
                Intent bmi = new Intent(this,BMI_Calculator.class);
                startActivity(bmi);
                break;
            case R.id.tax_calculator:
                Intent taxC = new Intent(this,TaxCalculator.class);
                startActivity(taxC);
                break;

            case  R.id.car_infoadd:
                Intent carDet = new Intent(this,CarData.class);
                startActivity(carDet);
                break;

            case R.id.digit_to_word:
                Intent dtw = new Intent(this,DigitToWord.class);
                startActivity(dtw);
                break;
        }
    }
}
