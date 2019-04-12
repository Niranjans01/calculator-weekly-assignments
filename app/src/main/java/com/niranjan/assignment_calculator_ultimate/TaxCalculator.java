package com.niranjan.assignment_calculator_ultimate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TaxCalculator extends AppCompatActivity implements View.OnClickListener {

    EditText monthlySalary;
    TextView taxAmount,taxResult;
    Button calculateTotal;
    Double total, taxis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tax_calculator);

        monthlySalary = findViewById(R.id.monthlySalary);
        taxAmount = findViewById(R.id.taxAmount);
        taxResult = findViewById(R.id.taxResult);
        calculateTotal = findViewById(R.id.calculateTotal);

        calculateTotal.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        total = Double.parseDouble(monthlySalary.getText().toString())*12;

        switch (v.getId()){
            case R.id.calculateTotal:
                if(total>=1 && total<200000){
                    taxis = (total/100);
                    taxResult.setText("Rs " + taxis.toString());
                }
                else if (total>=200000 && total<350000){
                    taxis= 2000 +((total -200000)* 0.15);
                    taxResult.setText("Rs " + taxis.toString());
                }
                else if(total>=350000){
                    taxis= 2000 + 22500 +((total - 350000)*0.25);
                    taxResult.setText("Rs " + taxis.toString());
                }
                break;

        }
    }
}
