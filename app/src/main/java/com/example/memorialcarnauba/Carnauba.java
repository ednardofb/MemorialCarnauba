package com.example.memorialcarnauba;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Carnauba extends AppCompatActivity {

    private ViewPager mSlideViewPagerCarnauba;
    private LinearLayout mDotLayoutCarnauba;

    private TextView[] mDotsCarnauba;

    private SliderAdapterCarnauba sliderAdapterCarnauba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carnauba);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mSlideViewPagerCarnauba = (ViewPager) findViewById(R.id.slideViewPagerProdutos);
        mDotLayoutCarnauba      = (LinearLayout) findViewById(R.id.dotsLayoutProdutos);

        sliderAdapterCarnauba = new SliderAdapterCarnauba(this);

        mSlideViewPagerCarnauba.setAdapter(sliderAdapterCarnauba);

        addDotsIndicator(0);
        mSlideViewPagerCarnauba.addOnPageChangeListener(viewListenerCarnauba);
    }


    public void addDotsIndicator(int position){

        mDotsCarnauba = new TextView[11];
        mDotLayoutCarnauba.removeAllViews();

        for(int i = 0; i < mDotsCarnauba.length; i++){

            mDotsCarnauba[i] = new TextView(this);
            mDotsCarnauba[i].setText(Html.fromHtml("&#8226;"));
            mDotsCarnauba[i].setTextSize(35);
            mDotsCarnauba[i].setTextColor(getResources().getColor(R.color.colorTransparentWhite));

            mDotLayoutCarnauba.addView(mDotsCarnauba[i]);

        }

        if(mDotsCarnauba.length > 0){
            mDotsCarnauba[position].setTextColor(getResources().getColor(R.color.colorPrimary));
        }

    }

    ViewPager.OnPageChangeListener viewListenerCarnauba = new ViewPager.OnPageChangeListener(){
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
