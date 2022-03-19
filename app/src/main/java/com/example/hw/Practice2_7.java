package com.example.hw;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Practice2_7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xml_practice2_7);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.icon1);

        Button button1 = findViewById(R.id.button2);
        Button button2 = findViewById(R.id.button3);
        EditText editText = findViewById(R.id.editTextTextPersonName);
        ImageView imageview =findViewById(R.id.imageView);
        RadioGroup radioGroup=findViewById(R.id.radioGroup);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),editText.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String str="";
                if(!editText.getText().toString().substring(0,7).equals("http://")){
                    str="http://"+editText.getText().toString();
                }
                else{
                    str=editText.getText().toString();
                }
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(str));
                startActivity(intent);
            }
        });
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.radioButton:
                        imageview.setImageResource(R.drawable.pic_prac2_7_1);
                        break;
                    case R.id.radioButton2:
                        imageview.setImageResource(R.drawable.pic_prac2_7_2);
                        break;
                }
            }
        });
        imageview.setImageResource(R.drawable.icon1);
    }
}