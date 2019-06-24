package com.example.memorialcarnauba;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class QuemSomos extends AppCompatActivity {

    private ViewPager mSlideViewPager;
    private LinearLayout mDotLayout;
    private TextView[] mDots;
    private SliderAdapterQuemFaz sliderAdapter;

    private ViewPager mSlideViewPagerRelatos;
    private LinearLayout mDotLayoutRelatos;
    private TextView[] mDotsRelatos;
    private SliderAdapterRelatos sliderAdapaterrelados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quem_somos);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        //Config para ViewPager em "Quem Faz" na activity "Quem Somos"
        mSlideViewPager = (ViewPager) findViewById(R.id.slideViewPager);
        mDotLayout = (LinearLayout) findViewById(R.id.dotsLayout);
        sliderAdapter = new SliderAdapterQuemFaz(this);
        mSlideViewPager.setAdapter(sliderAdapter);
        addDotsIndicator(0);
        mSlideViewPager.addOnPageChangeListener(viewListener);

        //Config para ViewPager em "Relatos" na activity "Quem Somos"
        mSlideViewPagerRelatos = (ViewPager) findViewById(R.id.slideViewPagerRelatos);
        mDotLayoutRelatos = (LinearLayout) findViewById(R.id.dotsLayoutRelatos);
        sliderAdapaterrelados = new SliderAdapterRelatos(this);
        mSlideViewPagerRelatos.setAdapter(sliderAdapaterrelados);
        addDotsIndicatorRelatos(0);
        mSlideViewPagerRelatos.addOnPageChangeListener(viewListenerRelatos);

    }

    //Dots Indicadores para "Quem Faz" na activity "Quem Somos"
    public void addDotsIndicator(int position){

        mDots = new TextView[2];
        mDotLayout.removeAllViews();
        for(int i=0; i < mDots.length; i++){

            mDots[i] = new TextView(this);
            mDots[i].setText(Html.fromHtml("&#8226;"));
            mDots[i].setTextSize(35);
            mDots[i].setTextColor(getResources().getColor(R.color.colorTransparentWhite));

            mDotLayout.addView(mDots[i]);
        }

        if(mDots.length > 0){

            mDots[position].setTextColor(getResources().getColor(R.color.colorPrimary));

        }

    }

    //Dots Indicadores para "Relatos" na activity "Quem somos"
    public void addDotsIndicatorRelatos(int position){
        mDotsRelatos = new TextView[4];
        mDotLayoutRelatos.removeAllViews();
        for(int i=0; i < mDotsRelatos.length; i++){

            mDotsRelatos[i] = new TextView(this);
            mDotsRelatos[i].setText(Html.fromHtml("&#8226;"));
            mDotsRelatos[i].setTextSize(35);
            mDotsRelatos[i].setTextColor(getResources().getColor(R.color.colorTransparentWhite));

            this.mDotLayoutRelatos.addView(mDotsRelatos[i]);

        }

        if(mDotsRelatos.length > 0){

            mDotsRelatos[position].setTextColor(getResources().getColor(R.color.colorWhite));

        }
    }

    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener(){
        @Override
        public void onPageScrolled(int i, float v, int i1){

        }

        @Override
        public void onPageSelected(int i){

            addDotsIndicator(i);

        }

        @Override
        public void onPageScrollStateChanged(int i){

        }
    };

    ViewPager.OnPageChangeListener viewListenerRelatos = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int i) {

            addDotsIndicatorRelatos(i);

        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    };

    //Aparecer logo na actionBar
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
