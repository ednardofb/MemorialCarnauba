package com.example.memorialcarnauba;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //CRIAR SPLASHSCREEN
        //Runnable é a interface que excuta o código depois de 5 segundos
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Após 5 segundos vai abrir a mainActivity
                startActivity(new Intent(getBaseContext(), MainActivity.class));
                //Para evitar que quando apertar em voltar o usuário volte para a Splash:
                finish();
            }
        }, 5000);
    }
}
