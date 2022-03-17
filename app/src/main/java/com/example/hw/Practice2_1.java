package com.example.hw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Practice2_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xml_practice2_1);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.icon1);
    }
}