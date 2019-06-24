package com.example.memorialcarnauba;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Acaap extends AppCompatActivity {

    private ViewPager mSlideViewPageracaap;
    private LinearLayout mDotLayoutacaap;

    private TextView[] mDotsAcaap;

    private SliderAdapterACAAP sliderAdapteracaap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acaap);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mSlideViewPageracaap = (ViewPager) findViewById(R.id.slideViewPagerACAAP);
        mDotLayoutacaap      = (LinearLayout) findViewById(R.id.dotsLayoutACAAP);

        sliderAdapteracaap = new SliderAdapterACAAP(this);

        mSlideViewPageracaap.setAdapter(sliderAdapteracaap);

        addDotsIndicator(0);
        mSlideViewPageracaap.addOnPageChangeListener(viewListenerAcaap);

    }

    public void addDotsIndicator(int position){
        mDotsAcaap = new TextView[4];
        mDotLayoutacaap.removeAllViews();
        for(int i = 0; i < mDotsAcaap.length; i++){

            mDotsAcaap[i] = new TextView(this);
            mDotsAcaap[i].setText(Html.fromHtml("&#8226;"));
            mDotsAcaap[i].setTextSize(35);
            mDotsAcaap[i].setTextColor(getResources().getColor(R.color.colorTransparentWhite));

            mDotLayoutacaap.addView(mDotsAcaap[i]);

        }
        if(mDotsAcaap.length > 0){
            mDotsAcaap[position].setTextColor(getResources().getColor(R.color.colorPrimary));
        }

    }

    ViewPager.OnPageChangeListener viewListenerAcaap = new ViewPager.OnPageChangeListener(){
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
    //Aparecer logo na actionBar
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
