package com.example.week6_hw2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final int REQUEST_CODE = 101;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginButton = findViewById(R.id.btn1);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
//                startActivityForResult(intent,101);
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivityForResult(intent,REQUEST_CODE);
            } // 인텐트에 메뉴액티비티 넣어서 호출
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == REQUEST_CODE){
            if(resultCode == Activity.RESULT_OK){
                String name = data.getStringExtra("name");
                Toast toast = Toast.makeText(getBaseContext(), name,Toast.LENGTH_SHORT);
                toast.show();

            }
        }
    }
}