package com.example.week4;


        import androidx.appcompat.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.MotionEvent;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et1, et2;
    Button btnAdd, btnMinus, btnDup, btnDivide;
    TextView tvResult;
    String str1, str2;
    Integer result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("초간단 계산기");
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        btnAdd = findViewById(R.id.btnAdd);
        btnMinus = findViewById(R.id.btnMinus);
        btnDup = findViewById(R.id.btnDup);
        btnDivide = findViewById(R.id.btnDivide);
        tvResult = findViewById(R.id.tvResult);

        btnAdd.setOnTouchListener((view, motionEvent) -> {
            str1 = et1.getText().toString();
            str2 = et2.getText().toString();
            result = Integer.parseInt(str1) + Integer.parseInt(str2);
            tvResult.setText("계산 결과 : " + result.toString());
            return false;
        });
        btnMinus.setOnTouchListener((view, motionEvent) -> {
            str1 = et1.getText().toString();
            str2 = et2.getText().toString();
            result = Integer.parseInt(str1) + Integer.parseInt(str2);
            tvResult.setText("계산 결과 : " + result.toString());
            return false;
        });
        btnDup.setOnTouchListener((view, motionEvent) -> {
            str1 = et1.getText().toString();
            str2 = et2.getText().toString();
            result = Integer.parseInt(str1) + Integer.parseInt(str2);
            tvResult.setText("계산 결과 : " + result.toString());
            return false;
        });
        btnDivide.setOnTouchListener((view, motionEvent) -> {
            str1 = et1.getText().toString();
            str2 = et2.getText().toString();
            result = Integer.parseInt(str1) + Integer.parseInt(str2);
            tvResult.setText("계산 결과 : " + result.toString());
            return false;
        });

    }
}