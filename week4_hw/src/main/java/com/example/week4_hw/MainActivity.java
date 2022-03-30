package com.example.week4_hw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    ImageView IV2,IV1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("안드로이드 사진 보기");

        IV1=(ImageView) findViewById(R.id.imageView);
        IV2=(ImageView) findViewById(R.id.imageView2);
        btn=(Button)findViewById(R.id.Button);

        IV1.setImageResource(R.drawable.iu);
        btn.setOnClickListener(new View.OnClickListener() {
            boolean is=true;
            @Override
            public void onClick(View view) {
                if(is){
                    IV2.setImageResource(R.drawable.iu);
                    is=false;
                    IV1.setImageResource(0);
                }
                else {
                    IV1.setImageResource(R.drawable.iu);
                    is=true;
                    IV2.setImageResource(0);
                }

            }
        });

    }
}