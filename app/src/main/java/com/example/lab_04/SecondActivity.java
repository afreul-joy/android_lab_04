package com.example.lab_04;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView tv2 = (TextView) findViewById(R.id.tv2);

        Intent in = getIntent();  // get data from MainActivity
        String p = in.getStringExtra("JOY");  // put key

        tv2.setText("Name is :"+p);   // showing result

        Toast.makeText(getApplicationContext(),"Submitted Successfully",Toast.LENGTH_LONG).show();

    }
}