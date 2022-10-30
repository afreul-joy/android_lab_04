package com.example.lab_04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText et1 = (EditText) findViewById(R.id.et1);
        Button btn1 = (Button) findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s = et1.getText().toString(); // user typing store

                Intent intent = new Intent(MainActivity.this,SecondActivity.class); // where to where go
                intent.putExtra("JOY",s); // (Key= JOY), extra info (S), when received must need key

                startActivity(intent); // start activity

            }
        });

    }
}