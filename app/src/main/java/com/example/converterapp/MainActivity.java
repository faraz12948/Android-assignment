package com.example.converterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText input;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();


    }
    public void onclick(View v)
    {
          input=(EditText)findViewById(R.id.input);
          output=(TextView)findViewById(R.id.output);

         double multiplier= 39.37;
         double result=0.0;

         if(input.getText().toString().equals(""))
         {
                  output.setText(R.string.error_message);
                  output.setTextColor(Color.RED);
         }
         else {

             double enter = Double.parseDouble(input.getText().toString());
             result = enter * multiplier;
             output.setText(String.format("%.2f", result));

         }













    }
}
