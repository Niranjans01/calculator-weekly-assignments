package com.niranjan.assignment_calculator_ultimate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DigitToWord extends AppCompatActivity implements View.OnClickListener {

    EditText inputVal, resultOut;
    Button converter;

    private static final String[] tensNames = { "", " ten", " twenty", " thirty", " forty",
            " fifty", " sixty", " seventy", " eighty", " ninety" };

    private static final String[] numNames = { "", " one", " two", " three", " four", " five",
            " six", " seven", " eight", " nine", " ten", " eleven", " twelve", " thirteen",
            " fourteen", " fifteen", " sixteen", " seventeen", " eighteen", " nineteen" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digit_to_word);
        setTitle("Digit-Word Conveter");

        inputVal = findViewById(R.id.digit);
        resultOut = findViewById(R.id.resultOut);
        converter = findViewById(R.id.converter);
        converter.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.converter:
                int a = Integer.parseInt(inputVal.getText().toString());
                //Toast.makeText(this, "" + convertLessThanOneThousand(a), Toast.LENGTH_SHORT).show();

                resultOut.setText(convertLessThanOneThousand(a));
                break;
        }
    }

    private static String convertLessThanOneThousand(int number)
    {
        String suffix;

        if (number % 100 < 20)
        {
            suffix = numNames[number % 100];
            number /= 100;
        } else
        {
            suffix = numNames[number % 10];
            number /= 10;

            suffix = tensNames[number % 10] + suffix;
            number /= 10;
        }
        if (number == 0)
            return suffix;

        return numNames[number] + " hundred" + suffix;
    }


}
