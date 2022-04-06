package com.example.week5_hw3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.UnsupportedEncodingException;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;
    Button sendbtn,exitbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editText);
        textView=findViewById(R.id.textView);

        sendbtn=findViewById(R.id.button);
        sendbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = editText.getText().toString();
                Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG).show();
            }
        });
        exitbtn=findViewById(R.id.button2);
        exitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                byte[] bytes = null;
                try {
                    bytes = charSequence.toString().getBytes("KSC5601");
                    int strCount = bytes.length;
                    textView.setText(strCount + " / 80바이트");
                } catch(UnsupportedEncodingException ex) {
                    ex.printStackTrace();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }
}