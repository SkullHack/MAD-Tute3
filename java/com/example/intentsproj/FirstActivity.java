package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    Button btnok;
    EditText num1, num2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        btnok = findViewById(R.id.btnok);
        num1 = findViewById(R.id.num1_input);
        num2 = findViewById(R.id.num2_input);

        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String number1 = num1.getText().toString();
                String number2 = num2.getText().toString();

                Context context = getApplicationContext();
                CharSequence message = "Sending message..";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, message, duration);
                toast.setGravity(Gravity.TOP| Gravity.LEFT, 0, 0);
                toast.show();

                Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
                intent.putExtra("num1", number1);
                intent.putExtra("num2", number2);
                startActivity(intent);


            }
        });
    }
}