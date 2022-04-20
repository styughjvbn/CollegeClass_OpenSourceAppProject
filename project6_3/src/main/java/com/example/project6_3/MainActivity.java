package com.example.project6_3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();

        TabHost.TabSpec tabDog = tabHost.newTabSpec("강아지").setIndicator("강아지");
        tabDog.setContent(R.id.dog);
        tabHost.addTab(tabDog);

        TabHost.TabSpec tabCat = tabHost.newTabSpec("고양이").setIndicator("고양이");
        tabCat.setContent(R.id.cat);
        tabHost.addTab(tabCat);

        TabHost.TabSpec tabRabbit = tabHost.newTabSpec("토끼").setIndicator("토끼");
        tabRabbit.setContent(R.id.rabbit);
        tabHost.addTab(tabRabbit);

        TabHost.TabSpec tabHorse = tabHost.newTabSpec("말").setIndicator("말");
        tabHorse.setContent(R.id.horse);
        tabHost.addTab(tabHorse);

        tabHost.setCurrentTab(0);
    }
}