package com.example.jsinger5015.hangman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
     public void ba1 (View view){
        Intent i= new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
     }

}
