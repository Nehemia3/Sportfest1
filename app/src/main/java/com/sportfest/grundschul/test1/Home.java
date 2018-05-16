package com.sportfest.grundschul.test1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



        Button btnWeitsprung, btnStatistik;
        btnWeitsprung = findViewById(R.id.btnWeitsprung);
        btnStatistik = findViewById(R.id.btnStatistik);
        btnStatistik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(), Statistik.class);
                startActivity(a);
            }
        });
        btnWeitsprung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Weitsprung.class);
                startActivity(i);
            }
        });

    }
}
