package com.example.project4_1_modify;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1, et2;
    Button btnAdd, btnMinus, btnDup, btnDivide, btnremain;
    TextView tvResult;
    String str1, str2;
    float result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("초간단 계산기(수정)");
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        btnAdd = findViewById(R.id.btnAdd);
        btnMinus = findViewById(R.id.btnMinus);
        btnDup = findViewById(R.id.btnDup);
        btnDivide = findViewById(R.id.btnDivide);
        btnremain = findViewById(R.id.btnremain);
        tvResult = findViewById(R.id.tvResult);

        btnAdd.setOnClickListener(view -> {
            str1 = et1.getText().toString();
            str2 = et2.getText().toString();
            if(str1.equals("")||str2.equals("")) {
                Toast.makeText(getApplicationContext(), "값을 입력해주세요", Toast.LENGTH_SHORT).show();
            }
            else {
                result = Float.valueOf(str1) + Float.valueOf(str2);
                tvResult.setText("계산 결과 : " + Float.toString(result));
            }
        });
        btnMinus.setOnClickListener(view -> {
            str1 = et1.getText().toString();
            str2 = et2.getText().toString();
            if(str1.equals("")||str2.equals("")) {
                Toast.makeText(getApplicationContext(), "값을 입력해주세요", Toast.LENGTH_SHORT).show();
            }
            else {
                result = Float.valueOf(str1) - Float.valueOf(str2);
                tvResult.setText("계산 결과 : " + Float.toString(result));
            }
        });
        btnDup.setOnClickListener(view -> {
            str1 = et1.getText().toString();
            str2 = et2.getText().toString();
            if(str1.equals("")||str2.equals("")) {
                Toast.makeText(getApplicationContext(), "값을 입력해주세요", Toast.LENGTH_SHORT).show();
            }
            else {
                result = Float.valueOf(str1)* Float.valueOf(str2);
                tvResult.setText("계산 결과 : " + Float.toString(result));
            }
        });
        btnDivide.setOnClickListener(view -> {
            str1 = et1.getText().toString();
            str2 = et2.getText().toString();
            if(str1.equals("")||str2.equals("")) {
                Toast.makeText(getApplicationContext(), "값을 입력해주세요", Toast.LENGTH_SHORT).show();
            }
            else if(str2.equals("0")){
                Toast.makeText(getApplicationContext(), "0으로 나눌수없습니다", Toast.LENGTH_SHORT).show();
            }
            else {
                result = Float.valueOf(str1) / Float.valueOf(str2);
                tvResult.setText("계산 결과 : " + Float.toString(result));
            }
        });
        btnremain.setOnClickListener(view -> {
            str1 = et1.getText().toString();
            str2 = et2.getText().toString();
            if(str1.equals("")||str2.equals("")) {
                Toast.makeText(getApplicationContext(), "값을 입력해주세요", Toast.LENGTH_SHORT).show();
            }
            else {
                result = Float.valueOf(str1) % Float.valueOf(str2);
                tvResult.setText("계산 결과 : " + Float.toString(result));
            }
        });

    }
}