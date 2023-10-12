package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button ;
    EditText editText;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = findViewById(R.id.button);
        EditText editText1 = findViewById(R.id.editTextPhone);
        EditText editText2 = findViewById(R.id.editTextPhone2);




        TextView textView = findViewById(R.id.textView2);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String st  = editText1.getText().toString();
                String st2  = editText2.getText().toString();
                double s1 = Integer.parseInt(st);
                double s2 = Integer.parseInt(st2);
                double bmi = s2/Math.pow(s1/100,2);
                Intent myIntent1 = new Intent(view.getContext(), result.class);
                myIntent1.putExtra("name",Double.toString(bmi));
                startActivityForResult(myIntent1, 0);



            }
        });


    }
}