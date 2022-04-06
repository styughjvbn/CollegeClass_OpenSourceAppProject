package com.example.project5_3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);
        LinearLayout baseLayout=new LinearLayout((this));
        baseLayout.setOrientation((LinearLayout.VERTICAL));
        setContentView(baseLayout,params);

        TextView text1=new TextView((this));
        text1.setText("2018038031 서종원");
        baseLayout.addView(text1);
        EditText edittext=new EditText(this);
        baseLayout.addView(edittext);
        Button btn = new Button((this));
        btn.setText("버튼입니다");
        btn.setBackgroundColor(Color.YELLOW);
        baseLayout.addView(btn);
        TextView text2=new TextView((this));
        baseLayout.addView(text2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text2.setText(edittext.getText());
            }
        });
    }
}