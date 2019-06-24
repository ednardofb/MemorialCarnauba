package com.example.memorialcarnauba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView botaoQuemSomos;
    private ImageView botaoAcaap;
    private ImageView botaoCarnauba;
    private ImageView botaoContatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Quem Somos
        botaoQuemSomos = (ImageView) findViewById(R.id.imageViewQuemSomos);
        botaoQuemSomos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, QuemSomos.class));
            }
        });

        //ACAAP
        botaoAcaap = (ImageView) findViewById(R.id.imageViewAcaap);
        botaoAcaap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Acaap.class));
            }
        });

        //Carnaúba
        botaoCarnauba = (ImageView) findViewById(R.id.imageViewCarnauba);
        botaoCarnauba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Carnauba.class));
            }
        });


        //Contatos
        botaoContatos = (ImageView) findViewById(R.id.imageViewContatos);
        botaoContatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Contatos.class));
            }
        });

    }

    //Aparecer logo no lado direito da ActionBar
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
