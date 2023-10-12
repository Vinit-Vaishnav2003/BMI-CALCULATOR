package com.example.bmicalculator;
import java.text.DecimalFormat;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class result extends AppCompatActivity {

    TextView textView;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView t1 = findViewById(R.id.t1);
        TextView t2 = findViewById(R.id.textView4);
        ImageView img = findViewById(R.id.imageView);

        String data = getIntent().getExtras().getString("name");

        double bmi = Math.round(Double.parseDouble(data));
        t1.setText(bmi+"");
        if(bmi<=25&&bmi>=18.5){
            t2.setText("You are Fit");
        }
        else if(bmi<18.5) t2.setText("you are Under Weight");
        else if(bmi>25.5) t2.setText("you are Over Weight");

        img.setRotation(10);

        if(bmi<18.5){
            img.setRotation(-55);
        }
        else if(bmi>=18.5&&bmi<=24.9){
            img.setRotation(-25);
        }
        else if(bmi<=29.9){
            img.setRotation(25);
        }else{
            img.setRotation(55);
        }
    }
}