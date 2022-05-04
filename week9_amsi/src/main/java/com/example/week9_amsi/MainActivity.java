package com.example.week9_amsi;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{

    private Button btnDial, btnWeb, btnGoogle, btnSearch, btnSms, btnPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("암시적 인텐트 예제");

        init();
        initLr();
    }

    public void init(){
        btnDial = findViewById(R.id.btnDial);
        btnWeb = findViewById(R.id.btnWeb);
        btnGoogle = findViewById(R.id.btnGoogle);
        btnSearch = findViewById(R.id.btnSearch);
        btnSms = findViewById(R.id.btnSms);
        btnPhoto = findViewById(R.id.btnPhoto);
    }

    public void initLr(){
        btnDial.setOnClickListener(v ->{
            Uri uri = Uri.parse("tel:01012345678");
            Intent intent = new Intent(Intent.ACTION_DIAL, uri);
            startActivity(intent);
        });
        btnWeb.setOnClickListener(v ->{
            Uri uri = Uri.parse("https://www.hanbit.co.kr");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        });
        btnGoogle.setOnClickListener(v ->{
            Uri uri = Uri.parse("https://maps.google.co.kr/maps?q="
                    + 37.559133 + "," + 126.927824);
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        });
        btnSearch.setOnClickListener(v ->{
            Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
            intent.putExtra(SearchManager.QUERY, "안드로이드");
            startActivity(intent);
        });
        btnSms.setOnClickListener(v ->{
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.putExtra("sms_body", "안녕하세요?");
            intent.setData(Uri.parse("smsto:" + Uri.encode("010-1234-5678")));
            startActivity(intent);
        });
        btnPhoto.setOnClickListener(v ->{
            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivity(intent);
        });
    }
}