package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Integer.parseInt;

public class SecondActivity extends AppCompatActivity {

    Button add, subtract, multiply,divide;
    TextView result;
    EditText input1 , input2;
    int answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        add = findViewById(R.id.add);
        subtract = findViewById(R.id.subtract);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        result = findViewById(R.id.result);

        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);


        Intent intent = getIntent();
        final int num1 =  parseInt( intent.getStringExtra("num1"));
        final int num2 = parseInt( intent.getStringExtra("num2"));

        input1.setText(String.valueOf(num1));
        input2.setText(String.valueOf(num2));

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer = num1 + num2;
                result.setText(num1 +" + " + num2 +" = " + answer);
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer = num1 - num2;
                result.setText(num1 +" - " + num2 +" = " + answer);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer = num1 * num2;
                result.setText(num1 +" * " + num2 +" = " + answer);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer = num1 / num2;
                result.setText(num1 +" / " + num2 +" = " + answer);
            }
        });


    }
}