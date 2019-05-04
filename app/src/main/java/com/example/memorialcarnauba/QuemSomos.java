package com.example.memorialcarnauba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class QuemSomos extends AppCompatActivity {
    private ImageView voltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quem_somos);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
