package com.sportfest.grundschul.test1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Statistik extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistik);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
