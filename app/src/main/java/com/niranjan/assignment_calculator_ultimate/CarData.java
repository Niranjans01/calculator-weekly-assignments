package com.niranjan.assignment_calculator_ultimate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class CarData extends AppCompatActivity implements View.OnClickListener {

    EditText make, year, color, purchase, engine;
    Button createcar, creatediesel;
    TextView detailsShow;
    String[] carInfos ;
    Car car = new Car();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_data);
        make = findViewById(R.id.make);
        year = findViewById(R.id.year);
        color = findViewById(R.id.color);
        purchase = findViewById(R.id.purchasePrice);
        engine = findViewById(R.id.engineSize);
        detailsShow = findViewById(R.id.detailsShow);
        createcar = findViewById(R.id.addCar);
        creatediesel = findViewById(R.id.addDeisel);

        createcar.setOnClickListener(this);
        creatediesel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        car.setMake(make.getText().toString());
        car.setYear(year.getText().toString());
        car.setColor(color.getText().toString());
        car.setPurchase(purchase.getText().toString());
        car.setEngine(engine.getText().toString());

        switch (v.getId()){
            case R.id.addCar:
               String data = "\r\n" +
                       "\r\n" + detailsShow.getText() +
                       "\r\n" +" The Vechile is Manufactured by "+ car.getMake() +
                       "\r\n" + " Made Year: "+ car.getYear() +
                       "\r\n" + "Car color: " + car.getColor() +
                       "\r\n" +  "Current value: "+ car.getPurchase() +
                       "\r\n" + "Engine per liter: " + car.getEngine() +
                       "\r\n";
               detailsShow.setText(data);
                break;

        }

    }
}
